package m4;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.IBinder;
import android.text.TextUtils;
import java.util.Objects;
import java.util.regex.Pattern;
import l3.s;
import n3.s1;

/* loaded from: classes.dex */
public final class op1 {

    /* renamed from: a */
    public final Context f12251a;

    /* renamed from: b */
    public long f12252b;

    /* renamed from: c */
    public boolean f12253c = false;

    /* renamed from: k */
    public int f12261k = 2;

    /* renamed from: l */
    public int f12262l = 2;

    /* renamed from: d */
    public int f12254d = 0;

    /* renamed from: e */
    public String f12255e = "";

    /* renamed from: f */
    public String f12256f = "";

    /* renamed from: g */
    public String f12257g = "";

    /* renamed from: h */
    public String f12258h = "";

    /* renamed from: i */
    public boolean f12259i = false;

    /* renamed from: j */
    public boolean f12260j = false;

    public op1(Context context) {
        this.f12251a = context;
    }

    public static op1 g(Context context, int i10, jn jnVar) {
        op1 op1Var = qp1.b() ? new op1(context) : null;
        if (op1Var == null) {
            return null;
        }
        op1Var.e();
        synchronized (op1Var) {
            op1Var.f12261k = i10;
        }
        String str = jnVar.H;
        if (!TextUtils.isEmpty(str)) {
            if (Pattern.matches((String) jo.f10145d.f10148c.a(es.O5), str)) {
                String str2 = jnVar.H;
                synchronized (op1Var) {
                    op1Var.f12258h = str2;
                }
            }
        }
        return op1Var;
    }

    public final synchronized op1 a(cn cnVar) {
        IBinder iBinder = cnVar.f7071w;
        if (iBinder == null) {
            return this;
        }
        oo0 oo0Var = (oo0) iBinder;
        String str = oo0Var.f12240u;
        if (!TextUtils.isEmpty(str)) {
            this.f12255e = str;
        }
        String str2 = oo0Var.f12239t;
        if (!TextUtils.isEmpty(str2)) {
            this.f12256f = str2;
        }
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
        r2.f12256f = r0.Y;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized m4.op1 b(m4.jm1 r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            m4.em1 r0 = r3.f10126b     // Catch: java.lang.Throwable -> L31
            java.lang.String r0 = r0.f8004b     // Catch: java.lang.Throwable -> L31
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L31
            if (r0 != 0) goto L11
            m4.em1 r0 = r3.f10126b     // Catch: java.lang.Throwable -> L31
            java.lang.String r0 = r0.f8004b     // Catch: java.lang.Throwable -> L31
            r2.f12255e = r0     // Catch: java.lang.Throwable -> L31
        L11:
            java.util.List<m4.cm1> r3 = r3.f10125a     // Catch: java.lang.Throwable -> L31
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L31
        L17:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto L2f
            java.lang.Object r0 = r3.next()     // Catch: java.lang.Throwable -> L31
            m4.cm1 r0 = (m4.cm1) r0     // Catch: java.lang.Throwable -> L31
            java.lang.String r1 = r0.Y     // Catch: java.lang.Throwable -> L31
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L31
            if (r1 != 0) goto L17
            java.lang.String r3 = r0.Y     // Catch: java.lang.Throwable -> L31
            r2.f12256f = r3     // Catch: java.lang.Throwable -> L31
        L2f:
            monitor-exit(r2)
            return r2
        L31:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.op1.b(m4.jm1):m4.op1");
    }

    public final synchronized op1 c(String str) {
        this.f12257g = str;
        return this;
    }

    public final synchronized op1 d(boolean z10) {
        this.f12253c = z10;
        return this;
    }

    public final synchronized op1 e() {
        Configuration configuration;
        s sVar = s.B;
        s1 s1Var = sVar.f5789c;
        this.f12254d = s1.b(this.f12251a);
        Resources resources = this.f12251a.getResources();
        int i10 = 2;
        if (resources != null && (configuration = resources.getConfiguration()) != null) {
            i10 = configuration.orientation == 2 ? 4 : 3;
        }
        this.f12262l = i10;
        Objects.requireNonNull(sVar.f5796j);
        this.f12252b = System.currentTimeMillis();
        this.f12260j = true;
        return this;
    }

    public final synchronized pp1 f() {
        if (this.f12259i) {
            return null;
        }
        this.f12259i = true;
        if (!this.f12260j) {
            e();
        }
        return new pp1(this);
    }
}
