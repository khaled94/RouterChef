package n3;

import android.app.KeyguardManager;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import l3.s;
import m4.aa0;
import m4.cm1;
import m4.es;
import m4.io;
import m4.jo;
import m4.mu1;
import m4.yr;
import m4.yt1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class v0 {
    public static Point a(MotionEvent motionEvent, View view) {
        int[] j3 = j(view);
        float rawX = motionEvent.getRawX();
        return new Point(((int) rawX) - j3[0], ((int) motionEvent.getRawY()) - j3[1]);
    }

    public static WindowManager.LayoutParams b() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 0, 0, -2);
        layoutParams.flags = ((Integer) jo.f10145d.f10148c.a(es.f8108h5)).intValue();
        layoutParams.type = 2;
        layoutParams.gravity = 8388659;
        return layoutParams;
    }

    public static JSONObject c(String str, Context context, Point point, Point point2) {
        Exception e10;
        JSONObject jSONObject;
        JSONObject jSONObject2 = null;
        try {
            jSONObject = new JSONObject();
        } catch (Exception e11) {
            e10 = e11;
        }
        try {
            JSONObject jSONObject3 = new JSONObject();
            try {
                int i10 = point2.x;
                io ioVar = io.f9708f;
                jSONObject3.put("x", ioVar.f9709a.a(context, i10));
                jSONObject3.put("y", ioVar.f9709a.a(context, point2.y));
                jSONObject3.put("start_x", ioVar.f9709a.a(context, point.x));
                jSONObject3.put("start_y", ioVar.f9709a.a(context, point.y));
                jSONObject2 = jSONObject3;
            } catch (JSONException e12) {
                g1.h("Error occurred while putting signals into JSON object.", e12);
            }
            jSONObject.put("click_point", jSONObject2);
            jSONObject.put("asset_id", str);
            return jSONObject;
        } catch (Exception e13) {
            e10 = e13;
            jSONObject2 = jSONObject;
            g1.h("Error occurred while grabbing click signals.", e10);
            return jSONObject2;
        }
    }

    public static JSONObject d(Context context, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, View view) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        View view2;
        JSONObject jSONObject3 = new JSONObject();
        if (map == null || view == null) {
            return jSONObject3;
        }
        int[] j3 = j(view);
        Iterator<Map.Entry<String, WeakReference<View>>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, WeakReference<View>> next = it.next();
            View view3 = next.getValue().get();
            if (view3 != null) {
                int[] j10 = j(view3);
                JSONObject jSONObject4 = new JSONObject();
                JSONObject jSONObject5 = new JSONObject();
                Iterator<Map.Entry<String, WeakReference<View>>> it2 = it;
                try {
                    int measuredWidth = view3.getMeasuredWidth();
                    JSONObject jSONObject6 = jSONObject3;
                    try {
                        io ioVar = io.f9708f;
                        jSONObject5.put("width", ioVar.f9709a.a(context, measuredWidth));
                        jSONObject5.put("height", ioVar.f9709a.a(context, view3.getMeasuredHeight()));
                        jSONObject5.put("x", ioVar.f9709a.a(context, j10[0] - j3[0]));
                        jSONObject5.put("y", ioVar.f9709a.a(context, j10[1] - j3[1]));
                        jSONObject5.put("relative_to", "ad_view");
                        jSONObject4.put("frame", jSONObject5);
                        Rect rect = new Rect();
                        if (view3.getLocalVisibleRect(rect)) {
                            jSONObject2 = k(context, rect);
                        } else {
                            JSONObject jSONObject7 = new JSONObject();
                            jSONObject7.put("width", 0);
                            jSONObject7.put("height", 0);
                            jSONObject7.put("x", ioVar.f9709a.a(context, j10[0] - j3[0]));
                            jSONObject7.put("y", ioVar.f9709a.a(context, j10[1] - j3[1]));
                            jSONObject7.put("relative_to", "ad_view");
                            jSONObject2 = jSONObject7;
                        }
                        jSONObject4.put("visible_bounds", jSONObject2);
                        if (view3 instanceof TextView) {
                            TextView textView = (TextView) view3;
                            jSONObject4.put("text_color", textView.getCurrentTextColor());
                            view2 = view3;
                            jSONObject4.put("font_size", textView.getTextSize());
                            jSONObject4.put("text", textView.getText());
                        } else {
                            view2 = view3;
                        }
                        jSONObject4.put("is_clickable", map2 != null && map2.containsKey(next.getKey()) && view2.isClickable());
                        jSONObject = jSONObject6;
                    } catch (JSONException unused) {
                        jSONObject = jSONObject6;
                    }
                } catch (JSONException unused2) {
                    jSONObject = jSONObject3;
                }
                try {
                    jSONObject.put(next.getKey(), jSONObject4);
                } catch (JSONException unused3) {
                    g1.j("Unable to get asset views information");
                    jSONObject3 = jSONObject;
                    it = it2;
                }
                jSONObject3 = jSONObject;
                it = it2;
            }
        }
        return jSONObject3;
    }

    public static JSONObject e(Context context, View view) {
        JSONObject jSONObject = new JSONObject();
        if (view == null) {
            return jSONObject;
        }
        try {
            s sVar = s.B;
            s1 s1Var = sVar.f5789c;
            jSONObject.put("can_show_on_lock_screen", s1.J(view));
            s1 s1Var2 = sVar.f5789c;
            boolean z10 = false;
            if (context != null) {
                Object systemService = context.getSystemService("keyguard");
                KeyguardManager keyguardManager = (systemService == null || !(systemService instanceof KeyguardManager)) ? null : (KeyguardManager) systemService;
                if (keyguardManager != null && keyguardManager.isKeyguardLocked()) {
                    z10 = true;
                }
            }
            jSONObject.put("is_keyguard_locked", z10);
        } catch (JSONException unused) {
            g1.j("Unable to get lock screen information");
        }
        return jSONObject;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
        if ((r1 == null ? -1 : ((android.widget.AdapterView) r1).getPositionForView(r6)) != (-1)) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static org.json.JSONObject f(android.view.View r6) {
        /*
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            if (r6 != 0) goto L8
            return r0
        L8:
            m4.yr<java.lang.Boolean> r1 = m4.es.f8085e5     // Catch: java.lang.Exception -> L58
            m4.jo r2 = m4.jo.f10145d     // Catch: java.lang.Exception -> L58
            m4.ds r2 = r2.f10148c     // Catch: java.lang.Exception -> L58
            java.lang.Object r1 = r2.a(r1)     // Catch: java.lang.Exception -> L58
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Exception -> L58
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Exception -> L58
            r2 = 0
            r3 = 1
            java.lang.String r4 = "contained_in_scroll_view"
            if (r1 == 0) goto L34
            l3.s r1 = l3.s.B     // Catch: java.lang.Exception -> L58
            n3.s1 r1 = r1.f5789c     // Catch: java.lang.Exception -> L58
            android.view.ViewParent r6 = r6.getParent()     // Catch: java.lang.Exception -> L58
        L26:
            if (r6 == 0) goto L31
            boolean r1 = r6 instanceof android.widget.ScrollView     // Catch: java.lang.Exception -> L58
            if (r1 != 0) goto L31
            android.view.ViewParent r6 = r6.getParent()     // Catch: java.lang.Exception -> L58
            goto L26
        L31:
            if (r6 != 0) goto L54
            goto L55
        L34:
            l3.s r1 = l3.s.B     // Catch: java.lang.Exception -> L58
            n3.s1 r1 = r1.f5789c     // Catch: java.lang.Exception -> L58
            android.view.ViewParent r1 = r6.getParent()     // Catch: java.lang.Exception -> L58
        L3c:
            if (r1 == 0) goto L47
            boolean r5 = r1 instanceof android.widget.AdapterView     // Catch: java.lang.Exception -> L58
            if (r5 != 0) goto L47
            android.view.ViewParent r1 = r1.getParent()     // Catch: java.lang.Exception -> L58
            goto L3c
        L47:
            r5 = -1
            if (r1 != 0) goto L4c
            r6 = r5
            goto L52
        L4c:
            android.widget.AdapterView r1 = (android.widget.AdapterView) r1     // Catch: java.lang.Exception -> L58
            int r6 = r1.getPositionForView(r6)     // Catch: java.lang.Exception -> L58
        L52:
            if (r6 == r5) goto L55
        L54:
            r2 = r3
        L55:
            r0.put(r4, r2)     // Catch: java.lang.Exception -> L58
        L58:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n3.v0.f(android.view.View):org.json.JSONObject");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:18|(11:63|20|21|61|22|59|33|34|(6:36|(4:40|45|(1:(1:48)(1:49))(1:50)|51)|44|45|(0)(0)|51)(6:41|(4:43|45|(0)(0)|51)|44|45|(0)(0)|51)|52|53)|31|32|59|33|34|(0)(0)|52|53) */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0168  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static org.json.JSONObject g(android.content.Context r16, android.view.View r17) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n3.v0.g(android.content.Context, android.view.View):org.json.JSONObject");
    }

    public static boolean h(Context context, cm1 cm1Var) {
        if (!cm1Var.K) {
            return false;
        }
        yr<Boolean> yrVar = es.f8092f5;
        jo joVar = jo.f10145d;
        if (((Boolean) joVar.f10148c.a(yrVar)).booleanValue()) {
            return ((Boolean) joVar.f10148c.a(es.f8116i5)).booleanValue();
        }
        String str = (String) joVar.f10148c.a(es.f8100g5);
        if (!str.isEmpty() && context != null) {
            String packageName = context.getPackageName();
            aa0 a10 = aa0.a(new yt1(';'));
            Iterator<String> l10 = ((mu1) a10.f6088t).l(a10, str);
            while (l10.hasNext()) {
                if (l10.next().equals(packageName)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean i(int i10) {
        yr<Boolean> yrVar = es.T1;
        jo joVar = jo.f10145d;
        if (((Boolean) joVar.f10148c.a(yrVar)).booleanValue()) {
            return ((Boolean) joVar.f10148c.a(es.U1)).booleanValue() || i10 <= 15299999;
        }
        return true;
    }

    public static int[] j(View view) {
        int[] iArr = new int[2];
        if (view != null) {
            view.getLocationOnScreen(iArr);
        }
        return iArr;
    }

    public static JSONObject k(Context context, Rect rect) {
        JSONObject jSONObject = new JSONObject();
        int i10 = rect.right;
        int i11 = rect.left;
        io ioVar = io.f9708f;
        jSONObject.put("width", ioVar.f9709a.a(context, i10 - i11));
        jSONObject.put("height", ioVar.f9709a.a(context, rect.bottom - rect.top));
        jSONObject.put("x", ioVar.f9709a.a(context, rect.left));
        jSONObject.put("y", ioVar.f9709a.a(context, rect.top));
        jSONObject.put("relative_to", "self");
        return jSONObject;
    }
}
