package r9;

import androidx.fragment.app.a;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import s9.e;
import v9.d;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: j */
    public static final Pattern f17441j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k */
    public static final Pattern f17442k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l */
    public static final Pattern f17443l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m */
    public static final Pattern f17444m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a */
    public final String f17445a;

    /* renamed from: b */
    public final String f17446b;

    /* renamed from: c */
    public final long f17447c;

    /* renamed from: d */
    public final String f17448d;

    /* renamed from: e */
    public final String f17449e;

    /* renamed from: f */
    public final boolean f17450f;

    /* renamed from: g */
    public final boolean f17451g;

    /* renamed from: h */
    public final boolean f17452h;

    /* renamed from: i */
    public final boolean f17453i;

    public l(String str, String str2, long j3, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f17445a = str;
        this.f17446b = str2;
        this.f17447c = j3;
        this.f17448d = str3;
        this.f17449e = str4;
        this.f17450f = z10;
        this.f17451g = z11;
        this.f17453i = z12;
        this.f17452h = z13;
    }

    public static int a(String str, int i10, int i11, boolean z10) {
        while (i10 < i11) {
            char charAt = str.charAt(i10);
            if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || (charAt >= '0' && charAt <= '9') || ((charAt >= 'a' && charAt <= 'z') || ((charAt >= 'A' && charAt <= 'Z') || charAt == ':'))) == (!z10)) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static long b(String str, int i10) {
        int a10 = a(str, 0, i10, false);
        Matcher matcher = f17444m.matcher(str);
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        int i15 = -1;
        int i16 = -1;
        while (a10 < i10) {
            int a11 = a(str, a10 + 1, i10, true);
            matcher.region(a10, a11);
            if (i12 == -1 && matcher.usePattern(f17444m).matches()) {
                i12 = Integer.parseInt(matcher.group(1));
                i15 = Integer.parseInt(matcher.group(2));
                i16 = Integer.parseInt(matcher.group(3));
            } else if (i13 != -1 || !matcher.usePattern(f17443l).matches()) {
                if (i14 == -1) {
                    Pattern pattern = f17442k;
                    if (matcher.usePattern(pattern).matches()) {
                        i14 = pattern.pattern().indexOf(matcher.group(1).toLowerCase(Locale.US)) / 4;
                    }
                }
                if (i11 == -1 && matcher.usePattern(f17441j).matches()) {
                    i11 = Integer.parseInt(matcher.group(1));
                }
            } else {
                i13 = Integer.parseInt(matcher.group(1));
            }
            a10 = a(str, a11 + 1, i10, false);
        }
        if (i11 >= 70 && i11 <= 99) {
            i11 += 1900;
        }
        if (i11 >= 0 && i11 <= 69) {
            i11 += 2000;
        }
        if (i11 >= 1601) {
            if (i14 == -1) {
                throw new IllegalArgumentException();
            }
            if (i13 < 1 || i13 > 31) {
                throw new IllegalArgumentException();
            }
            if (i12 < 0 || i12 > 23) {
                throw new IllegalArgumentException();
            }
            if (i15 < 0 || i15 > 59) {
                throw new IllegalArgumentException();
            }
            if (i16 < 0 || i16 > 59) {
                throw new IllegalArgumentException();
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(e.f18403h);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i11);
            gregorianCalendar.set(2, i14 - 1);
            gregorianCalendar.set(5, i13);
            gregorianCalendar.set(11, i12);
            gregorianCalendar.set(12, i15);
            gregorianCalendar.set(13, i16);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return lVar.f17445a.equals(this.f17445a) && lVar.f17446b.equals(this.f17446b) && lVar.f17448d.equals(this.f17448d) && lVar.f17449e.equals(this.f17449e) && lVar.f17447c == this.f17447c && lVar.f17450f == this.f17450f && lVar.f17451g == this.f17451g && lVar.f17452h == this.f17452h && lVar.f17453i == this.f17453i;
    }

    public final int hashCode() {
        int a10 = a.a(this.f17449e, a.a(this.f17448d, a.a(this.f17446b, a.a(this.f17445a, 527, 31), 31), 31), 31);
        long j3 = this.f17447c;
        return ((((((((a10 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (!this.f17450f ? 1 : 0)) * 31) + (!this.f17451g ? 1 : 0)) * 31) + (!this.f17452h ? 1 : 0)) * 31) + (!this.f17453i ? 1 : 0);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f17445a);
        sb.append('=');
        sb.append(this.f17446b);
        if (this.f17452h) {
            if (this.f17447c == Long.MIN_VALUE) {
                str = "; max-age=0";
            } else {
                sb.append("; expires=");
                str = d.f19838a.get().format(new Date(this.f17447c));
            }
            sb.append(str);
        }
        if (!this.f17453i) {
            sb.append("; domain=");
            sb.append(this.f17448d);
        }
        sb.append("; path=");
        sb.append(this.f17449e);
        if (this.f17450f) {
            sb.append("; secure");
        }
        if (this.f17451g) {
            sb.append("; httponly");
        }
        return sb.toString();
    }
}
