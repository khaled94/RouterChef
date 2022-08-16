package m4;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class oq1 {

    /* renamed from: a */
    public Object f12269a;

    /* renamed from: b */
    public Object f12270b;

    public /* synthetic */ oq1() {
    }

    public /* synthetic */ oq1(String str, String str2) {
        this.f12269a = str;
        this.f12270b = str2;
    }

    public static oq1 a(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (!TextUtils.isEmpty(str2)) {
                return new oq1(str, str2);
            }
            throw new IllegalArgumentException("Version is null or empty");
        }
        throw new IllegalArgumentException("Name is null or empty");
    }
}
