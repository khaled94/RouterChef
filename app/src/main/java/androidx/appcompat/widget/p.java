package androidx.appcompat.widget;

import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.util.concurrent.CancellationException;
import k9.o0;
import s4.aa;
import x8.f;
import y4.d1;
import y4.e1;
import y4.f1;

/* loaded from: classes.dex */
public final class p implements d1 {

    /* renamed from: s */
    public static final /* synthetic */ p f975s = new p();

    public static void a(Object obj, StringBuilder sb) {
        String str;
        int lastIndexOf;
        if (obj == null) {
            str = "null";
        } else {
            String simpleName = obj.getClass().getSimpleName();
            if (simpleName.length() <= 0 && (lastIndexOf = (simpleName = obj.getClass().getName()).lastIndexOf(46)) > 0) {
                simpleName = simpleName.substring(lastIndexOf + 1);
            }
            sb.append(simpleName);
            sb.append('{');
            str = Integer.toHexString(System.identityHashCode(obj));
        }
        sb.append(str);
    }

    public static final void b(f fVar, CancellationException cancellationException) {
        o0 o0Var = (o0) fVar.get(o0.b.f5677s);
        if (o0Var == null) {
            return;
        }
        o0Var.Y(cancellationException);
    }

    public static InputConnection c(InputConnection inputConnection, EditorInfo editorInfo, View view) {
        if (inputConnection != null && editorInfo.hintText == null) {
            ViewParent parent = view.getParent();
            while (true) {
                if (!(parent instanceof View)) {
                    break;
                } else if (parent instanceof o1) {
                    editorInfo.hintText = ((o1) parent).a();
                    break;
                } else {
                    parent = parent.getParent();
                }
            }
        }
        return inputConnection;
    }

    @Override // y4.d1
    /* renamed from: zza */
    public Object mo14zza() {
        e1<Long> e1Var = f1.f20399b;
        return Integer.valueOf((int) aa.f17726t.zza().b());
    }
}
