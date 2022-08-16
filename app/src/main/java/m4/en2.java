package m4;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

/* loaded from: classes.dex */
public final class en2 extends xo0 {

    /* renamed from: e */
    public final Resources f8018e;

    /* renamed from: f */
    public final String f8019f;

    /* renamed from: g */
    public Uri f8020g;

    /* renamed from: h */
    public AssetFileDescriptor f8021h;

    /* renamed from: i */
    public FileInputStream f8022i;

    /* renamed from: j */
    public long f8023j;

    /* renamed from: k */
    public boolean f8024k;

    public en2(Context context) {
        super(false);
        this.f8018e = context.getResources();
        this.f8019f = context.getPackageName();
    }

    @Override // m4.jp0
    public final int d(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j3 = this.f8023j;
        if (j3 == 0) {
            return -1;
        }
        if (j3 != -1) {
            try {
                i11 = (int) Math.min(j3, i11);
            } catch (IOException e10) {
                throw new dn2(null, e10, 2000);
            }
        }
        FileInputStream fileInputStream = this.f8022i;
        int i12 = ls1.f10971a;
        int read = fileInputStream.read(bArr, i10, i11);
        if (read == -1) {
            if (this.f8023j != -1) {
                throw new dn2("End of stream reached having not read sufficient data.", new EOFException(), 2000);
            }
            return -1;
        }
        long j10 = this.f8023j;
        if (j10 != -1) {
            this.f8023j = j10 - read;
        }
        p(read);
        return read;
    }

    @Override // m4.kq0
    public final Uri h() {
        return this.f8020g;
    }

    @Override // m4.kq0
    public final void i() {
        this.f8020g = null;
        try {
            try {
                FileInputStream fileInputStream = this.f8022i;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f8022i = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f8021h;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } finally {
                        this.f8021h = null;
                        if (this.f8024k) {
                            this.f8024k = false;
                            q();
                        }
                    }
                } catch (IOException e10) {
                    throw new dn2(null, e10, 2000);
                }
            } catch (IOException e11) {
                throw new dn2(null, e11, 2000);
            }
        } catch (Throwable th) {
            this.f8022i = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f8021h;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f8021h = null;
                    if (this.f8024k) {
                        this.f8024k = false;
                        q();
                    }
                    throw th;
                } catch (IOException e12) {
                    throw new dn2(null, e12, 2000);
                }
            } catch (Throwable th2) {
                this.f8021h = null;
                if (this.f8024k) {
                    this.f8024k = false;
                    q();
                }
                throw th2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x003d, code lost:
        if (r3.matches("\\d+") != false) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0160  */
    @Override // m4.kq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long k(m4.gs0 r18) {
        /*
            Method dump skipped, instructions count: 385
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.en2.k(m4.gs0):long");
    }
}
