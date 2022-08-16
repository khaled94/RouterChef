package k9;

import java.util.Objects;
import n9.a;

/* loaded from: classes.dex */
public abstract class e0 extends q {

    /* renamed from: t */
    public long f5645t;

    /* renamed from: u */
    public boolean f5646u;

    /* renamed from: v */
    public a<a0<?>> f5647v;

    public final void o0() {
        long p02 = this.f5645t - p0(true);
        this.f5645t = p02;
        if (p02 <= 0 && this.f5646u) {
            shutdown();
        }
    }

    public final long p0(boolean z10) {
        return z10 ? 4294967296L : 1L;
    }

    public final void q0(a0<?> a0Var) {
        a<a0<?>> aVar = this.f5647v;
        if (aVar == null) {
            aVar = new a<>();
            this.f5647v = aVar;
        }
        Object[] objArr = aVar.f16677a;
        int i10 = aVar.f16679c;
        objArr[i10] = a0Var;
        int length = (objArr.length - 1) & (i10 + 1);
        aVar.f16679c = length;
        int i11 = aVar.f16678b;
        if (length == i11) {
            int length2 = objArr.length;
            Object[] objArr2 = new Object[length2 << 1];
            w8.a.j(objArr, objArr2, 0, i11, 0, 10);
            Object[] objArr3 = aVar.f16677a;
            int length3 = objArr3.length;
            int i12 = aVar.f16678b;
            w8.a.j(objArr3, objArr2, length3 - i12, 0, i12, 4);
            aVar.f16677a = objArr2;
            aVar.f16678b = 0;
            aVar.f16679c = length2;
        }
    }

    public final void r0(boolean z10) {
        this.f5645t = p0(z10) + this.f5645t;
        if (!z10) {
            this.f5646u = true;
        }
    }

    public final boolean s0() {
        return this.f5645t >= p0(true);
    }

    public void shutdown() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object] */
    public final boolean t0() {
        a<a0<?>> aVar = this.f5647v;
        if (aVar == null) {
            return false;
        }
        int i10 = aVar.f16678b;
        a0 a0Var = null;
        if (i10 != aVar.f16679c) {
            ?? r32 = aVar.f16677a;
            ?? r62 = r32[i10];
            r32[i10] = 0;
            aVar.f16678b = (i10 + 1) & (r32.length - 1);
            Objects.requireNonNull(r62, "null cannot be cast to non-null type T of kotlinx.coroutines.internal.ArrayQueue");
            a0Var = r62;
        }
        a0 a0Var2 = a0Var;
        if (a0Var2 == null) {
            return false;
        }
        a0Var2.run();
        return true;
    }
}
