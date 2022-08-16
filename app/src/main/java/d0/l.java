package d0;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class l {
    public static int a(Context context, int i10, int i11) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i10, typedValue, true);
        return typedValue.resourceId != 0 ? i10 : i11;
    }

    public static boolean b(TypedArray typedArray, int i10, int i11, boolean z10) {
        return typedArray.getBoolean(i10, typedArray.getBoolean(i11, z10));
    }

    public static int c(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i10) {
        if (!k(xmlPullParser, str)) {
            return 0;
        }
        return typedArray.getColor(i10, 0);
    }

    public static d d(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i10) {
        d dVar;
        if (k(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i10, typedValue);
            int i11 = typedValue.type;
            if (i11 >= 28 && i11 <= 31) {
                return new d(null, null, typedValue.data);
            }
            try {
                dVar = d.a(typedArray.getResources(), typedArray.getResourceId(i10, 0), theme);
            } catch (Exception e10) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e10);
                dVar = null;
            }
            if (dVar != null) {
                return dVar;
            }
        }
        return new d(null, null, 0);
    }

    public static float e(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i10, float f10) {
        return !k(xmlPullParser, str) ? f10 : typedArray.getFloat(i10, f10);
    }

    public static int f(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i10, int i11) {
        return !k(xmlPullParser, str) ? i11 : typedArray.getInt(i10, i11);
    }

    public static String g(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i10) {
        if (!k(xmlPullParser, str)) {
            return null;
        }
        return typedArray.getString(i10);
    }

    public static int h(TypedArray typedArray) {
        return typedArray.getResourceId(23, typedArray.getResourceId(0, 0));
    }

    public static String i(TypedArray typedArray, int i10, int i11) {
        String string = typedArray.getString(i10);
        return string == null ? typedArray.getString(i11) : string;
    }

    public static CharSequence[] j(TypedArray typedArray, int i10, int i11) {
        CharSequence[] textArray = typedArray.getTextArray(i10);
        return textArray == null ? typedArray.getTextArray(i11) : textArray;
    }

    public static boolean k(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static TypedArray l(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}
