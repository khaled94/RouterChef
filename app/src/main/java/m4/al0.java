package m4;

import android.content.Context;
import d.a;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public final class al0 implements nd2 {

    /* renamed from: a */
    public final /* synthetic */ int f6182a;

    /* renamed from: b */
    public final vd2 f6183b;

    /* renamed from: c */
    public final Object f6184c;

    public /* synthetic */ al0(Object obj, vd2 vd2Var, int i10) {
        this.f6182a = i10;
        this.f6184c = obj;
        this.f6183b = vd2Var;
    }

    @Override // m4.vd2
    public final /* bridge */ /* synthetic */ Object a() {
        switch (this.f6182a) {
            case 0:
                Set singleton = Collections.singleton(new es0((tl0) this.f6183b.a(), u90.f14299f));
                a.d(singleton);
                return singleton;
            case 1:
                return new es0((bn0) this.f6183b.a(), u90.f14299f);
            default:
                Context context = (Context) this.f6183b.a();
                t90 t90Var = u90.f14294a;
                a.d(t90Var);
                return new ve1(t90Var);
        }
    }

    public al0(vd2 vd2Var) {
        go1 go1Var = eb.f7756v;
        this.f6182a = 2;
        this.f6183b = vd2Var;
        this.f6184c = go1Var;
    }
}
