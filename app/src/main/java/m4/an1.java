package m4;

import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import h4.e;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Objects;
import java.util.TreeSet;
import y4.e5;
import y4.f4;
import y4.h6;
import y4.j1;
import y4.l4;
import y4.u4;
import y4.w2;

/* loaded from: classes.dex */
public final /* synthetic */ class an1 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f6214s;

    /* renamed from: t */
    public final /* synthetic */ Object f6215t;

    /* renamed from: u */
    public final /* synthetic */ Object f6216u;

    public /* synthetic */ an1(Object obj, Object obj2, int i10) {
        this.f6214s = i10;
        this.f6215t = obj;
        this.f6216u = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        String str2;
        String str3;
        long j3;
        switch (this.f6214s) {
            case 0:
                InputStream inputStream = (InputStream) this.f6215t;
                try {
                    ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream((ParcelFileDescriptor) this.f6216u);
                    try {
                        e.b(inputStream, autoCloseOutputStream, false);
                        autoCloseOutputStream.close();
                        inputStream.close();
                        return;
                    } catch (Throwable th) {
                        try {
                            autoCloseOutputStream.close();
                        } catch (Throwable unused) {
                        }
                        throw th;
                    }
                } catch (IOException unused2) {
                    return;
                }
            case 1:
                fo2 fo2Var = ((eo2) this.f6215t).f8030b;
                int i10 = ls1.f10971a;
                fo2Var.D((String) this.f6216u);
                return;
            case 2:
                f4 f4Var = (f4) this.f6215t;
                Bundle bundle = (Bundle) this.f6216u;
                if (bundle == null) {
                    ((w2) f4Var.f20505s).s().N.b(new Bundle());
                    return;
                }
                Bundle a10 = ((w2) f4Var.f20505s).s().N.a();
                for (String str4 : bundle.keySet()) {
                    Object obj = bundle.get(str4);
                    if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                        if (((w2) f4Var.f20505s).z().T(obj)) {
                            ((w2) f4Var.f20505s).z().y(f4Var.H, null, 27, null, null, 0);
                        }
                        ((w2) f4Var.f20505s).C().C.c("Invalid default event parameter type. Name, value", str4, obj);
                    } else if (h6.V(str4)) {
                        ((w2) f4Var.f20505s).C().C.b("Invalid default event parameter name. Name", str4);
                    } else if (obj == null) {
                        a10.remove(str4);
                    } else {
                        h6 z10 = ((w2) f4Var.f20505s).z();
                        Objects.requireNonNull((w2) f4Var.f20505s);
                        if (z10.N("param", str4, 100, obj)) {
                            ((w2) f4Var.f20505s).z().z(a10, str4, obj);
                        }
                    }
                }
                ((w2) f4Var.f20505s).z();
                int k10 = ((w2) f4Var.f20505s).y.k();
                if (a10.size() > k10) {
                    Iterator it = new TreeSet(a10.keySet()).iterator();
                    int i11 = 0;
                    while (it.hasNext()) {
                        String str5 = (String) it.next();
                        i11++;
                        if (i11 > k10) {
                            a10.remove(str5);
                        }
                    }
                    ((w2) f4Var.f20505s).z().y(f4Var.H, null, 26, null, null, 0);
                    ((w2) f4Var.f20505s).C().C.a("Too many default event parameters set. Discarding beyond event parameter limit");
                }
                ((w2) f4Var.f20505s).s().N.b(a10);
                e5 x10 = ((w2) f4Var.f20505s).x();
                x10.g();
                x10.h();
                x10.s(new u4(x10, x10.p(false), a10));
                return;
            default:
                Object obj2 = this.f6216u;
                e5 e5Var = (e5) obj2;
                j1 j1Var = e5Var.f20389v;
                if (j1Var == null) {
                    ((w2) e5Var.f20505s).C().f20710x.a("Failed to send current screen to service");
                    return;
                }
                try {
                    l4 l4Var = (l4) this.f6215t;
                    if (l4Var == null) {
                        str = ((w2) ((e5) obj2).f20505s).f20786s.getPackageName();
                        str2 = null;
                        j3 = 0;
                        str3 = null;
                    } else {
                        j3 = l4Var.f20553c;
                        str3 = l4Var.f20551a;
                        String str6 = l4Var.f20552b;
                        str = ((w2) ((e5) obj2).f20505s).f20786s.getPackageName();
                        str2 = str6;
                    }
                    j1Var.z0(j3, str3, str2, str);
                    ((e5) this.f6216u).r();
                    return;
                } catch (RemoteException e10) {
                    ((w2) ((e5) this.f6216u).f20505s).C().f20710x.b("Failed to send current screen to the service", e10);
                    return;
                }
        }
    }

    public an1(e5 e5Var, l4 l4Var) {
        this.f6214s = 3;
        this.f6216u = e5Var;
        this.f6215t = l4Var;
    }
}
