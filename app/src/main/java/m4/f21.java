package m4;

import android.os.Bundle;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class f21 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ int f8344a;

    /* renamed from: b */
    public final /* synthetic */ Object f8345b;

    public /* synthetic */ f21(Object obj, int i10) {
        this.f8344a = i10;
        this.f8345b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f8344a) {
            case 0:
                ((j21) this.f8345b).f9812e.a(Boolean.TRUE);
                return null;
            default:
                od1 od1Var = (od1) this.f8345b;
                Objects.requireNonNull(od1Var);
                List<String> asList = Arrays.asList(((String) jo.f10145d.f10148c.a(es.U0)).split(";"));
                Bundle bundle = new Bundle();
                for (String str : asList) {
                    try {
                        ym1 b10 = od1Var.f12116b.b(str, new JSONObject());
                        b10.a();
                        Bundle bundle2 = new Bundle();
                        e30 o10 = b10.f15839a.o();
                        if (o10 != null) {
                            try {
                                bundle2.putString("sdk_version", o10.toString());
                            } catch (pm1 unused) {
                            }
                        }
                        e30 l10 = b10.f15839a.l();
                        if (l10 != null) {
                            try {
                                bundle2.putString("adapter_version", l10.toString());
                            } catch (pm1 unused2) {
                            }
                        }
                        bundle.putBundle(str, bundle2);
                    } catch (pm1 unused3) {
                    }
                }
                return new pd1(bundle);
        }
    }
}
