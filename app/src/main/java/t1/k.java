package t1;

import android.annotation.SuppressLint;

/* loaded from: classes.dex */
public interface k {
    @SuppressLint({"SyntheticAccessor"})

    /* renamed from: a */
    public static final a.c f18477a = new a.c();
    @SuppressLint({"SyntheticAccessor"})

    /* renamed from: b */
    public static final a.b f18478b = new a.b();

    /* loaded from: classes.dex */
    public static abstract class a {

        /* renamed from: t1.k$a$a */
        /* loaded from: classes.dex */
        public static final class C0116a extends a {

            /* renamed from: a */
            public final Throwable f18479a;

            public C0116a(Throwable th) {
                this.f18479a = th;
            }

            public final String toString() {
                return String.format("FAILURE (%s)", this.f18479a.getMessage());
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends a {
            public final String toString() {
                return "IN_PROGRESS";
            }
        }

        /* loaded from: classes.dex */
        public static final class c extends a {
            public final String toString() {
                return "SUCCESS";
            }
        }
    }
}
