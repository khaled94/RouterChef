package m4;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class ox {

    /* renamed from: a */
    public boolean f12300a = false;

    /* renamed from: b */
    public boolean f12301b = false;

    /* renamed from: c */
    public float f12302c = 0.0f;

    /* renamed from: d */
    public final AtomicBoolean f12303d = new AtomicBoolean(false);

    public final synchronized float a() {
        return this.f12302c;
    }

    public final synchronized boolean b() {
        return this.f12301b;
    }

    public final synchronized boolean c(boolean z10) {
        if (this.f12303d.get()) {
            return this.f12300a;
        }
        return z10;
    }
}
