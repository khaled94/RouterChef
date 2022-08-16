package m4;

import androidx.fragment.app.b1;
import i0.b;
import java.util.ArrayList;
import javax.annotation.ParametersAreNonnullByDefault;
import l3.s;
import n3.g1;
import n3.k1;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class xh {

    /* renamed from: a */
    public final int f15344a;

    /* renamed from: b */
    public final int f15345b;

    /* renamed from: c */
    public final int f15346c;

    /* renamed from: d */
    public final boolean f15347d;

    /* renamed from: e */
    public final li f15348e;

    /* renamed from: f */
    public final ti f15349f;

    /* renamed from: n */
    public int f15357n;

    /* renamed from: g */
    public final Object f15350g = new Object();

    /* renamed from: h */
    public final ArrayList<String> f15351h = new ArrayList<>();

    /* renamed from: i */
    public final ArrayList<String> f15352i = new ArrayList<>();

    /* renamed from: j */
    public final ArrayList<hi> f15353j = new ArrayList<>();

    /* renamed from: k */
    public int f15354k = 0;

    /* renamed from: l */
    public int f15355l = 0;

    /* renamed from: m */
    public int f15356m = 0;

    /* renamed from: o */
    public String f15358o = "";
    public String p = "";

    /* renamed from: q */
    public String f15359q = "";

    public xh(int i10, int i11, int i12, int i13, int i14, int i15, int i16, boolean z10) {
        this.f15344a = i10;
        this.f15345b = i11;
        this.f15346c = i12;
        this.f15347d = z10;
        this.f15348e = new li(i13);
        this.f15349f = new ti(i14, i15, i16);
    }

    public static final String d(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            sb.append((String) arrayList.get(i10));
            sb.append(' ');
            i10++;
            if (sb.length() > 100) {
                break;
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        String sb2 = sb.toString();
        return sb2.length() < 100 ? sb2 : sb2.substring(0, 100);
    }

    public final void a(String str, boolean z10, float f10, float f11, float f12, float f13) {
        c(str, z10, f10, f11, f12, f13);
        synchronized (this.f15350g) {
            if (this.f15356m < 0) {
                g1.e("ActivityContent: negative number of WebViews.");
            }
            b();
        }
    }

    public final void b() {
        synchronized (this.f15350g) {
            try {
                int i10 = this.f15347d ? this.f15345b : (this.f15354k * this.f15344a) + (this.f15355l * this.f15345b);
                if (i10 > this.f15357n) {
                    this.f15357n = i10;
                    s sVar = s.B;
                    if (!((k1) sVar.f5793g.c()).r()) {
                        this.f15358o = this.f15348e.a(this.f15351h);
                        this.p = this.f15348e.a(this.f15352i);
                    }
                    if (!((k1) sVar.f5793g.c()).t()) {
                        this.f15359q = this.f15349f.a(this.f15352i, this.f15353j);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(String str, boolean z10, float f10, float f11, float f12, float f13) {
        if (str == null || str.length() < this.f15346c) {
            return;
        }
        synchronized (this.f15350g) {
            this.f15351h.add(str);
            this.f15354k += str.length();
            if (z10) {
                this.f15352i.add(str);
                this.f15353j.add(new hi(f10, f11, f12, f13, this.f15352i.size() - 1));
            }
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xh)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        String str = ((xh) obj).f15358o;
        return str != null && str.equals(this.f15358o);
    }

    public final int hashCode() {
        return this.f15358o.hashCode();
    }

    public final String toString() {
        int i10 = this.f15355l;
        int i11 = this.f15357n;
        int i12 = this.f15354k;
        String d5 = d(this.f15351h);
        String d10 = d(this.f15352i);
        String str = this.f15358o;
        String str2 = this.p;
        String str3 = this.f15359q;
        int length = String.valueOf(d5).length();
        int length2 = String.valueOf(d10).length();
        int length3 = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 165 + length2 + length3 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append("ActivityContent fetchId: ");
        sb.append(i10);
        sb.append(" score:");
        sb.append(i11);
        sb.append(" total_length:");
        sb.append(i12);
        sb.append("\n text: ");
        sb.append(d5);
        b1.b(sb, "\n viewableText", d10, "\n signture: ", str);
        return b.a(sb, "\n viewableSignture: ", str2, "\n viewableSignatureForVertical: ", str3);
    }
}
