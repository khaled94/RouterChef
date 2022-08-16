package m4;

import java.util.Map;

/* loaded from: classes.dex */
public final class mv1 extends pv1<Map.Entry> {

    /* renamed from: w */
    public final /* synthetic */ tv1 f11325w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mv1(tv1 tv1Var) {
        super(tv1Var);
        this.f11325w = tv1Var;
    }

    @Override // m4.pv1
    public final /* bridge */ /* synthetic */ Map.Entry a(int i10) {
        return new rv1(this.f11325w, i10);
    }
}
