package m4;

import b4.b;
import c5.a;
import c5.e;
import c5.i;
import c5.l;
import java.util.Objects;
import o4.m;

/* loaded from: classes.dex */
public final class rb1 implements c7, ar0, e, v91, a {

    /* renamed from: s */
    public final /* synthetic */ int f13242s;

    /* renamed from: t */
    public Object f13243t;

    /* JADX WARN: Removed duplicated region for block: B:24:0x0047 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public rb1(android.util.JsonReader r6) {
        /*
            r5 = this;
            r0 = 4
            r5.f13242s = r0
            r5.<init>()
            r6.beginObject()
            java.lang.String r0 = ""
        Lb:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L4b
            java.lang.String r1 = r6.nextName()
            int r2 = r1.hashCode()
            r3 = -1724546052(0xffffffff993583fc, float:-9.384135E-24)
            r4 = 1
            if (r2 == r3) goto L2f
            r3 = 3059181(0x2eaded, float:4.286826E-39)
            if (r2 == r3) goto L25
            goto L39
        L25:
            java.lang.String r2 = "code"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L39
            r1 = 0
            goto L3a
        L2f:
            java.lang.String r2 = "description"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L39
            r1 = r4
            goto L3a
        L39:
            r1 = -1
        L3a:
            if (r1 == 0) goto L47
            if (r1 == r4) goto L42
            r6.skipValue()
            goto Lb
        L42:
            java.lang.String r0 = r6.nextString()
            goto Lb
        L47:
            r6.nextInt()
            goto Lb
        L4b:
            r6.endObject()
            r5.f13243t = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.rb1.<init>(android.util.JsonReader):void");
    }

    /*  JADX ERROR: Type inference failed with exception
        jadx.core.utils.exceptions.JadxOverflowException: Type update terminated with stack overflow, arg: (r1v19 ?? I:??[int, boolean, short, byte, char])
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:114)
        */
    @Override // m4.c7
    public final void b(byte[] r131, byte[] r132) {
        /*
            Method dump skipped, instructions count: 4472
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.rb1.b(byte[], byte[]):void");
    }

    @Override // c5.a
    public final Object d(i iVar) {
        Exception exc;
        m mVar = (m) this.f13243t;
        if (iVar.n() || iVar.l()) {
            return iVar;
        }
        Exception i10 = iVar.i();
        if (!(i10 instanceof b)) {
            return iVar;
        }
        int i11 = ((b) i10).f2560s.f2930t;
        if (i11 == 43001 || i11 == 43002 || i11 == 43003 || i11 == 17) {
            return mVar.f16775b.a();
        }
        if (i11 == 43000) {
            exc = new Exception("Failed to get app set ID due to an internal error. Please try again later.");
        } else if (i11 != 15) {
            return iVar;
        } else {
            exc = new Exception("The operation to get app set ID timed out. Please try again later.");
        }
        return l.d(exc);
    }

    @Override // c5.e
    public final void e(Exception exc) {
        ms1 ms1Var = (ms1) this.f13243t;
        Objects.requireNonNull(ms1Var);
        if (exc instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        ms1Var.f11289c.c(2025, -1L, exc);
    }

    @Override // m4.ar0, m4.ko1
    /* renamed from: h */
    public final void mo30h(Object obj) {
        switch (this.f13242s) {
            case 2:
                ((rh) obj).x((qh) this.f13243t);
                return;
            default:
                rx rxVar = (rx) obj;
                o62 o62Var = ((ze2) this.f13243t).f16170f;
                return;
        }
    }

    public /* synthetic */ rb1(Object obj, int i10) {
        this.f13242s = i10;
        this.f13243t = obj;
    }

    public /* synthetic */ rb1(n7 n7Var) {
        this.f13242s = 1;
        this.f13243t = n7Var;
    }
}
