package m4;

import android.text.TextUtils;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class tc0 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ String f14022s;

    /* renamed from: t */
    public final /* synthetic */ String f14023t;

    /* renamed from: u */
    public final /* synthetic */ String f14024u;

    /* renamed from: v */
    public final /* synthetic */ String f14025v;

    /* renamed from: w */
    public final /* synthetic */ uc0 f14026w;

    public tc0(uc0 uc0Var, String str, String str2, String str3, String str4) {
        this.f14026w = uc0Var;
        this.f14022s = str;
        this.f14023t = str2;
        this.f14024u = str3;
        this.f14025v = str4;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.lang.Runnable
    public final void run() {
        char c10;
        String str;
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheCanceled");
        hashMap.put("src", this.f14022s);
        if (!TextUtils.isEmpty(this.f14023t)) {
            hashMap.put("cachedSrc", this.f14023t);
        }
        String str2 = this.f14024u;
        switch (str2.hashCode()) {
            case -1947652542:
                if (str2.equals("interrupted")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case -1396664534:
                if (str2.equals("badUrl")) {
                    c10 = '\b';
                    break;
                }
                c10 = 65535;
                break;
            case -1347010958:
                if (str2.equals("inProgress")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case -918817863:
                if (str2.equals("downloadTimeout")) {
                    c10 = '\t';
                    break;
                }
                c10 = 65535;
                break;
            case -659376217:
                if (str2.equals("contentLengthMissing")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case -642208130:
                if (str2.equals("playerFailed")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case -354048396:
                if (str2.equals("sizeExceeded")) {
                    c10 = 11;
                    break;
                }
                c10 = 65535;
                break;
            case -32082395:
                if (str2.equals("externalAbort")) {
                    c10 = '\n';
                    break;
                }
                c10 = 65535;
                break;
            case 3387234:
                if (str2.equals("noop")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case 96784904:
                if (str2.equals("error")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 580119100:
                if (str2.equals("expireFailed")) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            case 725497484:
                if (str2.equals("noCacheDir")) {
                    c10 = 7;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        switch (c10) {
            case 6:
            case 7:
                str = "io";
                break;
            case '\b':
            case '\t':
                str = "network";
                break;
            case '\n':
            case 11:
                str = "policy";
                break;
            default:
                str = "internal";
                break;
        }
        hashMap.put("type", str);
        hashMap.put("reason", this.f14024u);
        if (!TextUtils.isEmpty(this.f14025v)) {
            hashMap.put("message", this.f14025v);
        }
        uc0.g(this.f14026w, hashMap);
    }
}
