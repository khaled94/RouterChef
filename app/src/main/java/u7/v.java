package u7;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import c5.a;
import c5.i;
import c5.l;
import h6.d;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import m4.b10;
import m7.j;
import o7.b;
import p7.f;
import s.h;
import w7.g;
import z3.c;
import z3.s;
import z3.t;
import z3.u;
import z3.w;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a */
    public final d f19592a;

    /* renamed from: b */
    public final z f19593b;

    /* renamed from: c */
    public final c f19594c;

    /* renamed from: d */
    public final b<g> f19595d;

    /* renamed from: e */
    public final b<j> f19596e;

    /* renamed from: f */
    public final f f19597f;

    public v(d dVar, z zVar, b<g> bVar, b<j> bVar2, f fVar) {
        dVar.a();
        c cVar = new c(dVar.f5112a);
        this.f19592a = dVar;
        this.f19593b = zVar;
        this.f19594c = cVar;
        this.f19595d = bVar;
        this.f19596e = bVar2;
        this.f19597f = fVar;
    }

    public final i<String> a(i<Bundle> iVar) {
        return iVar.f(j.f19515s, new a() { // from class: u7.u
            @Override // c5.a
            public final Object d(i iVar2) {
                Objects.requireNonNull(v.this);
                Bundle bundle = (Bundle) iVar2.k(IOException.class);
                if (bundle != null) {
                    String string = bundle.getString("registration_id");
                    if (string != null || (string = bundle.getString("unregistered")) != null) {
                        return string;
                    }
                    String string2 = bundle.getString("error");
                    if ("RST".equals(string2)) {
                        throw new IOException("INSTANCE_ID_RESET");
                    }
                    if (string2 != null) {
                        throw new IOException(string2);
                    }
                    Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
                    throw new IOException("SERVICE_NOT_AVAILABLE");
                }
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
        });
    }

    public final void b(String str, String str2, Bundle bundle) {
        int i10;
        String str3;
        String str4;
        int b10;
        PackageInfo c10;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        d dVar = this.f19592a;
        dVar.a();
        bundle.putString("gmp_app_id", dVar.f5114c.f5129b);
        z zVar = this.f19593b;
        synchronized (zVar) {
            if (zVar.f19606d == 0 && (c10 = zVar.c("com.google.android.gms")) != null) {
                zVar.f19606d = c10.versionCode;
            }
            i10 = zVar.f19606d;
        }
        bundle.putString("gmsv", Integer.toString(i10));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.f19593b.a());
        z zVar2 = this.f19593b;
        synchronized (zVar2) {
            if (zVar2.f19605c == null) {
                zVar2.e();
            }
            str3 = zVar2.f19605c;
        }
        bundle.putString("app_ver_name", str3);
        d dVar2 = this.f19592a;
        dVar2.a();
        try {
            str4 = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(dVar2.f5113b.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            str4 = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", str4);
        try {
            String a10 = ((p7.j) l.a(this.f19597f.a())).a();
            if (!TextUtils.isEmpty(a10)) {
                bundle.putString("Goog-Firebase-Installations-Auth", a10);
            } else {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            }
        } catch (InterruptedException | ExecutionException e10) {
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e10);
        }
        bundle.putString("appid", (String) l.a(this.f19597f.getId()));
        bundle.putString("cliv", "fcm-23.0.6");
        j jVar = this.f19596e.get();
        g gVar = this.f19595d.get();
        if (jVar == null || gVar == null || (b10 = jVar.b()) == 1) {
            return;
        }
        bundle.putString("Firebase-Client-Log-Type", Integer.toString(h.b(b10)));
        bundle.putString("Firebase-Client", gVar.a());
    }

    public final i<Bundle> c(String str, String str2, Bundle bundle) {
        int i10;
        int i11;
        PackageInfo packageInfo;
        try {
            b(str, str2, bundle);
            c cVar = this.f19594c;
            u uVar = cVar.f20932c;
            synchronized (uVar) {
                if (uVar.f20969b == 0) {
                    try {
                        packageInfo = j4.c.a(uVar.f20968a).d("com.google.android.gms", 0);
                    } catch (PackageManager.NameNotFoundException e10) {
                        String valueOf = String.valueOf(e10);
                        StringBuilder sb = new StringBuilder(valueOf.length() + 23);
                        sb.append("Failed to find package ");
                        sb.append(valueOf);
                        Log.w("Metadata", sb.toString());
                        packageInfo = null;
                    }
                    if (packageInfo != null) {
                        uVar.f20969b = packageInfo.versionCode;
                    }
                }
                i10 = uVar.f20969b;
            }
            if (i10 < 12000000) {
                return cVar.f20932c.a() != 0 ? cVar.a(bundle).h(w.f20975s, new g1.l(cVar, bundle)) : l.d(new IOException("MISSING_INSTANCEID_SERVICE"));
            }
            t a10 = t.a(cVar.f20931b);
            synchronized (a10) {
                i11 = a10.f20967d;
                a10.f20967d = i11 + 1;
            }
            return a10.b(new s(i11, bundle)).f(w.f20975s, b10.f6324v);
        } catch (InterruptedException | ExecutionException e11) {
            return l.d(e11);
        }
    }
}
