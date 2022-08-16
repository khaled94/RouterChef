package androidx.fragment.app;

/* loaded from: classes.dex */
public final /* synthetic */ class b1 {
    public static float a(float f10, float f11, float f12, float f13) {
        return ((f10 - f11) * f12) + f13;
    }

    public static void b(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
    }

    public static /* synthetic */ String c(int i10) {
        return i10 == 1 ? "NONE" : i10 == 2 ? "ADDING" : i10 == 3 ? "REMOVING" : "null";
    }
}
