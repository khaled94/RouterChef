package m4;

import java.util.Objects;

/* loaded from: classes.dex */
public final class cy1 {

    /* renamed from: b */
    public static final cy1 f7157b = new cy1(new a());

    /* renamed from: a */
    public final Throwable f7158a;

    /* loaded from: classes.dex */
    public class a extends Throwable {
        public a() {
            super("Failure occurred while trying to finish a future.");
        }

        @Override // java.lang.Throwable
        public final synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    public cy1(Throwable th) {
        Objects.requireNonNull(th);
        this.f7158a = th;
    }
}
