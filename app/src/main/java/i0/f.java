package i0;

import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: b */
    public static final /* synthetic */ int f5166b = 0;

    /* renamed from: a */
    public final h f5167a;

    /* loaded from: classes.dex */
    public static class a {
        public static LocaleList a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        public static LocaleList b() {
            return LocaleList.getAdjustedDefault();
        }

        public static LocaleList c() {
            return LocaleList.getDefault();
        }
    }

    static {
        a(new Locale[0]);
    }

    public f(h hVar) {
        this.f5167a = hVar;
    }

    public static f a(Locale... localeArr) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new f(new i(a.a(localeArr)));
        }
        return new f(new g(localeArr));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof f) && this.f5167a.equals(((f) obj).f5167a);
    }

    public final int hashCode() {
        return this.f5167a.hashCode();
    }

    public final String toString() {
        return this.f5167a.toString();
    }
}
