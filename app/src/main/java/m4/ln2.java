package m4;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
public final class ln2 extends xo0 {

    /* renamed from: e */
    public final byte[] f10950e;

    /* renamed from: f */
    public final DatagramPacket f10951f;

    /* renamed from: g */
    public Uri f10952g;

    /* renamed from: h */
    public DatagramSocket f10953h;

    /* renamed from: i */
    public MulticastSocket f10954i;

    /* renamed from: j */
    public InetAddress f10955j;

    /* renamed from: k */
    public InetSocketAddress f10956k;

    /* renamed from: l */
    public boolean f10957l;

    /* renamed from: m */
    public int f10958m;

    public ln2() {
        super(true);
        byte[] bArr = new byte[2000];
        this.f10950e = bArr;
        this.f10951f = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // m4.jp0
    public final int d(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        if (this.f10958m == 0) {
            try {
                this.f10953h.receive(this.f10951f);
                int length = this.f10951f.getLength();
                this.f10958m = length;
                p(length);
            } catch (SocketTimeoutException e10) {
                throw new kn2(e10, 2002);
            } catch (IOException e11) {
                throw new kn2(e11, 2001);
            }
        }
        int length2 = this.f10951f.getLength();
        int i12 = this.f10958m;
        int min = Math.min(i12, i11);
        System.arraycopy(this.f10950e, length2 - i12, bArr, i10, min);
        this.f10958m -= min;
        return min;
    }

    @Override // m4.kq0
    public final Uri h() {
        return this.f10952g;
    }

    @Override // m4.kq0
    public final void i() {
        this.f10952g = null;
        MulticastSocket multicastSocket = this.f10954i;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup(this.f10955j);
            } catch (IOException unused) {
            }
            this.f10954i = null;
        }
        DatagramSocket datagramSocket = this.f10953h;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f10953h = null;
        }
        this.f10955j = null;
        this.f10956k = null;
        this.f10958m = 0;
        if (this.f10957l) {
            this.f10957l = false;
            q();
        }
    }

    @Override // m4.kq0
    public final long k(gs0 gs0Var) {
        DatagramSocket datagramSocket;
        Uri uri = gs0Var.f9017a;
        this.f10952g = uri;
        String host = uri.getHost();
        int port = this.f10952g.getPort();
        r(gs0Var);
        try {
            this.f10955j = InetAddress.getByName(host);
            this.f10956k = new InetSocketAddress(this.f10955j, port);
            if (this.f10955j.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(this.f10956k);
                this.f10954i = multicastSocket;
                multicastSocket.joinGroup(this.f10955j);
                datagramSocket = this.f10954i;
            } else {
                datagramSocket = new DatagramSocket(this.f10956k);
            }
            this.f10953h = datagramSocket;
            datagramSocket.setSoTimeout(8000);
            this.f10957l = true;
            s(gs0Var);
            return -1L;
        } catch (IOException e10) {
            throw new kn2(e10, 2001);
        } catch (SecurityException e11) {
            throw new kn2(e11, 2006);
        }
    }
}
