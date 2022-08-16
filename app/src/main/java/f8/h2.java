package f8;

import android.content.ClipData;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputContentInfo;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import b3.b0;
import c5.a;
import c5.i;
import com.android.billingclient.api.Purchase;
import com.raouf.routerchef.SettingsActivity;
import h2.f;
import h2.g;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import m0.c;
import m0.z;
import m4.zf2;
import p0.d;
import q8.e;
import s6.l0;

/* loaded from: classes.dex */
public final /* synthetic */ class h2 implements Preference.d, g, d, b0.c, a {

    /* renamed from: s */
    public final /* synthetic */ Object f4615s;

    public /* synthetic */ h2(Object obj) {
        this.f4615s = obj;
    }

    @Override // androidx.preference.Preference.d
    public void a(Preference preference, Object obj) {
        SettingsActivity.a aVar = (SettingsActivity.a) this.f4615s;
        int i10 = SettingsActivity.a.f3640u0;
        Objects.requireNonNull(aVar);
        String str = (String) obj;
        if (preference.D.equals("isp")) {
            zf2 zf2Var = ((SettingsActivity) aVar.U()).T;
            zf2Var.f16191s = zf2.a(((o8.a) zf2Var.f16191s).f16791d, str);
        }
        ListPreference listPreference = (ListPreference) preference;
        listPreference.C(listPreference.f1752l0[listPreference.G(str)]);
    }

    @Override // h2.g
    public void b(f fVar, List list) {
        e eVar = (e) this.f4615s;
        Objects.requireNonNull(eVar);
        if (fVar.f4994a == 0) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Purchase purchase = (Purchase) it.next();
                if ((purchase.f2897c.optInt("purchaseState", 1) != 4 ? (char) 1 : (char) 2) == 1 && !purchase.f2897c.optBoolean("acknowledged", true)) {
                    eVar.a(purchase);
                }
            }
        }
    }

    public boolean c(p0.e eVar, int i10, Bundle bundle) {
        View view = (View) this.f4615s;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 25 && (i10 & 1) != 0) {
            try {
                eVar.f16859a.d();
                InputContentInfo inputContentInfo = (InputContentInfo) eVar.f16859a.b();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo);
            } catch (Exception e10) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e10);
                return false;
            }
        }
        ClipData clipData = new ClipData(eVar.f16859a.a(), new ClipData.Item(eVar.f16859a.c()));
        c.b aVar = i11 >= 31 ? new c.a(clipData, 2) : new c.C0094c(clipData, 2);
        aVar.c(eVar.f16859a.e());
        aVar.b(bundle);
        return z.l(view, aVar.a()) == null;
    }

    @Override // c5.a
    public Object d(i iVar) {
        ExecutorService executorService = l0.f18283a;
        ((CountDownLatch) this.f4615s).countDown();
        return null;
    }
}
