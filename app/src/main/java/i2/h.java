package i2;

import d9.p;
import e9.f;
import e9.g;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class h extends g implements p<Integer, Float, String> {

    /* renamed from: t */
    public final /* synthetic */ f f5249t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(f fVar) {
        super(2);
        this.f5249t = fVar;
    }

    @Override // d9.p
    public final String b(Integer num, Float f10) {
        num.intValue();
        String format = String.format(this.f5249t.getLocale(), "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(f10.floatValue())}, 1));
        f.d(format, "java.lang.String.format(locale, this, *args)");
        return format;
    }
}
