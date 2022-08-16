package m4;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import javax.annotation.concurrent.GuardedBy;
import k4.a;
import k4.b;
import n3.g1;

/* loaded from: classes.dex */
public final class x30 implements y30 {

    /* renamed from: t */
    public static final Object f15211t = new Object();
    @GuardedBy("lock")

    /* renamed from: u */
    public static boolean f15212u = false;
    @GuardedBy("lock")

    /* renamed from: v */
    public static boolean f15213v = false;

    /* renamed from: s */
    public cq1 f15214s;

    public final void a(Context context) {
        cq1 cq1Var;
        synchronized (f15211t) {
            if (((Boolean) jo.f10145d.f10148c.a(es.f8098g3)).booleanValue() && !f15213v) {
                try {
                    try {
                        f15213v = true;
                        try {
                            IBinder b10 = DynamiteModule.c(context, DynamiteModule.f2944b, ModuleDescriptor.MODULE_ID).b("com.google.android.gms.ads.omid.DynamiteOmid");
                            int i10 = bq1.f6599s;
                            if (b10 == null) {
                                cq1Var = null;
                            } else {
                                IInterface queryLocalInterface = b10.queryLocalInterface("com.google.android.gms.ads.omid.IOmid");
                                cq1Var = queryLocalInterface instanceof cq1 ? (cq1) queryLocalInterface : new aq1(b10);
                            }
                            this.f15214s = cq1Var;
                        } catch (Exception e10) {
                            throw new m90(e10);
                        }
                    } catch (Exception e11) {
                        throw new m90(e11);
                    }
                } catch (m90 e12) {
                    g1.l("#007 Could not call remote method.", e12);
                }
            }
        }
    }

    @Override // m4.y30
    public final void b0(a aVar) {
        synchronized (f15211t) {
            if (((Boolean) jo.f10145d.f10148c.a(es.f8098g3)).booleanValue() && f15212u) {
                try {
                    this.f15214s.g2(aVar);
                } catch (RemoteException | NullPointerException e10) {
                    g1.l("#007 Could not call remote method.", e10);
                }
            }
        }
    }

    @Override // m4.y30
    public final a c0(String str, WebView webView, String str2, String str3, a40 a40Var, z30 z30Var, String str4) {
        synchronized (f15211t) {
            try {
                try {
                    if (((Boolean) jo.f10145d.f10148c.a(es.f8098g3)).booleanValue() && f15212u) {
                        try {
                            return this.f15214s.E2(str, new b(webView), str2, str3, a40Var.f6039s, z30Var.f15998s, str4);
                        } catch (RemoteException | NullPointerException e10) {
                            g1.l("#007 Could not call remote method.", e10);
                            return null;
                        }
                    }
                    return null;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    @Override // m4.y30
    public final void d0(a aVar, View view) {
        synchronized (f15211t) {
            if (((Boolean) jo.f10145d.f10148c.a(es.f8098g3)).booleanValue() && f15212u) {
                try {
                    this.f15214s.N0(aVar, new b(view));
                } catch (RemoteException | NullPointerException e10) {
                    g1.l("#007 Could not call remote method.", e10);
                }
            }
        }
    }

    @Override // m4.y30
    public final String e0(Context context) {
        if (!((Boolean) jo.f10145d.f10148c.a(es.f8098g3)).booleanValue()) {
            return null;
        }
        try {
            a(context);
            String valueOf = String.valueOf(this.f15214s.e());
            return valueOf.length() != 0 ? "a.".concat(valueOf) : new String("a.");
        } catch (RemoteException | NullPointerException e10) {
            g1.l("#007 Could not call remote method.", e10);
            return null;
        }
    }

    @Override // m4.y30
    public final void f0(a aVar, View view) {
        synchronized (f15211t) {
            if (((Boolean) jo.f10145d.f10148c.a(es.f8098g3)).booleanValue() && f15212u) {
                try {
                    this.f15214s.G1(aVar, new b(view));
                } catch (RemoteException | NullPointerException e10) {
                    g1.l("#007 Could not call remote method.", e10);
                }
            }
        }
    }

    @Override // m4.y30
    public final boolean g0(Context context) {
        Throwable e10;
        synchronized (f15211t) {
            if (!((Boolean) jo.f10145d.f10148c.a(es.f8098g3)).booleanValue()) {
                return false;
            }
            if (f15212u) {
                return true;
            }
            try {
                a(context);
                boolean N = this.f15214s.N(new b(context));
                f15212u = N;
                return N;
            } catch (RemoteException e11) {
                e10 = e11;
                g1.l("#007 Could not call remote method.", e10);
                return false;
            } catch (NullPointerException e12) {
                e10 = e12;
                g1.l("#007 Could not call remote method.", e10);
                return false;
            }
        }
    }

    @Override // m4.y30
    public final a h0(String str, WebView webView, String str2, a40 a40Var, z30 z30Var, String str3) {
        synchronized (f15211t) {
            try {
                try {
                    if (((Boolean) jo.f10145d.f10148c.a(es.f8098g3)).booleanValue() && f15212u) {
                        try {
                            return this.f15214s.O1(str, new b(webView), str2, a40Var.f6039s, z30Var.f15998s, str3);
                        } catch (RemoteException | NullPointerException e10) {
                            g1.l("#007 Could not call remote method.", e10);
                            return null;
                        }
                    }
                    return null;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    @Override // m4.y30
    public final void zze(a aVar) {
        synchronized (f15211t) {
            if (((Boolean) jo.f10145d.f10148c.a(es.f8098g3)).booleanValue() && f15212u) {
                try {
                    this.f15214s.W(aVar);
                } catch (RemoteException | NullPointerException e10) {
                    g1.l("#007 Could not call remote method.", e10);
                }
            }
        }
    }
}
