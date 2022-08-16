package m4;

import androidx.fragment.app.a;
import androidx.fragment.app.b1;
import java.lang.Throwable;
import java.util.Objects;
import javax.annotation.CheckForNull;
import s.b;

/* loaded from: classes.dex */
public abstract class zx1<V, X extends Throwable, F, T> extends fz1<V> implements Runnable {
    @CheckForNull
    public Class<X> A;
    @CheckForNull
    public F B;
    @CheckForNull

    /* renamed from: z */
    public tz1<? extends V> f16345z;

    public zx1(tz1<? extends V> tz1Var, Class<X> cls, F f10) {
        Objects.requireNonNull(tz1Var);
        this.f16345z = tz1Var;
        this.A = cls;
        this.B = f10;
    }

    @Override // m4.my1
    @CheckForNull
    public final String h() {
        String str;
        tz1<? extends V> tz1Var = this.f16345z;
        Class<X> cls = this.A;
        F f10 = this.B;
        String h10 = super.h();
        if (tz1Var != null) {
            String obj = tz1Var.toString();
            str = a.b(new StringBuilder(obj.length() + 16), "inputFuture=[", obj, "], ");
        } else {
            str = "";
        }
        if (cls == null || f10 == null) {
            if (h10 == null) {
                return null;
            }
            return h10.length() != 0 ? str.concat(h10) : new String(str);
        }
        String obj2 = cls.toString();
        String obj3 = f10.toString();
        StringBuilder sb = new StringBuilder(obj3.length() + obj2.length() + str.length() + 29);
        b1.b(sb, str, "exceptionType=[", obj2, "], fallback=[");
        return b.b(sb, obj3, "]");
    }

    @Override // m4.my1
    public final void i() {
        k(this.f16345z);
        this.f16345z = null;
        this.A = null;
        this.B = null;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007f  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r10 = this;
            m4.tz1<? extends V> r0 = r10.f16345z
            java.lang.Class<X extends java.lang.Throwable> r1 = r10.A
            F r2 = r10.B
            r3 = 1
            r4 = 0
            if (r0 != 0) goto Lc
            r5 = r3
            goto Ld
        Lc:
            r5 = r4
        Ld:
            if (r1 != 0) goto L11
            r6 = r3
            goto L12
        L11:
            r6 = r4
        L12:
            r5 = r5 | r6
            if (r2 != 0) goto L16
            goto L17
        L16:
            r3 = r4
        L17:
            r3 = r3 | r5
            if (r3 != 0) goto La3
            java.lang.Object r3 = r10.f11358s
            boolean r3 = r3 instanceof m4.by1
            if (r3 == 0) goto L22
            goto La3
        L22:
            r3 = 0
            r10.f16345z = r3
            boolean r4 = r0 instanceof m4.i02     // Catch: java.lang.Throwable -> L39 java.util.concurrent.ExecutionException -> L3b
            if (r4 == 0) goto L31
            r4 = r0
            m4.i02 r4 = (m4.i02) r4     // Catch: java.lang.Throwable -> L39 java.util.concurrent.ExecutionException -> L3b
            java.lang.Throwable r4 = r4.a()     // Catch: java.lang.Throwable -> L39 java.util.concurrent.ExecutionException -> L3b
            goto L32
        L31:
            r4 = r3
        L32:
            if (r4 != 0) goto L78
            java.lang.Object r5 = m4.mz1.r(r0)     // Catch: java.lang.Throwable -> L39 java.util.concurrent.ExecutionException -> L3b
            goto L79
        L39:
            r4 = move-exception
            goto L78
        L3b:
            r4 = move-exception
            java.lang.Throwable r5 = r4.getCause()
            if (r5 != 0) goto L77
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.Class r6 = r0.getClass()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r7 = r6.length()
            int r8 = r4.length()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            int r7 = r7 + 35
            int r7 = r7 + r8
            r9.<init>(r7)
            java.lang.String r7 = "Future type "
            java.lang.String r8 = " threw "
            androidx.fragment.app.b1.b(r9, r7, r6, r8, r4)
            java.lang.String r4 = " without a cause"
            r9.append(r4)
            java.lang.String r4 = r9.toString()
            r5.<init>(r4)
        L77:
            r4 = r5
        L78:
            r5 = r3
        L79:
            if (r4 != 0) goto L7f
            r10.l(r5)
            return
        L7f:
            boolean r1 = r1.isInstance(r4)
            if (r1 == 0) goto La0
            java.lang.Object r0 = r10.s(r2, r4)     // Catch: java.lang.Throwable -> L91
            r10.A = r3
            r10.B = r3
            r10.t(r0)
            return
        L91:
            r0 = move-exception
            r10.m(r0)     // Catch: java.lang.Throwable -> L9a
            r10.A = r3
            r10.B = r3
            return
        L9a:
            r0 = move-exception
            r10.A = r3
            r10.B = r3
            throw r0
        La0:
            r10.n(r0)
        La3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.zx1.run():void");
    }

    public abstract T s(F f10, X x10);

    public abstract void t(T t10);
}
