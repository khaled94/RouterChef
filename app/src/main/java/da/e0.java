package da;

import androidx.activity.result.a;
import java.lang.annotation.Annotation;

/* loaded from: classes.dex */
public final class e0 implements d0 {

    /* renamed from: a */
    public static final e0 f4027a = new e0();

    @Override // java.lang.annotation.Annotation
    public final Class<? extends Annotation> annotationType() {
        return d0.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        return obj instanceof d0;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return 0;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        StringBuilder c10 = a.c("@");
        c10.append(d0.class.getName());
        c10.append("()");
        return c10.toString();
    }
}
