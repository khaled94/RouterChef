package d0;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import j0.g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class e {

    /* loaded from: classes.dex */
    public static class a {
        public static int a(TypedArray typedArray, int i10) {
            return typedArray.getType(i10);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    /* loaded from: classes.dex */
    public static final class c implements b {

        /* renamed from: a */
        public final d[] f3691a;

        public c(d[] dVarArr) {
            this.f3691a = dVarArr;
        }
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a */
        public final String f3692a;

        /* renamed from: b */
        public final int f3693b;

        /* renamed from: c */
        public final boolean f3694c;

        /* renamed from: d */
        public final String f3695d;

        /* renamed from: e */
        public final int f3696e;

        /* renamed from: f */
        public final int f3697f;

        public d(String str, int i10, boolean z10, String str2, int i11, int i12) {
            this.f3692a = str;
            this.f3693b = i10;
            this.f3694c = z10;
            this.f3695d = str2;
            this.f3696e = i11;
            this.f3697f = i12;
        }
    }

    /* renamed from: d0.e$e */
    /* loaded from: classes.dex */
    public static final class C0054e implements b {

        /* renamed from: a */
        public final g f3698a;

        /* renamed from: b */
        public final int f3699b;

        /* renamed from: c */
        public final int f3700c;

        /* renamed from: d */
        public final String f3701d;

        public C0054e(g gVar, int i10, int i11, String str) {
            this.f3698a = gVar;
            this.f3700c = i10;
            this.f3699b = i11;
            this.f3701d = str;
        }
    }

    public static b a(XmlPullParser xmlPullParser, Resources resources) {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            xmlPullParser.require(2, null, "font-family");
            if (xmlPullParser.getName().equals("font-family")) {
                TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), a0.a.f3t);
                String string = obtainAttributes.getString(0);
                String string2 = obtainAttributes.getString(4);
                String string3 = obtainAttributes.getString(5);
                int resourceId = obtainAttributes.getResourceId(1, 0);
                int integer = obtainAttributes.getInteger(2, 1);
                int integer2 = obtainAttributes.getInteger(3, 500);
                String string4 = obtainAttributes.getString(6);
                obtainAttributes.recycle();
                if (string != null && string2 != null && string3 != null) {
                    while (xmlPullParser.next() != 3) {
                        c(xmlPullParser);
                    }
                    return new C0054e(new g(string, string2, string3, b(resources, resourceId)), integer, integer2, string4);
                }
                ArrayList arrayList = new ArrayList();
                while (xmlPullParser.next() != 3) {
                    if (xmlPullParser.getEventType() == 2) {
                        if (xmlPullParser.getName().equals("font")) {
                            TypedArray obtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), a0.a.f4u);
                            int i10 = 8;
                            if (!obtainAttributes2.hasValue(8)) {
                                i10 = 1;
                            }
                            int i11 = obtainAttributes2.getInt(i10, 400);
                            boolean z10 = 1 == obtainAttributes2.getInt(obtainAttributes2.hasValue(6) ? 6 : 2, 0);
                            int i12 = 9;
                            if (!obtainAttributes2.hasValue(9)) {
                                i12 = 3;
                            }
                            int i13 = 7;
                            if (!obtainAttributes2.hasValue(7)) {
                                i13 = 4;
                            }
                            String string5 = obtainAttributes2.getString(i13);
                            int i14 = obtainAttributes2.getInt(i12, 0);
                            int i15 = obtainAttributes2.hasValue(5) ? 5 : 0;
                            int resourceId2 = obtainAttributes2.getResourceId(i15, 0);
                            String string6 = obtainAttributes2.getString(i15);
                            obtainAttributes2.recycle();
                            while (xmlPullParser.next() != 3) {
                                c(xmlPullParser);
                            }
                            arrayList.add(new d(string6, i11, z10, string5, i14, resourceId2));
                        } else {
                            c(xmlPullParser);
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    return new c((d[]) arrayList.toArray(new d[0]));
                }
            } else {
                c(xmlPullParser);
            }
            return null;
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static List<List<byte[]>> b(Resources resources, int i10) {
        if (i10 == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i10);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (a.a(obtainTypedArray, 0) == 1) {
                for (int i11 = 0; i11 < obtainTypedArray.length(); i11++) {
                    int resourceId = obtainTypedArray.getResourceId(i11, 0);
                    if (resourceId != 0) {
                        arrayList.add(d(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(d(resources.getStringArray(i10)));
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static void c(XmlPullParser xmlPullParser) {
        int i10 = 1;
        while (i10 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i10++;
            } else if (next == 3) {
                i10--;
            }
        }
    }

    public static List<byte[]> d(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }
}
