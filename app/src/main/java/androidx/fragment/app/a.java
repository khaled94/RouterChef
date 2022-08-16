package androidx.fragment.app;

/* loaded from: classes.dex */
public final /* synthetic */ class a {
    public static int a(String str, int i10, int i11) {
        return (str.hashCode() + i10) * i11;
    }

    public static String b(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    public static StringBuilder c(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb;
    }

    public static /* synthetic */ String d(int i10) {
        return i10 == 1 ? "EXPONENTIAL" : i10 == 2 ? "LINEAR" : "null";
    }
}
