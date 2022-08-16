package m4;

/* loaded from: classes.dex */
public class f0 {

    /* renamed from: a */
    public final int f8307a;

    public f0(int i10) {
        this.f8307a = i10;
    }

    public static int a(int i10) {
        return (i10 >> 24) & 255;
    }

    public static String b(int i10) {
        StringBuilder sb = new StringBuilder(4);
        sb.append((char) ((i10 >> 24) & 255));
        sb.append((char) ((i10 >> 16) & 255));
        sb.append((char) ((i10 >> 8) & 255));
        sb.append((char) (i10 & 255));
        return sb.toString();
    }

    public String toString() {
        return b(this.f8307a);
    }
}
