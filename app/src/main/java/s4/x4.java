package s4;

import android.content.ContentResolver;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.StrictMode;
import android.util.Log;
import c1.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import r.a;
import r.f;
import r2.d;

/* loaded from: classes.dex */
public final class x4 implements a5 {

    /* renamed from: g */
    public static final Map<Uri, x4> f18177g = new a();

    /* renamed from: h */
    public static final String[] f18178h = {"key", "value"};

    /* renamed from: a */
    public final ContentResolver f18179a;

    /* renamed from: b */
    public final Uri f18180b;

    /* renamed from: c */
    public final w4 f18181c;

    /* renamed from: e */
    public volatile Map<String, String> f18183e;

    /* renamed from: d */
    public final Object f18182d = new Object();

    /* renamed from: f */
    public final List<y4> f18184f = new ArrayList();

    public x4(ContentResolver contentResolver, Uri uri) {
        w4 w4Var = new w4(this);
        this.f18181c = w4Var;
        Objects.requireNonNull(contentResolver);
        Objects.requireNonNull(uri);
        this.f18179a = contentResolver;
        this.f18180b = uri;
        contentResolver.registerContentObserver(uri, false, w4Var);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Map<android.net.Uri, s4.x4>, r.g] */
    public static x4 a(ContentResolver contentResolver, Uri uri) {
        x4 x4Var;
        synchronized (x4.class) {
            ?? r12 = f18177g;
            x4Var = (x4) r12.getOrDefault(uri, null);
            if (x4Var == null) {
                try {
                    x4 x4Var2 = new x4(contentResolver, uri);
                    try {
                        r12.put(uri, x4Var2);
                    } catch (SecurityException unused) {
                    }
                    x4Var = x4Var2;
                } catch (SecurityException unused2) {
                }
            }
        }
        return x4Var;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.Map<android.net.Uri, s4.x4>, r.g] */
    public static synchronized void c() {
        synchronized (x4.class) {
            Iterator it = ((f.e) f18177g.values()).iterator();
            while (it.hasNext()) {
                x4 x4Var = (x4) it.next();
                x4Var.f18179a.unregisterContentObserver(x4Var.f18181c);
            }
            f18177g.clear();
        }
    }

    public final Map<String, String> b() {
        Map<String, String> map;
        Map<String, String> map2 = this.f18183e;
        if (map2 == null) {
            synchronized (this.f18182d) {
                map2 = this.f18183e;
                if (map2 == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        map = (Map) d.d(new c(this));
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                    } catch (SQLiteException | IllegalStateException | SecurityException unused) {
                        Log.e("ConfigurationContentLoader", "PhenotypeFlag unable to load ContentProvider, using default values");
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        map = null;
                    }
                    this.f18183e = map;
                    map2 = map;
                }
            }
        }
        return map2 != null ? map2 : Collections.emptyMap();
    }

    @Override // s4.a5
    public final /* bridge */ /* synthetic */ Object z(String str) {
        return b().get(str);
    }
}
