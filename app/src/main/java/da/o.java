package da;

import d.b;
import e9.f;
import java.lang.reflect.Method;
import k9.e;
import v8.a;

/* loaded from: classes.dex */
public final class o implements d<Object> {

    /* renamed from: a */
    public final /* synthetic */ e f4057a;

    public o(e eVar) {
        this.f4057a = eVar;
    }

    @Override // da.d
    public final void a(b<Object> bVar, a0<Object> a0Var) {
        Object obj;
        e eVar;
        f.f(bVar, "call");
        f.f(a0Var, "response");
        if (a0Var.a()) {
            obj = a0Var.f4005b;
            if (obj == null) {
                Object cast = m.class.cast(bVar.H().f17315e.get(m.class));
                if (cast != null) {
                    f.b(cast, "call.request().tag(Invocation::class.java)!!");
                    Method method = ((m) cast).f4054a;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Response from ");
                    f.b(method, "method");
                    Class<?> declaringClass = method.getDeclaringClass();
                    f.b(declaringClass, "method.declaringClass");
                    sb.append(declaringClass.getName());
                    sb.append('.');
                    sb.append(method.getName());
                    sb.append(" was null but response body type was declared as non-null");
                    a aVar = new a(sb.toString());
                    eVar = this.f4057a;
                    obj = b.a(aVar);
                } else {
                    a aVar2 = new a();
                    f.i(aVar2, f.class.getName());
                    throw aVar2;
                }
            } else {
                eVar = this.f4057a;
            }
        } else {
            eVar = this.f4057a;
            obj = b.a(new k(a0Var));
        }
        eVar.d(obj);
    }

    @Override // da.d
    public final void b(b<Object> bVar, Throwable th) {
        f.f(bVar, "call");
        f.f(th, "t");
        this.f4057a.d(b.a(th));
    }
}
