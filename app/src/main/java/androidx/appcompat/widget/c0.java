package androidx.appcompat.widget;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.d;
import java.util.Objects;
import java.util.WeakHashMap;
import m0.f0;
import m0.z;

/* loaded from: classes.dex */
public final class c0 extends Spinner {
    public static final int[] A = {16843505};

    /* renamed from: t */
    public final Context f795t;

    /* renamed from: u */
    public b0 f796u;

    /* renamed from: v */
    public SpinnerAdapter f797v;

    /* renamed from: w */
    public final boolean f798w;

    /* renamed from: x */
    public f f799x;
    public int y;

    /* renamed from: z */
    public final Rect f800z = new Rect();

    /* renamed from: s */
    public final androidx.appcompat.widget.f f794s = new androidx.appcompat.widget.f(this);

    /* loaded from: classes.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
            c0.this = r1;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            if (!c0.this.getInternalPopup().b()) {
                c0.this.b();
            }
            ViewTreeObserver viewTreeObserver = c0.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements f, DialogInterface.OnClickListener {

        /* renamed from: s */
        public androidx.appcompat.app.d f802s;

        /* renamed from: t */
        public ListAdapter f803t;

        /* renamed from: u */
        public CharSequence f804u;

        public b() {
            c0.this = r1;
        }

        @Override // androidx.appcompat.widget.c0.f
        public final boolean b() {
            androidx.appcompat.app.d dVar = this.f802s;
            if (dVar != null) {
                return dVar.isShowing();
            }
            return false;
        }

        @Override // androidx.appcompat.widget.c0.f
        public final int c() {
            return 0;
        }

        @Override // androidx.appcompat.widget.c0.f
        public final void dismiss() {
            androidx.appcompat.app.d dVar = this.f802s;
            if (dVar != null) {
                dVar.dismiss();
                this.f802s = null;
            }
        }

        @Override // androidx.appcompat.widget.c0.f
        public final Drawable f() {
            return null;
        }

        @Override // androidx.appcompat.widget.c0.f
        public final void h(CharSequence charSequence) {
            this.f804u = charSequence;
        }

        @Override // androidx.appcompat.widget.c0.f
        public final void i(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.c0.f
        public final void j(int i10) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.c0.f
        public final void k(int i10) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.c0.f
        public final void l(int i10) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.c0.f
        public final void m(int i10, int i11) {
            if (this.f803t == null) {
                return;
            }
            d.a aVar = new d.a(c0.this.getPopupContext());
            CharSequence charSequence = this.f804u;
            if (charSequence != null) {
                aVar.f502a.f476d = charSequence;
            }
            ListAdapter listAdapter = this.f803t;
            int selectedItemPosition = c0.this.getSelectedItemPosition();
            AlertController.b bVar = aVar.f502a;
            bVar.f486n = listAdapter;
            bVar.f487o = this;
            bVar.f491t = selectedItemPosition;
            bVar.f490s = true;
            androidx.appcompat.app.d a10 = aVar.a();
            this.f802s = a10;
            AlertController.RecycleListView recycleListView = a10.f501u.f452g;
            recycleListView.setTextDirection(i10);
            recycleListView.setTextAlignment(i11);
            this.f802s.show();
        }

        @Override // androidx.appcompat.widget.c0.f
        public final int n() {
            return 0;
        }

        @Override // androidx.appcompat.widget.c0.f
        public final CharSequence o() {
            return this.f804u;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            c0.this.setSelection(i10);
            if (c0.this.getOnItemClickListener() != null) {
                c0.this.performItemClick(null, i10, this.f803t.getItemId(i10));
            }
            androidx.appcompat.app.d dVar = this.f802s;
            if (dVar != null) {
                dVar.dismiss();
                this.f802s = null;
            }
        }

        @Override // androidx.appcompat.widget.c0.f
        public final void p(ListAdapter listAdapter) {
            this.f803t = listAdapter;
        }
    }

    /* loaded from: classes.dex */
    public static class c implements ListAdapter, SpinnerAdapter {

        /* renamed from: s */
        public SpinnerAdapter f806s;

        /* renamed from: t */
        public ListAdapter f807t;

        public c(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f806s = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f807t = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (spinnerAdapter instanceof ThemedSpinnerAdapter) {
                    ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                    if (themedSpinnerAdapter.getDropDownViewTheme() == theme) {
                        return;
                    }
                    themedSpinnerAdapter.setDropDownViewTheme(theme);
                } else if (!(spinnerAdapter instanceof b1)) {
                } else {
                    b1 b1Var = (b1) spinnerAdapter;
                    if (b1Var.getDropDownViewTheme() != null) {
                        return;
                    }
                    b1Var.a();
                }
            }
        }

        @Override // android.widget.ListAdapter
        public final boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f807t;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            SpinnerAdapter spinnerAdapter = this.f806s;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public final View getDropDownView(int i10, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f806s;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i10, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public final Object getItem(int i10) {
            SpinnerAdapter spinnerAdapter = this.f806s;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i10);
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i10) {
            SpinnerAdapter spinnerAdapter = this.f806s;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i10);
        }

        @Override // android.widget.Adapter
        public final int getItemViewType(int i10) {
            return 0;
        }

        @Override // android.widget.Adapter
        public final View getView(int i10, View view, ViewGroup viewGroup) {
            return getDropDownView(i10, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public final int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public final boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f806s;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public final boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public final boolean isEnabled(int i10) {
            ListAdapter listAdapter = this.f807t;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i10);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f806s;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f806s;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* loaded from: classes.dex */
    public class d extends s0 implements f {
        public CharSequence U;
        public ListAdapter V;
        public final Rect W = new Rect();
        public int X;

        /* loaded from: classes.dex */
        public class a implements AdapterView.OnItemClickListener {
            public a() {
                d.this = r1;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j3) {
                c0.this.setSelection(i10);
                if (c0.this.getOnItemClickListener() != null) {
                    d dVar = d.this;
                    c0.this.performItemClick(view, i10, dVar.V.getItemId(i10));
                }
                d.this.dismiss();
            }
        }

        /* loaded from: classes.dex */
        public class b implements ViewTreeObserver.OnGlobalLayoutListener {
            public b() {
                d.this = r1;
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                d dVar = d.this;
                c0 c0Var = c0.this;
                Objects.requireNonNull(dVar);
                WeakHashMap<View, f0> weakHashMap = z.f5921a;
                if (!(z.g.b(c0Var) && c0Var.getGlobalVisibleRect(dVar.W))) {
                    d.this.dismiss();
                    return;
                }
                d.this.v();
                d.this.d();
            }
        }

        /* loaded from: classes.dex */
        public class c implements PopupWindow.OnDismissListener {

            /* renamed from: s */
            public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f810s;

            public c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                d.this = r1;
                this.f810s = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                ViewTreeObserver viewTreeObserver = c0.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f810s);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10, 0);
            c0.this = r2;
            this.G = r2;
            t();
            this.H = new a();
        }

        @Override // androidx.appcompat.widget.c0.f
        public final void h(CharSequence charSequence) {
            this.U = charSequence;
        }

        @Override // androidx.appcompat.widget.c0.f
        public final void k(int i10) {
            this.X = i10;
        }

        @Override // androidx.appcompat.widget.c0.f
        public final void m(int i10, int i11) {
            ViewTreeObserver viewTreeObserver;
            boolean b10 = b();
            v();
            s();
            d();
            n0 n0Var = this.f1004u;
            n0Var.setChoiceMode(1);
            n0Var.setTextDirection(i10);
            n0Var.setTextAlignment(i11);
            int selectedItemPosition = c0.this.getSelectedItemPosition();
            n0 n0Var2 = this.f1004u;
            if (b() && n0Var2 != null) {
                n0Var2.setListSelectionHidden(false);
                n0Var2.setSelection(selectedItemPosition);
                if (n0Var2.getChoiceMode() != 0) {
                    n0Var2.setItemChecked(selectedItemPosition, true);
                }
            }
            if (!b10 && (viewTreeObserver = c0.this.getViewTreeObserver()) != null) {
                b bVar = new b();
                viewTreeObserver.addOnGlobalLayoutListener(bVar);
                u(new c(bVar));
            }
        }

        @Override // androidx.appcompat.widget.c0.f
        public final CharSequence o() {
            return this.U;
        }

        @Override // androidx.appcompat.widget.s0, androidx.appcompat.widget.c0.f
        public final void p(ListAdapter listAdapter) {
            super.p(listAdapter);
            this.V = listAdapter;
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x008d  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0096  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void v() {
            /*
                r8 = this;
                android.graphics.drawable.Drawable r0 = r8.f()
                r1 = 0
                if (r0 == 0) goto L26
                androidx.appcompat.widget.c0 r1 = androidx.appcompat.widget.c0.this
                android.graphics.Rect r1 = r1.f800z
                r0.getPadding(r1)
                androidx.appcompat.widget.c0 r0 = androidx.appcompat.widget.c0.this
                boolean r0 = androidx.appcompat.widget.n1.b(r0)
                if (r0 == 0) goto L1d
                androidx.appcompat.widget.c0 r0 = androidx.appcompat.widget.c0.this
                android.graphics.Rect r0 = r0.f800z
                int r0 = r0.right
                goto L24
            L1d:
                androidx.appcompat.widget.c0 r0 = androidx.appcompat.widget.c0.this
                android.graphics.Rect r0 = r0.f800z
                int r0 = r0.left
                int r0 = -r0
            L24:
                r1 = r0
                goto L2e
            L26:
                androidx.appcompat.widget.c0 r0 = androidx.appcompat.widget.c0.this
                android.graphics.Rect r0 = r0.f800z
                r0.right = r1
                r0.left = r1
            L2e:
                androidx.appcompat.widget.c0 r0 = androidx.appcompat.widget.c0.this
                int r0 = r0.getPaddingLeft()
                androidx.appcompat.widget.c0 r2 = androidx.appcompat.widget.c0.this
                int r2 = r2.getPaddingRight()
                androidx.appcompat.widget.c0 r3 = androidx.appcompat.widget.c0.this
                int r3 = r3.getWidth()
                androidx.appcompat.widget.c0 r4 = androidx.appcompat.widget.c0.this
                int r5 = r4.y
                r6 = -2
                if (r5 != r6) goto L78
                android.widget.ListAdapter r5 = r8.V
                android.widget.SpinnerAdapter r5 = (android.widget.SpinnerAdapter) r5
                android.graphics.drawable.Drawable r6 = r8.f()
                int r4 = r4.a(r5, r6)
                androidx.appcompat.widget.c0 r5 = androidx.appcompat.widget.c0.this
                android.content.Context r5 = r5.getContext()
                android.content.res.Resources r5 = r5.getResources()
                android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
                int r5 = r5.widthPixels
                androidx.appcompat.widget.c0 r6 = androidx.appcompat.widget.c0.this
                android.graphics.Rect r6 = r6.f800z
                int r7 = r6.left
                int r5 = r5 - r7
                int r6 = r6.right
                int r5 = r5 - r6
                if (r4 <= r5) goto L70
                r4 = r5
            L70:
                int r5 = r3 - r0
                int r5 = r5 - r2
                int r4 = java.lang.Math.max(r4, r5)
                goto L7e
            L78:
                r4 = -1
                if (r5 != r4) goto L82
                int r4 = r3 - r0
                int r4 = r4 - r2
            L7e:
                r8.r(r4)
                goto L85
            L82:
                r8.r(r5)
            L85:
                androidx.appcompat.widget.c0 r4 = androidx.appcompat.widget.c0.this
                boolean r4 = androidx.appcompat.widget.n1.b(r4)
                if (r4 == 0) goto L96
                int r3 = r3 - r2
                int r0 = r8.f1006w
                int r3 = r3 - r0
                int r0 = r8.X
                int r3 = r3 - r0
                int r3 = r3 + r1
                goto L9b
            L96:
                int r2 = r8.X
                int r0 = r0 + r2
                int r3 = r0 + r1
            L9b:
                r8.f1007x = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.c0.d.v():void");
        }
    }

    /* loaded from: classes.dex */
    public static class e extends View.BaseSavedState {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: s */
        public boolean f812s;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<e> {
            @Override // android.os.Parcelable.Creator
            public final e createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final e[] newArray(int i10) {
                return new e[i10];
            }
        }

        public e(Parcel parcel) {
            super(parcel);
            this.f812s = parcel.readByte() != 0;
        }

        public e(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeByte(this.f812s ? (byte) 1 : (byte) 0);
        }
    }

    /* loaded from: classes.dex */
    public interface f {
        boolean b();

        int c();

        void dismiss();

        Drawable f();

        void h(CharSequence charSequence);

        void i(Drawable drawable);

        void j(int i10);

        void k(int i10);

        void l(int i10);

        void m(int i10, int i11);

        int n();

        CharSequence o();

        void p(ListAdapter listAdapter);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
        if (r4 == null) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public c0(android.content.Context r10, android.util.AttributeSet r11, int r12) {
        /*
            r9 = this;
            r9.<init>(r10, r11, r12)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r9.f800z = r0
            android.content.Context r0 = r9.getContext()
            androidx.appcompat.widget.a1.a(r9, r0)
            int[] r0 = a6.f.N
            r1 = 0
            android.content.res.TypedArray r0 = r10.obtainStyledAttributes(r11, r0, r12, r1)
            androidx.appcompat.widget.f r2 = new androidx.appcompat.widget.f
            r2.<init>(r9)
            r9.f794s = r2
            r2 = 4
            int r2 = r0.getResourceId(r2, r1)
            if (r2 == 0) goto L2e
            j.c r3 = new j.c
            r3.<init>(r10, r2)
            r9.f795t = r3
            goto L30
        L2e:
            r9.f795t = r10
        L30:
            r2 = 0
            r3 = -1
            int[] r4 = androidx.appcompat.widget.c0.A     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4c
            android.content.res.TypedArray r4 = r10.obtainStyledAttributes(r11, r4, r12, r1)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4c
            boolean r5 = r4.hasValue(r1)     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L47
            if (r5 == 0) goto L58
            int r3 = r4.getInt(r1, r1)     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L47
            goto L58
        L43:
            r10 = move-exception
            r2 = r4
            goto Lcd
        L47:
            r5 = move-exception
            goto L4f
        L49:
            r10 = move-exception
            goto Lcd
        L4c:
            r4 = move-exception
            r5 = r4
            r4 = r2
        L4f:
            java.lang.String r6 = "AppCompatSpinner"
            java.lang.String r7 = "Could not read android:spinnerMode"
            android.util.Log.i(r6, r7, r5)     // Catch: java.lang.Throwable -> L43
            if (r4 == 0) goto L5b
        L58:
            r4.recycle()
        L5b:
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L95
            if (r3 == r5) goto L62
            goto La2
        L62:
            androidx.appcompat.widget.c0$d r3 = new androidx.appcompat.widget.c0$d
            android.content.Context r6 = r9.f795t
            r3.<init>(r6, r11, r12)
            android.content.Context r6 = r9.f795t
            int[] r7 = a6.f.N
            androidx.appcompat.widget.f1 r6 = androidx.appcompat.widget.f1.q(r6, r11, r7, r12)
            r7 = 3
            r8 = -2
            int r7 = r6.k(r7, r8)
            r9.y = r7
            android.graphics.drawable.Drawable r7 = r6.g(r5)
            androidx.appcompat.widget.u r8 = r3.Q
            r8.setBackgroundDrawable(r7)
            java.lang.String r4 = r0.getString(r4)
            r3.U = r4
            r6.r()
            r9.f799x = r3
            androidx.appcompat.widget.b0 r4 = new androidx.appcompat.widget.b0
            r4.<init>(r9, r9, r3)
            r9.f796u = r4
            goto La2
        L95:
            androidx.appcompat.widget.c0$b r3 = new androidx.appcompat.widget.c0$b
            r3.<init>()
            r9.f799x = r3
            java.lang.String r4 = r0.getString(r4)
            r3.f804u = r4
        La2:
            java.lang.CharSequence[] r1 = r0.getTextArray(r1)
            if (r1 == 0) goto Lb9
            android.widget.ArrayAdapter r3 = new android.widget.ArrayAdapter
            r4 = 17367048(0x1090008, float:2.5162948E-38)
            r3.<init>(r10, r4, r1)
            r10 = 2131558568(0x7f0d00a8, float:1.8742455E38)
            r3.setDropDownViewResource(r10)
            r9.setAdapter(r3)
        Lb9:
            r0.recycle()
            r9.f798w = r5
            android.widget.SpinnerAdapter r10 = r9.f797v
            if (r10 == 0) goto Lc7
            r9.setAdapter(r10)
            r9.f797v = r2
        Lc7:
            androidx.appcompat.widget.f r10 = r9.f794s
            r10.d(r11, r12)
            return
        Lcd:
            if (r2 == 0) goto Ld2
            r2.recycle()
        Ld2:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.c0.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i10 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i11 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i11 = Math.max(i11, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i11;
        }
        drawable.getPadding(this.f800z);
        Rect rect = this.f800z;
        return i11 + rect.left + rect.right;
    }

    public final void b() {
        this.f799x.m(getTextDirection(), getTextAlignment());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        androidx.appcompat.widget.f fVar = this.f794s;
        if (fVar != null) {
            fVar.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        f fVar = this.f799x;
        return fVar != null ? fVar.c() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        f fVar = this.f799x;
        return fVar != null ? fVar.n() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f799x != null ? this.y : super.getDropDownWidth();
    }

    public final f getInternalPopup() {
        return this.f799x;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        f fVar = this.f799x;
        return fVar != null ? fVar.f() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f795t;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        f fVar = this.f799x;
        return fVar != null ? fVar.o() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        androidx.appcompat.widget.f fVar = this.f794s;
        if (fVar != null) {
            return fVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        androidx.appcompat.widget.f fVar = this.f794s;
        if (fVar != null) {
            return fVar.c();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f fVar = this.f799x;
        if (fVar == null || !fVar.b()) {
            return;
        }
        this.f799x.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f799x == null || View.MeasureSpec.getMode(i10) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        e eVar = (e) parcelable;
        super.onRestoreInstanceState(eVar.getSuperState());
        if (!eVar.f812s || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new a());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        e eVar = new e(super.onSaveInstanceState());
        f fVar = this.f799x;
        eVar.f812s = fVar != null && fVar.b();
        return eVar;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        b0 b0Var = this.f796u;
        if (b0Var == null || !b0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        f fVar = this.f799x;
        if (fVar != null) {
            if (fVar.b()) {
                return true;
            }
            b();
            return true;
        }
        return super.performClick();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f798w) {
            this.f797v = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f799x == null) {
            return;
        }
        Context context = this.f795t;
        if (context == null) {
            context = getContext();
        }
        this.f799x.p(new c(spinnerAdapter, context.getTheme()));
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        androidx.appcompat.widget.f fVar = this.f794s;
        if (fVar != null) {
            fVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        androidx.appcompat.widget.f fVar = this.f794s;
        if (fVar != null) {
            fVar.f(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i10) {
        f fVar = this.f799x;
        if (fVar == null) {
            super.setDropDownHorizontalOffset(i10);
            return;
        }
        fVar.k(i10);
        this.f799x.l(i10);
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i10) {
        f fVar = this.f799x;
        if (fVar != null) {
            fVar.j(i10);
        } else {
            super.setDropDownVerticalOffset(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i10) {
        if (this.f799x != null) {
            this.y = i10;
        } else {
            super.setDropDownWidth(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        f fVar = this.f799x;
        if (fVar != null) {
            fVar.i(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i10) {
        setPopupBackgroundDrawable(f.a.b(getPopupContext(), i10));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        f fVar = this.f799x;
        if (fVar != null) {
            fVar.h(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        androidx.appcompat.widget.f fVar = this.f794s;
        if (fVar != null) {
            fVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        androidx.appcompat.widget.f fVar = this.f794s;
        if (fVar != null) {
            fVar.i(mode);
        }
    }
}
