package m4;

import android.content.Context;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.PowerManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import java.util.List;
import l3.s;
import n3.f;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zi0 implements k00<cj0> {

    /* renamed from: s */
    public final Context f16238s;

    /* renamed from: t */
    public final nh f16239t;

    /* renamed from: u */
    public final PowerManager f16240u;

    public zi0(Context context, nh nhVar) {
        this.f16238s = context;
        this.f16239t = nhVar;
        this.f16240u = (PowerManager) context.getSystemService("power");
    }

    /* renamed from: b */
    public final JSONObject a(cj0 cj0Var) {
        JSONObject jSONObject;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        qh qhVar = cj0Var.f6999e;
        if (qhVar == null) {
            jSONObject = new JSONObject();
        } else if (this.f16239t.f11772b == null) {
            throw new JSONException("Active view Info cannot be null.");
        } else {
            boolean z10 = qhVar.f12857a;
            JSONObject jSONObject3 = new JSONObject();
            JSONObject put = jSONObject3.put("afmaVersion", this.f16239t.f11774d).put("activeViewJSON", this.f16239t.f11772b).put("timestamp", cj0Var.f6997c).put("adFormat", this.f16239t.f11771a).put("hashCode", this.f16239t.f11773c).put("isMraid", false).put("isStopped", false).put("isPaused", cj0Var.f6996b).put("isNative", this.f16239t.f11775e).put("isScreenOn", this.f16240u.isInteractive());
            s sVar = s.B;
            put.put("appMuted", sVar.f5794h.c()).put("appVolume", sVar.f5794h.a()).put("deviceVolume", f.b(this.f16238s.getApplicationContext()));
            yr<Boolean> yrVar = es.D3;
            jo joVar = jo.f10145d;
            if (((Boolean) joVar.f10148c.a(yrVar)).booleanValue()) {
                AudioManager audioManager = (AudioManager) this.f16238s.getApplicationContext().getSystemService("audio");
                Integer valueOf = audioManager == null ? null : Integer.valueOf(audioManager.getMode());
                if (valueOf != null) {
                    jSONObject3.put("audioMode", valueOf);
                }
            }
            Rect rect = new Rect();
            Display defaultDisplay = ((WindowManager) this.f16238s.getSystemService("window")).getDefaultDisplay();
            rect.right = defaultDisplay.getWidth();
            rect.bottom = defaultDisplay.getHeight();
            jSONObject3.put("windowVisibility", qhVar.f12858b).put("isAttachedToWindow", z10).put("viewBox", new JSONObject().put("top", qhVar.f12859c.top).put("bottom", qhVar.f12859c.bottom).put("left", qhVar.f12859c.left).put("right", qhVar.f12859c.right)).put("adBox", new JSONObject().put("top", qhVar.f12860d.top).put("bottom", qhVar.f12860d.bottom).put("left", qhVar.f12860d.left).put("right", qhVar.f12860d.right)).put("globalVisibleBox", new JSONObject().put("top", qhVar.f12861e.top).put("bottom", qhVar.f12861e.bottom).put("left", qhVar.f12861e.left).put("right", qhVar.f12861e.right)).put("globalVisibleBoxVisible", qhVar.f12862f).put("localVisibleBox", new JSONObject().put("top", qhVar.f12863g.top).put("bottom", qhVar.f12863g.bottom).put("left", qhVar.f12863g.left).put("right", qhVar.f12863g.right)).put("localVisibleBoxVisible", qhVar.f12864h).put("hitBox", new JSONObject().put("top", qhVar.f12865i.top).put("bottom", qhVar.f12865i.bottom).put("left", qhVar.f12865i.left).put("right", qhVar.f12865i.right)).put("screenDensity", this.f16238s.getResources().getDisplayMetrics().density);
            jSONObject3.put("isVisible", cj0Var.f6995a);
            if (((Boolean) joVar.f10148c.a(es.T0)).booleanValue()) {
                JSONArray jSONArray2 = new JSONArray();
                List<Rect> list = qhVar.f12867k;
                if (list != null) {
                    for (Rect rect2 : list) {
                        jSONArray2.put(new JSONObject().put("top", rect2.top).put("bottom", rect2.bottom).put("left", rect2.left).put("right", rect2.right));
                    }
                }
                jSONObject3.put("scrollableContainerBoxes", jSONArray2);
            }
            if (!TextUtils.isEmpty(cj0Var.f6998d)) {
                jSONObject3.put("doneReasonCode", "u");
            }
            jSONObject = jSONObject3;
        }
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }
}
