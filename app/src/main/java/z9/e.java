package z9;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import r9.a0;

/* loaded from: classes.dex */
public final class e extends f {

    /* renamed from: c */
    public final Method f21087c;

    /* renamed from: d */
    public final Method f21088d;

    public e(Method method, Method method2) {
        this.f21087c = method;
        this.f21088d = method2;
    }

    @Override // z9.f
    public final void g(SSLSocket sSLSocket, String str, List<a0> list) {
        try {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            ArrayList arrayList = (ArrayList) f.b(list);
            this.f21087c.invoke(sSLParameters, arrayList.toArray(new String[arrayList.size()]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new AssertionError("failed to set SSL parameters", e10);
        }
    }

    @Override // z9.f
    @Nullable
    public final String j(SSLSocket sSLSocket) {
        try {
            String str = (String) this.f21088d.invoke(sSLSocket, new Object[0]);
            if (str != null) {
                if (!str.equals("")) {
                    return str;
                }
            }
            return null;
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to get ALPN selected protocol", e10);
        } catch (InvocationTargetException e11) {
            if (!(e11.getCause() instanceof UnsupportedOperationException)) {
                throw new AssertionError("failed to get ALPN selected protocol", e11);
            }
            return null;
        }
    }
}
