package c;

import android.content.Context;
import android.content.Intent;
import e9.f;

/* loaded from: classes.dex */
public abstract class a<I, O> {

    /* renamed from: c.a$a */
    /* loaded from: classes.dex */
    public static final class C0036a<T> {

        /* renamed from: a */
        public final T f2601a;

        public C0036a(T t10) {
            this.f2601a = t10;
        }
    }

    public abstract Intent a(Context context, I i10);

    public C0036a<O> b(Context context, I i10) {
        f.e(context, "context");
        return null;
    }

    public abstract O c(int i10, Intent intent);
}
