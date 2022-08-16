package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;

/* loaded from: classes.dex */
public final class c1 extends ContextWrapper {

    /* renamed from: a */
    public static final Object f813a = new Object();

    public static Context a(Context context) {
        if (!(context instanceof c1) && !(context.getResources() instanceof e1)) {
            context.getResources();
            int i10 = m1.f960a;
        }
        return context;
    }
}
