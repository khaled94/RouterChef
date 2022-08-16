package d4;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.fragment.app.b1;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* loaded from: classes.dex */
public final class m {
    public static void a(boolean z10) {
        if (z10) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void b(boolean z10, Object obj) {
        if (z10) {
            return;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    public static void c(Handler handler) {
        Looper myLooper = Looper.myLooper();
        if (myLooper != handler.getLooper()) {
            String name = myLooper != null ? myLooper.getThread().getName() : "null current looper";
            String name2 = handler.getLooper().getThread().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name2).length() + 36 + String.valueOf(name).length());
            b1.b(sb, "Must be called on ", name2, " thread, but got ", name);
            sb.append(".");
            throw new IllegalStateException(sb.toString());
        }
    }

    public static void d(String str) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            return;
        }
        throw new IllegalStateException(str);
    }

    @EnsuresNonNull({"#1"})
    public static String e(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException("Given String is empty or null");
    }

    @EnsuresNonNull({"#1"})
    public static String f(String str, Object obj) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    public static void g(String str) {
        if (!(Looper.getMainLooper() == Looper.myLooper())) {
            return;
        }
        throw new IllegalStateException(str);
    }

    @EnsuresNonNull({"#1"})
    public static <T> T h(T t10) {
        Objects.requireNonNull(t10, "null reference");
        return t10;
    }

    @EnsuresNonNull({"#1"})
    public static <T> T i(T t10, Object obj) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static void j(boolean z10) {
        if (z10) {
            return;
        }
        throw new IllegalStateException();
    }

    public static void k(boolean z10, Object obj) {
        if (z10) {
            return;
        }
        throw new IllegalStateException(String.valueOf(obj));
    }
}
