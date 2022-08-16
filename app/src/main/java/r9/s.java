package r9;

import ca.f;
import ca.g;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import s9.e;

/* loaded from: classes.dex */
public final class s extends f0 {

    /* renamed from: c */
    public static final x f17463c = x.a("application/x-www-form-urlencoded");

    /* renamed from: a */
    public final List<String> f17464a;

    /* renamed from: b */
    public final List<String> f17465b;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final List<String> f17466a = new ArrayList();

        /* renamed from: b */
        public final List<String> f17467b = new ArrayList();
    }

    public s(List<String> list, List<String> list2) {
        this.f17464a = e.l(list);
        this.f17465b = e.l(list2);
    }

    @Override // r9.f0
    public final long a() {
        return d(null, true);
    }

    @Override // r9.f0
    public final x b() {
        return f17463c;
    }

    @Override // r9.f0
    public final void c(g gVar) {
        d(gVar, false);
    }

    public final long d(@Nullable g gVar, boolean z10) {
        f fVar = z10 ? new f() : gVar.a();
        int size = this.f17464a.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (i10 > 0) {
                fVar.B0(38);
            }
            fVar.G0(this.f17464a.get(i10));
            fVar.B0(61);
            fVar.G0(this.f17465b.get(i10));
        }
        if (z10) {
            long j3 = fVar.f2843t;
            fVar.b();
            return j3;
        }
        return 0L;
    }
}
