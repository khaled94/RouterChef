package a6;

import a6.g;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.BitSet;
import java.util.Objects;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a */
    public final l[] f244a = new l[4];

    /* renamed from: b */
    public final Matrix[] f245b = new Matrix[4];

    /* renamed from: c */
    public final Matrix[] f246c = new Matrix[4];

    /* renamed from: d */
    public final PointF f247d = new PointF();

    /* renamed from: e */
    public final Path f248e = new Path();

    /* renamed from: f */
    public final Path f249f = new Path();

    /* renamed from: g */
    public final l f250g = new l();

    /* renamed from: h */
    public final float[] f251h = new float[2];

    /* renamed from: i */
    public final float[] f252i = new float[2];

    /* renamed from: j */
    public final Path f253j = new Path();

    /* renamed from: k */
    public final Path f254k = new Path();

    /* renamed from: l */
    public boolean f255l = true;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public static final k f256a = new k();
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    public k() {
        for (int i10 = 0; i10 < 4; i10++) {
            this.f244a[i10] = new l();
            this.f245b[i10] = new Matrix();
            this.f246c[i10] = new Matrix();
        }
    }

    public final void a(j jVar, float f10, RectF rectF, b bVar, Path path) {
        int i10;
        float[] fArr;
        float f11;
        float f12;
        f fVar;
        Path path2;
        Matrix matrix;
        l lVar;
        c cVar;
        d dVar;
        float f13;
        float f14;
        path.rewind();
        this.f248e.rewind();
        this.f249f.rewind();
        this.f249f.addRect(rectF, Path.Direction.CW);
        int i11 = 0;
        while (true) {
            if (i11 >= 4) {
                break;
            }
            if (i11 == 1) {
                cVar = jVar.f226g;
            } else if (i11 == 2) {
                cVar = jVar.f227h;
            } else if (i11 != 3) {
                cVar = jVar.f225f;
            } else {
                cVar = jVar.f224e;
            }
            if (i11 == 1) {
                dVar = jVar.f222c;
            } else if (i11 == 2) {
                dVar = jVar.f223d;
            } else if (i11 != 3) {
                dVar = jVar.f221b;
            } else {
                dVar = jVar.f220a;
            }
            l lVar2 = this.f244a[i11];
            Objects.requireNonNull(dVar);
            dVar.a(lVar2, f10, cVar.a(rectF));
            int i12 = i11 + 1;
            float f15 = i12 * 90;
            this.f245b[i11].reset();
            PointF pointF = this.f247d;
            if (i11 == 1) {
                f14 = rectF.right;
            } else if (i11 != 2) {
                f14 = i11 != 3 ? rectF.right : rectF.left;
                f13 = rectF.top;
                pointF.set(f14, f13);
                Matrix matrix2 = this.f245b[i11];
                PointF pointF2 = this.f247d;
                matrix2.setTranslate(pointF2.x, pointF2.y);
                this.f245b[i11].preRotate(f15);
                float[] fArr2 = this.f251h;
                l[] lVarArr = this.f244a;
                fArr2[0] = lVarArr[i11].f259c;
                fArr2[1] = lVarArr[i11].f260d;
                this.f245b[i11].mapPoints(fArr2);
                this.f246c[i11].reset();
                Matrix matrix3 = this.f246c[i11];
                float[] fArr3 = this.f251h;
                matrix3.setTranslate(fArr3[0], fArr3[1]);
                this.f246c[i11].preRotate(f15);
                i11 = i12;
            } else {
                f14 = rectF.left;
            }
            f13 = rectF.bottom;
            pointF.set(f14, f13);
            Matrix matrix22 = this.f245b[i11];
            PointF pointF22 = this.f247d;
            matrix22.setTranslate(pointF22.x, pointF22.y);
            this.f245b[i11].preRotate(f15);
            float[] fArr22 = this.f251h;
            l[] lVarArr2 = this.f244a;
            fArr22[0] = lVarArr2[i11].f259c;
            fArr22[1] = lVarArr2[i11].f260d;
            this.f245b[i11].mapPoints(fArr22);
            this.f246c[i11].reset();
            Matrix matrix32 = this.f246c[i11];
            float[] fArr32 = this.f251h;
            matrix32.setTranslate(fArr32[0], fArr32[1]);
            this.f246c[i11].preRotate(f15);
            i11 = i12;
        }
        int i13 = 0;
        for (i10 = 4; i13 < i10; i10 = 4) {
            float[] fArr4 = this.f251h;
            l[] lVarArr3 = this.f244a;
            fArr4[0] = lVarArr3[i13].f257a;
            fArr4[1] = lVarArr3[i13].f258b;
            this.f245b[i13].mapPoints(fArr4);
            float[] fArr5 = this.f251h;
            if (i13 == 0) {
                path.moveTo(fArr5[0], fArr5[1]);
            } else {
                path.lineTo(fArr5[0], fArr5[1]);
            }
            this.f244a[i13].c(this.f245b[i13], path);
            if (bVar != null) {
                l lVar3 = this.f244a[i13];
                Matrix matrix4 = this.f245b[i13];
                g.a aVar = (g.a) bVar;
                BitSet bitSet = g.this.f194v;
                Objects.requireNonNull(lVar3);
                bitSet.set(i13, false);
                g.this.f192t[i13] = lVar3.d(matrix4);
            }
            int i14 = i13 + 1;
            int i15 = i14 % 4;
            float[] fArr6 = this.f251h;
            l[] lVarArr4 = this.f244a;
            fArr6[0] = lVarArr4[i13].f259c;
            fArr6[1] = lVarArr4[i13].f260d;
            this.f245b[i13].mapPoints(fArr6);
            float[] fArr7 = this.f252i;
            l[] lVarArr5 = this.f244a;
            fArr7[0] = lVarArr5[i15].f257a;
            fArr7[1] = lVarArr5[i15].f258b;
            this.f245b[i15].mapPoints(fArr7);
            float f16 = this.f251h[0];
            float[] fArr8 = this.f252i;
            float max = Math.max(((float) Math.hypot(f16 - fArr8[0], fArr[1] - fArr8[1])) - 0.001f, 0.0f);
            float[] fArr9 = this.f251h;
            l[] lVarArr6 = this.f244a;
            fArr9[0] = lVarArr6[i13].f259c;
            fArr9[1] = lVarArr6[i13].f260d;
            this.f245b[i13].mapPoints(fArr9);
            if (i13 == 1 || i13 == 3) {
                f12 = rectF.centerX();
                f11 = this.f251h[0];
            } else {
                f12 = rectF.centerY();
                f11 = this.f251h[1];
            }
            float abs = Math.abs(f12 - f11);
            this.f250g.f(0.0f, 270.0f, 0.0f);
            if (i13 == 1) {
                fVar = jVar.f230k;
            } else if (i13 == 2) {
                fVar = jVar.f231l;
            } else if (i13 != 3) {
                fVar = jVar.f229j;
            } else {
                fVar = jVar.f228i;
            }
            fVar.g(max, abs, f10, this.f250g);
            this.f253j.reset();
            this.f250g.c(this.f246c[i13], this.f253j);
            if (!this.f255l || (!b(this.f253j, i13) && !b(this.f253j, i15))) {
                lVar = this.f250g;
                matrix = this.f246c[i13];
                path2 = path;
            } else {
                Path path3 = this.f253j;
                path3.op(path3, this.f249f, Path.Op.DIFFERENCE);
                float[] fArr10 = this.f251h;
                l lVar4 = this.f250g;
                fArr10[0] = lVar4.f257a;
                fArr10[1] = lVar4.f258b;
                this.f246c[i13].mapPoints(fArr10);
                Path path4 = this.f248e;
                float[] fArr11 = this.f251h;
                path4.moveTo(fArr11[0], fArr11[1]);
                lVar = this.f250g;
                matrix = this.f246c[i13];
                path2 = this.f248e;
            }
            lVar.c(matrix, path2);
            if (bVar != null) {
                l lVar5 = this.f250g;
                Matrix matrix5 = this.f246c[i13];
                g.a aVar2 = (g.a) bVar;
                Objects.requireNonNull(lVar5);
                g.this.f194v.set(i13 + 4, false);
                g.this.f193u[i13] = lVar5.d(matrix5);
            }
            i13 = i14;
        }
        path.close();
        this.f248e.close();
        if (!this.f248e.isEmpty()) {
            path.op(this.f248e, Path.Op.UNION);
        }
    }

    public final boolean b(Path path, int i10) {
        this.f254k.reset();
        this.f244a[i10].c(this.f245b[i10], this.f254k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.f254k.computeBounds(rectF, true);
        path.op(this.f254k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }
}
