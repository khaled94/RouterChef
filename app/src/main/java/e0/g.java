package e0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import d0.e;
import j0.n;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class g extends l {

    /* renamed from: b */
    public static Class<?> f4321b = null;

    /* renamed from: c */
    public static Constructor<?> f4322c = null;

    /* renamed from: d */
    public static Method f4323d = null;

    /* renamed from: e */
    public static Method f4324e = null;

    /* renamed from: f */
    public static boolean f4325f = false;

    public static boolean g(Object obj, String str, int i10, boolean z10) {
        h();
        try {
            return ((Boolean) f4323d.invoke(obj, str, Integer.valueOf(i10), Boolean.valueOf(z10))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static void h() {
        Method method;
        Class<?> cls;
        Method method2;
        if (f4325f) {
            return;
        }
        f4325f = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            method = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi21Impl", e10.getClass().getName(), e10);
            method2 = null;
            cls = null;
            method = null;
        }
        f4322c = constructor;
        f4321b = cls;
        f4323d = method;
        f4324e = method2;
    }

    @Override // e0.l
    public Typeface a(Context context, e.c cVar, Resources resources, int i10) {
        e.d[] dVarArr;
        h();
        try {
            Object newInstance = f4322c.newInstance(new Object[0]);
            for (e.d dVar : cVar.f3691a) {
                File d5 = m.d(context);
                if (d5 == null) {
                    return null;
                }
                try {
                    if (!m.b(d5, resources, dVar.f3697f)) {
                        return null;
                    }
                    if (!g(newInstance, d5.getPath(), dVar.f3693b, dVar.f3694c)) {
                        return null;
                    }
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    d5.delete();
                }
            }
            h();
            try {
                Object newInstance2 = Array.newInstance(f4321b, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f4324e.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e10) {
                throw new RuntimeException(e10);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override // e0.l
    public Typeface b(Context context, n[] nVarArr, int i10) {
        File file;
        FileInputStream fileInputStream;
        String readlink;
        if (nVarArr.length < 1) {
            return null;
        }
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(f(nVarArr, i10).f5416a, "r", null);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            try {
                readlink = Os.readlink("/proc/self/fd/" + openFileDescriptor.getFd());
            } catch (ErrnoException unused) {
            }
            try {
                if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                    file = new File(readlink);
                    if (file != null && file.canRead()) {
                        Typeface createFromFile = Typeface.createFromFile(file);
                        openFileDescriptor.close();
                        return createFromFile;
                    }
                    fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                    Typeface c10 = c(context, fileInputStream);
                    fileInputStream.close();
                    openFileDescriptor.close();
                    return c10;
                }
                Typeface c102 = c(context, fileInputStream);
                fileInputStream.close();
                openFileDescriptor.close();
                return c102;
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
            file = null;
            if (file != null) {
                Typeface createFromFile2 = Typeface.createFromFile(file);
                openFileDescriptor.close();
                return createFromFile2;
            }
            fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
        } catch (IOException unused2) {
            return null;
        }
    }
}
