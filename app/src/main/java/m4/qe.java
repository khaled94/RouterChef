package m4;

import android.net.Uri;
import java.io.IOException;
import java.util.Objects;
import z3.v;

/* loaded from: classes.dex */
public final class qe {

    /* renamed from: a */
    public final Uri f12806a;

    /* renamed from: b */
    public final bg f12807b;

    /* renamed from: c */
    public final v f12808c;

    /* renamed from: d */
    public final og f12809d;

    /* renamed from: f */
    public volatile boolean f12811f;

    /* renamed from: h */
    public long f12813h;

    /* renamed from: j */
    public final /* synthetic */ se f12815j;

    /* renamed from: e */
    public final lc f12810e = new lc();

    /* renamed from: g */
    public boolean f12812g = true;

    /* renamed from: i */
    public long f12814i = -1;

    public qe(se seVar, Uri uri, bg bgVar, v vVar, og ogVar) {
        this.f12815j = seVar;
        Objects.requireNonNull(uri);
        this.f12806a = uri;
        Objects.requireNonNull(bgVar);
        this.f12807b = bgVar;
        Objects.requireNonNull(vVar);
        this.f12808c = vVar;
        this.f12809d = ogVar;
    }

    public final void a() {
        hc hcVar;
        Throwable th;
        while (!this.f12811f) {
            int i10 = 0;
            try {
                long j3 = this.f12810e.f10709a;
                long f10 = this.f12807b.f(new dg(this.f12806a, j3, j3, -1L));
                this.f12814i = f10;
                if (f10 != -1) {
                    f10 += j3;
                    this.f12814i = f10;
                }
                bg bgVar = this.f12807b;
                hc hcVar2 = new hc(bgVar, j3, f10);
                try {
                    ic a10 = this.f12808c.a(hcVar2, bgVar.c());
                    if (this.f12812g) {
                        a10.b(j3, this.f12813h);
                        this.f12812g = false;
                    }
                    int i11 = 0;
                    while (true) {
                        if (i11 != 0) {
                            break;
                        }
                        try {
                            if (this.f12811f) {
                                i11 = 0;
                                break;
                            }
                            og ogVar = this.f12809d;
                            synchronized (ogVar) {
                                while (!ogVar.f12153a) {
                                    ogVar.wait();
                                }
                            }
                            i11 = a10.f(hcVar2, this.f12810e);
                            long j10 = hcVar2.f9183c;
                            if (j10 > this.f12815j.y + j3) {
                                og ogVar2 = this.f12809d;
                                synchronized (ogVar2) {
                                    ogVar2.f12153a = false;
                                }
                                se seVar = this.f12815j;
                                seVar.E.post(seVar.D);
                                j3 = j10;
                            }
                        } catch (Throwable th2) {
                            hcVar = hcVar2;
                            th = th2;
                            i10 = i11;
                            if (i10 != 1 && hcVar != null) {
                                this.f12810e.f10709a = hcVar.f9183c;
                            }
                            bg bgVar2 = this.f12807b;
                            int i12 = wg.f14958a;
                            if (bgVar2 != null) {
                                try {
                                    bgVar2.g();
                                } catch (IOException unused) {
                                }
                            }
                            throw th;
                        }
                    }
                    if (i11 != 1) {
                        this.f12810e.f10709a = hcVar2.f9183c;
                        i10 = i11;
                    }
                    bg bgVar3 = this.f12807b;
                    int i13 = wg.f14958a;
                    if (bgVar3 != null) {
                        try {
                            bgVar3.g();
                            continue;
                        } catch (IOException unused2) {
                            continue;
                        }
                    }
                    if (i10 != 0) {
                        return;
                    }
                } catch (Throwable th3) {
                    hcVar = hcVar2;
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
                hcVar = null;
            }
        }
    }
}
