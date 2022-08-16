package m4;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import java.util.Objects;
import java.util.concurrent.Callable;
import l3.s;
import n3.s1;

/* loaded from: classes.dex */
public final /* synthetic */ class kc0 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ int f10332a;

    /* renamed from: b */
    public final /* synthetic */ Object f10333b;

    public /* synthetic */ kc0(Object obj, int i10) {
        this.f10332a = i10;
        this.f10333b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f10332a) {
            case 0:
                lc0 lc0Var = (lc0) this.f10333b;
                return Boolean.valueOf(lc0Var.f10711c.s(lc0Var.f10712d, lc0Var.f10713e, lc0Var));
            default:
                ue1 ue1Var = (ue1) this.f10333b;
                Objects.requireNonNull(ue1Var);
                s1 s1Var = s.B.f5789c;
                Context context = ue1Var.f14390a;
                yr<Boolean> yrVar = es.S3;
                jo joVar = jo.f10145d;
                String str = "";
                String string = !((Boolean) joVar.f10148c.a(yrVar)).booleanValue() ? str : context.getSharedPreferences("mobileads_consent", 0).getString("consent_string", str);
                if (((Boolean) joVar.f10148c.a(es.U3)).booleanValue()) {
                    str = ue1Var.f14390a.getSharedPreferences("mobileads_consent", 0).getString("fc_consent", str);
                }
                Context context2 = ue1Var.f14390a;
                boolean booleanValue = ((Boolean) joVar.f10148c.a(es.T3)).booleanValue();
                Bundle bundle = null;
                if (booleanValue) {
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context2);
                    Bundle bundle2 = new Bundle();
                    if (defaultSharedPreferences.contains("IABConsent_CMPPresent")) {
                        bundle2.putBoolean("IABConsent_CMPPresent", defaultSharedPreferences.getBoolean("IABConsent_CMPPresent", false));
                    }
                    String[] strArr = {"IABConsent_SubjectToGDPR", "IABConsent_ConsentString", "IABConsent_ParsedPurposeConsents", "IABConsent_ParsedVendorConsents"};
                    for (int i10 = 0; i10 < 4; i10++) {
                        String str2 = strArr[i10];
                        if (defaultSharedPreferences.contains(str2)) {
                            bundle2.putString(str2, defaultSharedPreferences.getString(str2, null));
                        }
                    }
                    bundle = bundle2;
                }
                return new te1(string, str, bundle);
        }
    }
}
