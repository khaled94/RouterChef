package s6;

import android.content.Context;
import android.util.Log;
import b7.d;
import c5.i;
import c5.j;
import e.o;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import n3.h0;
import q2.h;
import r2.a;
import s6.x;
import t2.s;
import t2.u;
import t2.w;
import u6.a0;
import u6.b0;
import u6.k;
import u6.l;
import u6.t;
import x6.g;
import y6.b;
import z6.c;

/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a */
    public final w f18268a;

    /* renamed from: b */
    public final g f18269b;

    /* renamed from: c */
    public final b f18270c;

    /* renamed from: d */
    public final t6.b f18271d;

    /* renamed from: e */
    public final h0 f18272e;

    public j0(w wVar, g gVar, b bVar, t6.b bVar2, h0 h0Var) {
        this.f18268a = wVar;
        this.f18269b = gVar;
        this.f18270c = bVar;
        this.f18271d = bVar2;
        this.f18272e = h0Var;
    }

    public static String b(InputStream inputStream) {
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, Charset.forName(StandardCharsets.UTF_8.name())));
        while (true) {
            try {
                int read = bufferedReader.read();
                if (read == -1) {
                    String sb2 = sb.toString();
                    bufferedReader.close();
                    return sb2;
                }
                sb.append((char) read);
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public static j0 c(Context context, d0 d0Var, o oVar, a aVar, t6.b bVar, h0 h0Var, d dVar, c cVar) {
        File file = new File(new File(((Context) oVar.f4259t).getFilesDir(), ".com.google.firebase.crashlytics").getPath());
        w wVar = new w(context, d0Var, aVar, dVar);
        g gVar = new g(file, cVar);
        v6.d dVar2 = b.f20877b;
        w.b(context);
        return new j0(wVar, gVar, new b(((s) w.a().c(new a(b.f20878c, b.f20879d))).a("FIREBASE_CRASHLYTICS_REPORT", new q2.b("json"), b.f20880e)), bVar, h0Var);
    }

    public static List<a0.c> d(Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            Objects.requireNonNull(key, "Null key");
            String value = entry.getValue();
            Objects.requireNonNull(value, "Null value");
            arrayList.add(new u6.d(key, value));
        }
        Collections.sort(arrayList, i0.f18266s);
        return arrayList;
    }

    public final a0.e.d a(a0.e.d dVar, t6.b bVar, h0 h0Var) {
        Map unmodifiableMap;
        Map unmodifiableMap2;
        k kVar = (k) dVar;
        k.a aVar = new k.a(kVar);
        String b10 = bVar.f18675c.b();
        if (b10 != null) {
            aVar.f19367e = new t(b10);
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "No log data to include with this event.", null);
        }
        f0 f0Var = (f0) h0Var.f16480b;
        synchronized (f0Var) {
            unmodifiableMap = Collections.unmodifiableMap(new HashMap(f0Var.f18257a));
        }
        List<a0.c> d5 = d(unmodifiableMap);
        f0 f0Var2 = (f0) h0Var.f16481c;
        synchronized (f0Var2) {
            unmodifiableMap2 = Collections.unmodifiableMap(new HashMap(f0Var2.f18257a));
        }
        List<a0.c> d10 = d(unmodifiableMap2);
        if (!((ArrayList) d5).isEmpty()) {
            l.b bVar2 = (l.b) kVar.f19360c.f();
            bVar2.f19374b = new b0<>(d5);
            bVar2.f19375c = new b0<>(d10);
            aVar.f19365c = bVar2.a();
        }
        return aVar.a();
    }

    public final List<String> e() {
        List<File> c10 = g.c(this.f18269b.f20062b, null);
        Collections.sort(c10, g.f20059j);
        ArrayList arrayList = new ArrayList();
        for (File file : c10) {
            arrayList.add(file.getName());
        }
        return arrayList;
    }

    public final i<Void> f(Executor executor) {
        g gVar = this.f18269b;
        List<File> b10 = gVar.b();
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(((ArrayList) b10).size());
        Iterator it = ((ArrayList) gVar.b()).iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            try {
                arrayList.add(new b(g.f20058i.g(g.h(file)), file.getName()));
            } catch (IOException e10) {
                Log.w("FirebaseCrashlytics", "Could not load report file " + file + "; deleting", e10);
                file.delete();
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            final x xVar = (x) it2.next();
            b bVar = this.f18270c;
            Objects.requireNonNull(bVar);
            a0 a10 = xVar.a();
            final j jVar = new j();
            ((u) bVar.f20881a).a(new q2.a(a10, q2.d.HIGHEST), new h() { // from class: y6.a
                @Override // q2.h
                public final void a(Exception exc) {
                    j jVar2 = j.this;
                    x xVar2 = xVar;
                    if (exc != null) {
                        jVar2.c(exc);
                    } else {
                        jVar2.d(xVar2);
                    }
                }
            });
            arrayList2.add(jVar.f2776a.f(executor, new h0(this)));
        }
        return c5.l.f(arrayList2);
    }
}
