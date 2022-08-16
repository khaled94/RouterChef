package m4;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public abstract class v9 implements Callable {

    /* renamed from: a */
    public final n8 f14616a;

    /* renamed from: b */
    public final String f14617b;

    /* renamed from: c */
    public final String f14618c;

    /* renamed from: d */
    public final v5 f14619d;

    /* renamed from: e */
    public Method f14620e;

    /* renamed from: f */
    public final int f14621f;

    /* renamed from: g */
    public final int f14622g;

    public v9(n8 n8Var, String str, String str2, v5 v5Var, int i10, int i11) {
        this.f14616a = n8Var;
        this.f14617b = str;
        this.f14618c = str2;
        this.f14619d = v5Var;
        this.f14621f = i10;
        this.f14622g = i11;
    }

    public abstract void a();

    public void b() {
        int i10;
        try {
            long nanoTime = System.nanoTime();
            Method c10 = this.f14616a.c(this.f14617b, this.f14618c);
            this.f14620e = c10;
            if (c10 == null) {
                return;
            }
            a();
            r7 r7Var = this.f14616a.f11561l;
            if (r7Var == null || (i10 = this.f14621f) == Integer.MIN_VALUE) {
                return;
            }
            r7Var.a(this.f14622g, i10, (System.nanoTime() - nanoTime) / 1000, null, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        b();
        return null;
    }
}
