package x6;

import java.io.File;
import java.io.FilenameFilter;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements FilenameFilter {

    /* renamed from: a */
    public static final /* synthetic */ d f20053a = new d();

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        Charset charset = g.f20056g;
        return str.startsWith("event");
    }
}
