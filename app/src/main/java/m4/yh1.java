package m4;

import java.util.concurrent.Callable;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class yh1 implements eh1<zh1> {

    /* renamed from: a */
    public final uz1 f15786a;

    public yh1(uz1 uz1Var) {
        this.f15786a = uz1Var;
    }

    @Override // m4.eh1
    public final tz1<zh1> a() {
        return this.f15786a.Z(new Callable() { // from class: m4.xh1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zh1(new JSONObject());
            }
        });
    }
}
