package m4;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.fragment.app.b1;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import m0.p;
import s.b;

/* loaded from: classes.dex */
public abstract class e4<T> implements Comparable<e4<T>> {
    public boolean A;
    public p3 B;
    public ca1 C;
    public final p D;

    /* renamed from: s */
    public final o4 f7718s;

    /* renamed from: t */
    public final int f7719t;

    /* renamed from: u */
    public final String f7720u;

    /* renamed from: v */
    public final int f7721v;

    /* renamed from: w */
    public final Object f7722w;

    /* renamed from: x */
    public final i4 f7723x;
    public Integer y;

    /* renamed from: z */
    public h4 f7724z;

    public e4(int i10, String str, i4 i4Var) {
        Uri parse;
        String host;
        this.f7718s = o4.f11990c ? new o4() : null;
        this.f7722w = new Object();
        int i11 = 0;
        this.A = false;
        this.B = null;
        this.f7719t = i10;
        this.f7720u = str;
        this.f7723x = i4Var;
        this.D = new p();
        if (!TextUtils.isEmpty(str) && (parse = Uri.parse(str)) != null && (host = parse.getHost()) != null) {
            i11 = host.hashCode();
        }
        this.f7721v = i11;
    }

    public abstract j4<T> b(b4 b4Var);

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.y.intValue() - ((e4) obj).y.intValue();
    }

    public final String d() {
        String str = this.f7720u;
        if (this.f7719t != 0) {
            String num = Integer.toString(1);
            StringBuilder sb = new StringBuilder(String.valueOf(num).length() + 1 + String.valueOf(str).length());
            sb.append(num);
            sb.append('-');
            sb.append(str);
            return sb.toString();
        }
        return str;
    }

    public Map<String, String> e() {
        return Collections.emptyMap();
    }

    public final void f(String str) {
        if (o4.f11990c) {
            this.f7718s.a(str, Thread.currentThread().getId());
        }
    }

    public abstract void g(T t10);

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List<m4.g4>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.HashSet, java.util.Set<m4.e4<?>>] */
    public final void h(String str) {
        h4 h4Var = this.f7724z;
        if (h4Var != null) {
            synchronized (h4Var.f9106b) {
                h4Var.f9106b.remove(this);
            }
            synchronized (h4Var.f9113i) {
                Iterator it = h4Var.f9113i.iterator();
                while (it.hasNext()) {
                    ((g4) it.next()).zza();
                }
            }
            h4Var.b();
        }
        if (o4.f11990c) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new d4(this, str, id));
                return;
            }
            this.f7718s.a(str, id);
            this.f7718s.b(toString());
        }
    }

    public final void i() {
        synchronized (this.f7722w) {
            this.A = true;
        }
    }

    public final void j() {
        ca1 ca1Var;
        synchronized (this.f7722w) {
            ca1Var = this.C;
        }
        if (ca1Var != null) {
            ca1Var.a(this);
        }
    }

    public final void k(j4<?> j4Var) {
        ca1 ca1Var;
        List<e4> list;
        synchronized (this.f7722w) {
            ca1Var = this.C;
        }
        if (ca1Var != null) {
            p3 p3Var = j4Var.f9830b;
            if (p3Var != null) {
                if (!(p3Var.f12397e < System.currentTimeMillis())) {
                    String d5 = d();
                    synchronized (ca1Var) {
                        list = (List) ((Map) ca1Var.f6758a).remove(d5);
                    }
                    if (list == null) {
                        return;
                    }
                    if (p4.f12403a) {
                        p4.c("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(list.size()), d5);
                    }
                    for (e4 e4Var : list) {
                        ((w3) ca1Var.f6761d).d(e4Var, j4Var, null);
                    }
                    return;
                }
            }
            ca1Var.a(this);
        }
    }

    public final void l(int i10) {
        h4 h4Var = this.f7724z;
        if (h4Var != null) {
            h4Var.b();
        }
    }

    public final boolean m() {
        boolean z10;
        synchronized (this.f7722w) {
            z10 = this.A;
        }
        return z10;
    }

    public final void n() {
        synchronized (this.f7722w) {
        }
    }

    public byte[] o() {
        return null;
    }

    public final String toString() {
        String valueOf = String.valueOf(Integer.toHexString(this.f7721v));
        String concat = valueOf.length() != 0 ? "0x".concat(valueOf) : new String("0x");
        n();
        String str = this.f7720u;
        String valueOf2 = String.valueOf(this.y);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7 + String.valueOf(concat).length() + 6 + valueOf2.length());
        b1.b(sb, "[ ] ", str, " ", concat);
        return b.b(sb, " NORMAL ", valueOf2);
    }
}
