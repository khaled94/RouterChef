package m4;

import android.util.Log;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* loaded from: classes.dex */
public final class x4 {
    public static long a(String str) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            return simpleDateFormat.parse(str).getTime();
        } catch (ParseException e10) {
            if (!"0".equals(str) && !"-1".equals(str)) {
                Log.e("Volley", p4.d("Unable to parse dateStr: %s, falling back to 0", str), e10);
                return 0L;
            }
            p4.c("Unable to parse dateStr: %s, falling back to 0", str);
            return 0L;
        }
    }

    public static p3 b(b4 b4Var) {
        long j3;
        long j10;
        boolean z10;
        long j11;
        long j12;
        long j13;
        long currentTimeMillis = System.currentTimeMillis();
        Map<String, String> map = b4Var.f6357c;
        if (map == null) {
            return null;
        }
        String str = map.get("Date");
        long a10 = str != null ? a(str) : 0L;
        String str2 = map.get("Cache-Control");
        int i10 = 0;
        if (str2 != null) {
            String[] split = str2.split(",", 0);
            z10 = false;
            j10 = 0;
            j3 = 0;
            while (i10 < split.length) {
                String trim = split[i10].trim();
                if (trim.equals("no-cache") || trim.equals("no-store")) {
                    return null;
                }
                if (trim.startsWith("max-age=")) {
                    try {
                        j10 = Long.parseLong(trim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (trim.startsWith("stale-while-revalidate=")) {
                    j3 = Long.parseLong(trim.substring(23));
                } else if (trim.equals("must-revalidate") || trim.equals("proxy-revalidate")) {
                    z10 = true;
                }
                i10++;
            }
            i10 = 1;
        } else {
            z10 = false;
            j10 = 0;
            j3 = 0;
        }
        String str3 = map.get("Expires");
        long a11 = str3 != null ? a(str3) : 0L;
        String str4 = map.get("Last-Modified");
        long a12 = str4 != null ? a(str4) : 0L;
        String str5 = map.get("ETag");
        if (i10 != 0) {
            j12 = currentTimeMillis + (j10 * 1000);
            if (z10) {
                j13 = j12;
            } else {
                Long.signum(j3);
                j13 = (j3 * 1000) + j12;
            }
            j11 = j13;
        } else {
            j11 = 0;
            if (a10 <= 0 || a11 < a10) {
                j12 = 0;
            } else {
                j12 = currentTimeMillis + (a11 - a10);
                j11 = j12;
            }
        }
        p3 p3Var = new p3();
        p3Var.f12393a = b4Var.f6356b;
        p3Var.f12394b = str5;
        p3Var.f12398f = j12;
        p3Var.f12397e = j11;
        p3Var.f12395c = a10;
        p3Var.f12396d = a12;
        p3Var.f12399g = map;
        p3Var.f12400h = b4Var.f6358d;
        return p3Var;
    }
}
