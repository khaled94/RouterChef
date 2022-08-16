package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.raouf.routerchef.R;
import java.util.Calendar;
import java.util.Iterator;
import l0.c;
import m0.z;
import u5.s;

/* loaded from: classes.dex */
public final class MaterialCalendarGridView extends GridView {

    /* renamed from: s */
    public final Calendar f3142s = d0.e(null);

    /* renamed from: t */
    public final boolean f3143t;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        if (p.j0(getContext())) {
            setNextFocusLeftId(R.id.cancel_button);
            setNextFocusRightId(R.id.confirm_button);
        }
        this.f3143t = p.k0(getContext(), R.attr.nestedScrollable);
        z.p(this, new o());
    }

    /* renamed from: a */
    public final v getAdapter2() {
        return (v) super.getAdapter();
    }

    public final View b(int i10) {
        return getChildAt(i10 - getFirstVisiblePosition());
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter2().notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        v adapter2 = getAdapter2();
        d<?> dVar = adapter2.f3226t;
        c cVar = adapter2.f3228v;
        int max = Math.max(adapter2.c(), getFirstVisiblePosition());
        int min = Math.min(adapter2.e(), getLastVisiblePosition());
        Long item = adapter2.getItem(max);
        Long item2 = adapter2.getItem(min);
        Iterator<c<Long, Long>> it = dVar.h().iterator();
        while (it.hasNext()) {
            c<Long, Long> next = it.next();
            Long l10 = next.f5709a;
            if (l10 == null) {
                materialCalendarGridView = this;
            } else if (next.f5710b != null) {
                long longValue = l10.longValue();
                long longValue2 = next.f5710b.longValue();
                Long valueOf = Long.valueOf(longValue);
                Long valueOf2 = Long.valueOf(longValue2);
                if (!(item == null || item2 == null || valueOf == null || valueOf2 == null || valueOf.longValue() > item2.longValue() || valueOf2.longValue() < item.longValue())) {
                    boolean a10 = s.a(this);
                    if (longValue < item.longValue()) {
                        if (max % adapter2.f3225s.f3221v == 0) {
                            i17 = 0;
                        } else {
                            View b10 = materialCalendarGridView.b(max - 1);
                            i17 = !a10 ? b10.getRight() : b10.getLeft();
                        }
                        i10 = i17;
                        i11 = max;
                    } else {
                        materialCalendarGridView.f3142s.setTimeInMillis(longValue);
                        i11 = adapter2.b(materialCalendarGridView.f3142s.get(5));
                        View b11 = materialCalendarGridView.b(i11);
                        i10 = (b11.getWidth() / 2) + b11.getLeft();
                    }
                    if (longValue2 > item2.longValue()) {
                        if ((min + 1) % adapter2.f3225s.f3221v == 0) {
                            i16 = getWidth();
                        } else {
                            View b12 = materialCalendarGridView.b(min);
                            i16 = !a10 ? b12.getRight() : b12.getLeft();
                        }
                        i12 = i16;
                        i13 = min;
                    } else {
                        materialCalendarGridView.f3142s.setTimeInMillis(longValue2);
                        i13 = adapter2.b(materialCalendarGridView.f3142s.get(5));
                        View b13 = materialCalendarGridView.b(i13);
                        i12 = (b13.getWidth() / 2) + b13.getLeft();
                    }
                    int itemId = (int) adapter2.getItemId(i11);
                    int i18 = max;
                    int i19 = min;
                    int itemId2 = (int) adapter2.getItemId(i13);
                    while (itemId <= itemId2) {
                        int numColumns = getNumColumns() * itemId;
                        v vVar = adapter2;
                        int numColumns2 = (getNumColumns() + numColumns) - 1;
                        View b14 = materialCalendarGridView.b(numColumns);
                        int top = b14.getTop() + cVar.f3162a.f3156a.top;
                        int bottom = b14.getBottom() - cVar.f3162a.f3156a.bottom;
                        if (!a10) {
                            i14 = numColumns > i11 ? 0 : i10;
                            i15 = i13 > numColumns2 ? getWidth() : i12;
                        } else {
                            int i20 = i13 > numColumns2 ? 0 : i12;
                            int width = numColumns > i11 ? getWidth() : i10;
                            i14 = i20;
                            i15 = width;
                        }
                        canvas.drawRect(i14, top, i15, bottom, cVar.f3169h);
                        itemId++;
                        materialCalendarGridView = this;
                        it = it;
                        adapter2 = vVar;
                    }
                    materialCalendarGridView = this;
                    max = i18;
                    min = i19;
                }
            }
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        int i11;
        if (!z10) {
            super.onFocusChanged(false, i10, rect);
            return;
        }
        if (i10 == 33) {
            i11 = getAdapter2().e();
        } else if (i10 != 130) {
            super.onFocusChanged(true, i10, rect);
            return;
        } else {
            i11 = getAdapter2().c();
        }
        setSelection(i11);
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (!super.onKeyDown(i10, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter2().c()) {
            return true;
        }
        if (19 != i10) {
            return false;
        }
        setSelection(getAdapter2().c());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (!this.f3143t) {
            super.onMeasure(i10, i11);
            return;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.GridView, android.widget.AbsListView
    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof v) {
            super.setAdapter(listAdapter);
            return;
        }
        throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), v.class.getCanonicalName()));
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i10) {
        if (i10 < getAdapter2().c()) {
            i10 = getAdapter2().c();
        }
        super.setSelection(i10);
    }
}
