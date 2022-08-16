package n3;

import android.content.DialogInterface;
import android.net.Uri;
import l3.s;

/* loaded from: classes.dex */
public final class x implements DialogInterface.OnClickListener {

    /* renamed from: s */
    public final /* synthetic */ y f16593s;

    public x(y yVar) {
        this.f16593s = yVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        s1 s1Var = s.B.f5789c;
        s1.u(this.f16593s.f16597s, Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
    }
}
