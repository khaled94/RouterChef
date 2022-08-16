package m4;

import android.content.Context;
import android.view.ViewGroup;
import java.util.Set;

/* loaded from: classes.dex */
public final class df1 implements eh1<ef1> {

    /* renamed from: a */
    public final uz1 f7351a;

    /* renamed from: b */
    public final ViewGroup f7352b;

    /* renamed from: c */
    public final Context f7353c;

    /* renamed from: d */
    public final Set<String> f7354d;

    public df1(uz1 uz1Var, ViewGroup viewGroup, Context context, Set<String> set) {
        this.f7351a = uz1Var;
        this.f7354d = set;
        this.f7352b = viewGroup;
        this.f7353c = context;
    }

    @Override // m4.eh1
    public final tz1<ef1> a() {
        return this.f7351a.Z(new w80(this, 1));
    }
}
