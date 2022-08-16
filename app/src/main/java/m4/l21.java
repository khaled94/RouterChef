package m4;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import j4.b;
import j4.c;
import java.io.ByteArrayOutputStream;
import l3.s;
import n3.s1;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class l21 {

    /* renamed from: a */
    public final Context f10641a;

    /* renamed from: b */
    public final ApplicationInfo f10642b;

    /* renamed from: c */
    public final int f10643c;

    /* renamed from: d */
    public final int f10644d;

    /* renamed from: e */
    public String f10645e = "";

    public l21(Context context) {
        this.f10641a = context;
        this.f10642b = context.getApplicationInfo();
        yr<Integer> yrVar = es.f8093f6;
        jo joVar = jo.f10145d;
        this.f10643c = ((Integer) joVar.f10148c.a(yrVar)).intValue();
        this.f10644d = ((Integer) joVar.f10148c.a(es.f8101g6)).intValue();
    }

    public final JSONObject a() {
        Drawable drawable;
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", c.a(this.f10641a).c(this.f10642b.packageName));
        } catch (PackageManager.NameNotFoundException unused) {
        }
        jSONObject.put("packageName", this.f10642b.packageName);
        s1 s1Var = s.B.f5789c;
        jSONObject.put("adMobAppId", s1.L(this.f10641a));
        if (this.f10645e.isEmpty()) {
            try {
                b a10 = c.a(this.f10641a);
                ApplicationInfo applicationInfo = a10.f5450a.getPackageManager().getApplicationInfo(this.f10642b.packageName, 0);
                a10.f5450a.getPackageManager().getApplicationLabel(applicationInfo);
                drawable = a10.f5450a.getPackageManager().getApplicationIcon(applicationInfo);
                Drawable drawable2 = drawable;
            } catch (PackageManager.NameNotFoundException unused2) {
                drawable = null;
            }
            if (drawable == null) {
                str = "";
            } else {
                drawable.setBounds(0, 0, this.f10643c, this.f10644d);
                Bitmap createBitmap = Bitmap.createBitmap(this.f10643c, this.f10644d, Bitmap.Config.ARGB_8888);
                drawable.draw(new Canvas(createBitmap));
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                createBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                str = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            }
            this.f10645e = str;
        }
        if (!this.f10645e.isEmpty()) {
            jSONObject.put("icon", this.f10645e);
            jSONObject.put("iconWidthPx", this.f10643c);
            jSONObject.put("iconHeightPx", this.f10644d);
        }
        return jSONObject;
    }
}
