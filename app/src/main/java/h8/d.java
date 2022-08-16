package h8;

import android.util.Log;
import androidx.fragment.app.v;
import h8.e;

/* loaded from: classes.dex */
public final class d extends v {

    /* renamed from: a */
    public final /* synthetic */ e.a f5148a;

    public d(e.a aVar) {
        this.f5148a = aVar;
    }

    @Override // androidx.fragment.app.v
    public final void f() {
        Log.i("onAdDismissedFullScreenContent >>>>>>>>>>>>>>>>>> ", "The ad was dismissed.");
        e eVar = e.this;
        eVar.f5151c = null;
        eVar.a();
    }

    @Override // androidx.fragment.app.v
    public final void g() {
        Log.i("onAdFailedToShowFullScreenContent >>>>>>>>>>>>>>>>>> ", "The ad failed to show.");
        e eVar = e.this;
        eVar.f5151c = null;
        eVar.a();
    }

    @Override // androidx.fragment.app.v
    public final void h() {
        Log.i("onAdShowedFullScreenContent >>>>>>>>>>>>>>>>>> ", "The ad was shown.");
    }
}
