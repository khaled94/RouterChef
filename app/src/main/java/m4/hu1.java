package m4;

import androidx.activity.k;
import java.security.Provider;
import java.util.Objects;
import javax.annotation.CheckForNull;
import javax.crypto.KeyAgreement;

/* loaded from: classes.dex */
public final class hu1 implements o72, ar0, br2 {

    /* renamed from: s */
    public static hu1 f9452s;

    /* renamed from: t */
    public static final /* synthetic */ hu1 f9453t = new hu1();

    /* renamed from: u */
    public static final bk0 f9454u = new bk0(2);

    /* renamed from: v */
    public static final /* synthetic */ hu1 f9455v = new hu1();

    public static int a(int i10, int i11) {
        String str;
        if (i10 < 0 || i10 >= i11) {
            if (i10 < 0) {
                str = q40.d("%s (%s) must not be negative", "index", Integer.valueOf(i10));
            } else if (i11 < 0) {
                throw new IllegalArgumentException(k.a(26, "negative size: ", i11));
            } else {
                str = q40.d("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
            }
            throw new IndexOutOfBoundsException(str);
        }
        return i10;
    }

    public static int b(int i10, int i11) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(j(i10, i11, "index"));
        }
        return i10;
    }

    public static Object c(@CheckForNull Object obj, @CheckForNull Object obj2) {
        Objects.requireNonNull(obj, (String) obj2);
        return obj;
    }

    public static Object d(@CheckForNull Object obj, String str, @CheckForNull Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(q40.d(str, obj2));
    }

    public static void f(boolean z10, @CheckForNull Object obj) {
        if (z10) {
            return;
        }
        throw new IllegalArgumentException((String) obj);
    }

    public static void g(int i10, int i11, int i12) {
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            throw new IndexOutOfBoundsException((i10 < 0 || i10 > i12) ? j(i10, i12, "start index") : (i11 < 0 || i11 > i12) ? j(i11, i12, "end index") : q40.d("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10)));
        }
    }

    public static void i(boolean z10, @CheckForNull Object obj) {
        if (z10) {
            return;
        }
        throw new IllegalStateException((String) obj);
    }

    public static String j(int i10, int i11, String str) {
        if (i10 < 0) {
            return q40.d("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 < 0) {
            throw new IllegalArgumentException(k.a(26, "negative size: ", i11));
        }
        return q40.d("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
    }

    @Override // m4.o72
    public /* bridge */ /* synthetic */ Object e(String str, Provider provider) {
        return provider == null ? KeyAgreement.getInstance(str) : KeyAgreement.getInstance(str, provider);
    }

    @Override // m4.ar0, m4.ko1
    /* renamed from: h */
    public void mo30h(Object obj) {
        ((dq0) obj).zza();
    }
}
