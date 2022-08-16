package m4;

import android.content.Context;
import android.net.Uri;
import h4.e;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicLong;
import p1.r;

/* loaded from: classes.dex */
public final class xb0 implements bg {

    /* renamed from: a */
    public final ng<bg> f15277a;

    /* renamed from: b */
    public final Context f15278b;

    /* renamed from: c */
    public final bg f15279c;

    /* renamed from: d */
    public final String f15280d;

    /* renamed from: e */
    public final int f15281e;

    /* renamed from: g */
    public InputStream f15283g;

    /* renamed from: h */
    public boolean f15284h;

    /* renamed from: i */
    public Uri f15285i;

    /* renamed from: j */
    public volatile kj f15286j;

    /* renamed from: r */
    public final r f15293r;

    /* renamed from: k */
    public boolean f15287k = false;

    /* renamed from: l */
    public boolean f15288l = false;

    /* renamed from: m */
    public boolean f15289m = false;

    /* renamed from: n */
    public boolean f15290n = false;

    /* renamed from: o */
    public long f15291o = 0;

    /* renamed from: q */
    public final AtomicLong f15292q = new AtomicLong(-1);
    public tz1<Long> p = null;

    /* renamed from: f */
    public final boolean f15282f = ((Boolean) jo.f10145d.f10148c.a(es.f8120j1)).booleanValue();

    public xb0(Context context, bg bgVar, String str, int i10, ng<bg> ngVar, r rVar) {
        this.f15278b = context;
        this.f15279c = bgVar;
        this.f15277a = ngVar;
        this.f15293r = rVar;
        this.f15280d = str;
        this.f15281e = i10;
    }

    public final void a(dg dgVar) {
        ng<bg> ngVar = this.f15277a;
        if (ngVar != null) {
            ((dc0) ngVar).W(this);
        }
    }

    @Override // m4.bg
    public final Uri c() {
        return this.f15285i;
    }

    public final boolean d() {
        if (!this.f15282f) {
            return false;
        }
        yr<Boolean> yrVar = es.A2;
        jo joVar = jo.f10145d;
        if (((Boolean) joVar.f10148c.a(yrVar)).booleanValue() && !this.f15289m) {
            return true;
        }
        return ((Boolean) joVar.f10148c.a(es.B2)).booleanValue() && !this.f15290n;
    }

    @Override // m4.bg
    public final int e(byte[] bArr, int i10, int i11) {
        ng<bg> ngVar;
        if (this.f15284h) {
            InputStream inputStream = this.f15283g;
            int read = inputStream != null ? inputStream.read(bArr, i10, i11) : this.f15279c.e(bArr, i10, i11);
            if ((!this.f15282f || this.f15283g != null) && (ngVar = this.f15277a) != null) {
                ((dc0) ngVar).V(read);
            }
            return read;
        }
        throw new IOException("Attempt to read closed CacheDataSource.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01ef  */
    /* JADX WARN: Type inference failed for: r5v20, types: [long] */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r9v2, types: [m4.w90] */
    @Override // m4.bg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long f(m4.dg r17) {
        /*
            Method dump skipped, instructions count: 531
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.xb0.f(m4.dg):long");
    }

    @Override // m4.bg
    public final void g() {
        if (this.f15284h) {
            this.f15284h = false;
            this.f15285i = null;
            InputStream inputStream = this.f15283g;
            if (inputStream == null) {
                this.f15279c.g();
                return;
            }
            e.a(inputStream);
            this.f15283g = null;
            return;
        }
        throw new IOException("Attempt to close an already closed CacheDataSource.");
    }
}
