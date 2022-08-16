package q1;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import d0.g;
import d0.l;
import f0.a;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import q1.f;

/* loaded from: classes.dex */
public final class b extends e implements Animatable {

    /* renamed from: t */
    public C0104b f17062t;

    /* renamed from: u */
    public Context f17063u;

    /* renamed from: v */
    public ArgbEvaluator f17064v;

    /* renamed from: w */
    public final a f17065w;

    /* loaded from: classes.dex */
    public class a implements Drawable.Callback {
        public a() {
            b.this = r1;
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void invalidateDrawable(Drawable drawable) {
            b.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
            b.this.scheduleSelf(runnable, j3);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            b.this.unscheduleSelf(runnable);
        }
    }

    /* renamed from: q1.b$b */
    /* loaded from: classes.dex */
    public static class C0104b extends Drawable.ConstantState {

        /* renamed from: a */
        public int f17067a;

        /* renamed from: b */
        public f f17068b;

        /* renamed from: c */
        public AnimatorSet f17069c;

        /* renamed from: d */
        public ArrayList<Animator> f17070d;

        /* renamed from: e */
        public r.a<Animator, String> f17071e;

        public C0104b(Drawable.Callback callback) {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return this.f17067a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    public b() {
        this(null);
    }

    public b(Context context) {
        this.f17064v = null;
        a aVar = new a();
        this.f17065w = aVar;
        this.f17063u = context;
        this.f17062t = new C0104b(aVar);
    }

    @Override // q1.e, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f17075s;
        if (drawable != null) {
            a.b.a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f17075s;
        if (drawable != null) {
            return a.b.b(drawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f17075s;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f17062t.f17068b.draw(canvas);
        if (!this.f17062t.f17069c.isStarted()) {
            return;
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f17075s;
        if (drawable != null) {
            return a.C0068a.a(drawable);
        }
        return this.f17062t.f17068b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f17075s;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f17062t.f17067a;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f17075s;
        if (drawable != null) {
            return a.b.c(drawable);
        }
        return this.f17062t.f17068b.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f17075s == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new c(this.f17075s.getConstantState());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f17075s;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f17062t.f17068b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f17075s;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f17062t.f17068b.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f17075s;
        return drawable != null ? drawable.getOpacity() : this.f17062t.f17068b.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Animator animator;
        XmlResourceParser xmlResourceParser;
        Throwable th;
        XmlPullParserException e10;
        IOException e11;
        f fVar;
        int next;
        Drawable drawable = this.f17075s;
        if (drawable != null) {
            a.b.d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray l10 = l.l(resources, theme, attributeSet, q1.a.f17054e);
                    int resourceId = l10.getResourceId(0, 0);
                    if (resourceId != 0) {
                        PorterDuff.Mode mode = f.B;
                        if (Build.VERSION.SDK_INT >= 24) {
                            fVar = new f();
                            ThreadLocal<TypedValue> threadLocal = g.f3704a;
                            fVar.f17075s = g.a.a(resources, resourceId, theme);
                            new f.h(fVar.f17075s.getConstantState());
                        } else {
                            try {
                                XmlResourceParser xml = resources.getXml(resourceId);
                                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                                while (true) {
                                    next = xml.next();
                                    if (next == 2 || next == 1) {
                                        break;
                                    }
                                }
                                if (next != 2) {
                                    throw new XmlPullParserException("No start tag found");
                                    break;
                                }
                                fVar = f.a(resources, xml, asAttributeSet, theme);
                            } catch (IOException | XmlPullParserException e12) {
                                Log.e("VectorDrawableCompat", "parser error", e12);
                                fVar = null;
                            }
                        }
                        fVar.f17080x = false;
                        fVar.setCallback(this.f17065w);
                        f fVar2 = this.f17062t.f17068b;
                        if (fVar2 != null) {
                            fVar2.setCallback(null);
                        }
                        this.f17062t.f17068b = fVar;
                    }
                    l10.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, q1.a.f17055f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f17063u;
                        if (context != null) {
                            if (Build.VERSION.SDK_INT >= 24) {
                                animator = AnimatorInflater.loadAnimator(context, resourceId2);
                            } else {
                                Resources resources2 = context.getResources();
                                Resources.Theme theme2 = context.getTheme();
                                try {
                                    try {
                                        xmlResourceParser = resources2.getAnimation(resourceId2);
                                    } catch (Throwable th2) {
                                        th = th2;
                                        xmlResourceParser = null;
                                    }
                                } catch (IOException e13) {
                                    e11 = e13;
                                } catch (XmlPullParserException e14) {
                                    e10 = e14;
                                }
                                try {
                                    animator = q1.c.a(context, resources2, theme2, xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), null, 0);
                                    xmlResourceParser.close();
                                } catch (IOException e15) {
                                    e11 = e15;
                                    Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(resourceId2));
                                    notFoundException.initCause(e11);
                                    throw notFoundException;
                                } catch (XmlPullParserException e16) {
                                    e10 = e16;
                                    Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(resourceId2));
                                    notFoundException2.initCause(e10);
                                    throw notFoundException2;
                                } catch (Throwable th3) {
                                    th = th3;
                                    if (xmlResourceParser != null) {
                                        xmlResourceParser.close();
                                    }
                                    throw th;
                                }
                            }
                            animator.setTarget(this.f17062t.f17068b.f17076t.f17125b.f17123o.getOrDefault(string, null));
                            C0104b c0104b = this.f17062t;
                            if (c0104b.f17070d == null) {
                                c0104b.f17070d = new ArrayList<>();
                                this.f17062t.f17071e = new r.a<>();
                            }
                            this.f17062t.f17070d.add(animator);
                            this.f17062t.f17071e.put(animator, string);
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        C0104b c0104b2 = this.f17062t;
        if (c0104b2.f17069c == null) {
            c0104b2.f17069c = new AnimatorSet();
        }
        c0104b2.f17069c.playTogether(c0104b2.f17070d);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f17075s;
        if (drawable != null) {
            return a.C0068a.d(drawable);
        }
        return this.f17062t.f17068b.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f17075s;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f17062t.f17069c.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f17075s;
        return drawable != null ? drawable.isStateful() : this.f17062t.f17068b.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f17075s;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f17075s;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f17062t.f17068b.setBounds(rect);
        }
    }

    @Override // q1.e, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i10) {
        Drawable drawable = this.f17075s;
        return drawable != null ? drawable.setLevel(i10) : this.f17062t.f17068b.setLevel(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f17075s;
        return drawable != null ? drawable.setState(iArr) : this.f17062t.f17068b.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        Drawable drawable = this.f17075s;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else {
            this.f17062t.f17068b.setAlpha(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f17075s;
        if (drawable != null) {
            a.C0068a.e(drawable, z10);
        } else {
            this.f17062t.f17068b.setAutoMirrored(z10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f17075s;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f17062t.f17068b.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i10) {
        Drawable drawable = this.f17075s;
        if (drawable != null) {
            a.b.g(drawable, i10);
        } else {
            this.f17062t.f17068b.setTint(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f17075s;
        if (drawable != null) {
            a.b.h(drawable, colorStateList);
        } else {
            this.f17062t.f17068b.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f17075s;
        if (drawable != null) {
            a.b.i(drawable, mode);
        } else {
            this.f17062t.f17068b.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f17075s;
        if (drawable != null) {
            return drawable.setVisible(z10, z11);
        }
        this.f17062t.f17068b.setVisible(z10, z11);
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f17075s;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else if (this.f17062t.f17069c.isStarted()) {
        } else {
            this.f17062t.f17069c.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f17075s;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f17062t.f17069c.end();
        }
    }

    /* loaded from: classes.dex */
    public static class c extends Drawable.ConstantState {

        /* renamed from: a */
        public final Drawable.ConstantState f17072a;

        public c(Drawable.ConstantState constantState) {
            this.f17072a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final boolean canApplyTheme() {
            return this.f17072a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return this.f17072a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            b bVar = new b(null);
            Drawable newDrawable = this.f17072a.newDrawable();
            bVar.f17075s = newDrawable;
            newDrawable.setCallback(bVar.f17065w);
            return bVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            b bVar = new b(null);
            Drawable newDrawable = this.f17072a.newDrawable(resources);
            bVar.f17075s = newDrawable;
            newDrawable.setCallback(bVar.f17065w);
            return bVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
            b bVar = new b(null);
            Drawable newDrawable = this.f17072a.newDrawable(resources, theme);
            bVar.f17075s = newDrawable;
            newDrawable.setCallback(bVar.f17065w);
            return bVar;
        }
    }
}
