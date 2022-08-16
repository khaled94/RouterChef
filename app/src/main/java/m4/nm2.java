package m4;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* loaded from: classes.dex */
public final class nm2 extends xo0 {

    /* renamed from: e */
    public final ContentResolver f11856e;

    /* renamed from: f */
    public Uri f11857f;

    /* renamed from: g */
    public AssetFileDescriptor f11858g;

    /* renamed from: h */
    public FileInputStream f11859h;

    /* renamed from: i */
    public long f11860i;

    /* renamed from: j */
    public boolean f11861j;

    public nm2(Context context) {
        super(false);
        this.f11856e = context.getContentResolver();
    }

    @Override // m4.jp0
    public final int d(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j3 = this.f11860i;
        if (j3 == 0) {
            return -1;
        }
        if (j3 != -1) {
            try {
                i11 = (int) Math.min(j3, i11);
            } catch (IOException e10) {
                throw new mm2(e10, 2000);
            }
        }
        FileInputStream fileInputStream = this.f11859h;
        int i12 = ls1.f10971a;
        int read = fileInputStream.read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        long j10 = this.f11860i;
        if (j10 != -1) {
            this.f11860i = j10 - read;
        }
        p(read);
        return read;
    }

    @Override // m4.kq0
    public final Uri h() {
        return this.f11857f;
    }

    @Override // m4.kq0
    public final void i() {
        this.f11857f = null;
        try {
            try {
                FileInputStream fileInputStream = this.f11859h;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f11859h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f11858g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } finally {
                        this.f11858g = null;
                        if (this.f11861j) {
                            this.f11861j = false;
                            q();
                        }
                    }
                } catch (IOException e10) {
                    throw new mm2(e10, 2000);
                }
            } catch (IOException e11) {
                throw new mm2(e11, 2000);
            }
        } catch (Throwable th) {
            this.f11859h = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f11858g;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f11858g = null;
                    if (this.f11861j) {
                        this.f11861j = false;
                        q();
                    }
                    throw th;
                } catch (IOException e12) {
                    throw new mm2(e12, 2000);
                }
            } catch (Throwable th2) {
                this.f11858g = null;
                if (this.f11861j) {
                    this.f11861j = false;
                    q();
                }
                throw th2;
            }
        }
    }

    @Override // m4.kq0
    public final long k(gs0 gs0Var) {
        int i10;
        IOException e10;
        AssetFileDescriptor assetFileDescriptor;
        long j3;
        try {
            try {
                Uri uri = gs0Var.f9017a;
                this.f11857f = uri;
                r(gs0Var);
                if ("content".equals(gs0Var.f9017a.getScheme())) {
                    Bundle bundle = new Bundle();
                    if (ls1.f10971a >= 31) {
                        lm2.a(bundle);
                    }
                    assetFileDescriptor = this.f11856e.openTypedAssetFileDescriptor(uri, "*/*", bundle);
                } else {
                    assetFileDescriptor = this.f11856e.openAssetFileDescriptor(uri, "r");
                }
                this.f11858g = assetFileDescriptor;
                if (assetFileDescriptor == null) {
                    String valueOf = String.valueOf(uri);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 36);
                    sb.append("Could not open file descriptor for: ");
                    sb.append(valueOf);
                    i10 = 2000;
                    try {
                        throw new mm2(new IOException(sb.toString()), 2000);
                    } catch (IOException e11) {
                        e10 = e11;
                        if (true == (e10 instanceof FileNotFoundException)) {
                            i10 = 2005;
                        }
                        throw new mm2(e10, i10);
                    }
                }
                long length = assetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(assetFileDescriptor.getFileDescriptor());
                this.f11859h = fileInputStream;
                int i11 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
                if (i11 != 0 && gs0Var.f9020d > length) {
                    throw new mm2(null, 2008);
                }
                long startOffset = assetFileDescriptor.getStartOffset();
                long skip = fileInputStream.skip(gs0Var.f9020d + startOffset) - startOffset;
                if (skip != gs0Var.f9020d) {
                    throw new mm2(null, 2008);
                }
                if (i11 == 0) {
                    FileChannel channel = fileInputStream.getChannel();
                    long size = channel.size();
                    if (size == 0) {
                        this.f11860i = -1L;
                        j3 = -1;
                    } else {
                        j3 = size - channel.position();
                        this.f11860i = j3;
                        if (j3 < 0) {
                            throw new mm2(null, 2008);
                        }
                    }
                } else {
                    j3 = length - skip;
                    this.f11860i = j3;
                    if (j3 < 0) {
                        throw new mm2(null, 2008);
                    }
                }
                long j10 = gs0Var.f9021e;
                if (j10 != -1) {
                    if (j3 != -1) {
                        j10 = Math.min(j3, j10);
                    }
                    this.f11860i = j10;
                }
                this.f11861j = true;
                s(gs0Var);
                long j11 = gs0Var.f9021e;
                return j11 != -1 ? j11 : this.f11860i;
            } catch (mm2 e12) {
                throw e12;
            }
        } catch (IOException e13) {
            e10 = e13;
            i10 = 2000;
        }
    }
}
