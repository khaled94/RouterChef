package t6;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class c implements Closeable {
    public static final Logger y = Logger.getLogger(c.class.getName());

    /* renamed from: s */
    public final RandomAccessFile f18676s;

    /* renamed from: t */
    public int f18677t;

    /* renamed from: u */
    public int f18678u;

    /* renamed from: v */
    public a f18679v;

    /* renamed from: w */
    public a f18680w;

    /* renamed from: x */
    public final byte[] f18681x = new byte[16];

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: c */
        public static final a f18682c = new a(0, 0);

        /* renamed from: a */
        public final int f18683a;

        /* renamed from: b */
        public final int f18684b;

        public a(int i10, int i11) {
            this.f18683a = i10;
            this.f18684b = i11;
        }

        public final String toString() {
            return a.class.getSimpleName() + "[position = " + this.f18683a + ", length = " + this.f18684b + "]";
        }
    }

    /* renamed from: t6.c$c */
    /* loaded from: classes.dex */
    public interface AbstractC0118c {
    }

    /* JADX WARN: Finally extract failed */
    public c(File file) {
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(4096L);
                randomAccessFile.seek(0L);
                byte[] bArr = new byte[16];
                int[] iArr = {4096, 0, 0, 0};
                int i10 = 0;
                for (int i11 = 0; i11 < 4; i11++) {
                    o0(bArr, i10, iArr[i11]);
                    i10 += 4;
                }
                randomAccessFile.write(bArr);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    throw new IOException("Rename failed!");
                }
            } catch (Throwable th) {
                randomAccessFile.close();
                throw th;
            }
        }
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rwd");
        this.f18676s = randomAccessFile2;
        randomAccessFile2.seek(0L);
        randomAccessFile2.readFully(this.f18681x);
        int L = L(this.f18681x, 0);
        this.f18677t = L;
        if (L > randomAccessFile2.length()) {
            StringBuilder c10 = androidx.activity.result.a.c("File is truncated. Expected length: ");
            c10.append(this.f18677t);
            c10.append(", Actual length: ");
            c10.append(randomAccessFile2.length());
            throw new IOException(c10.toString());
        }
        this.f18678u = L(this.f18681x, 4);
        int L2 = L(this.f18681x, 8);
        int L3 = L(this.f18681x, 12);
        this.f18679v = I(L2);
        this.f18680w = I(L3);
    }

    public static int L(byte[] bArr, int i10) {
        return ((bArr[i10] & 255) << 24) + ((bArr[i10 + 1] & 255) << 16) + ((bArr[i10 + 2] & 255) << 8) + (bArr[i10 + 3] & 255);
    }

    public static void o0(byte[] bArr, int i10, int i11) {
        bArr[i10] = (byte) (i11 >> 24);
        bArr[i10 + 1] = (byte) (i11 >> 16);
        bArr[i10 + 2] = (byte) (i11 >> 8);
        bArr[i10 + 3] = (byte) i11;
    }

    public final synchronized void G(AbstractC0118c abstractC0118c) {
        int i10 = this.f18679v.f18683a;
        for (int i11 = 0; i11 < this.f18678u; i11++) {
            a I = I(i10);
            ((d) abstractC0118c).a(new b(I), I.f18684b);
            i10 = m0(I.f18683a + 4 + I.f18684b);
        }
    }

    public final synchronized boolean H() {
        return this.f18678u == 0;
    }

    public final a I(int i10) {
        if (i10 == 0) {
            return a.f18682c;
        }
        this.f18676s.seek(i10);
        return new a(i10, this.f18676s.readInt());
    }

    public final synchronized void Y() {
        if (H()) {
            throw new NoSuchElementException();
        }
        if (this.f18678u == 1) {
            c();
        } else {
            a aVar = this.f18679v;
            int m02 = m0(aVar.f18683a + 4 + aVar.f18684b);
            Z(m02, this.f18681x, 0, 4);
            int L = L(this.f18681x, 0);
            n0(this.f18677t, this.f18678u - 1, m02, this.f18680w.f18683a);
            this.f18678u--;
            this.f18679v = new a(m02, L);
        }
    }

    public final void Z(int i10, byte[] bArr, int i11, int i12) {
        RandomAccessFile randomAccessFile;
        int m02 = m0(i10);
        int i13 = m02 + i12;
        int i14 = this.f18677t;
        if (i13 <= i14) {
            this.f18676s.seek(m02);
            randomAccessFile = this.f18676s;
        } else {
            int i15 = i14 - m02;
            this.f18676s.seek(m02);
            this.f18676s.readFully(bArr, i11, i15);
            this.f18676s.seek(16L);
            randomAccessFile = this.f18676s;
            i11 += i15;
            i12 -= i15;
        }
        randomAccessFile.readFully(bArr, i11, i12);
    }

    public final void b(byte[] bArr) {
        int i10;
        int length = bArr.length;
        synchronized (this) {
            if ((length | 0) >= 0) {
                if (length <= bArr.length - 0) {
                    j(length);
                    boolean H = H();
                    if (H) {
                        i10 = 16;
                    } else {
                        a aVar = this.f18680w;
                        i10 = m0(aVar.f18683a + 4 + aVar.f18684b);
                    }
                    a aVar2 = new a(i10, length);
                    o0(this.f18681x, 0, length);
                    d0(i10, this.f18681x, 4);
                    d0(i10 + 4, bArr, length);
                    n0(this.f18677t, this.f18678u + 1, H ? i10 : this.f18679v.f18683a, i10);
                    this.f18680w = aVar2;
                    this.f18678u++;
                    if (H) {
                        this.f18679v = aVar2;
                    }
                }
            }
            throw new IndexOutOfBoundsException();
        }
    }

    public final synchronized void c() {
        n0(4096, 0, 0, 0);
        this.f18678u = 0;
        a aVar = a.f18682c;
        this.f18679v = aVar;
        this.f18680w = aVar;
        if (this.f18677t > 4096) {
            this.f18676s.setLength(4096);
            this.f18676s.getChannel().force(true);
        }
        this.f18677t = 4096;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f18676s.close();
    }

    public final void d0(int i10, byte[] bArr, int i11) {
        RandomAccessFile randomAccessFile;
        int m02 = m0(i10);
        int i12 = m02 + i11;
        int i13 = this.f18677t;
        int i14 = 0;
        if (i12 <= i13) {
            this.f18676s.seek(m02);
            randomAccessFile = this.f18676s;
        } else {
            int i15 = i13 - m02;
            this.f18676s.seek(m02);
            this.f18676s.write(bArr, 0, i15);
            this.f18676s.seek(16L);
            randomAccessFile = this.f18676s;
            i14 = i15 + 0;
            i11 -= i15;
        }
        randomAccessFile.write(bArr, i14, i11);
    }

    public final int e0() {
        if (this.f18678u == 0) {
            return 16;
        }
        a aVar = this.f18680w;
        int i10 = aVar.f18683a;
        int i11 = this.f18679v.f18683a;
        return i10 >= i11 ? (i10 - i11) + 4 + aVar.f18684b + 16 : (((i10 + 4) + aVar.f18684b) + this.f18677t) - i11;
    }

    public final void j(int i10) {
        int i11 = i10 + 4;
        int e02 = this.f18677t - e0();
        if (e02 >= i11) {
            return;
        }
        int i12 = this.f18677t;
        do {
            e02 += i12;
            i12 <<= 1;
        } while (e02 < i11);
        this.f18676s.setLength(i12);
        this.f18676s.getChannel().force(true);
        a aVar = this.f18680w;
        int m02 = m0(aVar.f18683a + 4 + aVar.f18684b);
        if (m02 < this.f18679v.f18683a) {
            FileChannel channel = this.f18676s.getChannel();
            channel.position(this.f18677t);
            long j3 = m02 - 4;
            if (channel.transferTo(16L, j3, channel) != j3) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i13 = this.f18680w.f18683a;
        int i14 = this.f18679v.f18683a;
        if (i13 < i14) {
            int i15 = (this.f18677t + i13) - 16;
            n0(i12, this.f18678u, i14, i15);
            this.f18680w = new a(i15, this.f18680w.f18684b);
        } else {
            n0(i12, this.f18678u, i14, i13);
        }
        this.f18677t = i12;
    }

    public final int m0(int i10) {
        int i11 = this.f18677t;
        return i10 < i11 ? i10 : (i10 + 16) - i11;
    }

    public final void n0(int i10, int i11, int i12, int i13) {
        byte[] bArr = this.f18681x;
        int[] iArr = {i10, i11, i12, i13};
        int i14 = 0;
        for (int i15 = 0; i15 < 4; i15++) {
            o0(bArr, i14, iArr[i15]);
            i14 += 4;
        }
        this.f18676s.seek(0L);
        this.f18676s.write(this.f18681x);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(c.class.getSimpleName());
        sb.append('[');
        sb.append("fileLength=");
        sb.append(this.f18677t);
        sb.append(", size=");
        sb.append(this.f18678u);
        sb.append(", first=");
        sb.append(this.f18679v);
        sb.append(", last=");
        sb.append(this.f18680w);
        sb.append(", element lengths=[");
        try {
            synchronized (this) {
                int i10 = this.f18679v.f18683a;
                boolean z10 = true;
                for (int i11 = 0; i11 < this.f18678u; i11++) {
                    a I = I(i10);
                    new b(I);
                    int i12 = I.f18684b;
                    if (z10) {
                        z10 = false;
                    } else {
                        sb.append(", ");
                    }
                    sb.append(i12);
                    i10 = m0(I.f18683a + 4 + I.f18684b);
                }
            }
        } catch (IOException e10) {
            y.log(Level.WARNING, "read error", (Throwable) e10);
        }
        sb.append("]]");
        return sb.toString();
    }

    /* loaded from: classes.dex */
    public final class b extends InputStream {

        /* renamed from: s */
        public int f18685s;

        /* renamed from: t */
        public int f18686t;

        public b(a aVar) {
            c.this = r2;
            this.f18685s = r2.m0(aVar.f18683a + 4);
            this.f18686t = aVar.f18684b;
        }

        @Override // java.io.InputStream
        public final int read() {
            if (this.f18686t == 0) {
                return -1;
            }
            c.this.f18676s.seek(this.f18685s);
            int read = c.this.f18676s.read();
            this.f18685s = c.this.m0(this.f18685s + 1);
            this.f18686t--;
            return read;
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i10, int i11) {
            Objects.requireNonNull(bArr, "buffer");
            if ((i10 | i11) < 0 || i11 > bArr.length - i10) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i12 = this.f18686t;
            if (i12 <= 0) {
                return -1;
            }
            if (i11 > i12) {
                i11 = i12;
            }
            c.this.Z(this.f18685s, bArr, i10, i11);
            this.f18685s = c.this.m0(this.f18685s + i11);
            this.f18686t -= i11;
            return i11;
        }
    }
}
