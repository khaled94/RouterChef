package m4;

import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes.dex */
public final class cd0 extends SSLSocketFactory {

    /* renamed from: a */
    public final SSLSocketFactory f6788a = (SSLSocketFactory) SSLSocketFactory.getDefault();

    /* renamed from: b */
    public final /* synthetic */ dd0 f6789b;

    public cd0(dd0 dd0Var) {
        this.f6789b = dd0Var;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.HashSet, java.util.Set<java.net.Socket>] */
    public final Socket a(Socket socket) {
        int i10 = this.f6789b.f7327s;
        if (i10 > 0) {
            socket.setReceiveBufferSize(i10);
        }
        this.f6789b.f7328t.add(socket);
        return socket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i10) {
        Socket createSocket = this.f6788a.createSocket(str, i10);
        a(createSocket);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i10, InetAddress inetAddress, int i11) {
        Socket createSocket = this.f6788a.createSocket(str, i10, inetAddress, i11);
        a(createSocket);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i10) {
        Socket createSocket = this.f6788a.createSocket(inetAddress, i10);
        a(createSocket);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i10, InetAddress inetAddress2, int i11) {
        Socket createSocket = this.f6788a.createSocket(inetAddress, i10, inetAddress2, i11);
        a(createSocket);
        return createSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i10, boolean z10) {
        Socket createSocket = this.f6788a.createSocket(socket, str, i10, z10);
        a(createSocket);
        return createSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return this.f6788a.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        return this.f6788a.getSupportedCipherSuites();
    }
}
