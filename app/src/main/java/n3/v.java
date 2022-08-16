package n3;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.PointF;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import h2.d0;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import l3.s;
import m4.es;
import m4.jo;
import m4.t21;
import m4.vt1;
import m4.x21;
import s.b;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a */
    public final Context f16577a;

    /* renamed from: b */
    public final x21 f16578b;

    /* renamed from: c */
    public String f16579c;

    /* renamed from: d */
    public String f16580d;

    /* renamed from: e */
    public String f16581e;

    /* renamed from: f */
    public String f16582f;

    /* renamed from: h */
    public int f16584h;

    /* renamed from: i */
    public PointF f16585i;

    /* renamed from: j */
    public PointF f16586j;

    /* renamed from: k */
    public vt1 f16587k;

    /* renamed from: g */
    public int f16583g = 0;

    /* renamed from: l */
    public d0 f16588l = new d0(this, 1);

    public v(Context context) {
        this.f16577a = context;
        this.f16584h = ViewConfiguration.get(context).getScaledTouchSlop();
        s sVar = s.B;
        sVar.f5802q.a();
        this.f16587k = sVar.f5802q.f16568b;
        this.f16578b = sVar.f5799m.f16443g;
    }

    public static final int e(List<String> list, String str, boolean z10) {
        if (!z10) {
            return -1;
        }
        list.add(str);
        return list.size() - 1;
    }

    public final void a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int historySize = motionEvent.getHistorySize();
        int pointerCount = motionEvent.getPointerCount();
        if (actionMasked == 0) {
            this.f16583g = 0;
            this.f16585i = new PointF(motionEvent.getX(0), motionEvent.getY(0));
            return;
        }
        int i10 = this.f16583g;
        if (i10 == -1) {
            return;
        }
        if (i10 == 0) {
            if (actionMasked != 5) {
                return;
            }
            this.f16583g = 5;
            this.f16586j = new PointF(motionEvent.getX(1), motionEvent.getY(1));
            this.f16587k.postDelayed(this.f16588l, ((Long) jo.f10145d.f10148c.a(es.O2)).longValue());
        } else if (i10 == 5) {
            if (pointerCount == 2) {
                if (actionMasked != 2) {
                    return;
                }
                boolean z10 = false;
                for (int i11 = 0; i11 < historySize; i11++) {
                    z10 |= !d(motionEvent.getHistoricalX(0, i11), motionEvent.getHistoricalY(0, i11), motionEvent.getHistoricalX(1, i11), motionEvent.getHistoricalY(1, i11));
                }
                if (d(motionEvent.getX(), motionEvent.getY(), motionEvent.getX(1), motionEvent.getY(1)) && !z10) {
                    return;
                }
            }
            this.f16583g = -1;
            this.f16587k.removeCallbacks(this.f16588l);
        }
    }

    public final void b() {
        String str;
        try {
            if (!(this.f16577a instanceof Activity)) {
                g1.i("Can not create dialog without Activity Context");
                return;
            }
            s sVar = s.B;
            a0 a0Var = sVar.f5799m;
            synchronized (a0Var.f16437a) {
                str = a0Var.f16439c;
            }
            String str2 = "Creative preview (enabled)";
            if (true == TextUtils.isEmpty(str)) {
                str2 = "Creative preview";
            }
            String str3 = "Troubleshooting (enabled)";
            if (true != sVar.f5799m.h()) {
                str3 = "Troubleshooting";
            }
            ArrayList arrayList = new ArrayList();
            final int e10 = e(arrayList, "Ad information", true);
            final int e11 = e(arrayList, str2, true);
            final int e12 = e(arrayList, str3, true);
            boolean booleanValue = ((Boolean) jo.f10145d.f10148c.a(es.f8109h6)).booleanValue();
            final int e13 = e(arrayList, "Open ad inspector", booleanValue);
            final int e14 = e(arrayList, "Ad inspector settings", booleanValue);
            Context context = this.f16577a;
            Objects.requireNonNull(sVar.f5791e);
            AlertDialog.Builder builder = new AlertDialog.Builder(context, 16974374);
            builder.setTitle("Select a debug mode").setItems((CharSequence[]) arrayList.toArray(new String[0]), new DialogInterface.OnClickListener() { // from class: n3.n
                @Override // android.content.DialogInterface.OnClickListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void onClick(android.content.DialogInterface r6, int r7) {
                    /*
                        Method dump skipped, instructions count: 266
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: n3.n.onClick(android.content.DialogInterface, int):void");
                }
            });
            builder.create().show();
        } catch (WindowManager.BadTokenException e15) {
            g1.b("", e15);
        }
    }

    public final void c(Context context) {
        ArrayList arrayList = new ArrayList();
        int e10 = e(arrayList, "None", true);
        final int e11 = e(arrayList, "Shake", true);
        final int e12 = e(arrayList, "Flick", true);
        int ordinal = this.f16578b.f15203k.ordinal();
        final int i10 = ordinal != 1 ? ordinal != 2 ? e10 : e12 : e11;
        Objects.requireNonNull(s.B.f5791e);
        AlertDialog.Builder builder = new AlertDialog.Builder(context, 16974374);
        final AtomicInteger atomicInteger = new AtomicInteger(i10);
        builder.setTitle("Setup gesture");
        builder.setSingleChoiceItems((CharSequence[]) arrayList.toArray(new String[0]), i10, new DialogInterface.OnClickListener() { // from class: n3.q
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                atomicInteger.set(i11);
            }
        });
        builder.setNegativeButton("Dismiss", new DialogInterface.OnClickListener() { // from class: n3.m
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                v.this.b();
            }
        });
        builder.setPositiveButton("Save", new DialogInterface.OnClickListener() { // from class: n3.p
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                x21 x21Var;
                t21 t21Var;
                v vVar = v.this;
                AtomicInteger atomicInteger2 = atomicInteger;
                int i12 = i10;
                int i13 = e11;
                int i14 = e12;
                Objects.requireNonNull(vVar);
                if (atomicInteger2.get() != i12) {
                    if (atomicInteger2.get() == i13) {
                        x21Var = vVar.f16578b;
                        t21Var = t21.SHAKE;
                    } else if (atomicInteger2.get() == i14) {
                        x21Var = vVar.f16578b;
                        t21Var = t21.FLICK;
                    } else {
                        x21Var = vVar.f16578b;
                        t21Var = t21.NONE;
                    }
                    x21Var.h(t21Var, true);
                }
                vVar.b();
            }
        });
        builder.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: n3.g
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                v.this.b();
            }
        });
        builder.create().show();
    }

    public final boolean d(float f10, float f11, float f12, float f13) {
        return Math.abs(this.f16585i.x - f10) < ((float) this.f16584h) && Math.abs(this.f16585i.y - f11) < ((float) this.f16584h) && Math.abs(this.f16586j.x - f12) < ((float) this.f16584h) && Math.abs(this.f16586j.y - f13) < ((float) this.f16584h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append("{Dialog: ");
        sb.append(this.f16579c);
        sb.append(",DebugSignal: ");
        sb.append(this.f16582f);
        sb.append(",AFMA Version: ");
        sb.append(this.f16581e);
        sb.append(",Ad Unit ID: ");
        return b.b(sb, this.f16580d, "}");
    }
}
