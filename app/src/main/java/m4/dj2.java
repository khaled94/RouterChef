package m4;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class dj2 implements oi2 {

    /* renamed from: a */
    public final MediaCodec f7528a;

    /* renamed from: b */
    public ByteBuffer[] f7529b;

    /* renamed from: c */
    public ByteBuffer[] f7530c;

    public /* synthetic */ dj2(MediaCodec mediaCodec) {
        this.f7528a = mediaCodec;
        if (ls1.f10971a < 21) {
            this.f7529b = mediaCodec.getInputBuffers();
            this.f7530c = mediaCodec.getOutputBuffers();
        }
    }

    @Override // m4.oi2
    public final ByteBuffer A(int i10) {
        return ls1.f10971a >= 21 ? this.f7528a.getOutputBuffer(i10) : this.f7530c[i10];
    }

    @Override // m4.oi2
    public final void a(int i10) {
        this.f7528a.setVideoScalingMode(i10);
    }

    @Override // m4.oi2
    public final void b(int i10, xi0 xi0Var, long j3) {
        this.f7528a.queueSecureInputBuffer(i10, 0, xi0Var.f15369i, j3, 0);
    }

    @Override // m4.oi2
    public final MediaFormat c() {
        return this.f7528a.getOutputFormat();
    }

    @Override // m4.oi2
    public final void d(int i10, boolean z10) {
        this.f7528a.releaseOutputBuffer(i10, z10);
    }

    @Override // m4.oi2
    public final void e(int i10, int i11, long j3, int i12) {
        this.f7528a.queueInputBuffer(i10, 0, i11, j3, i12);
    }

    @Override // m4.oi2
    public final void f(Bundle bundle) {
        this.f7528a.setParameters(bundle);
    }

    @Override // m4.oi2
    public final void g(Surface surface) {
        this.f7528a.setOutputSurface(surface);
    }

    @Override // m4.oi2
    public final void h() {
        this.f7528a.flush();
    }

    @Override // m4.oi2
    public final int i(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.f7528a.dequeueOutputBuffer(bufferInfo, 0L);
            if (dequeueOutputBuffer == -3) {
                if (ls1.f10971a < 21) {
                    this.f7530c = this.f7528a.getOutputBuffers();
                }
                dequeueOutputBuffer = -3;
                continue;
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // m4.oi2
    public final void j(int i10, long j3) {
        this.f7528a.releaseOutputBuffer(i10, j3);
    }

    @Override // m4.oi2
    public final void l() {
        this.f7529b = null;
        this.f7530c = null;
        this.f7528a.release();
    }

    @Override // m4.oi2
    public final ByteBuffer w(int i10) {
        return ls1.f10971a >= 21 ? this.f7528a.getInputBuffer(i10) : this.f7529b[i10];
    }

    @Override // m4.oi2
    public final void x() {
    }

    @Override // m4.oi2
    public final int zza() {
        return this.f7528a.dequeueInputBuffer(0L);
    }
}
