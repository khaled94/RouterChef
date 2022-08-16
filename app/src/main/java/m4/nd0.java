package m4;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* loaded from: classes.dex */
public final class nd0 implements DialogInterface.OnCancelListener {

    /* renamed from: s */
    public final /* synthetic */ JsResult f11632s;

    public nd0(JsResult jsResult) {
        this.f11632s = jsResult;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f11632s.cancel();
    }
}
