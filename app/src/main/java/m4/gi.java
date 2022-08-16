package m4;

import java.util.Collections;

/* loaded from: classes.dex */
public final class gi {

    /* renamed from: a */
    public final String f8934a;

    /* renamed from: b */
    public final fg f8935b;

    /* renamed from: c */
    public final sc f8936c;

    /* renamed from: d */
    public final lm f8937d;

    /* renamed from: e */
    public final j7 f8938e;

    static {
        pu1 pu1Var = gw1.f9058t;
        gw1<Object> gw1Var = gx1.f9060w;
        Collections.emptyList();
        lm lmVar = lm.f10918s;
    }

    public /* synthetic */ gi(String str, j7 j7Var, fg fgVar, sc scVar) {
        lm lmVar = lm.f10918s;
        this.f8934a = str;
        this.f8935b = fgVar;
        this.f8936c = scVar;
        this.f8937d = lmVar;
        this.f8938e = j7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gi)) {
            return false;
        }
        gi giVar = (gi) obj;
        return ls1.f(this.f8934a, giVar.f8934a) && this.f8938e.equals(giVar.f8938e) && ls1.f(this.f8935b, giVar.f8935b) && ls1.f(this.f8936c, giVar.f8936c) && ls1.f(this.f8937d, giVar.f8937d);
    }

    public final int hashCode() {
        int hashCode = this.f8934a.hashCode() * 31;
        fg fgVar = this.f8935b;
        int hashCode2 = fgVar != null ? fgVar.hashCode() : 0;
        int hashCode3 = this.f8936c.hashCode();
        return this.f8937d.hashCode() + ((this.f8938e.hashCode() + ((hashCode3 + ((hashCode + hashCode2) * 31)) * 31)) * 31);
    }
}
