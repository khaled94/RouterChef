package m4;

import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes.dex */
public final class tb0 extends SSLSocketFactory {

    /* renamed from: a */
    public final SSLSocketFactory f13994a = (SSLSocketFactory) SSLSocketFactory.getDefault();

    /* renamed from: b */
    public final /* synthetic */ vb0 f13995b;

    public tb0(vb0 vb0Var) {
        this.f13995b = vb0Var;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.HashSet, java.util.Set<java.net.Socket>] */
    public final Socket a(Socket socket) {
        int i10 = this.f13995b.f14657o;
        if (i10 > 0) {
            socket.setReceiveBufferSize(i10);
        }
        this.f13995b.p.add(socket);
        return socket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i10) {
        Socket createSocket = this.f13994a.createSocket(str, i10);
        a(createSocket);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i10, InetAddress inetAddress, int i11) {
        Socket createSocket = this.f13994a.createSocket(str, i10, inetAddress, i11);
        a(createSocket);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i10) {
        Socket createSocket = this.f13994a.createSocket(inetAddress, i10);
        a(createSocket);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i10, InetAddress inetAddress2, int i11) {
        Socket createSocket = this.f13994a.createSocket(inetAddress, i10, inetAddress2, i11);
        a(createSocket);
        return createSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i10, boolean z10) {
        Socket createSocket = this.f13994a.createSocket(socket, str, i10, z10);
        a(createSocket);
        return createSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return this.f13994a.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        return this.f13994a.getSupportedCipherSuites();
    }
}
