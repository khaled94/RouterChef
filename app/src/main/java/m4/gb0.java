package m4;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import l3.s;
import n3.g0;
import n3.g1;
import n3.h0;
import n3.i0;
import n3.o1;
import n3.s1;

/* loaded from: classes.dex */
public final class gb0 {

    /* renamed from: a */
    public final Context f8798a;

    /* renamed from: b */
    public final String f8799b;

    /* renamed from: c */
    public final o90 f8800c;

    /* renamed from: d */
    public final os f8801d;

    /* renamed from: e */
    public final qs f8802e;

    /* renamed from: f */
    public final i0 f8803f;

    /* renamed from: g */
    public final long[] f8804g;

    /* renamed from: h */
    public final String[] f8805h;

    /* renamed from: m */
    public boolean f8810m;

    /* renamed from: n */
    public pa0 f8811n;

    /* renamed from: o */
    public boolean f8812o;
    public boolean p;

    /* renamed from: i */
    public boolean f8806i = false;

    /* renamed from: j */
    public boolean f8807j = false;

    /* renamed from: k */
    public boolean f8808k = false;

    /* renamed from: l */
    public boolean f8809l = false;

    /* renamed from: q */
    public long f8813q = -1;

    public gb0(Context context, o90 o90Var, String str, qs qsVar, os osVar) {
        h0 h0Var = new h0(0);
        h0Var.a("min_1", Double.MIN_VALUE, 1.0d);
        h0Var.a("1_5", 1.0d, 5.0d);
        h0Var.a("5_10", 5.0d, 10.0d);
        h0Var.a("10_20", 10.0d, 20.0d);
        h0Var.a("20_30", 20.0d, 30.0d);
        h0Var.a("30_max", 30.0d, Double.MAX_VALUE);
        this.f8803f = new i0(h0Var);
        this.f8798a = context;
        this.f8800c = o90Var;
        this.f8799b = str;
        this.f8802e = qsVar;
        this.f8801d = osVar;
        String str2 = (String) jo.f10145d.f10148c.a(es.f8188s);
        if (str2 == null) {
            this.f8805h = new String[0];
            this.f8804g = new long[0];
            return;
        }
        String[] split = TextUtils.split(str2, ",");
        int length = split.length;
        this.f8805h = new String[length];
        this.f8804g = new long[length];
        for (int i10 = 0; i10 < split.length; i10++) {
            try {
                this.f8804g[i10] = Long.parseLong(split[i10]);
            } catch (NumberFormatException e10) {
                g1.k("Unable to parse frame hash target time number.", e10);
                this.f8804g[i10] = -1;
            }
        }
    }

    public final void a(pa0 pa0Var) {
        js.b(this.f8802e, this.f8801d, "vpc2");
        this.f8806i = true;
        this.f8802e.b("vpn", pa0Var.r());
        this.f8811n = pa0Var;
    }

    public final void b() {
        if (!this.f8806i || this.f8807j) {
            return;
        }
        js.b(this.f8802e, this.f8801d, "vfr2");
        this.f8807j = true;
    }

    public final void c() {
        this.f8810m = true;
        if (!this.f8807j || this.f8808k) {
            return;
        }
        js.b(this.f8802e, this.f8801d, "vfp2");
        this.f8808k = true;
    }

    public final void d() {
        if (!au.f6257a.e().booleanValue() || this.f8812o) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("type", "native-player-metrics");
        bundle.putString("request", this.f8799b);
        bundle.putString("player", this.f8811n.r());
        i0 i0Var = this.f8803f;
        Objects.requireNonNull(i0Var);
        ArrayList arrayList = new ArrayList(i0Var.f16483a.length);
        int i10 = 0;
        while (true) {
            String[] strArr = i0Var.f16483a;
            if (i10 >= strArr.length) {
                break;
            }
            String str = strArr[i10];
            double d5 = i0Var.f16485c[i10];
            double d10 = i0Var.f16484b[i10];
            int i11 = i0Var.f16486d[i10];
            arrayList.add(new g0(str, d5, d10, i11 / i0Var.f16487e, i11));
            i10++;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            g0 g0Var = (g0) it.next();
            String valueOf = String.valueOf(g0Var.f16471a);
            bundle.putString(valueOf.length() != 0 ? "fps_c_".concat(valueOf) : new String("fps_c_"), Integer.toString(g0Var.f16475e));
            String valueOf2 = String.valueOf(g0Var.f16471a);
            bundle.putString(valueOf2.length() != 0 ? "fps_p_".concat(valueOf2) : new String("fps_p_"), Double.toString(g0Var.f16474d));
        }
        int i12 = 0;
        while (true) {
            long[] jArr = this.f8804g;
            if (i12 >= jArr.length) {
                s1 s1Var = s.B.f5789c;
                Context context = this.f8798a;
                String str2 = this.f8800c.f12051s;
                Objects.requireNonNull(s1Var);
                bundle.putString("device", s1.N());
                bundle.putString("eids", TextUtils.join(",", es.a()));
                g90 g90Var = io.f9708f.f9709a;
                g90.i(context, str2, bundle, new o1(context, str2));
                this.f8812o = true;
                return;
            }
            String str3 = this.f8805h[i12];
            if (str3 != null) {
                bundle.putString("fh_".concat(Long.valueOf(jArr[i12]).toString()), str3);
            }
            i12++;
        }
    }

    public final void e(pa0 pa0Var) {
        if (this.f8808k && !this.f8809l) {
            if (g1.c() && !this.f8809l) {
                g1.a("VideoMetricsMixin first frame");
            }
            js.b(this.f8802e, this.f8801d, "vff2");
            this.f8809l = true;
        }
        Objects.requireNonNull(s.B.f5796j);
        long nanoTime = System.nanoTime();
        if (this.f8810m && this.p && this.f8813q != -1) {
            long nanos = TimeUnit.SECONDS.toNanos(1L);
            long j3 = this.f8813q;
            i0 i0Var = this.f8803f;
            double d5 = nanos / (nanoTime - j3);
            i0Var.f16487e++;
            int i10 = 0;
            while (true) {
                double[] dArr = i0Var.f16485c;
                if (i10 >= dArr.length) {
                    break;
                }
                double d10 = dArr[i10];
                if (d10 <= d5 && d5 < i0Var.f16484b[i10]) {
                    int[] iArr = i0Var.f16486d;
                    iArr[i10] = iArr[i10] + 1;
                }
                if (d5 < d10) {
                    break;
                }
                i10++;
            }
        }
        this.p = this.f8810m;
        this.f8813q = nanoTime;
        long longValue = ((Long) jo.f10145d.f10148c.a(es.f8196t)).longValue();
        long h10 = pa0Var.h();
        int i11 = 0;
        while (true) {
            String[] strArr = this.f8805h;
            if (i11 < strArr.length) {
                if (strArr[i11] == null && longValue > Math.abs(h10 - this.f8804g[i11])) {
                    String[] strArr2 = this.f8805h;
                    int i12 = 8;
                    Bitmap bitmap = pa0Var.getBitmap(8, 8);
                    long j10 = 63;
                    int i13 = 0;
                    long j11 = 0;
                    while (i13 < i12) {
                        int i14 = 0;
                        while (i14 < i12) {
                            int pixel = bitmap.getPixel(i14, i13);
                            j11 |= (Color.green(pixel) + (Color.red(pixel) + Color.blue(pixel)) > 128 ? 1L : 0L) << ((int) j10);
                            i14++;
                            j10--;
                            i12 = 8;
                        }
                        i13++;
                        i12 = 8;
                    }
                    strArr2[i11] = String.format("%016X", Long.valueOf(j11));
                    return;
                }
                i11++;
            } else {
                return;
            }
        }
    }
}
