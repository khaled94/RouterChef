package m4;

import java.util.Iterator;
import java.util.NoSuchElementException;
import javax.annotation.CheckForNull;

/* loaded from: classes.dex */
public abstract class lu1 implements Iterator<String> {
    @CheckForNull

    /* renamed from: s */
    public String f11024s;

    /* renamed from: u */
    public final CharSequence f11026u;

    /* renamed from: t */
    public int f11025t = 2;

    /* renamed from: v */
    public int f11027v = 0;

    /* renamed from: w */
    public int f11028w = Integer.MAX_VALUE;

    public lu1(aa0 aa0Var, CharSequence charSequence) {
        this.f11026u = charSequence;
    }

    public abstract int a(int i10);

    public abstract int b(int i10);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10;
        int i11 = this.f11025t;
        if (i11 != 4) {
            int i12 = i11 - 1;
            String str = null;
            if (i11 == 0) {
                throw null;
            }
            if (i12 == 0) {
                return true;
            }
            if (i12 != 2) {
                this.f11025t = 4;
                int i13 = this.f11027v;
                while (true) {
                    int i14 = this.f11027v;
                    if (i14 == -1) {
                        this.f11025t = 3;
                        break;
                    }
                    int b10 = b(i14);
                    if (b10 == -1) {
                        b10 = this.f11026u.length();
                        this.f11027v = -1;
                        i10 = -1;
                    } else {
                        i10 = a(b10);
                        this.f11027v = i10;
                    }
                    if (i10 == i13) {
                        int i15 = i10 + 1;
                        this.f11027v = i15;
                        if (i15 > this.f11026u.length()) {
                            this.f11027v = -1;
                        }
                    } else {
                        if (i13 < b10) {
                            this.f11026u.charAt(i13);
                        }
                        if (i13 < b10) {
                            this.f11026u.charAt(b10 - 1);
                        }
                        int i16 = this.f11028w;
                        if (i16 == 1) {
                            b10 = this.f11026u.length();
                            this.f11027v = -1;
                            if (b10 > i13) {
                                this.f11026u.charAt(b10 - 1);
                            }
                        } else {
                            this.f11028w = i16 - 1;
                        }
                        str = this.f11026u.subSequence(i13, b10).toString();
                    }
                }
                this.f11024s = str;
                if (this.f11025t != 3) {
                    this.f11025t = 1;
                    return true;
                }
            }
            return false;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.Iterator
    public final String next() {
        if (hasNext()) {
            this.f11025t = 2;
            String str = this.f11024s;
            this.f11024s = null;
            return str;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
