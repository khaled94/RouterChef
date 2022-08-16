package m4;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.Objects;

/* loaded from: classes.dex */
public final class mn2 extends HandlerThread implements Handler.Callback {

    /* renamed from: s */
    public z51 f11258s;

    /* renamed from: t */
    public Handler f11259t;

    /* renamed from: u */
    public Error f11260u;

    /* renamed from: v */
    public RuntimeException f11261v;

    /* renamed from: w */
    public nn2 f11262w;

    public mn2() {
        super("ExoPlayer:DummySurface");
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        try {
            if (i10 != 1) {
                if (i10 != 2) {
                    return true;
                }
                try {
                    z51 z51Var = this.f11258s;
                    Objects.requireNonNull(z51Var);
                    z51Var.b();
                } finally {
                    try {
                        return true;
                    } finally {
                    }
                }
                return true;
            }
            try {
                int i11 = message.arg1;
                z51 z51Var2 = this.f11258s;
                Objects.requireNonNull(z51Var2);
                z51Var2.a(i11);
                SurfaceTexture surfaceTexture = this.f11258s.f16008x;
                Objects.requireNonNull(surfaceTexture);
                this.f11262w = new nn2(this, surfaceTexture, i11 != 0);
                synchronized (this) {
                    notify();
                }
            } catch (Error e10) {
                x90.e("DummySurface", "Failed to initialize dummy surface", e10);
                this.f11260u = e10;
                synchronized (this) {
                    notify();
                }
            } catch (RuntimeException e11) {
                x90.e("DummySurface", "Failed to initialize dummy surface", e11);
                this.f11261v = e11;
                synchronized (this) {
                    notify();
                }
            }
            return true;
        } catch (Throwable th) {
            synchronized (this) {
                notify();
                throw th;
            }
        }
    }
}
