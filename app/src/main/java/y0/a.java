package y0;

import androidx.fragment.app.o;
import e9.f;

/* loaded from: classes.dex */
public final class a extends i {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(o oVar, String str) {
        super(oVar, "Attempting to reuse fragment " + oVar + " with previous ID " + str);
        f.e(oVar, "fragment");
        f.e(str, "previousFragmentId");
    }
}
