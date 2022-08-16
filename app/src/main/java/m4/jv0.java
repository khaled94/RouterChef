package m4;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public interface jv0 {
    boolean F();

    boolean a(Bundle bundle);

    void b(wp wpVar);

    void c(Bundle bundle);

    void d();

    void e();

    void f();

    JSONObject g(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2);

    void h(yp ypVar);

    void i(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2);

    void j(Bundle bundle);

    void k();

    void l(String str);

    void m(View view);

    void n(View view, View view2, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z10);

    void o(View view);

    void p(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z10);

    void q(MotionEvent motionEvent, View view);

    void r(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener);

    void s();

    void t(bw bwVar);

    JSONObject u(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2);

    void v();
}
