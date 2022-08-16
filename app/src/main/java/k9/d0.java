package k9;

import androidx.activity.result.a;

/* loaded from: classes.dex */
public final class d0 implements j0 {

    /* renamed from: s */
    public final boolean f5643s;

    public d0(boolean z10) {
        this.f5643s = z10;
    }

    @Override // k9.j0
    public final boolean b() {
        return this.f5643s;
    }

    @Override // k9.j0
    public final u0 e() {
        return null;
    }

    public final String toString() {
        StringBuilder c10 = a.c("Empty{");
        c10.append(this.f5643s ? "Active" : "New");
        c10.append('}');
        return c10.toString();
    }
}
