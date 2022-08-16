package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.TextInputLayout;
import com.raouf.routerchef.R;
import u5.m;
import u5.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* renamed from: s */
    public final Chip f3412s;

    /* renamed from: t */
    public final EditText f3413t;

    /* renamed from: u */
    public a f3414u;

    /* loaded from: classes.dex */
    public class a extends m {
        public a() {
            ChipTextInputComboView.this = r1;
        }

        @Override // u5.m, android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable)) {
                ChipTextInputComboView chipTextInputComboView = ChipTextInputComboView.this;
                chipTextInputComboView.f3412s.setText(ChipTextInputComboView.a(chipTextInputComboView, "00"));
                return;
            }
            ChipTextInputComboView chipTextInputComboView2 = ChipTextInputComboView.this;
            chipTextInputComboView2.f3412s.setText(ChipTextInputComboView.a(chipTextInputComboView2, editable));
        }
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(R.layout.material_time_chip, (ViewGroup) this, false);
        this.f3412s = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(R.layout.material_time_input, (ViewGroup) this, false);
        EditText editText = textInputLayout.getEditText();
        this.f3413t = editText;
        editText.setVisibility(4);
        a aVar = new a();
        this.f3414u = aVar;
        editText.addTextChangedListener(aVar);
        b();
        addView(chip);
        addView(textInputLayout);
        TextView textView = (TextView) findViewById(R.id.material_label);
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }

    public static String a(ChipTextInputComboView chipTextInputComboView, CharSequence charSequence) {
        return String.format(chipTextInputComboView.getResources().getConfiguration().locale, "%02d", Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
    }

    public final void b() {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f3413t.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        }
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f3412s.isChecked();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        b();
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z10) {
        this.f3412s.setChecked(z10);
        int i10 = 0;
        this.f3413t.setVisibility(z10 ? 0 : 4);
        Chip chip = this.f3412s;
        if (z10) {
            i10 = 8;
        }
        chip.setVisibility(i10);
        if (isChecked()) {
            EditText editText = this.f3413t;
            editText.requestFocus();
            editText.post(new p(editText));
            if (TextUtils.isEmpty(this.f3413t.getText())) {
                return;
            }
            EditText editText2 = this.f3413t;
            editText2.setSelection(editText2.getText().length());
        }
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f3412s.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public final void setTag(int i10, Object obj) {
        this.f3412s.setTag(i10, obj);
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        this.f3412s.toggle();
    }
}
