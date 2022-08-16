package r7;

import com.google.auto.value.AutoValue;
import r7.a;

@AutoValue
/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a */
    public static final /* synthetic */ int f17280a = 0;

    @AutoValue.Builder
    /* loaded from: classes.dex */
    public static abstract class a {
    }

    static {
        a.C0109a c0109a = new a.C0109a();
        c0109a.d(0L);
        c0109a.f17269b = 1;
        c0109a.b(0L);
        c0109a.a();
    }

    public abstract String a();

    public abstract long b();

    public abstract String c();

    public abstract String d();

    public abstract String e();

    public abstract int f();

    public abstract long g();

    public final boolean h() {
        return f() == 5;
    }

    public final boolean i() {
        int i10 = ((r7.a) this).f17262c;
        return i10 == 2 || i10 == 1;
    }

    public final boolean j() {
        return f() == 4;
    }
}
