package da;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public interface c<R, T> {

    /* loaded from: classes.dex */
    public static abstract class a {
        @Nullable
        public abstract c a(Type type, Annotation[] annotationArr);
    }

    Type a();

    T b(b<R> bVar);
}
