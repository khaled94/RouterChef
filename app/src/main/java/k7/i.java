package k7;

import h7.b;
import h7.c;
import h7.g;

/* loaded from: classes.dex */
public final class i implements g {

    /* renamed from: a */
    public boolean f5630a = false;

    /* renamed from: b */
    public boolean f5631b = false;

    /* renamed from: c */
    public c f5632c;

    /* renamed from: d */
    public final f f5633d;

    public i(f fVar) {
        this.f5633d = fVar;
    }

    @Override // h7.g
    public final g c(String str) {
        if (!this.f5630a) {
            this.f5630a = true;
            this.f5633d.c(this.f5632c, str, this.f5631b);
            return this;
        }
        throw new b("Cannot encode a second value in the ValueEncoderContext");
    }

    @Override // h7.g
    public final g d(boolean z10) {
        if (!this.f5630a) {
            this.f5630a = true;
            this.f5633d.d(this.f5632c, z10 ? 1 : 0, this.f5631b);
            return this;
        }
        throw new b("Cannot encode a second value in the ValueEncoderContext");
    }
}
