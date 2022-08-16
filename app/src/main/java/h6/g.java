package h6;

import d4.m;

/* loaded from: classes.dex */
public class g extends Exception {
    @Deprecated
    public g() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(String str) {
        super(str);
        m.f(str, "Detail message must not be empty");
    }
}
