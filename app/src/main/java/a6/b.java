package a6;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b implements c {

    /* renamed from: a */
    public final c f177a;

    /* renamed from: b */
    public final float f178b;

    public b(float f10, c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).f177a;
            f10 += ((b) cVar).f178b;
        }
        this.f177a = cVar;
        this.f178b = f10;
    }

    @Override // a6.c
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.f177a.a(rectF) + this.f178b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f177a.equals(bVar.f177a) && this.f178b == bVar.f178b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f177a, Float.valueOf(this.f178b)});
    }
}
