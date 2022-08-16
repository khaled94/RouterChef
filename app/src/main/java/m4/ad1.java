package m4;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.List;
import l3.s;
import n3.s1;

/* loaded from: classes.dex */
public final class ad1 implements dh1<Bundle> {

    /* renamed from: a */
    public final Context f6122a;

    /* renamed from: b */
    public final on f6123b;

    /* renamed from: c */
    public final List<Parcelable> f6124c;

    public ad1(Context context, on onVar, List<Parcelable> list) {
        this.f6122a = context;
        this.f6123b = onVar;
        this.f6124c = list;
    }

    @Override // m4.dh1
    public final void h(Bundle bundle) {
        List<ActivityManager.RunningTaskInfo> runningTasks;
        ActivityManager.RunningTaskInfo runningTaskInfo;
        ComponentName componentName;
        Bundle bundle2 = bundle;
        if (!qt.f12992a.e().booleanValue()) {
            return;
        }
        Bundle bundle3 = new Bundle();
        s1 s1Var = s.B.f5789c;
        String str = null;
        try {
            ActivityManager activityManager = (ActivityManager) this.f6122a.getSystemService("activity");
            if (activityManager != null && (runningTasks = activityManager.getRunningTasks(1)) != null && !runningTasks.isEmpty() && (runningTaskInfo = runningTasks.get(0)) != null && (componentName = runningTaskInfo.topActivity) != null) {
                str = componentName.getClassName();
            }
        } catch (Exception unused) {
        }
        bundle3.putString("activity", str);
        Bundle bundle4 = new Bundle();
        bundle4.putInt("width", this.f6123b.f12224w);
        bundle4.putInt("height", this.f6123b.f12221t);
        bundle3.putBundle("size", bundle4);
        if (this.f6124c.size() > 0) {
            List<Parcelable> list = this.f6124c;
            bundle3.putParcelableArray("parents", (Parcelable[]) list.toArray(new Parcelable[list.size()]));
        }
        bundle2.putBundle("view_hierarchy", bundle3);
    }
}
