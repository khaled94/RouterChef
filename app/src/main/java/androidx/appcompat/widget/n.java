package androidx.appcompat.widget;

import a6.f;
import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.emoji2.text.d;
import java.util.Objects;
import v0.a;
import v0.c;
import v0.e;
import v0.g;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a */
    public final EditText f961a;

    /* renamed from: b */
    public final a f962b;

    public n(EditText editText) {
        this.f961a = editText;
        this.f962b = new a(editText);
    }

    public final KeyListener a(KeyListener keyListener) {
        if (!(keyListener instanceof NumberKeyListener)) {
            Objects.requireNonNull(this.f962b.f19745a);
            if (keyListener instanceof e) {
                return keyListener;
            }
            if (keyListener != null) {
                return new e(keyListener);
            }
            return null;
        }
        return keyListener;
    }

    /* JADX WARN: Finally extract failed */
    public final void b(AttributeSet attributeSet, int i10) {
        TypedArray obtainStyledAttributes = this.f961a.getContext().obtainStyledAttributes(attributeSet, f.A, i10, 0);
        try {
            boolean z10 = true;
            if (obtainStyledAttributes.hasValue(14)) {
                z10 = obtainStyledAttributes.getBoolean(14, true);
            }
            obtainStyledAttributes.recycle();
            d(z10);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final InputConnection c(InputConnection inputConnection, EditorInfo editorInfo) {
        a aVar = this.f962b;
        Objects.requireNonNull(aVar);
        if (inputConnection == null) {
            return null;
        }
        a.C0142a c0142a = aVar.f19745a;
        Objects.requireNonNull(c0142a);
        return inputConnection instanceof c ? inputConnection : new c(c0142a.f19746a, inputConnection, editorInfo);
    }

    public final void d(boolean z10) {
        g gVar = this.f962b.f19745a.f19747b;
        if (gVar.f19767v != z10) {
            if (gVar.f19766u != null) {
                d a10 = d.a();
                g.a aVar = gVar.f19766u;
                Objects.requireNonNull(a10);
                l0.g.e(aVar, "initCallback cannot be null");
                a10.f1291a.writeLock().lock();
                try {
                    a10.f1292b.remove(aVar);
                } finally {
                    a10.f1291a.writeLock().unlock();
                }
            }
            gVar.f19767v = z10;
            if (!z10) {
                return;
            }
            g.a(gVar.f19764s, d.a().b());
        }
    }
}
