package m4;

import android.content.Context;
import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicReference;
import n3.y0;

/* loaded from: classes.dex */
public final class ul2 extends yl2 {

    /* renamed from: e */
    public static final fx1<Integer> f14450e;

    /* renamed from: f */
    public static final fx1<Integer> f14451f;

    /* renamed from: c */
    public final AtomicReference<pl2> f14452c;

    /* renamed from: d */
    public final y0 f14453d;

    static {
        ll2 ll2Var = ll2.f10917s;
        f14450e = ll2Var instanceof fx1 ? (fx1) ll2Var : new uv1(ll2Var);
        ml2 ml2Var = ml2.f11246s;
        f14451f = ml2Var instanceof fx1 ? (fx1) ml2Var : new uv1(ml2Var);
    }

    public ul2(Context context) {
        y0 y0Var = new y0(6);
        int i10 = pl2.f12560r;
        pl2 pl2Var = new pl2(new ql2(context));
        this.f14453d = y0Var;
        this.f14452c = new AtomicReference<>(pl2Var);
    }

    public static int a(t tVar, String str, boolean z10) {
        if (TextUtils.isEmpty(str) || !str.equals(tVar.f13863c)) {
            String b10 = b(str);
            String b11 = b(tVar.f13863c);
            if (b11 == null || b10 == null) {
                return (!z10 || b11 != null) ? 0 : 1;
            } else if (b11.startsWith(b10) || b10.startsWith(b11)) {
                return 3;
            } else {
                int i10 = ls1.f10971a;
                return b11.split("-", 2)[0].equals(b10.split("-", 2)[0]) ? 2 : 0;
            }
        }
        return 4;
    }

    public static String b(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static boolean c(int i10, boolean z10) {
        int i11 = i10 & 7;
        return i11 == 4 || (z10 && i11 == 3);
    }
}
