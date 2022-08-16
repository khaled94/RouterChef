package com.raouf.routerchef;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.t;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import androidx.preference.b;
import androidx.preference.e;
import e0.d;
import f8.g2;
import f8.h2;
import f8.i2;
import i8.g;
import java.util.Locale;
import java.util.Objects;

/* loaded from: classes.dex */
public class SettingsActivity extends g {

    /* loaded from: classes.dex */
    public static class a extends b {

        /* renamed from: u0 */
        public static final /* synthetic */ int f3640u0 = 0;

        /* JADX WARN: Finally extract failed */
        @Override // androidx.preference.b
        public final void e0(String str) {
            boolean z10;
            CharSequence charSequence;
            e eVar = this.f1817n0;
            if (eVar != null) {
                Context W = W();
                eVar.f1846e = true;
                e1.e eVar2 = new e1.e(W, eVar);
                XmlResourceParser xml = W.getResources().getXml(R.xml.root_preferences);
                try {
                    Preference c10 = eVar2.c(xml);
                    xml.close();
                    PreferenceScreen preferenceScreen = (PreferenceScreen) c10;
                    preferenceScreen.r(eVar);
                    SharedPreferences.Editor editor = eVar.f1845d;
                    if (editor != null) {
                        editor.apply();
                    }
                    eVar.f1846e = false;
                    Object obj = preferenceScreen;
                    if (str != null) {
                        Object G = preferenceScreen.G(str);
                        boolean z11 = G instanceof PreferenceScreen;
                        obj = G;
                        if (!z11) {
                            throw new IllegalArgumentException(d.a("Preference object with key ", str, " is not a PreferenceScreen"));
                        }
                    }
                    PreferenceScreen preferenceScreen2 = (PreferenceScreen) obj;
                    e eVar3 = this.f1817n0;
                    PreferenceScreen preferenceScreen3 = eVar3.f1848g;
                    if (preferenceScreen2 != preferenceScreen3) {
                        if (preferenceScreen3 != null) {
                            preferenceScreen3.u();
                        }
                        eVar3.f1848g = preferenceScreen2;
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10 && preferenceScreen2 != null) {
                        this.f1819p0 = true;
                        if (this.f1820q0 && !this.f1822s0.hasMessages(1)) {
                            this.f1822s0.obtainMessage(1).sendToTarget();
                        }
                    }
                    if (U().getSharedPreferences("prefs", 0).getBoolean("firstTime", true)) {
                        SharedPreferences.Editor edit = U().getSharedPreferences("prefs", 0).edit();
                        edit.putBoolean("firstTime", false);
                        edit.apply();
                    }
                    t U = U();
                    SharedPreferences sharedPreferences = U.getSharedPreferences(e.b(U), 0);
                    ListPreference listPreference = (ListPreference) e("language");
                    ListPreference listPreference2 = (ListPreference) e("router_model");
                    ListPreference listPreference3 = (ListPreference) e("isp");
                    if (sharedPreferences.getString("language", null) != null) {
                        charSequence = listPreference.f1752l0[listPreference.G(sharedPreferences.getString("language", null))];
                    } else if (Locale.getDefault().getLanguage().equals("ar")) {
                        charSequence = listPreference.f1752l0[listPreference.G(sharedPreferences.getString("language", "ar"))];
                    } else {
                        charSequence = listPreference.f1752l0[listPreference.G(sharedPreferences.getString("language", "en"))];
                    }
                    listPreference.C(charSequence);
                    int G2 = listPreference2.G(sharedPreferences.getString("router_model", "ZTEH168N"));
                    if (G2 == -1) {
                        G2 = listPreference2.G("ZTEH168N");
                    }
                    listPreference2.C(listPreference2.f1752l0[G2]);
                    listPreference3.C(listPreference3.f1752l0[listPreference3.G(sharedPreferences.getString("isp", "we"))]);
                    listPreference.f1772w = new g2(this);
                    listPreference2.f1772w = new i2(this);
                    listPreference3.f1772w = new h2(this);
                    return;
                } catch (Throwable th) {
                    xml.close();
                    throw th;
                }
            }
            throw new RuntimeException("This should be called after super.onCreate.");
        }
    }

    public void done(View view) {
        onBackPressed();
        finish();
    }

    @Override // i8.g, androidx.fragment.app.t, androidx.activity.ComponentActivity, b0.j, android.app.Activity
    public final void onCreate(Bundle bundle) {
        r8.b.p(r8.b.m(this).toString(), this);
        super.onCreate(bundle);
        setContentView(R.layout.settings_activity);
        if (bundle == null) {
            androidx.fragment.app.b bVar = new androidx.fragment.app.b(J());
            bVar.e(R.id.settings, new a());
            bVar.c();
        }
        e.a M = M();
        Objects.requireNonNull(M);
        M.b();
    }
}
