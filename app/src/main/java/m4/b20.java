package m4;

import android.os.RemoteException;
import d4.m;
import f3.a;
import h3.e;
import n3.g1;
import o2.g;
import p3.h;
import p3.j;
import p3.l;

/* loaded from: classes.dex */
public final class b20 implements h, j, l {

    /* renamed from: a */
    public final l10 f6341a;

    /* renamed from: b */
    public g f6342b;

    /* renamed from: c */
    public e f6343c;

    public b20(l10 l10Var) {
        this.f6341a = l10Var;
    }

    public final void a() {
        m.d("#008 Must be called on the main UI thread.");
        g1.e("Adapter called onAdClosed.");
        try {
            this.f6341a.d();
        } catch (RemoteException e10) {
            g1.l("#007 Could not call remote method.", e10);
        }
    }

    public final void b() {
        m.d("#008 Must be called on the main UI thread.");
        g1.e("Adapter called onAdFailedToLoad with error 0.");
        try {
            this.f6341a.A(0);
        } catch (RemoteException e10) {
            g1.l("#007 Could not call remote method.", e10);
        }
    }

    public final void c(a aVar) {
        m.d("#008 Must be called on the main UI thread.");
        int i10 = aVar.f4481a;
        String str = aVar.f4482b;
        String str2 = aVar.f4483c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 97 + String.valueOf(str2).length());
        sb.append("Adapter called onAdFailedToLoad with error. ErrorCode: ");
        sb.append(i10);
        sb.append(". ErrorMessage: ");
        sb.append(str);
        sb.append(". ErrorDomain: ");
        sb.append(str2);
        g1.e(sb.toString());
        try {
            this.f6341a.w3(aVar.a());
        } catch (RemoteException e10) {
            g1.l("#007 Could not call remote method.", e10);
        }
    }

    public final void d(a aVar) {
        m.d("#008 Must be called on the main UI thread.");
        int i10 = aVar.f4481a;
        String str = aVar.f4482b;
        String str2 = aVar.f4483c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 97 + String.valueOf(str2).length());
        sb.append("Adapter called onAdFailedToLoad with error. ErrorCode: ");
        sb.append(i10);
        sb.append(". ErrorMessage: ");
        sb.append(str);
        sb.append(". ErrorDomain: ");
        sb.append(str2);
        g1.e(sb.toString());
        try {
            this.f6341a.w3(aVar.a());
        } catch (RemoteException e10) {
            g1.l("#007 Could not call remote method.", e10);
        }
    }

    public final void e(a aVar) {
        m.d("#008 Must be called on the main UI thread.");
        int i10 = aVar.f4481a;
        String str = aVar.f4482b;
        String str2 = aVar.f4483c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 97 + String.valueOf(str2).length());
        sb.append("Adapter called onAdFailedToLoad with error. ErrorCode: ");
        sb.append(i10);
        sb.append(". ErrorMessage: ");
        sb.append(str);
        sb.append(". ErrorDomain: ");
        sb.append(str2);
        g1.e(sb.toString());
        try {
            this.f6341a.w3(aVar.a());
        } catch (RemoteException e10) {
            g1.l("#007 Could not call remote method.", e10);
        }
    }

    public final void f() {
        m.d("#008 Must be called on the main UI thread.");
        g1.e("Adapter called onAdLoaded.");
        try {
            this.f6341a.k();
        } catch (RemoteException e10) {
            g1.l("#007 Could not call remote method.", e10);
        }
    }

    public final void g() {
        m.d("#008 Must be called on the main UI thread.");
        g1.e("Adapter called onAdOpened.");
        try {
            this.f6341a.m();
        } catch (RemoteException e10) {
            g1.l("#007 Could not call remote method.", e10);
        }
    }
}
