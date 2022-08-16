package m4;

import android.content.Context;
import android.media.MediaFormat;
import android.view.Surface;
import l3.a;
import l3.s;

/* loaded from: classes.dex */
public final /* synthetic */ class ee0 implements wy1 {

    /* renamed from: s */
    public final Object f7804s;

    /* renamed from: t */
    public final Object f7805t;

    /* renamed from: u */
    public final Object f7806u;

    /* renamed from: v */
    public final Object f7807v;

    /* renamed from: w */
    public final String f7808w;

    public /* synthetic */ ee0(Context context, w7 w7Var, o90 o90Var, a aVar, String str) {
        this.f7804s = context;
        this.f7805t = w7Var;
        this.f7806u = o90Var;
        this.f7807v = aVar;
        this.f7808w = str;
    }

    public /* synthetic */ ee0(qi2 qi2Var, MediaFormat mediaFormat, t tVar, Surface surface) {
        this.f7804s = qi2Var;
        this.f7805t = mediaFormat;
        this.f7806u = tVar;
        this.f7807v = surface;
        this.f7808w = null;
    }

    @Override // m4.wy1
    public final tz1 zza() {
        Context context = (Context) this.f7804s;
        w7 w7Var = (w7) this.f7805t;
        o90 o90Var = (o90) this.f7806u;
        a aVar = (a) this.f7807v;
        String str = this.f7808w;
        ge0 ge0Var = s.B.f5790d;
        vd0 a10 = ge0.a(context, cf0.a(), "", false, false, w7Var, null, o90Var, null, aVar, new wj(), null, null);
        v90 v90Var = new v90(a10);
        he0 he0Var = (he0) a10;
        ((ce0) he0Var.q0()).y = new m7(v90Var, 2);
        he0Var.loadUrl(str);
        return v90Var;
    }
}
