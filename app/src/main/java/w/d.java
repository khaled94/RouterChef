package w;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import m0.o;
import w.e;
import x.b;

/* loaded from: classes.dex */
public final class d extends ConstraintLayout implements o {

    /* renamed from: h0 */
    public static final /* synthetic */ int f19859h0 = 0;
    public float K;
    public int L;
    public int M;
    public int N;
    public float O;
    public float P;
    public long Q;
    public float R;
    public c S;
    public w.b T;
    public boolean U;
    public ArrayList<w.c> V;
    public ArrayList<w.c> W;

    /* renamed from: a0 */
    public CopyOnWriteArrayList<c> f19860a0;

    /* renamed from: b0 */
    public int f19861b0;

    /* renamed from: c0 */
    public float f19862c0;

    /* renamed from: d0 */
    public boolean f19863d0;

    /* renamed from: e0 */
    public b f19864e0;

    /* renamed from: f0 */
    public boolean f19865f0;

    /* renamed from: g0 */
    public EnumC0144d f19866g0;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
            d.this = r1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            d.this.f19864e0.a();
        }
    }

    /* loaded from: classes.dex */
    public class b {

        /* renamed from: a */
        public float f19868a = Float.NaN;

        /* renamed from: b */
        public float f19869b = Float.NaN;

        /* renamed from: c */
        public int f19870c = -1;

        /* renamed from: d */
        public int f19871d = -1;

        public b() {
            d.this = r1;
        }

        public final void a() {
            int a10;
            EnumC0144d enumC0144d = EnumC0144d.SETUP;
            int i10 = this.f19870c;
            if (i10 != -1 || this.f19871d != -1) {
                if (i10 == -1) {
                    d.this.x(this.f19871d);
                } else {
                    int i11 = this.f19871d;
                    if (i11 == -1) {
                        d dVar = d.this;
                        dVar.setState(enumC0144d);
                        dVar.M = i10;
                        dVar.L = -1;
                        dVar.N = -1;
                        x.b bVar = dVar.C;
                        if (bVar != null) {
                            float f10 = -1;
                            int i12 = bVar.f19974b;
                            if (i12 == i10) {
                                b.a valueAt = i10 == -1 ? bVar.f19976d.valueAt(0) : bVar.f19976d.get(i12);
                                int i13 = bVar.f19975c;
                                if ((i13 == -1 || !valueAt.f19979b.get(i13).a(f10, f10)) && bVar.f19975c != (a10 = valueAt.a(f10, f10))) {
                                    androidx.constraintlayout.widget.b bVar2 = a10 == -1 ? null : valueAt.f19979b.get(a10).f19987f;
                                    if (a10 != -1) {
                                        int i14 = valueAt.f19979b.get(a10).f19986e;
                                    }
                                    if (bVar2 != null) {
                                        bVar.f19975c = a10;
                                        bVar2.a(bVar.f19973a);
                                    }
                                }
                            } else {
                                bVar.f19974b = i10;
                                b.a aVar = bVar.f19976d.get(i10);
                                int a11 = aVar.a(f10, f10);
                                androidx.constraintlayout.widget.b bVar3 = a11 == -1 ? aVar.f19981d : aVar.f19979b.get(a11).f19987f;
                                if (a11 != -1) {
                                    int i15 = aVar.f19979b.get(a11).f19986e;
                                }
                                if (bVar3 == null) {
                                    Log.v("ConstraintLayoutStates", "NO Constraint set found ! id=" + i10 + ", dim =" + f10 + ", " + f10);
                                } else {
                                    bVar.f19975c = a11;
                                    bVar3.a(bVar.f19973a);
                                }
                            }
                        }
                    } else {
                        d.this.w(i10, i11);
                    }
                }
                d.this.setState(enumC0144d);
            }
            if (Float.isNaN(this.f19869b)) {
                if (Float.isNaN(this.f19868a)) {
                    return;
                }
                d.this.setProgress(this.f19868a);
                return;
            }
            d.this.v(this.f19868a, this.f19869b);
            this.f19868a = Float.NaN;
            this.f19869b = Float.NaN;
            this.f19870c = -1;
            this.f19871d = -1;
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void a();

        void b();
    }

    /* renamed from: w.d$d */
    /* loaded from: classes.dex */
    public enum EnumC0144d {
        /* JADX INFO: Fake field, exist only in values array */
        UNDEFINED,
        SETUP,
        MOVING,
        FINISHED
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        s();
        super.dispatchDraw(canvas);
    }

    public int[] getConstraintSetIds() {
        return null;
    }

    public int getCurrentState() {
        return this.M;
    }

    public ArrayList<e.a> getDefinedTransitions() {
        return null;
    }

    public w.b getDesignTool() {
        if (this.T == null) {
            this.T = new w.b();
        }
        return this.T;
    }

    public int getEndState() {
        return this.N;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.P;
    }

    public e getScene() {
        return null;
    }

    public int getStartState() {
        return this.L;
    }

    public float getTargetPosition() {
        return this.R;
    }

    public Bundle getTransitionState() {
        if (this.f19864e0 == null) {
            this.f19864e0 = new b();
        }
        b bVar = this.f19864e0;
        d dVar = d.this;
        bVar.f19871d = dVar.N;
        bVar.f19870c = dVar.L;
        bVar.f19869b = dVar.getVelocity();
        bVar.f19868a = d.this.getProgress();
        b bVar2 = this.f19864e0;
        Objects.requireNonNull(bVar2);
        Bundle bundle = new Bundle();
        bundle.putFloat("motion.progress", bVar2.f19868a);
        bundle.putFloat("motion.velocity", bVar2.f19869b);
        bundle.putInt("motion.StartState", bVar2.f19870c);
        bundle.putInt("motion.EndState", bVar2.f19871d);
        return bundle;
    }

    public long getTransitionTimeMs() {
        return 0.0f;
    }

    public float getVelocity() {
        return this.K;
    }

    @Override // m0.n
    public final void h(View view, View view2, int i10, int i11) {
        getNanoTime();
    }

    @Override // m0.n
    public final void i(View view, int i10) {
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return super.isAttachedToWindow();
    }

    @Override // m0.n
    public final void j(View view, int i10, int i11, int[] iArr, int i12) {
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public final void k(int i10) {
        this.C = null;
    }

    @Override // m0.o
    public final void m(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (i10 == 0 && i11 == 0) {
            return;
        }
        iArr[0] = iArr[0] + i12;
        iArr[1] = iArr[1] + i13;
    }

    @Override // m0.n
    public final void n(View view, int i10, int i11, int i12, int i13, int i14) {
    }

    @Override // m0.n
    public final boolean o(View view, View view2, int i10, int i11) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            display.getRotation();
        }
        b bVar = this.f19864e0;
        if (bVar != null) {
            if (this.f19865f0) {
                post(new a());
            } else {
                bVar.a();
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f19863d0 = true;
        try {
            super.onLayout(z10, i10, i11, i12, i13);
        } finally {
            this.f19863d0 = false;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i10) {
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof w.c) {
            w.c cVar = (w.c) view;
            if (this.f19860a0 == null) {
                this.f19860a0 = new CopyOnWriteArrayList<>();
            }
            this.f19860a0.add(cVar);
            if (cVar.A) {
                if (this.V == null) {
                    this.V = new ArrayList<>();
                }
                this.V.add(cVar);
            }
            if (!cVar.B) {
                return;
            }
            if (this.W == null) {
                this.W = new ArrayList<>();
            }
            this.W.add(cVar);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<w.c> arrayList = this.V;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<w.c> arrayList2 = this.W;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        int i10 = this.M;
        super.requestLayout();
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x0102, code lost:
        if (r1 != r2) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x010d, code lost:
        if (r1 != r2) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0110, code lost:
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0111, code lost:
        r17.M = r2;
        r8 = r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s() {
        /*
            Method dump skipped, instructions count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w.d.s():void");
    }

    public void setDebugMode(int i10) {
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z10) {
        this.f19865f0 = z10;
    }

    public void setInteractionEnabled(boolean z10) {
    }

    public void setInterpolatedProgress(float f10) {
        setProgress(f10);
    }

    public void setOnHide(float f10) {
        ArrayList<w.c> arrayList = this.W;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.W.get(i10).setProgress(f10);
            }
        }
    }

    public void setOnShow(float f10) {
        ArrayList<w.c> arrayList = this.V;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.V.get(i10).setProgress(f10);
            }
        }
    }

    public void setProgress(float f10) {
        EnumC0144d enumC0144d = EnumC0144d.FINISHED;
        EnumC0144d enumC0144d2 = EnumC0144d.MOVING;
        int i10 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        if (i10 < 0 || f10 > 1.0f) {
            Log.w("MotionLayout", "Warning! Progress is defined for values between 0.0 and 1.0 inclusive");
        }
        if (!super.isAttachedToWindow()) {
            if (this.f19864e0 == null) {
                this.f19864e0 = new b();
            }
            this.f19864e0.f19868a = f10;
            return;
        }
        if (i10 <= 0) {
            if (this.P == 1.0f && this.M == this.N) {
                setState(enumC0144d2);
            }
            this.M = this.L;
            if (this.P != 0.0f) {
                return;
            }
        } else if (f10 < 1.0f) {
            this.M = -1;
            setState(enumC0144d2);
            return;
        } else {
            if (this.P == 0.0f && this.M == this.L) {
                setState(enumC0144d2);
            }
            this.M = this.N;
            if (this.P != 1.0f) {
                return;
            }
        }
        setState(enumC0144d);
    }

    public void setScene(e eVar) {
        g();
        throw null;
    }

    public void setStartState(int i10) {
        if (!super.isAttachedToWindow()) {
            if (this.f19864e0 == null) {
                this.f19864e0 = new b();
            }
            b bVar = this.f19864e0;
            bVar.f19870c = i10;
            bVar.f19871d = i10;
            return;
        }
        this.M = i10;
    }

    public void setState(EnumC0144d enumC0144d) {
        EnumC0144d enumC0144d2 = EnumC0144d.FINISHED;
        if (enumC0144d == enumC0144d2 && this.M == -1) {
            return;
        }
        EnumC0144d enumC0144d3 = this.f19866g0;
        this.f19866g0 = enumC0144d;
        EnumC0144d enumC0144d4 = EnumC0144d.MOVING;
        if (enumC0144d3 == enumC0144d4 && enumC0144d == enumC0144d4) {
            t();
        }
        int ordinal = enumC0144d3.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            if (enumC0144d == enumC0144d4) {
                t();
            }
            if (enumC0144d != enumC0144d2) {
                return;
            }
        } else if (ordinal != 2 || enumC0144d != enumC0144d2) {
            return;
        }
        u();
    }

    public void setTransition(int i10) {
    }

    public void setTransition(e.a aVar) {
        throw null;
    }

    public void setTransitionDuration(int i10) {
        Log.e("MotionLayout", "MotionScene not defined");
    }

    public void setTransitionListener(c cVar) {
        this.S = cVar;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.f19864e0 == null) {
            this.f19864e0 = new b();
        }
        b bVar = this.f19864e0;
        Objects.requireNonNull(bVar);
        bVar.f19868a = bundle.getFloat("motion.progress");
        bVar.f19869b = bundle.getFloat("motion.velocity");
        bVar.f19870c = bundle.getInt("motion.StartState");
        bVar.f19871d = bundle.getInt("motion.EndState");
        if (super.isAttachedToWindow()) {
            this.f19864e0.a();
        }
    }

    public final void t() {
        CopyOnWriteArrayList<c> copyOnWriteArrayList;
        if ((this.S != null || ((copyOnWriteArrayList = this.f19860a0) != null && !copyOnWriteArrayList.isEmpty())) && this.f19862c0 != this.O) {
            if (this.f19861b0 != -1) {
                c cVar = this.S;
                if (cVar != null) {
                    cVar.b();
                }
                CopyOnWriteArrayList<c> copyOnWriteArrayList2 = this.f19860a0;
                if (copyOnWriteArrayList2 != null) {
                    Iterator<c> it = copyOnWriteArrayList2.iterator();
                    while (it.hasNext()) {
                        it.next().b();
                    }
                }
            }
            this.f19861b0 = -1;
            this.f19862c0 = this.O;
            c cVar2 = this.S;
            if (cVar2 != null) {
                cVar2.a();
            }
            CopyOnWriteArrayList<c> copyOnWriteArrayList3 = this.f19860a0;
            if (copyOnWriteArrayList3 == null) {
                return;
            }
            Iterator<c> it2 = copyOnWriteArrayList3.iterator();
            while (it2.hasNext()) {
                it2.next().a();
            }
        }
    }

    @Override // android.view.View
    public final String toString() {
        Context context = getContext();
        return w.a.a(context, this.L) + "->" + w.a.a(context, this.N) + " (pos:" + this.P + " Dpos/Dt:" + this.K;
    }

    public final void u() {
        CopyOnWriteArrayList<c> copyOnWriteArrayList;
        CopyOnWriteArrayList<c> copyOnWriteArrayList2;
        if ((this.S == null && ((copyOnWriteArrayList2 = this.f19860a0) == null || copyOnWriteArrayList2.isEmpty())) || this.f19861b0 != -1) {
            if (this.S == null && ((copyOnWriteArrayList = this.f19860a0) == null || copyOnWriteArrayList.isEmpty())) {
                return;
            }
            throw null;
        }
        this.f19861b0 = this.M;
        throw null;
    }

    public final void v(float f10, float f11) {
        if (!super.isAttachedToWindow()) {
            if (this.f19864e0 == null) {
                this.f19864e0 = new b();
            }
            b bVar = this.f19864e0;
            bVar.f19868a = f10;
            bVar.f19869b = f11;
            return;
        }
        setProgress(f10);
        setState(EnumC0144d.MOVING);
        this.K = f11;
    }

    public final void w(int i10, int i11) {
        if (!super.isAttachedToWindow()) {
            if (this.f19864e0 == null) {
                this.f19864e0 = new b();
            }
            b bVar = this.f19864e0;
            bVar.f19870c = i10;
            bVar.f19871d = i11;
        }
    }

    public final void x(int i10) {
        if (!super.isAttachedToWindow()) {
            if (this.f19864e0 == null) {
                this.f19864e0 = new b();
            }
            this.f19864e0.f19871d = i10;
            return;
        }
        int i11 = this.M;
        if (i11 == i10 || this.L == i10 || this.N == i10) {
            return;
        }
        this.N = i10;
        if (i11 != -1) {
            w(i11, i10);
            this.P = 0.0f;
            return;
        }
        this.R = 1.0f;
        this.O = 0.0f;
        this.P = 0.0f;
        this.Q = getNanoTime();
        getNanoTime();
        throw null;
    }
}
