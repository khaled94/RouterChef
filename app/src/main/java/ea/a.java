package ea;

import da.b0;
import da.f;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import m4.x10;
import r9.i0;
import x7.h;

/* loaded from: classes.dex */
public final class a extends f.a {

    /* renamed from: a */
    public final h f4472a;

    public a(h hVar) {
        this.f4472a = hVar;
    }

    @Override // da.f.a
    public final f a(Type type) {
        return new b(this.f4472a, this.f4472a.c(new d8.a(type)));
    }

    @Override // da.f.a
    public final f<i0, ?> b(Type type, Annotation[] annotationArr, b0 b0Var) {
        return new x10(this.f4472a, this.f4472a.c(new d8.a(type)), null);
    }
}
