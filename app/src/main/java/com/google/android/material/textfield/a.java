package com.google.android.material.textfield;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import com.raouf.routerchef.R;
import d6.i;

/* loaded from: classes.dex */
public final class a extends i {

    /* renamed from: e */
    public final C0047a f3362e = new C0047a();

    /* renamed from: f */
    public final b f3363f = new b();

    /* renamed from: g */
    public final c f3364g = new c();

    /* renamed from: h */
    public final d f3365h = new d();

    /* renamed from: i */
    public AnimatorSet f3366i;

    /* renamed from: j */
    public ValueAnimator f3367j;

    /* renamed from: com.google.android.material.textfield.a$a */
    /* loaded from: classes.dex */
    public class C0047a implements TextWatcher {
        public C0047a() {
            a.this = r1;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            if (a.this.f3951a.getSuffixText() != null) {
                return;
            }
            a aVar = a.this;
            aVar.e(a.d(aVar));
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* loaded from: classes.dex */
    public class b implements View.OnFocusChangeListener {
        public b() {
            a.this = r1;
        }

        @Override // android.view.View.OnFocusChangeListener
        public final void onFocusChange(View view, boolean z10) {
            a aVar = a.this;
            aVar.e(a.d(aVar));
        }
    }

    /* loaded from: classes.dex */
    public class c implements TextInputLayout.f {
        public c() {
            a.this = r1;
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public final void a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(a.d(a.this));
            editText.setOnFocusChangeListener(a.this.f3363f);
            a aVar = a.this;
            aVar.f3953c.setOnFocusChangeListener(aVar.f3363f);
            editText.removeTextChangedListener(a.this.f3362e);
            editText.addTextChangedListener(a.this.f3362e);
        }
    }

    /* loaded from: classes.dex */
    public class d implements TextInputLayout.g {

        /* renamed from: com.google.android.material.textfield.a$d$a */
        /* loaded from: classes.dex */
        public class RunnableC0048a implements Runnable {

            /* renamed from: s */
            public final /* synthetic */ EditText f3372s;

            public RunnableC0048a(EditText editText) {
                d.this = r1;
                this.f3372s = editText;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f3372s.removeTextChangedListener(a.this.f3362e);
                a.this.e(true);
            }
        }

        public d() {
            a.this = r1;
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public final void a(TextInputLayout textInputLayout, int i10) {
            EditText editText = textInputLayout.getEditText();
            if (editText == null || i10 != 2) {
                return;
            }
            editText.post(new RunnableC0048a(editText));
            if (editText.getOnFocusChangeListener() == a.this.f3363f) {
                editText.setOnFocusChangeListener(null);
            }
            View.OnFocusChangeListener onFocusChangeListener = a.this.f3953c.getOnFocusChangeListener();
            a aVar = a.this;
            if (onFocusChangeListener != aVar.f3363f) {
                return;
            }
            aVar.f3953c.setOnFocusChangeListener(null);
        }
    }

    /* loaded from: classes.dex */
    public class e implements View.OnClickListener {
        public e() {
            a.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Editable text = a.this.f3951a.getEditText().getText();
            if (text != null) {
                text.clear();
            }
            a.this.f3951a.p();
        }
    }

    /* loaded from: classes.dex */
    public class f implements ValueAnimator.AnimatorUpdateListener {
        public f() {
            a.this = r1;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            a.this.f3953c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public a(TextInputLayout textInputLayout, int i10) {
        super(textInputLayout, i10);
    }

    public static boolean d(a aVar) {
        EditText editText = aVar.f3951a.getEditText();
        return editText != null && (editText.hasFocus() || aVar.f3953c.hasFocus()) && editText.getText().length() > 0;
    }

    @Override // d6.i
    public final void a() {
        TextInputLayout textInputLayout = this.f3951a;
        int i10 = this.f3954d;
        if (i10 == 0) {
            i10 = R.drawable.mtrl_ic_cancel;
        }
        textInputLayout.setEndIconDrawable(i10);
        TextInputLayout textInputLayout2 = this.f3951a;
        textInputLayout2.setEndIconContentDescription(textInputLayout2.getResources().getText(R.string.clear_text_end_icon_content_description));
        this.f3951a.setEndIconCheckable(false);
        this.f3951a.setEndIconOnClickListener(new e());
        this.f3951a.a(this.f3364g);
        this.f3951a.b(this.f3365h);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(e5.a.f4411d);
        ofFloat.setDuration(150L);
        ofFloat.addUpdateListener(new d6.c(this));
        ValueAnimator f10 = f(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f3366i = animatorSet;
        animatorSet.playTogether(ofFloat, f10);
        this.f3366i.addListener(new d6.a(this));
        ValueAnimator f11 = f(1.0f, 0.0f);
        this.f3367j = f11;
        f11.addListener(new d6.b(this));
    }

    @Override // d6.i
    public final void c(boolean z10) {
        if (this.f3951a.getSuffixText() == null) {
            return;
        }
        e(z10);
    }

    public final void e(boolean z10) {
        boolean z11 = this.f3951a.k() == z10;
        if (z10 && !this.f3366i.isRunning()) {
            this.f3367j.cancel();
            this.f3366i.start();
            if (!z11) {
                return;
            }
            this.f3366i.end();
        } else if (z10) {
        } else {
            this.f3366i.cancel();
            this.f3367j.start();
            if (!z11) {
                return;
            }
            this.f3367j.end();
        }
    }

    public final ValueAnimator f(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(e5.a.f4408a);
        ofFloat.setDuration(100L);
        ofFloat.addUpdateListener(new f());
        return ofFloat;
    }
}
