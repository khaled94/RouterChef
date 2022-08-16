package b6;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Objects;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: c */
    public static a f2588c;

    /* renamed from: a */
    public final Object f2589a = new Object();

    /* renamed from: b */
    public final Handler f2590b = new Handler(Looper.getMainLooper(), new C0035a());

    /* renamed from: b6.a$a */
    /* loaded from: classes.dex */
    public class C0035a implements Handler.Callback {
        public C0035a() {
            a.this = r1;
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            a aVar = a.this;
            b bVar = (b) message.obj;
            synchronized (aVar.f2589a) {
                if (bVar == null || bVar == null) {
                    Objects.requireNonNull(bVar);
                    throw null;
                }
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static class b {
    }

    public static a a() {
        if (f2588c == null) {
            f2588c = new a();
        }
        return f2588c;
    }
}
