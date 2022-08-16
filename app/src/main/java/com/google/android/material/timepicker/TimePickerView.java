package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.b;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import com.raouf.routerchef.R;
import java.util.Objects;
import java.util.WeakHashMap;
import m0.f0;
import m0.z;

/* loaded from: classes.dex */
public class TimePickerView extends ConstraintLayout {
    public static final /* synthetic */ int M = 0;
    public final MaterialButtonToggleGroup K;
    public final a L;

    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
            TimePickerView.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            TimePickerView timePickerView = TimePickerView.this;
            int i10 = TimePickerView.M;
            Objects.requireNonNull(timePickerView);
        }
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a aVar = new a();
        this.L = aVar;
        LayoutInflater.from(context).inflate(R.layout.material_timepicker, this);
        ClockFaceView clockFaceView = (ClockFaceView) findViewById(R.id.material_clock_face);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(R.id.material_clock_period_toggle);
        this.K = materialButtonToggleGroup;
        materialButtonToggleGroup.f3090u.add(new d(this));
        Chip chip = (Chip) findViewById(R.id.material_minute_tv);
        Chip chip2 = (Chip) findViewById(R.id.material_hour_tv);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        f fVar = new f(new GestureDetector(getContext(), new e(this)));
        chip.setOnTouchListener(fVar);
        chip2.setOnTouchListener(fVar);
        chip.setTag(R.id.selection_type, 12);
        chip2.setTag(R.id.selection_type, 10);
        chip.setOnClickListener(aVar);
        chip2.setOnClickListener(aVar);
        chip.setAccessibilityClassName("android.view.View");
        chip2.setAccessibilityClassName("android.view.View");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        s();
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (view == this && i10 == 0) {
            s();
        }
    }

    public final void s() {
        b.a aVar;
        if (this.K.getVisibility() == 0) {
            b bVar = new b();
            bVar.c(this);
            WeakHashMap<View, f0> weakHashMap = z.f5921a;
            char c10 = 1;
            if (z.e.d(this) == 0) {
                c10 = 2;
            }
            if (bVar.f1133c.containsKey(Integer.valueOf((int) R.id.material_clock_display)) && (aVar = bVar.f1133c.get(Integer.valueOf((int) R.id.material_clock_display))) != null) {
                switch (c10) {
                    case 1:
                        b.C0011b c0011b = aVar.f1137d;
                        c0011b.f1169i = -1;
                        c0011b.f1167h = -1;
                        c0011b.F = -1;
                        c0011b.M = Integer.MIN_VALUE;
                        break;
                    case 2:
                        b.C0011b c0011b2 = aVar.f1137d;
                        c0011b2.f1173k = -1;
                        c0011b2.f1171j = -1;
                        c0011b2.G = -1;
                        c0011b2.O = Integer.MIN_VALUE;
                        break;
                    case 3:
                        b.C0011b c0011b3 = aVar.f1137d;
                        c0011b3.f1177m = -1;
                        c0011b3.f1175l = -1;
                        c0011b3.H = 0;
                        c0011b3.N = Integer.MIN_VALUE;
                        break;
                    case 4:
                        b.C0011b c0011b4 = aVar.f1137d;
                        c0011b4.f1179n = -1;
                        c0011b4.f1181o = -1;
                        c0011b4.I = 0;
                        c0011b4.P = Integer.MIN_VALUE;
                        break;
                    case 5:
                        b.C0011b c0011b5 = aVar.f1137d;
                        c0011b5.p = -1;
                        c0011b5.f1183q = -1;
                        c0011b5.f1184r = -1;
                        c0011b5.L = 0;
                        c0011b5.S = Integer.MIN_VALUE;
                        break;
                    case 6:
                        b.C0011b c0011b6 = aVar.f1137d;
                        c0011b6.f1185s = -1;
                        c0011b6.f1186t = -1;
                        c0011b6.K = 0;
                        c0011b6.R = Integer.MIN_VALUE;
                        break;
                    case 7:
                        b.C0011b c0011b7 = aVar.f1137d;
                        c0011b7.f1187u = -1;
                        c0011b7.f1188v = -1;
                        c0011b7.J = 0;
                        c0011b7.Q = Integer.MIN_VALUE;
                        break;
                    case '\b':
                        b.C0011b c0011b8 = aVar.f1137d;
                        c0011b8.B = -1.0f;
                        c0011b8.A = -1;
                        c0011b8.f1191z = -1;
                        break;
                    default:
                        throw new IllegalArgumentException("unknown constraint");
                }
            }
            bVar.a(this);
        }
    }
}
