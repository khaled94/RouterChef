package t6;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Locale;

/* loaded from: classes.dex */
public final class e implements t6.a {

    /* renamed from: d */
    public static final Charset f18690d = Charset.forName("UTF-8");

    /* renamed from: a */
    public final File f18691a;

    /* renamed from: b */
    public final int f18692b = 65536;

    /* renamed from: c */
    public c f18693c;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public final byte[] f18694a;

        /* renamed from: b */
        public final int f18695b;

        public a(byte[] bArr, int i10) {
            this.f18694a = bArr;
            this.f18695b = i10;
        }
    }

    public e(File file) {
        this.f18691a = file;
    }

    @Override // t6.a
    public final void a() {
        s6.e.a(this.f18693c, "There was a problem closing the Crashlytics log file.");
        this.f18693c = null;
    }

    @Override // t6.a
    public final String b() {
        byte[] d5 = d();
        if (d5 != null) {
            return new String(d5, f18690d);
        }
        return null;
    }

    @Override // t6.a
    public final void c(long j3, String str) {
        int i10;
        e();
        if (this.f18693c == null) {
            return;
        }
        if (str == null) {
            str = "null";
        }
        try {
            if (str.length() > this.f18692b / 4) {
                str = "..." + str.substring(str.length() - i10);
            }
            this.f18693c.b(String.format(Locale.US, "%d %s%n", Long.valueOf(j3), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(f18690d));
            while (!this.f18693c.H() && this.f18693c.e0() > this.f18692b) {
                this.f18693c.Y();
            }
        } catch (IOException e10) {
            Log.e("FirebaseCrashlytics", "There was a problem writing to the Crashlytics log.", e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final byte[] d() {
        /*
            r7 = this;
            java.io.File r0 = r7.f18691a
            boolean r0 = r0.exists()
            r1 = 0
            r2 = 0
            if (r0 != 0) goto Lb
            goto L12
        Lb:
            r7.e()
            t6.c r0 = r7.f18693c
            if (r0 != 0) goto L14
        L12:
            r4 = r1
            goto L39
        L14:
            r3 = 1
            int[] r3 = new int[r3]
            r3[r2] = r2
            int r0 = r0.e0()
            byte[] r0 = new byte[r0]
            t6.c r4 = r7.f18693c     // Catch: java.io.IOException -> L2a
            t6.d r5 = new t6.d     // Catch: java.io.IOException -> L2a
            r5.<init>(r0, r3)     // Catch: java.io.IOException -> L2a
            r4.G(r5)     // Catch: java.io.IOException -> L2a
            goto L32
        L2a:
            r4 = move-exception
            java.lang.String r5 = "FirebaseCrashlytics"
            java.lang.String r6 = "A problem occurred while reading the Crashlytics log file."
            android.util.Log.e(r5, r6, r4)
        L32:
            t6.e$a r4 = new t6.e$a
            r3 = r3[r2]
            r4.<init>(r0, r3)
        L39:
            if (r4 != 0) goto L3c
            return r1
        L3c:
            int r0 = r4.f18695b
            byte[] r1 = new byte[r0]
            byte[] r3 = r4.f18694a
            java.lang.System.arraycopy(r3, r2, r1, r2, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.e.d():byte[]");
    }

    public final void e() {
        if (this.f18693c == null) {
            try {
                this.f18693c = new c(this.f18691a);
            } catch (IOException e10) {
                StringBuilder c10 = androidx.activity.result.a.c("Could not open log file: ");
                c10.append(this.f18691a);
                Log.e("FirebaseCrashlytics", c10.toString(), e10);
            }
        }
    }
}
