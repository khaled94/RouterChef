package a6;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a implements c {

    /* renamed from: a */
    public final float f176a;

    public a(float f10) {
        this.f176a = f10;
    }

    @Override // a6.c
    public final float a(RectF rectF) {
        return this.f176a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f176a == ((a) obj).f176a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f176a)});
    }
}
