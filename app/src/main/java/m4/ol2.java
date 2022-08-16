package m4;

/* loaded from: classes.dex */
public final class ol2 implements Comparable<ol2> {

    /* renamed from: s */
    public final boolean f12197s;

    /* renamed from: t */
    public final boolean f12198t;

    public ol2(t tVar, int i10) {
        this.f12197s = 1 != (tVar.f13864d & 1) ? false : true;
        this.f12198t = ul2.c(i10, false);
    }

    /* renamed from: b */
    public final int compareTo(ol2 ol2Var) {
        return xv1.f15479a.d(this.f12198t, ol2Var.f12198t).d(this.f12197s, ol2Var.f12197s).a();
    }
}
