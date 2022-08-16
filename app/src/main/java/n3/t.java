package n3;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import z3.h;
import z3.l;
import z3.m;
import z3.n;
import z3.q;

/* loaded from: classes.dex */
public final /* synthetic */ class t implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f16565s;

    /* renamed from: t */
    public final /* synthetic */ Object f16566t;

    public /* synthetic */ t(Object obj, int i10) {
        this.f16565s = i10;
        this.f16566t = obj;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Queue<z3.q<?>>, java.util.ArrayDeque] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.Queue<z3.q<?>>, java.util.ArrayDeque] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16565s) {
            case 0:
                v vVar = (v) this.f16566t;
                vVar.c(vVar.f16577a);
                return;
            default:
                m mVar = (m) this.f16566t;
                while (true) {
                    synchronized (mVar) {
                        if (mVar.f20951a == 2) {
                            if (mVar.f20954d.isEmpty()) {
                                mVar.c();
                            } else {
                                q<?> qVar = (q) mVar.f20954d.poll();
                                mVar.f20955e.put(qVar.f20959a, qVar);
                                mVar.f20956f.f20965b.schedule(new l(mVar, qVar, 0), 30L, TimeUnit.SECONDS);
                                if (Log.isLoggable("MessengerIpcClient", 3)) {
                                    String valueOf = String.valueOf(qVar);
                                    StringBuilder sb = new StringBuilder(valueOf.length() + 8);
                                    sb.append("Sending ");
                                    sb.append(valueOf);
                                    Log.d("MessengerIpcClient", sb.toString());
                                }
                                Context context = mVar.f20956f.f20964a;
                                Messenger messenger = mVar.f20952b;
                                Message obtain = Message.obtain();
                                obtain.what = qVar.f20961c;
                                obtain.arg1 = qVar.f20959a;
                                obtain.replyTo = messenger;
                                Bundle bundle = new Bundle();
                                bundle.putBoolean("oneWay", qVar.b());
                                bundle.putString("pkg", context.getPackageName());
                                bundle.putBundle("data", qVar.f20962d);
                                obtain.setData(bundle);
                                try {
                                    n nVar = mVar.f20953c;
                                    Messenger messenger2 = (Messenger) nVar.f20957a;
                                    if (messenger2 == null) {
                                        h hVar = (h) nVar.f20958b;
                                        if (hVar != null) {
                                            Messenger messenger3 = hVar.f20938s;
                                            Objects.requireNonNull(messenger3);
                                            messenger3.send(obtain);
                                        } else {
                                            throw new IllegalStateException("Both messengers are null");
                                            break;
                                        }
                                    } else {
                                        messenger2.send(obtain);
                                    }
                                } catch (RemoteException e10) {
                                    mVar.a(2, e10.getMessage());
                                }
                            }
                        }
                    }
                }
                return;
        }
    }
}
