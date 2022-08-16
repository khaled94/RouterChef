package m4;

import android.util.SparseBooleanArray;

/* loaded from: classes.dex */
public final class io2 {

    /* renamed from: a */
    public final SparseBooleanArray f9717a;

    public final int a(int i10) {
        r01.b(i10, this.f9717a.size());
        return this.f9717a.keyAt(i10);
    }

    public final int b() {
        return this.f9717a.size();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof io2)) {
            return false;
        }
        io2 io2Var = (io2) obj;
        if (ls1.f10971a >= 24) {
            return this.f9717a.equals(io2Var.f9717a);
        }
        if (this.f9717a.size() != io2Var.f9717a.size()) {
            return false;
        }
        for (int i10 = 0; i10 < this.f9717a.size(); i10++) {
            if (a(i10) != io2Var.a(i10)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        if (ls1.f10971a < 24) {
            int size = this.f9717a.size();
            for (int i10 = 0; i10 < this.f9717a.size(); i10++) {
                size = (size * 31) + a(i10);
            }
            return size;
        }
        return this.f9717a.hashCode();
    }
}
