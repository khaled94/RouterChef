package t8;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import ca.o;
import ca.t;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Logger;
import s.h;
import t8.i;
import t8.r;
import t8.t;
import t8.y;

/* loaded from: classes.dex */
public final class c implements Runnable {
    public static final Object L = new Object();
    public static final ThreadLocal<StringBuilder> M = new a();
    public static final AtomicInteger N = new AtomicInteger();
    public static final b O = new b();
    public int A;
    public final y B;
    public t8.a C;
    public List<t8.a> D;
    public Bitmap E;
    public Future<?> F;
    public t.d G;
    public Exception H;
    public int I;
    public int J;
    public int K;

    /* renamed from: s */
    public final int f18743s = N.incrementAndGet();

    /* renamed from: t */
    public final t f18744t;

    /* renamed from: u */
    public final i f18745u;

    /* renamed from: v */
    public final t8.d f18746v;

    /* renamed from: w */
    public final a0 f18747w;

    /* renamed from: x */
    public final String f18748x;
    public final w y;

    /* renamed from: z */
    public final int f18749z;

    /* loaded from: classes.dex */
    public static class a extends ThreadLocal<StringBuilder> {
        @Override // java.lang.ThreadLocal
        public final StringBuilder initialValue() {
            return new StringBuilder("Picasso-");
        }
    }

    /* loaded from: classes.dex */
    public static class b extends y {
        @Override // t8.y
        public final boolean c(w wVar) {
            return true;
        }

        @Override // t8.y
        public final y.a f(w wVar, int i10) {
            throw new IllegalStateException("Unrecognized type of request: " + wVar);
        }
    }

    /* renamed from: t8.c$c */
    /* loaded from: classes.dex */
    public static class RunnableC0121c implements Runnable {

        /* renamed from: s */
        public final /* synthetic */ c0 f18750s;

        /* renamed from: t */
        public final /* synthetic */ RuntimeException f18751t;

        public RunnableC0121c(c0 c0Var, RuntimeException runtimeException) {
            this.f18750s = c0Var;
            this.f18751t = runtimeException;
        }

        @Override // java.lang.Runnable
        public final void run() {
            StringBuilder c10 = androidx.activity.result.a.c("Transformation ");
            c10.append(this.f18750s.a());
            c10.append(" crashed with exception.");
            throw new RuntimeException(c10.toString(), this.f18751t);
        }
    }

    /* loaded from: classes.dex */
    public static class d implements Runnable {

        /* renamed from: s */
        public final /* synthetic */ StringBuilder f18752s;

        public d(StringBuilder sb) {
            this.f18752s = sb;
        }

        @Override // java.lang.Runnable
        public final void run() {
            throw new NullPointerException(this.f18752s.toString());
        }
    }

    /* loaded from: classes.dex */
    public static class e implements Runnable {

        /* renamed from: s */
        public final /* synthetic */ c0 f18753s;

        public e(c0 c0Var) {
            this.f18753s = c0Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            StringBuilder c10 = androidx.activity.result.a.c("Transformation ");
            c10.append(this.f18753s.a());
            c10.append(" returned input Bitmap but recycled it.");
            throw new IllegalStateException(c10.toString());
        }
    }

    /* loaded from: classes.dex */
    public static class f implements Runnable {

        /* renamed from: s */
        public final /* synthetic */ c0 f18754s;

        public f(c0 c0Var) {
            this.f18754s = c0Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            StringBuilder c10 = androidx.activity.result.a.c("Transformation ");
            c10.append(this.f18754s.a());
            c10.append(" mutated input Bitmap but failed to recycle the original.");
            throw new IllegalStateException(c10.toString());
        }
    }

    public c(t tVar, i iVar, t8.d dVar, a0 a0Var, t8.a aVar, y yVar) {
        this.f18744t = tVar;
        this.f18745u = iVar;
        this.f18746v = dVar;
        this.f18747w = a0Var;
        this.C = aVar;
        this.f18748x = aVar.f18706i;
        w wVar = aVar.f18699b;
        this.y = wVar;
        this.K = wVar.f18847r;
        this.f18749z = aVar.f18702e;
        this.A = aVar.f18703f;
        this.B = yVar;
        this.J = yVar.e();
    }

    public static Bitmap a(List<c0> list, Bitmap bitmap) {
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            c0 c0Var = list.get(i10);
            try {
                Bitmap b10 = c0Var.b();
                if (b10 == null) {
                    StringBuilder c10 = androidx.activity.result.a.c("Transformation ");
                    c10.append(c0Var.a());
                    c10.append(" returned null after ");
                    c10.append(i10);
                    c10.append(" previous transformation(s).\n\nTransformation list:\n");
                    for (c0 c0Var2 : list) {
                        c10.append(c0Var2.a());
                        c10.append('\n');
                    }
                    t.f18797n.post(new d(c10));
                    return null;
                } else if (b10 == bitmap && bitmap.isRecycled()) {
                    t.f18797n.post(new e(c0Var));
                    return null;
                } else if (b10 != bitmap && !bitmap.isRecycled()) {
                    t.f18797n.post(new f(c0Var));
                    return null;
                } else {
                    i10++;
                    bitmap = b10;
                }
            } catch (RuntimeException e10) {
                t.f18797n.post(new RunnableC0121c(c0Var, e10));
                return null;
            }
        }
        return bitmap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Bitmap c(ca.y yVar, w wVar) {
        Logger logger = o.f2862a;
        ca.t tVar = new ca.t(yVar);
        boolean z10 = tVar.c(0L, e0.f18756b) && tVar.c(8L, e0.f18757c);
        boolean z11 = wVar.p;
        BitmapFactory.Options d5 = y.d(wVar);
        boolean z12 = d5 != null && d5.inJustDecodeBounds;
        if (!z10) {
            t.a aVar = new t.a();
            if (z12) {
                o oVar = new o(aVar);
                oVar.f18790x = false;
                long j3 = oVar.f18786t + 1024;
                if (oVar.f18788v < j3) {
                    oVar.c(j3);
                }
                long j10 = oVar.f18786t;
                BitmapFactory.decodeStream(oVar, null, d5);
                y.b(wVar.f18836f, wVar.f18837g, d5, wVar);
                oVar.b(j10);
                oVar.f18790x = true;
                aVar = oVar;
            }
            Bitmap decodeStream = BitmapFactory.decodeStream(aVar, null, d5);
            if (decodeStream == null) {
                throw new IOException("Failed to decode stream.");
            }
            return decodeStream;
        }
        tVar.f2874s.A0(tVar.f2875t);
        byte[] e02 = tVar.f2874s.e0();
        if (z12) {
            BitmapFactory.decodeByteArray(e02, 0, e02.length, d5);
            y.b(wVar.f18836f, wVar.f18837g, d5, wVar);
        }
        return BitmapFactory.decodeByteArray(e02, 0, e02.length, d5);
    }

    public static boolean f(boolean z10, int i10, int i11, int i12, int i13) {
        return !z10 || (i12 != 0 && i10 > i12) || (i13 != 0 && i11 > i13);
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap g(t8.w r26, android.graphics.Bitmap r27, int r28) {
        /*
            Method dump skipped, instructions count: 608
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t8.c.g(t8.w, android.graphics.Bitmap, int):android.graphics.Bitmap");
    }

    public static void h(w wVar) {
        Uri uri = wVar.f18833c;
        String valueOf = uri != null ? String.valueOf(uri.getPath()) : Integer.toHexString(wVar.f18834d);
        StringBuilder sb = M.get();
        sb.ensureCapacity(valueOf.length() + 8);
        sb.replace(8, sb.length(), valueOf);
        Thread.currentThread().setName(sb.toString());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List<t8.a>, java.util.ArrayList] */
    public final boolean b() {
        Future<?> future;
        if (this.C == null) {
            ?? r02 = this.D;
            return (r02 == 0 || r02.isEmpty()) && (future = this.F) != null && future.cancel(false);
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.List<t8.a>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.util.List<t8.a>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.List<t8.a>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List<t8.a>, java.util.ArrayList] */
    public final void d(t8.a aVar) {
        boolean z10;
        int i10 = 1;
        if (this.C == aVar) {
            this.C = null;
            z10 = true;
        } else {
            ?? r02 = this.D;
            z10 = r02 != 0 ? r02.remove(aVar) : false;
        }
        if (z10 && aVar.f18699b.f18847r == this.K) {
            ?? r03 = this.D;
            boolean z11 = r03 != 0 && !r03.isEmpty();
            t8.a aVar2 = this.C;
            if (aVar2 != null || z11) {
                if (aVar2 != null) {
                    i10 = aVar2.f18699b.f18847r;
                }
                if (z11) {
                    int size = this.D.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        int i12 = ((t8.a) this.D.get(i11)).f18699b.f18847r;
                        if (h.b(i12) > h.b(i10)) {
                            i10 = i12;
                        }
                    }
                }
            }
            this.K = i10;
        }
        if (this.f18744t.f18811m) {
            e0.g("Hunter", "removed", aVar.f18699b.b(), e0.e(this, "from "));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x00b7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Bitmap e() {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t8.c.e():android.graphics.Bitmap");
    }

    @Override // java.lang.Runnable
    public final void run() {
        i iVar;
        try {
            try {
                try {
                    h(this.y);
                    if (this.f18744t.f18811m) {
                        e0.f("Hunter", "executing", e0.d(this));
                    }
                    Bitmap e10 = e();
                    this.E = e10;
                    if (e10 == null) {
                        this.f18745u.c(this);
                    } else {
                        this.f18745u.b(this);
                    }
                } catch (Exception e11) {
                    this.H = e11;
                    iVar = this.f18745u;
                    iVar.c(this);
                } catch (OutOfMemoryError e12) {
                    StringWriter stringWriter = new StringWriter();
                    this.f18747w.a().a(new PrintWriter(stringWriter));
                    this.H = new RuntimeException(stringWriter.toString(), e12);
                    iVar = this.f18745u;
                    iVar.c(this);
                }
            } catch (r.b e13) {
                if (!((e13.f18795t & 4) != 0) || e13.f18794s != 504) {
                    this.H = e13;
                }
                iVar = this.f18745u;
                iVar.c(this);
            } catch (IOException e14) {
                this.H = e14;
                i.a aVar = this.f18745u.f18771h;
                aVar.sendMessageDelayed(aVar.obtainMessage(5, this), 500L);
            }
        } finally {
            Thread.currentThread().setName("Picasso-Idle");
        }
    }
}
