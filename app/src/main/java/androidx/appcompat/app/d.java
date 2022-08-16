package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.core.widget.NestedScrollView;
import com.raouf.routerchef.R;
import e.m;
import java.util.Objects;

/* loaded from: classes.dex */
public final class d extends m {

    /* renamed from: u */
    public final AlertController f501u = new AlertController(getContext(), this, getWindow());

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public final AlertController.b f502a;

        /* renamed from: b */
        public final int f503b;

        public a(Context context) {
            int e10 = d.e(context, 0);
            this.f502a = new AlertController.b(new ContextThemeWrapper(context, d.e(context, e10)));
            this.f503b = e10;
        }

        /* JADX WARN: Removed duplicated region for block: B:49:0x00ba  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x00bc  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final androidx.appcompat.app.d a() {
            /*
                Method dump skipped, instructions count: 249
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.d.a.a():androidx.appcompat.app.d");
        }

        public final a b(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f502a;
            bVar.f481i = charSequence;
            bVar.f482j = onClickListener;
            return this;
        }

        public final a c(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f502a;
            bVar.f479g = charSequence;
            bVar.f480h = onClickListener;
            return this;
        }

        public final d d() {
            d a10 = a();
            a10.show();
            return a10;
        }
    }

    public d(Context context, int i10) {
        super(context, e(context, i10));
    }

    public static int e(Context context, int i10) {
        if (((i10 >>> 24) & 255) >= 1) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public final Button d(int i10) {
        AlertController alertController = this.f501u;
        Objects.requireNonNull(alertController);
        if (i10 != -3) {
            if (i10 == -2) {
                return alertController.f460o;
            }
            if (i10 == -1) {
                return alertController.f456k;
            }
            return null;
        }
        return alertController.f463s;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0294  */
    @Override // e.m, android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r17) {
        /*
            Method dump skipped, instructions count: 852
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.d.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f501u.f467w;
        if (nestedScrollView != null && nestedScrollView.g(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f501u.f467w;
        if (nestedScrollView != null && nestedScrollView.g(keyEvent)) {
            return true;
        }
        return super.onKeyUp(i10, keyEvent);
    }

    @Override // e.m, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        AlertController alertController = this.f501u;
        alertController.f450e = charSequence;
        TextView textView = alertController.A;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
