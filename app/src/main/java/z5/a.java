package z5;

import android.graphics.Paint;
import android.graphics.Path;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: i */
    public static final int[] f20979i = new int[3];

    /* renamed from: j */
    public static final float[] f20980j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k */
    public static final int[] f20981k = new int[4];

    /* renamed from: l */
    public static final float[] f20982l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: b */
    public final Paint f20984b;

    /* renamed from: c */
    public final Paint f20985c;

    /* renamed from: d */
    public int f20986d;

    /* renamed from: e */
    public int f20987e;

    /* renamed from: f */
    public int f20988f;

    /* renamed from: g */
    public final Path f20989g = new Path();

    /* renamed from: h */
    public Paint f20990h = new Paint();

    /* renamed from: a */
    public final Paint f20983a = new Paint();

    public a() {
        a(-16777216);
        this.f20990h.setColor(0);
        Paint paint = new Paint(4);
        this.f20984b = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f20985c = new Paint(paint);
    }

    public final void a(int i10) {
        this.f20986d = e0.a.e(i10, 68);
        this.f20987e = e0.a.e(i10, 20);
        this.f20988f = e0.a.e(i10, 0);
        this.f20983a.setColor(this.f20986d);
    }
}
