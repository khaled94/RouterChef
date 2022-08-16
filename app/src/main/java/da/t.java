package da;

import da.f;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import javax.annotation.Nullable;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import r9.i0;

@IgnoreJRERequirement
/* loaded from: classes.dex */
public final class t extends f.a {

    /* renamed from: a */
    public static final t f4080a = new t();

    @IgnoreJRERequirement
    /* loaded from: classes.dex */
    public static final class a<T> implements f<i0, Optional<T>> {

        /* renamed from: s */
        public final f<i0, T> f4081s;

        public a(f<i0, T> fVar) {
            this.f4081s = fVar;
        }

        @Override // da.f
        public final Object b(i0 i0Var) {
            return Optional.ofNullable(this.f4081s.b(i0Var));
        }
    }

    @Override // da.f.a
    @Nullable
    public final f<i0, ?> b(Type type, Annotation[] annotationArr, b0 b0Var) {
        if (f0.f(type) != Optional.class) {
            return null;
        }
        return new a(b0Var.e(f0.e(0, (ParameterizedType) type), annotationArr));
    }
}
