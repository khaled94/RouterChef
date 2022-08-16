package x9;

import ca.f;
import ca.h;
import ca.i;
import ca.y;
import ca.z;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import s9.e;
import x9.c;
import x9.f;
import x9.q;

/* loaded from: classes.dex */
public final class p implements Closeable {

    /* renamed from: w */
    public static final Logger f20190w = Logger.getLogger(d.class.getName());

    /* renamed from: s */
    public final h f20191s;

    /* renamed from: t */
    public final a f20192t;

    /* renamed from: u */
    public final boolean f20193u;

    /* renamed from: v */
    public final c.a f20194v;

    /* loaded from: classes.dex */
    public static final class a implements y {

        /* renamed from: s */
        public final h f20195s;

        /* renamed from: t */
        public int f20196t;

        /* renamed from: u */
        public byte f20197u;

        /* renamed from: v */
        public int f20198v;

        /* renamed from: w */
        public int f20199w;

        /* renamed from: x */
        public short f20200x;

        public a(h hVar) {
            this.f20195s = hVar;
        }

        @Override // ca.y
        public final long D(f fVar, long j3) {
            int i10;
            int readInt;
            do {
                int i11 = this.f20199w;
                if (i11 != 0) {
                    long D = this.f20195s.D(fVar, Math.min(8192L, i11));
                    if (D == -1) {
                        return -1L;
                    }
                    this.f20199w = (int) (this.f20199w - D);
                    return D;
                }
                this.f20195s.p(this.f20200x);
                this.f20200x = (short) 0;
                if ((this.f20197u & 4) != 0) {
                    return -1L;
                }
                i10 = this.f20198v;
                int I = p.I(this.f20195s);
                this.f20199w = I;
                this.f20196t = I;
                byte readByte = (byte) (this.f20195s.readByte() & 255);
                this.f20197u = (byte) (this.f20195s.readByte() & 255);
                Logger logger = p.f20190w;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(d.a(true, this.f20198v, this.f20196t, readByte, this.f20197u));
                }
                readInt = this.f20195s.readInt() & Integer.MAX_VALUE;
                this.f20198v = readInt;
                if (readByte != 9) {
                    d.c("%s != TYPE_CONTINUATION", Byte.valueOf(readByte));
                    throw null;
                }
            } while (readInt == i10);
            d.c("TYPE_CONTINUATION streamId changed", new Object[0]);
            throw null;
        }

        @Override // ca.y, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }

        @Override // ca.y
        public final z d() {
            return this.f20195s.d();
        }
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    public p(h hVar, boolean z10) {
        this.f20191s = hVar;
        this.f20193u = z10;
        a aVar = new a(hVar);
        this.f20192t = aVar;
        this.f20194v = new c.a(aVar);
    }

    public static int I(h hVar) {
        return (hVar.readByte() & 255) | ((hVar.readByte() & 255) << 16) | ((hVar.readByte() & 255) << 8);
    }

    public static int b(int i10, byte b10, short s10) {
        if ((b10 & 8) != 0) {
            i10--;
        }
        if (s10 <= i10) {
            return (short) (i10 - s10);
        }
        d.c("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s10), Integer.valueOf(i10));
        throw null;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.Map<java.lang.Integer, x9.q>, java.util.LinkedHashMap] */
    public final void G(b bVar, int i10, int i11) {
        int i12;
        q[] qVarArr;
        if (i10 < 8) {
            d.c("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i10));
            throw null;
        } else if (i11 != 0) {
            d.c("TYPE_GOAWAY streamId != 0", new Object[0]);
            throw null;
        } else {
            int readInt = this.f20191s.readInt();
            int readInt2 = this.f20191s.readInt();
            int i13 = i10 - 8;
            int[] a10 = r7.c.a();
            int length = a10.length;
            int i14 = 0;
            while (true) {
                if (i14 >= length) {
                    i12 = 0;
                    break;
                }
                i12 = a10[i14];
                if (r7.c.b(i12) == readInt2) {
                    break;
                }
                i14++;
            }
            if (i12 == 0) {
                d.c("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(readInt2));
                throw null;
            }
            i iVar = i.f2846w;
            if (i13 > 0) {
                iVar = this.f20191s.m(i13);
            }
            f.C0153f c0153f = (f.C0153f) bVar;
            Objects.requireNonNull(c0153f);
            iVar.n();
            synchronized (f.this) {
                qVarArr = (q[]) f.this.f20141u.values().toArray(new q[f.this.f20141u.size()]);
                f.this.y = true;
            }
            for (q qVar : qVarArr) {
                if (qVar.f20203c > readInt && qVar.g()) {
                    synchronized (qVar) {
                        if (qVar.f20211k == 0) {
                            qVar.f20211k = 5;
                            qVar.notifyAll();
                        }
                    }
                    f.this.L(qVar.f20203c);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List<x9.b>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.util.List<x9.b>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.List<x9.b>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.util.List<x9.b>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.util.List<x9.b>, java.util.ArrayList] */
    public final List<x9.b> H(int i10, short s10, byte b10, int i11) {
        a aVar = this.f20192t;
        aVar.f20199w = i10;
        aVar.f20196t = i10;
        aVar.f20200x = s10;
        aVar.f20197u = b10;
        aVar.f20198v = i11;
        c.a aVar2 = this.f20194v;
        while (!aVar2.f20117b.y()) {
            int readByte = aVar2.f20117b.readByte() & 255;
            if (readByte == 128) {
                throw new IOException("index == 0");
            }
            boolean z10 = false;
            if ((readByte & 128) == 128) {
                int e10 = aVar2.e(readByte, 127) - 1;
                if (e10 >= 0 && e10 <= c.f20114a.length - 1) {
                    z10 = true;
                }
                if (z10) {
                    aVar2.f20116a.add(c.f20114a[e10]);
                } else {
                    int length = aVar2.f20121f + 1 + (e10 - c.f20114a.length);
                    if (length >= 0) {
                        x9.b[] bVarArr = aVar2.f20120e;
                        if (length < bVarArr.length) {
                            aVar2.f20116a.add(bVarArr[length]);
                        }
                    }
                    StringBuilder c10 = androidx.activity.result.a.c("Header index too large ");
                    c10.append(e10 + 1);
                    throw new IOException(c10.toString());
                }
            } else if (readByte == 64) {
                i d5 = aVar2.d();
                c.a(d5);
                aVar2.c(new x9.b(d5, aVar2.d()));
            } else if ((readByte & 64) == 64) {
                aVar2.c(new x9.b(aVar2.b(aVar2.e(readByte, 63) - 1), aVar2.d()));
            } else if ((readByte & 32) == 32) {
                int e11 = aVar2.e(readByte, 31);
                aVar2.f20119d = e11;
                if (e11 >= 0 && e11 <= aVar2.f20118c) {
                    int i12 = aVar2.f20123h;
                    if (e11 < i12) {
                        if (e11 == 0) {
                            Arrays.fill(aVar2.f20120e, (Object) null);
                            aVar2.f20121f = aVar2.f20120e.length - 1;
                            aVar2.f20122g = 0;
                            aVar2.f20123h = 0;
                        } else {
                            aVar2.a(i12 - e11);
                        }
                    }
                } else {
                    StringBuilder c11 = androidx.activity.result.a.c("Invalid dynamic table size update ");
                    c11.append(aVar2.f20119d);
                    throw new IOException(c11.toString());
                }
            } else if (readByte != 16 && readByte != 0) {
                aVar2.f20116a.add(new x9.b(aVar2.b(aVar2.e(readByte, 15) - 1), aVar2.d()));
            } else {
                i d10 = aVar2.d();
                c.a(d10);
                aVar2.f20116a.add(new x9.b(d10, aVar2.d()));
            }
        }
        c.a aVar3 = this.f20194v;
        Objects.requireNonNull(aVar3);
        ArrayList arrayList = new ArrayList(aVar3.f20116a);
        aVar3.f20116a.clear();
        return arrayList;
    }

    public final void L(b bVar, int i10, byte b10, int i11) {
        boolean z10 = false;
        if (i10 != 8) {
            d.c("TYPE_PING length != 8: %s", Integer.valueOf(i10));
            throw null;
        } else if (i11 != 0) {
            d.c("TYPE_PING streamId != 0", new Object[0]);
            throw null;
        } else {
            int readInt = this.f20191s.readInt();
            int readInt2 = this.f20191s.readInt();
            if ((b10 & 1) != 0) {
                z10 = true;
            }
            f.C0153f c0153f = (f.C0153f) bVar;
            Objects.requireNonNull(c0153f);
            if (z10) {
                synchronized (f.this) {
                    try {
                        if (readInt == 1) {
                            f.this.D++;
                        } else if (readInt == 2) {
                            f.this.F++;
                        } else if (readInt == 3) {
                            f fVar = f.this;
                            Objects.requireNonNull(fVar);
                            fVar.notifyAll();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            }
            try {
                f fVar2 = f.this;
                fVar2.f20145z.execute(new f.e(readInt, readInt2));
            } catch (RejectedExecutionException unused) {
            }
        }
    }

    public final void Y(b bVar, int i10, byte b10, int i11) {
        if (i11 != 0) {
            short readByte = (b10 & 8) != 0 ? (short) (this.f20191s.readByte() & 255) : (short) 0;
            int readInt = this.f20191s.readInt() & Integer.MAX_VALUE;
            List<x9.b> H = H(b(i10 - 4, b10, readByte), readByte, b10, i11);
            f fVar = f.this;
            synchronized (fVar) {
                if (fVar.O.contains(Integer.valueOf(readInt))) {
                    fVar.m0(readInt, 2);
                    return;
                }
                fVar.O.add(Integer.valueOf(readInt));
                try {
                    fVar.H(new h(fVar, new Object[]{fVar.f20142v, Integer.valueOf(readInt)}, readInt, H));
                    return;
                } catch (RejectedExecutionException unused) {
                    return;
                }
            }
        }
        d.c("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
        throw null;
    }

    public final void Z(b bVar, int i10, int i11) {
        if (i10 != 4) {
            d.c("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(i10));
            throw null;
        }
        long readInt = this.f20191s.readInt() & 2147483647L;
        int i12 = (readInt > 0L ? 1 : (readInt == 0L ? 0 : -1));
        if (i12 == 0) {
            d.c("windowSizeIncrement was 0", Long.valueOf(readInt));
            throw null;
        }
        f.C0153f c0153f = (f.C0153f) bVar;
        f fVar = f.this;
        if (i11 == 0) {
            synchronized (fVar) {
                f fVar2 = f.this;
                fVar2.I += readInt;
                fVar2.notifyAll();
            }
            return;
        }
        q j3 = fVar.j(i11);
        if (j3 == null) {
            return;
        }
        synchronized (j3) {
            j3.f20202b += readInt;
            if (i12 > 0) {
                j3.notifyAll();
            }
        }
    }

    public final boolean c(boolean z10, b bVar) {
        short s10;
        boolean z11;
        boolean z12;
        long j3;
        int i10;
        try {
            this.f20191s.c0(9L);
            int I = I(this.f20191s);
            if (I < 0 || I > 16384) {
                d.c("FRAME_SIZE_ERROR: %s", Integer.valueOf(I));
                throw null;
            }
            byte readByte = (byte) (this.f20191s.readByte() & 255);
            if (z10 && readByte != 4) {
                d.c("Expected a SETTINGS frame but was %s", Byte.valueOf(readByte));
                throw null;
            }
            byte readByte2 = (byte) (this.f20191s.readByte() & 255);
            int readInt = this.f20191s.readInt() & Integer.MAX_VALUE;
            Logger logger = f20190w;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(d.a(true, readInt, I, readByte, readByte2));
            }
            switch (readByte) {
                case 0:
                    if (readInt == 0) {
                        d.c("PROTOCOL_ERROR: TYPE_DATA streamId == 0", new Object[0]);
                        throw null;
                    }
                    boolean z13 = (readByte2 & 1) != 0;
                    if ((readByte2 & 32) != 0) {
                        d.c("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
                        throw null;
                    }
                    short readByte3 = (readByte2 & 8) != 0 ? (short) (this.f20191s.readByte() & 255) : (short) 0;
                    int b10 = b(I, readByte2, readByte3);
                    h hVar = this.f20191s;
                    f.C0153f c0153f = (f.C0153f) bVar;
                    if (f.this.I(readInt)) {
                        f fVar = f.this;
                        Objects.requireNonNull(fVar);
                        ca.f fVar2 = new ca.f();
                        long j10 = b10;
                        hVar.c0(j10);
                        hVar.D(fVar2, j10);
                        if (fVar2.f2843t != j10) {
                            throw new IOException(fVar2.f2843t + " != " + b10);
                        }
                        fVar.H(new j(fVar, new Object[]{fVar.f20142v, Integer.valueOf(readInt)}, readInt, fVar2, b10, z13));
                    } else {
                        q j11 = f.this.j(readInt);
                        if (j11 != null) {
                            q.b bVar2 = j11.f20207g;
                            long j12 = b10;
                            Objects.requireNonNull(bVar2);
                            while (true) {
                                if (j12 > 0) {
                                    synchronized (q.this) {
                                        z11 = bVar2.f20221w;
                                        s10 = readByte3;
                                        z12 = bVar2.f20218t.f2843t + j12 > bVar2.f20219u;
                                    }
                                    if (z12) {
                                        hVar.p(j12);
                                        q.this.e(4);
                                    } else if (z11) {
                                        hVar.p(j12);
                                    } else {
                                        long D = hVar.D(bVar2.f20217s, j12);
                                        if (D == -1) {
                                            throw new EOFException();
                                        }
                                        j12 -= D;
                                        synchronized (q.this) {
                                            if (bVar2.f20220v) {
                                                ca.f fVar3 = bVar2.f20217s;
                                                j3 = fVar3.f2843t;
                                                fVar3.b();
                                            } else {
                                                ca.f fVar4 = bVar2.f20218t;
                                                boolean z14 = fVar4.f2843t == 0;
                                                fVar4.A0(bVar2.f20217s);
                                                if (z14) {
                                                    q.this.notifyAll();
                                                }
                                                j3 = 0;
                                            }
                                        }
                                        if (j3 > 0) {
                                            bVar2.b(j3);
                                        }
                                        readByte3 = s10;
                                    }
                                } else {
                                    s10 = readByte3;
                                }
                            }
                            if (z13) {
                                j11.i(e.f18398c, true);
                            }
                            this.f20191s.p(s10);
                            return true;
                        }
                        f.this.m0(readInt, 2);
                        long j13 = b10;
                        f.this.Z(j13);
                        hVar.p(j13);
                    }
                    s10 = readByte3;
                    this.f20191s.p(s10);
                    return true;
                case 1:
                    if (readInt != 0) {
                        boolean z15 = (readByte2 & 1) != 0;
                        short readByte4 = (readByte2 & 8) != 0 ? (short) (this.f20191s.readByte() & 255) : (short) 0;
                        if ((readByte2 & 32) != 0) {
                            this.f20191s.readInt();
                            this.f20191s.readByte();
                            Objects.requireNonNull(bVar);
                            I -= 5;
                        }
                        List<x9.b> H = H(b(I, readByte2, readByte4), readByte4, readByte2, readInt);
                        f.C0153f c0153f2 = (f.C0153f) bVar;
                        if (f.this.I(readInt)) {
                            f fVar5 = f.this;
                            Objects.requireNonNull(fVar5);
                            fVar5.H(new i(fVar5, new Object[]{fVar5.f20142v, Integer.valueOf(readInt)}, readInt, H, z15));
                            return true;
                        }
                        synchronized (f.this) {
                            q j14 = f.this.j(readInt);
                            if (j14 == null) {
                                f fVar6 = f.this;
                                if (!fVar6.y && readInt > fVar6.f20143w && readInt % 2 != fVar6.f20144x % 2) {
                                    q qVar = new q(readInt, f.this, false, z15, e.v(H));
                                    f fVar7 = f.this;
                                    fVar7.f20143w = readInt;
                                    fVar7.f20141u.put(Integer.valueOf(readInt), qVar);
                                    f.P.execute(new l(c0153f2, new Object[]{f.this.f20142v, Integer.valueOf(readInt)}, qVar));
                                }
                            } else {
                                j14.i(e.v(H), z15);
                            }
                        }
                        return true;
                    }
                    d.c("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
                    throw null;
                case 2:
                    if (I != 5) {
                        d.c("TYPE_PRIORITY length: %d != 5", Integer.valueOf(I));
                        throw null;
                    } else if (readInt != 0) {
                        this.f20191s.readInt();
                        this.f20191s.readByte();
                        Objects.requireNonNull(bVar);
                        return true;
                    } else {
                        d.c("TYPE_PRIORITY streamId == 0", new Object[0]);
                        throw null;
                    }
                case 3:
                    if (I != 4) {
                        d.c("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(I));
                        throw null;
                    } else if (readInt == 0) {
                        d.c("TYPE_RST_STREAM streamId == 0", new Object[0]);
                        throw null;
                    } else {
                        int readInt2 = this.f20191s.readInt();
                        int[] a10 = r7.c.a();
                        int length = a10.length;
                        int i11 = 0;
                        while (true) {
                            if (i11 < length) {
                                i10 = a10[i11];
                                if (r7.c.b(i10) != readInt2) {
                                    i11++;
                                }
                            } else {
                                i10 = 0;
                            }
                        }
                        if (i10 == 0) {
                            d.c("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(readInt2));
                            throw null;
                        }
                        f.C0153f c0153f3 = (f.C0153f) bVar;
                        boolean I2 = f.this.I(readInt);
                        f fVar8 = f.this;
                        if (I2) {
                            fVar8.H(new k(fVar8, new Object[]{fVar8.f20142v, Integer.valueOf(readInt)}, readInt, i10));
                        } else {
                            q L = fVar8.L(readInt);
                            if (L != null) {
                                synchronized (L) {
                                    if (L.f20211k == 0) {
                                        L.f20211k = i10;
                                        L.notifyAll();
                                    }
                                }
                            }
                        }
                        return true;
                    }
                case 4:
                    if (readInt != 0) {
                        d.c("TYPE_SETTINGS streamId != 0", new Object[0]);
                        throw null;
                    } else if ((readByte2 & 1) != 0) {
                        if (I == 0) {
                            Objects.requireNonNull(bVar);
                            return true;
                        }
                        d.c("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                        throw null;
                    } else if (I % 6 != 0) {
                        d.c("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(I));
                        throw null;
                    } else {
                        u uVar = new u();
                        for (int i12 = 0; i12 < I; i12 += 6) {
                            int readShort = this.f20191s.readShort() & 65535;
                            int readInt3 = this.f20191s.readInt();
                            if (readShort != 2) {
                                if (readShort == 3) {
                                    readShort = 4;
                                } else if (readShort == 4) {
                                    readShort = 7;
                                    if (readInt3 < 0) {
                                        d.c("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                                        throw null;
                                    }
                                } else if (readShort == 5 && (readInt3 < 16384 || readInt3 > 16777215)) {
                                    d.c("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(readInt3));
                                    throw null;
                                }
                            } else if (readInt3 != 0 && readInt3 != 1) {
                                d.c("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                                throw null;
                            }
                            uVar.b(readShort, readInt3);
                        }
                        f.C0153f c0153f4 = (f.C0153f) bVar;
                        Objects.requireNonNull(c0153f4);
                        f fVar9 = f.this;
                        fVar9.f20145z.execute(new m(c0153f4, new Object[]{fVar9.f20142v}, uVar));
                        return true;
                    }
                case 5:
                    Y(bVar, I, readByte2, readInt);
                    return true;
                case 6:
                    L(bVar, I, readByte2, readInt);
                    return true;
                case 7:
                    G(bVar, I, readInt);
                    return true;
                case 8:
                    Z(bVar, I, readInt);
                    return true;
                default:
                    this.f20191s.p(I);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f20191s.close();
    }

    public final void j(b bVar) {
        if (this.f20193u) {
            if (c(true, bVar)) {
                return;
            }
            d.c("Required SETTINGS preface not received", new Object[0]);
            throw null;
        }
        h hVar = this.f20191s;
        i iVar = d.f20132a;
        i m10 = hVar.m(iVar.f2847s.length);
        Logger logger = f20190w;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(e.j("<< CONNECTION %s", m10.j()));
        }
        if (iVar.equals(m10)) {
            return;
        }
        d.c("Expected a connection header but was %s", m10.q());
        throw null;
    }
}
