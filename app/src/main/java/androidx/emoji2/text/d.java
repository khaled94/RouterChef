package androidx.emoji2.text;

import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: i */
    public static final Object f1289i = new Object();

    /* renamed from: j */
    public static volatile d f1290j;

    /* renamed from: a */
    public final ReentrantReadWriteLock f1291a;

    /* renamed from: c */
    public volatile int f1293c;

    /* renamed from: e */
    public final a f1295e;

    /* renamed from: f */
    public final g f1296f;

    /* renamed from: g */
    public final int f1297g;

    /* renamed from: h */
    public final h.a f1298h;

    /* renamed from: d */
    public final Handler f1294d = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    public final Set<e> f1292b = new r.c(0);

    /* loaded from: classes.dex */
    public static final class a extends b {

        /* renamed from: b */
        public volatile androidx.emoji2.text.h f1299b;

        /* renamed from: c */
        public volatile n f1300c;

        /* renamed from: androidx.emoji2.text.d$a$a */
        /* loaded from: classes.dex */
        public class C0013a extends h {
            public C0013a() {
                a.this = r1;
            }

            @Override // androidx.emoji2.text.d.h
            public final void a(Throwable th) {
                a.this.f1302a.f(th);
            }

            @Override // androidx.emoji2.text.d.h
            public final void b(n nVar) {
                a aVar = a.this;
                aVar.f1300c = nVar;
                aVar.f1299b = new androidx.emoji2.text.h(aVar.f1300c, new i(), aVar.f1302a.f1298h);
                aVar.f1302a.g();
            }
        }

        public a(d dVar) {
            super(dVar);
        }

        public final void a() {
            try {
                this.f1302a.f1296f.a(new C0013a());
            } catch (Throwable th) {
                this.f1302a.f(th);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        public final d f1302a;

        public b(d dVar) {
            this.f1302a = dVar;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c {

        /* renamed from: a */
        public final g f1303a;

        /* renamed from: b */
        public int f1304b = 0;

        /* renamed from: c */
        public h.a f1305c = new h.a();

        public c(g gVar) {
            this.f1303a = gVar;
        }
    }

    /* renamed from: androidx.emoji2.text.d$d */
    /* loaded from: classes.dex */
    public interface AbstractC0014d {
    }

    /* loaded from: classes.dex */
    public static abstract class e {
        public void a() {
        }

        public void b() {
        }
    }

    /* loaded from: classes.dex */
    public static class f implements Runnable {

        /* renamed from: s */
        public final List<e> f1306s;

        /* renamed from: t */
        public final Throwable f1307t;

        /* renamed from: u */
        public final int f1308u;

        public f(Collection<e> collection, int i10, Throwable th) {
            l0.g.e(collection, "initCallbacks cannot be null");
            this.f1306s = new ArrayList(collection);
            this.f1308u = i10;
            this.f1307t = th;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<androidx.emoji2.text.d$e>, java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List<androidx.emoji2.text.d$e>, java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List<androidx.emoji2.text.d$e>, java.util.ArrayList] */
        @Override // java.lang.Runnable
        public final void run() {
            int size = this.f1306s.size();
            int i10 = 0;
            if (this.f1308u != 1) {
                while (i10 < size) {
                    ((e) this.f1306s.get(i10)).a();
                    i10++;
                }
                return;
            }
            while (i10 < size) {
                ((e) this.f1306s.get(i10)).b();
                i10++;
            }
        }
    }

    /* loaded from: classes.dex */
    public interface g {
        void a(h hVar);
    }

    /* loaded from: classes.dex */
    public static abstract class h {
        public abstract void a(Throwable th);

        public abstract void b(n nVar);
    }

    /* loaded from: classes.dex */
    public static class i {
    }

    public d(c cVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f1291a = reentrantReadWriteLock;
        this.f1293c = 3;
        this.f1296f = cVar.f1303a;
        int i10 = cVar.f1304b;
        this.f1297g = i10;
        this.f1298h = cVar.f1305c;
        a aVar = new a(this);
        this.f1295e = aVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i10 == 0) {
            try {
                this.f1293c = 0;
            } catch (Throwable th) {
                this.f1291a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            aVar.a();
        }
    }

    public static d a() {
        d dVar;
        synchronized (f1289i) {
            dVar = f1290j;
            l0.g.f(dVar != null, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        }
        return dVar;
    }

    public static boolean c() {
        return f1290j != null;
    }

    public final int b() {
        this.f1291a.readLock().lock();
        try {
            return this.f1293c;
        } finally {
            this.f1291a.readLock().unlock();
        }
    }

    public final boolean d() {
        return b() == 1;
    }

    public final void e() {
        boolean z10 = true;
        if (this.f1297g != 1) {
            z10 = false;
        }
        l0.g.f(z10, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (d()) {
            return;
        }
        this.f1291a.writeLock().lock();
        try {
            if (this.f1293c == 0) {
                return;
            }
            this.f1293c = 0;
            this.f1291a.writeLock().unlock();
            a aVar = this.f1295e;
            Objects.requireNonNull(aVar);
            try {
                aVar.f1302a.f1296f.a(new a.C0013a());
            } catch (Throwable th) {
                aVar.f1302a.f(th);
            }
        } finally {
            this.f1291a.writeLock().unlock();
        }
    }

    /* JADX WARN: Finally extract failed */
    public final void f(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f1291a.writeLock().lock();
        try {
            this.f1293c = 2;
            arrayList.addAll(this.f1292b);
            this.f1292b.clear();
            this.f1291a.writeLock().unlock();
            this.f1294d.post(new f(arrayList, this.f1293c, th));
        } catch (Throwable th2) {
            this.f1291a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX WARN: Finally extract failed */
    public final void g() {
        ArrayList arrayList = new ArrayList();
        this.f1291a.writeLock().lock();
        try {
            this.f1293c = 1;
            arrayList.addAll(this.f1292b);
            this.f1292b.clear();
            this.f1291a.writeLock().unlock();
            this.f1294d.post(new f(arrayList, this.f1293c, null));
        } catch (Throwable th) {
            this.f1291a.writeLock().unlock();
            throw th;
        }
    }

    public final CharSequence h(CharSequence charSequence) {
        return i(charSequence, 0, charSequence == null ? 0 : charSequence.length());
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00e6, code lost:
        r6 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ee, code lost:
        if (r8.b(r17, r11, r0, r10.f1326d.f1351b) != false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00f0, code lost:
        if (r6 != null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00f2, code lost:
        r6 = new android.text.SpannableString(r17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00f7, code lost:
        r4 = r10.f1326d.f1351b;
        java.util.Objects.requireNonNull(r8.f1318a);
        r6.setSpan(new androidx.emoji2.text.p(r4), r11, r0, 33);
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x017b, code lost:
        return r17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0118 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009f A[Catch: all -> 0x017c, TryCatch #0 {all -> 0x017c, blocks: (B:24:0x006b, B:27:0x0070, B:29:0x0074, B:31:0x0083, B:32:0x0089, B:34:0x008e, B:36:0x0098, B:38:0x009b, B:40:0x009f, B:42:0x00ab, B:43:0x00ae, B:45:0x00bb, B:48:0x00c3, B:54:0x00da, B:60:0x00e6, B:63:0x00f2, B:64:0x00f7, B:66:0x010c, B:68:0x0113, B:69:0x0118, B:71:0x0123, B:72:0x0128, B:74:0x012c, B:76:0x0132, B:78:0x0136, B:84:0x0143, B:87:0x014f, B:88:0x0155), top: B:103:0x006b }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x016b  */
    /* JADX WARN: Type inference failed for: r6v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.CharSequence i(java.lang.CharSequence r17, int r18, int r19) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.d.i(java.lang.CharSequence, int, int):java.lang.CharSequence");
    }

    public final void j(e eVar) {
        l0.g.e(eVar, "initCallback cannot be null");
        this.f1291a.writeLock().lock();
        try {
            if (this.f1293c != 1 && this.f1293c != 2) {
                this.f1292b.add(eVar);
            }
            this.f1294d.post(new f(Arrays.asList(eVar), this.f1293c, null));
        } finally {
            this.f1291a.writeLock().unlock();
        }
    }
}
