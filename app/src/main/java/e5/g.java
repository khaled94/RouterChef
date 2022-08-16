package e5;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Log;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.activity.result.a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a */
    public final r.g<String, h> f4420a = new r.g<>();

    /* renamed from: b */
    public final r.g<String, PropertyValuesHolder[]> f4421b = new r.g<>();

    public static g a(Context context, int i10) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i10);
            if (loadAnimator instanceof AnimatorSet) {
                return b(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return b(arrayList);
        } catch (Exception e10) {
            StringBuilder c10 = a.c("Can't load animation resource ID #0x");
            c10.append(Integer.toHexString(i10));
            Log.w("MotionSpec", c10.toString(), e10);
            return null;
        }
    }

    public static g b(List<Animator> list) {
        g gVar = new g();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Animator animator = list.get(i10);
            if (animator instanceof ObjectAnimator) {
                ObjectAnimator objectAnimator = (ObjectAnimator) animator;
                gVar.f4421b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
                String propertyName = objectAnimator.getPropertyName();
                long startDelay = objectAnimator.getStartDelay();
                long duration = objectAnimator.getDuration();
                TimeInterpolator interpolator = objectAnimator.getInterpolator();
                if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                    interpolator = a.f4409b;
                } else if (interpolator instanceof AccelerateInterpolator) {
                    interpolator = a.f4410c;
                } else if (interpolator instanceof DecelerateInterpolator) {
                    interpolator = a.f4411d;
                }
                h hVar = new h(startDelay, duration, interpolator);
                hVar.f4425d = objectAnimator.getRepeatCount();
                hVar.f4426e = objectAnimator.getRepeatMode();
                gVar.f4420a.put(propertyName, hVar);
            } else {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
        }
        return gVar;
    }

    public final h c(String str) {
        if (this.f4420a.getOrDefault(str, null) != null) {
            return this.f4420a.getOrDefault(str, null);
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            return this.f4420a.equals(((g) obj).f4420a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4420a.hashCode();
    }

    public final String toString() {
        return '\n' + g.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f4420a + "}\n";
    }
}
