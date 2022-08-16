package y4;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import d4.m;
import java.net.URL;
import java.util.List;
import java.util.Map;
import m4.bs;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class i4 implements Runnable {

    /* renamed from: s */
    public final URL f20506s;

    /* renamed from: t */
    public final /* synthetic */ j4 f20507t;

    /* renamed from: u */
    public final bs f20508u;

    public i4(j4 j4Var, String str, URL url, bs bsVar) {
        this.f20507t = j4Var;
        m.e(str);
        this.f20506s = url;
        this.f20508u = bsVar;
    }

    public final void a(int i10, Exception exc, byte[] bArr, Map<String, List<String>> map) {
        ((w2) this.f20507t.f20505s).B().q(new Runnable(i10, exc, bArr, map) { // from class: y4.h4

            /* renamed from: t  reason: collision with root package name */
            public final /* synthetic */ int f20487t;

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ Exception f20488u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ byte[] f20489v;

            @Override // java.lang.Runnable
            public final void run() {
                List<ResolveInfo> queryIntentActivities;
                i4 i4Var = i4.this;
                int i11 = this.f20487t;
                Exception exc2 = this.f20488u;
                byte[] bArr2 = this.f20489v;
                w2 w2Var = (w2) i4Var.f20508u.f6607s;
                if (i11 != 200 && i11 != 204) {
                    if (i11 == 304) {
                        i11 = 304;
                    }
                    w2Var.C().A.c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i11), exc2);
                }
                if (exc2 == null) {
                    w2Var.s().I.a(true);
                    if (bArr2 != null && bArr2.length != 0) {
                        try {
                            JSONObject jSONObject = new JSONObject(new String(bArr2));
                            String optString = jSONObject.optString("deeplink", "");
                            String optString2 = jSONObject.optString("gclid", "");
                            double optDouble = jSONObject.optDouble("timestamp", 0.0d);
                            if (TextUtils.isEmpty(optString)) {
                                w2Var.C().E.a("Deferred Deep Link is empty.");
                            } else {
                                h6 z10 = w2Var.z();
                                k3 k3Var = z10.f20505s;
                                if (!TextUtils.isEmpty(optString) && (queryIntentActivities = ((w2) z10.f20505s).f20786s.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(optString)), 0)) != null && !queryIntentActivities.isEmpty()) {
                                    Bundle bundle = new Bundle();
                                    bundle.putString("gclid", optString2);
                                    bundle.putString("_cis", "ddp");
                                    w2Var.H.n("auto", "_cmp", bundle);
                                    h6 z11 = w2Var.z();
                                    if (!TextUtils.isEmpty(optString)) {
                                        try {
                                            SharedPreferences.Editor edit = ((w2) z11.f20505s).f20786s.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                                            edit.putString("deeplink", optString);
                                            edit.putLong("timestamp", Double.doubleToRawLongBits(optDouble));
                                            if (edit.commit()) {
                                                ((w2) z11.f20505s).f20786s.sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
                                            }
                                        } catch (RuntimeException e10) {
                                            ((w2) z11.f20505s).C().f20710x.b("Failed to persist Deferred Deep Link. exception", e10);
                                        }
                                    }
                                }
                                w2Var.C().A.c("Deferred Deep Link validation failed. gclid, deep link", optString2, optString);
                            }
                            return;
                        } catch (JSONException e11) {
                            w2Var.C().f20710x.b("Failed to parse the Deferred Deep Link response. exception", e11);
                            return;
                        }
                    }
                    w2Var.C().E.a("Deferred Deep Link response empty.");
                    return;
                }
                w2Var.C().A.c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i11), exc2);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0071  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r10 = this;
            y4.j4 r0 = r10.f20507t
            r0.f()
            r0 = 0
            r1 = 0
            y4.j4 r2 = r10.f20507t     // Catch: java.lang.Throwable -> L5c java.io.IOException -> L6a
            java.net.URL r3 = r10.f20506s     // Catch: java.lang.Throwable -> L5c java.io.IOException -> L6a
            java.net.HttpURLConnection r2 = r2.n(r3)     // Catch: java.lang.Throwable -> L5c java.io.IOException -> L6a
            int r3 = r2.getResponseCode()     // Catch: java.lang.Throwable -> L50 java.io.IOException -> L56
            java.util.Map r4 = r2.getHeaderFields()     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L4d
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L3e
            r5.<init>()     // Catch: java.lang.Throwable -> L3e
            java.io.InputStream r6 = r2.getInputStream()     // Catch: java.lang.Throwable -> L3e
            r7 = 1024(0x400, float:1.435E-42)
            byte[] r7 = new byte[r7]     // Catch: java.lang.Throwable -> L3c
        L24:
            int r8 = r6.read(r7)     // Catch: java.lang.Throwable -> L3c
            if (r8 <= 0) goto L2e
            r5.write(r7, r0, r8)     // Catch: java.lang.Throwable -> L3c
            goto L24
        L2e:
            byte[] r0 = r5.toByteArray()     // Catch: java.lang.Throwable -> L3c
            r6.close()     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L48
            r2.disconnect()
            r10.a(r3, r1, r0, r4)
            return
        L3c:
            r0 = move-exception
            goto L40
        L3e:
            r0 = move-exception
            r6 = r1
        L40:
            if (r6 == 0) goto L45
            r6.close()     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L48
        L45:
            throw r0     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L48
        L46:
            r0 = move-exception
            goto L61
        L48:
            r0 = move-exception
            goto L6f
        L4a:
            r0 = move-exception
            r4 = r1
            goto L61
        L4d:
            r0 = move-exception
            r4 = r1
            goto L6f
        L50:
            r3 = move-exception
            r4 = r1
            r9 = r3
            r3 = r0
            r0 = r9
            goto L61
        L56:
            r3 = move-exception
            r4 = r1
            r9 = r3
            r3 = r0
            r0 = r9
            goto L6f
        L5c:
            r2 = move-exception
            r3 = r0
            r4 = r1
            r0 = r2
            r2 = r4
        L61:
            if (r2 == 0) goto L66
            r2.disconnect()
        L66:
            r10.a(r3, r1, r1, r4)
            throw r0
        L6a:
            r2 = move-exception
            r3 = r0
            r4 = r1
            r0 = r2
            r2 = r4
        L6f:
            if (r2 == 0) goto L74
            r2.disconnect()
        L74:
            r10.a(r3, r0, r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y4.i4.run():void");
    }
}
