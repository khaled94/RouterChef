package androidx.appcompat.app;

import a6.f;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.raouf.routerchef.R;
import e.m;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class AlertController {
    public TextView A;
    public TextView B;
    public View C;
    public ListAdapter D;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public boolean L;
    public c M;

    /* renamed from: a */
    public final Context f446a;

    /* renamed from: b */
    public final m f447b;

    /* renamed from: c */
    public final Window f448c;

    /* renamed from: d */
    public final int f449d;

    /* renamed from: e */
    public CharSequence f450e;

    /* renamed from: f */
    public CharSequence f451f;

    /* renamed from: g */
    public RecycleListView f452g;

    /* renamed from: h */
    public View f453h;

    /* renamed from: i */
    public int f454i;

    /* renamed from: k */
    public Button f456k;

    /* renamed from: l */
    public CharSequence f457l;

    /* renamed from: m */
    public Message f458m;

    /* renamed from: n */
    public Drawable f459n;

    /* renamed from: o */
    public Button f460o;
    public CharSequence p;

    /* renamed from: q */
    public Message f461q;

    /* renamed from: r */
    public Drawable f462r;

    /* renamed from: s */
    public Button f463s;

    /* renamed from: t */
    public CharSequence f464t;

    /* renamed from: u */
    public Message f465u;

    /* renamed from: v */
    public Drawable f466v;

    /* renamed from: w */
    public NestedScrollView f467w;
    public Drawable y;

    /* renamed from: z */
    public ImageView f469z;

    /* renamed from: j */
    public boolean f455j = false;

    /* renamed from: x */
    public int f468x = 0;
    public int E = -1;
    public final a N = new a();

    /* loaded from: classes.dex */
    public static class RecycleListView extends ListView {

        /* renamed from: s */
        public final int f470s;

        /* renamed from: t */
        public final int f471t;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.L);
            this.f471t = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
            this.f470s = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
        }
    }

    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
            AlertController.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Message message;
            Message message2;
            AlertController alertController = AlertController.this;
            Message obtain = ((view != alertController.f456k || (message = alertController.f458m) == null) && (view != alertController.f460o || (message = alertController.f461q) == null)) ? (view != alertController.f463s || (message2 = alertController.f465u) == null) ? null : Message.obtain(message2) : Message.obtain(message);
            if (obtain != null) {
                obtain.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.M.obtainMessage(1, alertController2.f447b).sendToTarget();
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        public final Context f473a;

        /* renamed from: b */
        public final LayoutInflater f474b;

        /* renamed from: c */
        public Drawable f475c;

        /* renamed from: d */
        public CharSequence f476d;

        /* renamed from: e */
        public View f477e;

        /* renamed from: f */
        public CharSequence f478f;

        /* renamed from: g */
        public CharSequence f479g;

        /* renamed from: h */
        public DialogInterface.OnClickListener f480h;

        /* renamed from: i */
        public CharSequence f481i;

        /* renamed from: j */
        public DialogInterface.OnClickListener f482j;

        /* renamed from: k */
        public DialogInterface.OnDismissListener f483k;

        /* renamed from: l */
        public DialogInterface.OnKeyListener f484l;

        /* renamed from: m */
        public CharSequence[] f485m;

        /* renamed from: n */
        public ListAdapter f486n;

        /* renamed from: o */
        public DialogInterface.OnClickListener f487o;
        public View p;

        /* renamed from: q */
        public boolean[] f488q;

        /* renamed from: r */
        public boolean f489r;

        /* renamed from: s */
        public boolean f490s;

        /* renamed from: t */
        public int f491t = -1;

        /* renamed from: u */
        public DialogInterface.OnMultiChoiceClickListener f492u;

        public b(Context context) {
            this.f473a = context;
            this.f474b = (LayoutInflater) context.getSystemService("layout_inflater");
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends Handler {

        /* renamed from: a */
        public WeakReference<DialogInterface> f493a;

        public c(DialogInterface dialogInterface) {
            this.f493a = new WeakReference<>(dialogInterface);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == -3 || i10 == -2 || i10 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f493a.get(), message.what);
            } else if (i10 != 1) {
            } else {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class d extends ArrayAdapter<CharSequence> {
        public d(Context context, int i10, CharSequence[] charSequenceArr) {
            super(context, i10, 16908308, charSequenceArr);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public final long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public final boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, m mVar, Window window) {
        this.f446a = context;
        this.f447b = mVar;
        this.f448c = window;
        this.M = new c(mVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, f.f188w, R.attr.alertDialogStyle, 0);
        this.F = obtainStyledAttributes.getResourceId(0, 0);
        this.G = obtainStyledAttributes.getResourceId(2, 0);
        this.H = obtainStyledAttributes.getResourceId(4, 0);
        this.I = obtainStyledAttributes.getResourceId(5, 0);
        this.J = obtainStyledAttributes.getResourceId(7, 0);
        this.K = obtainStyledAttributes.getResourceId(3, 0);
        this.L = obtainStyledAttributes.getBoolean(6, true);
        this.f449d = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        mVar.a().r(1);
    }

    public static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public static void c(View view, View view2, View view3) {
        int i10 = 0;
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            if (!view.canScrollVertically(1)) {
                i10 = 4;
            }
            view3.setVisibility(i10);
        }
    }

    public final void b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    public final ViewGroup d(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public final void e(int i10, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        Message obtainMessage = onClickListener != null ? this.M.obtainMessage(i10, onClickListener) : null;
        if (i10 == -3) {
            this.f464t = charSequence;
            this.f465u = obtainMessage;
            this.f466v = null;
        } else if (i10 == -2) {
            this.p = charSequence;
            this.f461q = obtainMessage;
            this.f462r = null;
        } else if (i10 != -1) {
            throw new IllegalArgumentException("Button does not exist");
        } else {
            this.f457l = charSequence;
            this.f458m = obtainMessage;
            this.f459n = null;
        }
    }
}
