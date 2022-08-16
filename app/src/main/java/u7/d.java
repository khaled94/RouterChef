package u7;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

/* loaded from: classes.dex */
public final class d {

    /* loaded from: classes.dex */
    public static final class a extends FilterInputStream {

        /* renamed from: t */
        public long f19488t = -1;

        /* renamed from: s */
        public long f19487s = 1048577;

        public a(InputStream inputStream) {
            super(inputStream);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final int available() {
            return (int) Math.min(((FilterInputStream) this).in.available(), this.f19487s);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final synchronized void mark(int i10) {
            ((FilterInputStream) this).in.mark(i10);
            this.f19488t = this.f19487s;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final int read() {
            if (this.f19487s == 0) {
                return -1;
            }
            int read = ((FilterInputStream) this).in.read();
            if (read != -1) {
                this.f19487s--;
            }
            return read;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final int read(byte[] bArr, int i10, int i11) {
            long j3 = this.f19487s;
            if (j3 == 0) {
                return -1;
            }
            int read = ((FilterInputStream) this).in.read(bArr, i10, (int) Math.min(i11, j3));
            if (read != -1) {
                this.f19487s -= read;
            }
            return read;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final synchronized void reset() {
            if (!((FilterInputStream) this).in.markSupported()) {
                throw new IOException("Mark not supported");
            }
            if (this.f19488t == -1) {
                throw new IOException("Mark not set");
            }
            ((FilterInputStream) this).in.reset();
            this.f19487s = this.f19488t;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final long skip(long j3) {
            long skip = ((FilterInputStream) this).in.skip(Math.min(j3, this.f19487s));
            this.f19487s -= skip;
            return skip;
        }
    }

    public static byte[] a(Queue<byte[]> queue, int i10) {
        if (queue.isEmpty()) {
            return new byte[0];
        }
        byte[] remove = queue.remove();
        if (remove.length == i10) {
            return remove;
        }
        int length = i10 - remove.length;
        byte[] copyOf = Arrays.copyOf(remove, i10);
        while (length > 0) {
            byte[] remove2 = queue.remove();
            int min = Math.min(length, remove2.length);
            System.arraycopy(remove2, 0, copyOf, i10 - length, min);
            length -= min;
        }
        return copyOf;
    }

    public static byte[] b(InputStream inputStream) {
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int min = Math.min(8192, Math.max(128, Integer.highestOneBit(0) * 2));
        int i10 = 0;
        while (i10 < 2147483639) {
            int min2 = Math.min(min, 2147483639 - i10);
            byte[] bArr = new byte[min2];
            arrayDeque.add(bArr);
            int i11 = 0;
            while (i11 < min2) {
                int read = inputStream.read(bArr, i11, min2 - i11);
                if (read == -1) {
                    return a(arrayDeque, i10);
                }
                i11 += read;
                i10 += read;
            }
            long j3 = min * (min < 4096 ? 4 : 2);
            min = j3 > 2147483647L ? Integer.MAX_VALUE : j3 < -2147483648L ? Integer.MIN_VALUE : (int) j3;
        }
        if (inputStream.read() == -1) {
            return a(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }
}
