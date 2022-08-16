package i2;

import d9.l;
import e9.f;
import e9.g;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class d extends g implements l<Float, String> {

    /* renamed from: t */
    public final /* synthetic */ c f5225t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar) {
        super(1);
        this.f5225t = cVar;
    }

    @Override // d9.l
    public final String c(Float f10) {
        String format = String.format(this.f5225t.getLocale(), "%.0f", Arrays.copyOf(new Object[]{Float.valueOf(f10.floatValue())}, 1));
        f.d(format, "java.lang.String.format(locale, this, *args)");
        return format;
    }
}
