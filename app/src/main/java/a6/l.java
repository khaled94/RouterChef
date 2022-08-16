package a6;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class l {
    @Deprecated

    /* renamed from: a */
    public float f257a;
    @Deprecated

    /* renamed from: b */
    public float f258b;
    @Deprecated

    /* renamed from: c */
    public float f259c;
    @Deprecated

    /* renamed from: d */
    public float f260d;
    @Deprecated

    /* renamed from: e */
    public float f261e;
    @Deprecated

    /* renamed from: f */
    public float f262f;

    /* renamed from: g */
    public final List<f> f263g = new ArrayList();

    /* renamed from: h */
    public final List<g> f264h = new ArrayList();

    /* loaded from: classes.dex */
    public class a extends g {

        /* renamed from: b */
        public final /* synthetic */ List f265b;

        /* renamed from: c */
        public final /* synthetic */ Matrix f266c;

        public a(List list, Matrix matrix) {
            this.f265b = list;
            this.f266c = matrix;
        }

        @Override // a6.l.g
        public final void a(Matrix matrix, z5.a aVar, int i10, Canvas canvas) {
            for (g gVar : this.f265b) {
                gVar.a(this.f266c, aVar, i10, canvas);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b extends g {

        /* renamed from: b */
        public final d f267b;

        public b(d dVar) {
            this.f267b = dVar;
        }

        @Override // a6.l.g
        public final void a(Matrix matrix, z5.a aVar, int i10, Canvas canvas) {
            d dVar = this.f267b;
            float f10 = dVar.f276f;
            float f11 = dVar.f277g;
            d dVar2 = this.f267b;
            RectF rectF = new RectF(dVar2.f272b, dVar2.f273c, dVar2.f274d, dVar2.f275e);
            boolean z10 = f11 < 0.0f;
            Path path = aVar.f20989g;
            if (z10) {
                int[] iArr = z5.a.f20981k;
                iArr[0] = 0;
                iArr[1] = aVar.f20988f;
                iArr[2] = aVar.f20987e;
                iArr[3] = aVar.f20986d;
            } else {
                path.rewind();
                path.moveTo(rectF.centerX(), rectF.centerY());
                path.arcTo(rectF, f10, f11);
                path.close();
                float f12 = -i10;
                rectF.inset(f12, f12);
                int[] iArr2 = z5.a.f20981k;
                iArr2[0] = 0;
                iArr2[1] = aVar.f20986d;
                iArr2[2] = aVar.f20987e;
                iArr2[3] = aVar.f20988f;
            }
            float width = rectF.width() / 2.0f;
            if (width <= 0.0f) {
                return;
            }
            float f13 = 1.0f - (i10 / width);
            float[] fArr = z5.a.f20982l;
            fArr[1] = f13;
            fArr[2] = ((1.0f - f13) / 2.0f) + f13;
            aVar.f20984b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, z5.a.f20981k, fArr, Shader.TileMode.CLAMP));
            canvas.save();
            canvas.concat(matrix);
            canvas.scale(1.0f, rectF.height() / rectF.width());
            if (!z10) {
                canvas.clipPath(path, Region.Op.DIFFERENCE);
                canvas.drawPath(path, aVar.f20990h);
            }
            canvas.drawArc(rectF, f10, f11, true, aVar.f20984b);
            canvas.restore();
        }
    }

    /* loaded from: classes.dex */
    public static class c extends g {

        /* renamed from: b */
        public final e f268b;

        /* renamed from: c */
        public final float f269c;

        /* renamed from: d */
        public final float f270d;

        public c(e eVar, float f10, float f11) {
            this.f268b = eVar;
            this.f269c = f10;
            this.f270d = f11;
        }

        @Override // a6.l.g
        public final void a(Matrix matrix, z5.a aVar, int i10, Canvas canvas) {
            e eVar = this.f268b;
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(eVar.f279c - this.f270d, eVar.f278b - this.f269c), 0.0f);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.preTranslate(this.f269c, this.f270d);
            matrix2.preRotate(b());
            Objects.requireNonNull(aVar);
            rectF.bottom += i10;
            rectF.offset(0.0f, -i10);
            int[] iArr = z5.a.f20979i;
            iArr[0] = aVar.f20988f;
            iArr[1] = aVar.f20987e;
            iArr[2] = aVar.f20986d;
            Paint paint = aVar.f20985c;
            float f10 = rectF.left;
            paint.setShader(new LinearGradient(f10, rectF.top, f10, rectF.bottom, iArr, z5.a.f20980j, Shader.TileMode.CLAMP));
            canvas.save();
            canvas.concat(matrix2);
            canvas.drawRect(rectF, aVar.f20985c);
            canvas.restore();
        }

        public final float b() {
            e eVar = this.f268b;
            return (float) Math.toDegrees(Math.atan((eVar.f279c - this.f270d) / (eVar.f278b - this.f269c)));
        }
    }

    /* loaded from: classes.dex */
    public static class d extends f {

        /* renamed from: h */
        public static final RectF f271h = new RectF();
        @Deprecated

        /* renamed from: b */
        public float f272b;
        @Deprecated

        /* renamed from: c */
        public float f273c;
        @Deprecated

        /* renamed from: d */
        public float f274d;
        @Deprecated

        /* renamed from: e */
        public float f275e;
        @Deprecated

        /* renamed from: f */
        public float f276f;
        @Deprecated

        /* renamed from: g */
        public float f277g;

        public d(float f10, float f11, float f12, float f13) {
            this.f272b = f10;
            this.f273c = f11;
            this.f274d = f12;
            this.f275e = f13;
        }

        @Override // a6.l.f
        public final void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f280a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f271h;
            rectF.set(this.f272b, this.f273c, this.f274d, this.f275e);
            path.arcTo(rectF, this.f276f, this.f277g, false);
            path.transform(matrix);
        }
    }

    /* loaded from: classes.dex */
    public static class e extends f {

        /* renamed from: b */
        public float f278b;

        /* renamed from: c */
        public float f279c;

        @Override // a6.l.f
        public final void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f280a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f278b, this.f279c);
            path.transform(matrix);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class f {

        /* renamed from: a */
        public final Matrix f280a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    /* loaded from: classes.dex */
    public static abstract class g {

        /* renamed from: a */
        public static final Matrix f281a = new Matrix();

        public abstract void a(Matrix matrix, z5.a aVar, int i10, Canvas canvas);
    }

    public l() {
        f(0.0f, 270.0f, 0.0f);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List<a6.l$f>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.List<a6.l$g>, java.util.ArrayList] */
    public final void a(float f10, float f11, float f12, float f13, float f14, float f15) {
        d dVar = new d(f10, f11, f12, f13);
        dVar.f276f = f14;
        dVar.f277g = f15;
        this.f263g.add(dVar);
        b bVar = new b(dVar);
        float f16 = f14 + f15;
        boolean z10 = f15 < 0.0f;
        if (z10) {
            f14 = (f14 + 180.0f) % 360.0f;
        }
        float f17 = z10 ? (180.0f + f16) % 360.0f : f16;
        b(f14);
        this.f264h.add(bVar);
        this.f261e = f17;
        double d5 = f16;
        this.f259c = (((f12 - f10) / 2.0f) * ((float) Math.cos(Math.toRadians(d5)))) + ((f10 + f12) * 0.5f);
        this.f260d = (((f13 - f11) / 2.0f) * ((float) Math.sin(Math.toRadians(d5)))) + ((f11 + f13) * 0.5f);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List<a6.l$g>, java.util.ArrayList] */
    public final void b(float f10) {
        float f11 = this.f261e;
        if (f11 == f10) {
            return;
        }
        float f12 = ((f10 - f11) + 360.0f) % 360.0f;
        if (f12 > 180.0f) {
            return;
        }
        float f13 = this.f259c;
        float f14 = this.f260d;
        d dVar = new d(f13, f14, f13, f14);
        dVar.f276f = this.f261e;
        dVar.f277g = f12;
        this.f264h.add(new b(dVar));
        this.f261e = f10;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<a6.l$f>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List<a6.l$f>, java.util.ArrayList] */
    public final void c(Matrix matrix, Path path) {
        int size = this.f263g.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((f) this.f263g.get(i10)).a(matrix, path);
        }
    }

    public final g d(Matrix matrix) {
        b(this.f262f);
        return new a(new ArrayList(this.f264h), new Matrix(matrix));
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List<a6.l$g>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List<a6.l$f>, java.util.ArrayList] */
    public final void e(float f10, float f11) {
        e eVar = new e();
        eVar.f278b = f10;
        eVar.f279c = f11;
        this.f263g.add(eVar);
        c cVar = new c(eVar, this.f259c, this.f260d);
        b(cVar.b() + 270.0f);
        this.f264h.add(cVar);
        this.f261e = cVar.b() + 270.0f;
        this.f259c = f10;
        this.f260d = f11;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List<a6.l$f>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List<a6.l$g>, java.util.ArrayList] */
    public final void f(float f10, float f11, float f12) {
        this.f257a = 0.0f;
        this.f258b = f10;
        this.f259c = 0.0f;
        this.f260d = f10;
        this.f261e = f11;
        this.f262f = (f11 + f12) % 360.0f;
        this.f263g.clear();
        this.f264h.clear();
    }
}
