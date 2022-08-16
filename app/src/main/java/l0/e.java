package l0;

import java.util.Arrays;
import m4.rx;
import m4.v91;
import m4.z40;
import m4.ze2;

/* loaded from: classes.dex */
public class e implements v91 {

    /* renamed from: s */
    public int f5711s;

    /* renamed from: t */
    public Object f5712t;

    public e(int i10, int i11) {
        if (i11 == 1) {
            this.f5712t = new long[32];
        } else if (i10 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        } else {
            this.f5712t = new Object[i10];
        }
    }

    public /* synthetic */ e(ze2 ze2Var, int i10) {
        this.f5712t = ze2Var;
        this.f5711s = i10;
    }

    public Object a() {
        int i10 = this.f5711s;
        if (i10 > 0) {
            int i11 = i10 - 1;
            Object obj = this.f5712t;
            Object obj2 = ((Object[]) obj)[i11];
            ((Object[]) obj)[i11] = null;
            this.f5711s = i10 - 1;
            return obj2;
        }
        return null;
    }

    public boolean b(Object obj) {
        int i10;
        boolean z10;
        int i11 = 0;
        while (true) {
            i10 = this.f5711s;
            if (i11 >= i10) {
                z10 = false;
                break;
            } else if (((Object[]) this.f5712t)[i11] == obj) {
                z10 = true;
                break;
            } else {
                i11++;
            }
        }
        if (!z10) {
            Object obj2 = this.f5712t;
            if (i10 >= ((Object[]) obj2).length) {
                return false;
            }
            ((Object[]) obj2)[i10] = obj;
            this.f5711s = i10 + 1;
            return true;
        }
        throw new IllegalStateException("Already in the pool!");
    }

    public final long c(int i10) {
        if (i10 < 0 || i10 >= this.f5711s) {
            throw new IndexOutOfBoundsException(d.a(46, "Invalid index ", i10, ", size is ", this.f5711s));
        }
        return ((long[]) this.f5712t)[i10];
    }

    public final void d(long j3) {
        int i10 = this.f5711s;
        long[] jArr = (long[]) this.f5712t;
        if (i10 == jArr.length) {
            this.f5712t = Arrays.copyOf(jArr, i10 + i10);
        }
        int i11 = this.f5711s;
        this.f5711s = i11 + 1;
        ((long[]) this.f5712t)[i11] = j3;
    }

    @Override // m4.v91
    public final void h(Object obj) {
        int i10 = this.f5711s;
        z40 z40Var = ((ze2) this.f5712t).f16165a;
        ((rx) obj).v0(i10);
    }
}
