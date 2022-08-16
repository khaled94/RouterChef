package m4;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

/* loaded from: classes.dex */
public final class qd0 implements DialogInterface.OnCancelListener {

    /* renamed from: s */
    public final /* synthetic */ JsPromptResult f12803s;

    public qd0(JsPromptResult jsPromptResult) {
        this.f12803s = jsPromptResult;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f12803s.cancel();
    }
}
