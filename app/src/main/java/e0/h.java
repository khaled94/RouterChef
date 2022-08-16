package e0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
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
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;
import r.g;

/* loaded from: classes.dex */
public final class h extends l {

    /* renamed from: b */
    public static final Class<?> f4326b;

    /* renamed from: c */
    public static final Constructor<?> f4327c;

    /* renamed from: d */
    public static final Method f4328d;

    /* renamed from: e */
    public static final Method f4329e;

    static {
        Method method;
        Method method2;
        Class<?> cls;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            Class<?> cls2 = Integer.TYPE;
            method = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi24Impl", e10.getClass().getName(), e10);
            cls = null;
            method2 = null;
            method = null;
        }
        f4327c = constructor;
        f4326b = cls;
        f4328d = method;
        f4329e = method2;
    }

    public static boolean g(Object obj, ByteBuffer byteBuffer, int i10, int i11, boolean z10) {
        try {
            return ((Boolean) f4328d.invoke(obj, byteBuffer, Integer.valueOf(i10), null, Integer.valueOf(i11), Boolean.valueOf(z10))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface h(Object obj) {
        try {
            Object newInstance = Array.newInstance(f4326b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f4329e.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // e0.l
    public final Typeface a(Context context, e.c cVar, Resources resources, int i10) {
        Object obj;
        e.d[] dVarArr;
        MappedByteBuffer mappedByteBuffer;
        FileInputStream fileInputStream;
        try {
            obj = f4327c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        for (e.d dVar : cVar.f3691a) {
            int i11 = dVar.f3697f;
            File d5 = m.d(context);
            if (d5 != null) {
                try {
                    if (m.b(d5, resources, i11)) {
                        try {
                            fileInputStream = new FileInputStream(d5);
                        } catch (IOException unused2) {
                            mappedByteBuffer = null;
                        }
                        try {
                            FileChannel channel = fileInputStream.getChannel();
                            mappedByteBuffer = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                            fileInputStream.close();
                            if (mappedByteBuffer != null || !g(obj, mappedByteBuffer, dVar.f3696e, dVar.f3693b, dVar.f3694c)) {
                                return null;
                            }
                        } finally {
                            break;
                        }
                    }
                } finally {
                    d5.delete();
                }
            }
            mappedByteBuffer = null;
            if (mappedByteBuffer != null) {
                return null;
            }
        }
        return h(obj);
    }

    @Override // e0.l
    public final Typeface b(Context context, n[] nVarArr, int i10) {
        Object obj;
        try {
            obj = f4327c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        g gVar = new g();
        for (n nVar : nVarArr) {
            Uri uri = nVar.f5416a;
            ByteBuffer byteBuffer = (ByteBuffer) gVar.getOrDefault(uri, null);
            if (byteBuffer == null) {
                byteBuffer = m.e(context, uri);
                gVar.put(uri, byteBuffer);
            }
            if (byteBuffer == null || !g(obj, byteBuffer, nVar.f5417b, nVar.f5418c, nVar.f5419d)) {
                return null;
            }
        }
        Typeface h10 = h(obj);
        if (h10 != null) {
            return Typeface.create(h10, i10);
        }
        return null;
    }
}
