package m4;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
public class ow0 extends mq0 {
    public ow0() {
        super(b(2008, 1));
    }

    public ow0(IOException iOException, int i10, int i11) {
        super(iOException, b(i10, i11));
    }

    public ow0(String str) {
        super(str, b(2001, 1));
    }

    public ow0(String str, IOException iOException, int i10) {
        super(str, iOException, b(i10, 1));
    }

    public static ow0 a(IOException iOException, gs0 gs0Var, int i10) {
        String message = iOException.getMessage();
        int i11 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? 1004 : (message == null || !x90.b(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i11 == 2007 ? new sv0(iOException, gs0Var) : new ow0(iOException, i11, i10);
    }

    public static int b(int i10, int i11) {
        return i10 == 2000 ? i11 != 1 ? 2000 : 2001 : i10;
    }
}
