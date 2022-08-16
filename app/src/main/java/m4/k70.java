package m4;

import android.content.Context;
import h4.a;
import java.util.Set;
import n3.i1;

/* loaded from: classes.dex */
public final class k70 implements nd2 {

    /* renamed from: a */
    public final /* synthetic */ int f10288a;

    /* renamed from: b */
    public final vd2 f10289b;

    /* renamed from: c */
    public final vd2 f10290c;

    /* renamed from: d */
    public final Object f10291d;

    public /* synthetic */ k70(Object obj, vd2 vd2Var, vd2 vd2Var2, int i10) {
        this.f10288a = i10;
        this.f10291d = obj;
        this.f10289b = vd2Var;
        this.f10290c = vd2Var2;
    }

    @Override // m4.vd2
    public final Object a() {
        m00 m00Var;
        switch (this.f10288a) {
            case 0:
                return new j70((a) this.f10289b.a(), (i1) this.f10290c.a(), (x70) ((vd2) this.f10291d).a());
            case 1:
                t90 t90Var = u90.f14294a;
                d.a.d(t90Var);
                Set e10 = qi.e((r11) this.f10289b.a(), t90Var);
                d.a.d(e10);
                return e10;
            default:
                Context b10 = ((lf0) this.f10289b).b();
                o90 b11 = ((vf0) this.f10290c).b();
                synchronized (new Object()) {
                    Context applicationContext = b10.getApplicationContext();
                    if (applicationContext != null) {
                        b10 = applicationContext;
                    }
                    m00Var = new m00(b10, b11, (String) jo.f10145d.f10148c.a(es.f8049a));
                }
                return m00Var;
        }
    }

    public k70(vd2 vd2Var, vd2 vd2Var2, vd2 vd2Var3) {
        this.f10288a = 0;
        this.f10289b = vd2Var;
        this.f10290c = vd2Var2;
        this.f10291d = vd2Var3;
    }
}
