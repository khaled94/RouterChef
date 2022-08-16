package m4;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;

/* loaded from: classes.dex */
public final class bf0 extends MutableContextWrapper {

    /* renamed from: a */
    public Activity f6505a;

    /* renamed from: b */
    public Context f6506b;

    /* renamed from: c */
    public Context f6507c;

    public bf0(Context context) {
        super(context);
        setBaseContext(context);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        return this.f6507c.getSystemService(str);
    }

    @Override // android.content.MutableContextWrapper
    public final void setBaseContext(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f6506b = applicationContext;
        this.f6505a = context instanceof Activity ? (Activity) context : null;
        this.f6507c = context;
        super.setBaseContext(applicationContext);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        Activity activity = this.f6505a;
        if (activity != null) {
            activity.startActivity(intent);
            return;
        }
        intent.setFlags(268435456);
        this.f6506b.startActivity(intent);
    }
}
