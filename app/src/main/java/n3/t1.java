package n3;

import android.content.Context;
import android.webkit.WebSettings;
import java.util.HashMap;
import java.util.concurrent.Callable;
import m4.es;
import m4.jo;
import s4.hd;
import y4.p2;

/* loaded from: classes.dex */
public final /* synthetic */ class t1 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ int f16571a;

    /* renamed from: b */
    public final /* synthetic */ Object f16572b;

    /* renamed from: c */
    public final /* synthetic */ Object f16573c;

    public /* synthetic */ t1(Object obj, Object obj2, int i10) {
        this.f16571a = i10;
        this.f16572b = obj;
        this.f16573c = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f16571a) {
            case 0:
                Context context = (Context) this.f16572b;
                WebSettings webSettings = (WebSettings) this.f16573c;
                if (context.getCacheDir() != null) {
                    webSettings.setAppCachePath(context.getCacheDir().getAbsolutePath());
                    webSettings.setAppCacheMaxSize(0L);
                    webSettings.setAppCacheEnabled(true);
                }
                webSettings.setDatabasePath(context.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath());
                webSettings.setDatabaseEnabled(true);
                webSettings.setDomStorageEnabled(true);
                webSettings.setDisplayZoomControls(false);
                webSettings.setBuiltInZoomControls(true);
                webSettings.setSupportZoom(true);
                if (((Boolean) jo.f10145d.f10148c.a(es.f8197t0)).booleanValue()) {
                    webSettings.setTextZoom(100);
                }
                webSettings.setAllowContentAccess(false);
                return Boolean.TRUE;
            default:
                final p2 p2Var = (p2) this.f16572b;
                final String str = (String) this.f16573c;
                return new hd(new Callable() { // from class: y4.n2
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        p2 p2Var2 = p2.this;
                        String str2 = str;
                        i iVar = p2Var2.f20760t.f20294u;
                        a6.I(iVar);
                        z2 F = iVar.F(str2);
                        HashMap hashMap = new HashMap();
                        hashMap.put("platform", "android");
                        hashMap.put("package_name", str2);
                        ((w2) p2Var2.f20505s).y.o();
                        hashMap.put("gmp_version", 43042L);
                        if (F != null) {
                            String P = F.P();
                            if (P != null) {
                                hashMap.put("app_version", P);
                            }
                            hashMap.put("app_version_int", Long.valueOf(F.B()));
                            hashMap.put("dynamite_version", Long.valueOf(F.E()));
                        }
                        return hashMap;
                    }
                });
        }
    }
}
