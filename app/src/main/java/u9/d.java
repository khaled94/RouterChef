package u9;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import r9.a;
import r9.f;
import r9.j0;
import r9.o;
import r9.r;
import r9.v;
import s9.e;
import u9.h;
import v6.c;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a */
    public final i f19627a;

    /* renamed from: b */
    public final a f19628b;

    /* renamed from: c */
    public final f f19629c;

    /* renamed from: d */
    public final f f19630d;

    /* renamed from: e */
    public final r f19631e;

    /* renamed from: f */
    public h.a f19632f;

    /* renamed from: g */
    public final h f19633g;

    /* renamed from: h */
    public e f19634h;

    /* renamed from: i */
    public boolean f19635i;

    /* renamed from: j */
    public j0 f19636j;

    public d(i iVar, f fVar, a aVar, f fVar2, r rVar) {
        this.f19627a = iVar;
        this.f19629c = fVar;
        this.f19628b = aVar;
        this.f19630d = fVar2;
        this.f19631e = rVar;
        this.f19633g = new h(aVar, fVar.f19657e, fVar2, rVar);
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [java.util.Deque<u9.e>, java.util.ArrayDeque] */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.util.List<r9.j0>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.util.List<r9.j0>, java.util.ArrayList] */
    public final e a(int i10, int i11, int i12, boolean z10) {
        e eVar;
        Socket socket;
        Socket h10;
        e eVar2;
        int i13;
        boolean z11;
        j0 j0Var;
        boolean z12;
        ArrayList arrayList;
        h.a aVar;
        String str;
        int i14;
        boolean contains;
        synchronized (this.f19629c) {
            if (this.f19627a.e()) {
                throw new IOException("Canceled");
            }
            this.f19635i = false;
            i iVar = this.f19627a;
            eVar = iVar.f19678i;
            socket = null;
            h10 = (eVar == null || !eVar.f19646k) ? null : iVar.h();
            i iVar2 = this.f19627a;
            eVar2 = iVar2.f19678i;
            if (eVar2 != null) {
                eVar = null;
            } else {
                eVar2 = null;
            }
            i13 = 1;
            if (eVar2 == null) {
                if (this.f19629c.c(this.f19628b, iVar2, null, false)) {
                    eVar2 = this.f19627a.f19678i;
                    j0Var = null;
                    z11 = true;
                } else {
                    j0Var = this.f19636j;
                    if (j0Var != null) {
                        this.f19636j = null;
                    } else if (d()) {
                        j0Var = this.f19627a.f19678i.f19638c;
                    }
                    z11 = false;
                }
            }
            z11 = false;
            j0Var = null;
        }
        e.d(h10);
        if (eVar != null) {
            Objects.requireNonNull(this.f19631e);
        }
        if (z11) {
            Objects.requireNonNull(this.f19631e);
        }
        if (eVar2 != null) {
            return eVar2;
        }
        if (j0Var != null || ((aVar = this.f19632f) != null && aVar.a())) {
            z12 = false;
        } else {
            h hVar = this.f19633g;
            if (hVar.a()) {
                ArrayList arrayList2 = new ArrayList();
                while (hVar.b()) {
                    if (hVar.b()) {
                        List<Proxy> list = hVar.f19664d;
                        int i15 = hVar.f19665e;
                        hVar.f19665e = i15 + 1;
                        Proxy proxy = list.get(i15);
                        hVar.f19666f = new ArrayList();
                        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                            v vVar = hVar.f19661a.f17283a;
                            str = vVar.f17478d;
                            i14 = vVar.f17479e;
                        } else {
                            SocketAddress address = proxy.address();
                            if (address instanceof InetSocketAddress) {
                                InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                                InetAddress address2 = inetSocketAddress.getAddress();
                                str = address2 == null ? inetSocketAddress.getHostName() : address2.getHostAddress();
                                i14 = inetSocketAddress.getPort();
                            } else {
                                StringBuilder c10 = androidx.activity.result.a.c("Proxy.address() is not an InetSocketAddress: ");
                                c10.append(address.getClass());
                                throw new IllegalArgumentException(c10.toString());
                            }
                        }
                        if (i14 < i13 || i14 > 65535) {
                            throw new SocketException("No route to " + str + ":" + i14 + "; port is out of range");
                        }
                        if (proxy.type() == Proxy.Type.SOCKS) {
                            hVar.f19666f.add(InetSocketAddress.createUnresolved(str, i14));
                        } else {
                            Objects.requireNonNull(hVar.f19663c);
                            Objects.requireNonNull((c) hVar.f19661a.f17284b);
                            int i16 = o.f17459a;
                            if (str == null) {
                                throw new UnknownHostException("hostname == null");
                            }
                            try {
                                List asList = Arrays.asList(InetAddress.getAllByName(str));
                                if (asList.isEmpty()) {
                                    throw new UnknownHostException(hVar.f19661a.f17284b + " returned no addresses for " + str);
                                }
                                Objects.requireNonNull(hVar.f19663c);
                                int size = asList.size();
                                for (int i17 = 0; i17 < size; i17++) {
                                    hVar.f19666f.add(new InetSocketAddress((InetAddress) asList.get(i17), i14));
                                }
                            } catch (NullPointerException e10) {
                                UnknownHostException unknownHostException = new UnknownHostException(d7.a.c("Broken system behaviour for dns lookup of ", str));
                                unknownHostException.initCause(e10);
                                throw unknownHostException;
                            }
                        }
                        int size2 = hVar.f19666f.size();
                        for (int i18 = 0; i18 < size2; i18++) {
                            j0 j0Var2 = new j0(hVar.f19661a, proxy, hVar.f19666f.get(i18));
                            w7.c cVar = hVar.f19662b;
                            synchronized (cVar) {
                                contains = cVar.f19936a.contains(j0Var2);
                            }
                            if (contains) {
                                hVar.f19667g.add(j0Var2);
                            } else {
                                arrayList2.add(j0Var2);
                            }
                        }
                        if (!arrayList2.isEmpty()) {
                            break;
                        }
                        i13 = 1;
                    } else {
                        StringBuilder c11 = androidx.activity.result.a.c("No route to ");
                        c11.append(hVar.f19661a.f17283a.f17478d);
                        c11.append("; exhausted proxy configurations: ");
                        c11.append(hVar.f19664d);
                        throw new SocketException(c11.toString());
                    }
                }
                if (arrayList2.isEmpty()) {
                    arrayList2.addAll(hVar.f19667g);
                    hVar.f19667g.clear();
                }
                this.f19632f = new h.a(arrayList2);
                z12 = true;
            } else {
                throw new NoSuchElementException();
            }
        }
        synchronized (this.f19629c) {
            if (this.f19627a.e()) {
                throw new IOException("Canceled");
            }
            if (z12) {
                h.a aVar2 = this.f19632f;
                Objects.requireNonNull(aVar2);
                arrayList = new ArrayList(aVar2.f19668a);
                if (this.f19629c.c(this.f19628b, this.f19627a, arrayList, false)) {
                    eVar2 = this.f19627a.f19678i;
                    z11 = true;
                }
            } else {
                arrayList = null;
            }
            if (!z11) {
                if (j0Var == null) {
                    h.a aVar3 = this.f19632f;
                    if (!aVar3.a()) {
                        throw new NoSuchElementException();
                    }
                    List<j0> list2 = aVar3.f19668a;
                    int i19 = aVar3.f19669b;
                    aVar3.f19669b = i19 + 1;
                    j0Var = list2.get(i19);
                }
                eVar2 = new e(this.f19629c, j0Var);
                this.f19634h = eVar2;
            }
        }
        if (!z11) {
            eVar2.c(i10, i11, i12, z10, this.f19630d, this.f19631e);
            this.f19629c.f19657e.a(eVar2.f19638c);
            synchronized (this.f19629c) {
                this.f19634h = null;
                if (this.f19629c.c(this.f19628b, this.f19627a, arrayList, true)) {
                    eVar2.f19646k = true;
                    socket = eVar2.f19640e;
                    eVar2 = this.f19627a.f19678i;
                    this.f19636j = j0Var;
                } else {
                    f fVar = this.f19629c;
                    if (!fVar.f19658f) {
                        fVar.f19658f = true;
                        f.f19652g.execute(fVar.f19655c);
                    }
                    fVar.f19656d.add(eVar2);
                    this.f19627a.a(eVar2);
                }
            }
            e.d(socket);
        }
        Objects.requireNonNull(this.f19631e);
        return eVar2;
    }

    public final e b(int i10, int i11, int i12, boolean z10, boolean z11) {
        while (true) {
            e a10 = a(i10, i11, i12, z10);
            synchronized (this.f19629c) {
                if (a10.f19648m != 0 || a10.g()) {
                    boolean z12 = false;
                    if (!a10.f19640e.isClosed() && !a10.f19640e.isInputShutdown() && !a10.f19640e.isOutputShutdown()) {
                        x9.f fVar = a10.f19643h;
                        if (fVar != null) {
                            long nanoTime = System.nanoTime();
                            synchronized (fVar) {
                                if (!fVar.y && (fVar.F >= fVar.E || nanoTime < fVar.G)) {
                                    z12 = true;
                                }
                            }
                        } else {
                            if (z11) {
                                try {
                                    int soTimeout = a10.f19640e.getSoTimeout();
                                    a10.f19640e.setSoTimeout(1);
                                    if (a10.f19644i.y()) {
                                        a10.f19640e.setSoTimeout(soTimeout);
                                    } else {
                                        a10.f19640e.setSoTimeout(soTimeout);
                                    }
                                } catch (SocketTimeoutException unused) {
                                } catch (IOException unused2) {
                                }
                            }
                            z12 = true;
                        }
                    }
                    if (z12) {
                        return a10;
                    }
                    a10.i();
                } else {
                    return a10;
                }
            }
        }
    }

    public final boolean c() {
        synchronized (this.f19629c) {
            boolean z10 = true;
            if (this.f19636j != null) {
                return true;
            }
            if (d()) {
                this.f19636j = this.f19627a.f19678i.f19638c;
                return true;
            }
            h.a aVar = this.f19632f;
            if ((aVar == null || !aVar.a()) && !this.f19633g.a()) {
                z10 = false;
            }
            return z10;
        }
    }

    public final boolean d() {
        e eVar = this.f19627a.f19678i;
        return eVar != null && eVar.f19647l == 0 && e.r(eVar.f19638c.f17422a.f17283a, this.f19628b.f17283a);
    }

    public final void e() {
        synchronized (this.f19629c) {
            this.f19635i = true;
        }
    }
}
