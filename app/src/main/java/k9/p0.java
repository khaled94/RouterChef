package k9;

import e9.f;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class p0 extends CancellationException {

    /* renamed from: s */
    public final o0 f5678s;

    public p0(String str, Throwable th, o0 o0Var) {
        super(str);
        this.f5678s = o0Var;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof p0) {
                p0 p0Var = (p0) obj;
                if (!f.a(p0Var.getMessage(), getMessage()) || !f.a(p0Var.f5678s, this.f5678s) || !f.a(p0Var.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        f.c(message);
        int hashCode = (this.f5678s.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return hashCode + (cause == null ? 0 : cause.hashCode());
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.f5678s;
    }
}
