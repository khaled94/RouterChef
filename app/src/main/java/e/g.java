package e;

import android.content.Context;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import r.c;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: s */
    public static final c<WeakReference<g>> f4181s = new c<>(0);

    /* renamed from: t */
    public static final Object f4182t = new Object();

    public static void q(g gVar) {
        synchronized (f4182t) {
            Iterator<WeakReference<g>> it = f4181s.iterator();
            while (it.hasNext()) {
                g gVar2 = it.next().get();
                if (gVar2 == gVar || gVar2 == null) {
                    it.remove();
                }
            }
        }
    }

    public abstract void c(View view, ViewGroup.LayoutParams layoutParams);

    public Context d(Context context) {
        return context;
    }

    public abstract <T extends View> T e(int i10);

    public int f() {
        return -100;
    }

    public abstract MenuInflater g();

    public abstract a h();

    public abstract void i();

    public abstract void j();

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract void n();

    public abstract void o();

    public abstract void p();

    public abstract boolean r(int i10);

    public abstract void s(int i10);

    public abstract void t(View view);

    public abstract void u(View view, ViewGroup.LayoutParams layoutParams);

    public void v(int i10) {
    }

    public abstract void w(CharSequence charSequence);
}
