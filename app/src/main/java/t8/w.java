package t8;

import android.graphics.Bitmap;
import android.net.Uri;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: s */
    public static final long f18830s = TimeUnit.SECONDS.toNanos(5);

    /* renamed from: a */
    public int f18831a;

    /* renamed from: b */
    public long f18832b;

    /* renamed from: c */
    public final Uri f18833c;

    /* renamed from: d */
    public final int f18834d;

    /* renamed from: f */
    public final int f18836f;

    /* renamed from: g */
    public final int f18837g;

    /* renamed from: q */
    public final Bitmap.Config f18846q;

    /* renamed from: r */
    public final int f18847r;

    /* renamed from: e */
    public final List<c0> f18835e = null;

    /* renamed from: h */
    public final boolean f18838h = false;

    /* renamed from: j */
    public final boolean f18840j = false;

    /* renamed from: i */
    public final int f18839i = 0;

    /* renamed from: k */
    public final boolean f18841k = false;

    /* renamed from: l */
    public final float f18842l = 0.0f;

    /* renamed from: m */
    public final float f18843m = 0.0f;

    /* renamed from: n */
    public final float f18844n = 0.0f;

    /* renamed from: o */
    public final boolean f18845o = false;
    public final boolean p = false;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public Uri f18848a;

        /* renamed from: b */
        public int f18849b = 0;

        /* renamed from: c */
        public int f18850c;

        /* renamed from: d */
        public int f18851d;

        /* renamed from: e */
        public Bitmap.Config f18852e;

        /* renamed from: f */
        public int f18853f;

        public a(Uri uri, Bitmap.Config config) {
            this.f18848a = uri;
            this.f18852e = config;
        }

        public final a a(int i10, int i11) {
            if (i10 >= 0) {
                if (i11 < 0) {
                    throw new IllegalArgumentException("Height must be positive number or 0.");
                }
                if (i11 == 0 && i10 == 0) {
                    throw new IllegalArgumentException("At least one dimension has to be positive number.");
                }
                this.f18850c = i10;
                this.f18851d = i11;
                return this;
            }
            throw new IllegalArgumentException("Width must be positive number or 0.");
        }
    }

    public w(Uri uri, int i10, int i11, int i12, Bitmap.Config config, int i13) {
        this.f18833c = uri;
        this.f18834d = i10;
        this.f18836f = i11;
        this.f18837g = i12;
        this.f18846q = config;
        this.f18847r = i13;
    }

    public final boolean a() {
        return (this.f18836f == 0 && this.f18837g == 0) ? false : true;
    }

    public final String b() {
        StringBuilder sb;
        long nanoTime = System.nanoTime() - this.f18832b;
        if (nanoTime > f18830s) {
            sb = new StringBuilder();
            sb.append(d());
            sb.append('+');
            sb.append(TimeUnit.NANOSECONDS.toSeconds(nanoTime));
            sb.append('s');
        } else {
            sb = new StringBuilder();
            sb.append(d());
            sb.append('+');
            sb.append(TimeUnit.NANOSECONDS.toMillis(nanoTime));
            sb.append("ms");
        }
        return sb.toString();
    }

    public final boolean c() {
        return a() || this.f18842l != 0.0f;
    }

    public final String d() {
        StringBuilder c10 = androidx.activity.result.a.c("[R");
        c10.append(this.f18831a);
        c10.append(']');
        return c10.toString();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request{");
        int i10 = this.f18834d;
        if (i10 > 0) {
            sb.append(i10);
        } else {
            sb.append(this.f18833c);
        }
        List<c0> list = this.f18835e;
        if (list != null && !list.isEmpty()) {
            for (c0 c0Var : this.f18835e) {
                sb.append(' ');
                sb.append(c0Var.a());
            }
        }
        if (this.f18836f > 0) {
            sb.append(" resize(");
            sb.append(this.f18836f);
            sb.append(',');
            sb.append(this.f18837g);
            sb.append(')');
        }
        if (this.f18838h) {
            sb.append(" centerCrop");
        }
        if (this.f18840j) {
            sb.append(" centerInside");
        }
        if (this.f18842l != 0.0f) {
            sb.append(" rotation(");
            sb.append(this.f18842l);
            if (this.f18845o) {
                sb.append(" @ ");
                sb.append(this.f18843m);
                sb.append(',');
                sb.append(this.f18844n);
            }
            sb.append(')');
        }
        if (this.p) {
            sb.append(" purgeable");
        }
        if (this.f18846q != null) {
            sb.append(' ');
            sb.append(this.f18846q);
        }
        sb.append('}');
        return sb.toString();
    }
}
