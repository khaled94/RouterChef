package z7;

import androidx.activity.result.a;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumSet;
import x7.m;

/* loaded from: classes.dex */
public final class h implements m<Object> {

    /* renamed from: s */
    public final /* synthetic */ Type f21020s;

    public h(Type type) {
        this.f21020s = type;
    }

    @Override // z7.m
    public final Object c() {
        Type type = this.f21020s;
        if (!(type instanceof ParameterizedType)) {
            StringBuilder c10 = a.c("Invalid EnumSet type: ");
            c10.append(this.f21020s.toString());
            throw new m(c10.toString());
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return EnumSet.noneOf((Class) type2);
        }
        StringBuilder c11 = a.c("Invalid EnumSet type: ");
        c11.append(this.f21020s.toString());
        throw new m(c11.toString());
    }
}
