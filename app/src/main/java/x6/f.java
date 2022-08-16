package x6;

import java.io.File;
import java.nio.charset.Charset;
import java.util.Comparator;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements Comparator {

    /* renamed from: s */
    public static final /* synthetic */ f f20055s = new f();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Charset charset = g.f20056g;
        String name = ((File) obj).getName();
        int i10 = g.f20057h;
        return name.substring(0, i10).compareTo(((File) obj2).getName().substring(0, i10));
    }
}
