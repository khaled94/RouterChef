package q1;

import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.InflateException;
import android.view.animation.AnimationUtils;
import d0.l;
import e0.e;
import java.util.ArrayList;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class c {

    /* loaded from: classes.dex */
    public static class a implements TypeEvaluator<e.a[]> {

        /* renamed from: a */
        public e.a[] f17073a;

        @Override // android.animation.TypeEvaluator
        public final e.a[] evaluate(float f10, e.a[] aVarArr, e.a[] aVarArr2) {
            e.a[] aVarArr3 = aVarArr;
            e.a[] aVarArr4 = aVarArr2;
            if (e.a(aVarArr3, aVarArr4)) {
                if (!e.a(this.f17073a, aVarArr3)) {
                    this.f17073a = e.e(aVarArr3);
                }
                for (int i10 = 0; i10 < aVarArr3.length; i10++) {
                    e.a aVar = this.f17073a[i10];
                    e.a aVar2 = aVarArr3[i10];
                    e.a aVar3 = aVarArr4[i10];
                    Objects.requireNonNull(aVar);
                    aVar.f4316a = aVar2.f4316a;
                    int i11 = 0;
                    while (true) {
                        float[] fArr = aVar2.f4317b;
                        if (i11 < fArr.length) {
                            aVar.f4317b[i11] = (aVar3.f4317b[i11] * f10) + ((1.0f - f10) * fArr[i11]);
                            i11++;
                        }
                    }
                }
                return this.f17073a;
            }
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:161:0x0329, code lost:
        if (r27 == null) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x032b, code lost:
        if (r12 == null) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x032d, code lost:
        r1 = new android.animation.Animator[r12.size()];
        r2 = r12.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x033b, code lost:
        if (r2.hasNext() == false) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x033d, code lost:
        r1[r13] = (android.animation.Animator) r2.next();
        r13 = r13 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0349, code lost:
        if (r28 != 0) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x034b, code lost:
        r27.playTogether(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x034f, code lost:
        r27.playSequentially(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0352, code lost:
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0302  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.animation.Animator a(android.content.Context r22, android.content.res.Resources r23, android.content.res.Resources.Theme r24, org.xmlpull.v1.XmlPullParser r25, android.util.AttributeSet r26, android.animation.AnimatorSet r27, int r28) {
        /*
            Method dump skipped, instructions count: 851
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.c.a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int):android.animation.Animator");
    }

    public static Keyframe b(Keyframe keyframe, float f10) {
        return keyframe.getType() == Float.TYPE ? Keyframe.ofFloat(f10) : keyframe.getType() == Integer.TYPE ? Keyframe.ofInt(f10) : Keyframe.ofObject(f10);
    }

    public static PropertyValuesHolder c(TypedArray typedArray, int i10, int i11, int i12, String str) {
        PropertyValuesHolder propertyValuesHolder;
        PropertyValuesHolder propertyValuesHolder2;
        TypedValue peekValue = typedArray.peekValue(i11);
        boolean z10 = peekValue != null;
        int i13 = z10 ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i12);
        boolean z11 = peekValue2 != null;
        int i14 = z11 ? peekValue2.type : 0;
        if (i10 == 4) {
            i10 = ((!z10 || !d(i13)) && (!z11 || !d(i14))) ? 0 : 3;
        }
        boolean z12 = i10 == 0;
        PropertyValuesHolder propertyValuesHolder3 = null;
        if (i10 != 2) {
            d dVar = i10 == 3 ? d.f17074a : null;
            if (z12) {
                if (z10) {
                    float dimension = i13 == 5 ? typedArray.getDimension(i11, 0.0f) : typedArray.getFloat(i11, 0.0f);
                    if (z11) {
                        propertyValuesHolder = PropertyValuesHolder.ofFloat(str, dimension, i14 == 5 ? typedArray.getDimension(i12, 0.0f) : typedArray.getFloat(i12, 0.0f));
                    } else {
                        propertyValuesHolder = PropertyValuesHolder.ofFloat(str, dimension);
                    }
                } else {
                    propertyValuesHolder = PropertyValuesHolder.ofFloat(str, i14 == 5 ? typedArray.getDimension(i12, 0.0f) : typedArray.getFloat(i12, 0.0f));
                }
                propertyValuesHolder3 = propertyValuesHolder;
            } else if (z10) {
                int dimension2 = i13 == 5 ? (int) typedArray.getDimension(i11, 0.0f) : d(i13) ? typedArray.getColor(i11, 0) : typedArray.getInt(i11, 0);
                if (z11) {
                    propertyValuesHolder3 = PropertyValuesHolder.ofInt(str, dimension2, i14 == 5 ? (int) typedArray.getDimension(i12, 0.0f) : d(i14) ? typedArray.getColor(i12, 0) : typedArray.getInt(i12, 0));
                } else {
                    propertyValuesHolder3 = PropertyValuesHolder.ofInt(str, dimension2);
                }
            } else if (z11) {
                propertyValuesHolder3 = PropertyValuesHolder.ofInt(str, i14 == 5 ? (int) typedArray.getDimension(i12, 0.0f) : d(i14) ? typedArray.getColor(i12, 0) : typedArray.getInt(i12, 0));
            }
            if (propertyValuesHolder3 == null || dVar == null) {
                return propertyValuesHolder3;
            }
            propertyValuesHolder3.setEvaluator(dVar);
            return propertyValuesHolder3;
        }
        String string = typedArray.getString(i11);
        String string2 = typedArray.getString(i12);
        e.a[] c10 = e.c(string);
        e.a[] c11 = e.c(string2);
        if (c10 == null && c11 == null) {
            return null;
        }
        if (c10 == null) {
            if (c11 == null) {
                return null;
            }
            return PropertyValuesHolder.ofObject(str, new a(), c11);
        }
        a aVar = new a();
        if (c11 == null) {
            propertyValuesHolder2 = PropertyValuesHolder.ofObject(str, aVar, c10);
        } else if (!e.a(c10, c11)) {
            throw new InflateException(" Can't morph from " + string + " to " + string2);
        } else {
            propertyValuesHolder2 = PropertyValuesHolder.ofObject(str, aVar, c10, c11);
        }
        return propertyValuesHolder2;
    }

    public static boolean d(int i10) {
        return i10 >= 28 && i10 <= 31;
    }

    public static ValueAnimator e(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, XmlPullParser xmlPullParser) {
        TypedArray typedArray;
        ValueAnimator valueAnimator2;
        TypedArray typedArray2;
        ValueAnimator valueAnimator3;
        PropertyValuesHolder propertyValuesHolder;
        TypedArray l10 = l.l(resources, theme, attributeSet, q1.a.f17056g);
        TypedArray l11 = l.l(resources, theme, attributeSet, q1.a.f17060k);
        ValueAnimator valueAnimator4 = valueAnimator == null ? new ValueAnimator() : valueAnimator;
        long f10 = l.f(l10, xmlPullParser, "duration", 1, 300);
        int i10 = 0;
        long f11 = l.f(l10, xmlPullParser, "startOffset", 2, 0);
        int f12 = l.f(l10, xmlPullParser, "valueType", 7, 4);
        if (l.k(xmlPullParser, "valueFrom") && l.k(xmlPullParser, "valueTo")) {
            if (f12 == 4) {
                TypedValue peekValue = l10.peekValue(5);
                boolean z10 = peekValue != null;
                int i11 = z10 ? peekValue.type : 0;
                TypedValue peekValue2 = l10.peekValue(6);
                boolean z11 = peekValue2 != null;
                f12 = ((!z10 || !d(i11)) && (!z11 || !d(z11 ? peekValue2.type : 0))) ? 0 : 3;
            }
            PropertyValuesHolder c10 = c(l10, f12, 5, 6, "");
            if (c10 != null) {
                valueAnimator4.setValues(c10);
            }
        }
        valueAnimator4.setDuration(f10);
        valueAnimator4.setStartDelay(f11);
        valueAnimator4.setRepeatCount(l.f(l10, xmlPullParser, "repeatCount", 3, 0));
        valueAnimator4.setRepeatMode(l.f(l10, xmlPullParser, "repeatMode", 4, 1));
        if (l11 != null) {
            ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator4;
            String g10 = l.g(l11, xmlPullParser, "pathData", 1);
            if (g10 != null) {
                String g11 = l.g(l11, xmlPullParser, "propertyXName", 2);
                String g12 = l.g(l11, xmlPullParser, "propertyYName", 3);
                if (g11 == null && g12 == null) {
                    throw new InflateException(l11.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
                }
                Path d5 = e.d(g10);
                PathMeasure pathMeasure = new PathMeasure(d5, false);
                ArrayList arrayList = new ArrayList();
                arrayList.add(Float.valueOf(0.0f));
                float f13 = 0.0f;
                do {
                    f13 += pathMeasure.getLength();
                    arrayList.add(Float.valueOf(f13));
                } while (pathMeasure.nextContour());
                PathMeasure pathMeasure2 = new PathMeasure(d5, false);
                int min = Math.min(100, ((int) (f13 / 0.5f)) + 1);
                float[] fArr = new float[min];
                float[] fArr2 = new float[min];
                float[] fArr3 = new float[2];
                float f14 = f13 / (min - 1);
                valueAnimator2 = valueAnimator4;
                typedArray = l10;
                int i12 = 0;
                float f15 = 0.0f;
                while (true) {
                    propertyValuesHolder = null;
                    if (i10 >= min) {
                        break;
                    }
                    int i13 = min;
                    pathMeasure2.getPosTan(f15 - ((Float) arrayList.get(i12)).floatValue(), fArr3, null);
                    fArr[i10] = fArr3[0];
                    fArr2[i10] = fArr3[1];
                    f15 += f14;
                    int i14 = i12 + 1;
                    if (i14 < arrayList.size() && f15 > ((Float) arrayList.get(i14)).floatValue()) {
                        pathMeasure2.nextContour();
                        i12 = i14;
                    }
                    i10++;
                    min = i13;
                }
                PropertyValuesHolder ofFloat = g11 != null ? PropertyValuesHolder.ofFloat(g11, fArr) : null;
                if (g12 != null) {
                    propertyValuesHolder = PropertyValuesHolder.ofFloat(g12, fArr2);
                }
                if (ofFloat == null) {
                    i10 = 0;
                    objectAnimator.setValues(propertyValuesHolder);
                } else {
                    i10 = 0;
                    if (propertyValuesHolder == null) {
                        objectAnimator.setValues(ofFloat);
                    } else {
                        objectAnimator.setValues(ofFloat, propertyValuesHolder);
                    }
                }
            } else {
                valueAnimator2 = valueAnimator4;
                typedArray = l10;
                objectAnimator.setPropertyName(l.g(l11, xmlPullParser, "propertyName", 0));
            }
        } else {
            valueAnimator2 = valueAnimator4;
            typedArray = l10;
        }
        if (!l.k(xmlPullParser, "interpolator")) {
            typedArray2 = typedArray;
        } else {
            typedArray2 = typedArray;
            i10 = typedArray2.getResourceId(i10, i10);
        }
        if (i10 > 0) {
            valueAnimator3 = valueAnimator2;
            valueAnimator3.setInterpolator(AnimationUtils.loadInterpolator(context, i10));
        } else {
            valueAnimator3 = valueAnimator2;
        }
        typedArray2.recycle();
        if (l11 != null) {
            l11.recycle();
        }
        return valueAnimator3;
    }
}
