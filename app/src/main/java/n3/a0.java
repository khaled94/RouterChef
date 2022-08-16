package n3;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import h4.e;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.concurrent.GuardedBy;
import l3.s;
import m4.es;
import m4.jo;
import m4.tz1;
import m4.w21;
import m4.w90;
import m4.x21;
import m4.yr;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a */
    public final Object f16437a = new Object();
    @GuardedBy("lock")

    /* renamed from: b */
    public String f16438b = "";
    @GuardedBy("lock")

    /* renamed from: c */
    public String f16439c = "";
    @GuardedBy("lock")

    /* renamed from: d */
    public boolean f16440d = false;
    @GuardedBy("lock")

    /* renamed from: e */
    public boolean f16441e = false;

    /* renamed from: f */
    public String f16442f = "";

    /* renamed from: g */
    public x21 f16443g;

    public static final String j(Context context, String str, String str2) {
        Throwable e10;
        String str3;
        String str4;
        String str5;
        HashMap hashMap = new HashMap();
        hashMap.put("User-Agent", s.B.f5789c.D(context, str2));
        tz1<String> a10 = new o0(context).a(0, str, hashMap, null);
        try {
            return (String) ((w90) a10).get(((Integer) jo.f10145d.f10148c.a(es.T2)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e11) {
            e10 = e11;
            str4 = String.valueOf(str);
            str5 = "Interrupted while retrieving a response from: ";
            if (str4.length() == 0) {
                str3 = new String(str5);
                g1.h(str3, e10);
                ((w90) a10).cancel(true);
                return null;
            }
            str3 = str5.concat(str4);
            g1.h(str3, e10);
            ((w90) a10).cancel(true);
            return null;
        } catch (TimeoutException e12) {
            e10 = e12;
            str4 = String.valueOf(str);
            str5 = "Timeout while retrieving a response from: ";
            if (str4.length() == 0) {
                str3 = new String(str5);
                g1.h(str3, e10);
                ((w90) a10).cancel(true);
                return null;
            }
            str3 = str5.concat(str4);
            g1.h(str3, e10);
            ((w90) a10).cancel(true);
            return null;
        } catch (Exception e13) {
            String valueOf = String.valueOf(str);
            g1.h(valueOf.length() != 0 ? "Error retrieving a response from: ".concat(valueOf) : new String("Error retrieving a response from: "), e13);
            return null;
        }
    }

    public final void a(Context context) {
        x21 x21Var;
        if (!((Boolean) jo.f10145d.f10148c.a(es.f8109h6)).booleanValue() || (x21Var = this.f16443g) == null) {
            return;
        }
        x21Var.b(new w(this, context), w21.DEBUG_MENU);
    }

    public final void b(Context context, String str, String str2) {
        s1 s1Var = s.B.f5789c;
        s1.u(context, k(context, (String) jo.f10145d.f10148c.a(es.P2), str, str2));
    }

    public final void c(Context context, String str, String str2, String str3) {
        Uri.Builder buildUpon = k(context, (String) jo.f10145d.f10148c.a(es.S2), str3, str).buildUpon();
        buildUpon.appendQueryParameter("debugData", str2);
        s1 s1Var = s.B.f5789c;
        s1.m(context, str, buildUpon.build().toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
        if (r4 != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(boolean r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f16437a
            monitor-enter(r0)
            r3.f16441e = r4     // Catch: java.lang.Throwable -> L48
            m4.yr<java.lang.Boolean> r1 = m4.es.f8109h6     // Catch: java.lang.Throwable -> L48
            m4.jo r2 = m4.jo.f10145d     // Catch: java.lang.Throwable -> L48
            m4.ds r2 = r2.f10148c     // Catch: java.lang.Throwable -> L48
            java.lang.Object r1 = r2.a(r1)     // Catch: java.lang.Throwable -> L48
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L48
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L48
            if (r1 == 0) goto L46
            l3.s r1 = l3.s.B     // Catch: java.lang.Throwable -> L48
            m4.z80 r1 = r1.f5793g     // Catch: java.lang.Throwable -> L48
            n3.i1 r1 = r1.c()     // Catch: java.lang.Throwable -> L48
            n3.k1 r1 = (n3.k1) r1     // Catch: java.lang.Throwable -> L48
            r1.E(r4)     // Catch: java.lang.Throwable -> L48
            m4.x21 r1 = r3.f16443g     // Catch: java.lang.Throwable -> L48
            if (r1 == 0) goto L46
            boolean r2 = r1.f15206n     // Catch: java.lang.Throwable -> L48
            if (r2 != 0) goto L32
            if (r4 == 0) goto L3d
            r1.f()     // Catch: java.lang.Throwable -> L48
            goto L34
        L32:
            if (r4 == 0) goto L3d
        L34:
            boolean r4 = r1.f15204l     // Catch: java.lang.Throwable -> L48
            if (r4 == 0) goto L39
            goto L3d
        L39:
            r1.k()     // Catch: java.lang.Throwable -> L48
            goto L46
        L3d:
            boolean r4 = r1.d()     // Catch: java.lang.Throwable -> L48
            if (r4 != 0) goto L46
            r1.j()     // Catch: java.lang.Throwable -> L48
        L46:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L48
            return
        L48:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L48
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: n3.a0.d(boolean):void");
    }

    public final void e(Context context, String str, boolean z10, boolean z11) {
        if (!(context instanceof Activity)) {
            g1.i("Can not create dialog without Activity Context");
        } else {
            s1.f16555i.post(new y(context, str, z10, z11));
        }
    }

    public final boolean f(Context context, String str, String str2) {
        yr<String> yrVar = es.R2;
        jo joVar = jo.f10145d;
        String j3 = j(context, k(context, (String) joVar.f10148c.a(yrVar), str, str2).toString(), str2);
        if (TextUtils.isEmpty(j3)) {
            g1.e("Not linked for debug signals.");
            return false;
        }
        try {
            boolean equals = "1".equals(new JSONObject(j3.trim()).optString("debug_mode"));
            d(equals);
            if (((Boolean) joVar.f10148c.a(es.f8109h6)).booleanValue()) {
                i1 c10 = s.B.f5793g.c();
                if (true != equals) {
                    str = "";
                }
                ((k1) c10).D(str);
            }
            return equals;
        } catch (JSONException e10) {
            g1.k("Fail to get debug mode response json.", e10);
            return false;
        }
    }

    public final boolean g() {
        boolean z10;
        synchronized (this.f16437a) {
            z10 = this.f16441e;
        }
        return z10;
    }

    public final boolean h() {
        boolean z10;
        synchronized (this.f16437a) {
            z10 = this.f16440d;
        }
        return z10;
    }

    public final boolean i(Context context, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || !h()) {
            return false;
        }
        g1.e("Sending troubleshooting signals to the server.");
        c(context, str, str2, str3);
        return true;
    }

    public final Uri k(Context context, String str, String str2, String str3) {
        String str4;
        String str5;
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        synchronized (this.f16437a) {
            if (TextUtils.isEmpty(this.f16438b)) {
                s1 s1Var = s.B.f5789c;
                try {
                    FileInputStream openFileInput = context.openFileInput("debug_signals_id.txt");
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    e.b(openFileInput, byteArrayOutputStream, true);
                    str5 = new String(byteArrayOutputStream.toByteArray(), "UTF-8");
                } catch (IOException unused) {
                    g1.e("Error reading from internal storage.");
                    str5 = "";
                }
                this.f16438b = str5;
                if (TextUtils.isEmpty(str5)) {
                    s1 s1Var2 = s.B.f5789c;
                    String uuid = UUID.randomUUID().toString();
                    this.f16438b = uuid;
                    try {
                        FileOutputStream openFileOutput = context.openFileOutput("debug_signals_id.txt", 0);
                        openFileOutput.write(uuid.getBytes("UTF-8"));
                        openFileOutput.close();
                    } catch (Exception e10) {
                        g1.h("Error writing to file in internal storage.", e10);
                    }
                }
            }
            str4 = this.f16438b;
        }
        buildUpon.appendQueryParameter("linkedDeviceId", str4);
        buildUpon.appendQueryParameter("adSlotPath", str2);
        buildUpon.appendQueryParameter("afmaVersion", str3);
        return buildUpon.build();
    }
}
