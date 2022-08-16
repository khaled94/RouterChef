package z9;

import androidx.activity.result.d;
import ba.a;
import ba.b;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import r9.a0;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a */
    public static final f f21089a;

    /* renamed from: b */
    public static final Logger f21090b;

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0091, code lost:
        if (r0 != null) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0126  */
    static {
        /*
            Method dump skipped, instructions count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z9.f.<clinit>():void");
    }

    public static List<String> b(List<a0> list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            a0 a0Var = list.get(i10);
            if (a0Var != a0.HTTP_1_0) {
                arrayList.add(a0Var.f17300s);
            }
        }
        return arrayList;
    }

    public static byte[] e(List<a0> list) {
        ca.f fVar = new ca.f();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            a0 a0Var = list.get(i10);
            if (a0Var != a0.HTTP_1_0) {
                fVar.B0(a0Var.f17300s.length());
                fVar.G0(a0Var.f17300s);
            }
        }
        return fVar.e0();
    }

    public static boolean l() {
        return "Dalvik".equals(System.getProperty("java.vm.name"));
    }

    public void a(SSLSocket sSLSocket) {
    }

    public d c(X509TrustManager x509TrustManager) {
        return new a(d(x509TrustManager));
    }

    public ba.d d(X509TrustManager x509TrustManager) {
        return new b(x509TrustManager.getAcceptedIssuers());
    }

    public void f(SSLSocketFactory sSLSocketFactory) {
    }

    public void g(SSLSocket sSLSocket, @Nullable String str, List<a0> list) {
    }

    public void h(Socket socket, InetSocketAddress inetSocketAddress, int i10) {
        socket.connect(inetSocketAddress, i10);
    }

    public SSLContext i() {
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e10) {
            throw new IllegalStateException("No TLS provider", e10);
        }
    }

    @Nullable
    public String j(SSLSocket sSLSocket) {
        return null;
    }

    @Nullable
    public Object k() {
        if (f21090b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public boolean m(String str) {
        return true;
    }

    public void n(int i10, String str, @Nullable Throwable th) {
        f21090b.log(i10 == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public void o(String str, Object obj) {
        if (obj == null) {
            str = d7.a.c(str, " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        n(5, str, (Throwable) obj);
    }

    public final String toString() {
        return getClass().getSimpleName();
    }
}
