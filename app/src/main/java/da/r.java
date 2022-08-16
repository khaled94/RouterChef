package da;

import androidx.lifecycle.h0;
import x8.d;
import z8.c;
import z8.e;

/* loaded from: classes.dex */
public final class r {

    /* loaded from: classes.dex */
    public static final class a implements Runnable {

        /* renamed from: s */
        public final /* synthetic */ d f4060s;

        /* renamed from: t */
        public final /* synthetic */ Exception f4061t;

        public a(d dVar, Exception exc) {
            this.f4060s = dVar;
            this.f4061t = exc;
        }

        @Override // java.lang.Runnable
        public final void run() {
            h0.b(this.f4060s).d(d.b.a(this.f4061t));
        }
    }

    @e(c = "retrofit2.KotlinExtensions", f = "KotlinExtensions.kt", l = {113}, m = "suspendAndThrow")
    /* loaded from: classes.dex */
    public static final class b extends c {

        /* renamed from: v */
        public /* synthetic */ Object f4062v;

        /* renamed from: w */
        public int f4063w;

        /* renamed from: x */
        public Exception f4064x;

        public b(d dVar) {
            super(dVar);
        }

        @Override // z8.a
        public final Object c(Object obj) {
            this.f4062v = obj;
            this.f4063w |= Integer.MIN_VALUE;
            return r.a(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(java.lang.Exception r4, x8.d<?> r5) {
        /*
            boolean r0 = r5 instanceof da.r.b
            if (r0 == 0) goto L13
            r0 = r5
            da.r$b r0 = (da.r.b) r0
            int r1 = r0.f4063w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4063w = r1
            goto L18
        L13:
            da.r$b r0 = new da.r$b
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f4062v
            y8.a r1 = y8.a.COROUTINE_SUSPENDED
            int r2 = r0.f4063w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            d.b.b(r5)
            v8.h r4 = v8.h.f19835a
            return r4
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            d.b.b(r5)
            r0.f4064x = r4
            r0.f4063w = r3
            o9.c r5 = k9.b0.f5640a
            x8.f r2 = r0.f21059t
            e9.f.c(r2)
            da.r$a r3 = new da.r$a
            r3.<init>(r0, r4)
            r5.m0(r2, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: da.r.a(java.lang.Exception, x8.d):java.lang.Object");
    }
}
