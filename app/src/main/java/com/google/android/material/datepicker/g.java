package com.google.android.material.datepicker;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.raouf.routerchef.R;
import java.util.Calendar;
import java.util.Locale;

/* loaded from: classes.dex */
public final class g extends BaseAdapter {

    /* renamed from: v */
    public static final int f3179v;

    /* renamed from: s */
    public final Calendar f3180s;

    /* renamed from: t */
    public final int f3181t;

    /* renamed from: u */
    public final int f3182u;

    static {
        f3179v = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public g() {
        Calendar e10 = d0.e(null);
        this.f3180s = e10;
        this.f3181t = e10.getMaximum(7);
        this.f3182u = e10.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f3181t;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i10) {
        int i11 = this.f3181t;
        if (i10 >= i11) {
            return null;
        }
        int i12 = i10 + this.f3182u;
        if (i12 > i11) {
            i12 -= i11;
        }
        return Integer.valueOf(i12);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        return 0L;
    }

    @Override // android.widget.Adapter
    @SuppressLint({"WrongConstant"})
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        Calendar calendar = this.f3180s;
        int i11 = i10 + this.f3182u;
        int i12 = this.f3181t;
        if (i11 > i12) {
            i11 -= i12;
        }
        calendar.set(7, i11);
        textView.setText(this.f3180s.getDisplayName(7, f3179v, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), this.f3180s.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }
}
