package ca;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class q extends c {

    /* renamed from: k */
    public final /* synthetic */ Socket f2867k;

    public q(Socket socket) {
        this.f2867k = socket;
    }

    @Override // ca.c
    public final IOException m(@Nullable IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ca.c
    public final void n() {
        StringBuilder sb;
        Level level;
        Logger logger;
        Exception exc;
        try {
            this.f2867k.close();
        } catch (AssertionError e10) {
            if (!o.b(e10)) {
                throw e10;
            }
            Logger logger2 = o.f2862a;
            level = Level.WARNING;
            sb = new StringBuilder();
            exc = e10;
            logger = logger2;
            sb.append("Failed to close timed out socket ");
            sb.append(this.f2867k);
            logger.log(level, sb.toString(), (Throwable) exc);
        } catch (Exception e11) {
            Logger logger3 = o.f2862a;
            level = Level.WARNING;
            sb = new StringBuilder();
            exc = e11;
            logger = logger3;
            sb.append("Failed to close timed out socket ");
            sb.append(this.f2867k);
            logger.log(level, sb.toString(), (Throwable) exc);
        }
    }
}
