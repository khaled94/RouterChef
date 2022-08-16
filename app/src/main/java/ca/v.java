package ca;

import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class v {
    @Nullable

    /* renamed from: a */
    public static u f2885a;

    /* renamed from: b */
    public static long f2886b;

    public static void a(u uVar) {
        if (uVar.f2883f == null && uVar.f2884g == null) {
            if (uVar.f2881d) {
                return;
            }
            synchronized (v.class) {
                long j3 = f2886b + 8192;
                if (j3 > 65536) {
                    return;
                }
                f2886b = j3;
                uVar.f2883f = f2885a;
                uVar.f2880c = 0;
                uVar.f2879b = 0;
                f2885a = uVar;
                return;
            }
        }
        throw new IllegalArgumentException();
    }

    public static u b() {
        synchronized (v.class) {
            u uVar = f2885a;
            if (uVar != null) {
                f2885a = uVar.f2883f;
                uVar.f2883f = null;
                f2886b -= 8192;
                return uVar;
            }
            return new u();
        }
    }
}
