package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import com.raouf.routerchef.R;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.WeakHashMap;
import m0.z;

/* loaded from: classes.dex */
public class SearchView extends q0 implements j.b {
    public static final n I0;
    public c A0;
    public final WeakHashMap<String, Drawable.ConstantState> B0;
    public final f C0;
    public g D0;
    public final h E0;
    public final i F0;
    public final j G0;
    public final SearchAutoComplete H;
    public a H0;
    public final View I;
    public final View J;
    public final View K;
    public final ImageView L;
    public final ImageView M;
    public final ImageView N;
    public final ImageView O;
    public final View P;
    public p Q;
    public Rect R;
    public Rect S;
    public int[] T;
    public int[] U;
    public final ImageView V;
    public final Drawable W;

    /* renamed from: a0 */
    public final int f662a0;

    /* renamed from: b0 */
    public final int f663b0;

    /* renamed from: c0 */
    public final Intent f664c0;

    /* renamed from: d0 */
    public final Intent f665d0;

    /* renamed from: e0 */
    public final CharSequence f666e0;

    /* renamed from: f0 */
    public l f667f0;

    /* renamed from: g0 */
    public k f668g0;

    /* renamed from: h0 */
    public View.OnFocusChangeListener f669h0;

    /* renamed from: i0 */
    public m f670i0;

    /* renamed from: j0 */
    public View.OnClickListener f671j0;

    /* renamed from: k0 */
    public boolean f672k0;

    /* renamed from: l0 */
    public boolean f673l0;

    /* renamed from: m0 */
    public r0.a f674m0;

    /* renamed from: n0 */
    public boolean f675n0;

    /* renamed from: o0 */
    public CharSequence f676o0;

    /* renamed from: p0 */
    public boolean f677p0;

    /* renamed from: q0 */
    public boolean f678q0;

    /* renamed from: r0 */
    public int f679r0;

    /* renamed from: s0 */
    public boolean f680s0;

    /* renamed from: t0 */
    public String f681t0;

    /* renamed from: u0 */
    public CharSequence f682u0;

    /* renamed from: v0 */
    public boolean f683v0;

    /* renamed from: w0 */
    public int f684w0;
    public SearchableInfo x0;

    /* renamed from: y0 */
    public Bundle f685y0;

    /* renamed from: z0 */
    public final b f686z0;

    /* loaded from: classes.dex */
    public static class SearchAutoComplete extends androidx.appcompat.widget.e {

        /* renamed from: x */
        public SearchView f688x;
        public boolean y;

        /* renamed from: z */
        public final a f689z = new a();

        /* renamed from: w */
        public int f687w = getThreshold();

        /* loaded from: classes.dex */
        public class a implements Runnable {
            public a() {
                SearchAutoComplete.this = r1;
            }

            @Override // java.lang.Runnable
            public final void run() {
                SearchAutoComplete searchAutoComplete = SearchAutoComplete.this;
                if (searchAutoComplete.y) {
                    ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
                    searchAutoComplete.y = false;
                }
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet, R.attr.autoCompleteTextViewStyle);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i10 = configuration.screenWidthDp;
            int i11 = configuration.screenHeightDp;
            if (i10 < 960 || i11 < 720 || configuration.orientation != 2) {
                if (i10 >= 600) {
                    return 192;
                }
                return (i10 < 640 || i11 < 480) ? 160 : 192;
            }
            return 256;
        }

        public final void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                setInputMethodMode(1);
                if (!enoughToFilter()) {
                    return;
                }
                showDropDown();
                return;
            }
            n nVar = SearchView.I0;
            Objects.requireNonNull(nVar);
            n.a();
            Method method = nVar.f703c;
            if (method == null) {
                return;
            }
            try {
                method.invoke(this, Boolean.TRUE);
            } catch (Exception unused) {
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            return this.f687w <= 0 || super.enoughToFilter();
        }

        @Override // androidx.appcompat.widget.e, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.y) {
                removeCallbacks(this.f689z);
                post(this.f689z);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        public final void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onFocusChanged(boolean z10, int i10, Rect rect) {
            super.onFocusChanged(z10, i10, rect);
            SearchView searchView = this.f688x;
            searchView.z(searchView.f673l0);
            searchView.post(searchView.f686z0);
            if (searchView.H.hasFocus()) {
                searchView.n();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i10, KeyEvent keyEvent) {
            if (i10 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f688x.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i10, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z10) {
            super.onWindowFocusChanged(z10);
            if (!z10 || !this.f688x.hasFocus() || getVisibility() != 0) {
                return;
            }
            boolean z11 = true;
            this.y = true;
            Context context = getContext();
            n nVar = SearchView.I0;
            if (context.getResources().getConfiguration().orientation != 2) {
                z11 = false;
            }
            if (!z11) {
                return;
            }
            a();
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z10) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z10) {
                this.y = false;
                removeCallbacks(this.f689z);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (!inputMethodManager.isActive(this)) {
                this.y = true;
            } else {
                this.y = false;
                removeCallbacks(this.f689z);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f688x = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i10) {
            super.setThreshold(i10);
            this.f687w = i10;
        }
    }

    /* loaded from: classes.dex */
    public class a implements TextWatcher {
        public a() {
            SearchView.this = r1;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            SearchView searchView = SearchView.this;
            Editable text = searchView.H.getText();
            searchView.f682u0 = text;
            boolean z10 = !TextUtils.isEmpty(text);
            searchView.y(z10);
            searchView.A(!z10);
            searchView.u();
            searchView.x();
            if (searchView.f667f0 != null && !TextUtils.equals(charSequence, searchView.f681t0)) {
                l lVar = searchView.f667f0;
                charSequence.toString();
                lVar.a();
            }
            searchView.f681t0 = charSequence.toString();
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
            SearchView.this = r1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            SearchView.this.v();
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        public c() {
            SearchView.this = r1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            r0.a aVar = SearchView.this.f674m0;
            if (aVar instanceof z0) {
                aVar.c(null);
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements View.OnFocusChangeListener {
        public d() {
            SearchView.this = r1;
        }

        @Override // android.view.View.OnFocusChangeListener
        public final void onFocusChange(View view, boolean z10) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.f669h0;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z10);
            }
        }
    }

    /* loaded from: classes.dex */
    public class e implements View.OnLayoutChangeListener {
        public e() {
            SearchView.this = r1;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            SearchView searchView = SearchView.this;
            if (searchView.P.getWidth() > 1) {
                Resources resources = searchView.getContext().getResources();
                int paddingLeft = searchView.J.getPaddingLeft();
                Rect rect = new Rect();
                boolean b10 = n1.b(searchView);
                int dimensionPixelSize = searchView.f672k0 ? resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width) : 0;
                searchView.H.getDropDownBackground().getPadding(rect);
                searchView.H.setDropDownHorizontalOffset(b10 ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
                searchView.H.setDropDownWidth((((searchView.P.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
            }
        }
    }

    /* loaded from: classes.dex */
    public class f implements View.OnClickListener {
        public f() {
            SearchView.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.L) {
                searchView.s();
            } else if (view == searchView.N) {
                searchView.o();
            } else if (view == searchView.M) {
                searchView.t();
            } else if (view == searchView.O) {
                SearchableInfo searchableInfo = searchView.x0;
                if (searchableInfo == null) {
                    return;
                }
                try {
                    if (!searchableInfo.getVoiceSearchLaunchWebSearch()) {
                        if (!searchableInfo.getVoiceSearchLaunchRecognizer()) {
                            return;
                        }
                        searchView.getContext().startActivity(searchView.m(searchView.f665d0, searchableInfo));
                        return;
                    }
                    Intent intent = new Intent(searchView.f664c0);
                    ComponentName searchActivity = searchableInfo.getSearchActivity();
                    intent.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
                    searchView.getContext().startActivity(intent);
                } catch (ActivityNotFoundException unused) {
                    Log.w("SearchView", "Could not find voice search activity");
                }
            } else if (view != searchView.H) {
            } else {
                searchView.n();
            }
        }
    }

    /* loaded from: classes.dex */
    public class g implements View.OnKeyListener {
        public g() {
            SearchView.this = r1;
        }

        @Override // android.view.View.OnKeyListener
        public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.x0 == null) {
                return false;
            }
            if (searchView.H.isPopupShowing() && SearchView.this.H.getListSelection() != -1) {
                SearchView searchView2 = SearchView.this;
                if (searchView2.x0 == null || searchView2.f674m0 == null || keyEvent.getAction() != 0 || !keyEvent.hasNoModifiers()) {
                    return false;
                }
                if (i10 == 66 || i10 == 84 || i10 == 61) {
                    return searchView2.p(searchView2.H.getListSelection());
                }
                if (i10 != 21 && i10 != 22) {
                    if (i10 != 19) {
                        return false;
                    }
                    searchView2.H.getListSelection();
                    return false;
                }
                searchView2.H.setSelection(i10 == 21 ? 0 : searchView2.H.length());
                searchView2.H.setListSelection(0);
                searchView2.H.clearListSelection();
                searchView2.H.a();
                return true;
            }
            if ((TextUtils.getTrimmedLength(SearchView.this.H.getText()) == 0) || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i10 != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView3 = SearchView.this;
            searchView3.getContext().startActivity(searchView3.l("android.intent.action.SEARCH", null, null, searchView3.H.getText().toString()));
            return true;
        }
    }

    /* loaded from: classes.dex */
    public class h implements TextView.OnEditorActionListener {
        public h() {
            SearchView.this = r1;
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
            SearchView.this.t();
            return true;
        }
    }

    /* loaded from: classes.dex */
    public class i implements AdapterView.OnItemClickListener {
        public i() {
            SearchView.this = r1;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j3) {
            SearchView.this.p(i10);
        }
    }

    /* loaded from: classes.dex */
    public class j implements AdapterView.OnItemSelectedListener {
        public j() {
            SearchView.this = r1;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j3) {
            SearchView.this.q(i10);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* loaded from: classes.dex */
    public interface k {
        boolean a();
    }

    /* loaded from: classes.dex */
    public interface l {
        boolean a();

        boolean b();
    }

    /* loaded from: classes.dex */
    public interface m {
        boolean a();

        boolean b();
    }

    /* loaded from: classes.dex */
    public static class n {

        /* renamed from: a */
        public Method f701a;

        /* renamed from: b */
        public Method f702b;

        /* renamed from: c */
        public Method f703c;

        @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        public n() {
            this.f701a = null;
            this.f702b = null;
            this.f703c = null;
            a();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f701a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f702b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f703c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        public static void a() {
            if (Build.VERSION.SDK_INT < 29) {
                return;
            }
            throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
        }
    }

    /* loaded from: classes.dex */
    public static class o extends s0.a {
        public static final Parcelable.Creator<o> CREATOR = new a();

        /* renamed from: u */
        public boolean f704u;

        /* loaded from: classes.dex */
        public class a implements Parcelable.ClassLoaderCreator<o> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new o(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i10) {
                return new o[i10];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final o createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new o(parcel, classLoader);
            }
        }

        public o(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f704u = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        public o(Parcelable parcelable) {
            super(parcelable);
        }

        public final String toString() {
            StringBuilder c10 = androidx.activity.result.a.c("SearchView.SavedState{");
            c10.append(Integer.toHexString(System.identityHashCode(this)));
            c10.append(" isIconified=");
            c10.append(this.f704u);
            c10.append("}");
            return c10.toString();
        }

        @Override // s0.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f17592s, i10);
            parcel.writeValue(Boolean.valueOf(this.f704u));
        }
    }

    /* loaded from: classes.dex */
    public static class p extends TouchDelegate {

        /* renamed from: a */
        public final View f705a;

        /* renamed from: e */
        public final int f709e;

        /* renamed from: f */
        public boolean f710f;

        /* renamed from: b */
        public final Rect f706b = new Rect();

        /* renamed from: d */
        public final Rect f708d = new Rect();

        /* renamed from: c */
        public final Rect f707c = new Rect();

        public p(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f709e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            a(rect, rect2);
            this.f705a = view;
        }

        public final void a(Rect rect, Rect rect2) {
            this.f706b.set(rect);
            this.f708d.set(rect);
            Rect rect3 = this.f708d;
            int i10 = this.f709e;
            rect3.inset(-i10, -i10);
            this.f707c.set(rect2);
        }

        @Override // android.view.TouchDelegate
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z10;
            int i10;
            float f10;
            boolean z11;
            int x10 = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z12 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z11 = this.f710f;
                    if (z11 && !this.f708d.contains(x10, y)) {
                        z12 = z11;
                        z10 = false;
                    }
                } else {
                    if (action == 3) {
                        z11 = this.f710f;
                        this.f710f = false;
                    }
                    z10 = true;
                    z12 = false;
                }
                z12 = z11;
                z10 = true;
            } else {
                if (this.f706b.contains(x10, y)) {
                    this.f710f = true;
                    z10 = true;
                }
                z10 = true;
                z12 = false;
            }
            if (z12) {
                if (!z10 || this.f707c.contains(x10, y)) {
                    Rect rect = this.f707c;
                    f10 = x10 - rect.left;
                    i10 = y - rect.top;
                } else {
                    f10 = this.f705a.getWidth() / 2;
                    i10 = this.f705a.getHeight() / 2;
                }
                motionEvent.setLocation(f10, i10);
                return this.f705a.dispatchTouchEvent(motionEvent);
            }
            return false;
        }
    }

    static {
        I0 = Build.VERSION.SDK_INT < 29 ? new n() : null;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.R = new Rect();
        this.S = new Rect();
        this.T = new int[2];
        this.U = new int[2];
        this.f686z0 = new b();
        this.A0 = new c();
        this.B0 = new WeakHashMap<>();
        f fVar = new f();
        this.C0 = fVar;
        this.D0 = new g();
        h hVar = new h();
        this.E0 = hVar;
        i iVar = new i();
        this.F0 = iVar;
        j jVar = new j();
        this.G0 = jVar;
        this.H0 = new a();
        int[] iArr = a6.f.M;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        f1 f1Var = new f1(context, obtainStyledAttributes);
        z.o(this, context, iArr, attributeSet, obtainStyledAttributes, i10);
        LayoutInflater.from(context).inflate(f1Var.l(9, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.H = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.I = findViewById(R.id.search_edit_frame);
        View findViewById = findViewById(R.id.search_plate);
        this.J = findViewById;
        View findViewById2 = findViewById(R.id.submit_area);
        this.K = findViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.L = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.M = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.N = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.O = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.V = imageView5;
        z.d.q(findViewById, f1Var.g(10));
        z.d.q(findViewById2, f1Var.g(14));
        imageView.setImageDrawable(f1Var.g(13));
        imageView2.setImageDrawable(f1Var.g(7));
        imageView3.setImageDrawable(f1Var.g(4));
        imageView4.setImageDrawable(f1Var.g(16));
        imageView5.setImageDrawable(f1Var.g(13));
        this.W = f1Var.g(12);
        j1.a(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.f662a0 = f1Var.l(15, R.layout.abc_search_dropdown_item_icons_2line);
        this.f663b0 = f1Var.l(5, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.H0);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.D0);
        searchAutoComplete.setOnFocusChangeListener(new d());
        setIconifiedByDefault(f1Var.a(8, true));
        int f10 = f1Var.f(1, -1);
        if (f10 != -1) {
            setMaxWidth(f10);
        }
        this.f666e0 = f1Var.n(6);
        this.f676o0 = f1Var.n(11);
        int j3 = f1Var.j(3, -1);
        if (j3 != -1) {
            setImeOptions(j3);
        }
        int j10 = f1Var.j(2, -1);
        if (j10 != -1) {
            setInputType(j10);
        }
        setFocusable(f1Var.a(0, true));
        f1Var.r();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f664c0 = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f665d0 = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.P = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new e());
        }
        z(this.f672k0);
        w();
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        this.H.setText(charSequence);
        this.H.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    public final void A(boolean z10) {
        int i10 = 8;
        if (this.f680s0 && !this.f673l0 && z10) {
            this.M.setVisibility(8);
            i10 = 0;
        }
        this.O.setVisibility(i10);
    }

    @Override // j.b
    public final void c() {
        if (this.f683v0) {
            return;
        }
        this.f683v0 = true;
        int imeOptions = this.H.getImeOptions();
        this.f684w0 = imeOptions;
        this.H.setImeOptions(imeOptions | 33554432);
        this.H.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.f678q0 = true;
        super.clearFocus();
        this.H.clearFocus();
        this.H.setImeVisibility(false);
        this.f678q0 = false;
    }

    @Override // j.b
    public final void d() {
        this.H.setText("");
        SearchAutoComplete searchAutoComplete = this.H;
        searchAutoComplete.setSelection(searchAutoComplete.length());
        this.f682u0 = "";
        clearFocus();
        z(true);
        this.H.setImeOptions(this.f684w0);
        this.f683v0 = false;
    }

    public int getImeOptions() {
        return this.H.getImeOptions();
    }

    public int getInputType() {
        return this.H.getInputType();
    }

    public int getMaxWidth() {
        return this.f679r0;
    }

    public CharSequence getQuery() {
        return this.H.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f676o0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.x0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f666e0 : getContext().getText(this.x0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.f663b0;
    }

    public int getSuggestionRowLayout() {
        return this.f662a0;
    }

    public r0.a getSuggestionsAdapter() {
        return this.f674m0;
    }

    public final Intent l(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f682u0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f685y0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.x0.getSearchActivity());
        return intent;
    }

    public final Intent m(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f685y0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        int i10 = 1;
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String str = null;
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        if (searchableInfo.getVoiceMaxResults() != 0) {
            i10 = searchableInfo.getVoiceMaxResults();
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", i10);
        if (searchActivity != null) {
            str = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", str);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final void n() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.H.refreshAutoCompleteResults();
            return;
        }
        n nVar = I0;
        SearchAutoComplete searchAutoComplete = this.H;
        Objects.requireNonNull(nVar);
        n.a();
        Method method = nVar.f701a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused) {
            }
        }
        n nVar2 = I0;
        SearchAutoComplete searchAutoComplete2 = this.H;
        Objects.requireNonNull(nVar2);
        n.a();
        Method method2 = nVar2.f702b;
        if (method2 == null) {
            return;
        }
        try {
            method2.invoke(searchAutoComplete2, new Object[0]);
        } catch (Exception unused2) {
        }
    }

    public final void o() {
        if (!TextUtils.isEmpty(this.H.getText())) {
            this.H.setText("");
            this.H.requestFocus();
            this.H.setImeVisibility(true);
        } else if (!this.f672k0) {
        } else {
            k kVar = this.f668g0;
            if (kVar != null && kVar.a()) {
                return;
            }
            clearFocus();
            z(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f686z0);
        post(this.A0);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.q0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            SearchAutoComplete searchAutoComplete = this.H;
            Rect rect = this.R;
            searchAutoComplete.getLocationInWindow(this.T);
            getLocationInWindow(this.U);
            int[] iArr = this.T;
            int i14 = iArr[1];
            int[] iArr2 = this.U;
            int i15 = i14 - iArr2[1];
            int i16 = iArr[0] - iArr2[0];
            rect.set(i16, i15, searchAutoComplete.getWidth() + i16, searchAutoComplete.getHeight() + i15);
            Rect rect2 = this.S;
            Rect rect3 = this.R;
            rect2.set(rect3.left, 0, rect3.right, i13 - i11);
            p pVar = this.Q;
            if (pVar != null) {
                pVar.a(this.S, this.R);
                return;
            }
            p pVar2 = new p(this.S, this.R, this.H);
            this.Q = pVar2;
            setTouchDelegate(pVar2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
        if (r0 <= 0) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0049  */
    @Override // androidx.appcompat.widget.q0, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            boolean r0 = r3.f673l0
            if (r0 == 0) goto L8
            super.onMeasure(r4, r5)
            return
        L8:
            int r0 = android.view.View.MeasureSpec.getMode(r4)
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L2a
            if (r0 == 0) goto L20
            if (r0 == r2) goto L1b
            goto L37
        L1b:
            int r0 = r3.f679r0
            if (r0 <= 0) goto L37
            goto L2e
        L20:
            int r4 = r3.f679r0
            if (r4 <= 0) goto L25
            goto L37
        L25:
            int r4 = r3.getPreferredWidth()
            goto L37
        L2a:
            int r0 = r3.f679r0
            if (r0 <= 0) goto L2f
        L2e:
            goto L33
        L2f:
            int r0 = r3.getPreferredWidth()
        L33:
            int r4 = java.lang.Math.min(r0, r4)
        L37:
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            if (r0 == r1) goto L49
            if (r0 == 0) goto L44
            goto L51
        L44:
            int r5 = r3.getPreferredHeight()
            goto L51
        L49:
            int r0 = r3.getPreferredHeight()
            int r5 = java.lang.Math.min(r0, r5)
        L51:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r2)
            super.onMeasure(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof o)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        o oVar = (o) parcelable;
        super.onRestoreInstanceState(oVar.f17592s);
        z(oVar.f704u);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        o oVar = new o(super.onSaveInstanceState());
        oVar.f704u = this.f673l0;
        return oVar;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        post(this.f686z0);
    }

    public final boolean p(int i10) {
        int i11;
        String s10;
        m mVar = this.f670i0;
        if (mVar == null || !mVar.a()) {
            Cursor cursor = this.f674m0.f17208u;
            if (cursor != null && cursor.moveToPosition(i10)) {
                Intent intent = null;
                try {
                    int i12 = z0.Q;
                    String s11 = z0.s(cursor, cursor.getColumnIndex("suggest_intent_action"));
                    if (s11 == null) {
                        s11 = this.x0.getSuggestIntentAction();
                    }
                    if (s11 == null) {
                        s11 = "android.intent.action.SEARCH";
                    }
                    String s12 = z0.s(cursor, cursor.getColumnIndex("suggest_intent_data"));
                    if (s12 == null) {
                        s12 = this.x0.getSuggestIntentData();
                    }
                    if (s12 != null && (s10 = z0.s(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                        s12 = s12 + "/" + Uri.encode(s10);
                    }
                    intent = l(s11, s12 == null ? null : Uri.parse(s12), z0.s(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), z0.s(cursor, cursor.getColumnIndex("suggest_intent_query")));
                } catch (RuntimeException e10) {
                    try {
                        i11 = cursor.getPosition();
                    } catch (RuntimeException unused) {
                        i11 = -1;
                    }
                    Log.w("SearchView", "Search suggestions cursor at row " + i11 + " returned exception.", e10);
                }
                if (intent != null) {
                    try {
                        getContext().startActivity(intent);
                    } catch (RuntimeException e11) {
                        Log.e("SearchView", "Failed launch activity: " + intent, e11);
                    }
                }
            }
            this.H.setImeVisibility(false);
            this.H.dismissDropDown();
            return true;
        }
        return false;
    }

    public final boolean q(int i10) {
        CharSequence e10;
        m mVar = this.f670i0;
        if (mVar == null || !mVar.b()) {
            Editable text = this.H.getText();
            Cursor cursor = this.f674m0.f17208u;
            if (cursor == null) {
                return true;
            }
            if (!cursor.moveToPosition(i10) || (e10 = this.f674m0.e(cursor)) == null) {
                setQuery(text);
                return true;
            }
            setQuery(e10);
            return true;
        }
        return false;
    }

    public final void r(CharSequence charSequence) {
        setQuery(charSequence);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i10, Rect rect) {
        if (!this.f678q0 && isFocusable()) {
            if (this.f673l0) {
                return super.requestFocus(i10, rect);
            }
            boolean requestFocus = this.H.requestFocus(i10, rect);
            if (requestFocus) {
                z(false);
            }
            return requestFocus;
        }
        return false;
    }

    public final void s() {
        z(false);
        this.H.requestFocus();
        this.H.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f671j0;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setAppSearchData(Bundle bundle) {
        this.f685y0 = bundle;
    }

    public void setIconified(boolean z10) {
        if (z10) {
            o();
        } else {
            s();
        }
    }

    public void setIconifiedByDefault(boolean z10) {
        if (this.f672k0 == z10) {
            return;
        }
        this.f672k0 = z10;
        z(z10);
        w();
    }

    public void setImeOptions(int i10) {
        this.H.setImeOptions(i10);
    }

    public void setInputType(int i10) {
        this.H.setInputType(i10);
    }

    public void setMaxWidth(int i10) {
        this.f679r0 = i10;
        requestLayout();
    }

    public void setOnCloseListener(k kVar) {
        this.f668g0 = kVar;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f669h0 = onFocusChangeListener;
    }

    public void setOnQueryTextListener(l lVar) {
        this.f667f0 = lVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f671j0 = onClickListener;
    }

    public void setOnSuggestionListener(m mVar) {
        this.f670i0 = mVar;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f676o0 = charSequence;
        w();
    }

    public void setQueryRefinementEnabled(boolean z10) {
        this.f677p0 = z10;
        r0.a aVar = this.f674m0;
        if (aVar instanceof z0) {
            ((z0) aVar).I = z10 ? 2 : 1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x009c, code lost:
        if (getContext().getPackageManager().resolveActivity(r2, 65536) != null) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setSearchableInfo(android.app.SearchableInfo r7) {
        /*
            r6 = this;
            r6.x0 = r7
            r0 = 1
            r1 = 65536(0x10000, float:9.18355E-41)
            r2 = 0
            if (r7 == 0) goto L6e
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r6.H
            int r7 = r7.getSuggestThreshold()
            r3.setThreshold(r7)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r7 = r6.H
            android.app.SearchableInfo r3 = r6.x0
            int r3 = r3.getImeOptions()
            r7.setImeOptions(r3)
            android.app.SearchableInfo r7 = r6.x0
            int r7 = r7.getInputType()
            r3 = r7 & 15
            if (r3 != r0) goto L36
            r3 = -65537(0xfffffffffffeffff, float:NaN)
            r7 = r7 & r3
            android.app.SearchableInfo r3 = r6.x0
            java.lang.String r3 = r3.getSuggestAuthority()
            if (r3 == 0) goto L36
            r7 = r7 | r1
            r3 = 524288(0x80000, float:7.34684E-40)
            r7 = r7 | r3
        L36:
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r6.H
            r3.setInputType(r7)
            r0.a r7 = r6.f674m0
            if (r7 == 0) goto L42
            r7.c(r2)
        L42:
            android.app.SearchableInfo r7 = r6.x0
            java.lang.String r7 = r7.getSuggestAuthority()
            if (r7 == 0) goto L6b
            androidx.appcompat.widget.z0 r7 = new androidx.appcompat.widget.z0
            android.content.Context r3 = r6.getContext()
            android.app.SearchableInfo r4 = r6.x0
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r5 = r6.B0
            r7.<init>(r3, r6, r4, r5)
            r6.f674m0 = r7
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r6.H
            r3.setAdapter(r7)
            r0.a r7 = r6.f674m0
            androidx.appcompat.widget.z0 r7 = (androidx.appcompat.widget.z0) r7
            boolean r3 = r6.f677p0
            if (r3 == 0) goto L68
            r3 = 2
            goto L69
        L68:
            r3 = r0
        L69:
            r7.I = r3
        L6b:
            r6.w()
        L6e:
            android.app.SearchableInfo r7 = r6.x0
            r3 = 0
            if (r7 == 0) goto L9f
            boolean r7 = r7.getVoiceSearchEnabled()
            if (r7 == 0) goto L9f
            android.app.SearchableInfo r7 = r6.x0
            boolean r7 = r7.getVoiceSearchLaunchWebSearch()
            if (r7 == 0) goto L84
            android.content.Intent r2 = r6.f664c0
            goto L8e
        L84:
            android.app.SearchableInfo r7 = r6.x0
            boolean r7 = r7.getVoiceSearchLaunchRecognizer()
            if (r7 == 0) goto L8e
            android.content.Intent r2 = r6.f665d0
        L8e:
            if (r2 == 0) goto L9f
            android.content.Context r7 = r6.getContext()
            android.content.pm.PackageManager r7 = r7.getPackageManager()
            android.content.pm.ResolveInfo r7 = r7.resolveActivity(r2, r1)
            if (r7 == 0) goto L9f
            goto La0
        L9f:
            r0 = r3
        La0:
            r6.f680s0 = r0
            if (r0 == 0) goto Lab
            androidx.appcompat.widget.SearchView$SearchAutoComplete r7 = r6.H
            java.lang.String r0 = "nm"
            r7.setPrivateImeOptions(r0)
        Lab:
            boolean r7 = r6.f673l0
            r6.z(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.setSearchableInfo(android.app.SearchableInfo):void");
    }

    public void setSubmitButtonEnabled(boolean z10) {
        this.f675n0 = z10;
        z(this.f673l0);
    }

    public void setSuggestionsAdapter(r0.a aVar) {
        this.f674m0 = aVar;
        this.H.setAdapter(aVar);
    }

    public final void t() {
        Editable text = this.H.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        l lVar = this.f667f0;
        if (lVar != null) {
            text.toString();
            if (lVar.b()) {
                return;
            }
        }
        if (this.x0 != null) {
            getContext().startActivity(l("android.intent.action.SEARCH", null, null, text.toString()));
        }
        this.H.setImeVisibility(false);
        this.H.dismissDropDown();
    }

    public final void u() {
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(this.H.getText());
        int i10 = 0;
        if (!z11 && (!this.f672k0 || this.f683v0)) {
            z10 = false;
        }
        ImageView imageView = this.N;
        if (!z10) {
            i10 = 8;
        }
        imageView.setVisibility(i10);
        Drawable drawable = this.N.getDrawable();
        if (drawable != null) {
            drawable.setState(z11 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    public final void v() {
        int[] iArr = this.H.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.J.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.K.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public final void w() {
        SpannableStringBuilder queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.H;
        if (queryHint == null) {
            queryHint = "";
        }
        if (this.f672k0 && this.W != null) {
            int textSize = (int) (searchAutoComplete.getTextSize() * 1.25d);
            this.W.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(this.W), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchAutoComplete.setHint(queryHint);
    }

    public final void x() {
        int i10 = 0;
        if (!((this.f675n0 || this.f680s0) && !this.f673l0) || (this.M.getVisibility() != 0 && this.O.getVisibility() != 0)) {
            i10 = 8;
        }
        this.K.setVisibility(i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x001e, code lost:
        if (r2.f680s0 == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void y(boolean r3) {
        /*
            r2 = this;
            boolean r0 = r2.f675n0
            r1 = 0
            if (r0 == 0) goto L21
            if (r0 != 0) goto Lb
            boolean r0 = r2.f680s0
            if (r0 == 0) goto L11
        Lb:
            boolean r0 = r2.f673l0
            if (r0 != 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = r1
        L12:
            if (r0 == 0) goto L21
            boolean r0 = r2.hasFocus()
            if (r0 == 0) goto L21
            if (r3 != 0) goto L23
            boolean r3 = r2.f680s0
            if (r3 != 0) goto L21
            goto L23
        L21:
            r1 = 8
        L23:
            android.widget.ImageView r3 = r2.M
            r3.setVisibility(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.y(boolean):void");
    }

    public final void z(boolean z10) {
        this.f673l0 = z10;
        int i10 = 0;
        int i11 = z10 ? 0 : 8;
        boolean z11 = !TextUtils.isEmpty(this.H.getText());
        this.L.setVisibility(i11);
        y(z11);
        this.I.setVisibility(z10 ? 8 : 0);
        if (this.V.getDrawable() == null || this.f672k0) {
            i10 = 8;
        }
        this.V.setVisibility(i10);
        u();
        A(!z11);
        x();
    }
}
