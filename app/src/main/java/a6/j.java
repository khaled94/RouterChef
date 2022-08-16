package a6;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a */
    public d f220a;

    /* renamed from: b */
    public d f221b;

    /* renamed from: c */
    public d f222c;

    /* renamed from: d */
    public d f223d;

    /* renamed from: e */
    public c f224e;

    /* renamed from: f */
    public c f225f;

    /* renamed from: g */
    public c f226g;

    /* renamed from: h */
    public c f227h;

    /* renamed from: i */
    public f f228i;

    /* renamed from: j */
    public f f229j;

    /* renamed from: k */
    public f f230k;

    /* renamed from: l */
    public f f231l;

    public j() {
        this.f220a = new i();
        this.f221b = new i();
        this.f222c = new i();
        this.f223d = new i();
        this.f224e = new a6.a(0.0f);
        this.f225f = new a6.a(0.0f);
        this.f226g = new a6.a(0.0f);
        this.f227h = new a6.a(0.0f);
        this.f228i = new f();
        this.f229j = new f();
        this.f230k = new f();
        this.f231l = new f();
    }

    public static a a(Context context, int i10, int i11, c cVar) {
        if (i11 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i10);
            i10 = i11;
            context = contextThemeWrapper;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i10, h6.a.P);
        try {
            int i12 = obtainStyledAttributes.getInt(0, 0);
            int i13 = obtainStyledAttributes.getInt(3, i12);
            int i14 = obtainStyledAttributes.getInt(4, i12);
            int i15 = obtainStyledAttributes.getInt(2, i12);
            int i16 = obtainStyledAttributes.getInt(1, i12);
            c c10 = c(obtainStyledAttributes, 5, cVar);
            c c11 = c(obtainStyledAttributes, 8, c10);
            c c12 = c(obtainStyledAttributes, 9, c10);
            c c13 = c(obtainStyledAttributes, 7, c10);
            c c14 = c(obtainStyledAttributes, 6, c10);
            a aVar = new a();
            d a10 = n.a.a(i13);
            aVar.f232a = a10;
            a.b(a10);
            aVar.f236e = c11;
            d a11 = n.a.a(i14);
            aVar.f233b = a11;
            a.b(a11);
            aVar.f237f = c12;
            d a12 = n.a.a(i15);
            aVar.f234c = a12;
            a.b(a12);
            aVar.f238g = c13;
            d a13 = n.a.a(i16);
            aVar.f235d = a13;
            a.b(a13);
            aVar.f239h = c14;
            return aVar;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static a b(Context context, AttributeSet attributeSet, int i10, int i11) {
        a6.a aVar = new a6.a(0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h6.a.J, i10, i11);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return a(context, resourceId, resourceId2, aVar);
    }

    public static c c(TypedArray typedArray, int i10, c cVar) {
        TypedValue peekValue = typedArray.peekValue(i10);
        if (peekValue == null) {
            return cVar;
        }
        int i11 = peekValue.type;
        return i11 == 5 ? new a6.a(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics())) : i11 == 6 ? new h(peekValue.getFraction(1.0f, 1.0f)) : cVar;
    }

    public final boolean d(RectF rectF) {
        boolean z10 = this.f231l.getClass().equals(f.class) && this.f229j.getClass().equals(f.class) && this.f228i.getClass().equals(f.class) && this.f230k.getClass().equals(f.class);
        float a10 = this.f224e.a(rectF);
        return z10 && ((this.f225f.a(rectF) > a10 ? 1 : (this.f225f.a(rectF) == a10 ? 0 : -1)) == 0 && (this.f227h.a(rectF) > a10 ? 1 : (this.f227h.a(rectF) == a10 ? 0 : -1)) == 0 && (this.f226g.a(rectF) > a10 ? 1 : (this.f226g.a(rectF) == a10 ? 0 : -1)) == 0) && ((this.f221b instanceof i) && (this.f220a instanceof i) && (this.f222c instanceof i) && (this.f223d instanceof i));
    }

    public final j e(float f10) {
        a aVar = new a(this);
        aVar.e(f10);
        aVar.f(f10);
        aVar.d(f10);
        aVar.c(f10);
        return aVar.a();
    }

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public d f232a;

        /* renamed from: b */
        public d f233b;

        /* renamed from: c */
        public d f234c;

        /* renamed from: d */
        public d f235d;

        /* renamed from: e */
        public c f236e;

        /* renamed from: f */
        public c f237f;

        /* renamed from: g */
        public c f238g;

        /* renamed from: h */
        public c f239h;

        /* renamed from: i */
        public f f240i;

        /* renamed from: j */
        public f f241j;

        /* renamed from: k */
        public f f242k;

        /* renamed from: l */
        public f f243l;

        public a() {
            this.f232a = new i();
            this.f233b = new i();
            this.f234c = new i();
            this.f235d = new i();
            this.f236e = new a6.a(0.0f);
            this.f237f = new a6.a(0.0f);
            this.f238g = new a6.a(0.0f);
            this.f239h = new a6.a(0.0f);
            this.f240i = new f();
            this.f241j = new f();
            this.f242k = new f();
            this.f243l = new f();
        }

        public static void b(d dVar) {
            if (dVar instanceof i) {
                i iVar = (i) dVar;
            } else if (!(dVar instanceof e)) {
            } else {
                e eVar = (e) dVar;
            }
        }

        public final j a() {
            return new j(this);
        }

        public final a c(float f10) {
            this.f239h = new a6.a(f10);
            return this;
        }

        public final a d(float f10) {
            this.f238g = new a6.a(f10);
            return this;
        }

        public final a e(float f10) {
            this.f236e = new a6.a(f10);
            return this;
        }

        public final a f(float f10) {
            this.f237f = new a6.a(f10);
            return this;
        }

        public a(j jVar) {
            this.f232a = new i();
            this.f233b = new i();
            this.f234c = new i();
            this.f235d = new i();
            this.f236e = new a6.a(0.0f);
            this.f237f = new a6.a(0.0f);
            this.f238g = new a6.a(0.0f);
            this.f239h = new a6.a(0.0f);
            this.f240i = new f();
            this.f241j = new f();
            this.f242k = new f();
            this.f243l = new f();
            this.f232a = jVar.f220a;
            this.f233b = jVar.f221b;
            this.f234c = jVar.f222c;
            this.f235d = jVar.f223d;
            this.f236e = jVar.f224e;
            this.f237f = jVar.f225f;
            this.f238g = jVar.f226g;
            this.f239h = jVar.f227h;
            this.f240i = jVar.f228i;
            this.f241j = jVar.f229j;
            this.f242k = jVar.f230k;
            this.f243l = jVar.f231l;
        }
    }

    public j(a aVar) {
        this.f220a = aVar.f232a;
        this.f221b = aVar.f233b;
        this.f222c = aVar.f234c;
        this.f223d = aVar.f235d;
        this.f224e = aVar.f236e;
        this.f225f = aVar.f237f;
        this.f226g = aVar.f238g;
        this.f227h = aVar.f239h;
        this.f228i = aVar.f240i;
        this.f229j = aVar.f241j;
        this.f230k = aVar.f242k;
        this.f231l = aVar.f243l;
    }
}
