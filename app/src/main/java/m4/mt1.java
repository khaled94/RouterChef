package m4;

import android.content.Context;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class mt1 {

    /* renamed from: g */
    public static final HashMap<String, Class<?>> f11299g = new HashMap<>();

    /* renamed from: a */
    public final Context f11300a;

    /* renamed from: b */
    public final h8 f11301b;

    /* renamed from: c */
    public final zr1 f11302c;

    /* renamed from: d */
    public final mz1 f11303d;

    /* renamed from: e */
    public dt1 f11304e;

    /* renamed from: f */
    public final Object f11305f = new Object();

    public mt1(Context context, h8 h8Var, zr1 zr1Var, mz1 mz1Var) {
        this.f11300a = context;
        this.f11301b = h8Var;
        this.f11302c = zr1Var;
        this.f11303d = mz1Var;
    }

    public final dt1 a() {
        dt1 dt1Var;
        synchronized (this.f11305f) {
            dt1Var = this.f11304e;
        }
        return dt1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064 A[Catch: Exception -> 0x00e0, TryCatch #1 {Exception -> 0x00e0, blocks: (B:5:0x000a, B:7:0x003c, B:10:0x004b, B:14:0x0053, B:15:0x0056, B:17:0x0058, B:18:0x005c, B:19:0x005e, B:22:0x0064, B:23:0x0069), top: B:58:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008d A[Catch: Exception -> 0x00e9, lt1 -> 0x00ef, TryCatch #9 {lt1 -> 0x00ef, Exception -> 0x00e9, blocks: (B:3:0x0005, B:24:0x007e, B:26:0x008d, B:28:0x0093, B:29:0x0095, B:37:0x00ab, B:41:0x00ba, B:42:0x00bb, B:43:0x00d5, B:44:0x00d6, B:45:0x00df, B:47:0x00e1, B:48:0x00e8), top: B:61:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d6 A[Catch: Exception -> 0x00e9, lt1 -> 0x00ef, TryCatch #9 {lt1 -> 0x00ef, Exception -> 0x00e9, blocks: (B:3:0x0005, B:24:0x007e, B:26:0x008d, B:28:0x0093, B:29:0x0095, B:37:0x00ab, B:41:0x00ba, B:42:0x00bb, B:43:0x00d5, B:44:0x00d6, B:45:0x00df, B:47:0x00e1, B:48:0x00e8), top: B:61:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(m4.et1 r14) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.mt1.b(m4.et1):boolean");
    }

    public final synchronized Class<?> c(et1 et1Var) {
        String E = et1Var.f8261a.E();
        HashMap<String, Class<?>> hashMap = f11299g;
        Class<?> cls = hashMap.get(E);
        if (cls != null) {
            return cls;
        }
        try {
            if (!this.f11303d.a(et1Var.f8262b)) {
                throw new lt1(2026, "VM did not pass signature verification");
            }
            try {
                File file = et1Var.f8263c;
                if (!file.exists()) {
                    file.mkdirs();
                }
                Class<?> loadClass = new DexClassLoader(et1Var.f8262b.getAbsolutePath(), file.getAbsolutePath(), null, this.f11300a.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                hashMap.put(E, loadClass);
                return loadClass;
            } catch (ClassNotFoundException | IllegalArgumentException | SecurityException e10) {
                throw new lt1(2008, e10);
            }
        } catch (GeneralSecurityException e11) {
            throw new lt1(2026, e11);
        }
    }
}
