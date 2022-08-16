package z4;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import b4.a;
import b4.d;
import d4.c;

/* loaded from: classes.dex */
public final class b extends a.AbstractC0032a<a5.a, a> {
    @Override // b4.a.AbstractC0032a
    public final a5.a a(Context context, Looper looper, c cVar, a aVar, d.a aVar2, d.b bVar) {
        Integer num = cVar.f3841h;
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", cVar.f3834a);
        if (num != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return new a5.a(context, looper, cVar, bundle, aVar2, bVar);
    }
}
