package a4;

import android.os.RemoteException;
import android.util.Log;
import d4.h1;
import d4.i1;
import d4.m;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import k4.a;
import k4.b;

/* loaded from: classes.dex */
public abstract class t extends h1 {

    /* renamed from: t */
    public final int f151t;

    public t(byte[] bArr) {
        m.a(bArr.length == 25);
        this.f151t = Arrays.hashCode(bArr);
    }

    public static byte[] c0(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // d4.i1
    public final int c() {
        return this.f151t;
    }

    public abstract byte[] e0();

    public final boolean equals(Object obj) {
        a g10;
        if (obj != null && (obj instanceof i1)) {
            try {
                i1 i1Var = (i1) obj;
                if (i1Var.c() != this.f151t || (g10 = i1Var.g()) == null) {
                    return false;
                }
                return Arrays.equals(e0(), (byte[]) b.e0(g10));
            } catch (RemoteException e10) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
            }
        }
        return false;
    }

    @Override // d4.i1
    public final a g() {
        return new b(e0());
    }

    public final int hashCode() {
        return this.f151t;
    }
}
