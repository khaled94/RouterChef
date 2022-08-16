package m4;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class ji2 extends MediaCodec.Callback {

    /* renamed from: b */
    public final HandlerThread f10085b;

    /* renamed from: c */
    public Handler f10086c;

    /* renamed from: h */
    public MediaFormat f10091h;

    /* renamed from: i */
    public MediaFormat f10092i;

    /* renamed from: j */
    public MediaCodec.CodecException f10093j;

    /* renamed from: k */
    public long f10094k;

    /* renamed from: l */
    public boolean f10095l;

    /* renamed from: m */
    public IllegalStateException f10096m;

    /* renamed from: a */
    public final Object f10084a = new Object();

    /* renamed from: d */
    public final ni2 f10087d = new ni2();

    /* renamed from: e */
    public final ni2 f10088e = new ni2();

    /* renamed from: f */
    public final ArrayDeque<MediaCodec.BufferInfo> f10089f = new ArrayDeque<>();

    /* renamed from: g */
    public final ArrayDeque<MediaFormat> f10090g = new ArrayDeque<>();

    public ji2(HandlerThread handlerThread) {
        this.f10085b = handlerThread;
    }

    public final void a() {
        if (!this.f10090g.isEmpty()) {
            this.f10092i = this.f10090g.getLast();
        }
        ni2 ni2Var = this.f10087d;
        ni2Var.f11792a = 0;
        ni2Var.f11793b = -1;
        ni2Var.f11794c = 0;
        ni2 ni2Var2 = this.f10088e;
        ni2Var2.f11792a = 0;
        ni2Var2.f11793b = -1;
        ni2Var2.f11794c = 0;
        this.f10089f.clear();
        this.f10090g.clear();
        this.f10093j = null;
    }

    public final void b(IllegalStateException illegalStateException) {
        synchronized (this.f10084a) {
            this.f10096m = illegalStateException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f10084a) {
            this.f10093j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        synchronized (this.f10084a) {
            this.f10087d.b(i10);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f10084a) {
            MediaFormat mediaFormat = this.f10092i;
            if (mediaFormat != null) {
                this.f10088e.b(-2);
                this.f10090g.add(mediaFormat);
                this.f10092i = null;
            }
            this.f10088e.b(i10);
            this.f10089f.add(bufferInfo);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f10084a) {
            this.f10088e.b(-2);
            this.f10090g.add(mediaFormat);
            this.f10092i = null;
        }
    }
}
