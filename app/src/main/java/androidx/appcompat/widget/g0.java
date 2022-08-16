package androidx.appcompat.widget;

import android.graphics.Typeface;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class g0 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ TextView f853s;

    /* renamed from: t */
    public final /* synthetic */ Typeface f854t;

    /* renamed from: u */
    public final /* synthetic */ int f855u;

    public g0(TextView textView, Typeface typeface, int i10) {
        this.f853s = textView;
        this.f854t = typeface;
        this.f855u = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f853s.setTypeface(this.f854t, this.f855u);
    }
}
