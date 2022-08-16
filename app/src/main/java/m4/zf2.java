package m4;

import android.content.Context;
import androidx.preference.e;
import java.util.Objects;
import o8.a;
import p8.b;
import p8.c;
import p8.d;
import p8.f;
import p8.g;
import p8.h;
import p8.i;
import p8.j;
import p8.k;
import p8.l;
import p8.m;
import p8.n;
import p8.o;
import p8.p;
import p8.q;
import p8.r;
import p8.s;
import p8.t;
import p8.u;
import p8.v;
import p8.w;
import p8.x;

/* loaded from: classes.dex */
public final /* synthetic */ class zf2 implements v91 {

    /* renamed from: s */
    public Object f16191s;

    /* renamed from: t */
    public Object f16192t;

    /* renamed from: u */
    public Object f16193u;

    public zf2(Context context) {
        this.f16192t = context;
        this.f16191s = a(e.a(context).getString("router_model", "ZTEH168N"), e.a((Context) this.f16192t).getString("isp", "we"));
    }

    public /* synthetic */ zf2(fg2 fg2Var, nj2 nj2Var, w3 w3Var) {
        this.f16191s = fg2Var;
        this.f16192t = nj2Var;
        this.f16193u = w3Var;
    }

    public static a a(String str, String str2) {
        Objects.requireNonNull(str);
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1787926927:
                if (str.equals("DN8245V")) {
                    c10 = 0;
                    break;
                }
                break;
            case -792996329:
                if (str.equals("VMG3625_NEW")) {
                    c10 = 1;
                    break;
                }
                break;
            case -792995170:
                if (str.equals("VMG3625_OLD")) {
                    c10 = 2;
                    break;
                }
                break;
            case -730248726:
                if (str.equals("TDW8968")) {
                    c10 = 3;
                    break;
                }
                break;
            case -730218943:
                if (str.equals("TDW9960")) {
                    c10 = 4;
                    break;
                }
                break;
            case 68662199:
                if (str.equals("HG633")) {
                    c10 = 5;
                    break;
                }
                break;
            case 81916215:
                if (str.equals("VR300")) {
                    c10 = 6;
                    break;
                }
                break;
            case 81917176:
                if (str.equals("VR400")) {
                    c10 = 7;
                    break;
                }
                break;
            case 81919098:
                if (str.equals("VR600")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 1166627721:
                if (str.equals("HG8141A5")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 1166632216:
                if (str.equals("HG8145V5")) {
                    c10 = '\n';
                    break;
                }
                break;
            case 1287492694:
                if (str.equals("VMG3625")) {
                    c10 = 11;
                    break;
                }
                break;
            case 1319161454:
                if (str.equals("TotoLink_ND300")) {
                    c10 = '\f';
                    break;
                }
                break;
            case 1518418002:
                if (str.equals("ZTEH108N")) {
                    c10 = '\r';
                    break;
                }
                break;
            case 1518423768:
                if (str.equals("ZTEH168N")) {
                    c10 = 14;
                    break;
                }
                break;
            case 1518425677:
                if (str.equals("ZTEH188A")) {
                    c10 = 15;
                    break;
                }
                break;
            case 1558941071:
                if (str.equals("HG531V1")) {
                    c10 = 16;
                    break;
                }
                break;
            case 1559863632:
                if (str.equals("HG630V2")) {
                    c10 = 17;
                    break;
                }
                break;
            case 2014068348:
                if (str.equals("DG8045")) {
                    c10 = 18;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return new d();
            case 1:
            case 11:
                return new n();
            case 2:
                return new o();
            case 3:
                return new k();
            case 4:
                return new l();
            case 5:
                return new h();
            case 6:
                return new q();
            case 7:
                return new r();
            case '\b':
                return new s();
            case '\t':
                return new i();
            case '\n':
                return new j();
            case '\f':
                return new m();
            case '\r':
                return new t();
            case 14:
                return (str2.equals("etisalat") || str2.equals("orange")) ? new v() : new u();
            case 15:
                return !str2.equals("we") ? new x() : new w();
            case 16:
                return (str2.equals("vodafone") || str2.equals("etisalat") || str2.equals("orange")) ? new f() : new p8.e();
            case 17:
                return new g();
            case 18:
                return str2.equals("vodafone") ? new c() : str2.equals("etisalat") ? new b() : new p8.a();
            default:
                return new p();
        }
    }

    public final void b(String str) {
        this.f16191s = a(str, e.a((Context) this.f16192t).getString("isp", "we"));
    }

    @Override // m4.v91
    public final void h(Object obj) {
        gg2 gg2Var = (gg2) obj;
    }
}
