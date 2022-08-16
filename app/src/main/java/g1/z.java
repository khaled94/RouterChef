package g1;

import android.content.Context;
import android.database.Cursor;
import android.os.Looper;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import k1.c;
import k1.e;

/* loaded from: classes.dex */
public abstract class z {
    @Deprecated

    /* renamed from: a */
    public volatile k1.b f4862a;

    /* renamed from: b */
    public Executor f4863b;

    /* renamed from: c */
    public k1.c f4864c;

    /* renamed from: e */
    public boolean f4866e;
    @Deprecated

    /* renamed from: f */
    public List<b> f4867f;

    /* renamed from: i */
    public g1.a f4870i;

    /* renamed from: h */
    public final ReentrantReadWriteLock f4869h = new ReentrantReadWriteLock();

    /* renamed from: j */
    public final ThreadLocal<Integer> f4871j = new ThreadLocal<>();

    /* renamed from: d */
    public final n f4865d = d();

    /* renamed from: k */
    public final Map<Class<?>, Object> f4872k = new HashMap();

    /* renamed from: g */
    public Map<Class<? extends h1.a>, h1.a> f4868g = new HashMap();

    /* loaded from: classes.dex */
    public static class a<T extends z> {

        /* renamed from: a */
        public final Class<T> f4873a;

        /* renamed from: b */
        public final String f4874b;

        /* renamed from: c */
        public final Context f4875c;

        /* renamed from: d */
        public ArrayList<b> f4876d;

        /* renamed from: e */
        public Executor f4877e;

        /* renamed from: f */
        public Executor f4878f;

        /* renamed from: g */
        public c.AbstractC0083c f4879g;

        /* renamed from: h */
        public boolean f4880h;

        /* renamed from: j */
        public boolean f4882j;

        /* renamed from: l */
        public Set<Integer> f4884l;

        /* renamed from: m */
        public String f4885m;

        /* renamed from: i */
        public boolean f4881i = true;

        /* renamed from: k */
        public final c f4883k = new c();

        public a(Context context, Class<T> cls, String str) {
            this.f4875c = context;
            this.f4873a = cls;
            this.f4874b = str;
        }

        /* JADX WARN: Type inference failed for: r3v0, types: [java.util.HashSet, java.util.Set<java.lang.Integer>] */
        /* JADX WARN: Type inference failed for: r3v1, types: [java.util.HashSet, java.util.Set<java.lang.Integer>] */
        public final a<T> a(h1.b... bVarArr) {
            if (this.f4884l == null) {
                this.f4884l = new HashSet();
            }
            for (h1.b bVar : bVarArr) {
                this.f4884l.add(Integer.valueOf(bVar.f4953a));
                this.f4884l.add(Integer.valueOf(bVar.f4954b));
            }
            this.f4883k.a(bVarArr);
            return this;
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0022, code lost:
            if (r0 != null) goto L18;
         */
        /* JADX WARN: Removed duplicated region for block: B:122:0x013d A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x002a  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0035  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0084  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00ac  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00ae A[Catch: InstantiationException -> 0x028b, IllegalAccessException -> 0x02a2, ClassNotFoundException -> 0x02b9, TryCatch #2 {ClassNotFoundException -> 0x02b9, IllegalAccessException -> 0x02a2, InstantiationException -> 0x028b, blocks: (B:39:0x00a6, B:42:0x00ae, B:43:0x00c2), top: B:119:0x00a6 }] */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00ea  */
        /* JADX WARN: Type inference failed for: r5v11, types: [java.util.Map<java.lang.Class<? extends h1.a>, h1.a>, java.util.HashMap] */
        /* JADX WARN: Type inference failed for: r8v1, types: [java.util.Map<java.lang.Class<?>, java.lang.Object>, java.util.HashMap] */
        @android.annotation.SuppressLint({"RestrictedApi"})
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final T b() {
            /*
                Method dump skipped, instructions count: 765
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: g1.z.a.b():g1.z");
        }

        public final a<T> c() {
            this.f4881i = false;
            this.f4882j = true;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b {
        public void a(k1.b bVar) {
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        public HashMap<Integer, TreeMap<Integer, h1.b>> f4886a = new HashMap<>();

        public final void a(h1.b... bVarArr) {
            for (h1.b bVar : bVarArr) {
                int i10 = bVar.f4953a;
                int i11 = bVar.f4954b;
                TreeMap<Integer, h1.b> treeMap = this.f4886a.get(Integer.valueOf(i10));
                if (treeMap == null) {
                    treeMap = new TreeMap<>();
                    this.f4886a.put(Integer.valueOf(i10), treeMap);
                }
                h1.b bVar2 = treeMap.get(Integer.valueOf(i11));
                if (bVar2 != null) {
                    Log.w("ROOM", "Overriding migration " + bVar2 + " with " + bVar);
                }
                treeMap.put(Integer.valueOf(i11), bVar);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void a();
    }

    public z() {
        Collections.synchronizedMap(new HashMap());
    }

    public final void a() {
        if (this.f4866e) {
            return;
        }
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final void b() {
        if (i() || this.f4871j.get() == null) {
            return;
        }
        throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
    }

    @Deprecated
    public final void c() {
        a();
        j();
    }

    public abstract n d();

    public abstract k1.c e(f fVar);

    public List f() {
        return Collections.emptyList();
    }

    public Set<Class<? extends h1.a>> g() {
        return Collections.emptySet();
    }

    public Map<Class<?>, List<Class<?>>> h() {
        return Collections.emptyMap();
    }

    public final boolean i() {
        return this.f4864c.h0().C();
    }

    public final void j() {
        a();
        k1.b h02 = this.f4864c.h0();
        this.f4865d.d(h02);
        if (h02.M()) {
            h02.W();
        } else {
            h02.h();
        }
    }

    public final void k() {
        this.f4864c.h0().g();
        if (!i()) {
            n nVar = this.f4865d;
            if (!nVar.f4827e.compareAndSet(false, true)) {
                return;
            }
            nVar.f4826d.f4863b.execute(nVar.f4833k);
        }
    }

    public final void l(k1.b bVar) {
        n nVar = this.f4865d;
        synchronized (nVar) {
            if (nVar.f4828f) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
            } else {
                l1.a aVar = (l1.a) bVar;
                aVar.n("PRAGMA temp_store = MEMORY;");
                aVar.n("PRAGMA recursive_triggers='ON';");
                aVar.n("CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                nVar.d(aVar);
                nVar.f4829g = aVar.t("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 ");
                nVar.f4828f = true;
            }
        }
    }

    public final boolean m() {
        g1.a aVar = this.f4870i;
        if (aVar != null) {
            return !aVar.f4765a;
        }
        k1.b bVar = this.f4862a;
        return bVar != null && bVar.isOpen();
    }

    public final Cursor n(e eVar) {
        a();
        b();
        return this.f4864c.h0().f(eVar);
    }

    @Deprecated
    public final void o() {
        this.f4864c.h0().Q();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> T p(Class<T> cls, k1.c cVar) {
        if (cls.isInstance(cVar)) {
            return cVar;
        }
        if (!(cVar instanceof g)) {
            return null;
        }
        return (T) p(cls, ((g) cVar).b());
    }
}
