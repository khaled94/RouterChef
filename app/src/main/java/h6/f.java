package h6;

import android.content.Context;
import com.google.firebase.FirebaseCommonRegistrar;
import com.raouf.routerchef.LineItemDetails;
import h8.e;
import w7.f;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements f.a, h8.f {

    /* renamed from: s */
    public static final /* synthetic */ f f5126s = new f();

    /* renamed from: t */
    public static final /* synthetic */ f f5127t = new f();

    @Override // w7.f.a
    public final String b(Object obj) {
        Context context = (Context) obj;
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName != null ? FirebaseCommonRegistrar.b(installerPackageName) : "";
    }

    @Override // h8.f
    public final void q() {
        e eVar = LineItemDetails.R;
    }
}
