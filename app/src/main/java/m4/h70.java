package m4;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import n3.i1;

/* loaded from: classes.dex */
public final class h70 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a */
    public final Context f9122a;

    /* renamed from: b */
    public final SharedPreferences f9123b;

    /* renamed from: c */
    public final i1 f9124c;

    /* renamed from: d */
    public final x70 f9125d;

    /* renamed from: e */
    public String f9126e = "-1";

    /* renamed from: f */
    public int f9127f = -1;

    public h70(Context context, i1 i1Var, x70 x70Var) {
        this.f9123b = PreferenceManager.getDefaultSharedPreferences(context);
        this.f9124c = i1Var;
        this.f9122a = context;
        this.f9125d = x70Var;
    }

    public final void a(String str, int i10) {
        Context context;
        yr<Boolean> yrVar = es.f8142m0;
        jo joVar = jo.f10145d;
        boolean z10 = false;
        if (!((Boolean) joVar.f10148c.a(yrVar)).booleanValue() ? str.isEmpty() || str.charAt(0) != '1' : i10 == 0 || str.isEmpty() || (str.charAt(0) != '1' && !str.equals("-1"))) {
            z10 = true;
        }
        if (((Boolean) joVar.f10148c.a(es.f8126k0)).booleanValue()) {
            this.f9124c.l(z10);
            if (((Boolean) joVar.f10148c.a(es.Z3)).booleanValue() && z10 && (context = this.f9122a) != null) {
                context.deleteDatabase("OfflineUpload.db");
            }
        }
        if (((Boolean) joVar.f10148c.a(es.f8095g0)).booleanValue()) {
            synchronized (this.f9125d.f15239l) {
            }
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        String string = sharedPreferences.getString("IABTCF_PurposeConsents", "-1");
        int i10 = sharedPreferences.getInt("gad_has_consent_for_cookies", -1);
        String valueOf = String.valueOf(str);
        if (!valueOf.equals("gad_has_consent_for_cookies")) {
            if (!valueOf.equals("IABTCF_PurposeConsents") || string.equals("-1") || this.f9126e.equals(string)) {
                return;
            }
            this.f9126e = string;
        } else {
            if (!((Boolean) jo.f10145d.f10148c.a(es.f8142m0)).booleanValue() || i10 == -1 || this.f9127f == i10) {
                return;
            }
            this.f9127f = i10;
        }
        a(string, i10);
    }
}
