package a6;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class h implements c {

    /* renamed from: a */
    public final float f219a;

    public h(float f10) {
        this.f219a = f10;
    }

    @Override // a6.c
    public final float a(RectF rectF) {
        return rectF.height() * this.f219a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && this.f219a == ((h) obj).f219a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f219a)});
    }
}
