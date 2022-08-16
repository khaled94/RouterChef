package m4;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class jh1 implements dh1<Bundle> {

    /* renamed from: a */
    public final boolean f10066a;

    /* renamed from: b */
    public final boolean f10067b;

    /* renamed from: c */
    public final String f10068c;

    /* renamed from: d */
    public final boolean f10069d;

    /* renamed from: e */
    public final boolean f10070e;

    /* renamed from: f */
    public final boolean f10071f;

    /* renamed from: g */
    public final String f10072g;

    /* renamed from: h */
    public final ArrayList<String> f10073h;

    /* renamed from: i */
    public final String f10074i;

    /* renamed from: j */
    public final String f10075j;

    /* renamed from: k */
    public final String f10076k;

    /* renamed from: l */
    public final boolean f10077l;

    /* renamed from: m */
    public final String f10078m;

    /* renamed from: n */
    public final long f10079n;

    public jh1(boolean z10, boolean z11, String str, boolean z12, boolean z13, boolean z14, String str2, ArrayList arrayList, @Nullable String str3, @Nullable String str4, boolean z15, long j3) {
        String str5 = Build.FINGERPRINT;
        String str6 = Build.MODEL;
        this.f10066a = z10;
        this.f10067b = z11;
        this.f10068c = str;
        this.f10069d = z12;
        this.f10070e = z13;
        this.f10071f = z14;
        this.f10072g = str2;
        this.f10073h = arrayList;
        this.f10074i = str3;
        this.f10075j = str4;
        this.f10076k = str5;
        this.f10077l = z15;
        this.f10078m = str6;
        this.f10079n = j3;
    }

    @Override // m4.dh1
    public final /* bridge */ /* synthetic */ void h(Bundle bundle) {
        Bundle bundle2 = bundle;
        bundle2.putBoolean("cog", this.f10066a);
        bundle2.putBoolean("coh", this.f10067b);
        bundle2.putString("gl", this.f10068c);
        bundle2.putBoolean("simulator", this.f10069d);
        bundle2.putBoolean("is_latchsky", this.f10070e);
        bundle2.putBoolean("is_sidewinder", this.f10071f);
        bundle2.putString("hl", this.f10072g);
        if (!this.f10073h.isEmpty()) {
            bundle2.putStringArrayList("hl_list", this.f10073h);
        }
        bundle2.putString("mv", this.f10074i);
        bundle2.putString("submodel", this.f10078m);
        Bundle a10 = vm1.a(bundle2, "device");
        bundle2.putBundle("device", a10);
        a10.putString("build", this.f10076k);
        a10.putLong("remaining_data_partition_space", this.f10079n);
        Bundle a11 = vm1.a(a10, "browser");
        a10.putBundle("browser", a11);
        a11.putBoolean("is_browser_custom_tabs_capable", this.f10077l);
        if (!TextUtils.isEmpty(this.f10075j)) {
            Bundle a12 = vm1.a(a10, "play_store");
            a10.putBundle("play_store", a12);
            a12.putString("package_version", this.f10075j);
        }
    }
}
