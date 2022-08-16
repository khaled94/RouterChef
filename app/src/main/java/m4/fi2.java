package m4;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.Objects;
import l4.b;
import t3.t;

/* loaded from: classes.dex */
public final class fi2 implements oi2 {

    /* renamed from: a */
    public final MediaCodec f8569a;

    /* renamed from: b */
    public final ji2 f8570b;

    /* renamed from: c */
    public final ii2 f8571c;

    /* renamed from: d */
    public boolean f8572d;

    /* renamed from: e */
    public int f8573e = 0;

    public /* synthetic */ fi2(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2) {
        this.f8569a = mediaCodec;
        this.f8570b = new ji2(handlerThread);
        this.f8571c = new ii2(mediaCodec, handlerThread2);
    }

    public static void k(fi2 fi2Var, MediaFormat mediaFormat, Surface surface) {
        ji2 ji2Var = fi2Var.f8570b;
        MediaCodec mediaCodec = fi2Var.f8569a;
        r01.h(ji2Var.f10086c == null);
        ji2Var.f10085b.start();
        Handler handler = new Handler(ji2Var.f10085b.getLooper());
        mediaCodec.setCallback(ji2Var, handler);
        ji2Var.f10086c = handler;
        b.o("configureCodec");
        fi2Var.f8569a.configure(mediaFormat, surface, (MediaCrypto) null, 0);
        b.r();
        ii2 ii2Var = fi2Var.f8571c;
        if (!ii2Var.f9667f) {
            ii2Var.f9663b.start();
            ii2Var.f9664c = new gi2(ii2Var, ii2Var.f9663b.getLooper());
            ii2Var.f9667f = true;
        }
        b.o("startCodec");
        fi2Var.f8569a.start();
        b.r();
        fi2Var.f8573e = 1;
    }

    public static String m(int i10, String str) {
        String str2;
        StringBuilder sb = new StringBuilder(str);
        if (i10 == 1) {
            str2 = "Audio";
        } else if (i10 == 2) {
            str2 = "Video";
        } else {
            sb.append("Unknown(");
            sb.append(i10);
            str2 = ")";
        }
        sb.append(str2);
        return sb.toString();
    }

    @Override // m4.oi2
    public final ByteBuffer A(int i10) {
        return this.f8569a.getOutputBuffer(i10);
    }

    @Override // m4.oi2
    public final void a(int i10) {
        this.f8569a.setVideoScalingMode(i10);
    }

    @Override // m4.oi2
    public final void b(int i10, xi0 xi0Var, long j3) {
        this.f8571c.b(i10, xi0Var, j3);
    }

    @Override // m4.oi2
    public final MediaFormat c() {
        MediaFormat mediaFormat;
        ji2 ji2Var = this.f8570b;
        synchronized (ji2Var.f10084a) {
            mediaFormat = ji2Var.f10091h;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    @Override // m4.oi2
    public final void d(int i10, boolean z10) {
        this.f8569a.releaseOutputBuffer(i10, z10);
    }

    @Override // m4.oi2
    public final void e(int i10, int i11, long j3, int i12) {
        ii2 ii2Var = this.f8571c;
        ii2Var.d();
        hi2 c10 = ii2.c();
        c10.f9348a = i10;
        c10.f9349b = i11;
        c10.f9351d = j3;
        c10.f9352e = i12;
        gi2 gi2Var = ii2Var.f9664c;
        int i13 = ls1.f10971a;
        gi2Var.obtainMessage(0, c10).sendToTarget();
    }

    @Override // m4.oi2
    public final void f(Bundle bundle) {
        this.f8569a.setParameters(bundle);
    }

    @Override // m4.oi2
    public final void g(Surface surface) {
        this.f8569a.setOutputSurface(surface);
    }

    @Override // m4.oi2
    public final void h() {
        this.f8571c.a();
        this.f8569a.flush();
        ji2 ji2Var = this.f8570b;
        MediaCodec mediaCodec = this.f8569a;
        Objects.requireNonNull(mediaCodec);
        di2 di2Var = new di2(mediaCodec);
        synchronized (ji2Var.f10084a) {
            ji2Var.f10094k++;
            Handler handler = ji2Var.f10086c;
            int i10 = ls1.f10971a;
            handler.post(new t(ji2Var, di2Var, 3));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001c A[Catch: all -> 0x0067, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x000f, B:13:0x001a, B:15:0x001c, B:17:0x0021, B:19:0x0025, B:24:0x002f, B:26:0x0036, B:28:0x0052, B:31:0x0061, B:32:0x0063, B:33:0x0064, B:34:0x0066), top: B:38:0x0005 }] */
    @Override // m4.oi2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int i(android.media.MediaCodec.BufferInfo r10) {
        /*
            r9 = this;
            m4.ji2 r0 = r9.f8570b
            java.lang.Object r1 = r0.f10084a
            monitor-enter(r1)
            long r2 = r0.f10094k     // Catch: java.lang.Throwable -> L67
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r2 > 0) goto L16
            boolean r2 = r0.f10095l     // Catch: java.lang.Throwable -> L67
            if (r2 == 0) goto L14
            goto L16
        L14:
            r2 = r3
            goto L17
        L16:
            r2 = r4
        L17:
            r5 = -1
            if (r2 == 0) goto L1c
        L1a:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L67
            goto L60
        L1c:
            java.lang.IllegalStateException r2 = r0.f10096m     // Catch: java.lang.Throwable -> L67
            r6 = 0
            if (r2 != 0) goto L64
            android.media.MediaCodec$CodecException r2 = r0.f10093j     // Catch: java.lang.Throwable -> L67
            if (r2 != 0) goto L61
            m4.ni2 r2 = r0.f10088e     // Catch: java.lang.Throwable -> L67
            int r6 = r2.f11794c     // Catch: java.lang.Throwable -> L67
            if (r6 != 0) goto L2c
            r3 = r4
        L2c:
            if (r3 == 0) goto L2f
            goto L1a
        L2f:
            int r2 = r2.a()     // Catch: java.lang.Throwable -> L67
            r3 = -2
            if (r2 < 0) goto L50
            android.media.MediaFormat r3 = r0.f10091h     // Catch: java.lang.Throwable -> L67
            m4.r01.d(r3)     // Catch: java.lang.Throwable -> L67
            java.util.ArrayDeque<android.media.MediaCodec$BufferInfo> r0 = r0.f10089f     // Catch: java.lang.Throwable -> L67
            java.lang.Object r0 = r0.remove()     // Catch: java.lang.Throwable -> L67
            android.media.MediaCodec$BufferInfo r0 = (android.media.MediaCodec.BufferInfo) r0     // Catch: java.lang.Throwable -> L67
            int r4 = r0.offset     // Catch: java.lang.Throwable -> L67
            int r5 = r0.size     // Catch: java.lang.Throwable -> L67
            long r6 = r0.presentationTimeUs     // Catch: java.lang.Throwable -> L67
            int r8 = r0.flags     // Catch: java.lang.Throwable -> L67
            r3 = r10
            r3.set(r4, r5, r6, r8)     // Catch: java.lang.Throwable -> L67
            goto L5e
        L50:
            if (r2 != r3) goto L5e
            java.util.ArrayDeque<android.media.MediaFormat> r10 = r0.f10090g     // Catch: java.lang.Throwable -> L67
            java.lang.Object r10 = r10.remove()     // Catch: java.lang.Throwable -> L67
            android.media.MediaFormat r10 = (android.media.MediaFormat) r10     // Catch: java.lang.Throwable -> L67
            r0.f10091h = r10     // Catch: java.lang.Throwable -> L67
            r5 = r3
            goto L1a
        L5e:
            r5 = r2
            goto L1a
        L60:
            return r5
        L61:
            r0.f10093j = r6     // Catch: java.lang.Throwable -> L67
            throw r2     // Catch: java.lang.Throwable -> L67
        L64:
            r0.f10096m = r6     // Catch: java.lang.Throwable -> L67
            throw r2     // Catch: java.lang.Throwable -> L67
        L67:
            r10 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L67
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.fi2.i(android.media.MediaCodec$BufferInfo):int");
    }

    @Override // m4.oi2
    public final void j(int i10, long j3) {
        this.f8569a.releaseOutputBuffer(i10, j3);
    }

    @Override // m4.oi2
    public final void l() {
        try {
            if (this.f8573e == 1) {
                ii2 ii2Var = this.f8571c;
                if (ii2Var.f9667f) {
                    ii2Var.a();
                    ii2Var.f9663b.quit();
                }
                ii2Var.f9667f = false;
                ji2 ji2Var = this.f8570b;
                synchronized (ji2Var.f10084a) {
                    ji2Var.f10095l = true;
                    ji2Var.f10085b.quit();
                    ji2Var.a();
                }
            }
            this.f8573e = 2;
            if (this.f8572d) {
                return;
            }
            this.f8569a.release();
            this.f8572d = true;
        } catch (Throwable th) {
            if (!this.f8572d) {
                this.f8569a.release();
                this.f8572d = true;
            }
            throw th;
        }
    }

    @Override // m4.oi2
    public final ByteBuffer w(int i10) {
        return this.f8569a.getInputBuffer(i10);
    }

    @Override // m4.oi2
    public final void x() {
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001c A[Catch: all -> 0x003b, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x000f, B:13:0x001a, B:15:0x001c, B:17:0x0021, B:19:0x0025, B:24:0x002f, B:26:0x0035, B:27:0x0037, B:28:0x0038, B:29:0x003a), top: B:33:0x0005 }] */
    @Override // m4.oi2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza() {
        /*
            r7 = this;
            m4.ji2 r0 = r7.f8570b
            java.lang.Object r1 = r0.f10084a
            monitor-enter(r1)
            long r2 = r0.f10094k     // Catch: java.lang.Throwable -> L3b
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r2 > 0) goto L16
            boolean r2 = r0.f10095l     // Catch: java.lang.Throwable -> L3b
            if (r2 == 0) goto L14
            goto L16
        L14:
            r2 = r3
            goto L17
        L16:
            r2 = r4
        L17:
            r5 = -1
            if (r2 == 0) goto L1c
        L1a:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L3b
            goto L34
        L1c:
            java.lang.IllegalStateException r2 = r0.f10096m     // Catch: java.lang.Throwable -> L3b
            r6 = 0
            if (r2 != 0) goto L38
            android.media.MediaCodec$CodecException r2 = r0.f10093j     // Catch: java.lang.Throwable -> L3b
            if (r2 != 0) goto L35
            m4.ni2 r0 = r0.f10087d     // Catch: java.lang.Throwable -> L3b
            int r2 = r0.f11794c     // Catch: java.lang.Throwable -> L3b
            if (r2 != 0) goto L2c
            r3 = r4
        L2c:
            if (r3 == 0) goto L2f
            goto L1a
        L2f:
            int r5 = r0.a()     // Catch: java.lang.Throwable -> L3b
            goto L1a
        L34:
            return r5
        L35:
            r0.f10093j = r6     // Catch: java.lang.Throwable -> L3b
            throw r2     // Catch: java.lang.Throwable -> L3b
        L38:
            r0.f10096m = r6     // Catch: java.lang.Throwable -> L3b
            throw r2     // Catch: java.lang.Throwable -> L3b
        L3b:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L3b
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.fi2.zza():int");
    }
}
