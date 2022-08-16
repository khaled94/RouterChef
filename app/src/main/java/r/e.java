package r;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Objects;

/* loaded from: classes.dex */
public class e<K, V> {

    /* renamed from: a */
    public final LinkedHashMap<K, V> f17176a;

    /* renamed from: b */
    public int f17177b;

    /* renamed from: c */
    public int f17178c;

    /* renamed from: d */
    public int f17179d;

    /* renamed from: e */
    public int f17180e;

    public e(int i10) {
        if (i10 > 0) {
            this.f17178c = i10;
            this.f17176a = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public V a(K k10) {
        return null;
    }

    public final V b(K k10) {
        V put;
        Objects.requireNonNull(k10, "key == null");
        synchronized (this) {
            V v10 = this.f17176a.get(k10);
            if (v10 != null) {
                this.f17179d++;
                return v10;
            }
            this.f17180e++;
            V a10 = a(k10);
            if (a10 == null) {
                return null;
            }
            synchronized (this) {
                put = this.f17176a.put(k10, a10);
                if (put != null) {
                    this.f17176a.put(k10, put);
                } else {
                    this.f17177b++;
                }
            }
            if (put != null) {
                return put;
            }
            d(this.f17178c);
            return a10;
        }
    }

    public final V c(K k10, V v10) {
        V put;
        if (k10 != null) {
            synchronized (this) {
                this.f17177b++;
                put = this.f17176a.put(k10, v10);
                if (put != null) {
                    this.f17177b--;
                }
            }
            d(this.f17178c);
            return put;
        }
        throw new NullPointerException("key == null || value == null");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(int r3) {
        /*
            r2 = this;
        L0:
            monitor-enter(r2)
            int r0 = r2.f17177b     // Catch: java.lang.Throwable -> L63
            if (r0 < 0) goto L44
            java.util.LinkedHashMap<K, V> r0 = r2.f17176a     // Catch: java.lang.Throwable -> L63
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L63
            if (r0 == 0) goto L11
            int r0 = r2.f17177b     // Catch: java.lang.Throwable -> L63
            if (r0 != 0) goto L44
        L11:
            int r0 = r2.f17177b     // Catch: java.lang.Throwable -> L63
            if (r0 <= r3) goto L42
            java.util.LinkedHashMap<K, V> r0 = r2.f17176a     // Catch: java.lang.Throwable -> L63
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L63
            if (r0 == 0) goto L1e
            goto L42
        L1e:
            java.util.LinkedHashMap<K, V> r0 = r2.f17176a     // Catch: java.lang.Throwable -> L63
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L63
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L63
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L63
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L63
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L63
            r0.getValue()     // Catch: java.lang.Throwable -> L63
            java.util.LinkedHashMap<K, V> r0 = r2.f17176a     // Catch: java.lang.Throwable -> L63
            r0.remove(r1)     // Catch: java.lang.Throwable -> L63
            int r0 = r2.f17177b     // Catch: java.lang.Throwable -> L63
            int r0 = r0 + (-1)
            r2.f17177b = r0     // Catch: java.lang.Throwable -> L63
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L63
            goto L0
        L42:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L63
            return
        L44:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L63
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L63
            r0.<init>()     // Catch: java.lang.Throwable -> L63
            java.lang.Class r1 = r2.getClass()     // Catch: java.lang.Throwable -> L63
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L63
            r0.append(r1)     // Catch: java.lang.Throwable -> L63
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch: java.lang.Throwable -> L63
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L63
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L63
            throw r3     // Catch: java.lang.Throwable -> L63
        L63:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L63
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: r.e.d(int):void");
    }

    public final synchronized String toString() {
        int i10;
        int i11;
        i10 = this.f17179d;
        i11 = this.f17180e + i10;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f17178c), Integer.valueOf(this.f17179d), Integer.valueOf(this.f17180e), Integer.valueOf(i11 != 0 ? (i10 * 100) / i11 : 0));
    }
}
