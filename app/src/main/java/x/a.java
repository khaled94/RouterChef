package x;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import l0.g;
import org.xmlpull.v1.XmlPullParser;
import s.h;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    public boolean f19965a;

    /* renamed from: b */
    public String f19966b;

    /* renamed from: c */
    public int f19967c;

    /* renamed from: d */
    public int f19968d;

    /* renamed from: e */
    public float f19969e;

    /* renamed from: f */
    public String f19970f;

    /* renamed from: g */
    public boolean f19971g;

    /* renamed from: h */
    public int f19972h;

    public a(String str, int i10, Object obj, boolean z10) {
        this.f19966b = str;
        this.f19967c = i10;
        this.f19965a = z10;
        c(obj);
    }

    public a(a aVar, Object obj) {
        this.f19965a = false;
        this.f19966b = aVar.f19966b;
        this.f19967c = aVar.f19967c;
        c(obj);
    }

    public static void a(Context context, XmlPullParser xmlPullParser, HashMap<String, a> hashMap) {
        int i10;
        float f10;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), g.f5718w);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        int i11 = 0;
        boolean z10 = false;
        Object obj = null;
        for (int i12 = 0; i12 < indexCount; i12++) {
            int index = obtainStyledAttributes.getIndex(i12);
            int i13 = 1;
            if (index == 0) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == 10) {
                str = obtainStyledAttributes.getString(index);
                z10 = true;
            } else if (index == 1) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                i11 = 6;
            } else {
                if (index == 3) {
                    i13 = 3;
                } else if (index == 2) {
                    i13 = 4;
                } else {
                    if (index == 7) {
                        f10 = TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics());
                    } else if (index == 4) {
                        f10 = obtainStyledAttributes.getDimension(index, 0.0f);
                    } else if (index == 5) {
                        obj = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                        i11 = 2;
                    } else {
                        if (index == 6) {
                            i10 = obtainStyledAttributes.getInteger(index, -1);
                        } else if (index == 9) {
                            obj = obtainStyledAttributes.getString(index);
                            i11 = 5;
                        } else if (index == 8) {
                            i10 = obtainStyledAttributes.getResourceId(index, -1);
                            if (i10 == -1) {
                                i10 = obtainStyledAttributes.getInt(index, -1);
                            }
                            i13 = 8;
                        }
                        obj = Integer.valueOf(i10);
                        i11 = i13;
                    }
                    obj = Float.valueOf(f10);
                    i11 = 7;
                }
                i10 = obtainStyledAttributes.getColor(index, 0);
                obj = Integer.valueOf(i10);
                i11 = i13;
            }
        }
        if (str != null && obj != null) {
            hashMap.put(str, new a(str, i11, obj, z10));
        }
        obtainStyledAttributes.recycle();
    }

    public static void b(View view, HashMap<String, a> hashMap) {
        StringBuilder sb;
        Throwable e10;
        Class<?> cls = view.getClass();
        for (String str : hashMap.keySet()) {
            a aVar = hashMap.get(str);
            String c10 = !aVar.f19965a ? d7.a.c("set", str) : str;
            try {
            } catch (IllegalAccessException e11) {
                e10 = e11;
                sb = new StringBuilder();
                sb.append(" Custom Attribute \"");
                sb.append(str);
                sb.append("\" not found on ");
                sb.append(cls.getName());
                Log.e("TransitionLayout", sb.toString());
                e10.printStackTrace();
            } catch (NoSuchMethodException e12) {
                Log.e("TransitionLayout", e12.getMessage());
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(cls.getName());
                sb2.append(" must have a method ");
                sb2.append(c10);
                Log.e("TransitionLayout", sb2.toString());
            } catch (InvocationTargetException e13) {
                e10 = e13;
                sb = new StringBuilder();
                sb.append(" Custom Attribute \"");
                sb.append(str);
                sb.append("\" not found on ");
                sb.append(cls.getName());
                Log.e("TransitionLayout", sb.toString());
                e10.printStackTrace();
            }
            switch (h.b(aVar.f19967c)) {
                case 0:
                    cls.getMethod(c10, Integer.TYPE).invoke(view, Integer.valueOf(aVar.f19968d));
                    continue;
                case 1:
                    cls.getMethod(c10, Float.TYPE).invoke(view, Float.valueOf(aVar.f19969e));
                    continue;
                case 2:
                    cls.getMethod(c10, Integer.TYPE).invoke(view, Integer.valueOf(aVar.f19972h));
                    continue;
                case 3:
                    Method method = cls.getMethod(c10, Drawable.class);
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor(aVar.f19972h);
                    method.invoke(view, colorDrawable);
                    continue;
                case 4:
                    cls.getMethod(c10, CharSequence.class).invoke(view, aVar.f19970f);
                    continue;
                case 5:
                    cls.getMethod(c10, Boolean.TYPE).invoke(view, Boolean.valueOf(aVar.f19971g));
                    continue;
                case 6:
                    cls.getMethod(c10, Float.TYPE).invoke(view, Float.valueOf(aVar.f19969e));
                    continue;
                case 7:
                    cls.getMethod(c10, Integer.TYPE).invoke(view, Integer.valueOf(aVar.f19968d));
                    continue;
                default:
                    continue;
            }
            Log.e("TransitionLayout", e12.getMessage());
            Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName());
            StringBuilder sb22 = new StringBuilder();
            sb22.append(cls.getName());
            sb22.append(" must have a method ");
            sb22.append(c10);
            Log.e("TransitionLayout", sb22.toString());
        }
    }

    public final void c(Object obj) {
        switch (h.b(this.f19967c)) {
            case 0:
            case 7:
                this.f19968d = ((Integer) obj).intValue();
                return;
            case 1:
            case 6:
                this.f19969e = ((Float) obj).floatValue();
                return;
            case 2:
            case 3:
                this.f19972h = ((Integer) obj).intValue();
                return;
            case 4:
                this.f19970f = (String) obj;
                return;
            case 5:
                this.f19971g = ((Boolean) obj).booleanValue();
                return;
            default:
                return;
        }
    }
}
