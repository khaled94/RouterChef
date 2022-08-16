package m4;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public interface oi2 {
    ByteBuffer A(int i10);

    void a(int i10);

    void b(int i10, xi0 xi0Var, long j3);

    MediaFormat c();

    void d(int i10, boolean z10);

    void e(int i10, int i11, long j3, int i12);

    void f(Bundle bundle);

    void g(Surface surface);

    void h();

    int i(MediaCodec.BufferInfo bufferInfo);

    void j(int i10, long j3);

    void l();

    ByteBuffer w(int i10);

    void x();

    int zza();
}
