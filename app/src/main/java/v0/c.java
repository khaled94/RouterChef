package v0;

import android.os.Bundle;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;
import androidx.emoji2.text.d;
import java.util.Objects;
import u0.b;

/* loaded from: classes.dex */
public final class c extends InputConnectionWrapper {

    /* renamed from: a */
    public final TextView f19751a;

    /* renamed from: b */
    public final a f19752b;

    /* loaded from: classes.dex */
    public static class a {
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0050, code lost:
            if (java.lang.Character.isHighSurrogate(r5) != false) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x0080, code lost:
            if (r12 != false) goto L57;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x008d, code lost:
            if (java.lang.Character.isLowSurrogate(r5) != false) goto L50;
         */
        /* JADX WARN: Removed duplicated region for block: B:44:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x00ae A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:82:0x007c A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:93:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean a(android.view.inputmethod.InputConnection r8, android.text.Editable r9, int r10, int r11, boolean r12) {
            /*
                Method dump skipped, instructions count: 252
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: v0.c.a.a(android.view.inputmethod.InputConnection, android.text.Editable, int, int, boolean):boolean");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        super(inputConnection, false);
        a aVar = new a();
        this.f19751a = textView;
        this.f19752b = aVar;
        if (d.c()) {
            d a10 = d.a();
            if (!a10.d() || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            d.a aVar2 = a10.f1295e;
            Objects.requireNonNull(aVar2);
            Bundle bundle = editorInfo.extras;
            b bVar = aVar2.f1300c.f1346a;
            int a11 = bVar.a(4);
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", a11 != 0 ? bVar.f18990b.getInt(a11 + bVar.f18989a) : 0);
            Bundle bundle2 = editorInfo.extras;
            Objects.requireNonNull(aVar2.f1302a);
            bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i10, int i11) {
        return this.f19752b.a(this, this.f19751a.getEditableText(), i10, i11, false) || super.deleteSurroundingText(i10, i11);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        return this.f19752b.a(this, this.f19751a.getEditableText(), i10, i11, true) || super.deleteSurroundingTextInCodePoints(i10, i11);
    }
}
