package a4;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.os.Bundle;
import java.util.Objects;

/* loaded from: classes.dex */
public final class c extends DialogFragment {

    /* renamed from: s */
    public Dialog f119s;

    /* renamed from: t */
    public DialogInterface.OnCancelListener f120t;

    /* renamed from: u */
    public AlertDialog f121u;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f120t;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f119s;
        if (dialog == null) {
            setShowsDialog(false);
            if (this.f121u == null) {
                Activity activity = getActivity();
                Objects.requireNonNull(activity, "null reference");
                this.f121u = new AlertDialog.Builder(activity).create();
            }
            return this.f121u;
        }
        return dialog;
    }

    @Override // android.app.DialogFragment
    public final void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
