package l9;

import android.os.Handler;
import android.os.Looper;
import androidx.appcompat.widget.p;
import java.util.concurrent.CancellationException;
import k9.b0;
import k9.t0;
import x8.f;

/* loaded from: classes.dex */
public final class a extends b {
    private volatile a _immediate;

    /* renamed from: t */
    public final Handler f5825t;

    /* renamed from: u */
    public final String f5826u;

    /* renamed from: v */
    public final boolean f5827v;

    /* renamed from: w */
    public final a f5828w;

    public a(Handler handler, String str, boolean z10) {
        this.f5825t = handler;
        this.f5826u = str;
        this.f5827v = z10;
        this._immediate = z10 ? this : null;
        a aVar = this._immediate;
        if (aVar == null) {
            aVar = new a(handler, str, true);
            this._immediate = aVar;
        }
        this.f5828w = aVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a) && ((a) obj).f5825t == this.f5825t;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f5825t);
    }

    @Override // k9.q
    public final void m0(f fVar, Runnable runnable) {
        if (!this.f5825t.post(runnable)) {
            p.b(fVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
            b0.f5641b.m0(fVar, runnable);
        }
    }

    @Override // k9.q
    public final boolean n0() {
        return !this.f5827v || !e9.f.a(Looper.myLooper(), this.f5825t.getLooper());
    }

    @Override // k9.t0
    public final t0 o0() {
        return this.f5828w;
    }

    @Override // k9.t0, k9.q
    public final String toString() {
        String p02 = p0();
        if (p02 == null) {
            String str = this.f5826u;
            if (str == null) {
                str = this.f5825t.toString();
            }
            return this.f5827v ? e9.f.j(str, ".immediate") : str;
        }
        return p02;
    }
}
