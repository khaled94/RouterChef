package m4;

import android.content.Context;
import android.util.Base64OutputStream;
import android.view.View;
import android.webkit.WebView;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import k4.a;
import n3.g1;
import s4.a4;
import s4.n;
import s4.z;

/* loaded from: classes.dex */
public final class ki implements y30, z {

    /* renamed from: s */
    public final /* synthetic */ int f10434s;

    /* renamed from: t */
    public Object f10435t;

    /* renamed from: u */
    public Object f10436u;

    public ki() {
        this.f10434s = 0;
        this.f10435t = new ByteArrayOutputStream(4096);
        this.f10436u = new Base64OutputStream((ByteArrayOutputStream) this.f10435t, 10);
    }

    public final y30 a() {
        return (y30) (((Boolean) jo.f10145d.f10148c.a(es.f8114i3)).booleanValue() ? this.f10435t : this.f10436u);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.Map<java.lang.String, java.lang.Boolean>, java.util.HashMap] */
    @Override // s4.z
    public final a4 b(n nVar) {
        a4 a10 = ((a4) this.f10435t).a();
        String str = (String) this.f10436u;
        a10.e(str, nVar);
        a10.f17713d.put(str, Boolean.TRUE);
        return a10;
    }

    @Override // m4.y30
    public final void b0(a aVar) {
        a().b0(aVar);
    }

    @Override // m4.y30
    public final a c0(String str, WebView webView, String str2, String str3, a40 a40Var, z30 z30Var, String str4) {
        return a().c0(str, webView, str2, str3, a40Var, z30Var, str4);
    }

    @Override // m4.y30
    public final void d0(a aVar, View view) {
        a().d0(aVar, view);
    }

    @Override // m4.y30
    public final String e0(Context context) {
        return a().e0(context);
    }

    @Override // m4.y30
    public final void f0(a aVar, View view) {
        a().f0(aVar, view);
    }

    @Override // m4.y30
    public final boolean g0(Context context) {
        return a().g0(context);
    }

    @Override // m4.y30
    public final a h0(String str, WebView webView, String str2, a40 a40Var, z30 z30Var, String str3) {
        return a().h0(str, webView, str2, a40Var, z30Var, str3);
    }

    public final String toString() {
        String str;
        switch (this.f10434s) {
            case 0:
                try {
                    ((Base64OutputStream) this.f10436u).close();
                } catch (IOException e10) {
                    g1.h("HashManager: Unable to convert to Base64.", e10);
                }
                try {
                    try {
                        ((ByteArrayOutputStream) this.f10435t).close();
                        str = ((ByteArrayOutputStream) this.f10435t).toString();
                    } catch (IOException e11) {
                        g1.h("HashManager: Unable to convert to Base64.", e11);
                        str = "";
                    }
                    return str;
                } finally {
                    this.f10435t = null;
                    this.f10436u = null;
                }
            default:
                return super.toString();
        }
    }

    @Override // m4.y30
    public final void zze(a aVar) {
        a().zze(aVar);
    }

    public /* synthetic */ ki(Object obj, Object obj2, int i10) {
        this.f10434s = i10;
        this.f10435t = obj;
        this.f10436u = obj2;
    }
}
