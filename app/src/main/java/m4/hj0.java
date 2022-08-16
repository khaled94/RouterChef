package m4;

import android.content.Context;
import java.util.UUID;
import l3.s;
import n3.s1;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class hj0 implements nd2 {

    /* renamed from: a */
    public final /* synthetic */ int f9358a;

    /* renamed from: b */
    public final vd2 f9359b;

    /* renamed from: c */
    public final vd2 f9360c;

    /* renamed from: d */
    public final vd2 f9361d;

    /* renamed from: e */
    public final vd2 f9362e;

    public /* synthetic */ hj0(vd2 vd2Var, vd2 vd2Var2, vd2 vd2Var3, vd2 vd2Var4, int i10) {
        this.f9358a = i10;
        this.f9359b = vd2Var;
        this.f9360c = vd2Var2;
        this.f9361d = vd2Var3;
        this.f9362e = vd2Var4;
    }

    @Override // m4.vd2
    public final Object a() {
        switch (this.f9358a) {
            case 0:
                ((mm0) this.f9359b).b();
                o90 b10 = ((vf0) this.f9360c).b();
                JSONObject jSONObject = (JSONObject) this.f9361d.a();
                String str = (String) this.f9362e.a();
                boolean equals = "native".equals(str);
                s1 s1Var = s.B.f5789c;
                return new nh(UUID.randomUUID().toString(), b10, str, jSONObject, equals);
            default:
                return new dc1((Context) this.f9359b.a(), (po) ((zt0) this.f9360c).f16331a.f15905u, ((mo0) this.f9361d).b(), ((nk0) ((vk0) this.f9362e).f14709a).a());
        }
    }
}
