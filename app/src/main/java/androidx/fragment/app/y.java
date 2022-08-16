package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import l0.g;

/* loaded from: classes.dex */
public abstract class y<E> extends v {

    /* renamed from: s */
    public final Activity f1603s;

    /* renamed from: t */
    public final Context f1604t;

    /* renamed from: u */
    public final Handler f1605u;

    /* renamed from: v */
    public final h0 f1606v = new h0();

    public y(t tVar) {
        Handler handler = new Handler();
        this.f1603s = tVar;
        g.e(tVar, "context == null");
        this.f1604t = tVar;
        this.f1605u = handler;
    }

    public abstract E k();

    public abstract LayoutInflater l();

    public abstract void n();
}
