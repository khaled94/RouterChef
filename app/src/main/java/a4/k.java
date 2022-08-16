package a4;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.n;
import java.util.Objects;

/* loaded from: classes.dex */
public class k extends n {
    public Dialog C0;
    public DialogInterface.OnCancelListener D0;
    public AlertDialog E0;

    @Override // androidx.fragment.app.n
    public final Dialog f0() {
        Dialog dialog = this.C0;
        if (dialog == null) {
            this.f1488t0 = false;
            if (this.E0 == null) {
                Context l10 = l();
                Objects.requireNonNull(l10, "null reference");
                this.E0 = new AlertDialog.Builder(l10).create();
            }
            return this.E0;
        }
        return dialog;
    }

    @Override // androidx.fragment.app.n, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.D0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
