package d2;

import android.content.ComponentName;
import android.content.Context;
import t1.h;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a */
    public static final String f3746a = h.e("PackageManagerHelper");

    public static void a(Context context, Class<?> cls, boolean z10) {
        String str = "enabled";
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z10 ? 1 : 2, 1);
            h c10 = h.c();
            String str2 = f3746a;
            Object[] objArr = new Object[2];
            objArr[0] = cls.getName();
            objArr[1] = z10 ? str : "disabled";
            c10.a(str2, String.format("%s %s", objArr), new Throwable[0]);
        } catch (Exception e10) {
            h c11 = h.c();
            String str3 = f3746a;
            Object[] objArr2 = new Object[2];
            objArr2[0] = cls.getName();
            if (!z10) {
                str = "disabled";
            }
            objArr2[1] = str;
            c11.a(str3, String.format("%s could not be %s", objArr2), e10);
        }
    }
}
