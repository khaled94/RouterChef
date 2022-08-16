package com.google.android.gms.ads;

import android.app.IntentService;
import android.content.Intent;
import android.os.RemoteException;
import androidx.annotation.RecentlyNonNull;
import m4.c10;
import m4.io;
import n3.g1;

/* loaded from: classes.dex */
public class AdService extends IntentService {
    public AdService() {
        super("AdService");
    }

    @Override // android.app.IntentService
    public final void onHandleIntent(@RecentlyNonNull Intent intent) {
        try {
            io.f9708f.f9710b.a(this, new c10()).r0(intent);
        } catch (RemoteException e10) {
            g1.g("RemoteException calling handleNotificationIntent: ".concat(e10.toString()));
        }
    }
}
