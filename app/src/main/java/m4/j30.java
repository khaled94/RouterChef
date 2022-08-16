package m4;

import android.content.DialogInterface;

/* loaded from: classes.dex */
public final class j30 implements DialogInterface.OnClickListener {

    /* renamed from: s */
    public final /* synthetic */ k30 f9826s;

    public j30(k30 k30Var) {
        this.f9826s = k30Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        this.f9826s.c("Operation denied by user.");
    }
}
