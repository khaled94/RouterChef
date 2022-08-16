package f3;

import android.os.RemoteException;
import androidx.annotation.RecentlyNonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m4.es;
import m4.iq;
import m4.jo;
import m4.sn;
import n3.g1;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a */
    public final iq f4514a;

    /* renamed from: b */
    public final List<f> f4515b = new ArrayList();

    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.List<f3.f>, java.util.ArrayList] */
    public l(iq iqVar) {
        this.f4514a = iqVar;
        if (((Boolean) jo.f10145d.f10148c.a(es.f8226w5)).booleanValue()) {
            try {
                List<sn> e10 = iqVar.e();
                if (e10 == null) {
                    return;
                }
                Iterator<sn> it = e10.iterator();
                while (it.hasNext()) {
                    sn next = it.next();
                    f fVar = next != null ? new f(next) : null;
                    if (fVar != null) {
                        this.f4515b.add(fVar);
                    }
                }
            } catch (RemoteException e11) {
                g1.h("Could not forward getAdapterResponseInfo to ResponseInfo.", e11);
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:2|(2:30|3)|(13:5|9|(1:11)(1:12)|28|13|(1:15)|18|(1:20)(1:21)|22|(2:25|23)|32|26|27)|8|9|(0)(0)|28|13|(0)|18|(0)(0)|22|(1:23)|32|26|27) */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002d, code lost:
        n3.g1.h("Could not forward getMediationAdapterClassName to ResponseInfo.", r2);
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0027 A[Catch: RemoteException -> 0x002c, TRY_LEAVE, TryCatch #0 {RemoteException -> 0x002c, blocks: (B:13:0x0023, B:15:0x0027), top: B:28:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004e A[LOOP:0: B:23:0x0048->B:25:0x004e, LOOP_END] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List<f3.f>, java.util.ArrayList] */
    @androidx.annotation.RecentlyNonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final org.json.JSONObject a() {
        /*
            r5 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            r1 = 0
            m4.iq r2 = r5.f4514a     // Catch: android.os.RemoteException -> Lf
            if (r2 == 0) goto L15
            java.lang.String r2 = r2.d()     // Catch: android.os.RemoteException -> Lf
            goto L16
        Lf:
            r2 = move-exception
            java.lang.String r3 = "Could not forward getResponseId to ResponseInfo."
            n3.g1.h(r3, r2)
        L15:
            r2 = r1
        L16:
            java.lang.String r3 = "null"
            java.lang.String r4 = "Response ID"
            if (r2 != 0) goto L20
            r0.put(r4, r3)
            goto L23
        L20:
            r0.put(r4, r2)
        L23:
            m4.iq r2 = r5.f4514a     // Catch: android.os.RemoteException -> L2c
            if (r2 == 0) goto L32
            java.lang.String r1 = r2.b()     // Catch: android.os.RemoteException -> L2c
            goto L32
        L2c:
            r2 = move-exception
            java.lang.String r4 = "Could not forward getMediationAdapterClassName to ResponseInfo."
            n3.g1.h(r4, r2)
        L32:
            java.lang.String r2 = "Mediation Adapter Class Name"
            if (r1 != 0) goto L3a
            r0.put(r2, r3)
            goto L3d
        L3a:
            r0.put(r2, r1)
        L3d:
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>()
            java.util.List<f3.f> r2 = r5.f4515b
            java.util.Iterator r2 = r2.iterator()
        L48:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L5c
            java.lang.Object r3 = r2.next()
            f3.f r3 = (f3.f) r3
            org.json.JSONObject r3 = r3.a()
            r1.put(r3)
            goto L48
        L5c:
            java.lang.String r2 = "Adapter Responses"
            r0.put(r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f3.l.a():org.json.JSONObject");
    }

    @RecentlyNonNull
    public final String toString() {
        try {
            return a().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
