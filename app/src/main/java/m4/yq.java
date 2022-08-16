package m4;

import android.content.Context;
import android.os.RemoteException;
import d4.m;
import f3.k;
import java.util.ArrayList;
import javax.annotation.concurrent.GuardedBy;
import k3.a;
import n3.g1;

/* loaded from: classes.dex */
public final class yq {
    @GuardedBy("InternalMobileAds.class")

    /* renamed from: h */
    public static yq f15880h;
    @GuardedBy("lock")

    /* renamed from: c */
    public tp f15883c;

    /* renamed from: g */
    public wq f15887g;

    /* renamed from: b */
    public final Object f15882b = new Object();

    /* renamed from: d */
    public boolean f15884d = false;

    /* renamed from: e */
    public boolean f15885e = false;

    /* renamed from: f */
    public k f15886f = new k(new ArrayList());

    /* renamed from: a */
    public final ArrayList<a> f15881a = new ArrayList<>();

    public static yq a() {
        yq yqVar;
        synchronized (yq.class) {
            if (f15880h == null) {
                f15880h = new yq();
            }
            yqVar = f15880h;
        }
        return yqVar;
    }

    public final String b() {
        String i10;
        synchronized (this.f15882b) {
            m.k(this.f15883c != null, "MobileAds.initialize() must be called prior to getting version string.");
            try {
                i10 = q40.i(this.f15883c.d());
            } catch (RemoteException e10) {
                g1.h("Unable to get version string.", e10);
                return "";
            }
        }
        return i10;
    }

    @GuardedBy("lock")
    public final void c(Context context) {
        if (this.f15883c == null) {
            this.f15883c = new fo(io.f9708f.f9710b, context).d(context, false);
        }
    }
}
