package m4;

import android.content.Context;
import d.a;
import java.util.concurrent.ScheduledExecutorService;
import n3.v;

/* loaded from: classes.dex */
public final class wn0 implements nd2 {

    /* renamed from: a */
    public final /* synthetic */ int f15066a;

    /* renamed from: b */
    public final vd2 f15067b;

    /* renamed from: c */
    public final vd2 f15068c;

    /* renamed from: d */
    public final vd2 f15069d;

    public /* synthetic */ wn0(vd2 vd2Var, vd2 vd2Var2, vd2 vd2Var3, int i10) {
        this.f15066a = i10;
        this.f15067b = vd2Var;
        this.f15068c = vd2Var2;
        this.f15069d = vd2Var3;
    }

    @Override // m4.vd2
    public final Object a() {
        switch (this.f15066a) {
            case 0:
                final Context context = (Context) this.f15067b.a();
                final o90 b10 = ((vf0) this.f15068c).b();
                final om1 b11 = ((mo0) this.f15069d).b();
                return new cu1() { // from class: m4.vn0
                    @Override // m4.cu1
                    public final Object a(Object obj) {
                        Context context2 = context;
                        o90 o90Var = b10;
                        om1 om1Var = b11;
                        cm1 cm1Var = (cm1) obj;
                        v vVar = new v(context2);
                        vVar.f16579c = cm1Var.C;
                        vVar.f16582f = cm1Var.D.toString();
                        vVar.f16581e = o90Var.f12051s;
                        vVar.f16580d = om1Var.f12205f;
                        return vVar;
                    }
                };
            default:
                jd2 b12 = md2.b(this.f15067b);
                jd2 b13 = md2.b(this.f15068c);
                Object gp1Var = ((Boolean) jo.f10145d.f10148c.a(es.J5)).booleanValue() ? new gp1((ep1) b12.a(), (ScheduledExecutorService) this.f15069d.a()) : (ep1) b13.a();
                a.d(gp1Var);
                return gp1Var;
        }
    }
}
