package m4;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

/* loaded from: classes.dex */
public final class dm2 extends xo0 {

    /* renamed from: e */
    public final AssetManager f7552e;

    /* renamed from: f */
    public Uri f7553f;

    /* renamed from: g */
    public InputStream f7554g;

    /* renamed from: h */
    public long f7555h;

    /* renamed from: i */
    public boolean f7556i;

    public dm2(Context context) {
        super(false);
        this.f7552e = context.getAssets();
    }

    @Override // m4.jp0
    public final int d(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j3 = this.f7555h;
        if (j3 == 0) {
            return -1;
        }
        if (j3 != -1) {
            try {
                i11 = (int) Math.min(j3, i11);
            } catch (IOException e10) {
                throw new cm2(e10, 2000);
            }
        }
        InputStream inputStream = this.f7554g;
        int i12 = ls1.f10971a;
        int read = inputStream.read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        long j10 = this.f7555h;
        if (j10 != -1) {
            this.f7555h = j10 - read;
        }
        p(read);
        return read;
    }

    @Override // m4.kq0
    public final Uri h() {
        return this.f7553f;
    }

    @Override // m4.kq0
    public final void i() {
        this.f7553f = null;
        try {
            try {
                InputStream inputStream = this.f7554g;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f7554g = null;
                if (!this.f7556i) {
                    return;
                }
                this.f7556i = false;
                q();
            } catch (IOException e10) {
                throw new cm2(e10, 2000);
            }
        } catch (Throwable th) {
            this.f7554g = null;
            if (this.f7556i) {
                this.f7556i = false;
                q();
            }
            throw th;
        }
    }

    @Override // m4.kq0
    public final long k(gs0 gs0Var) {
        try {
            Uri uri = gs0Var.f9017a;
            this.f7553f = uri;
            String path = uri.getPath();
            Objects.requireNonNull(path);
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            r(gs0Var);
            InputStream open = this.f7552e.open(path, 1);
            this.f7554g = open;
            if (open.skip(gs0Var.f9020d) < gs0Var.f9020d) {
                throw new cm2(null, 2008);
            }
            long j3 = gs0Var.f9021e;
            if (j3 != -1) {
                this.f7555h = j3;
            } else {
                long available = this.f7554g.available();
                this.f7555h = available;
                if (available == 2147483647L) {
                    this.f7555h = -1L;
                }
            }
            this.f7556i = true;
            s(gs0Var);
            return this.f7555h;
        } catch (cm2 e10) {
            throw e10;
        } catch (IOException e11) {
            throw new cm2(e11, true != (e11 instanceof FileNotFoundException) ? 2000 : 2005);
        }
    }
}
