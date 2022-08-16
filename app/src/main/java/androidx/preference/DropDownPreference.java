package androidx.preference;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.raouf.routerchef.R;
import e1.g;

/* loaded from: classes.dex */
public class DropDownPreference extends ListPreference {

    /* renamed from: q0 */
    public final ArrayAdapter f1745q0;

    /* renamed from: r0 */
    public Spinner f1746r0;

    /* renamed from: s0 */
    public final a f1747s0 = new a();

    /* loaded from: classes.dex */
    public class a implements AdapterView.OnItemSelectedListener {
        public a() {
            DropDownPreference.this = r1;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j3) {
            if (i10 >= 0) {
                String charSequence = DropDownPreference.this.f1753m0[i10].toString();
                if (charSequence.equals(DropDownPreference.this.f1754n0)) {
                    return;
                }
                DropDownPreference.this.b(charSequence);
                DropDownPreference.this.I(charSequence);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.dropdownPreferenceStyle);
        ArrayAdapter arrayAdapter = new ArrayAdapter(context, 17367049);
        this.f1745q0 = arrayAdapter;
        arrayAdapter.clear();
        CharSequence[] charSequenceArr = this.f1752l0;
        if (charSequenceArr != null) {
            for (CharSequence charSequence : charSequenceArr) {
                this.f1745q0.add(charSequence.toString());
            }
        }
    }

    @Override // androidx.preference.Preference
    public final void n() {
        super.n();
        ArrayAdapter arrayAdapter = this.f1745q0;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    @Override // androidx.preference.Preference
    public final void s(g gVar) {
        Spinner spinner = (Spinner) gVar.f1924a.findViewById(R.id.spinner);
        this.f1746r0 = spinner;
        spinner.setAdapter((SpinnerAdapter) this.f1745q0);
        this.f1746r0.setOnItemSelectedListener(this.f1747s0);
        Spinner spinner2 = this.f1746r0;
        String str = this.f1754n0;
        CharSequence[] charSequenceArr = this.f1753m0;
        int i10 = -1;
        if (str != null && charSequenceArr != null) {
            int length = charSequenceArr.length - 1;
            while (true) {
                if (length < 0) {
                    break;
                } else if (TextUtils.equals(charSequenceArr[length].toString(), str)) {
                    i10 = length;
                    break;
                } else {
                    length--;
                }
            }
        }
        spinner2.setSelection(i10);
        super.s(gVar);
    }

    @Override // androidx.preference.DialogPreference, androidx.preference.Preference
    public final void t() {
        this.f1746r0.performClick();
    }
}
