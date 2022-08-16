package m4;

import android.os.Environment;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class qr implements Callable<Boolean> {
    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Boolean call() {
        return Boolean.valueOf("mounted".equals(Environment.getExternalStorageState()));
    }
}
