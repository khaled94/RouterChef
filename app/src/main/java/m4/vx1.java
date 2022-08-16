package m4;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Objects;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class vx1 implements FilenameFilter {

    /* renamed from: a */
    public final Pattern f14796a;

    public vx1(Pattern pattern) {
        Objects.requireNonNull(pattern);
        this.f14796a = pattern;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return this.f14796a.matcher(str).matches();
    }
}
