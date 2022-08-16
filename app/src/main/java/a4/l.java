package a4;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import p4.f;
import r4.d;

@SuppressLint({"HandlerLeak"})
/* loaded from: classes.dex */
public final class l extends f {

    /* renamed from: a */
    public final Context f146a;

    /* renamed from: b */
    public final /* synthetic */ e f147b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(e eVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f147b = eVar;
        this.f146a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i10 = message.what;
        boolean z10 = true;
        if (i10 != 1) {
            StringBuilder sb = new StringBuilder(50);
            sb.append("Don't know how to handle this message: ");
            sb.append(i10);
            Log.w("GoogleApiAvailability", sb.toString());
            return;
        }
        int d5 = this.f147b.d(this.f146a);
        Objects.requireNonNull(this.f147b);
        AtomicBoolean atomicBoolean = i.f139a;
        if (d5 != 1 && d5 != 2 && d5 != 3 && d5 != 9) {
            z10 = false;
        }
        if (!z10) {
            return;
        }
        e eVar = this.f147b;
        Context context = this.f146a;
        Intent b10 = eVar.b(context, d5, "n");
        PendingIntent pendingIntent = null;
        if (b10 != null) {
            pendingIntent = PendingIntent.getActivity(context, 0, b10, d.f17254a | 134217728);
        }
        eVar.h(context, d5, pendingIntent);
    }
}
