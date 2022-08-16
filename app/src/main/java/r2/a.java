package r2;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import q2.b;
import t2.l;

/* loaded from: classes.dex */
public final class a implements l {

    /* renamed from: c */
    public static final String f17227c = d.a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");

    /* renamed from: d */
    public static final Set<b> f17228d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new b("proto"), new b("json"))));

    /* renamed from: e */
    public static final a f17229e = new a(d.a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg"), d.a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK"));

    /* renamed from: a */
    public final String f17230a;

    /* renamed from: b */
    public final String f17231b;

    public a(String str, String str2) {
        this.f17230a = str;
        this.f17231b = str2;
    }

    public static a a(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (str.startsWith("1$")) {
            String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
            if (split.length != 2) {
                throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
            }
            String str2 = split[0];
            if (str2.isEmpty()) {
                throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
            }
            String str3 = split[1];
            if (str3.isEmpty()) {
                str3 = null;
            }
            return new a(str2, str3);
        }
        throw new IllegalArgumentException("Version marker missing from extras");
    }

    public final byte[] b() {
        String str = this.f17231b;
        if (str == null && this.f17230a == null) {
            return null;
        }
        Object[] objArr = new Object[4];
        objArr[0] = "1$";
        objArr[1] = this.f17230a;
        objArr[2] = "\\";
        if (str == null) {
            str = "";
        }
        objArr[3] = str;
        return String.format("%s%s%s%s", objArr).getBytes(Charset.forName("UTF-8"));
    }
}
