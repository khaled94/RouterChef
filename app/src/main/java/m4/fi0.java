package m4;

/* loaded from: classes.dex */
public final class fi0 implements nd2 {

    /* renamed from: a */
    public final /* synthetic */ int f8565a;

    /* renamed from: b */
    public final Object f8566b;

    public /* synthetic */ fi0(Object obj, int i10) {
        this.f8565a = i10;
        this.f8566b = obj;
    }

    @Override // m4.vd2
    public final Object a() {
        switch (this.f8565a) {
            case 0:
                return new ei0(((en1) ((vd2) this.f8566b)).b());
            case 1:
                return new qm0((ip0) ((vd2) this.f8566b).a());
            case 2:
                return new es0((zr0) ((vd2) this.f8566b).a(), u90.f14299f);
            default:
                return ((dr0) this.f8566b).f7598c;
        }
    }
}
