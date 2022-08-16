package z9;

import android.annotation.SuppressLint;
import android.net.ssl.SSLSockets;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import r9.a0;

@SuppressLint({"NewApi"})
/* loaded from: classes.dex */
public final class a extends b {
    public a(Class<?> cls) {
        super(null, null, null, null, null);
    }

    @Override // z9.b, z9.f
    @SuppressLint({"NewApi"})
    @IgnoreJRERequirement
    public final void g(SSLSocket sSLSocket, String str, List<a0> list) {
        try {
            if (SSLSockets.isSupportedSocket(sSLSocket)) {
                SSLSockets.setUseSessionTickets(sSLSocket, true);
            }
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            sSLParameters.setApplicationProtocols((String[]) ((ArrayList) f.b(list)).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e10) {
            throw new IOException("Android internal error", e10);
        }
    }

    @Override // z9.b, z9.f
    @Nullable
    @IgnoreJRERequirement
    public final String j(SSLSocket sSLSocket) {
        String applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol == null || applicationProtocol.isEmpty()) {
            return null;
        }
        return applicationProtocol;
    }
}
