package p0;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import f8.h2;
import p0.e;

/* loaded from: classes.dex */
public final class b extends InputConnectionWrapper {

    /* renamed from: a */
    public final /* synthetic */ d f16857a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(InputConnection inputConnection, d dVar) {
        super(inputConnection, false);
        this.f16857a = dVar;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
        d dVar = this.f16857a;
        e eVar = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            eVar = new e(new e.a(inputContentInfo));
        }
        if (((h2) dVar).c(eVar, i10, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i10, bundle);
    }
}
