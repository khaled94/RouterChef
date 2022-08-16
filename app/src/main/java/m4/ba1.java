package m4;

import android.text.TextUtils;
import h4.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class ba1 {

    /* renamed from: a */
    public final a f6427a;

    /* renamed from: b */
    public final ca1 f6428b;

    /* renamed from: c */
    public final zp1 f6429c;

    /* renamed from: d */
    public final List<String> f6430d = Collections.synchronizedList(new ArrayList());

    /* renamed from: e */
    public final boolean f6431e = ((Boolean) jo.f10145d.f10148c.a(es.F4)).booleanValue();

    /* renamed from: f */
    public final j71 f6432f;

    public ba1(a aVar, ca1 ca1Var, j71 j71Var, zp1 zp1Var) {
        this.f6427a = aVar;
        this.f6428b = ca1Var;
        this.f6432f = j71Var;
        this.f6429c = zp1Var;
    }

    public static /* bridge */ /* synthetic */ void a(ba1 ba1Var, String str, int i10, long j3, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 33);
        sb.append(str);
        sb.append(".");
        sb.append(i10);
        sb.append(".");
        sb.append(j3);
        String sb2 = sb.toString();
        if (!TextUtils.isEmpty(str2)) {
            sb2 = androidx.fragment.app.a.b(new StringBuilder(sb2.length() + 1 + String.valueOf(str2).length()), sb2, ".", str2);
        }
        ba1Var.f6430d.add(sb2);
    }
}
