package m4;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class ja2 {

    /* renamed from: b */
    public static final ha2 f9889b = new ha2();

    /* renamed from: a */
    public final ia2 f9890a;

    public ja2() {
        pa2 pa2Var;
        pa2[] pa2VarArr = new pa2[2];
        pa2VarArr[0] = i92.f9567a;
        try {
            pa2Var = (pa2) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            pa2Var = f9889b;
        }
        pa2VarArr[1] = pa2Var;
        ia2 ia2Var = new ia2(pa2VarArr);
        Charset charset = v92.f14624a;
        this.f9890a = ia2Var;
    }
}
