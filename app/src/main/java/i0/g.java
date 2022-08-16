package i0;

import androidx.activity.result.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

/* loaded from: classes.dex */
public final class g implements h {

    /* renamed from: b */
    public static final Locale[] f5168b = new Locale[0];

    /* renamed from: a */
    public final Locale[] f5169a;

    static {
        new Locale("en", "XA");
        new Locale("ar", "XB");
        int i10 = f.f5166b;
        String[] split = "en-Latn".split("-", -1);
        if (split.length > 2) {
            new Locale(split[0], split[1], split[2]);
        } else if (split.length > 1) {
            new Locale(split[0], split[1]);
        } else if (split.length != 1) {
            throw new IllegalArgumentException("Can not parse language tag: [en-Latn]");
        } else {
            new Locale(split[0]);
        }
    }

    public g(Locale... localeArr) {
        if (localeArr.length == 0) {
            this.f5169a = f5168b;
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < localeArr.length; i10++) {
            Locale locale = localeArr[i10];
            if (locale == null) {
                throw new NullPointerException("list[" + i10 + "] is null");
            }
            if (!hashSet.contains(locale)) {
                Locale locale2 = (Locale) locale.clone();
                arrayList.add(locale2);
                locale2.getLanguage();
                String country = locale2.getCountry();
                if (country != null && !country.isEmpty()) {
                    locale2.getCountry();
                }
                hashSet.add(locale2);
            }
        }
        this.f5169a = (Locale[]) arrayList.toArray(new Locale[0]);
    }

    @Override // i0.h
    public final Object a() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        Locale[] localeArr = ((g) obj).f5169a;
        if (this.f5169a.length != localeArr.length) {
            return false;
        }
        int i10 = 0;
        while (true) {
            Locale[] localeArr2 = this.f5169a;
            if (i10 >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[i10].equals(localeArr[i10])) {
                return false;
            }
            i10++;
        }
    }

    @Override // i0.h
    public final Locale get() {
        Locale[] localeArr = this.f5169a;
        if (localeArr.length > 0) {
            return localeArr[0];
        }
        return null;
    }

    public final int hashCode() {
        int i10 = 1;
        for (Locale locale : this.f5169a) {
            i10 = (i10 * 31) + locale.hashCode();
        }
        return i10;
    }

    public final String toString() {
        StringBuilder c10 = a.c("[");
        int i10 = 0;
        while (true) {
            Locale[] localeArr = this.f5169a;
            if (i10 >= localeArr.length) {
                c10.append("]");
                return c10.toString();
            }
            c10.append(localeArr[i10]);
            if (i10 < this.f5169a.length - 1) {
                c10.append(',');
            }
            i10++;
        }
    }
}
