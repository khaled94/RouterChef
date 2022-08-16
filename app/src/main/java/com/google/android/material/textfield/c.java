package com.google.android.material.textfield;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import com.raouf.routerchef.R;
import d6.i;
import u5.m;

/* loaded from: classes.dex */
public final class c extends i {

    /* renamed from: e */
    public final a f3403e = new a();

    /* renamed from: f */
    public final b f3404f = new b();

    /* renamed from: g */
    public final C0051c f3405g = new C0051c();

    /* loaded from: classes.dex */
    public class a extends m {
        public a() {
            c.this = r1;
        }

        @Override // u5.m, android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            c cVar = c.this;
            cVar.f3953c.setChecked(!c.d(cVar));
        }
    }

    /* loaded from: classes.dex */
    public class b implements TextInputLayout.f {
        public b() {
            c.this = r1;
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public final void a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            c cVar = c.this;
            cVar.f3953c.setChecked(!c.d(cVar));
            editText.removeTextChangedListener(c.this.f3403e);
            editText.addTextChangedListener(c.this.f3403e);
        }
    }

    /* renamed from: com.google.android.material.textfield.c$c */
    /* loaded from: classes.dex */
    public class C0051c implements TextInputLayout.g {

        /* renamed from: com.google.android.material.textfield.c$c$a */
        /* loaded from: classes.dex */
        public class a implements Runnable {

            /* renamed from: s */
            public final /* synthetic */ EditText f3409s;

            public a(EditText editText) {
                C0051c.this = r1;
                this.f3409s = editText;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f3409s.removeTextChangedListener(c.this.f3403e);
            }
        }

        public C0051c() {
            c.this = r1;
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public final void a(TextInputLayout textInputLayout, int i10) {
            EditText editText = textInputLayout.getEditText();
            if (editText == null || i10 != 1) {
                return;
            }
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            editText.post(new a(editText));
        }
    }

    /* loaded from: classes.dex */
    public class d implements View.OnClickListener {
        public d() {
            c.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            EditText editText = c.this.f3951a.getEditText();
            if (editText == null) {
                return;
            }
            int selectionEnd = editText.getSelectionEnd();
            editText.setTransformationMethod(c.d(c.this) ? null : PasswordTransformationMethod.getInstance());
            if (selectionEnd >= 0) {
                editText.setSelection(selectionEnd);
            }
            c.this.f3951a.p();
        }
    }

    public c(TextInputLayout textInputLayout, int i10) {
        super(textInputLayout, i10);
    }

    public static boolean d(c cVar) {
        EditText editText = cVar.f3951a.getEditText();
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    @Override // d6.i
    public final void a() {
        TextInputLayout textInputLayout = this.f3951a;
        int i10 = this.f3954d;
        if (i10 == 0) {
            i10 = R.drawable.design_password_eye;
        }
        textInputLayout.setEndIconDrawable(i10);
        TextInputLayout textInputLayout2 = this.f3951a;
        textInputLayout2.setEndIconContentDescription(textInputLayout2.getResources().getText(R.string.password_toggle_content_description));
        boolean z10 = true;
        this.f3951a.setEndIconVisible(true);
        this.f3951a.setEndIconCheckable(true);
        this.f3951a.setEndIconOnClickListener(new d());
        this.f3951a.a(this.f3404f);
        this.f3951a.b(this.f3405g);
        EditText editText = this.f3951a.getEditText();
        if (editText == null || (editText.getInputType() != 16 && editText.getInputType() != 128 && editText.getInputType() != 144 && editText.getInputType() != 224)) {
            z10 = false;
        }
        if (z10) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
