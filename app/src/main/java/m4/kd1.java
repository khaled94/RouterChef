package m4;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class kd1 implements dh1<Bundle> {

    /* renamed from: a */
    public final on f10362a;

    /* renamed from: b */
    public final String f10363b;

    /* renamed from: c */
    public final boolean f10364c;

    /* renamed from: d */
    public final String f10365d;

    /* renamed from: e */
    public final float f10366e;

    /* renamed from: f */
    public final int f10367f;

    /* renamed from: g */
    public final int f10368g;

    /* renamed from: h */
    public final String f10369h;

    /* renamed from: i */
    public final boolean f10370i;

    public kd1(on onVar, String str, boolean z10, String str2, float f10, int i10, int i11, String str3, boolean z11) {
        this.f10362a = onVar;
        this.f10363b = str;
        this.f10364c = z10;
        this.f10365d = str2;
        this.f10366e = f10;
        this.f10367f = i10;
        this.f10368g = i11;
        this.f10369h = str3;
        this.f10370i = z11;
    }

    @Override // m4.dh1
    public final /* bridge */ /* synthetic */ void h(Bundle bundle) {
        String str;
        Bundle bundle2 = bundle;
        vm1.f(bundle2, "smart_w", "full", this.f10362a.f12224w == -1);
        vm1.f(bundle2, "smart_h", "auto", this.f10362a.f12221t == -2);
        Boolean bool = Boolean.TRUE;
        vm1.d(bundle2, "ene", bool, this.f10362a.B);
        vm1.f(bundle2, "rafmt", "102", this.f10362a.E);
        vm1.f(bundle2, "rafmt", "103", this.f10362a.F);
        vm1.f(bundle2, "rafmt", "105", this.f10362a.G);
        vm1.d(bundle2, "inline_adaptive_slot", bool, this.f10370i);
        vm1.d(bundle2, "interscroller_slot", bool, this.f10362a.G);
        vm1.b(bundle2, "format", this.f10363b);
        vm1.f(bundle2, "fluid", "height", this.f10364c);
        vm1.f(bundle2, "sz", this.f10365d, !TextUtils.isEmpty(str));
        bundle2.putFloat("u_sd", this.f10366e);
        bundle2.putInt("sw", this.f10367f);
        bundle2.putInt("sh", this.f10368g);
        String str2 = this.f10369h;
        vm1.f(bundle2, "sc", str2, true ^ TextUtils.isEmpty(str2));
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        on[] onVarArr = this.f10362a.y;
        if (onVarArr == null) {
            Bundle bundle3 = new Bundle();
            bundle3.putInt("height", this.f10362a.f12221t);
            bundle3.putInt("width", this.f10362a.f12224w);
            bundle3.putBoolean("is_fluid_height", this.f10362a.A);
            arrayList.add(bundle3);
        } else {
            for (on onVar : onVarArr) {
                Bundle bundle4 = new Bundle();
                bundle4.putBoolean("is_fluid_height", onVar.A);
                bundle4.putInt("height", onVar.f12221t);
                bundle4.putInt("width", onVar.f12224w);
                arrayList.add(bundle4);
            }
        }
        bundle2.putParcelableArrayList("valid_ad_sizes", arrayList);
    }
}
