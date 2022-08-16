package m4;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public interface s7 {
    void a(MotionEvent motionEvent);

    void b(View view);

    String c(Context context);

    @Deprecated
    void d(int i10, int i11, int i12);

    String e(Context context, View view);

    String f(Context context, String str, View view);

    String g(Context context, String str, View view, Activity activity);
}
