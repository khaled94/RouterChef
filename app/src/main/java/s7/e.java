package s7;

import java.util.Objects;
import java.util.concurrent.TimeUnit;
import p7.m;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: d */
    public static final long f18363d = TimeUnit.HOURS.toMillis(24);

    /* renamed from: e */
    public static final long f18364e = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a */
    public final m f18365a = m.c();

    /* renamed from: b */
    public long f18366b;

    /* renamed from: c */
    public int f18367c;

    public final synchronized boolean a() {
        boolean z10;
        if (this.f18367c != 0) {
            if (this.f18365a.a() <= this.f18366b) {
                z10 = false;
            }
        }
        z10 = true;
        return z10;
    }

    public final synchronized void b(int i10) {
        long min;
        boolean z10 = false;
        if ((i10 >= 200 && i10 < 300) || i10 == 401 || i10 == 404) {
            synchronized (this) {
                this.f18367c = 0;
            }
            return;
        }
        this.f18367c++;
        synchronized (this) {
            if (i10 == 429 || (i10 >= 500 && i10 < 600)) {
                z10 = true;
            }
            if (!z10) {
                min = f18363d;
            } else {
                double pow = Math.pow(2.0d, this.f18367c);
                Objects.requireNonNull(this.f18365a);
                min = (long) Math.min(pow + ((long) (Math.random() * 1000.0d)), f18364e);
            }
            this.f18366b = this.f18365a.a() + min;
        }
    }
}
