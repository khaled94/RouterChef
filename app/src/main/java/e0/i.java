package e0;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.activity.result.a;
import d0.e;
import j0.n;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class i extends g {

    /* renamed from: g */
    public final Class<?> f4330g;

    /* renamed from: h */
    public final Constructor<?> f4331h;

    /* renamed from: i */
    public final Method f4332i;

    /* renamed from: j */
    public final Method f4333j;

    /* renamed from: k */
    public final Method f4334k;

    /* renamed from: l */
    public final Method f4335l;

    /* renamed from: m */
    public final Method f4336m;

    public i() {
        Method method;
        Method method2;
        Method method3;
        Constructor<?> constructor;
        Method method4;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(new Class[0]);
            method3 = o(cls2);
            method2 = p(cls2);
            method = cls2.getMethod("freeze", new Class[0]);
            method4 = cls2.getMethod("abortCreation", new Class[0]);
            method5 = q(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            StringBuilder c10 = a.c("Unable to collect necessary methods for class ");
            c10.append(e10.getClass().getName());
            Log.e("TypefaceCompatApi26Impl", c10.toString(), e10);
            method5 = null;
            method4 = null;
            constructor = null;
            method3 = null;
            method2 = null;
            method = null;
        }
        this.f4330g = cls;
        this.f4331h = constructor;
        this.f4332i = method3;
        this.f4333j = method2;
        this.f4334k = method;
        this.f4335l = method4;
        this.f4336m = method5;
    }

    private Object n() {
        try {
            return this.f4331h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // e0.g, e0.l
    public final Typeface a(Context context, e.c cVar, Resources resources, int i10) {
        e.d[] dVarArr;
        if (!m()) {
            return super.a(context, cVar, resources, i10);
        }
        Object n10 = n();
        if (n10 == null) {
            return null;
        }
        for (e.d dVar : cVar.f3691a) {
            if (!j(context, n10, dVar.f3692a, dVar.f3696e, dVar.f3693b, dVar.f3694c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(dVar.f3695d))) {
                i(n10);
                return null;
            }
        }
        if (l(n10)) {
            return k(n10);
        }
        return null;
    }

    @Override // e0.g, e0.l
    public final Typeface b(Context context, n[] nVarArr, int i10) {
        Typeface k10;
        boolean z10;
        if (nVarArr.length < 1) {
            return null;
        }
        if (!m()) {
            n f10 = f(nVarArr, i10);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(f10.f5416a, "r", null);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(f10.f5418c).setItalic(f10.f5419d).build();
                openFileDescriptor.close();
                return build;
            } catch (IOException unused) {
                return null;
            }
        }
        HashMap hashMap = new HashMap();
        for (n nVar : nVarArr) {
            if (nVar.f5420e == 0) {
                Uri uri = nVar.f5416a;
                if (!hashMap.containsKey(uri)) {
                    hashMap.put(uri, m.e(context, uri));
                }
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
        Object n10 = n();
        if (n10 == null) {
            return null;
        }
        int length = nVarArr.length;
        int i11 = 0;
        boolean z11 = false;
        while (i11 < length) {
            n nVar2 = nVarArr[i11];
            ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(nVar2.f5416a);
            if (byteBuffer != null) {
                try {
                    z10 = ((Boolean) this.f4333j.invoke(n10, byteBuffer, Integer.valueOf(nVar2.f5417b), null, Integer.valueOf(nVar2.f5418c), Integer.valueOf(nVar2.f5419d ? 1 : 0))).booleanValue();
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                    z10 = false;
                }
                if (!z10) {
                    i(n10);
                    return null;
                }
                z11 = true;
            }
            i11++;
            z11 = z11;
        }
        if (!z11) {
            i(n10);
            return null;
        } else if (l(n10) && (k10 = k(n10)) != null) {
            return Typeface.create(k10, i10);
        } else {
            return null;
        }
    }

    @Override // e0.l
    public final Typeface d(Context context, Resources resources, int i10, String str, int i11) {
        if (!m()) {
            return super.d(context, resources, i10, str, i11);
        }
        Object n10 = n();
        if (n10 == null) {
            return null;
        }
        if (!j(context, n10, str, 0, -1, -1, null)) {
            i(n10);
            return null;
        } else if (l(n10)) {
            return k(n10);
        } else {
            return null;
        }
    }

    public final void i(Object obj) {
        try {
            this.f4335l.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean j(Context context, Object obj, String str, int i10, int i11, int i12, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f4332i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface k(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f4330g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f4336m.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean l(Object obj) {
        try {
            return ((Boolean) this.f4334k.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean m() {
        if (this.f4332i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f4332i != null;
    }

    public final Method o(Class<?> cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public final Method p(Class<?> cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    public Method q(Class<?> cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
