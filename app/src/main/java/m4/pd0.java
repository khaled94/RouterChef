package m4;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* loaded from: classes.dex */
public final class pd0 implements DialogInterface.OnClickListener {

    /* renamed from: s */
    public final /* synthetic */ JsResult f12485s;

    public pd0(JsResult jsResult) {
        this.f12485s = jsResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        this.f12485s.confirm();
    }
}
