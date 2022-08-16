package z3;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import g4.a;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;
import n3.s;
import n3.t;
import n3.u;
import q4.b;

/* loaded from: classes.dex */
public final class m implements ServiceConnection {

    /* renamed from: c */
    public n f20953c;

    /* renamed from: f */
    public final /* synthetic */ t f20956f;
    @GuardedBy("this")

    /* renamed from: a */
    public int f20951a = 0;

    /* renamed from: b */
    public final Messenger f20952b = new Messenger(new b(Looper.getMainLooper(), new Handler.Callback() { // from class: z3.j
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            m mVar = m.this;
            int i10 = message.arg1;
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                StringBuilder sb = new StringBuilder(41);
                sb.append("Received response to request: ");
                sb.append(i10);
                Log.d("MessengerIpcClient", sb.toString());
            }
            synchronized (mVar) {
                q<?> qVar = mVar.f20955e.get(i10);
                if (qVar == null) {
                    StringBuilder sb2 = new StringBuilder(50);
                    sb2.append("Received response for unknown request: ");
                    sb2.append(i10);
                    Log.w("MessengerIpcClient", sb2.toString());
                    return true;
                }
                mVar.f20955e.remove(i10);
                mVar.c();
                Bundle data = message.getData();
                if (data.getBoolean("unsupported", false)) {
                    qVar.c(new r("Not supported by GmsCore", null));
                    return true;
                }
                qVar.a(data);
                return true;
            }
        }
    }));
    @GuardedBy("this")

    /* renamed from: d */
    public final Queue<q<?>> f20954d = new ArrayDeque();
    @GuardedBy("this")

    /* renamed from: e */
    public final SparseArray<q<?>> f20955e = new SparseArray<>();

    public /* synthetic */ m(t tVar) {
        this.f20956f = tVar;
    }

    public final synchronized void a(int i10, String str) {
        b(i10, str, null);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.Queue<z3.q<?>>, java.util.ArrayDeque] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.Queue<z3.q<?>>, java.util.ArrayDeque] */
    public final synchronized void b(int i10, String str, Throwable th) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(str);
            Log.d("MessengerIpcClient", valueOf.length() != 0 ? "Disconnected: ".concat(valueOf) : new String("Disconnected: "));
        }
        int i11 = this.f20951a;
        if (i11 != 0) {
            if (i11 != 1 && i11 != 2) {
                if (i11 != 3) {
                    return;
                }
                this.f20951a = 4;
                return;
            }
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.f20951a = 4;
            a.b().c(this.f20956f.f20964a, this);
            r rVar = new r(str, th);
            Iterator it = this.f20954d.iterator();
            while (it.hasNext()) {
                ((q) it.next()).c(rVar);
            }
            this.f20954d.clear();
            for (int i12 = 0; i12 < this.f20955e.size(); i12++) {
                this.f20955e.valueAt(i12).c(rVar);
            }
            this.f20955e.clear();
            return;
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Queue<z3.q<?>>, java.util.ArrayDeque] */
    public final synchronized void c() {
        if (this.f20951a == 2 && this.f20954d.isEmpty() && this.f20955e.size() == 0) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
            }
            this.f20951a = 3;
            a.b().c(this.f20956f.f20964a, this);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Queue<z3.q<?>>, java.util.ArrayDeque] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.Queue<z3.q<?>>, java.util.ArrayDeque] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.Queue<z3.q<?>>, java.util.ArrayDeque] */
    public final synchronized boolean d(q<?> qVar) {
        int i10 = this.f20951a;
        if (i10 != 0) {
            if (i10 == 1) {
                this.f20954d.add(qVar);
                return true;
            } else if (i10 != 2) {
                return false;
            } else {
                this.f20954d.add(qVar);
                this.f20956f.f20965b.execute(new t(this, 1));
                return true;
            }
        }
        this.f20954d.add(qVar);
        d4.m.j(this.f20951a == 0);
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Starting bind to GmsCore");
        }
        this.f20951a = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            if (!a.b().a(this.f20956f.f20964a, intent, this, 1)) {
                a(0, "Unable to bind to service");
            } else {
                this.f20956f.f20965b.schedule(new u(this, 1), 30L, TimeUnit.SECONDS);
            }
        } catch (SecurityException e10) {
            b(0, "Unable to bind to service", e10);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        this.f20956f.f20965b.execute(new k(this, iBinder, 0));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        this.f20956f.f20965b.execute(new s(this, 1));
    }
}
