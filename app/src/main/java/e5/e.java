package e5;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

/* loaded from: classes.dex */
public final class e extends Property<ImageView, Matrix> {

    /* renamed from: a */
    public final Matrix f4416a = new Matrix();

    public e() {
        super(Matrix.class, "imageMatrixProperty");
    }

    @Override // android.util.Property
    public final Matrix get(ImageView imageView) {
        this.f4416a.set(imageView.getImageMatrix());
        return this.f4416a;
    }

    @Override // android.util.Property
    public final void set(ImageView imageView, Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }
}
