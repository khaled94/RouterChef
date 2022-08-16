package e;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.e;
import androidx.appcompat.widget.h;
import androidx.appcompat.widget.h0;
import androidx.appcompat.widget.w;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import r.g;

/* loaded from: classes.dex */
public class n {

    /* renamed from: b */
    public static final Class<?>[] f4246b = {Context.class, AttributeSet.class};

    /* renamed from: c */
    public static final int[] f4247c = {16843375};

    /* renamed from: d */
    public static final int[] f4248d = {16844160};

    /* renamed from: e */
    public static final int[] f4249e = {16844156};

    /* renamed from: f */
    public static final int[] f4250f = {16844148};

    /* renamed from: g */
    public static final String[] f4251g = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: h */
    public static final g<String, Constructor<? extends View>> f4252h = new g<>();

    /* renamed from: a */
    public final Object[] f4253a = new Object[2];

    /* loaded from: classes.dex */
    public static class a implements View.OnClickListener {

        /* renamed from: s */
        public final View f4254s;

        /* renamed from: t */
        public final String f4255t;

        /* renamed from: u */
        public Method f4256u;

        /* renamed from: v */
        public Context f4257v;

        public a(View view, String str) {
            this.f4254s = view;
            this.f4255t = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            String str;
            Method method;
            if (this.f4256u == null) {
                Context context = this.f4254s.getContext();
                while (context != null) {
                    try {
                        if (!context.isRestricted() && (method = context.getClass().getMethod(this.f4255t, View.class)) != null) {
                            this.f4256u = method;
                            this.f4257v = context;
                        }
                    } catch (NoSuchMethodException unused) {
                    }
                    context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
                }
                int id = this.f4254s.getId();
                if (id == -1) {
                    str = "";
                } else {
                    StringBuilder c10 = androidx.activity.result.a.c(" with id '");
                    c10.append(this.f4254s.getContext().getResources().getResourceEntryName(id));
                    c10.append("'");
                    str = c10.toString();
                }
                StringBuilder c11 = androidx.activity.result.a.c("Could not find method ");
                c11.append(this.f4255t);
                c11.append("(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                c11.append(this.f4254s.getClass());
                c11.append(str);
                throw new IllegalStateException(c11.toString());
            }
            try {
                this.f4256u.invoke(this.f4257v, view);
            } catch (IllegalAccessException e10) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e10);
            } catch (InvocationTargetException e11) {
                throw new IllegalStateException("Could not execute method for android:onClick", e11);
            }
        }
    }

    public e a(Context context, AttributeSet attributeSet) {
        return new e(context, attributeSet);
    }

    public androidx.appcompat.widget.g b(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.g(context, attributeSet);
    }

    public h c(Context context, AttributeSet attributeSet) {
        return new h(context, attributeSet);
    }

    public w d(Context context, AttributeSet attributeSet) {
        return new w(context, attributeSet);
    }

    public h0 e(Context context, AttributeSet attributeSet) {
        return new h0(context, attributeSet);
    }

    public final View f(Context context, String str, String str2) {
        String str3;
        g<String, Constructor<? extends View>> gVar = f4252h;
        Constructor<? extends View> orDefault = gVar.getOrDefault(str, null);
        if (orDefault == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            orDefault = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f4246b);
            gVar.put(str, orDefault);
        }
        orDefault.setAccessible(true);
        return orDefault.newInstance(this.f4253a);
    }

    public final void g(View view, String str) {
        if (view != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }
}
