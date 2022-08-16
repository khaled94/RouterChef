package y4;

import android.content.Context;
import android.content.res.Resources;
import com.raouf.routerchef.R;

/* loaded from: classes.dex */
public final class q2 {
    public static String a(Context context) {
        try {
            return context.getResources().getResourcePackageName(R.string.common_google_play_services_unknown_issue);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    public static final String b(String str, Resources resources, String str2) {
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier != 0) {
            try {
                return resources.getString(identifier);
            } catch (Resources.NotFoundException unused) {
                return null;
            }
        }
        return null;
    }
}
