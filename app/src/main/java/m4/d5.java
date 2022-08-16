package m4;

import android.content.Context;
import android.os.RemoteException;
import f3.a;
import java.io.File;
import java.util.Map;
import n3.g1;
import p3.d;

/* loaded from: classes.dex */
public final class d5 implements v4, d, kz1, rk1 {

    /* renamed from: s */
    public Object f7222s;

    /* renamed from: t */
    public final /* synthetic */ Object f7223t;

    public /* synthetic */ d5(Context context) {
        this.f7223t = context;
        this.f7222s = null;
    }

    public /* synthetic */ d5(Map map) {
        this.f7222s = "sendMessageToNativeJs";
        this.f7223t = map;
    }

    public /* synthetic */ d5(i20 i20Var, l10 l10Var) {
        this.f7222s = i20Var;
        this.f7223t = l10Var;
    }

    @Override // m4.kz1
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ((vd0) obj).a((String) this.f7222s, (Map) this.f7223t);
    }

    @Override // p3.d
    public final void e(a aVar) {
        try {
            ((i20) this.f7222s).t(aVar.a());
        } catch (RemoteException e10) {
            g1.h("", e10);
        }
    }

    @Override // m4.kz1
    public final void f(Throwable th) {
    }

    @Override // m4.rk1
    public final void h(Object obj) {
        ((ip) obj).d2((String) this.f7222s, (String) this.f7223t);
    }

    @Override // m4.v4
    /* renamed from: zza */
    public final File mo29zza() {
        if (((File) this.f7222s) == null) {
            this.f7222s = new File(((Context) this.f7223t).getCacheDir(), "volley");
        }
        return (File) this.f7222s;
    }
}
