package m4;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.io.File;
import r2.d;

/* loaded from: classes.dex */
public final class ft1 {

    /* renamed from: a */
    public final File f8642a;

    /* renamed from: b */
    public final File f8643b;

    /* renamed from: c */
    public final SharedPreferences f8644c;

    /* renamed from: d */
    public final int f8645d;

    public ft1(Context context, int i10) {
        this.f8644c = context.getSharedPreferences("pcvmspf", 0);
        File dir = context.getDir("pccache", 0);
        d.c(dir, false);
        this.f8642a = dir;
        File dir2 = context.getDir("tmppccache", 0);
        d.c(dir2, true);
        this.f8643b = dir2;
        this.f8645d = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(m4.x9 r8, m4.np0 r9) {
        /*
            Method dump skipped, instructions count: 471
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.ft1.a(m4.x9, m4.np0):boolean");
    }

    public final z9 b(int i10) {
        SharedPreferences sharedPreferences;
        String str;
        if (i10 == 1) {
            sharedPreferences = this.f8644c;
            str = e();
        } else {
            sharedPreferences = this.f8644c;
            str = d();
        }
        String string = sharedPreferences.getString(str, null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            byte[] j3 = e9.d.j(string);
            l82 l82Var = n82.f11571t;
            z9 B = z9.B(n82.D(j3, 0, j3.length));
            String E = B.E();
            File f10 = d.f(E, "pcam.jar", c());
            if (!f10.exists()) {
                f10 = d.f(E, "pcam", c());
            }
            File f11 = d.f(E, "pcbc", c());
            if (f10.exists()) {
                if (f11.exists()) {
                    return B;
                }
            }
        } catch (x92 unused) {
        }
        return null;
    }

    public final File c() {
        File file = new File(this.f8642a, Integer.toString(this.f8645d - 1));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    public final String d() {
        int i10 = this.f8645d;
        StringBuilder sb = new StringBuilder(17);
        sb.append("FBAMTD");
        sb.append(i10 - 1);
        return sb.toString();
    }

    public final String e() {
        int i10 = this.f8645d;
        StringBuilder sb = new StringBuilder(17);
        sb.append("LATMTD");
        sb.append(i10 - 1);
        return sb.toString();
    }
}
