package v0;

import android.annotation.SuppressLint;
import android.text.Editable;
import androidx.emoji2.text.o;

/* loaded from: classes.dex */
public final class b extends Editable.Factory {

    /* renamed from: a */
    public static final Object f19748a = new Object();

    /* renamed from: b */
    public static volatile b f19749b;

    /* renamed from: c */
    public static Class<?> f19750c;

    @SuppressLint({"PrivateApi"})
    public b() {
        try {
            f19750c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, b.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class<?> cls = f19750c;
        if (cls != null) {
            return new o(cls, charSequence);
        }
        return super.newEditable(charSequence);
    }
}
