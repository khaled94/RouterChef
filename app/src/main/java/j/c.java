package j;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;

/* loaded from: classes.dex */
public final class c extends ContextWrapper {

    /* renamed from: a */
    public int f5319a;

    /* renamed from: b */
    public Resources.Theme f5320b;

    /* renamed from: c */
    public LayoutInflater f5321c;

    /* renamed from: d */
    public Configuration f5322d;

    /* renamed from: e */
    public Resources f5323e;

    public c() {
        super(null);
    }

    public c(Context context, int i10) {
        super(context);
        this.f5319a = i10;
    }

    public final void a(Configuration configuration) {
        if (this.f5323e == null) {
            if (this.f5322d != null) {
                throw new IllegalStateException("Override configuration has already been set");
            }
            this.f5322d = new Configuration(configuration);
            return;
        }
        throw new IllegalStateException("getResources() or getAssets() has already been called");
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void b() {
        if (this.f5320b == null) {
            this.f5320b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f5320b.setTo(theme);
            }
        }
        this.f5320b.applyStyle(this.f5319a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        if (this.f5323e == null) {
            Configuration configuration = this.f5322d;
            this.f5323e = configuration == null ? super.getResources() : createConfigurationContext(configuration).getResources();
        }
        return this.f5323e;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if ("layout_inflater".equals(str)) {
            if (this.f5321c == null) {
                this.f5321c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return this.f5321c;
        }
        return getBaseContext().getSystemService(str);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f5320b;
        if (theme != null) {
            return theme;
        }
        if (this.f5319a == 0) {
            this.f5319a = 2131952167;
        }
        b();
        return this.f5320b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i10) {
        if (this.f5319a != i10) {
            this.f5319a = i10;
            b();
        }
    }
}
