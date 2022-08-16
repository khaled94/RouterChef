package n9;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.ServiceConfigurationError;
import kotlinx.coroutines.android.AndroidDispatcherFactory;

/* loaded from: classes.dex */
public final /* synthetic */ class l {
    public static /* synthetic */ Iterator a() {
        try {
            return Arrays.asList(new AndroidDispatcherFactory()).iterator();
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    public static Map b(HashMap hashMap) {
        return Collections.unmodifiableMap(new HashMap(hashMap));
    }
}
