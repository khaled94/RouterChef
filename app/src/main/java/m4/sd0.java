package m4;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.widget.EditText;

/* loaded from: classes.dex */
public final class sd0 implements DialogInterface.OnClickListener {

    /* renamed from: s */
    public final /* synthetic */ JsPromptResult f13600s;

    /* renamed from: t */
    public final /* synthetic */ EditText f13601t;

    public sd0(JsPromptResult jsPromptResult, EditText editText) {
        this.f13600s = jsPromptResult;
        this.f13601t = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        this.f13600s.confirm(this.f13601t.getText().toString());
    }
}
