package e5;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a */
    public long f4422a;

    /* renamed from: b */
    public long f4423b;

    /* renamed from: c */
    public TimeInterpolator f4424c;

    /* renamed from: d */
    public int f4425d;

    /* renamed from: e */
    public int f4426e;

    public h(long j3) {
        this.f4424c = null;
        this.f4425d = 0;
        this.f4426e = 1;
        this.f4422a = j3;
        this.f4423b = 150L;
    }

    public h(long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f4425d = 0;
        this.f4426e = 1;
        this.f4422a = j3;
        this.f4423b = j10;
        this.f4424c = timeInterpolator;
    }

    public final void a(Animator animator) {
        animator.setStartDelay(this.f4422a);
        animator.setDuration(this.f4423b);
        animator.setInterpolator(b());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(this.f4425d);
            valueAnimator.setRepeatMode(this.f4426e);
        }
    }

    public final TimeInterpolator b() {
        TimeInterpolator timeInterpolator = this.f4424c;
        return timeInterpolator != null ? timeInterpolator : a.f4409b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f4422a != hVar.f4422a || this.f4423b != hVar.f4423b || this.f4425d != hVar.f4425d || this.f4426e != hVar.f4426e) {
            return false;
        }
        return b().getClass().equals(hVar.b().getClass());
    }

    public final int hashCode() {
        long j3 = this.f4422a;
        long j10 = this.f4423b;
        return ((((b().getClass().hashCode() + (((((int) (j3 ^ (j3 >>> 32))) * 31) + ((int) ((j10 >>> 32) ^ j10))) * 31)) * 31) + this.f4425d) * 31) + this.f4426e;
    }

    public final String toString() {
        return '\n' + h.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.f4422a + " duration: " + this.f4423b + " interpolator: " + b().getClass() + " repeatCount: " + this.f4425d + " repeatMode: " + this.f4426e + "}\n";
    }
}
