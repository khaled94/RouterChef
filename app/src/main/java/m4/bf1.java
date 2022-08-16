package m4;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class bf1 implements eh1<cf1> {

    /* renamed from: a */
    public final uz1 f6508a;

    /* renamed from: b */
    public final om1 f6509b;

    public bf1(uz1 uz1Var, om1 om1Var) {
        this.f6508a = uz1Var;
        this.f6509b = om1Var;
    }

    @Override // m4.eh1
    public final tz1<cf1> a() {
        return this.f6508a.Z(new Callable() { // from class: m4.af1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Bundle bundle = bf1.this.f6509b.f12203d.f10130u;
                return new cf1("requester_type_2".equals(bundle == null ? "unspecified" : bundle.getString("query_info_type")));
            }
        });
    }
}
