package m4;

import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class wh2 {

    /* renamed from: a */
    public final int f15026a;

    /* renamed from: b */
    public final uj2 f15027b;

    /* renamed from: c */
    public final CopyOnWriteArrayList<vh2> f15028c;

    public wh2() {
        this.f15028c = new CopyOnWriteArrayList<>();
        this.f15026a = 0;
        this.f15027b = null;
    }

    public wh2(CopyOnWriteArrayList<vh2> copyOnWriteArrayList, int i10, uj2 uj2Var) {
        this.f15028c = copyOnWriteArrayList;
        this.f15026a = i10;
        this.f15027b = uj2Var;
    }

    public final wh2 a(int i10, uj2 uj2Var) {
        return new wh2(this.f15028c, i10, uj2Var);
    }
}
