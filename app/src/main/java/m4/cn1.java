package m4;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import javax.annotation.concurrent.GuardedBy;
import n3.g1;

/* loaded from: classes.dex */
public final class cn1 implements vo0 {
    @GuardedBy("this")

    /* renamed from: s */
    public final HashSet<u80> f7075s = new HashSet<>();

    /* renamed from: t */
    public final Context f7076t;

    /* renamed from: u */
    public final d90 f7077u;

    public cn1(Context context, d90 d90Var) {
        this.f7076t = context;
        this.f7077u = d90Var;
    }

    public final Bundle a() {
        String str;
        Bundle bundle;
        d90 d90Var = this.f7077u;
        Context context = this.f7076t;
        Objects.requireNonNull(d90Var);
        HashSet hashSet = new HashSet();
        synchronized (d90Var.f7264a) {
            hashSet.addAll(d90Var.f7268e);
            d90Var.f7268e.clear();
        }
        Bundle bundle2 = new Bundle();
        a90 a90Var = d90Var.f7267d;
        b90 b90Var = d90Var.f7266c;
        synchronized (b90Var) {
            str = b90Var.f6424b;
        }
        synchronized (a90Var.f6079f) {
            bundle = new Bundle();
            bundle.putString("session_id", a90Var.f6081h.J() ? "" : a90Var.f6080g);
            bundle.putLong("basets", a90Var.f6075b);
            bundle.putLong("currts", a90Var.f6074a);
            bundle.putString("seq_num", str);
            bundle.putInt("preqs", a90Var.f6076c);
            bundle.putInt("preqs_in_session", a90Var.f6077d);
            bundle.putLong("time_in_session", a90Var.f6078e);
            bundle.putInt("pclick", a90Var.f6082i);
            bundle.putInt("pimp", a90Var.f6083j);
            Context a10 = z50.a(context);
            int identifier = a10.getResources().getIdentifier("Theme.Translucent", "style", "android");
            boolean z10 = false;
            if (identifier != 0) {
                try {
                    if (identifier == a10.getPackageManager().getActivityInfo(new ComponentName(a10.getPackageName(), "com.google.android.gms.ads.AdActivity"), 0).theme) {
                        z10 = true;
                    } else {
                        g1.i("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    g1.j("Fail to fetch AdActivity theme");
                }
                bundle.putBoolean("support_transparent_background", z10);
            }
            g1.i("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            bundle.putBoolean("support_transparent_background", z10);
        }
        bundle2.putBundle("app", bundle);
        Bundle bundle3 = new Bundle();
        Iterator<c90> it = d90Var.f7269f.iterator();
        if (!it.hasNext()) {
            bundle2.putBundle("slots", bundle3);
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                arrayList.add(((u80) it2.next()).a());
            }
            bundle2.putParcelableArrayList("ads", arrayList);
            synchronized (this) {
                this.f7075s.clear();
                this.f7075s.addAll(hashSet);
            }
            return bundle2;
        }
        it.next();
        throw null;
    }

    @Override // m4.vo0
    public final synchronized void d(cn cnVar) {
        if (cnVar.f7067s != 3) {
            d90 d90Var = this.f7077u;
            HashSet<u80> hashSet = this.f7075s;
            synchronized (d90Var.f7264a) {
                d90Var.f7268e.addAll(hashSet);
            }
        }
    }
}
