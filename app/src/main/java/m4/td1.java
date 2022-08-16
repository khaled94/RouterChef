package m4;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class td1 implements dh1<Bundle> {

    /* renamed from: a */
    public final un f14028a;

    /* renamed from: b */
    public final o90 f14029b;

    /* renamed from: c */
    public final boolean f14030c;

    public td1(un unVar, o90 o90Var, boolean z10) {
        this.f14028a = unVar;
        this.f14029b = o90Var;
        this.f14030c = z10;
    }

    @Override // m4.dh1
    public final void h(Bundle bundle) {
        String str;
        Bundle bundle2 = bundle;
        yr<Integer> yrVar = es.f8137l3;
        jo joVar = jo.f10145d;
        if (this.f14029b.f12053u >= ((Integer) joVar.f10148c.a(yrVar)).intValue()) {
            bundle2.putString("app_open_version", "2");
        }
        if (((Boolean) joVar.f10148c.a(es.f8145m3)).booleanValue()) {
            bundle2.putBoolean("app_switched", this.f14030c);
        }
        un unVar = this.f14028a;
        if (unVar != null) {
            int i10 = unVar.f14459s;
            if (i10 == 1) {
                str = "p";
            } else if (i10 != 2) {
                return;
            } else {
                str = "l";
            }
            bundle2.putString("avo", str);
        }
    }
}
