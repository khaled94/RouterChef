package m4;

import android.media.MediaCodec;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class ii2 {

    /* renamed from: g */
    public static final ArrayDeque<hi2> f9660g = new ArrayDeque<>();

    /* renamed from: h */
    public static final Object f9661h = new Object();

    /* renamed from: a */
    public final MediaCodec f9662a;

    /* renamed from: b */
    public final HandlerThread f9663b;

    /* renamed from: c */
    public gi2 f9664c;

    /* renamed from: d */
    public final AtomicReference<RuntimeException> f9665d = new AtomicReference<>();

    /* renamed from: e */
    public final h21 f9666e;

    /* renamed from: f */
    public boolean f9667f;

    public ii2(MediaCodec mediaCodec, HandlerThread handlerThread) {
        h21 h21Var = new h21();
        this.f9662a = mediaCodec;
        this.f9663b = handlerThread;
        this.f9666e = h21Var;
    }

    public static hi2 c() {
        ArrayDeque<hi2> arrayDeque = f9660g;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                return new hi2();
            }
            return arrayDeque.removeFirst();
        }
    }

    public static byte[] e(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 != null) {
            int length = bArr2.length;
            int length2 = bArr.length;
            if (length >= length2) {
                System.arraycopy(bArr, 0, bArr2, 0, length2);
                return bArr2;
            }
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    public static int[] f(int[] iArr, int[] iArr2) {
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 != null) {
            int length = iArr2.length;
            int length2 = iArr.length;
            if (length >= length2) {
                System.arraycopy(iArr, 0, iArr2, 0, length2);
                return iArr2;
            }
        }
        return Arrays.copyOf(iArr, iArr.length);
    }

    public final void a() {
        if (this.f9667f) {
            try {
                gi2 gi2Var = this.f9664c;
                int i10 = ls1.f10971a;
                gi2Var.removeCallbacksAndMessages(null);
                this.f9666e.a();
                this.f9664c.obtainMessage(2).sendToTarget();
                h21 h21Var = this.f9666e;
                synchronized (h21Var) {
                    while (!h21Var.f9086s) {
                        h21Var.wait();
                    }
                }
                d();
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }

    public final void b(int i10, xi0 xi0Var, long j3) {
        d();
        hi2 c10 = c();
        c10.f9348a = i10;
        c10.f9349b = 0;
        c10.f9351d = j3;
        c10.f9352e = 0;
        MediaCodec.CryptoInfo cryptoInfo = c10.f9350c;
        cryptoInfo.numSubSamples = xi0Var.f15366f;
        cryptoInfo.numBytesOfClearData = f(xi0Var.f15364d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = f(xi0Var.f15365e, cryptoInfo.numBytesOfEncryptedData);
        byte[] e10 = e(xi0Var.f15362b, cryptoInfo.key);
        Objects.requireNonNull(e10);
        cryptoInfo.key = e10;
        byte[] e11 = e(xi0Var.f15361a, cryptoInfo.iv);
        Objects.requireNonNull(e11);
        cryptoInfo.iv = e11;
        cryptoInfo.mode = xi0Var.f15363c;
        if (ls1.f10971a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(xi0Var.f15367g, xi0Var.f15368h));
        }
        this.f9664c.obtainMessage(1, c10).sendToTarget();
    }

    public final void d() {
        RuntimeException andSet = this.f9665d.getAndSet(null);
        if (andSet == null) {
            return;
        }
        throw andSet;
    }
}
