package m4;

import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* loaded from: classes.dex */
public final class p {
    public byte[] N;
    public q T;
    public boolean U;
    public mp2 X;
    public int Y;

    /* renamed from: a */
    public String f12319a;

    /* renamed from: b */
    public String f12320b;

    /* renamed from: c */
    public int f12321c;

    /* renamed from: d */
    public int f12322d;

    /* renamed from: e */
    public int f12323e;

    /* renamed from: f */
    public int f12324f;

    /* renamed from: g */
    public int f12325g;

    /* renamed from: h */
    public boolean f12326h;

    /* renamed from: i */
    public byte[] f12327i;

    /* renamed from: j */
    public lp2 f12328j;

    /* renamed from: k */
    public byte[] f12329k;

    /* renamed from: l */
    public il2 f12330l;

    /* renamed from: m */
    public int f12331m = -1;

    /* renamed from: n */
    public int f12332n = -1;

    /* renamed from: o */
    public int f12333o = -1;
    public int p = -1;

    /* renamed from: q */
    public int f12334q = 0;

    /* renamed from: r */
    public int f12335r = -1;

    /* renamed from: s */
    public float f12336s = 0.0f;

    /* renamed from: t */
    public float f12337t = 0.0f;

    /* renamed from: u */
    public float f12338u = 0.0f;

    /* renamed from: v */
    public byte[] f12339v = null;

    /* renamed from: w */
    public int f12340w = -1;

    /* renamed from: x */
    public boolean f12341x = false;
    public int y = -1;

    /* renamed from: z */
    public int f12342z = -1;
    public int A = -1;
    public int B = 1000;
    public int C = 200;
    public float D = -1.0f;
    public float E = -1.0f;
    public float F = -1.0f;
    public float G = -1.0f;
    public float H = -1.0f;
    public float I = -1.0f;
    public float J = -1.0f;
    public float K = -1.0f;
    public float L = -1.0f;
    public float M = -1.0f;
    public int O = 1;
    public int P = -1;
    public int Q = 8000;
    public long R = 0;
    public long S = 0;
    public boolean V = true;
    public String W = "eng";

    public p() {
    }

    public /* synthetic */ p(wo2 wo2Var) {
    }

    @EnsuresNonNull({"codecPrivate"})
    public final byte[] b(String str) {
        byte[] bArr = this.f12329k;
        if (bArr == null) {
            String valueOf = String.valueOf(str);
            throw mq.a(valueOf.length() != 0 ? "Missing CodecPrivate for codec ".concat(valueOf) : new String("Missing CodecPrivate for codec "), null);
        }
        return bArr;
    }
}
