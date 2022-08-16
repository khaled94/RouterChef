package k9;

import x8.f;

/* loaded from: classes.dex */
public final class y extends RuntimeException {

    /* renamed from: s */
    public final f f5697s;

    public y(f fVar) {
        this.f5697s = fVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return this.f5697s.toString();
    }
}
