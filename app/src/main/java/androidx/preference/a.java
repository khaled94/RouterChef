package androidx.preference;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.d;
import androidx.fragment.app.n;
import androidx.fragment.app.o;
import androidx.preference.DialogPreference;

/* loaded from: classes.dex */
public abstract class a extends n implements DialogInterface.OnClickListener {
    public DialogPreference C0;
    public CharSequence D0;
    public CharSequence E0;
    public CharSequence F0;
    public CharSequence G0;
    public int H0;
    public BitmapDrawable I0;
    public int J0;

    /* renamed from: androidx.preference.a$a */
    /* loaded from: classes.dex */
    public static class C0021a {
        public static void a(Window window) {
            window.getDecorView().getWindowInsetsController().show(WindowInsets.Type.ime());
        }
    }

    @Override // androidx.fragment.app.n, androidx.fragment.app.o
    public void F(Bundle bundle) {
        BitmapDrawable bitmapDrawable;
        super.F(bundle);
        o v10 = v(true);
        if (v10 instanceof DialogPreference.a) {
            DialogPreference.a aVar = (DialogPreference.a) v10;
            String string = V().getString("key");
            if (bundle != null) {
                this.D0 = bundle.getCharSequence("PreferenceDialogFragment.title");
                this.E0 = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
                this.F0 = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
                this.G0 = bundle.getCharSequence("PreferenceDialogFragment.message");
                this.H0 = bundle.getInt("PreferenceDialogFragment.layout", 0);
                Bitmap bitmap = (Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
                if (bitmap == null) {
                    return;
                }
                this.I0 = new BitmapDrawable(t(), bitmap);
                return;
            }
            DialogPreference dialogPreference = (DialogPreference) aVar.e(string);
            this.C0 = dialogPreference;
            this.D0 = dialogPreference.f1739f0;
            this.E0 = dialogPreference.f1742i0;
            this.F0 = dialogPreference.f1743j0;
            this.G0 = dialogPreference.f1740g0;
            this.H0 = dialogPreference.f1744k0;
            Drawable drawable = dialogPreference.f1741h0;
            if (drawable == null || (drawable instanceof BitmapDrawable)) {
                bitmapDrawable = (BitmapDrawable) drawable;
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                drawable.draw(canvas);
                bitmapDrawable = new BitmapDrawable(t(), createBitmap);
            }
            this.I0 = bitmapDrawable;
            return;
        }
        throw new IllegalStateException("Target fragment must implement TargetFragment interface");
    }

    @Override // androidx.fragment.app.n, androidx.fragment.app.o
    public void N(Bundle bundle) {
        super.N(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.D0);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.E0);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.F0);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.G0);
        bundle.putInt("PreferenceDialogFragment.layout", this.H0);
        BitmapDrawable bitmapDrawable = this.I0;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }

    @Override // androidx.fragment.app.n
    public final Dialog f0() {
        this.J0 = -2;
        d.a aVar = new d.a(W());
        CharSequence charSequence = this.D0;
        AlertController.b bVar = aVar.f502a;
        bVar.f476d = charSequence;
        bVar.f475c = this.I0;
        aVar.c(this.E0, this);
        aVar.b(this.F0, this);
        W();
        int i10 = this.H0;
        View view = null;
        if (i10 != 0) {
            LayoutInflater layoutInflater = this.f1506b0;
            if (layoutInflater == null) {
                layoutInflater = T(null);
            }
            view = layoutInflater.inflate(i10, (ViewGroup) null);
        }
        if (view != null) {
            i0(view);
            aVar.f502a.p = view;
        } else {
            aVar.f502a.f478f = this.G0;
        }
        k0(aVar);
        d a10 = aVar.a();
        if (this instanceof e1.a) {
            Window window = a10.getWindow();
            if (Build.VERSION.SDK_INT >= 30) {
                C0021a.a(window);
            } else {
                l0();
            }
        }
        return a10;
    }

    public final DialogPreference h0() {
        if (this.C0 == null) {
            this.C0 = (DialogPreference) ((DialogPreference.a) v(true)).e(V().getString("key"));
        }
        return this.C0;
    }

    public void i0(View view) {
        View findViewById = view.findViewById(16908299);
        if (findViewById != null) {
            CharSequence charSequence = this.G0;
            int i10 = 8;
            if (!TextUtils.isEmpty(charSequence)) {
                if (findViewById instanceof TextView) {
                    ((TextView) findViewById).setText(charSequence);
                }
                i10 = 0;
            }
            if (findViewById.getVisibility() == i10) {
                return;
            }
            findViewById.setVisibility(i10);
        }
    }

    public abstract void j0(boolean z10);

    public void k0(d.a aVar) {
    }

    public void l0() {
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        this.J0 = i10;
    }

    @Override // androidx.fragment.app.n, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        j0(this.J0 == -1);
    }
}
