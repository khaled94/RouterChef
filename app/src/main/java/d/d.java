package d;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import l3.s;
import m3.a;
import m3.f;
import m3.p;
import m4.ar0;
import m4.j00;
import m4.js0;
import m4.jt;
import m4.k90;
import m4.lo2;
import m4.q50;
import m4.tz1;
import m4.ym;
import n3.f0;
import n3.g1;
import n3.s1;
import n3.u0;
import org.json.JSONObject;
import s4.aa;
import s4.k9;
import y4.d1;
import y4.e1;
import y4.f1;

/* loaded from: classes.dex */
public final class d implements f0, lo2, ar0, j00, d1 {

    /* renamed from: s */
    public static final /* synthetic */ d f3671s = new d();

    /* renamed from: t */
    public static final /* synthetic */ d f3672t = new d();

    /* renamed from: u */
    public static final /* synthetic */ d f3673u = new d();

    public /* synthetic */ d() {
    }

    public /* synthetic */ d(int i10) {
    }

    public static int a(int i10) {
        switch (i10) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            default:
                return 0;
        }
    }

    public static void d(Context context) {
        boolean z10;
        Object obj = k90.f10300b;
        boolean z11 = false;
        if (jt.f10183a.e().booleanValue()) {
            try {
                if (Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) != 0) {
                    z11 = true;
                }
            } catch (Exception e10) {
                g1.k("Fail to determine debug setting.", e10);
            }
        }
        if (!z11) {
            return;
        }
        synchronized (k90.f10300b) {
            z10 = k90.f10301c;
        }
        if (z10) {
            return;
        }
        tz1<?> b10 = new u0(context).b();
        g1.i("Updating ad debug logging enablement.");
        a6.d.e(b10, "AdDebugLogUpdater.updateEnablement");
    }

    public static final void e(Context context, AdOverlayInfoParcel adOverlayInfoParcel, boolean z10) {
        if (adOverlayInfoParcel.C == 4 && adOverlayInfoParcel.f2908u == null) {
            ym ymVar = adOverlayInfoParcel.f2907t;
            if (ymVar != null) {
                ymVar.N();
            }
            js0 js0Var = adOverlayInfoParcel.Q;
            if (js0Var != null) {
                js0Var.B0();
            }
            Activity n10 = adOverlayInfoParcel.f2909v.n();
            f fVar = adOverlayInfoParcel.f2906s;
            if (fVar != null && fVar.B && n10 != null) {
                context = n10;
            }
            a aVar = s.B.f5787a;
            a.f(context, fVar, adOverlayInfoParcel.A, fVar != null ? fVar.A : null);
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.ads.AdActivity");
        intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", adOverlayInfoParcel.E.f12054v);
        intent.putExtra("shouldCallOnOverlayOpened", z10);
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", adOverlayInfoParcel);
        intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        s1 s1Var = s.B.f5789c;
        s1.n(context, intent);
    }

    @Override // m4.j00
    public Object b(JSONObject jSONObject) {
        return new q50(jSONObject);
    }

    @Override // m4.lo2
    public long c(long j3) {
        return j3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean f(byte[] bArr, int i10, int i11) {
        int i12;
        while (i10 < i11 && bArr[i10] >= 0) {
            i10++;
        }
        if (i10 < i11) {
            while (i10 < i11) {
                int i13 = i10 + 1;
                i12 = bArr[i10];
                if (i12 < 0) {
                    if (i12 >= -32) {
                        if (i12 >= -16) {
                            if (i13 < i11 - 2) {
                                int i14 = i13 + 1;
                                int i15 = bArr[i13];
                                if (i15 <= -65) {
                                    if ((((i15 + 112) + (i12 << 28)) >> 30) == 0) {
                                        int i16 = i14 + 1;
                                        if (bArr[i14] <= -65) {
                                            i13 = i16 + 1;
                                            if (bArr[i16] > -65) {
                                            }
                                        }
                                    }
                                }
                                i12 = -1;
                                break;
                            }
                            i12 = k9.a(bArr, i13, i11);
                            break;
                        } else if (i13 < i11 - 1) {
                            int i17 = i13 + 1;
                            char c10 = bArr[i13];
                            if (c10 <= -65 && ((i12 != -32 || c10 >= -96) && (i12 != -19 || c10 < -96))) {
                                i10 = i17 + 1;
                                if (bArr[i17] > -65) {
                                }
                            }
                            i12 = -1;
                            break;
                        } else {
                            i12 = k9.a(bArr, i13, i11);
                            break;
                        }
                    } else if (i13 < i11) {
                        if (i12 >= -62) {
                            i10 = i13 + 1;
                            if (bArr[i13] > -65) {
                            }
                        }
                        i12 = -1;
                        break;
                    } else {
                        break;
                    }
                }
                i10 = i13;
            }
        }
        i12 = 0;
        return i12 == 0;
    }

    @Override // m4.ar0, m4.ko1
    /* renamed from: h */
    public void mo30h(Object obj) {
        ((p) obj).J3();
    }

    @Override // y4.d1
    /* renamed from: zza */
    public Object mo14zza() {
        e1<Long> e1Var = f1.f20399b;
        return Long.valueOf(aa.f17726t.zza().m());
    }
}
