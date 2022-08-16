package m4;

import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class c02 extends TimeoutException {
    public /* synthetic */ c02(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
