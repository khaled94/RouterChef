package v9;

import androidx.activity.result.a;
import java.util.List;
import javax.annotation.Nullable;
import r9.c0;
import r9.g0;
import r9.w;
import u9.c;
import u9.i;

/* loaded from: classes.dex */
public final class f implements w.a {

    /* renamed from: a */
    public final List<w> f19842a;

    /* renamed from: b */
    public final i f19843b;
    @Nullable

    /* renamed from: c */
    public final c f19844c;

    /* renamed from: d */
    public final int f19845d;

    /* renamed from: e */
    public final c0 f19846e;

    /* renamed from: f */
    public final r9.f f19847f;

    /* renamed from: g */
    public final int f19848g;

    /* renamed from: h */
    public final int f19849h;

    /* renamed from: i */
    public final int f19850i;

    /* renamed from: j */
    public int f19851j;

    public f(List<w> list, i iVar, @Nullable c cVar, int i10, c0 c0Var, r9.f fVar, int i11, int i12, int i13) {
        this.f19842a = list;
        this.f19843b = iVar;
        this.f19844c = cVar;
        this.f19845d = i10;
        this.f19846e = c0Var;
        this.f19847f = fVar;
        this.f19848g = i11;
        this.f19849h = i12;
        this.f19850i = i13;
    }

    public final g0 a(c0 c0Var) {
        return b(c0Var, this.f19843b, this.f19844c);
    }

    public final g0 b(c0 c0Var, i iVar, @Nullable c cVar) {
        if (this.f19845d < this.f19842a.size()) {
            this.f19851j++;
            c cVar2 = this.f19844c;
            if (cVar2 != null && !cVar2.b().k(c0Var.f17311a)) {
                StringBuilder c10 = a.c("network interceptor ");
                c10.append(this.f19842a.get(this.f19845d - 1));
                c10.append(" must retain the same host and port");
                throw new IllegalStateException(c10.toString());
            }
            if (this.f19844c != null && this.f19851j > 1) {
                StringBuilder c11 = a.c("network interceptor ");
                c11.append(this.f19842a.get(this.f19845d - 1));
                c11.append(" must call proceed() exactly once");
                throw new IllegalStateException(c11.toString());
            }
            List<w> list = this.f19842a;
            int i10 = this.f19845d;
            f fVar = new f(list, iVar, cVar, i10 + 1, c0Var, this.f19847f, this.f19848g, this.f19849h, this.f19850i);
            w wVar = list.get(i10);
            g0 a10 = wVar.a(fVar);
            if (cVar != null && this.f19845d + 1 < this.f19842a.size() && fVar.f19851j != 1) {
                throw new IllegalStateException("network interceptor " + wVar + " must call proceed() exactly once");
            } else if (a10 == null) {
                throw new NullPointerException("interceptor " + wVar + " returned null");
            } else if (a10.y != null) {
                return a10;
            } else {
                throw new IllegalStateException("interceptor " + wVar + " returned a response with no body");
            }
        }
        throw new AssertionError();
    }
}
