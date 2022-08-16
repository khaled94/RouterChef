package m4;

import z3.p;

/* loaded from: classes.dex */
public final class hg2 {

    /* renamed from: e */
    public static final hg2 f9329e = new hg2(-1, -1, -1);

    /* renamed from: a */
    public final int f9330a;

    /* renamed from: b */
    public final int f9331b;

    /* renamed from: c */
    public final int f9332c;

    /* renamed from: d */
    public final int f9333d;

    public hg2(int i10, int i11, int i12) {
        this.f9330a = i10;
        this.f9331b = i11;
        this.f9332c = i12;
        this.f9333d = ls1.g(i12) ? ls1.t(i12, i11) : -1;
    }

    public final String toString() {
        int i10 = this.f9330a;
        int i11 = this.f9331b;
        int i12 = this.f9332c;
        StringBuilder a10 = p.a(83, "AudioFormat[sampleRate=", i10, ", channelCount=", i11);
        a10.append(", encoding=");
        a10.append(i12);
        a10.append(']');
        return a10.toString();
    }
}
