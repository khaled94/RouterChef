package t8;

import android.graphics.Bitmap;
import android.os.Looper;
import android.os.Process;
import android.util.Log;
import ca.i;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a */
    public static final StringBuilder f18755a = new StringBuilder();

    /* renamed from: b */
    public static final i f18756b = i.h("RIFF");

    /* renamed from: c */
    public static final i f18757c = i.h("WEBP");

    /* loaded from: classes.dex */
    public static class a extends Thread {
        public a(Runnable runnable) {
            super(runnable);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            Process.setThreadPriority(10);
            super.run();
        }
    }

    /* loaded from: classes.dex */
    public static class b implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return new a(runnable);
        }
    }

    public static void a() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        throw new IllegalStateException("Method call should happen from the main thread.");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String b(t8.w r6) {
        /*
            java.lang.StringBuilder r0 = t8.e0.f18755a
            android.net.Uri r1 = r6.f18833c
            r2 = 50
            if (r1 == 0) goto L18
            java.lang.String r1 = r1.toString()
            int r3 = r1.length()
            int r3 = r3 + r2
            r0.ensureCapacity(r3)
            r0.append(r1)
            goto L20
        L18:
            r0.ensureCapacity(r2)
            int r1 = r6.f18834d
            r0.append(r1)
        L20:
            r1 = 10
            r0.append(r1)
            float r2 = r6.f18842l
            r3 = 0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            r3 = 120(0x78, float:1.68E-43)
            if (r2 == 0) goto L51
            java.lang.String r2 = "rotation:"
            r0.append(r2)
            float r2 = r6.f18842l
            r0.append(r2)
            boolean r2 = r6.f18845o
            if (r2 == 0) goto L4e
            r2 = 64
            r0.append(r2)
            float r2 = r6.f18843m
            r0.append(r2)
            r0.append(r3)
            float r2 = r6.f18844n
            r0.append(r2)
        L4e:
            r0.append(r1)
        L51:
            boolean r2 = r6.a()
            if (r2 == 0) goto L6c
            java.lang.String r2 = "resize:"
            r0.append(r2)
            int r2 = r6.f18836f
            r0.append(r2)
            r0.append(r3)
            int r2 = r6.f18837g
            r0.append(r2)
            r0.append(r1)
        L6c:
            boolean r2 = r6.f18838h
            if (r2 == 0) goto L7b
            java.lang.String r2 = "centerCrop:"
            r0.append(r2)
            int r2 = r6.f18839i
            r0.append(r2)
            goto L84
        L7b:
            boolean r2 = r6.f18840j
            if (r2 == 0) goto L87
            java.lang.String r2 = "centerInside"
            r0.append(r2)
        L84:
            r0.append(r1)
        L87:
            java.util.List<t8.c0> r2 = r6.f18835e
            r3 = 0
            if (r2 == 0) goto La8
            int r2 = r2.size()
            r4 = r3
        L91:
            if (r4 >= r2) goto La8
            java.util.List<t8.c0> r5 = r6.f18835e
            java.lang.Object r5 = r5.get(r4)
            t8.c0 r5 = (t8.c0) r5
            java.lang.String r5 = r5.a()
            r0.append(r5)
            r0.append(r1)
            int r4 = r4 + 1
            goto L91
        La8:
            java.lang.String r6 = r0.toString()
            java.lang.StringBuilder r0 = t8.e0.f18755a
            r0.setLength(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: t8.e0.b(t8.w):java.lang.String");
    }

    public static int c(Bitmap bitmap) {
        int allocationByteCount = bitmap.getAllocationByteCount();
        if (allocationByteCount >= 0) {
            return allocationByteCount;
        }
        throw new IllegalStateException("Negative size: " + bitmap);
    }

    public static String d(c cVar) {
        return e(cVar, "");
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List<t8.a>, java.util.ArrayList] */
    public static String e(c cVar, String str) {
        StringBuilder sb = new StringBuilder(str);
        t8.a aVar = cVar.C;
        if (aVar != null) {
            sb.append(aVar.f18699b.b());
        }
        ?? r42 = cVar.D;
        if (r42 != 0) {
            int size = r42.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (i10 > 0 || aVar != null) {
                    sb.append(", ");
                }
                sb.append(((t8.a) r42.get(i10)).f18699b.b());
            }
        }
        return sb.toString();
    }

    public static void f(String str, String str2, String str3) {
        g(str, str2, str3, "");
    }

    public static void g(String str, String str2, String str3, String str4) {
        Log.d("Picasso", String.format("%1$-11s %2$-12s %3$s %4$s", str, str2, str3, str4));
    }
}
