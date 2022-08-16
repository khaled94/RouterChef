package m4;

import android.content.Context;
import android.net.Uri;
import h4.e;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class fd0 extends xo0 {

    /* renamed from: e */
    public final Context f8411e;

    /* renamed from: f */
    public final kq0 f8412f;

    /* renamed from: g */
    public final String f8413g;

    /* renamed from: h */
    public final int f8414h;

    /* renamed from: j */
    public InputStream f8416j;

    /* renamed from: k */
    public boolean f8417k;

    /* renamed from: l */
    public Uri f8418l;

    /* renamed from: m */
    public volatile kj f8419m;

    /* renamed from: u */
    public final jd0 f8426u;

    /* renamed from: n */
    public boolean f8420n = false;

    /* renamed from: o */
    public boolean f8421o = false;
    public boolean p = false;

    /* renamed from: q */
    public boolean f8422q = false;

    /* renamed from: r */
    public long f8423r = 0;

    /* renamed from: t */
    public final AtomicLong f8425t = new AtomicLong(-1);

    /* renamed from: s */
    public tz1<Long> f8424s = null;

    /* renamed from: i */
    public final boolean f8415i = ((Boolean) jo.f10145d.f10148c.a(es.f8120j1)).booleanValue();

    public fd0(Context context, kq0 kq0Var, String str, int i10, i01 i01Var, jd0 jd0Var) {
        super(false);
        this.f8411e = context;
        this.f8412f = kq0Var;
        this.f8426u = jd0Var;
        this.f8413g = str;
        this.f8414h = i10;
        f(i01Var);
    }

    @Override // m4.jp0
    public final int d(byte[] bArr, int i10, int i11) {
        if (this.f8417k) {
            InputStream inputStream = this.f8416j;
            int read = inputStream != null ? inputStream.read(bArr, i10, i11) : this.f8412f.d(bArr, i10, i11);
            if (!this.f8415i || this.f8416j != null) {
                p(read);
            }
            return read;
        }
        throw new IOException("Attempt to read closed GcacheDataSource.");
    }

    @Override // m4.kq0
    public final Uri h() {
        return this.f8418l;
    }

    @Override // m4.kq0
    public final void i() {
        if (this.f8417k) {
            boolean z10 = false;
            this.f8417k = false;
            this.f8418l = null;
            if (!this.f8415i || this.f8416j != null) {
                z10 = true;
            }
            InputStream inputStream = this.f8416j;
            if (inputStream != null) {
                e.a(inputStream);
                this.f8416j = null;
            } else {
                this.f8412f.i();
            }
            if (!z10) {
                return;
            }
            q();
            return;
        }
        throw new IOException("Attempt to close an already closed GcacheDataSource.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01ef  */
    /* JADX WARN: Type inference failed for: r5v20, types: [long] */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r9v2, types: [m4.w90] */
    @Override // m4.kq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long k(m4.gs0 r17) {
        /*
            Method dump skipped, instructions count: 533
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.fd0.k(m4.gs0):long");
    }

    public final boolean t() {
        if (!this.f8415i) {
            return false;
        }
        yr<Boolean> yrVar = es.A2;
        jo joVar = jo.f10145d;
        if (((Boolean) joVar.f10148c.a(yrVar)).booleanValue() && !this.p) {
            return true;
        }
        return ((Boolean) joVar.f10148c.a(es.B2)).booleanValue() && !this.f8422q;
    }
}
