package j;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.f1;
import androidx.appcompat.widget.m0;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import k.c;
import m0.j;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class f extends MenuInflater {

    /* renamed from: e */
    public static final Class<?>[] f5335e;

    /* renamed from: f */
    public static final Class<?>[] f5336f;

    /* renamed from: a */
    public final Object[] f5337a;

    /* renamed from: b */
    public final Object[] f5338b;

    /* renamed from: c */
    public Context f5339c;

    /* renamed from: d */
    public Object f5340d;

    /* loaded from: classes.dex */
    public static class a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: u */
        public static final Class<?>[] f5341u = {MenuItem.class};

        /* renamed from: s */
        public Object f5342s;

        /* renamed from: t */
        public Method f5343t;

        public a(Object obj, String str) {
            this.f5342s = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f5343t = cls.getMethod(str, f5341u);
            } catch (Exception e10) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e10);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public final boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f5343t.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f5343t.invoke(this.f5342s, menuItem)).booleanValue();
                }
                this.f5343t.invoke(this.f5342s, menuItem);
                return true;
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b {
        public CharSequence A;
        public CharSequence B;

        /* renamed from: a */
        public Menu f5344a;

        /* renamed from: h */
        public boolean f5351h;

        /* renamed from: i */
        public int f5352i;

        /* renamed from: j */
        public int f5353j;

        /* renamed from: k */
        public CharSequence f5354k;

        /* renamed from: l */
        public CharSequence f5355l;

        /* renamed from: m */
        public int f5356m;

        /* renamed from: n */
        public char f5357n;

        /* renamed from: o */
        public int f5358o;
        public char p;

        /* renamed from: q */
        public int f5359q;

        /* renamed from: r */
        public int f5360r;

        /* renamed from: s */
        public boolean f5361s;

        /* renamed from: t */
        public boolean f5362t;

        /* renamed from: u */
        public boolean f5363u;

        /* renamed from: v */
        public int f5364v;

        /* renamed from: w */
        public int f5365w;

        /* renamed from: x */
        public String f5366x;
        public String y;

        /* renamed from: z */
        public m0.b f5367z;
        public ColorStateList C = null;
        public PorterDuff.Mode D = null;

        /* renamed from: b */
        public int f5345b = 0;

        /* renamed from: c */
        public int f5346c = 0;

        /* renamed from: d */
        public int f5347d = 0;

        /* renamed from: e */
        public int f5348e = 0;

        /* renamed from: f */
        public boolean f5349f = true;

        /* renamed from: g */
        public boolean f5350g = true;

        public b(Menu menu) {
            f.this = r1;
            this.f5344a = menu;
        }

        public final SubMenu a() {
            this.f5351h = true;
            SubMenu addSubMenu = this.f5344a.addSubMenu(this.f5345b, this.f5352i, this.f5353j, this.f5354k);
            c(addSubMenu.getItem());
            return addSubMenu;
        }

        public final <T> T b(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, f.this.f5339c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e10) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e10);
                return null;
            }
        }

        public final void c(MenuItem menuItem) {
            boolean z10 = false;
            menuItem.setChecked(this.f5361s).setVisible(this.f5362t).setEnabled(this.f5363u).setCheckable(this.f5360r >= 1).setTitleCondensed(this.f5355l).setIcon(this.f5356m);
            int i10 = this.f5364v;
            if (i10 >= 0) {
                menuItem.setShowAsAction(i10);
            }
            if (this.y != null) {
                if (f.this.f5339c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                f fVar = f.this;
                if (fVar.f5340d == null) {
                    Object obj = fVar.f5339c;
                    if (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) {
                        obj = fVar.a(((ContextWrapper) obj).getBaseContext());
                    }
                    fVar.f5340d = obj;
                }
                menuItem.setOnMenuItemClickListener(new a(fVar.f5340d, this.y));
            }
            if (this.f5360r >= 2) {
                if (menuItem instanceof g) {
                    g gVar = (g) menuItem;
                    gVar.f599x = (gVar.f599x & (-5)) | 4;
                } else if (menuItem instanceof c) {
                    c cVar = (c) menuItem;
                    try {
                        if (cVar.f5529e == null) {
                            cVar.f5529e = cVar.f5528d.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                        }
                        cVar.f5529e.invoke(cVar.f5528d, Boolean.TRUE);
                    } catch (Exception e10) {
                        Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e10);
                    }
                }
            }
            String str = this.f5366x;
            if (str != null) {
                menuItem.setActionView((View) b(str, f.f5335e, f.this.f5337a));
                z10 = true;
            }
            int i11 = this.f5365w;
            if (i11 > 0) {
                if (!z10) {
                    menuItem.setActionView(i11);
                } else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            m0.b bVar = this.f5367z;
            if (bVar != null) {
                if (menuItem instanceof g0.b) {
                    ((g0.b) menuItem).b(bVar);
                } else {
                    Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
                }
            }
            CharSequence charSequence = this.A;
            boolean z11 = menuItem instanceof g0.b;
            if (z11) {
                ((g0.b) menuItem).mo15setContentDescription(charSequence);
            } else if (Build.VERSION.SDK_INT >= 26) {
                j.h(menuItem, charSequence);
            }
            CharSequence charSequence2 = this.B;
            if (z11) {
                ((g0.b) menuItem).mo16setTooltipText(charSequence2);
            } else if (Build.VERSION.SDK_INT >= 26) {
                j.m(menuItem, charSequence2);
            }
            char c10 = this.f5357n;
            int i12 = this.f5358o;
            if (z11) {
                ((g0.b) menuItem).setAlphabeticShortcut(c10, i12);
            } else if (Build.VERSION.SDK_INT >= 26) {
                j.g(menuItem, c10, i12);
            }
            char c11 = this.p;
            int i13 = this.f5359q;
            if (z11) {
                ((g0.b) menuItem).setNumericShortcut(c11, i13);
            } else if (Build.VERSION.SDK_INT >= 26) {
                j.k(menuItem, c11, i13);
            }
            PorterDuff.Mode mode = this.D;
            if (mode != null) {
                if (z11) {
                    ((g0.b) menuItem).setIconTintMode(mode);
                } else if (Build.VERSION.SDK_INT >= 26) {
                    j.j(menuItem, mode);
                }
            }
            ColorStateList colorStateList = this.C;
            if (colorStateList != null) {
                if (z11) {
                    ((g0.b) menuItem).setIconTintList(colorStateList);
                } else if (Build.VERSION.SDK_INT < 26) {
                } else {
                    j.i(menuItem, colorStateList);
                }
            }
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        f5335e = clsArr;
        f5336f = clsArr;
    }

    public f(Context context) {
        super(context);
        this.f5339c = context;
        Object[] objArr = {context};
        this.f5337a = objArr;
        this.f5338b = objArr;
    }

    public final Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        m0.b bVar;
        ColorStateList colorStateList;
        b bVar2 = new b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException(d7.a.c("Expecting menu, got ", name));
                }
                eventType = xmlPullParser.next();
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        String str = null;
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != 2) {
                if (eventType == 3) {
                    String name2 = xmlPullParser.getName();
                    if (z11 && name2.equals(str)) {
                        str = null;
                        z11 = false;
                        eventType = xmlPullParser.next();
                    } else if (name2.equals("group")) {
                        bVar2.f5345b = 0;
                        bVar2.f5346c = 0;
                        bVar2.f5347d = 0;
                        bVar2.f5348e = 0;
                        bVar2.f5349f = true;
                        bVar2.f5350g = true;
                    } else if (name2.equals("item")) {
                        if (!bVar2.f5351h) {
                            m0.b bVar3 = bVar2.f5367z;
                            if (bVar3 == null || !bVar3.a()) {
                                bVar2.f5351h = true;
                                bVar2.c(bVar2.f5344a.add(bVar2.f5345b, bVar2.f5352i, bVar2.f5353j, bVar2.f5354k));
                            } else {
                                bVar2.a();
                            }
                        }
                    } else if (name2.equals("menu")) {
                        z10 = true;
                    }
                }
                eventType = xmlPullParser.next();
            } else {
                if (!z11) {
                    String name3 = xmlPullParser.getName();
                    if (name3.equals("group")) {
                        TypedArray obtainStyledAttributes = f.this.f5339c.obtainStyledAttributes(attributeSet, a6.f.H);
                        bVar2.f5345b = obtainStyledAttributes.getResourceId(1, 0);
                        bVar2.f5346c = obtainStyledAttributes.getInt(3, 0);
                        bVar2.f5347d = obtainStyledAttributes.getInt(4, 0);
                        bVar2.f5348e = obtainStyledAttributes.getInt(5, 0);
                        bVar2.f5349f = obtainStyledAttributes.getBoolean(2, true);
                        bVar2.f5350g = obtainStyledAttributes.getBoolean(0, true);
                        obtainStyledAttributes.recycle();
                    } else if (name3.equals("item")) {
                        f1 p = f1.p(f.this.f5339c, attributeSet, a6.f.I);
                        bVar2.f5352i = p.l(2, 0);
                        bVar2.f5353j = (p.j(5, bVar2.f5346c) & (-65536)) | (p.j(6, bVar2.f5347d) & 65535);
                        bVar2.f5354k = p.n(7);
                        bVar2.f5355l = p.n(8);
                        bVar2.f5356m = p.l(0, 0);
                        String m10 = p.m(9);
                        bVar2.f5357n = m10 == null ? (char) 0 : m10.charAt(0);
                        bVar2.f5358o = p.j(16, 4096);
                        String m11 = p.m(10);
                        bVar2.p = m11 == null ? (char) 0 : m11.charAt(0);
                        bVar2.f5359q = p.j(20, 4096);
                        bVar2.f5360r = p.o(11) ? p.a(11, false) : bVar2.f5348e;
                        bVar2.f5361s = p.a(3, false);
                        bVar2.f5362t = p.a(4, bVar2.f5349f);
                        bVar2.f5363u = p.a(1, bVar2.f5350g);
                        bVar2.f5364v = p.j(21, -1);
                        bVar2.y = p.m(12);
                        bVar2.f5365w = p.l(13, 0);
                        bVar2.f5366x = p.m(15);
                        String m12 = p.m(14);
                        boolean z12 = m12 != null;
                        if (z12 && bVar2.f5365w == 0 && bVar2.f5366x == null) {
                            bVar = (m0.b) bVar2.b(m12, f5336f, f.this.f5338b);
                        } else {
                            if (z12) {
                                Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                            }
                            bVar = null;
                        }
                        bVar2.f5367z = bVar;
                        bVar2.A = p.n(17);
                        bVar2.B = p.n(22);
                        if (p.o(19)) {
                            bVar2.D = m0.e(p.j(19, -1), bVar2.D);
                            colorStateList = null;
                        } else {
                            colorStateList = null;
                            bVar2.D = null;
                        }
                        if (p.o(18)) {
                            colorStateList = p.c(18);
                        }
                        bVar2.C = colorStateList;
                        p.r();
                        bVar2.f5351h = false;
                    } else {
                        if (name3.equals("menu")) {
                            b(xmlPullParser, attributeSet, bVar2.a());
                        } else {
                            str = name3;
                            z11 = true;
                        }
                        eventType = xmlPullParser.next();
                    }
                }
                eventType = xmlPullParser.next();
            }
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i10, Menu menu) {
        if (!(menu instanceof g0.a)) {
            super.inflate(i10, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.f5339c.getResources().getLayout(i10);
                    b(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                    xmlResourceParser.close();
                } catch (XmlPullParserException e10) {
                    throw new InflateException("Error inflating menu XML", e10);
                }
            } catch (IOException e11) {
                throw new InflateException("Error inflating menu XML", e11);
            }
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
