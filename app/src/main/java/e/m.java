package e;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.raouf.routerchef.R;
import java.lang.ref.WeakReference;
import m0.f;
import r.c;

/* loaded from: classes.dex */
public class m extends Dialog implements f {

    /* renamed from: s */
    public h f4243s;

    /* renamed from: t */
    public final a f4244t = new a();

    /* loaded from: classes.dex */
    public class a implements f.a {
        public a() {
            m.this = r1;
        }

        @Override // m0.f.a
        public final boolean g(KeyEvent keyEvent) {
            return m.this.c(keyEvent);
        }
    }

    public m(Context context, int i10) {
        super(context, b(context, i10));
        g a10 = a();
        ((h) a10).f4192f0 = b(context, i10);
        a10.l();
    }

    public static int b(Context context, int i10) {
        if (i10 == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            return typedValue.resourceId;
        }
        return i10;
    }

    public final g a() {
        if (this.f4243s == null) {
            c<WeakReference<g>> cVar = g.f4181s;
            this.f4243s = new h(getContext(), getWindow(), this, this);
        }
        return this.f4243s;
    }

    @Override // android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().c(view, layoutParams);
    }

    public final boolean c(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        a().m();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return f.b(this.f4244t, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public final <T extends View> T findViewById(int i10) {
        return (T) a().e(i10);
    }

    @Override // e.f
    public final void h() {
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        a().j();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        a().i();
        super.onCreate(bundle);
        a().l();
    }

    @Override // android.app.Dialog
    public final void onStop() {
        super.onStop();
        a().p();
    }

    @Override // e.f
    public final void r() {
    }

    @Override // android.app.Dialog
    public final void setContentView(int i10) {
        a().s(i10);
    }

    @Override // android.app.Dialog
    public final void setContentView(View view) {
        a().t(view);
    }

    @Override // android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().u(view, layoutParams);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i10) {
        super.setTitle(i10);
        a().w(getContext().getString(i10));
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        a().w(charSequence);
    }

    @Override // e.f
    public final void z() {
    }
}
