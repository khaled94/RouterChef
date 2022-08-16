package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.Objects;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a */
    public TextView f814a;

    /* renamed from: b */
    public TextClassifier f815b;

    public d0(TextView textView) {
        Objects.requireNonNull(textView);
        this.f814a = textView;
    }

    public final TextClassifier a() {
        TextClassifier textClassifier = this.f815b;
        if (textClassifier == null) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) this.f814a.getContext().getSystemService(TextClassificationManager.class);
            return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
        }
        return textClassifier;
    }
}
