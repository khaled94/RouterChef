package d4;

import android.content.Intent;
import c4.g;

/* loaded from: classes.dex */
public final class w extends x {

    /* renamed from: s */
    public final /* synthetic */ Intent f3928s;

    /* renamed from: t */
    public final /* synthetic */ g f3929t;

    public w(Intent intent, g gVar) {
        this.f3928s = intent;
        this.f3929t = gVar;
    }

    @Override // d4.x
    public final void a() {
        Intent intent = this.f3928s;
        if (intent != null) {
            this.f3929t.d(intent, 2);
        }
    }
}
