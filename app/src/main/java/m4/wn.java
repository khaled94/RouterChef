package m4;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import f3.e;
import h6.a;

/* loaded from: classes.dex */
public final class wn implements v91 {

    /* renamed from: s */
    public final Object f15064s;

    /* renamed from: t */
    public final Object f15065t;

    public /* synthetic */ wn(Context context, AttributeSet attributeSet) {
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, a.V);
        String string = obtainAttributes.getString(0);
        String string2 = obtainAttributes.getString(1);
        boolean z10 = !TextUtils.isEmpty(string);
        boolean isEmpty = true ^ TextUtils.isEmpty(string2);
        if (z10 && !isEmpty) {
            this.f15064s = a(string);
        } else if (z10 || !isEmpty) {
            obtainAttributes.recycle();
            if (!z10) {
                throw new IllegalArgumentException("Required XML attribute \"adSize\" was missing.");
            }
            throw new IllegalArgumentException("Either XML attribute \"adSize\" or XML attribute \"supportedAdSizes\" should be specified, but not both.");
        } else {
            this.f15064s = a(string2);
        }
        String string3 = obtainAttributes.getString(2);
        this.f15065t = string3;
        obtainAttributes.recycle();
        if (!TextUtils.isEmpty(string3)) {
            return;
        }
        throw new IllegalArgumentException("Required XML attribute \"adUnitId\" was missing.");
    }

    public /* synthetic */ wn(Object obj, Object obj2) {
        this.f15064s = obj;
        this.f15065t = obj2;
    }

    public static e[] a(String str) {
        String[] split = str.split("\\s*,\\s*");
        int length = split.length;
        e[] eVarArr = new e[length];
        for (int i10 = 0; i10 < split.length; i10++) {
            String trim = split[i10].trim();
            if (trim.matches("^(\\d+|FULL_WIDTH)\\s*[xX]\\s*(\\d+|AUTO_HEIGHT)$")) {
                String[] split2 = trim.split("[xX]");
                split2[0] = split2[0].trim();
                split2[1] = split2[1].trim();
                try {
                    eVarArr[i10] = new e("FULL_WIDTH".equals(split2[0]) ? -1 : Integer.parseInt(split2[0]), "AUTO_HEIGHT".equals(split2[1]) ? -2 : Integer.parseInt(split2[1]));
                } catch (NumberFormatException unused) {
                    throw new IllegalArgumentException(trim.length() != 0 ? "Could not parse XML attribute \"adSize\": ".concat(trim) : new String("Could not parse XML attribute \"adSize\": "));
                }
            } else if ("BANNER".equals(trim)) {
                eVarArr[i10] = e.f4492h;
            } else if ("LARGE_BANNER".equals(trim)) {
                eVarArr[i10] = e.f4494j;
            } else if ("FULL_BANNER".equals(trim)) {
                eVarArr[i10] = e.f4493i;
            } else if ("LEADERBOARD".equals(trim)) {
                eVarArr[i10] = e.f4495k;
            } else if ("MEDIUM_RECTANGLE".equals(trim)) {
                eVarArr[i10] = e.f4496l;
            } else if ("SMART_BANNER".equals(trim)) {
                eVarArr[i10] = e.f4498n;
            } else if ("WIDE_SKYSCRAPER".equals(trim)) {
                eVarArr[i10] = e.f4497m;
            } else if ("FLUID".equals(trim)) {
                eVarArr[i10] = e.f4499o;
            } else if (!"ICON".equals(trim)) {
                throw new IllegalArgumentException(trim.length() != 0 ? "Could not parse XML attribute \"adSize\": ".concat(trim) : new String("Could not parse XML attribute \"adSize\": "));
            } else {
                eVarArr[i10] = e.f4500q;
            }
        }
        if (length == 0) {
            throw new IllegalArgumentException(str.length() != 0 ? "Could not parse XML attribute \"adSize\": ".concat(str) : new String("Could not parse XML attribute \"adSize\": "));
        }
        return eVarArr;
    }

    @Override // m4.v91
    public final void h(Object obj) {
        ((gg2) obj).n((xr) this.f15065t);
    }
}
