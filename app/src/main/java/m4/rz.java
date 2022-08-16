package m4;

import a7.f;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import n3.g1;
import org.json.JSONObject;
import p3.a;
import p3.d;
import s6.d0;
import w6.b;

/* loaded from: classes.dex */
public final /* synthetic */ class rz implements d {

    /* renamed from: s */
    public final Object f13467s;

    /* renamed from: t */
    public final Object f13468t;

    /* renamed from: u */
    public final Object f13469u;

    public /* synthetic */ rz(String str, ql qlVar) {
        e9.d dVar = e9.d.f4460v;
        if (str != null) {
            this.f13469u = dVar;
            this.f13468t = qlVar;
            this.f13467s = str;
            return;
        }
        throw new IllegalArgumentException("url must not be null.");
    }

    public /* synthetic */ rz(a20 a20Var, l10 l10Var, a aVar) {
        this.f13469u = a20Var;
        this.f13467s = l10Var;
        this.f13468t = aVar;
    }

    public /* synthetic */ rz(e00 e00Var, d00 d00Var, lz lzVar) {
        this.f13467s = e00Var;
        this.f13468t = d00Var;
        this.f13469u = lzVar;
    }

    public final w6.a a(w6.a aVar, f fVar) {
        b(aVar, "X-CRASHLYTICS-GOOGLE-APP-ID", fVar.f289a);
        b(aVar, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        b(aVar, "X-CRASHLYTICS-API-CLIENT-VERSION", "18.2.3");
        b(aVar, "Accept", "application/json");
        b(aVar, "X-CRASHLYTICS-DEVICE-MODEL", fVar.f290b);
        b(aVar, "X-CRASHLYTICS-OS-BUILD-VERSION", fVar.f291c);
        b(aVar, "X-CRASHLYTICS-OS-DISPLAY-VERSION", fVar.f292d);
        b(aVar, "X-CRASHLYTICS-INSTALLATION-ID", ((d0) fVar.f293e).c());
        return aVar;
    }

    public final void b(w6.a aVar, String str, String str2) {
        if (str2 != null) {
            aVar.c(str, str2);
        }
    }

    public final Map c(f fVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", fVar.f296h);
        hashMap.put("display_version", fVar.f295g);
        hashMap.put("source", Integer.toString(fVar.f297i));
        String str = fVar.f294f;
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("instance", str);
        }
        return hashMap;
    }

    public final JSONObject d(b bVar) {
        int i10 = bVar.f19929a;
        ((e9.d) this.f13469u).m("Settings response code was: " + i10);
        if (i10 == 200 || i10 == 201 || i10 == 202 || i10 == 203) {
            String str = bVar.f19930b;
            try {
                return new JSONObject(str);
            } catch (Exception e10) {
                StringBuilder c10 = androidx.activity.result.a.c("Failed to parse settings JSON from ");
                c10.append((String) this.f13467s);
                ((e9.d) this.f13469u).n(c10.toString(), e10);
                ((e9.d) this.f13469u).n("Settings response " + str, null);
                return null;
            }
        }
        ((e9.d) this.f13469u).e("Settings request failed; (status: " + i10 + ") from " + ((String) this.f13467s), null);
        return null;
    }

    @Override // p3.d
    public final void e(f3.a aVar) {
        try {
            String canonicalName = ((a) this.f13468t).getClass().getCanonicalName();
            int i10 = aVar.f4481a;
            String str = aVar.f4482b;
            String str2 = aVar.f4483c;
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 85 + String.valueOf(str).length() + String.valueOf(str2).length());
            sb.append(canonicalName);
            sb.append("failed to load mediation ad: ErrorCode = ");
            sb.append(i10);
            sb.append(". ErrorMessage = ");
            sb.append(str);
            sb.append(". ErrorDomain = ");
            sb.append(str2);
            g1.e(sb.toString());
            ((l10) this.f13467s).w3(aVar.a());
            ((l10) this.f13467s).g1(aVar.f4481a, aVar.f4482b);
            ((l10) this.f13467s).A(aVar.f4481a);
        } catch (RemoteException e10) {
            g1.h("", e10);
        }
    }
}
