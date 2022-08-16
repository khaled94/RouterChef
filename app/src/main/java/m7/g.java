package m7;

import android.content.Context;
import android.util.Base64OutputStream;
import c5.i;
import c5.l;
import i0.k;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPOutputStream;
import o7.b;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class g implements i, j {

    /* renamed from: f */
    public static final /* synthetic */ int f16383f = 0;

    /* renamed from: a */
    public final b<k> f16384a;

    /* renamed from: b */
    public final Context f16385b;

    /* renamed from: c */
    public final b<w7.g> f16386c;

    /* renamed from: d */
    public final Set<h> f16387d;

    /* renamed from: e */
    public final Executor f16388e;

    public g(final Context context, final String str, Set<h> set, b<w7.g> bVar) {
        b<k> bVar2 = new b() { // from class: m7.f
            @Override // o7.b
            public final Object get() {
                return new k(context, str);
            }
        };
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), d.f16379a);
        this.f16384a = bVar2;
        this.f16387d = set;
        this.f16388e = threadPoolExecutor;
        this.f16386c = bVar;
        this.f16385b = context;
    }

    @Override // m7.i
    public final i<String> a() {
        return k.a(this.f16385b) ^ true ? l.e("") : l.c(this.f16388e, new Callable() { // from class: m7.c
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String byteArrayOutputStream;
                g gVar = g.this;
                synchronized (gVar) {
                    k kVar = gVar.f16384a.get();
                    List<l> c10 = kVar.c();
                    kVar.b();
                    JSONArray jSONArray = new JSONArray();
                    int i10 = 0;
                    while (true) {
                        ArrayList arrayList = (ArrayList) c10;
                        if (i10 < arrayList.size()) {
                            l lVar = (l) arrayList.get(i10);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("agent", lVar.b());
                            jSONObject.put("dates", new JSONArray((Collection) lVar.a()));
                            jSONArray.put(jSONObject);
                            i10++;
                        } else {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("heartbeats", jSONArray);
                            jSONObject2.put("version", "2");
                            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                            Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                            gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                            gZIPOutputStream.close();
                            base64OutputStream.close();
                            byteArrayOutputStream = byteArrayOutputStream2.toString("UTF-8");
                        }
                    }
                }
                return byteArrayOutputStream;
            }
        });
    }

    @Override // m7.j
    public final synchronized int b() {
        boolean g10;
        long currentTimeMillis = System.currentTimeMillis();
        k kVar = this.f16384a.get();
        synchronized (kVar) {
            g10 = kVar.g(currentTimeMillis);
        }
        if (g10) {
            synchronized (kVar) {
                String d5 = kVar.d(System.currentTimeMillis());
                kVar.f16389a.edit().putString("last-used-date", d5).commit();
                kVar.f(d5);
            }
            return 3;
        }
        return 1;
    }

    public final i<Void> c() {
        if (this.f16387d.size() > 0 && !(!k.a(this.f16385b))) {
            return l.c(this.f16388e, new Callable() { // from class: m7.b
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    g gVar = g.this;
                    synchronized (gVar) {
                        gVar.f16384a.get().h(System.currentTimeMillis(), gVar.f16386c.get().a());
                    }
                    return null;
                }
            });
        }
        return l.e(null);
    }
}
