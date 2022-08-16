package m4;

import android.content.Context;

/* loaded from: classes.dex */
public final class li0 implements nd2 {

    /* renamed from: a */
    public final /* synthetic */ int f10868a;

    /* renamed from: b */
    public final Object f10869b;

    public /* synthetic */ li0(Object obj, int i10) {
        this.f10868a = i10;
        this.f10869b = obj;
    }

    @Override // m4.vd2
    public final Object a() {
        switch (this.f10868a) {
            case 0:
                return new ki0((Context) ((vd2) this.f10869b).a());
            case 1:
                return new tt0((gp0) ((vd2) this.f10869b).a());
            default:
                return ((dr0) this.f10869b).f7609n;
        }
    }
}
