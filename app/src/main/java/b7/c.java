package b7;

import android.view.MotionEvent;
import com.google.firebase.analytics.connector.internal.AnalyticsConnectorRegistrar;
import java.util.Objects;
import n6.e;
import n9.s;
import s4.aa;
import y4.d1;
import y4.e1;
import y4.f1;
import z7.l;
import z7.m;

/* loaded from: classes.dex */
public final class c implements d, e, d1, m {

    /* renamed from: s */
    public static final /* synthetic */ c f2595s = new c();

    /* renamed from: t */
    public static final /* synthetic */ c f2596t = new c();

    public static boolean d(MotionEvent motionEvent, int i10) {
        return (motionEvent.getSource() & i10) == i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long e(java.lang.String r21, long r22, long r24, long r26) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b7.c.e(java.lang.String, long, long, long):long");
    }

    public static final String f(String str) {
        int i10 = s.f16719a;
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }

    public static final boolean g(String str, boolean z10) {
        String f10 = f(str);
        return f10 == null ? z10 : Boolean.parseBoolean(f10);
    }

    public static int h(String str, int i10, int i11, int i12, int i13) {
        if ((i13 & 4) != 0) {
            i11 = 1;
        }
        if ((i13 & 8) != 0) {
            i12 = Integer.MAX_VALUE;
        }
        return (int) e(str, i10, i11, i12);
    }

    public static void j(Object obj, Object obj2) {
        if (obj != null) {
            return;
        }
        Objects.toString(obj2);
        throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
    }

    @Override // n6.e
    public Object a(n6.c cVar) {
        return AnalyticsConnectorRegistrar.lambda$getComponents$0(cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    @Override // b7.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.StackTraceElement[] b(java.lang.StackTraceElement[] r15) {
        /*
            r14 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            int r1 = r15.length
            java.lang.StackTraceElement[] r1 = new java.lang.StackTraceElement[r1]
            r2 = 0
            r3 = 1
            r4 = r2
            r5 = r4
            r6 = r3
        Ld:
            int r7 = r15.length
            if (r4 >= r7) goto L66
            r7 = r15[r4]
            java.lang.Object r8 = r0.get(r7)
            java.lang.Integer r8 = (java.lang.Integer) r8
            if (r8 == 0) goto L54
            int r9 = r8.intValue()
            int r10 = r4 - r9
            int r11 = r4 + r10
            int r12 = r15.length
            if (r11 <= r12) goto L26
            goto L37
        L26:
            r11 = r2
        L27:
            if (r11 >= r10) goto L3c
            int r12 = r9 + r11
            r12 = r15[r12]
            int r13 = r4 + r11
            r13 = r15[r13]
            boolean r12 = r12.equals(r13)
            if (r12 != 0) goto L39
        L37:
            r9 = r2
            goto L3d
        L39:
            int r11 = r11 + 1
            goto L27
        L3c:
            r9 = r3
        L3d:
            if (r9 != 0) goto L40
            goto L54
        L40:
            int r8 = r8.intValue()
            int r8 = r4 - r8
            r9 = 10
            if (r6 >= r9) goto L50
            java.lang.System.arraycopy(r15, r4, r1, r5, r8)
            int r5 = r5 + r8
            int r6 = r6 + 1
        L50:
            int r8 = r8 + (-1)
            int r8 = r8 + r4
            goto L5c
        L54:
            r6 = r15[r4]
            r1[r5] = r6
            int r5 = r5 + 1
            r6 = r3
            r8 = r4
        L5c:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.put(r7, r4)
            int r4 = r8 + 1
            goto Ld
        L66:
            java.lang.StackTraceElement[] r0 = new java.lang.StackTraceElement[r5]
            java.lang.System.arraycopy(r1, r2, r0, r2, r5)
            int r1 = r15.length
            if (r5 >= r1) goto L6f
            return r0
        L6f:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: b7.c.b(java.lang.StackTraceElement[]):java.lang.StackTraceElement[]");
    }

    @Override // z7.m
    public Object c() {
        return new l();
    }

    @Override // y4.d1
    /* renamed from: zza */
    public Object mo14zza() {
        e1<Long> e1Var = f1.f20399b;
        return Long.valueOf(aa.f17726t.zza().n());
    }
}
