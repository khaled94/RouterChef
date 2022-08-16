package a6;

/* loaded from: classes.dex */
public final class e extends d {
    @Override // a6.d
    public final void a(l lVar, float f10, float f11) {
        lVar.f(f11 * f10, 180.0f, 90.0f);
        double d5 = f11;
        double d10 = f10;
        lVar.e((float) (Math.sin(Math.toRadians(90.0f)) * d5 * d10), (float) (Math.sin(Math.toRadians(0.0f)) * d5 * d10));
    }
}
