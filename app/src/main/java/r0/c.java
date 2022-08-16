package r0;

import android.content.Context;
import android.view.LayoutInflater;

/* loaded from: classes.dex */
public abstract class c extends a {
    public int A;
    public int B;
    public LayoutInflater C;

    @Deprecated
    public c(Context context, int i10) {
        super(context);
        this.B = i10;
        this.A = i10;
        this.C = (LayoutInflater) context.getSystemService("layout_inflater");
    }
}
