package z9;

import android.os.Build;
import android.util.Log;
import androidx.activity.result.d;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import r9.a0;
import s9.e;

/* loaded from: classes.dex */
public class b extends f {

    /* renamed from: c */
    public final Class<?> f21066c;

    /* renamed from: d */
    public final Method f21067d;

    /* renamed from: e */
    public final Method f21068e;

    /* renamed from: f */
    public final Method f21069f;

    /* renamed from: g */
    public final Method f21070g;

    /* renamed from: h */
    public final C0156b f21071h;

    /* loaded from: classes.dex */
    public static final class a extends d {

        /* renamed from: b */
        public final Object f21072b;

        /* renamed from: c */
        public final Method f21073c;

        public a(Object obj, Method method) {
            this.f21072b = obj;
            this.f21073c = method;
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        @Override // androidx.activity.result.d
        public final List<Certificate> f(List<Certificate> list, String str) {
            try {
                return (List) this.f21073c.invoke(this.f21072b, (X509Certificate[]) list.toArray(new X509Certificate[list.size()]), "RSA", str);
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (InvocationTargetException e11) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e11.getMessage());
                sSLPeerUnverifiedException.initCause(e11);
                throw sSLPeerUnverifiedException;
            }
        }

        public final int hashCode() {
            return 0;
        }
    }

    /* renamed from: z9.b$b */
    /* loaded from: classes.dex */
    public static final class C0156b {

        /* renamed from: a */
        public final Method f21074a;

        /* renamed from: b */
        public final Method f21075b;

        /* renamed from: c */
        public final Method f21076c;

        public C0156b(Method method, Method method2, Method method3) {
            this.f21074a = method;
            this.f21075b = method2;
            this.f21076c = method3;
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements ba.d {

        /* renamed from: a */
        public final X509TrustManager f21077a;

        /* renamed from: b */
        public final Method f21078b;

        public c(X509TrustManager x509TrustManager, Method method) {
            this.f21078b = method;
            this.f21077a = x509TrustManager;
        }

        @Override // ba.d
        public final X509Certificate a(X509Certificate x509Certificate) {
            try {
                TrustAnchor trustAnchor = (TrustAnchor) this.f21078b.invoke(this.f21077a, x509Certificate);
                if (trustAnchor == null) {
                    return null;
                }
                return trustAnchor.getTrustedCert();
            } catch (IllegalAccessException e10) {
                throw new AssertionError("unable to get issues and signature", e10);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f21077a.equals(cVar.f21077a) && this.f21078b.equals(cVar.f21078b);
        }

        public final int hashCode() {
            return (this.f21078b.hashCode() * 31) + this.f21077a.hashCode();
        }
    }

    public b(Class cls, Method method, Method method2, Method method3, Method method4) {
        Method method5;
        Method method6;
        Method method7 = null;
        try {
            Class<?> cls2 = Class.forName("dalvik.system.CloseGuard");
            Method method8 = cls2.getMethod("get", new Class[0]);
            method5 = cls2.getMethod("open", String.class);
            method6 = cls2.getMethod("warnIfOpen", new Class[0]);
            method7 = method8;
        } catch (Exception unused) {
            method6 = null;
            method5 = null;
        }
        this.f21071h = new C0156b(method7, method5, method6);
        this.f21066c = cls;
        this.f21067d = method;
        this.f21068e = method2;
        this.f21069f = method3;
        this.f21070g = method4;
    }

    @Override // z9.f
    public final d c(X509TrustManager x509TrustManager) {
        try {
            Class<?> cls = Class.forName("android.net.http.X509TrustManagerExtensions");
            return new a(cls.getConstructor(X509TrustManager.class).newInstance(x509TrustManager), cls.getMethod("checkServerTrusted", X509Certificate[].class, String.class, String.class));
        } catch (Exception unused) {
            return new ba.a(d(x509TrustManager));
        }
    }

    @Override // z9.f
    public final ba.d d(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new c(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return new ba.b(x509TrustManager.getAcceptedIssuers());
        }
    }

    @Override // z9.f
    public void g(SSLSocket sSLSocket, String str, List<a0> list) {
        if (!this.f21066c.isInstance(sSLSocket)) {
            return;
        }
        if (str != null) {
            try {
                this.f21067d.invoke(sSLSocket, Boolean.TRUE);
                this.f21068e.invoke(sSLSocket, str);
            } catch (IllegalAccessException | InvocationTargetException e10) {
                throw new AssertionError(e10);
            }
        }
        this.f21070g.invoke(sSLSocket, f.e(list));
    }

    @Override // z9.f
    public final void h(Socket socket, InetSocketAddress inetSocketAddress, int i10) {
        try {
            socket.connect(inetSocketAddress, i10);
        } catch (AssertionError e10) {
            if (!e.p(e10)) {
                throw e10;
            }
            throw new IOException(e10);
        } catch (ClassCastException e11) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e11;
            }
            throw new IOException("Exception in connect", e11);
        }
    }

    @Override // z9.f
    public final SSLContext i() {
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e10) {
            throw new IllegalStateException("No TLS provider", e10);
        }
    }

    @Override // z9.f
    @Nullable
    public String j(SSLSocket sSLSocket) {
        if (!this.f21066c.isInstance(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f21069f.invoke(sSLSocket, new Object[0]);
            if (bArr == null) {
                return null;
            }
            return new String(bArr, StandardCharsets.UTF_8);
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // z9.f
    @Nullable
    public final Object k() {
        C0156b c0156b = this.f21071h;
        Method method = c0156b.f21074a;
        if (method != null) {
            try {
                Object invoke = method.invoke(null, new Object[0]);
                c0156b.f21075b.invoke(invoke, "response.body().close()");
                return invoke;
            } catch (Exception unused) {
                return null;
            }
        }
        return null;
    }

    @Override // z9.f
    public final boolean m(String str) {
        Throwable e10;
        try {
            Class<?> cls = Class.forName("android.security.NetworkSecurityPolicy");
            return p(str, cls, cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]));
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return true;
        } catch (IllegalAccessException e11) {
            e10 = e11;
            throw new AssertionError("unable to determine cleartext support", e10);
        } catch (IllegalArgumentException e12) {
            e10 = e12;
            throw new AssertionError("unable to determine cleartext support", e10);
        } catch (InvocationTargetException e13) {
            e10 = e13;
            throw new AssertionError("unable to determine cleartext support", e10);
        }
    }

    @Override // z9.f
    public final void n(int i10, String str, @Nullable Throwable th) {
        int min;
        int i11 = 5;
        if (i10 != 5) {
            i11 = 3;
        }
        if (th != null) {
            str = str + '\n' + Log.getStackTraceString(th);
        }
        int i12 = 0;
        int length = str.length();
        while (i12 < length) {
            int indexOf = str.indexOf(10, i12);
            if (indexOf == -1) {
                indexOf = length;
            }
            while (true) {
                min = Math.min(indexOf, i12 + 4000);
                Log.println(i11, "OkHttp", str.substring(i12, min));
                if (min >= indexOf) {
                    break;
                }
                i12 = min;
            }
            i12 = min + 1;
        }
    }

    @Override // z9.f
    public final void o(String str, Object obj) {
        C0156b c0156b = this.f21071h;
        Objects.requireNonNull(c0156b);
        boolean z10 = false;
        if (obj != null) {
            try {
                c0156b.f21076c.invoke(obj, new Object[0]);
                z10 = true;
            } catch (Exception unused) {
            }
        }
        if (!z10) {
            n(5, str, null);
        }
    }

    public final boolean p(String str, Class<?> cls, Object obj) {
        try {
            try {
                return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", String.class).invoke(obj, str)).booleanValue();
            } catch (NoSuchMethodException unused) {
                return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", new Class[0]).invoke(obj, new Object[0])).booleanValue();
            }
        } catch (NoSuchMethodException unused2) {
            return true;
        }
    }
}
