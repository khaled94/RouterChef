package m4;

import android.content.Context;
import android.view.ViewGroup;
import d4.m;

/* loaded from: classes.dex */
public final class ua0 {

    /* renamed from: a */
    public final Context f14314a;

    /* renamed from: b */
    public final vd0 f14315b;

    /* renamed from: c */
    public final ViewGroup f14316c;

    /* renamed from: d */
    public ta0 f14317d;

    public ua0(Context context, ViewGroup viewGroup, vd0 vd0Var) {
        this.f14314a = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f14316c = viewGroup;
        this.f14315b = vd0Var;
        this.f14317d = null;
    }

    public final ta0 a() {
        m.d("getAdVideoUnderlay must be called from the UI thread.");
        return this.f14317d;
    }
}
