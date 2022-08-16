package x6;

import java.io.File;
import java.io.FilenameFilter;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements FilenameFilter {

    /* renamed from: a */
    public static final /* synthetic */ c f20052a = new c();

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        Charset charset = g.f20056g;
        return str.startsWith("event") && !str.endsWith("_");
    }
}
