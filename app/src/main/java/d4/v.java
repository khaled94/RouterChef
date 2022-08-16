package d4;

import android.app.Activity;
import android.content.Intent;

/* loaded from: classes.dex */
public final class v extends x {

    /* renamed from: s */
    public final /* synthetic */ Intent f3925s;

    /* renamed from: t */
    public final /* synthetic */ Activity f3926t;

    /* renamed from: u */
    public final /* synthetic */ int f3927u = 2;

    public v(Intent intent, Activity activity) {
        this.f3925s = intent;
        this.f3926t = activity;
    }

    @Override // d4.x
    public final void a() {
        Intent intent = this.f3925s;
        if (intent != null) {
            this.f3926t.startActivityForResult(intent, this.f3927u);
        }
    }
}
