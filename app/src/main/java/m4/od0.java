package m4;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* loaded from: classes.dex */
public final class od0 implements DialogInterface.OnClickListener {

    /* renamed from: s */
    public final /* synthetic */ JsResult f12114s;

    public od0(JsResult jsResult) {
        this.f12114s = jsResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        this.f12114s.cancel();
    }
}
