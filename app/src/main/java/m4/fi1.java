package m4;

import java.util.concurrent.Callable;
import org.json.JSONObject;
import s4.gd;
import y4.p2;

/* loaded from: classes.dex */
public final /* synthetic */ class fi1 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ int f8567a;

    /* renamed from: b */
    public final /* synthetic */ Object f8568b;

    public /* synthetic */ fi1(Object obj, int i10) {
        this.f8567a = i10;
        this.f8568b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f8567a) {
            case 0:
                return new hi1(new JSONObject());
            default:
                return new gd(((p2) this.f8568b).B);
        }
    }
}
