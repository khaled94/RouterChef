package x6;

import java.io.File;
import java.nio.charset.Charset;
import java.util.Comparator;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements Comparator {

    /* renamed from: s */
    public static final /* synthetic */ e f20054s = new e();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Charset charset = g.f20056g;
        return ((File) obj2).getName().compareTo(((File) obj).getName());
    }
}
