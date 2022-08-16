package b4;

import a4.d;

/* loaded from: classes.dex */
public final class j extends UnsupportedOperationException {

    /* renamed from: s */
    public final d f2571s;

    public j(d dVar) {
        this.f2571s = dVar;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(this.f2571s));
    }
}
