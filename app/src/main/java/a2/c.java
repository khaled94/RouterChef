package a2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import t1.h;

/* loaded from: classes.dex */
public abstract class c<T> extends d<T> {

    /* renamed from: h */
    public static final String f13h = h.e("BrdcstRcvrCnstrntTrckr");

    /* renamed from: g */
    public final a f14g = new a();

    /* loaded from: classes.dex */
    public class a extends BroadcastReceiver {
        public a() {
            c.this = r1;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (intent != null) {
                c.this.g(intent);
            }
        }
    }

    public c(Context context, f2.a aVar) {
        super(context, aVar);
    }

    @Override // a2.d
    public final void d() {
        h.c().a(f13h, String.format("%s: registering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.f18b.registerReceiver(this.f14g, f());
    }

    @Override // a2.d
    public final void e() {
        h.c().a(f13h, String.format("%s: unregistering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.f18b.unregisterReceiver(this.f14g);
    }

    public abstract IntentFilter f();

    public abstract void g(Intent intent);
}
