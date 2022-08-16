package d7;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.google.firebase.database.DatabaseRegistrar;
import n6.c;
import n6.e;
import w7.f;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements e, f.a {

    /* renamed from: s */
    public static final /* synthetic */ a f3992s = new a();

    /* renamed from: t */
    public static final /* synthetic */ a f3993t = new a();

    public static String c(String str, String str2) {
        return str + str2;
    }

    @Override // n6.e
    public Object a(c cVar) {
        b lambda$getComponents$0;
        lambda$getComponents$0 = DatabaseRegistrar.lambda$getComponents$0(cVar);
        return lambda$getComponents$0;
    }

    @Override // w7.f.a
    public String b(Object obj) {
        ApplicationInfo applicationInfo = ((Context) obj).getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.targetSdkVersion) : "";
    }
}
