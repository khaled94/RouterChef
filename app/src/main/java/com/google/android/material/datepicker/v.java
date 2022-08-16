package com.google.android.material.datepicker;

import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class v extends BaseAdapter {

    /* renamed from: x */
    public static final int f3224x = d0.e(null).getMaximum(4);

    /* renamed from: s */
    public final u f3225s;

    /* renamed from: t */
    public final d<?> f3226t;

    /* renamed from: u */
    public Collection<Long> f3227u;

    /* renamed from: v */
    public c f3228v;

    /* renamed from: w */
    public final a f3229w;

    public v(u uVar, d<?> dVar, a aVar) {
        this.f3225s = uVar;
        this.f3226t = dVar;
        this.f3229w = aVar;
        this.f3227u = dVar.l();
    }

    public final int b(int i10) {
        return c() + (i10 - 1);
    }

    public final int c() {
        return this.f3225s.m();
    }

    /* renamed from: d */
    public final Long getItem(int i10) {
        if (i10 < this.f3225s.m() || i10 > e()) {
            return null;
        }
        u uVar = this.f3225s;
        Calendar b10 = d0.b(uVar.f3218s);
        b10.set(5, (i10 - uVar.m()) + 1);
        return Long.valueOf(b10.getTimeInMillis());
    }

    public final int e() {
        return (this.f3225s.m() + this.f3225s.f3222w) - 1;
    }

    public final void f(TextView textView, long j3) {
        b bVar;
        if (textView == null) {
            return;
        }
        boolean z10 = false;
        if (this.f3229w.f3146u.i(j3)) {
            textView.setEnabled(true);
            Iterator<Long> it = this.f3226t.l().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (d0.a(j3) == d0.a(it.next().longValue())) {
                    z10 = true;
                    break;
                }
            }
            if (z10) {
                bVar = this.f3228v.f3163b;
            } else {
                bVar = d0.d().getTimeInMillis() == j3 ? this.f3228v.f3164c : this.f3228v.f3162a;
            }
        } else {
            textView.setEnabled(false);
            bVar = this.f3228v.f3168g;
        }
        bVar.b(textView);
    }

    public final void g(MaterialCalendarGridView materialCalendarGridView, long j3) {
        if (u.j(j3).equals(this.f3225s)) {
            Calendar b10 = d0.b(this.f3225s.f3218s);
            b10.setTimeInMillis(j3);
            f((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter2().b(b10.get(5)) - materialCalendarGridView.getFirstVisiblePosition()), j3);
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return c() + this.f3225s.f3222w;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        return i10 / this.f3225s.f3221v;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00ab  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View getView(int r9, android.view.View r10, android.view.ViewGroup r11) {
        /*
            r8 = this;
            android.content.Context r0 = r11.getContext()
            com.google.android.material.datepicker.c r1 = r8.f3228v
            if (r1 != 0) goto Lf
            com.google.android.material.datepicker.c r1 = new com.google.android.material.datepicker.c
            r1.<init>(r0)
            r8.f3228v = r1
        Lf:
            r0 = r10
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r10 != 0) goto L27
            android.content.Context r10 = r11.getContext()
            android.view.LayoutInflater r10 = android.view.LayoutInflater.from(r10)
            r0 = 2131558513(0x7f0d0071, float:1.8742344E38)
            android.view.View r10 = r10.inflate(r0, r11, r1)
            r0 = r10
            android.widget.TextView r0 = (android.widget.TextView) r0
        L27:
            int r10 = r8.c()
            int r10 = r9 - r10
            if (r10 < 0) goto L9c
            com.google.android.material.datepicker.u r11 = r8.f3225s
            int r2 = r11.f3222w
            if (r10 < r2) goto L36
            goto L9c
        L36:
            r2 = 1
            int r10 = r10 + r2
            r0.setTag(r11)
            android.content.res.Resources r11 = r0.getResources()
            android.content.res.Configuration r11 = r11.getConfiguration()
            java.util.Locale r11 = r11.locale
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
            r3[r1] = r4
            java.lang.String r4 = "%d"
            java.lang.String r11 = java.lang.String.format(r11, r4, r3)
            r0.setText(r11)
            com.google.android.material.datepicker.u r11 = r8.f3225s
            java.util.Calendar r11 = r11.f3218s
            java.util.Calendar r11 = com.google.android.material.datepicker.d0.b(r11)
            r3 = 5
            r11.set(r3, r10)
            long r10 = r11.getTimeInMillis()
            com.google.android.material.datepicker.u r4 = r8.f3225s
            int r4 = r4.f3220u
            java.util.Calendar r5 = com.google.android.material.datepicker.d0.d()
            r5.set(r3, r2)
            java.util.Calendar r5 = com.google.android.material.datepicker.d0.b(r5)
            r6 = 2
            r5.get(r6)
            int r6 = r5.get(r2)
            r7 = 7
            r5.getMaximum(r7)
            r5.getActualMaximum(r3)
            r5.getTimeInMillis()
            if (r4 != r6) goto L8e
            java.lang.String r10 = com.google.android.material.datepicker.e.a(r10)
            goto L92
        L8e:
            java.lang.String r10 = com.google.android.material.datepicker.e.b(r10)
        L92:
            r0.setContentDescription(r10)
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto La4
        L9c:
            r10 = 8
            r0.setVisibility(r10)
            r0.setEnabled(r1)
        La4:
            java.lang.Long r9 = r8.getItem(r9)
            if (r9 != 0) goto Lab
            goto Lb2
        Lab:
            long r9 = r9.longValue()
            r8.f(r0, r9)
        Lb2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.v.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
