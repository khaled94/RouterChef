package s4;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class v7 {

    /* renamed from: b */
    public static final t7 f18152b = new t7();

    /* renamed from: a */
    public final u7 f18153a;

    public v7() {
        c8 c8Var;
        c8[] c8VarArr = new c8[2];
        c8VarArr[0] = x6.f18185a;
        try {
            c8Var = (c8) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            c8Var = f18152b;
        }
        c8VarArr[1] = c8Var;
        u7 u7Var = new u7(c8VarArr);
        Charset charset = i7.f17920a;
        this.f18153a = u7Var;
    }
}
