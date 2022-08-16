package m4;

import c1.e;
import d.a;
import java.util.Arrays;
import t3.b0;

/* loaded from: classes.dex */
public final class fu1 {

    /* renamed from: a */
    public final /* synthetic */ int f8647a = 0;

    /* renamed from: b */
    public Object f8648b;

    /* renamed from: c */
    public Object f8649c;

    /* renamed from: d */
    public Object f8650d;

    public /* synthetic */ fu1(String str) {
        du1 du1Var = new du1();
        this.f8649c = du1Var;
        this.f8650d = du1Var;
        this.f8648b = str;
    }

    public final eh0 a() {
        a.g((ho0) this.f8649c, ho0.class);
        a.g((b0) this.f8650d, b0.class);
        return new eh0((gh0) this.f8648b, (b0) this.f8650d, new qi(), (ho0) this.f8649c, new b10());
    }

    public final String toString() {
        switch (this.f8647a) {
            case 0:
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.f8648b);
                sb.append('{');
                du1 du1Var = ((du1) this.f8649c).f7644b;
                String str = "";
                while (du1Var != null) {
                    Object obj = du1Var.f7643a;
                    sb.append(str);
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        String deepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                    }
                    du1Var = du1Var.f7644b;
                    str = ", ";
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ fu1(gh0 gh0Var) {
        this.f8649c = gh0Var;
    }

    public /* synthetic */ fu1(gh0 gh0Var, c4.a aVar, e eVar) {
        this.f8648b = gh0Var;
    }
}
