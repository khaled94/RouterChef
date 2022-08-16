package e1;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.d;
import androidx.preference.MultiSelectListPreference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class d extends androidx.preference.a {
    public Set<String> K0 = new HashSet();
    public boolean L0;
    public CharSequence[] M0;
    public CharSequence[] N0;

    /* loaded from: classes.dex */
    public class a implements DialogInterface.OnMultiChoiceClickListener {
        public a() {
            d.this = r1;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashSet, java.util.Set<java.lang.String>] */
        /* JADX WARN: Type inference failed for: r0v1, types: [java.util.HashSet, java.util.Set<java.lang.String>] */
        @Override // android.content.DialogInterface.OnMultiChoiceClickListener
        public final void onClick(DialogInterface dialogInterface, int i10, boolean z10) {
            boolean z11;
            boolean z12;
            d dVar = d.this;
            if (z10) {
                z11 = dVar.L0;
                z12 = dVar.K0.add(dVar.N0[i10].toString());
            } else {
                z11 = dVar.L0;
                z12 = dVar.K0.remove(dVar.N0[i10].toString());
            }
            dVar.L0 = z12 | z11;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.HashSet, java.util.Set<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.HashSet, java.util.Set<java.lang.String>] */
    @Override // androidx.preference.a, androidx.fragment.app.n, androidx.fragment.app.o
    public final void F(Bundle bundle) {
        super.F(bundle);
        if (bundle != null) {
            this.K0.clear();
            this.K0.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values"));
            this.L0 = bundle.getBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", false);
            this.M0 = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries");
            this.N0 = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues");
            return;
        }
        MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) h0();
        if (multiSelectListPreference.f1759l0 == null || multiSelectListPreference.f1760m0 == null) {
            throw new IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
        }
        this.K0.clear();
        this.K0.addAll(multiSelectListPreference.f1761n0);
        this.L0 = false;
        this.M0 = multiSelectListPreference.f1759l0;
        this.N0 = multiSelectListPreference.f1760m0;
    }

    @Override // androidx.preference.a, androidx.fragment.app.n, androidx.fragment.app.o
    public final void N(Bundle bundle) {
        super.N(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values", new ArrayList<>(this.K0));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", this.L0);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries", this.M0);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues", this.N0);
    }

    @Override // androidx.preference.a
    public final void j0(boolean z10) {
        if (z10 && this.L0) {
            MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) h0();
            multiSelectListPreference.b(this.K0);
            multiSelectListPreference.G(this.K0);
        }
        this.L0 = false;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.HashSet, java.util.Set<java.lang.String>] */
    @Override // androidx.preference.a
    public final void k0(d.a aVar) {
        int length = this.N0.length;
        boolean[] zArr = new boolean[length];
        for (int i10 = 0; i10 < length; i10++) {
            zArr[i10] = this.K0.contains(this.N0[i10].toString());
        }
        CharSequence[] charSequenceArr = this.M0;
        a aVar2 = new a();
        AlertController.b bVar = aVar.f502a;
        bVar.f485m = charSequenceArr;
        bVar.f492u = aVar2;
        bVar.f488q = zArr;
        bVar.f489r = true;
    }
}
