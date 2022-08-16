package m4;

import android.os.Parcel;
import android.text.TextUtils;
import java.util.List;
import java.util.Objects;
import l3.s;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class oo0 extends ba implements iq {

    /* renamed from: s */
    public final String f12238s;

    /* renamed from: t */
    public final String f12239t;

    /* renamed from: u */
    public final String f12240u;

    /* renamed from: v */
    public final List<sn> f12241v;

    /* renamed from: w */
    public final long f12242w;

    /* renamed from: x */
    public final String f12243x;

    public oo0(cm1 cm1Var, String str, j71 j71Var, em1 em1Var) {
        super("com.google.android.gms.ads.internal.client.IResponseInfo");
        String str2 = null;
        this.f12239t = cm1Var == null ? null : cm1Var.Y;
        this.f12240u = em1Var == null ? null : em1Var.f8004b;
        if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
            try {
                str2 = cm1Var.f7064w.getString("class_name");
            } catch (JSONException unused) {
            }
        }
        this.f12238s = str2 != null ? str2 : str;
        this.f12241v = j71Var.f9863a;
        Objects.requireNonNull(s.B.f5796j);
        this.f12242w = System.currentTimeMillis() / 1000;
        this.f12243x = (!((Boolean) jo.f10145d.f10148c.a(es.f8124j6)).booleanValue() || em1Var == null || TextUtils.isEmpty(em1Var.f8010h)) ? "" : em1Var.f8010h;
    }

    @Override // m4.ba
    public final boolean M3(int i10, Parcel parcel, Parcel parcel2) {
        String str;
        if (i10 == 1) {
            str = this.f12238s;
        } else if (i10 != 2) {
            if (i10 != 3) {
                return false;
            }
            List<sn> e10 = e();
            parcel2.writeNoException();
            parcel2.writeTypedList(e10);
            return true;
        } else {
            str = this.f12239t;
        }
        parcel2.writeNoException();
        parcel2.writeString(str);
        return true;
    }

    @Override // m4.iq
    public final String b() {
        return this.f12238s;
    }

    @Override // m4.iq
    public final String d() {
        return this.f12239t;
    }

    @Override // m4.iq
    public final List<sn> e() {
        if (!((Boolean) jo.f10145d.f10148c.a(es.f8226w5)).booleanValue()) {
            return null;
        }
        return this.f12241v;
    }
}
