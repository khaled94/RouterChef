package m4;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

/* loaded from: classes.dex */
public final class rd0 implements DialogInterface.OnClickListener {

    /* renamed from: s */
    public final /* synthetic */ JsPromptResult f13257s;

    public rd0(JsPromptResult jsPromptResult) {
        this.f13257s = jsPromptResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        this.f13257s.cancel();
    }
}
