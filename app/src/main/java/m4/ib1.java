package m4;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.Iterator;
import m4.kp0;

/* loaded from: classes.dex */
public final class ib1<AdT, AdapterT, ListenerT extends kp0> implements e71<AdT> {

    /* renamed from: a */
    public final g71<AdapterT, ListenerT> f9579a;

    /* renamed from: b */
    public final l71<AdT, AdapterT, ListenerT> f9580b;

    /* renamed from: c */
    public final zo1 f9581c;

    /* renamed from: d */
    public final uz1 f9582d;

    public ib1(zo1 zo1Var, uz1 uz1Var, g71<AdapterT, ListenerT> g71Var, l71<AdT, AdapterT, ListenerT> l71Var) {
        this.f9581c = zo1Var;
        this.f9582d = uz1Var;
        this.f9580b = l71Var;
        this.f9579a = g71Var;
    }

    public static final String c(String str, int i10) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 31);
        sb.append("Error from: ");
        sb.append(str);
        sb.append(", code: ");
        sb.append(i10);
        return sb.toString();
    }

    @Override // m4.e71
    public final boolean a(km1 km1Var, cm1 cm1Var) {
        return !cm1Var.f7062u.isEmpty();
    }

    @Override // m4.e71
    public final tz1<AdT> b(final km1 km1Var, final cm1 cm1Var) {
        final h71<AdapterT, ListenerT> h71Var;
        Iterator<String> it = cm1Var.f7062u.iterator();
        while (true) {
            if (!it.hasNext()) {
                h71Var = null;
                break;
            }
            try {
                h71Var = this.f9579a.a(it.next(), cm1Var.f7064w);
                break;
            } catch (pm1 unused) {
            }
        }
        if (h71Var == null) {
            return new nz1(new q91());
        }
        w90 w90Var = new w90();
        h71Var.f9130c.x3(new hb1(h71Var, w90Var));
        if (cm1Var.J) {
            Bundle bundle = ((om1) km1Var.f10488a.f8363t).f12203d.E;
            Bundle bundle2 = bundle.getBundle(AdMobAdapter.class.getName());
            if (bundle2 == null) {
                bundle2 = new Bundle();
                bundle.putBundle(AdMobAdapter.class.getName(), bundle2);
            }
            bundle2.putBoolean("render_test_ad_label", true);
        }
        zo1 zo1Var = this.f9581c;
        return qo1.c(new lo1() { // from class: m4.gb1
            @Override // m4.lo1
            public final void zza() {
                ib1 ib1Var = ib1.this;
                ib1Var.f9580b.b(km1Var, cm1Var, h71Var);
            }
        }, this.f9582d, wo1.ADAPTER_LOAD_AD_SYN, zo1Var).b(wo1.ADAPTER_LOAD_AD_ACK).d(w90Var).b(wo1.ADAPTER_WRAP_ADAPTER).e(new ko1() { // from class: m4.fb1
            @Override // m4.ko1
            /* renamed from: h */
            public final Object mo30h(Object obj) {
                ib1 ib1Var = ib1.this;
                Void r52 = (Void) obj;
                return ib1Var.f9580b.a(km1Var, cm1Var, h71Var);
            }
        }).a();
    }
}
