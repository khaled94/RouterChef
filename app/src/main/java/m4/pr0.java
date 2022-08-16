package m4;

/* loaded from: classes.dex */
public final /* synthetic */ class pr0 implements ar0 {

    /* renamed from: s */
    public final String f12613s;

    public /* synthetic */ pr0(int i10, int i11, String str) {
        this.f12613s = str;
    }

    public static pr0 a(dd ddVar) {
        String str;
        ddVar.i(2);
        int q10 = ddVar.q();
        int i10 = q10 >> 1;
        int q11 = (ddVar.q() >> 3) | ((q10 & 1) << 5);
        if (i10 == 4 || i10 == 5 || i10 == 7) {
            str = "dvhe";
        } else if (i10 == 8) {
            str = "hev1";
        } else if (i10 != 9) {
            return null;
        } else {
            str = "avc3";
        }
        String str2 = q11 < 10 ? ".0" : ".";
        StringBuilder sb = new StringBuilder(str2.length() + str.length() + 24);
        sb.append(str);
        sb.append(".0");
        sb.append(i10);
        sb.append(str2);
        sb.append(q11);
        return new pr0(i10, q11, sb.toString());
    }

    @Override // m4.ar0, m4.ko1
    /* renamed from: h */
    public final void mo30h(Object obj) {
        ((ur0) obj).z(this.f12613s);
    }
}
