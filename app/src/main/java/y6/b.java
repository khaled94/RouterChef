package y6;

import q2.e;
import q2.f;
import u6.a0;
import v6.d;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: b */
    public static final d f20877b = new d();

    /* renamed from: c */
    public static final String f20878c = a("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");

    /* renamed from: d */
    public static final String f20879d = a("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");

    /* renamed from: e */
    public static final e<a0, byte[]> f20880e = g1.e.f4797u;

    /* renamed from: a */
    public final f<a0> f20881a;

    public b(f fVar) {
        this.f20881a = fVar;
    }

    public static String a(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            sb.append(str.charAt(i10));
            if (str2.length() > i10) {
                sb.append(str2.charAt(i10));
            }
        }
        return sb.toString();
    }
}
