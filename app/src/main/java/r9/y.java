package r9;

import ca.f;
import ca.g;
import ca.i;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import s9.e;

/* loaded from: classes.dex */
public final class y extends f0 {

    /* renamed from: e */
    public static final x f17497e = x.a("multipart/mixed");

    /* renamed from: f */
    public static final x f17498f = x.a("multipart/form-data");

    /* renamed from: g */
    public static final byte[] f17499g = {58, 32};

    /* renamed from: h */
    public static final byte[] f17500h = {13, 10};

    /* renamed from: i */
    public static final byte[] f17501i = {45, 45};

    /* renamed from: a */
    public final i f17502a;

    /* renamed from: b */
    public final x f17503b;

    /* renamed from: c */
    public final List<b> f17504c;

    /* renamed from: d */
    public long f17505d = -1;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final i f17506a;

        /* renamed from: b */
        public x f17507b = y.f17497e;

        /* renamed from: c */
        public final List<b> f17508c = new ArrayList();

        public a() {
            String uuid = UUID.randomUUID().toString();
            this.f17506a = i.h(uuid);
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        @Nullable

        /* renamed from: a */
        public final u f17509a;

        /* renamed from: b */
        public final f0 f17510b;

        public b(@Nullable u uVar, f0 f0Var) {
            this.f17509a = uVar;
            this.f17510b = f0Var;
        }
    }

    static {
        x.a("multipart/alternative");
        x.a("multipart/digest");
        x.a("multipart/parallel");
    }

    public y(i iVar, x xVar, List<b> list) {
        this.f17502a = iVar;
        this.f17503b = x.a(xVar + "; boundary=" + iVar.q());
        this.f17504c = e.l(list);
    }

    @Override // r9.f0
    public final long a() {
        long j3 = this.f17505d;
        if (j3 != -1) {
            return j3;
        }
        long d5 = d(null, true);
        this.f17505d = d5;
        return d5;
    }

    @Override // r9.f0
    public final x b() {
        return this.f17503b;
    }

    @Override // r9.f0
    public final void c(g gVar) {
        d(gVar, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long d(@Nullable g gVar, boolean z10) {
        f fVar;
        if (z10) {
            gVar = new f();
            fVar = gVar;
        } else {
            fVar = 0;
        }
        int size = this.f17504c.size();
        long j3 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = this.f17504c.get(i10);
            u uVar = bVar.f17509a;
            f0 f0Var = bVar.f17510b;
            gVar.F(f17501i);
            gVar.J(this.f17502a);
            gVar.F(f17500h);
            if (uVar != null) {
                int length = uVar.f17472a.length / 2;
                for (int i11 = 0; i11 < length; i11++) {
                    gVar.f0(uVar.d(i11)).F(f17499g).f0(uVar.g(i11)).F(f17500h);
                }
            }
            x b10 = f0Var.b();
            if (b10 != null) {
                gVar.f0("Content-Type: ").f0(b10.f17494a).F(f17500h);
            }
            long a10 = f0Var.a();
            if (a10 != -1) {
                gVar.f0("Content-Length: ").g0(a10).F(f17500h);
            } else if (z10) {
                fVar.b();
                return -1L;
            }
            byte[] bArr = f17500h;
            gVar.F(bArr);
            if (z10) {
                j3 += a10;
            } else {
                f0Var.c(gVar);
            }
            gVar.F(bArr);
        }
        byte[] bArr2 = f17501i;
        gVar.F(bArr2);
        gVar.J(this.f17502a);
        gVar.F(bArr2);
        gVar.F(f17500h);
        if (z10) {
            long j10 = j3 + fVar.f2843t;
            fVar.b();
            return j10;
        }
        return j3;
    }
}
