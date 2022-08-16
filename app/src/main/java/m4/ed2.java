package m4;

import android.util.Log;

/* loaded from: classes.dex */
public final class ed2 extends x50 {

    /* renamed from: a */
    public final String f7802a;

    public ed2(String str) {
        this.f7802a = str;
    }

    @Override // m4.x50
    public final void c(String str) {
        String str2 = this.f7802a;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(str).length());
        sb.append(str2);
        sb.append(":");
        sb.append(str);
        Log.d("isoparser", sb.toString());
    }
}
