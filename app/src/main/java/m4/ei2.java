package m4;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.HandlerThread;
import android.view.Surface;
import l4.b;

/* loaded from: classes.dex */
public final class ei2 {

    /* renamed from: a */
    public final nu1<HandlerThread> f7974a;

    /* renamed from: b */
    public final nu1<HandlerThread> f7975b;

    public ei2(int i10) {
        pl1 pl1Var = new pl1(i10);
        rf2 rf2Var = new rf2(i10);
        this.f7974a = pl1Var;
        this.f7975b = rf2Var;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [m4.nu1<android.os.HandlerThread>, m4.pl1] */
    /* JADX WARN: Type inference failed for: r3v4, types: [m4.nu1<android.os.HandlerThread>, m4.rf2] */
    public final fi2 a(ee0 ee0Var) {
        Exception e10;
        MediaCodec mediaCodec;
        fi2 fi2Var;
        String str = ((qi2) ee0Var.f7804s).f12883a;
        fi2 fi2Var2 = null;
        try {
            String valueOf = String.valueOf(str);
            b.o(valueOf.length() != 0 ? "createCodec:".concat(valueOf) : new String("createCodec:"));
            mediaCodec = MediaCodec.createByCodecName(str);
            try {
                fi2Var = new fi2(mediaCodec, new HandlerThread(fi2.m(this.f7974a.f12559s, "ExoPlayer:MediaCodecAsyncAdapter:")), new HandlerThread(fi2.m(this.f7975b.f13266s, "ExoPlayer:MediaCodecQueueingThread:")));
            } catch (Exception e11) {
                e10 = e11;
            }
        } catch (Exception e12) {
            e10 = e12;
            mediaCodec = null;
        }
        try {
            b.r();
            fi2.k(fi2Var, (MediaFormat) ee0Var.f7805t, (Surface) ee0Var.f7807v);
            return fi2Var;
        } catch (Exception e13) {
            e10 = e13;
            fi2Var2 = fi2Var;
            if (fi2Var2 != null) {
                fi2Var2.l();
            } else if (mediaCodec != null) {
                mediaCodec.release();
            }
            throw e10;
        }
    }
}
