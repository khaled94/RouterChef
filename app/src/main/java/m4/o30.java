package m4;

import android.content.DialogInterface;

/* loaded from: classes.dex */
public final class o30 implements DialogInterface.OnClickListener {

    /* renamed from: s */
    public final /* synthetic */ p30 f11987s;

    public o30(p30 p30Var) {
        this.f11987s = p30Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        this.f11987s.c("User canceled the download.");
    }
}
