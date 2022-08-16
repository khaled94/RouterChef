package androidx.activity.result;

import android.graphics.Path;
import e8.a;
import java.util.List;
import java.util.Set;
import n6.c;
import o7.b;

/* loaded from: classes.dex */
public abstract class d implements c {

    /* renamed from: a */
    public static a.C0066a f428a;

    @Override // n6.c
    public Object a(Class cls) {
        b c10 = c(cls);
        if (c10 == null) {
            return null;
        }
        return c10.get();
    }

    @Override // n6.c
    public Set b(Class cls) {
        return (Set) d(cls).get();
    }

    public abstract List f(List list, String str);

    public abstract Path g(float f10, float f11, float f12, float f13);
}
