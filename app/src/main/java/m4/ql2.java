package m4;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.Display;
import android.view.WindowManager;
import android.view.accessibility.CaptioningManager;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ql2 extends ca0 {

    /* renamed from: k */
    public boolean f12918k;

    /* renamed from: l */
    public boolean f12919l;

    /* renamed from: m */
    public boolean f12920m;

    /* renamed from: n */
    public boolean f12921n;

    /* renamed from: o */
    public boolean f12922o;
    public final SparseArray<Map<s70, rl2>> p;

    /* renamed from: q */
    public final SparseBooleanArray f12923q;

    public ql2(Context context) {
        Point point;
        String[] split;
        DisplayManager displayManager;
        CaptioningManager captioningManager;
        int i10 = ls1.f10971a;
        if (i10 >= 19 && ((i10 >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled())) {
            this.f6755h = 1088;
            Locale locale = captioningManager.getLocale();
            if (locale != null) {
                this.f6754g = gw1.s(i10 >= 21 ? locale.toLanguageTag() : locale.toString());
            }
        }
        Display display = null;
        if (i10 >= 17 && (displayManager = (DisplayManager) context.getSystemService("display")) != null) {
            display = displayManager.getDisplay(0);
        }
        if (display == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            Objects.requireNonNull(windowManager);
            display = windowManager.getDefaultDisplay();
        }
        if (display.getDisplayId() == 0 && ls1.h(context)) {
            String n10 = ls1.n(i10 < 28 ? "sys.display-size" : "vendor.display-size");
            if (!TextUtils.isEmpty(n10)) {
                try {
                    split = n10.trim().split("x", -1);
                } catch (NumberFormatException unused) {
                }
                if (split.length == 2) {
                    int parseInt = Integer.parseInt(split[0]);
                    int parseInt2 = Integer.parseInt(split[1]);
                    if (parseInt > 0 && parseInt2 > 0) {
                        point = new Point(parseInt, parseInt2);
                        int i11 = point.x;
                        int i12 = point.y;
                        this.f6748a = i11;
                        this.f6749b = i12;
                        this.f6750c = true;
                        this.p = new SparseArray<>();
                        this.f12923q = new SparseBooleanArray();
                        this.f12918k = true;
                        this.f12919l = true;
                        this.f12920m = true;
                        this.f12921n = true;
                        this.f12922o = true;
                    }
                }
                String valueOf = String.valueOf(n10);
                Log.e("Util", valueOf.length() != 0 ? "Invalid display size: ".concat(valueOf) : new String("Invalid display size: "));
            }
            if ("Sony".equals(ls1.f10973c) && ls1.f10974d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                point = new Point(3840, 2160);
                int i112 = point.x;
                int i122 = point.y;
                this.f6748a = i112;
                this.f6749b = i122;
                this.f6750c = true;
                this.p = new SparseArray<>();
                this.f12923q = new SparseBooleanArray();
                this.f12918k = true;
                this.f12919l = true;
                this.f12920m = true;
                this.f12921n = true;
                this.f12922o = true;
            }
        }
        point = new Point();
        int i13 = ls1.f10971a;
        if (i13 >= 23) {
            Display.Mode mode = display.getMode();
            point.x = mode.getPhysicalWidth();
            point.y = mode.getPhysicalHeight();
        } else if (i13 >= 17) {
            display.getRealSize(point);
        } else {
            display.getSize(point);
        }
        int i1122 = point.x;
        int i1222 = point.y;
        this.f6748a = i1122;
        this.f6749b = i1222;
        this.f6750c = true;
        this.p = new SparseArray<>();
        this.f12923q = new SparseBooleanArray();
        this.f12918k = true;
        this.f12919l = true;
        this.f12920m = true;
        this.f12921n = true;
        this.f12922o = true;
    }

    public /* synthetic */ ql2(pl2 pl2Var) {
        super(pl2Var);
        this.f12918k = pl2Var.f12561k;
        this.f12919l = pl2Var.f12562l;
        this.f12920m = pl2Var.f12563m;
        this.f12921n = pl2Var.f12564n;
        this.f12922o = pl2Var.f12565o;
        SparseArray<Map<s70, rl2>> sparseArray = pl2Var.p;
        SparseArray<Map<s70, rl2>> sparseArray2 = new SparseArray<>();
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            sparseArray2.put(sparseArray.keyAt(i10), new HashMap(sparseArray.valueAt(i10)));
        }
        this.p = sparseArray2;
        this.f12923q = pl2Var.f12566q.clone();
    }
}
