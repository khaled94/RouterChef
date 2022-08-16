package m4;

/* loaded from: classes.dex */
public final class iu1 extends lu1 {

    /* renamed from: x */
    public final /* synthetic */ lq0 f9752x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iu1(lq0 lq0Var, aa0 aa0Var, CharSequence charSequence) {
        super(aa0Var, charSequence);
        this.f9752x = lq0Var;
    }

    @Override // m4.lu1
    public final int a(int i10) {
        return i10 + 1;
    }

    @Override // m4.lu1
    public final int b(int i10) {
        x50 x50Var = (x50) this.f9752x.f10966s;
        CharSequence charSequence = this.f11026u;
        int length = charSequence.length();
        hu1.b(i10, length);
        while (i10 < length) {
            if (x50Var.d(charSequence.charAt(i10))) {
                return i10;
            }
            i10++;
        }
        return -1;
    }
}
