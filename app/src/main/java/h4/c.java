package h4;

import android.os.SystemClock;

/* loaded from: classes.dex */
public final class c implements a {

    /* renamed from: a */
    public static final c f5072a = new c();

    @Override // h4.a
    public final long a() {
        return System.currentTimeMillis();
    }

    @Override // h4.a
    public final long b() {
        return SystemClock.elapsedRealtime();
    }
}
