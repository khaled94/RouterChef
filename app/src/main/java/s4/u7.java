package s4;

/* loaded from: classes.dex */
public final class u7 implements c8 {

    /* renamed from: a */
    public final c8[] f18137a;

    public u7(c8... c8VarArr) {
        this.f18137a = c8VarArr;
    }

    @Override // s4.c8
    public final b8 a(Class<?> cls) {
        c8[] c8VarArr = this.f18137a;
        for (int i10 = 0; i10 < 2; i10++) {
            c8 c8Var = c8VarArr[i10];
            if (c8Var.b(cls)) {
                return c8Var.a(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }

    @Override // s4.c8
    public final boolean b(Class<?> cls) {
        c8[] c8VarArr = this.f18137a;
        for (int i10 = 0; i10 < 2; i10++) {
            if (c8VarArr[i10].b(cls)) {
                return true;
            }
        }
        return false;
    }
}
