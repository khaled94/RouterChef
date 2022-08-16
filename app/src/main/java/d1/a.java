package d1;

import androidx.lifecycle.j0;
import androidx.lifecycle.l;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public abstract class a {
    public static <T extends l & j0> a b(T t10) {
        return new b(t10, t10.w());
    }

    @Deprecated
    public abstract void a(String str, PrintWriter printWriter);
}
