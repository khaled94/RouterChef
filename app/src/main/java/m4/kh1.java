package m4;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;

/* loaded from: classes.dex */
public final class kh1 implements eh1<jh1> {

    /* renamed from: a */
    public final uz1 f10429a;

    /* renamed from: b */
    public final Context f10430b;

    public kh1(uz1 uz1Var, Context context) {
        this.f10429a = uz1Var;
        this.f10430b = context;
    }

    public static ResolveInfo c(PackageManager packageManager, String str) {
        return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
    }

    @Override // m4.eh1
    public final tz1<jh1> a() {
        return this.f10429a.Z(new u61(this, 2));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:2|(1:4)(1:5)|6|(1:8)(1:9)|10|(3:12|(2:15|13)|50)|16|(3:46|20|(12:22|23|25|48|26|(7:28|29|31|(3:34|(3:37|(2:52|39)(1:40)|35)|51)|41|42|43)|30|31|(3:34|(1:35)|51)|41|42|43))|24|25|48|26|(0)|30|31|(0)|41|42|43) */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b9 A[Catch: Exception -> 0x00dc, TRY_LEAVE, TryCatch #1 {Exception -> 0x00dc, blocks: (B:26:0x00ab, B:28:0x00b9), top: B:48:0x00ab }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final m4.jh1 b() {
        /*
            Method dump skipped, instructions count: 339
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.kh1.b():m4.jh1");
    }
}
