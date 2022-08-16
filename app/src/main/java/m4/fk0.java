package m4;

import android.text.TextUtils;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import n3.g1;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class fk0 implements kz1, j3, nq0, ze0, vj, ko1, tc1, v91 {

    /* renamed from: s */
    public final /* synthetic */ int f8584s;

    /* renamed from: t */
    public final Object f8585t;

    public /* synthetic */ fk0() {
        this.f8584s = 10;
        this.f8585t = new ArrayDeque();
    }

    @Override // m4.kz1
    public final void a(Object obj) {
        switch (this.f8584s) {
            case 1:
                o50 o50Var = (o50) obj;
                ((wm0) this.f8585t).f15056f.G0(true);
                return;
            default:
                ck0 ck0Var = (ck0) obj;
                synchronized (((zj1) this.f8585t)) {
                    ck0 ck0Var2 = ((zj1) this.f8585t).A;
                    if (ck0Var2 != null) {
                        ck0Var2.a();
                    }
                    zj1 zj1Var = (zj1) this.f8585t;
                    zj1Var.A = ck0Var;
                    vd0 vd0Var = ck0Var.f7004i;
                    if (vd0Var != null) {
                        vd0Var.L0(zj1Var);
                    }
                    vj1 vj1Var = ((zj1) this.f8585t).f16256x;
                    zj1 zj1Var2 = (zj1) this.f8585t;
                    vj1Var.e(new dk0(ck0Var, zj1Var2, zj1Var2.f16256x));
                    ck0Var.b();
                }
                return;
        }
    }

    @Override // m4.j3
    public final void b(MessageDigest[] messageDigestArr, long j3, int i10) {
        ByteBuffer slice;
        synchronized (((ByteBuffer) this.f8585t)) {
            int i11 = (int) j3;
            ((ByteBuffer) this.f8585t).position(i11);
            ((ByteBuffer) this.f8585t).limit(i11 + i10);
            slice = ((ByteBuffer) this.f8585t).slice();
        }
        for (MessageDigest messageDigest : messageDigestArr) {
            slice.position(0);
            messageDigest.update(slice);
        }
    }

    @Override // m4.vj
    public final void c(cl clVar) {
        clVar.p((kk) this.f8585t);
    }

    public final void d(n82 n82Var) {
        if (!n82Var.o()) {
            if (!(n82Var instanceof db2)) {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(n82Var.getClass())));
            }
            db2 db2Var = (db2) n82Var;
            d(db2Var.f7288v);
            d(db2Var.f7289w);
            return;
        }
        int binarySearch = Arrays.binarySearch(db2.f7286z, n82Var.k());
        if (binarySearch < 0) {
            binarySearch = (-(binarySearch + 1)) - 1;
        }
        int H = db2.H(binarySearch + 1);
        if (((ArrayDeque) this.f8585t).isEmpty() || ((n82) ((ArrayDeque) this.f8585t).peek()).k() >= H) {
            ((ArrayDeque) this.f8585t).push(n82Var);
            return;
        }
        int H2 = db2.H(binarySearch);
        n82 n82Var2 = (n82) ((ArrayDeque) this.f8585t).pop();
        while (!((ArrayDeque) this.f8585t).isEmpty() && ((n82) ((ArrayDeque) this.f8585t).peek()).k() < H2) {
            n82Var2 = new db2((n82) ((ArrayDeque) this.f8585t).pop(), n82Var2);
        }
        db2 db2Var2 = new db2(n82Var2, n82Var);
        while (!((ArrayDeque) this.f8585t).isEmpty()) {
            int binarySearch2 = Arrays.binarySearch(db2.f7286z, db2Var2.f7287u);
            if (binarySearch2 < 0) {
                binarySearch2 = (-(binarySearch2 + 1)) - 1;
            }
            if (((n82) ((ArrayDeque) this.f8585t).peek()).k() >= db2.H(binarySearch2 + 1)) {
                break;
            }
            db2Var2 = new db2((n82) ((ArrayDeque) this.f8585t).pop(), db2Var2);
        }
        ((ArrayDeque) this.f8585t).push(db2Var2);
    }

    public final void e(long j3, int i10) {
        t11 t11Var = new t11("interstitial");
        t11Var.f13896a = Long.valueOf(j3);
        t11Var.f13898c = "onAdFailedToLoad";
        t11Var.f13899d = Integer.valueOf(i10);
        n(t11Var);
    }

    @Override // m4.kz1
    public final void f(Throwable th) {
        ((wm0) this.f8585t).f15056f.G0(false);
    }

    public final void g(long j3) {
        t11 t11Var = new t11("interstitial");
        t11Var.f13896a = Long.valueOf(j3);
        t11Var.f13898c = "onNativeAdObjectNotAvailable";
        n(t11Var);
    }

    @Override // m4.nq0
    /* renamed from: h */
    public final Object mo21h(Object obj) {
        p51 p51Var = (p51) obj;
        int optInt = p51Var.f12407a.optInt("http_timeout_millis", 60000);
        q50 q50Var = p51Var.f12408b;
        int i10 = q50Var.f12704g;
        if (i10 != -2) {
            if (i10 != 1) {
                throw new c31(1);
            }
            List<String> list = q50Var.f12698a;
            if (list != null) {
                g1.g(TextUtils.join(", ", list));
            }
            throw new c31(2, "Error building request URL.");
        }
        HashMap hashMap = new HashMap();
        if (p51Var.f12408b.f12702e && !TextUtils.isEmpty((String) this.f8585t)) {
            hashMap.put("Cookie", (String) this.f8585t);
        }
        String str = "";
        if (p51Var.f12408b.f12701d) {
            JSONObject optJSONObject = p51Var.f12407a.optJSONObject("pii");
            if (optJSONObject != null) {
                if (!TextUtils.isEmpty(optJSONObject.optString("doritos", str))) {
                    hashMap.put("x-afma-drt-cookie", optJSONObject.optString("doritos", str));
                }
                if (!TextUtils.isEmpty(optJSONObject.optString("doritos_v2", str))) {
                    hashMap.put("x-afma-drt-v2-cookie", optJSONObject.optString("doritos_v2", str));
                }
            } else {
                g1.a("DSID signal does not exist.");
            }
        }
        q50 q50Var2 = p51Var.f12408b;
        if (q50Var2 != null && !TextUtils.isEmpty(q50Var2.f12700c)) {
            str = p51Var.f12408b.f12700c;
        }
        return new m51(p51Var.f12408b.f12703f, optInt, hashMap, str.getBytes(bu1.f6617b), "");
    }

    public final void i(long j3) {
        t11 t11Var = new t11("creation");
        t11Var.f13896a = Long.valueOf(j3);
        t11Var.f13898c = "nativeObjectCreated";
        n(t11Var);
    }

    public final void j(long j3) {
        t11 t11Var = new t11("creation");
        t11Var.f13896a = Long.valueOf(j3);
        t11Var.f13898c = "nativeObjectNotCreated";
        n(t11Var);
    }

    public final void k(long j3, int i10) {
        t11 t11Var = new t11("rewarded");
        t11Var.f13896a = Long.valueOf(j3);
        t11Var.f13898c = "onRewardedAdFailedToLoad";
        t11Var.f13899d = Integer.valueOf(i10);
        n(t11Var);
    }

    public final void l(long j3, int i10) {
        t11 t11Var = new t11("rewarded");
        t11Var.f13896a = Long.valueOf(j3);
        t11Var.f13898c = "onRewardedAdFailedToShow";
        t11Var.f13899d = Integer.valueOf(i10);
        n(t11Var);
    }

    public final void m(long j3) {
        t11 t11Var = new t11("rewarded");
        t11Var.f13896a = Long.valueOf(j3);
        t11Var.f13898c = "onNativeAdObjectNotAvailable";
        n(t11Var);
    }

    public final void n(t11 t11Var) {
        String a10 = t11.a(t11Var);
        g1.i(a10.length() != 0 ? "Dispatching AFMA event on publisher webview: ".concat(a10) : new String("Dispatching AFMA event on publisher webview: "));
        ((dy) this.f8585t).z(a10);
    }

    @Override // m4.j3, m4.ze0, m4.tc1
    /* renamed from: zza */
    public final long mo22zza() {
        return ((ByteBuffer) this.f8585t).capacity();
    }

    @Override // m4.j3, m4.ze0, m4.tc1
    /* renamed from: zza */
    public final void mo22zza() {
        switch (this.f8584s) {
            case 5:
                ((v90) this.f8585t).d();
                return;
            case 6:
            default:
                synchronized (((zj1) this.f8585t)) {
                    ((zj1) this.f8585t).A = null;
                }
                return;
            case 7:
                n(new t11("initialize"));
                return;
        }
    }

    public /* synthetic */ fk0(Object obj, int i10) {
        this.f8584s = i10;
        this.f8585t = obj;
    }

    public fk0(ByteBuffer byteBuffer) {
        this.f8584s = 2;
        this.f8585t = byteBuffer.slice();
    }

    public /* synthetic */ fk0(fg2 fg2Var) {
        this.f8584s = 11;
        this.f8585t = fg2Var;
    }

    @Override // m4.nq0
    /* renamed from: h */
    public final void mo21h(Object obj) {
        switch (this.f8584s) {
            case 4:
                ((lc1) obj).d0((cn) this.f8585t);
                return;
            default:
                gg2 gg2Var = (gg2) obj;
                return;
        }
    }
}
