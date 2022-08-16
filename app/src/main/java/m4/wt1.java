package m4;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class wt1 {

    /* renamed from: a */
    public static final ClipData f15104a = ClipData.newIntent("", new Intent());

    @Nullable
    public static PendingIntent a(Context context, Intent intent) {
        String str;
        boolean z10;
        hu1.f(intent.getComponent() != null, "Must set component on Intent.");
        if (b(0, 1)) {
            z10 = !b(1140850688, 67108864);
            str = "Cannot set mutability flags if PendingIntent.FLAG_IMMUTABLE is set.";
        } else {
            z10 = b(1140850688, 67108864);
            str = "Must set PendingIntent.FLAG_IMMUTABLE for SDK >= 23 if no parts of intent are mutable.";
        }
        hu1.f(z10, str);
        Intent intent2 = new Intent(intent);
        if (!b(1140850688, 67108864)) {
            if (intent2.getPackage() == null) {
                intent2.setPackage(intent2.getComponent().getPackageName());
            }
            if (!b(0, 3) && intent2.getAction() == null) {
                intent2.setAction("");
            }
            if (!b(0, 9) && intent2.getCategories() == null) {
                intent2.addCategory("");
            }
            if (!b(0, 5) && intent2.getData() == null) {
                intent2.setDataAndType(Uri.EMPTY, "*/*");
            }
            if (!b(0, 17) && intent2.getClipData() == null) {
                intent2.setClipData(f15104a);
            }
        }
        return PendingIntent.getService(context, 0, intent2, 1140850688);
    }

    public static boolean b(int i10, int i11) {
        return (i10 & i11) == i11;
    }
}
