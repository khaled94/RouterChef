package f9;

import java.util.Random;

/* loaded from: classes.dex */
public abstract class a extends c {
    @Override // f9.c
    public final int a() {
        return b().nextInt();
    }

    public abstract Random b();
}
