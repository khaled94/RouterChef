package t1;

import android.annotation.SuppressLint;
import java.util.Collections;
import java.util.List;

@SuppressLint({"AddedAbstractMethod"})
/* loaded from: classes.dex */
public abstract class o {
    public abstract k a(List list);

    public final k b(p pVar) {
        return a(Collections.singletonList(pVar));
    }
}
