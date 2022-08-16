package m4;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class s22 {

    /* renamed from: a */
    public static final Logger f13499a = Logger.getLogger(s22.class.getName());

    /* renamed from: b */
    public static final AtomicBoolean f13500b = new AtomicBoolean(false);

    public static boolean a() {
        return f13500b.get();
    }
}
