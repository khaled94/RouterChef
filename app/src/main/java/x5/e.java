package x5;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* loaded from: classes.dex */
public final class e extends f {

    /* renamed from: a */
    public final /* synthetic */ Context f20046a;

    /* renamed from: b */
    public final /* synthetic */ TextPaint f20047b;

    /* renamed from: c */
    public final /* synthetic */ f f20048c;

    /* renamed from: d */
    public final /* synthetic */ d f20049d;

    public e(d dVar, Context context, TextPaint textPaint, f fVar) {
        this.f20049d = dVar;
        this.f20046a = context;
        this.f20047b = textPaint;
        this.f20048c = fVar;
    }

    @Override // x5.f
    public final void c(int i10) {
        this.f20048c.c(i10);
    }

    @Override // x5.f
    public final void d(Typeface typeface, boolean z10) {
        this.f20049d.g(this.f20046a, this.f20047b, typeface);
        this.f20048c.d(typeface, z10);
    }
}
