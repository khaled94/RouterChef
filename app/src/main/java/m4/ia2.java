package m4;

/* loaded from: classes.dex */
public final class ia2 implements pa2 {

    /* renamed from: a */
    public final pa2[] f9576a;

    public ia2(pa2... pa2VarArr) {
        this.f9576a = pa2VarArr;
    }

    @Override // m4.pa2
    public final oa2 a(Class<?> cls) {
        pa2[] pa2VarArr = this.f9576a;
        for (int i10 = 0; i10 < 2; i10++) {
            pa2 pa2Var = pa2VarArr[i10];
            if (pa2Var.b(cls)) {
                return pa2Var.a(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }

    @Override // m4.pa2
    public final boolean b(Class<?> cls) {
        pa2[] pa2VarArr = this.f9576a;
        for (int i10 = 0; i10 < 2; i10++) {
            if (pa2VarArr[i10].b(cls)) {
                return true;
            }
        }
        return false;
    }
}
