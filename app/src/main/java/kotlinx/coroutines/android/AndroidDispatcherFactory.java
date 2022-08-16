package kotlinx.coroutines.android;

import android.os.Looper;
import java.util.List;
import k9.t0;
import l9.a;
import l9.c;
import n9.k;

/* loaded from: classes.dex */
public final class AndroidDispatcherFactory implements k {
    @Override // n9.k
    public t0 createDispatcher(List<? extends k> list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new a(c.a(mainLooper), null, false);
        }
        throw new IllegalStateException("The main looper is not available");
    }

    @Override // n9.k
    public int getLoadPriority() {
        return 1073741823;
    }

    @Override // n9.k
    public String hintOnError() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }
}
