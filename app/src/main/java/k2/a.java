package k2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import i2.f;
import java.util.Observable;
import k2.a;

/* loaded from: classes.dex */
public abstract class a<I extends a<? extends I>> extends Observable {

    /* renamed from: f */
    public static final C0084a f5573f = new C0084a();

    /* renamed from: b */
    public final float f5575b;

    /* renamed from: c */
    public f f5576c;

    /* renamed from: d */
    public float f5577d;

    /* renamed from: a */
    public Paint f5574a = new Paint(1);

    /* renamed from: e */
    public int f5578e = -14575885;

    /* renamed from: k2.a$a */
    /* loaded from: classes.dex */
    public static final class C0084a {
    }

    /* loaded from: classes.dex */
    public enum b {
        /* JADX INFO: Fake field, exist only in values array */
        NoIndicator,
        /* JADX INFO: Fake field, exist only in values array */
        NormalIndicator,
        /* JADX INFO: Fake field, exist only in values array */
        NormalSmallIndicator,
        /* JADX INFO: Fake field, exist only in values array */
        TriangleIndicator,
        /* JADX INFO: Fake field, exist only in values array */
        SpindleIndicator,
        /* JADX INFO: Fake field, exist only in values array */
        LineIndicator,
        /* JADX INFO: Fake field, exist only in values array */
        HalfLineIndicator,
        /* JADX INFO: Fake field, exist only in values array */
        QuarterLineIndicator,
        /* JADX INFO: Fake field, exist only in values array */
        KiteIndicator,
        /* JADX INFO: Fake field, exist only in values array */
        NeedleIndicator
    }

    public a(Context context) {
        e9.f.e(context, "context");
        this.f5575b = context.getResources().getDisplayMetrics().density;
        this.f5574a.setColor(-14575885);
    }

    public abstract void a(Canvas canvas);

    public float b() {
        return d();
    }

    public final float c() {
        f fVar = this.f5576c;
        if (fVar != null) {
            e9.f.c(fVar);
            return fVar.getSize() / 2.0f;
        }
        return 0.0f;
    }

    public final float d() {
        f fVar = this.f5576c;
        if (fVar != null) {
            e9.f.c(fVar);
            return fVar.getSize() / 2.0f;
        }
        return 0.0f;
    }

    public float e() {
        f fVar = this.f5576c;
        if (fVar != null) {
            e9.f.c(fVar);
            return fVar.getPadding();
        }
        return 0.0f;
    }

    public final float f() {
        f fVar = this.f5576c;
        if (fVar == null) {
            return 0.0f;
        }
        return fVar.getSize() - (fVar.getPadding() * 2.0f);
    }

    public final void g(int i10) {
        this.f5578e = i10;
        if (this.f5576c != null) {
            j();
        }
        setChanged();
        notifyObservers(null);
    }

    public final I h(f fVar) {
        e9.f.e(fVar, "speedometer");
        deleteObservers();
        addObserver(fVar);
        this.f5576c = fVar;
        j();
        return this;
    }

    public final void i(float f10) {
        this.f5577d = f10;
        if (this.f5576c != null) {
            j();
        }
        setChanged();
        notifyObservers(null);
    }

    public abstract void j();
}
