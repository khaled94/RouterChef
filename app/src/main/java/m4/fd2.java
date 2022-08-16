package m4;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class fd2 extends x50 {

    /* renamed from: a */
    public final Logger f8429a;

    public fd2(String str) {
        this.f8429a = Logger.getLogger(str);
    }

    @Override // m4.x50
    public final void c(String str) {
        this.f8429a.logp(Level.FINE, "com.googlecode.mp4parser.util.JuliLogger", "logDebug", str);
    }
}
