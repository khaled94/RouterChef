package t8;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.squareup.picasso.PicassoProvider;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import t8.a;
import t8.i;
import t8.n;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: n */
    public static final a f18797n = new a(Looper.getMainLooper());
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: o */
    public static volatile t f18798o = null;

    /* renamed from: b */
    public final e f18800b;

    /* renamed from: c */
    public final List<y> f18801c;

    /* renamed from: d */
    public final Context f18802d;

    /* renamed from: e */
    public final i f18803e;

    /* renamed from: f */
    public final t8.d f18804f;

    /* renamed from: g */
    public final a0 f18805g;

    /* renamed from: j */
    public final ReferenceQueue<Object> f18808j;

    /* renamed from: a */
    public final c f18799a = null;

    /* renamed from: k */
    public final Bitmap.Config f18809k = null;

    /* renamed from: h */
    public final Map<Object, t8.a> f18806h = new WeakHashMap();

    /* renamed from: i */
    public final Map<ImageView, h> f18807i = new WeakHashMap();

    /* renamed from: l */
    public boolean f18810l = false;

    /* renamed from: m */
    public volatile boolean f18811m = false;

    /* loaded from: classes.dex */
    public static class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        /* JADX WARN: Type inference failed for: r6v0, types: [java.util.List<t8.a>, java.util.List, java.util.ArrayList] */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 3) {
                t8.a aVar = (t8.a) message.obj;
                if (aVar.f18698a.f18811m) {
                    e0.g("Main", "canceled", aVar.f18699b.b(), "target got garbage collected");
                }
                aVar.f18698a.a(aVar.d());
                return;
            }
            if (i10 != 8) {
                if (i10 != 13) {
                    StringBuilder c10 = androidx.activity.result.a.c("Unknown handler message received: ");
                    c10.append(message.what);
                    throw new AssertionError(c10.toString());
                }
                List list = (List) message.obj;
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    t8.a aVar2 = (t8.a) list.get(i11);
                    t tVar = aVar2.f18698a;
                    Objects.requireNonNull(tVar);
                    Bitmap e10 = t2.a.a(aVar2.f18702e) ? tVar.e(aVar2.f18706i) : null;
                    if (e10 != null) {
                        d dVar = d.MEMORY;
                        tVar.b(e10, dVar, aVar2, null);
                        if (tVar.f18811m) {
                            e0.g("Main", "completed", aVar2.f18699b.b(), "from " + dVar);
                        }
                    } else {
                        tVar.c(aVar2);
                        if (tVar.f18811m) {
                            e0.f("Main", "resumed", aVar2.f18699b.b());
                        }
                    }
                }
                return;
            }
            List list2 = (List) message.obj;
            int size2 = list2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                t8.c cVar = (t8.c) list2.get(i12);
                t tVar2 = cVar.f18744t;
                Objects.requireNonNull(tVar2);
                t8.a aVar3 = cVar.C;
                ?? r62 = cVar.D;
                boolean z10 = true;
                boolean z11 = r62 != 0 && !r62.isEmpty();
                if (aVar3 == null && !z11) {
                    z10 = false;
                }
                if (z10) {
                    Uri uri = cVar.y.f18833c;
                    Exception exc = cVar.H;
                    Bitmap bitmap = cVar.E;
                    d dVar2 = cVar.G;
                    if (aVar3 != null) {
                        tVar2.b(bitmap, dVar2, aVar3, exc);
                    }
                    if (z11) {
                        int size3 = r62.size();
                        for (int i13 = 0; i13 < size3; i13++) {
                            tVar2.b(bitmap, dVar2, (t8.a) r62.get(i13), exc);
                        }
                    }
                    c cVar2 = tVar2.f18799a;
                    if (cVar2 != null && exc != null) {
                        cVar2.a();
                    }
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b extends Thread {

        /* renamed from: s */
        public final ReferenceQueue<Object> f18812s;

        /* renamed from: t */
        public final Handler f18813t;

        /* loaded from: classes.dex */
        public class a implements Runnable {

            /* renamed from: s */
            public final /* synthetic */ Exception f18814s;

            public a(Exception exc) {
                this.f18814s = exc;
            }

            @Override // java.lang.Runnable
            public final void run() {
                throw new RuntimeException(this.f18814s);
            }
        }

        public b(ReferenceQueue<Object> referenceQueue, Handler handler) {
            this.f18812s = referenceQueue;
            this.f18813t = handler;
            setDaemon(true);
            setName("Picasso-refQueue");
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            Process.setThreadPriority(10);
            while (true) {
                try {
                    a.C0119a c0119a = (a.C0119a) this.f18812s.remove(1000L);
                    Message obtainMessage = this.f18813t.obtainMessage();
                    if (c0119a != null) {
                        obtainMessage.what = 3;
                        obtainMessage.obj = c0119a.f18710a;
                        this.f18813t.sendMessage(obtainMessage);
                    } else {
                        obtainMessage.recycle();
                    }
                } catch (InterruptedException unused) {
                    return;
                } catch (Exception e10) {
                    this.f18813t.post(new a(e10));
                    return;
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void a();
    }

    /* loaded from: classes.dex */
    public enum d {
        MEMORY(-16711936),
        DISK(-16776961),
        NETWORK(-65536);
        

        /* renamed from: s */
        public final int f18819s;

        d(int i10) {
            this.f18819s = i10;
        }
    }

    /* loaded from: classes.dex */
    public interface e {

        /* renamed from: a */
        public static final a f18820a = new a();

        /* loaded from: classes.dex */
        public static class a implements e {
        }
    }

    public t(Context context, i iVar, t8.d dVar, e eVar, a0 a0Var) {
        this.f18802d = context;
        this.f18803e = iVar;
        this.f18804f = dVar;
        this.f18800b = eVar;
        ArrayList arrayList = new ArrayList(7);
        arrayList.add(new z(context));
        arrayList.add(new f(context));
        arrayList.add(new q(context));
        arrayList.add(new g(context));
        arrayList.add(new t8.b(context));
        arrayList.add(new k(context));
        arrayList.add(new r(iVar.f18766c, a0Var));
        this.f18801c = Collections.unmodifiableList(arrayList);
        this.f18805g = a0Var;
        ReferenceQueue<Object> referenceQueue = new ReferenceQueue<>();
        this.f18808j = referenceQueue;
        new b(referenceQueue, f18797n).start();
    }

    public static t d() {
        if (f18798o == null) {
            synchronized (t.class) {
                if (f18798o == null) {
                    Context context = PicassoProvider.f3657s;
                    if (context == null) {
                        throw new IllegalStateException("context == null");
                    }
                    Context applicationContext = context.getApplicationContext();
                    s sVar = new s(applicationContext);
                    n nVar = new n(applicationContext);
                    v vVar = new v();
                    e.a aVar = e.f18820a;
                    a0 a0Var = new a0(nVar);
                    f18798o = new t(applicationContext, new i(applicationContext, vVar, f18797n, sVar, nVar, a0Var), nVar, aVar, a0Var);
                }
            }
        }
        return f18798o;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map<java.lang.Object, t8.a>, java.util.WeakHashMap] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.WeakHashMap, java.util.Map<android.widget.ImageView, t8.h>] */
    public final void a(Object obj) {
        e0.a();
        t8.a aVar = (t8.a) this.f18806h.remove(obj);
        if (aVar != null) {
            aVar.a();
            i.a aVar2 = this.f18803e.f18771h;
            aVar2.sendMessage(aVar2.obtainMessage(2, aVar));
        }
        if (obj instanceof ImageView) {
            h hVar = (h) this.f18807i.remove((ImageView) obj);
            if (hVar == null) {
                return;
            }
            Objects.requireNonNull(hVar.f18761s);
            hVar.f18763u = null;
            ImageView imageView = hVar.f18762t.get();
            if (imageView == null) {
                return;
            }
            hVar.f18762t.clear();
            imageView.removeOnAttachStateChangeListener(hVar);
            ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
            if (!viewTreeObserver.isAlive()) {
                return;
            }
            viewTreeObserver.removeOnPreDrawListener(hVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Map<java.lang.Object, t8.a>, java.util.WeakHashMap] */
    public final void b(Bitmap bitmap, d dVar, t8.a aVar, Exception exc) {
        String str;
        String str2;
        String str3;
        if (aVar.f18709l) {
            return;
        }
        if (!aVar.f18708k) {
            this.f18806h.remove(aVar.d());
        }
        if (bitmap == null) {
            aVar.c(exc);
            if (!this.f18811m) {
                return;
            }
            str3 = aVar.f18699b.b();
            str2 = exc.getMessage();
            str = "errored";
        } else if (dVar == null) {
            throw new AssertionError("LoadedFrom cannot be null.");
        } else {
            aVar.b(bitmap, dVar);
            if (!this.f18811m) {
                return;
            }
            str3 = aVar.f18699b.b();
            str2 = "from " + dVar;
            str = "completed";
        }
        e0.g("Main", str, str3, str2);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Map<java.lang.Object, t8.a>, java.util.WeakHashMap] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.Map<java.lang.Object, t8.a>, java.util.WeakHashMap] */
    public final void c(t8.a aVar) {
        Object d5 = aVar.d();
        if (d5 != null && this.f18806h.get(d5) != aVar) {
            a(d5);
            this.f18806h.put(d5, aVar);
        }
        i.a aVar2 = this.f18803e.f18771h;
        aVar2.sendMessage(aVar2.obtainMessage(1, aVar));
    }

    public final Bitmap e(String str) {
        n.a aVar = ((n) this.f18804f).f18782a.get(str);
        Bitmap bitmap = aVar != null ? aVar.f18783a : null;
        a0 a0Var = this.f18805g;
        if (bitmap != null) {
            a0Var.f18712b.sendEmptyMessage(0);
        } else {
            a0Var.f18712b.sendEmptyMessage(1);
        }
        return bitmap;
    }
}
