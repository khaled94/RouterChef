package r9;

import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: n */
    public static final e f17351n;

    /* renamed from: a */
    public final boolean f17352a;

    /* renamed from: b */
    public final boolean f17353b;

    /* renamed from: c */
    public final int f17354c;

    /* renamed from: d */
    public final int f17355d;

    /* renamed from: e */
    public final boolean f17356e;

    /* renamed from: f */
    public final boolean f17357f;

    /* renamed from: g */
    public final boolean f17358g;

    /* renamed from: h */
    public final int f17359h;

    /* renamed from: i */
    public final int f17360i;

    /* renamed from: j */
    public final boolean f17361j;

    /* renamed from: k */
    public final boolean f17362k;

    /* renamed from: l */
    public final boolean f17363l;
    @Nullable

    /* renamed from: m */
    public String f17364m;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public boolean f17365a;

        /* renamed from: b */
        public boolean f17366b;

        /* renamed from: c */
        public int f17367c = -1;

        /* renamed from: d */
        public boolean f17368d;

        public final e a() {
            return new e(this);
        }
    }

    static {
        a aVar = new a();
        aVar.f17365a = true;
        aVar.a();
        a aVar2 = new a();
        aVar2.f17368d = true;
        int i10 = Integer.MAX_VALUE;
        long seconds = TimeUnit.SECONDS.toSeconds(Integer.MAX_VALUE);
        if (seconds <= 2147483647L) {
            i10 = (int) seconds;
        }
        aVar2.f17367c = i10;
        f17351n = new e(aVar2);
    }

    public e(a aVar) {
        this.f17352a = aVar.f17365a;
        this.f17353b = aVar.f17366b;
        this.f17354c = -1;
        this.f17355d = -1;
        this.f17356e = false;
        this.f17357f = false;
        this.f17358g = false;
        this.f17359h = aVar.f17367c;
        this.f17360i = -1;
        this.f17361j = aVar.f17368d;
        this.f17362k = false;
        this.f17363l = false;
    }

    public e(boolean z10, boolean z11, int i10, int i11, boolean z12, boolean z13, boolean z14, int i12, int i13, boolean z15, boolean z16, boolean z17, @Nullable String str) {
        this.f17352a = z10;
        this.f17353b = z11;
        this.f17354c = i10;
        this.f17355d = i11;
        this.f17356e = z12;
        this.f17357f = z13;
        this.f17358g = z14;
        this.f17359h = i12;
        this.f17360i = i13;
        this.f17361j = z15;
        this.f17362k = z16;
        this.f17363l = z17;
        this.f17364m = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static r9.e a(r9.u r22) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r9.e.a(r9.u):r9.e");
    }

    public final String toString() {
        String str = this.f17364m;
        if (str == null) {
            StringBuilder sb = new StringBuilder();
            if (this.f17352a) {
                sb.append("no-cache, ");
            }
            if (this.f17353b) {
                sb.append("no-store, ");
            }
            if (this.f17354c != -1) {
                sb.append("max-age=");
                sb.append(this.f17354c);
                sb.append(", ");
            }
            if (this.f17355d != -1) {
                sb.append("s-maxage=");
                sb.append(this.f17355d);
                sb.append(", ");
            }
            if (this.f17356e) {
                sb.append("private, ");
            }
            if (this.f17357f) {
                sb.append("public, ");
            }
            if (this.f17358g) {
                sb.append("must-revalidate, ");
            }
            if (this.f17359h != -1) {
                sb.append("max-stale=");
                sb.append(this.f17359h);
                sb.append(", ");
            }
            if (this.f17360i != -1) {
                sb.append("min-fresh=");
                sb.append(this.f17360i);
                sb.append(", ");
            }
            if (this.f17361j) {
                sb.append("only-if-cached, ");
            }
            if (this.f17362k) {
                sb.append("no-transform, ");
            }
            if (this.f17363l) {
                sb.append("immutable, ");
            }
            if (sb.length() == 0) {
                str = "";
            } else {
                sb.delete(sb.length() - 2, sb.length());
                str = sb.toString();
            }
            this.f17364m = str;
        }
        return str;
    }
}
