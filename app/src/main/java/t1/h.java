package t1;

import android.util.Log;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a */
    public static h f18469a;

    /* loaded from: classes.dex */
    public static class a extends h {

        /* renamed from: b */
        public int f18470b;

        public a(int i10) {
            this.f18470b = i10;
        }

        @Override // t1.h
        public final void a(String str, String str2, Throwable... thArr) {
            if (this.f18470b <= 3) {
                if (thArr.length >= 1) {
                    Log.d(str, str2, thArr[0]);
                } else {
                    Log.d(str, str2);
                }
            }
        }

        @Override // t1.h
        public final void b(String str, String str2, Throwable... thArr) {
            if (this.f18470b <= 6) {
                if (thArr.length >= 1) {
                    Log.e(str, str2, thArr[0]);
                } else {
                    Log.e(str, str2);
                }
            }
        }

        @Override // t1.h
        public final void d(String str, String str2, Throwable... thArr) {
            if (this.f18470b <= 4) {
                if (thArr.length >= 1) {
                    Log.i(str, str2, thArr[0]);
                } else {
                    Log.i(str, str2);
                }
            }
        }

        @Override // t1.h
        public final void f(String str, String str2, Throwable... thArr) {
            if (this.f18470b <= 5) {
                if (thArr.length >= 1) {
                    Log.w(str, str2, thArr[0]);
                } else {
                    Log.w(str, str2);
                }
            }
        }
    }

    public static synchronized h c() {
        h hVar;
        synchronized (h.class) {
            if (f18469a == null) {
                f18469a = new a(3);
            }
            hVar = f18469a;
        }
        return hVar;
    }

    public static String e(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (length >= 20) {
            str = str.substring(0, 20);
        }
        sb.append(str);
        return sb.toString();
    }

    public abstract void a(String str, String str2, Throwable... thArr);

    public abstract void b(String str, String str2, Throwable... thArr);

    public abstract void d(String str, String str2, Throwable... thArr);

    public abstract void f(String str, String str2, Throwable... thArr);
}
