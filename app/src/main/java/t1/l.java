package t1;

import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import n6.c;
import n6.e;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements e {

    /* renamed from: s */
    public static final /* synthetic */ l f18480s = new l();

    public static /* synthetic */ String b(int i10) {
        return i10 == 1 ? "RUN_AS_NON_EXPEDITED_WORK_REQUEST" : i10 == 2 ? "DROP_WORK_REQUEST" : "null";
    }

    @Override // n6.e
    public Object a(c cVar) {
        FirebaseMessaging lambda$getComponents$0;
        lambda$getComponents$0 = FirebaseMessagingRegistrar.lambda$getComponents$0(cVar);
        return lambda$getComponents$0;
    }
}
