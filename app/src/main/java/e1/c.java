package e1;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.d;
import androidx.preference.ListPreference;

/* loaded from: classes.dex */
public class c extends androidx.preference.a {
    public int K0;
    public CharSequence[] L0;
    public CharSequence[] M0;

    /* loaded from: classes.dex */
    public class a implements DialogInterface.OnClickListener {
        public a() {
            c.this = r1;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            c cVar = c.this;
            cVar.K0 = i10;
            cVar.onClick(dialogInterface, -1);
            dialogInterface.dismiss();
        }
    }

    @Override // androidx.preference.a, androidx.fragment.app.n, androidx.fragment.app.o
    public final void F(Bundle bundle) {
        super.F(bundle);
        if (bundle != null) {
            this.K0 = bundle.getInt("ListPreferenceDialogFragment.index", 0);
            this.L0 = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
            this.M0 = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
            return;
        }
        ListPreference listPreference = (ListPreference) h0();
        if (listPreference.f1752l0 == null || listPreference.f1753m0 == null) {
            throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
        }
        this.K0 = listPreference.G(listPreference.f1754n0);
        this.L0 = listPreference.f1752l0;
        this.M0 = listPreference.f1753m0;
    }

    @Override // androidx.preference.a, androidx.fragment.app.n, androidx.fragment.app.o
    public final void N(Bundle bundle) {
        super.N(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.K0);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.L0);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.M0);
    }

    @Override // androidx.preference.a
    public final void j0(boolean z10) {
        int i10;
        if (!z10 || (i10 = this.K0) < 0) {
            return;
        }
        String charSequence = this.M0[i10].toString();
        ListPreference listPreference = (ListPreference) h0();
        if (!listPreference.b(charSequence)) {
            return;
        }
        listPreference.I(charSequence);
    }

    @Override // androidx.preference.a
    public final void k0(d.a aVar) {
        CharSequence[] charSequenceArr = this.L0;
        int i10 = this.K0;
        a aVar2 = new a();
        AlertController.b bVar = aVar.f502a;
        bVar.f485m = charSequenceArr;
        bVar.f487o = aVar2;
        bVar.f491t = i10;
        bVar.f490s = true;
        aVar.c(null, null);
    }
}
