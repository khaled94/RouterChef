package d6;

import android.content.Context;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a */
    public TextInputLayout f3951a;

    /* renamed from: b */
    public Context f3952b;

    /* renamed from: c */
    public CheckableImageButton f3953c;

    /* renamed from: d */
    public final int f3954d;

    public i(TextInputLayout textInputLayout, int i10) {
        this.f3951a = textInputLayout;
        this.f3952b = textInputLayout.getContext();
        this.f3953c = textInputLayout.getEndIconView();
        this.f3954d = i10;
    }

    public abstract void a();

    public boolean b(int i10) {
        return true;
    }

    public void c(boolean z10) {
    }
}
