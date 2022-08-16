package m4;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import j0.d;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes.dex */
public abstract class t7 implements s7 {
    public static volatile n8 L;
    public double B;
    public double C;
    public double D;
    public float E;
    public float F;
    public float G;
    public float H;
    public DisplayMetrics K;

    /* renamed from: s */
    public MotionEvent f13934s;

    /* renamed from: t */
    public final LinkedList<MotionEvent> f13935t = new LinkedList<>();

    /* renamed from: u */
    public long f13936u = 0;

    /* renamed from: v */
    public long f13937v = 0;

    /* renamed from: w */
    public long f13938w = 0;

    /* renamed from: x */
    public long f13939x = 0;
    public long y = 0;

    /* renamed from: z */
    public long f13940z = 0;
    public long A = 0;
    public boolean I = false;
    public boolean J = false;

    public t7(Context context) {
        try {
            if (((Boolean) jo.f10145d.f10148c.a(es.M1)).booleanValue()) {
                b7.b();
            } else {
                d.i(L);
            }
            this.K = context.getResources().getDisplayMetrics();
        } catch (Throwable unused) {
        }
    }

    @Override // m4.s7
    public final synchronized void a(MotionEvent motionEvent) {
        Long l10;
        if (this.I) {
            j();
            this.I = false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.B = 0.0d;
            this.C = motionEvent.getRawX();
            this.D = motionEvent.getRawY();
        } else if (action == 1 || action == 2) {
            double rawX = motionEvent.getRawX();
            double rawY = motionEvent.getRawY();
            double d5 = rawX - this.C;
            double d10 = rawY - this.D;
            this.B += Math.sqrt((d10 * d10) + (d5 * d5));
            this.C = rawX;
            this.D = rawY;
        }
        int action2 = motionEvent.getAction();
        if (action2 != 0) {
            try {
                if (action2 == 1) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    this.f13934s = obtain;
                    this.f13935t.add(obtain);
                    if (this.f13935t.size() > 6) {
                        this.f13935t.remove().recycle();
                    }
                    this.f13938w++;
                    this.y = h(new Throwable().getStackTrace());
                } else if (action2 == 2) {
                    this.f13937v += motionEvent.getHistorySize() + 1;
                    o8 i10 = i(motionEvent);
                    Long l11 = i10.f12030d;
                    if (l11 != null && i10.f12033g != null) {
                        this.f13940z = l11.longValue() + i10.f12033g.longValue() + this.f13940z;
                    }
                    if (this.K != null && (l10 = i10.f12031e) != null && i10.f12034h != null) {
                        this.A = l10.longValue() + i10.f12034h.longValue() + this.A;
                    }
                } else if (action2 == 3) {
                    this.f13939x++;
                }
            } catch (e8 unused) {
            }
        } else {
            this.E = motionEvent.getX();
            this.F = motionEvent.getY();
            this.G = motionEvent.getRawX();
            this.H = motionEvent.getRawY();
            this.f13936u++;
        }
        this.J = true;
    }

    @Override // m4.s7
    public final String c(Context context) {
        char[] cArr = p8.f12428a;
        if (!(Looper.myLooper() == Looper.getMainLooper())) {
            return k(context, null, 1, null, null);
        }
        throw new IllegalStateException("The caller must not be called from the UI thread.");
    }

    @Override // m4.s7
    public final synchronized void d(int i10, int i11, int i12) {
        if (this.f13934s != null) {
            if (((Boolean) jo.f10145d.f10148c.a(es.A1)).booleanValue()) {
                j();
            } else {
                this.f13934s.recycle();
            }
        }
        DisplayMetrics displayMetrics = this.K;
        if (displayMetrics != null) {
            float f10 = displayMetrics.density;
            this.f13934s = MotionEvent.obtain(0L, i12, 1, i10 * f10, i11 * f10, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        } else {
            this.f13934s = null;
        }
        this.J = false;
    }

    @Override // m4.s7
    public final String e(Context context, View view) {
        return k(context, null, 2, view, null);
    }

    @Override // m4.s7
    public final String f(Context context, String str, View view) {
        return k(context, str, 3, view, null);
    }

    @Override // m4.s7
    public final String g(Context context, String str, View view, Activity activity) {
        return k(context, str, 3, view, activity);
    }

    public abstract long h(StackTraceElement[] stackTraceElementArr);

    public abstract o8 i(MotionEvent motionEvent);

    public final void j() {
        this.y = 0L;
        this.f13936u = 0L;
        this.f13937v = 0L;
        this.f13938w = 0L;
        this.f13939x = 0L;
        this.f13940z = 0L;
        this.A = 0L;
        if (this.f13935t.size() > 0) {
            Iterator<MotionEvent> it = this.f13935t.iterator();
            while (it.hasNext()) {
                it.next().recycle();
            }
            this.f13935t.clear();
        } else {
            MotionEvent motionEvent = this.f13934s;
            if (motionEvent != null) {
                motionEvent.recycle();
            }
        }
        this.f13934s = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:92:0x0110 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String k(android.content.Context r23, java.lang.String r24, int r25, android.view.View r26, android.app.Activity r27) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.t7.k(android.content.Context, java.lang.String, int, android.view.View, android.app.Activity):java.lang.String");
    }
}
