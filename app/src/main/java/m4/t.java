package m4;

import androidx.fragment.app.b1;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class t {
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public int E;

    /* renamed from: a */
    public final String f13861a;

    /* renamed from: b */
    public final String f13862b;

    /* renamed from: c */
    public final String f13863c;

    /* renamed from: d */
    public final int f13864d;

    /* renamed from: e */
    public final int f13865e;

    /* renamed from: f */
    public final int f13866f;

    /* renamed from: g */
    public final int f13867g;

    /* renamed from: h */
    public final String f13868h;

    /* renamed from: i */
    public final ln0 f13869i;

    /* renamed from: j */
    public final String f13870j;

    /* renamed from: k */
    public final String f13871k;

    /* renamed from: l */
    public final int f13872l;

    /* renamed from: m */
    public final List<byte[]> f13873m;

    /* renamed from: n */
    public final il2 f13874n;

    /* renamed from: o */
    public final long f13875o;
    public final int p;

    /* renamed from: q */
    public final int f13876q;

    /* renamed from: r */
    public final float f13877r;

    /* renamed from: s */
    public final int f13878s;

    /* renamed from: t */
    public final float f13879t;

    /* renamed from: u */
    public final byte[] f13880u;

    /* renamed from: v */
    public final int f13881v;

    /* renamed from: w */
    public final wg2 f13882w;

    /* renamed from: x */
    public final int f13883x;
    public final int y;

    /* renamed from: z */
    public final int f13884z;

    static {
        new t(new kq2());
    }

    public t(kq2 kq2Var) {
        this.f13861a = kq2Var.f10533a;
        this.f13862b = kq2Var.f10534b;
        this.f13863c = ls1.d(kq2Var.f10535c);
        this.f13864d = kq2Var.f10536d;
        int i10 = kq2Var.f10537e;
        this.f13865e = i10;
        int i11 = kq2Var.f10538f;
        this.f13866f = i11;
        this.f13867g = i11 != -1 ? i11 : i10;
        this.f13868h = kq2Var.f10539g;
        this.f13869i = kq2Var.f10540h;
        this.f13870j = kq2Var.f10541i;
        this.f13871k = kq2Var.f10542j;
        this.f13872l = kq2Var.f10543k;
        List<byte[]> list = kq2Var.f10544l;
        this.f13873m = list == null ? Collections.emptyList() : list;
        il2 il2Var = kq2Var.f10545m;
        this.f13874n = il2Var;
        this.f13875o = kq2Var.f10546n;
        this.p = kq2Var.f10547o;
        this.f13876q = kq2Var.p;
        this.f13877r = kq2Var.f10548q;
        int i12 = kq2Var.f10549r;
        int i13 = 0;
        this.f13878s = i12 == -1 ? 0 : i12;
        float f10 = kq2Var.f10550s;
        this.f13879t = f10 == -1.0f ? 1.0f : f10;
        this.f13880u = kq2Var.f10551t;
        this.f13881v = kq2Var.f10552u;
        this.f13882w = kq2Var.f10553v;
        this.f13883x = kq2Var.f10554w;
        this.y = kq2Var.f10555x;
        this.f13884z = kq2Var.y;
        int i14 = kq2Var.f10556z;
        this.A = i14 == -1 ? 0 : i14;
        int i15 = kq2Var.A;
        this.B = i15 != -1 ? i15 : i13;
        this.C = kq2Var.B;
        int i16 = kq2Var.C;
        if (i16 != 0 || il2Var == null) {
            this.D = i16;
        } else {
            this.D = 1;
        }
    }

    public final boolean a(t tVar) {
        if (this.f13873m.size() == tVar.f13873m.size()) {
            for (int i10 = 0; i10 < this.f13873m.size(); i10++) {
                if (!Arrays.equals(this.f13873m.get(i10), tVar.f13873m.get(i10))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        int i10;
        if (this == obj) {
            return true;
        }
        if (obj != null && t.class == obj.getClass()) {
            t tVar = (t) obj;
            int i11 = this.E;
            if ((i11 == 0 || (i10 = tVar.E) == 0 || i11 == i10) && this.f13864d == tVar.f13864d && this.f13865e == tVar.f13865e && this.f13866f == tVar.f13866f && this.f13872l == tVar.f13872l && this.f13875o == tVar.f13875o && this.p == tVar.p && this.f13876q == tVar.f13876q && this.f13878s == tVar.f13878s && this.f13881v == tVar.f13881v && this.f13883x == tVar.f13883x && this.y == tVar.y && this.f13884z == tVar.f13884z && this.A == tVar.A && this.B == tVar.B && this.C == tVar.C && this.D == tVar.D && Float.compare(this.f13877r, tVar.f13877r) == 0 && Float.compare(this.f13879t, tVar.f13879t) == 0 && ls1.f(this.f13861a, tVar.f13861a) && ls1.f(this.f13862b, tVar.f13862b) && ls1.f(this.f13868h, tVar.f13868h) && ls1.f(this.f13870j, tVar.f13870j) && ls1.f(this.f13871k, tVar.f13871k) && ls1.f(this.f13863c, tVar.f13863c) && Arrays.equals(this.f13880u, tVar.f13880u) && ls1.f(this.f13869i, tVar.f13869i) && ls1.f(this.f13882w, tVar.f13882w) && ls1.f(this.f13874n, tVar.f13874n) && a(tVar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.E;
        if (i10 == 0) {
            String str = this.f13861a;
            int i11 = 0;
            int hashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
            String str2 = this.f13862b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f13863c;
            int hashCode3 = (((((((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f13864d) * 961) + this.f13865e) * 31) + this.f13866f) * 31;
            String str4 = this.f13868h;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            ln0 ln0Var = this.f13869i;
            int hashCode5 = (hashCode4 + (ln0Var == null ? 0 : ln0Var.hashCode())) * 31;
            String str5 = this.f13870j;
            int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f13871k;
            if (str6 != null) {
                i11 = str6.hashCode();
            }
            int floatToIntBits = ((((((((((((((((Float.floatToIntBits(this.f13879t) + ((((Float.floatToIntBits(this.f13877r) + ((((((((((hashCode6 + i11) * 31) + this.f13872l) * 31) + ((int) this.f13875o)) * 31) + this.p) * 31) + this.f13876q) * 31)) * 31) + this.f13878s) * 31)) * 31) + this.f13881v) * 31) + this.f13883x) * 31) + this.y) * 31) + this.f13884z) * 31) + this.A) * 31) + this.B) * 31) + this.C) * 31) + this.D;
            this.E = floatToIntBits;
            return floatToIntBits;
        }
        return i10;
    }

    public final String toString() {
        String str = this.f13861a;
        String str2 = this.f13862b;
        String str3 = this.f13870j;
        String str4 = this.f13871k;
        String str5 = this.f13868h;
        int i10 = this.f13867g;
        String str6 = this.f13863c;
        int i11 = this.p;
        int i12 = this.f13876q;
        float f10 = this.f13877r;
        int i13 = this.f13883x;
        int i14 = this.y;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        int length3 = String.valueOf(str3).length();
        int length4 = String.valueOf(str4).length();
        StringBuilder sb = new StringBuilder(length + 104 + length2 + length3 + length4 + String.valueOf(str5).length() + String.valueOf(str6).length());
        b1.b(sb, "Format(", str, ", ", str2);
        b1.b(sb, ", ", str3, ", ", str4);
        sb.append(", ");
        sb.append(str5);
        sb.append(", ");
        sb.append(i10);
        sb.append(", ");
        sb.append(str6);
        sb.append(", [");
        sb.append(i11);
        sb.append(", ");
        sb.append(i12);
        sb.append(", ");
        sb.append(f10);
        sb.append("], [");
        sb.append(i13);
        sb.append(", ");
        sb.append(i14);
        sb.append("])");
        return sb.toString();
    }
}
