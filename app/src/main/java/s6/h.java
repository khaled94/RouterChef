package s6;

import java.io.File;
import java.io.FilenameFilter;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements FilenameFilter {

    /* renamed from: a */
    public static final /* synthetic */ h f18262a = new h();

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return str.startsWith(".ae");
    }
}
