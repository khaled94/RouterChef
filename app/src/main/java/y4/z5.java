package y4;

import java.util.ArrayList;
import java.util.List;
import s4.o3;
import s4.y3;

/* loaded from: classes.dex */
public final class z5 {

    /* renamed from: a */
    public y3 f20868a;

    /* renamed from: b */
    public List<Long> f20869b;

    /* renamed from: c */
    public List<o3> f20870c;

    /* renamed from: d */
    public long f20871d;

    /* renamed from: e */
    public final /* synthetic */ a6 f20872e;

    public /* synthetic */ z5(a6 a6Var) {
        this.f20872e = a6Var;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.util.List<s4.o3>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.List<s4.o3>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List<s4.o3>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.List<s4.o3>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.util.List<java.lang.Long>, java.util.ArrayList] */
    public final boolean a(long j3, o3 o3Var) {
        if (this.f20870c == null) {
            this.f20870c = new ArrayList();
        }
        if (this.f20869b == null) {
            this.f20869b = new ArrayList();
        }
        if (this.f20870c.size() <= 0 || ((((o3) this.f20870c.get(0)).v() / 1000) / 60) / 60 == ((o3Var.v() / 1000) / 60) / 60) {
            long b10 = this.f20871d + o3Var.b();
            this.f20872e.K();
            if (b10 >= Math.max(0, f1.f20413i.a(null).intValue())) {
                return false;
            }
            this.f20871d = b10;
            this.f20870c.add(o3Var);
            this.f20869b.add(Long.valueOf(j3));
            int size = this.f20870c.size();
            this.f20872e.K();
            return size < Math.max(1, f1.f20415j.a(null).intValue());
        }
        return false;
    }
}
