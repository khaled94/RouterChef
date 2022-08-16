package x;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.util.ArrayList;
import l0.g;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a */
    public final ConstraintLayout f19973a;

    /* renamed from: b */
    public int f19974b = -1;

    /* renamed from: c */
    public int f19975c = -1;

    /* renamed from: d */
    public SparseArray<a> f19976d = new SparseArray<>();

    /* renamed from: e */
    public SparseArray<androidx.constraintlayout.widget.b> f19977e = new SparseArray<>();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public int f19978a;

        /* renamed from: b */
        public ArrayList<C0147b> f19979b = new ArrayList<>();

        /* renamed from: c */
        public int f19980c;

        /* renamed from: d */
        public androidx.constraintlayout.widget.b f19981d;

        public a(Context context, XmlPullParser xmlPullParser) {
            this.f19980c = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), g.B);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 0) {
                    this.f19978a = obtainStyledAttributes.getResourceId(index, this.f19978a);
                } else if (index == 1) {
                    this.f19980c = obtainStyledAttributes.getResourceId(index, this.f19980c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f19980c);
                    context.getResources().getResourceName(this.f19980c);
                    if ("layout".equals(resourceTypeName)) {
                        androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
                        this.f19981d = bVar;
                        bVar.c((ConstraintLayout) LayoutInflater.from(context).inflate(this.f19980c, (ViewGroup) null));
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        public final int a(float f10, float f11) {
            for (int i10 = 0; i10 < this.f19979b.size(); i10++) {
                if (this.f19979b.get(i10).a(f10, f11)) {
                    return i10;
                }
            }
            return -1;
        }
    }

    /* renamed from: x.b$b */
    /* loaded from: classes.dex */
    public static class C0147b {

        /* renamed from: a */
        public float f19982a;

        /* renamed from: b */
        public float f19983b;

        /* renamed from: c */
        public float f19984c;

        /* renamed from: d */
        public float f19985d;

        /* renamed from: e */
        public int f19986e;

        /* renamed from: f */
        public androidx.constraintlayout.widget.b f19987f;

        public C0147b(Context context, XmlPullParser xmlPullParser) {
            this.f19982a = Float.NaN;
            this.f19983b = Float.NaN;
            this.f19984c = Float.NaN;
            this.f19985d = Float.NaN;
            this.f19986e = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), g.D);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 0) {
                    this.f19986e = obtainStyledAttributes.getResourceId(index, this.f19986e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f19986e);
                    context.getResources().getResourceName(this.f19986e);
                    if ("layout".equals(resourceTypeName)) {
                        androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
                        this.f19987f = bVar;
                        bVar.c((ConstraintLayout) LayoutInflater.from(context).inflate(this.f19986e, (ViewGroup) null));
                    }
                } else if (index == 1) {
                    this.f19985d = obtainStyledAttributes.getDimension(index, this.f19985d);
                } else if (index == 2) {
                    this.f19983b = obtainStyledAttributes.getDimension(index, this.f19983b);
                } else if (index == 3) {
                    this.f19984c = obtainStyledAttributes.getDimension(index, this.f19984c);
                } else if (index == 4) {
                    this.f19982a = obtainStyledAttributes.getDimension(index, this.f19982a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            obtainStyledAttributes.recycle();
        }

        public final boolean a(float f10, float f11) {
            if (Float.isNaN(this.f19982a) || f10 >= this.f19982a) {
                if (!Float.isNaN(this.f19983b) && f11 < this.f19983b) {
                    return false;
                }
                if (!Float.isNaN(this.f19984c) && f10 > this.f19984c) {
                    return false;
                }
                return Float.isNaN(this.f19985d) || f11 <= this.f19985d;
            }
            return false;
        }
    }

    public b(Context context, ConstraintLayout constraintLayout, int i10) {
        this.f19973a = constraintLayout;
        XmlResourceParser xml = context.getResources().getXml(i10);
        a aVar = null;
        try {
            int eventType = xml.getEventType();
            while (true) {
                boolean z10 = true;
                if (eventType == 1) {
                    return;
                }
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                z10 = true;
                                break;
                            }
                            z10 = true;
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                z10 = true;
                                break;
                            }
                            z10 = true;
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                break;
                            }
                            z10 = true;
                            break;
                        case 1657696882:
                            if (name.equals("layoutDescription")) {
                                z10 = false;
                                break;
                            }
                            z10 = true;
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                z10 = true;
                                break;
                            }
                            z10 = true;
                            break;
                        default:
                            z10 = true;
                            break;
                    }
                    if (z10) {
                        aVar = new a(context, xml);
                        this.f19976d.put(aVar.f19978a, aVar);
                    } else if (z10) {
                        C0147b c0147b = new C0147b(context, xml);
                        if (aVar != null) {
                            aVar.f19979b.add(c0147b);
                        }
                    } else if (z10) {
                        a(context, xml);
                    }
                }
                eventType = xml.next();
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:140:0x0226, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(android.content.Context r12, org.xmlpull.v1.XmlPullParser r13) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x.b.a(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }
}
