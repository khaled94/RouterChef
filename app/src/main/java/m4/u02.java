package m4;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class u02 {

    /* renamed from: a */
    public static final CopyOnWriteArrayList<t02> f14239a = new CopyOnWriteArrayList<>();

    public static t02 a(String str) {
        Iterator<t02> it = f14239a.iterator();
        while (it.hasNext()) {
            t02 next = it.next();
            if (next.zza()) {
                return next;
            }
        }
        String valueOf = String.valueOf(str);
        throw new GeneralSecurityException(valueOf.length() != 0 ? "No KMS client does support: ".concat(valueOf) : new String("No KMS client does support: "));
    }
}
