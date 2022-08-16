package androidx.activity;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.g;
import androidx.lifecycle.j;
import androidx.lifecycle.l;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
final class ImmLeaksCleaner implements j {

    /* renamed from: b */
    public static int f397b;

    /* renamed from: c */
    public static Field f398c;

    /* renamed from: d */
    public static Field f399d;

    /* renamed from: e */
    public static Field f400e;

    /* renamed from: a */
    public Activity f401a;

    public ImmLeaksCleaner(Activity activity) {
        this.f401a = activity;
    }

    @Override // androidx.lifecycle.j
    public final void a(l lVar, g.b bVar) {
        if (bVar != g.b.ON_DESTROY) {
            return;
        }
        if (f397b == 0) {
            try {
                f397b = 2;
                Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
                f399d = declaredField;
                declaredField.setAccessible(true);
                Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
                f400e = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
                f398c = declaredField3;
                declaredField3.setAccessible(true);
                f397b = 1;
            } catch (NoSuchFieldException unused) {
            }
        }
        if (f397b != 1) {
            return;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) this.f401a.getSystemService("input_method");
        try {
            Object obj = f398c.get(inputMethodManager);
            if (obj == null) {
                return;
            }
            synchronized (obj) {
                try {
                    try {
                        View view = (View) f399d.get(inputMethodManager);
                        if (view == null) {
                            return;
                        }
                        if (view.isAttachedToWindow()) {
                            return;
                        }
                        try {
                            f400e.set(inputMethodManager, null);
                            inputMethodManager.isActive();
                        } catch (IllegalAccessException unused2) {
                        }
                    } catch (ClassCastException unused3) {
                    } catch (IllegalAccessException unused4) {
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (IllegalAccessException unused5) {
        }
    }
}
