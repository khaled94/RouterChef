package i2;

import d9.p;
import e9.f;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class g extends e9.g implements p<Integer, Float, String> {

    /* renamed from: t */
    public final /* synthetic */ f f5248t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(f fVar) {
        super(2);
        this.f5248t = fVar;
    }

    @Override // d9.p
    public final String b(Integer num, Float f10) {
        num.intValue();
        String format = String.format(this.f5248t.getLocale(), "%.0f", Arrays.copyOf(new Object[]{Float.valueOf(f10.floatValue())}, 1));
        f.d(format, "java.lang.String.format(locale, this, *args)");
        return format;
    }
}
