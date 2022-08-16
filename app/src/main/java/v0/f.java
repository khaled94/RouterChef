package v0;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import androidx.emoji2.text.d;
import java.util.Objects;
import l0.g;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a */
    public final b f19759a;

    /* loaded from: classes.dex */
    public static class a extends b {

        /* renamed from: a */
        public final TextView f19760a;

        /* renamed from: b */
        public final d f19761b;

        /* renamed from: c */
        public boolean f19762c = true;

        public a(TextView textView) {
            this.f19760a = textView;
            this.f19761b = new d(textView);
        }

        @Override // v0.f.b
        public final InputFilter[] a(InputFilter[] inputFilterArr) {
            if (!this.f19762c) {
                SparseArray sparseArray = new SparseArray(1);
                for (int i10 = 0; i10 < inputFilterArr.length; i10++) {
                    if (inputFilterArr[i10] instanceof d) {
                        sparseArray.put(i10, inputFilterArr[i10]);
                    }
                }
                if (sparseArray.size() == 0) {
                    return inputFilterArr;
                }
                int length = inputFilterArr.length;
                InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
                int i11 = 0;
                for (int i12 = 0; i12 < length; i12++) {
                    if (sparseArray.indexOfKey(i12) < 0) {
                        inputFilterArr2[i11] = inputFilterArr[i12];
                        i11++;
                    }
                }
                return inputFilterArr2;
            }
            int length2 = inputFilterArr.length;
            for (InputFilter inputFilter : inputFilterArr) {
                if (inputFilter == this.f19761b) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
            System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
            inputFilterArr3[length2] = this.f19761b;
            return inputFilterArr3;
        }

        @Override // v0.f.b
        public final boolean b() {
            return this.f19762c;
        }

        @Override // v0.f.b
        public final void c(boolean z10) {
            if (z10) {
                this.f19760a.setTransformationMethod(e(this.f19760a.getTransformationMethod()));
            }
        }

        @Override // v0.f.b
        public final void d(boolean z10) {
            this.f19762c = z10;
            this.f19760a.setTransformationMethod(e(this.f19760a.getTransformationMethod()));
            this.f19760a.setFilters(a(this.f19760a.getFilters()));
        }

        @Override // v0.f.b
        public final TransformationMethod e(TransformationMethod transformationMethod) {
            return this.f19762c ? (!(transformationMethod instanceof h) && !(transformationMethod instanceof PasswordTransformationMethod)) ? new h(transformationMethod) : transformationMethod : transformationMethod instanceof h ? ((h) transformationMethod).f19769s : transformationMethod;
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public InputFilter[] a(InputFilter[] inputFilterArr) {
            throw null;
        }

        public boolean b() {
            throw null;
        }

        public void c(boolean z10) {
            throw null;
        }

        public void d(boolean z10) {
            throw null;
        }

        public TransformationMethod e(TransformationMethod transformationMethod) {
            throw null;
        }
    }

    /* loaded from: classes.dex */
    public static class c extends b {

        /* renamed from: a */
        public final a f19763a;

        public c(TextView textView) {
            this.f19763a = new a(textView);
        }

        @Override // v0.f.b
        public final InputFilter[] a(InputFilter[] inputFilterArr) {
            return f() ? inputFilterArr : this.f19763a.a(inputFilterArr);
        }

        @Override // v0.f.b
        public final boolean b() {
            return this.f19763a.f19762c;
        }

        @Override // v0.f.b
        public final void c(boolean z10) {
            if (f()) {
                return;
            }
            a aVar = this.f19763a;
            Objects.requireNonNull(aVar);
            if (!z10) {
                return;
            }
            aVar.f19760a.setTransformationMethod(aVar.e(aVar.f19760a.getTransformationMethod()));
        }

        @Override // v0.f.b
        public final void d(boolean z10) {
            if (f()) {
                this.f19763a.f19762c = z10;
            } else {
                this.f19763a.d(z10);
            }
        }

        @Override // v0.f.b
        public final TransformationMethod e(TransformationMethod transformationMethod) {
            return f() ? transformationMethod : this.f19763a.e(transformationMethod);
        }

        public final boolean f() {
            return !d.c();
        }
    }

    public f(TextView textView) {
        g.e(textView, "textView cannot be null");
        this.f19759a = new c(textView);
    }
}
