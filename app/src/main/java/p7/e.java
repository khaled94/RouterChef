package p7;

import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Log;
import c5.j;
import c5.l;
import d4.m;
import h6.d;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import m4.b5;
import m7.i;
import org.json.JSONException;
import org.json.JSONObject;
import r7.a;
import r7.b;
import s.h;
import s7.b;
import s7.c;
import s7.f;

/* loaded from: classes.dex */
public final class e implements f {

    /* renamed from: m */
    public static final Object f16974m = new Object();

    /* renamed from: n */
    public static final a f16975n = new a();

    /* renamed from: a */
    public final d f16976a;

    /* renamed from: b */
    public final c f16977b;

    /* renamed from: c */
    public final r7.d f16978c;

    /* renamed from: d */
    public final m f16979d;

    /* renamed from: e */
    public final b f16980e;

    /* renamed from: f */
    public final k f16981f;

    /* renamed from: h */
    public final ExecutorService f16983h;

    /* renamed from: i */
    public final ThreadPoolExecutor f16984i;

    /* renamed from: j */
    public String f16985j;

    /* renamed from: g */
    public final Object f16982g = new Object();

    /* renamed from: k */
    public Set<q7.a> f16986k = new HashSet();

    /* renamed from: l */
    public final List<l> f16987l = new ArrayList();

    /* loaded from: classes.dex */
    public class a implements ThreadFactory {

        /* renamed from: a */
        public final AtomicInteger f16988a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.f16988a.getAndIncrement())));
        }
    }

    public e(d dVar, o7.b<i> bVar) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        a aVar = f16975n;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, timeUnit, linkedBlockingQueue, aVar);
        dVar.a();
        c cVar = new c(dVar.f5112a, bVar);
        r7.d dVar2 = new r7.d(dVar);
        m c10 = m.c();
        b bVar2 = new b(dVar);
        k kVar = new k();
        this.f16976a = dVar;
        this.f16977b = cVar;
        this.f16978c = dVar2;
        this.f16979d = c10;
        this.f16980e = bVar2;
        this.f16981f = kVar;
        this.f16983h = threadPoolExecutor;
        this.f16984i = new ThreadPoolExecutor(0, 1, 30L, timeUnit, new LinkedBlockingQueue(), aVar);
    }

    public static e f() {
        return (e) d.c().b(f.class);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List<p7.l>, java.util.ArrayList] */
    @Override // p7.f
    public final c5.i a() {
        h();
        j jVar = new j();
        h hVar = new h(this.f16979d, jVar);
        synchronized (this.f16982g) {
            this.f16987l.add(hVar);
        }
        c5.i iVar = jVar.f2776a;
        this.f16983h.execute(new Runnable() { // from class: p7.c

            /* renamed from: t  reason: collision with root package name */
            public final /* synthetic */ boolean f16971t = false;

            @Override // java.lang.Runnable
            public final void run() {
                e.this.b(this.f16971t);
            }
        });
        return iVar;
    }

    public final void b(final boolean z10) {
        r7.e c10;
        synchronized (f16974m) {
            d dVar = this.f16976a;
            dVar.a();
            b5 b10 = b5.b(dVar.f5112a);
            c10 = this.f16978c.c();
            if (c10.i()) {
                String i10 = i(c10);
                r7.d dVar2 = this.f16978c;
                a.C0109a c0109a = new a.C0109a((r7.a) c10);
                c0109a.f17268a = i10;
                c0109a.f17269b = 3;
                c10 = c0109a.a();
                dVar2.b(c10);
            }
            if (b10 != null) {
                b10.c();
            }
        }
        if (z10) {
            a.C0109a c0109a2 = new a.C0109a((r7.a) c10);
            c0109a2.f17270c = null;
            c10 = c0109a2.a();
        }
        l(c10);
        this.f16984i.execute(new Runnable() { // from class: p7.d
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 221
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: p7.d.run():void");
            }
        });
    }

    public final r7.e c(r7.e eVar) {
        int responseCode;
        f f10;
        b.a aVar;
        c cVar = this.f16977b;
        String d5 = d();
        r7.a aVar2 = (r7.a) eVar;
        String str = aVar2.f17261b;
        String g10 = g();
        String str2 = aVar2.f17264e;
        if (cVar.f18362c.a()) {
            URL a10 = cVar.a(String.format("projects/%s/installations/%s/authTokens:generate", g10, str));
            for (int i10 = 0; i10 <= 1; i10++) {
                TrafficStats.setThreadStatsTag(32771);
                HttpURLConnection c10 = cVar.c(a10, d5);
                try {
                    c10.setRequestMethod("POST");
                    c10.addRequestProperty("Authorization", "FIS_v2 " + str2);
                    c10.setDoOutput(true);
                    cVar.h(c10);
                    responseCode = c10.getResponseCode();
                    cVar.f18362c.b(responseCode);
                } catch (IOException | AssertionError unused) {
                } catch (Throwable th) {
                    c10.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
                if (responseCode >= 200 && responseCode < 300) {
                    f10 = cVar.f(c10);
                } else {
                    c.b(c10, null, d5, g10);
                    if (responseCode != 401 && responseCode != 404) {
                        if (responseCode == 429) {
                            throw new g("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                        }
                        if (responseCode < 500 || responseCode >= 600) {
                            Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                            aVar = (b.a) f.a();
                            aVar.f18357c = 2;
                            f10 = aVar.a();
                        } else {
                            c10.disconnect();
                            TrafficStats.clearThreadStatsTag();
                        }
                    }
                    aVar = (b.a) f.a();
                    aVar.f18357c = 3;
                    f10 = aVar.a();
                }
                c10.disconnect();
                TrafficStats.clearThreadStatsTag();
                s7.b bVar = (s7.b) f10;
                int b10 = h.b(bVar.f18354c);
                if (b10 == 0) {
                    String str3 = bVar.f18352a;
                    long j3 = bVar.f18353b;
                    long b11 = this.f16979d.b();
                    a.C0109a c0109a = new a.C0109a(aVar2);
                    c0109a.f17270c = str3;
                    c0109a.b(j3);
                    c0109a.d(b11);
                    return c0109a.a();
                } else if (b10 == 1) {
                    a.C0109a c0109a2 = new a.C0109a(aVar2);
                    c0109a2.f17274g = "BAD CONFIG";
                    c0109a2.f17269b = 5;
                    return c0109a2.a();
                } else if (b10 == 2) {
                    synchronized (this) {
                        this.f16985j = null;
                    }
                    a.C0109a c0109a3 = new a.C0109a(aVar2);
                    c0109a3.f17269b = 2;
                    return c0109a3.a();
                } else {
                    throw new g("Firebase Installations Service is unavailable. Please try again later.");
                }
            }
            throw new g("Firebase Installations Service is unavailable. Please try again later.");
        }
        throw new g("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final String d() {
        d dVar = this.f16976a;
        dVar.a();
        return dVar.f5114c.f5128a;
    }

    public final String e() {
        d dVar = this.f16976a;
        dVar.a();
        return dVar.f5114c.f5129b;
    }

    public final String g() {
        d dVar = this.f16976a;
        dVar.a();
        return dVar.f5114c.f5134g;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List<p7.l>, java.util.ArrayList] */
    @Override // p7.f
    public final c5.i<String> getId() {
        String str;
        h();
        synchronized (this) {
            str = this.f16985j;
        }
        if (str != null) {
            return l.e(str);
        }
        j jVar = new j();
        i iVar = new i(jVar);
        synchronized (this.f16982g) {
            this.f16987l.add(iVar);
        }
        c5.i iVar2 = jVar.f2776a;
        this.f16983h.execute(new b(this, 0));
        return iVar2;
    }

    public final void h() {
        m.f(e(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        m.f(g(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        m.f(d(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        String e10 = e();
        Pattern pattern = m.f16995c;
        m.b(e10.contains(":"), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        m.b(m.f16995c.matcher(d()).matches(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    public final String i(r7.e eVar) {
        String string;
        d dVar = this.f16976a;
        dVar.a();
        if (dVar.f5113b.equals("CHIME_ANDROID_SDK") || this.f16976a.h()) {
            boolean z10 = true;
            if (((r7.a) eVar).f17262c != 1) {
                z10 = false;
            }
            if (z10) {
                r7.b bVar = this.f16980e;
                synchronized (bVar.f17276a) {
                    synchronized (bVar.f17276a) {
                        string = bVar.f17276a.getString("|S|id", null);
                    }
                    if (string == null) {
                        string = bVar.a();
                    }
                }
                return TextUtils.isEmpty(string) ? this.f16981f.a() : string;
            }
        }
        return this.f16981f.a();
    }

    public final r7.e j(r7.e eVar) {
        int responseCode;
        s7.d e10;
        r7.a aVar = (r7.a) eVar;
        String str = aVar.f17261b;
        String str2 = null;
        if (str != null && str.length() == 11) {
            r7.b bVar = this.f16980e;
            synchronized (bVar.f17276a) {
                String[] strArr = r7.b.f17275c;
                int i10 = 0;
                while (true) {
                    if (i10 >= 4) {
                        break;
                    }
                    String str3 = strArr[i10];
                    String string = bVar.f17276a.getString("|T|" + bVar.f17277b + "|" + str3, null);
                    if (string == null || string.isEmpty()) {
                        i10++;
                    } else if (string.startsWith("{")) {
                        try {
                            str2 = new JSONObject(string).getString("token");
                        } catch (JSONException unused) {
                        }
                    } else {
                        str2 = string;
                    }
                }
            }
        }
        c cVar = this.f16977b;
        String d5 = d();
        String str4 = aVar.f17261b;
        String g10 = g();
        String e11 = e();
        if (cVar.f18362c.a()) {
            URL a10 = cVar.a(String.format("projects/%s/installations", g10));
            for (int i11 = 0; i11 <= 1; i11++) {
                TrafficStats.setThreadStatsTag(32769);
                HttpURLConnection c10 = cVar.c(a10, d5);
                try {
                    c10.setRequestMethod("POST");
                    c10.setDoOutput(true);
                    if (str2 != null) {
                        c10.addRequestProperty("x-goog-fis-android-iid-migration-auth", str2);
                    }
                    cVar.g(c10, str4, e11);
                    responseCode = c10.getResponseCode();
                    cVar.f18362c.b(responseCode);
                } catch (IOException | AssertionError unused2) {
                } catch (Throwable th) {
                    c10.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
                if (responseCode >= 200 && responseCode < 300) {
                    e10 = cVar.e(c10);
                    c10.disconnect();
                    TrafficStats.clearThreadStatsTag();
                } else {
                    c.b(c10, e11, d5, g10);
                    if (responseCode == 429) {
                        throw new g("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                        s7.a aVar2 = new s7.a(null, null, null, null, 2);
                        c10.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        e10 = aVar2;
                    } else {
                        c10.disconnect();
                        TrafficStats.clearThreadStatsTag();
                    }
                }
                s7.a aVar3 = (s7.a) e10;
                int b10 = h.b(aVar3.f18351e);
                if (b10 != 0) {
                    if (b10 == 1) {
                        a.C0109a c0109a = new a.C0109a(aVar);
                        c0109a.f17274g = "BAD CONFIG";
                        c0109a.f17269b = 5;
                        return c0109a.a();
                    }
                    throw new g("Firebase Installations Service is unavailable. Please try again later.");
                }
                String str5 = aVar3.f18348b;
                String str6 = aVar3.f18349c;
                long b11 = this.f16979d.b();
                String c11 = aVar3.f18350d.c();
                long d10 = aVar3.f18350d.d();
                a.C0109a c0109a2 = new a.C0109a(aVar);
                c0109a2.f17268a = str5;
                c0109a2.f17269b = 4;
                c0109a2.f17270c = c11;
                c0109a2.f17271d = str6;
                c0109a2.b(d10);
                c0109a2.d(b11);
                return c0109a2.a();
            }
            throw new g("Firebase Installations Service is unavailable. Please try again later.");
        }
        throw new g("Firebase Installations Service is unavailable. Please try again later.");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List<p7.l>, java.util.ArrayList] */
    public final void k(Exception exc) {
        synchronized (this.f16982g) {
            Iterator it = this.f16987l.iterator();
            while (it.hasNext()) {
                if (((l) it.next()).b(exc)) {
                    it.remove();
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List<p7.l>, java.util.ArrayList] */
    public final void l(r7.e eVar) {
        synchronized (this.f16982g) {
            Iterator it = this.f16987l.iterator();
            while (it.hasNext()) {
                if (((l) it.next()).a(eVar)) {
                    it.remove();
                }
            }
        }
    }
}
