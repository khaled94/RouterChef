package u7;

import android.content.Intent;
import c5.j;
import java.util.Objects;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ k f19507s;

    /* renamed from: t */
    public final /* synthetic */ Intent f19508t;

    /* renamed from: u */
    public final /* synthetic */ j f19509u;

    public /* synthetic */ i(k kVar, Intent intent, j jVar) {
        this.f19507s = kVar;
        this.f19508t = intent;
        this.f19509u = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k kVar = this.f19507s;
        Intent intent = this.f19508t;
        j jVar = this.f19509u;
        Objects.requireNonNull(kVar);
        try {
            kVar.c(intent);
        } finally {
            jVar.b(null);
        }
    }
}
