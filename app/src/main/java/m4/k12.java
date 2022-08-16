package m4;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* loaded from: classes.dex */
public final class k12 {

    /* renamed from: a */
    public static final String f10241a = "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";

    /* renamed from: b */
    public static final String f10242b = "type.googleapis.com/google.crypto.tink.AesGcmKey";

    static {
        new p12();
        new y12();
        new b22();
        new v12();
        new i22();
        new m22();
        new e22();
        new p22();
        int i10 = v62.f14592s;
        try {
            a();
        } catch (GeneralSecurityException e10) {
            throw new ExceptionInInitializerError(e10);
        }
    }

    public static void a() {
        boolean z10;
        i12.g(new m12());
        q32.a();
        i12.f(new p12());
        i12.f(new y12());
        if (s22.a()) {
            return;
        }
        i12.f(new v12());
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            z10 = true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            z10 = false;
        }
        if (z10) {
            i12.f(new b22());
        }
        i12.f(new e22());
        i12.f(new i22());
        i12.f(new m22());
        i12.f(new p22());
    }
}
