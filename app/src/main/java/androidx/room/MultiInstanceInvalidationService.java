package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import g1.j;
import g1.k;
import java.util.HashMap;

/* loaded from: classes.dex */
public class MultiInstanceInvalidationService extends Service {

    /* renamed from: s */
    public int f2223s = 0;

    /* renamed from: t */
    public final HashMap<Integer, String> f2224t = new HashMap<>();

    /* renamed from: u */
    public final RemoteCallbackList<j> f2225u = new a();

    /* renamed from: v */
    public final b f2226v = new b();

    /* loaded from: classes.dex */
    public class a extends RemoteCallbackList<j> {
        public a() {
            MultiInstanceInvalidationService.this = r1;
        }

        @Override // android.os.RemoteCallbackList
        public final void onCallbackDied(j jVar, Object obj) {
            MultiInstanceInvalidationService.this.f2224t.remove(Integer.valueOf(((Integer) obj).intValue()));
        }
    }

    /* loaded from: classes.dex */
    public class b extends k {
        public b() {
            MultiInstanceInvalidationService.this = r1;
        }

        public final int c0(j jVar, String str) {
            if (str == null) {
                return 0;
            }
            synchronized (MultiInstanceInvalidationService.this.f2225u) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
                int i10 = multiInstanceInvalidationService.f2223s + 1;
                multiInstanceInvalidationService.f2223s = i10;
                if (multiInstanceInvalidationService.f2225u.register(jVar, Integer.valueOf(i10))) {
                    MultiInstanceInvalidationService.this.f2224t.put(Integer.valueOf(i10), str);
                    return i10;
                }
                MultiInstanceInvalidationService multiInstanceInvalidationService2 = MultiInstanceInvalidationService.this;
                multiInstanceInvalidationService2.f2223s--;
                return 0;
            }
        }

        public final void w(int i10, String[] strArr) {
            synchronized (MultiInstanceInvalidationService.this.f2225u) {
                String str = MultiInstanceInvalidationService.this.f2224t.get(Integer.valueOf(i10));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                    return;
                }
                int beginBroadcast = MultiInstanceInvalidationService.this.f2225u.beginBroadcast();
                for (int i11 = 0; i11 < beginBroadcast; i11++) {
                    int intValue = ((Integer) MultiInstanceInvalidationService.this.f2225u.getBroadcastCookie(i11)).intValue();
                    String str2 = MultiInstanceInvalidationService.this.f2224t.get(Integer.valueOf(intValue));
                    if (i10 != intValue && str.equals(str2)) {
                        try {
                            MultiInstanceInvalidationService.this.f2225u.getBroadcastItem(i11).v1(strArr);
                        } catch (RemoteException e10) {
                            Log.w("ROOM", "Error invoking a remote callback", e10);
                        }
                    }
                }
                MultiInstanceInvalidationService.this.f2225u.finishBroadcast();
            }
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f2226v;
    }
}
