package m4;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import o.b;
import o.d;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class xs {

    /* renamed from: a */
    public d f15457a;

    /* renamed from: b */
    public b f15458b;

    /* renamed from: c */
    public wd2 f15459c;

    /* renamed from: d */
    public ws f15460d;

    public static boolean a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
        if (queryIntentActivities != null && resolveActivity != null) {
            for (int i10 = 0; i10 < queryIntentActivities.size(); i10++) {
                if (resolveActivity.activityInfo.name.equals(queryIntentActivities.get(i10).activityInfo.name)) {
                    return resolveActivity.activityInfo.packageName.equals(n9.d.c(context));
                }
            }
        }
        return false;
    }
}
