package m4;

import android.graphics.Point;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import k4.a;
import k4.b;
import m4.cu1;
import m4.mz1;
import m4.s7;
import m4.tz1;
import m4.x7;
import n3.g1;
import n3.v0;
import t3.q;
import t3.x;
import t3.y;
import t3.z;

/* loaded from: classes.dex */
public abstract class h80 extends ba implements i80 {

    /* renamed from: s */
    public static final /* synthetic */ int f9136s = 0;

    public h80() {
        super("com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.util.concurrent.Executor, m4.uz1] */
    @Override // m4.ba
    public final boolean M3(int i10, Parcel parcel, Parcel parcel2) {
        Map<String, WeakReference<View>> map;
        String str;
        Map<String, WeakReference<View>> map2;
        String str2 = "";
        boolean z10 = false;
        f80 f80Var = null;
        View view = null;
        switch (i10) {
            case 1:
                a c02 = a.AbstractBinderC0085a.c0(parcel.readStrongBinder());
                m80 m80Var = (m80) ca.a(parcel, m80.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalCallback");
                    f80Var = queryLocalInterface instanceof f80 ? (f80) queryLocalInterface : new d80(readStrongBinder);
                }
                ((z) this).o2(c02, m80Var, f80Var);
                parcel2.writeNoException();
                break;
            case 2:
                a c03 = a.AbstractBinderC0085a.c0(parcel.readStrongBinder());
                z zVar = (z) this;
                if (((Boolean) jo.f10145d.f10148c.a(es.Y4)).booleanValue()) {
                    MotionEvent motionEvent = (MotionEvent) b.e0(c03);
                    r40 r40Var = zVar.f18631z;
                    if (r40Var != null) {
                        view = r40Var.f13136s;
                    }
                    zVar.A = v0.a(motionEvent, view);
                    if (motionEvent.getAction() == 0) {
                        zVar.B = zVar.A;
                    }
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    Point point = zVar.A;
                    obtain.setLocation(point.x, point.y);
                    zVar.f18628v.b(obtain);
                    obtain.recycle();
                }
                parcel2.writeNoException();
                break;
            case 3:
                a.AbstractBinderC0085a.c0(parcel.readStrongBinder());
            case 4:
                a.AbstractBinderC0085a.c0(parcel.readStrongBinder());
                parcel2.writeNoException();
                ca.d(parcel2, null);
                break;
            case 5:
                final ArrayList createTypedArrayList = parcel.createTypedArrayList(Uri.CREATOR);
                final a c04 = a.AbstractBinderC0085a.c0(parcel.readStrongBinder());
                o40 N3 = n40.N3(parcel.readStrongBinder());
                final z zVar2 = (z) this;
                if (!((Boolean) jo.f10145d.f10148c.a(es.Y4)).booleanValue()) {
                    try {
                        N3.P("The updating URL feature is not enabled.");
                    } catch (RemoteException e10) {
                        g1.h(str2, e10);
                    }
                } else {
                    tz1 Z = zVar2.f18630x.Z(new Callable() { // from class: t3.v
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            z zVar3 = z.this;
                            List<Uri> list = createTypedArrayList;
                            a aVar = c04;
                            s7 s7Var = zVar3.f18628v.f14875b;
                            String e11 = s7Var != null ? s7Var.e(zVar3.f18627u, (View) b.e0(aVar)) : "";
                            if (!TextUtils.isEmpty(e11)) {
                                ArrayList arrayList = new ArrayList();
                                for (Uri uri : list) {
                                    if (!z.N3(uri)) {
                                        g1.j("Not a Google URL: ".concat(String.valueOf(uri)));
                                    } else {
                                        uri = z.R3(uri, "ms", e11);
                                    }
                                    arrayList.add(uri);
                                }
                                if (arrayList.isEmpty()) {
                                    throw new Exception("Empty impression URLs result.");
                                }
                                return arrayList;
                            }
                            throw new Exception("Failed to get view signals.");
                        }
                    });
                    r40 r40Var2 = zVar2.f18631z;
                    if (r40Var2 != null && (map = r40Var2.f13137t) != null && !map.isEmpty()) {
                        z10 = true;
                    }
                    if (z10) {
                        Z = mz1.p(Z, new xy1() { // from class: t3.r
                            @Override // m4.xy1
                            public final tz1 h(Object obj) {
                                z zVar3 = z.this;
                                final List arrayList = (ArrayList) obj;
                                return mz1.o(zVar3.P3("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new cu1() { // from class: t3.n
                                    @Override // m4.cu1
                                    public final Object a(Object obj2) {
                                        List<Uri> list = arrayList;
                                        String str3 = (String) obj2;
                                        ArrayList arrayList2 = new ArrayList();
                                        for (Uri uri : list) {
                                            if (z.N3(uri) && !TextUtils.isEmpty(str3)) {
                                                uri = z.R3(uri, "nas", str3);
                                            }
                                            arrayList2.add(uri);
                                        }
                                        return arrayList2;
                                    }
                                }, zVar3.f18630x);
                            }
                        }, zVar2.f18630x);
                    } else {
                        g1.i("Asset view map is empty.");
                    }
                    mz1.t(Z, new x(zVar2, N3), zVar2.f18626t.b());
                }
                parcel2.writeNoException();
                break;
            case 6:
                ArrayList createTypedArrayList2 = parcel.createTypedArrayList(Uri.CREATOR);
                final a c05 = a.AbstractBinderC0085a.c0(parcel.readStrongBinder());
                o40 N32 = n40.N3(parcel.readStrongBinder());
                final z zVar3 = (z) this;
                try {
                    if (!((Boolean) jo.f10145d.f10148c.a(es.Y4)).booleanValue()) {
                        N32.P("The updating URL feature is not enabled.");
                        str2 = str2;
                    } else if (createTypedArrayList2.size() != 1) {
                        N32.P("There should be only 1 click URL.");
                        str2 = str2;
                    } else {
                        final Uri uri = (Uri) createTypedArrayList2.get(0);
                        if (!z.Q3(uri, z.R, z.S)) {
                            String valueOf = String.valueOf(uri);
                            StringBuilder sb = new StringBuilder(valueOf.length() + 18);
                            sb.append("Not a Google URL: ");
                            sb.append(valueOf);
                            g1.j(sb.toString());
                            N32.A1(createTypedArrayList2);
                            str2 = str2;
                        } else {
                            tz1 Z2 = zVar3.f18630x.Z(new Callable() { // from class: t3.u
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    z zVar4 = z.this;
                                    Uri uri2 = uri;
                                    a aVar = c05;
                                    Objects.requireNonNull(zVar4);
                                    try {
                                        uri2 = zVar4.f18628v.a(uri2, zVar4.f18627u, (View) b.e0(aVar), null);
                                    } catch (x7 e11) {
                                        g1.k("", e11);
                                    }
                                    if (uri2.getQueryParameter("ms") != null) {
                                        return uri2;
                                    }
                                    throw new Exception("Failed to append spam signals to click url.");
                                }
                            });
                            r40 r40Var3 = zVar3.f18631z;
                            String str3 = (r40Var3 == null || (map2 = r40Var3.f13137t) == null || map2.isEmpty()) ? null : 1;
                            if (str3 != null) {
                                q qVar = new q(zVar3, 0);
                                ?? r12 = zVar3.f18630x;
                                Z2 = mz1.p(Z2, qVar, r12);
                                str = r12;
                            } else {
                                g1.i("Asset view map is empty.");
                                str = str3;
                            }
                            mz1.t(Z2, new y(zVar3, N32), zVar3.f18626t.b());
                            str2 = str;
                        }
                    }
                } catch (RemoteException e11) {
                    g1.h(str2, e11);
                }
                parcel2.writeNoException();
                break;
            case 7:
                z zVar4 = (z) this;
                zVar4.f18631z = (r40) ca.a(parcel, r40.CREATOR);
                zVar4.f18629w.b(1);
                parcel2.writeNoException();
                break;
            case 8:
                a c06 = a.AbstractBinderC0085a.c0(parcel.readStrongBinder());
                z zVar5 = (z) this;
                yr<Boolean> yrVar = es.f8132k6;
                jo joVar = jo.f10145d;
                if (((Boolean) joVar.f10148c.a(yrVar)).booleanValue()) {
                    if (((Boolean) joVar.f10148c.a(es.f8140l6)).booleanValue()) {
                        mz1.t(zVar5.O3(zVar5.f18627u, null, "BANNER", null, null).a(), new np0(zVar5, 0), zVar5.f18626t.b());
                    }
                    WebView webView = (WebView) b.e0(c06);
                    if (webView == null) {
                        g1.g("The webView cannot be null.");
                    } else if (zVar5.C.contains(webView)) {
                        g1.i("This webview has already been registered.");
                    } else {
                        zVar5.C.add(webView);
                        webView.addJavascriptInterface(new t3.a(webView, zVar5.f18628v), "gmaSdk");
                    }
                }
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}
