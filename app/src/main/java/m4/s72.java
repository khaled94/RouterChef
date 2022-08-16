package m4;

import e1.i;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;

/* loaded from: classes.dex */
public final class s72 implements t32 {

    /* renamed from: s */
    public final ThreadLocal<Mac> f13539s;

    /* renamed from: t */
    public final String f13540t;

    /* renamed from: u */
    public final Key f13541u;

    /* renamed from: v */
    public final int f13542v;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public s72(String str, Key key) {
        char c10;
        int i10;
        r72 r72Var = new r72(this);
        this.f13539s = r72Var;
        if (i.d(2)) {
            this.f13540t = str;
            this.f13541u = key;
            if (key.getEncoded().length < 16) {
                throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
            }
            switch (str.hashCode()) {
                case -1823053428:
                    if (str.equals("HMACSHA1")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 392315023:
                    if (str.equals("HMACSHA224")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 392315118:
                    if (str.equals("HMACSHA256")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 392316170:
                    if (str.equals("HMACSHA384")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 392317873:
                    if (str.equals("HMACSHA512")) {
                        c10 = 4;
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            if (c10 == 0) {
                i10 = 20;
            } else if (c10 == 1) {
                i10 = 28;
            } else if (c10 == 2) {
                i10 = 32;
            } else if (c10 == 3) {
                i10 = 48;
            } else if (c10 != 4) {
                throw new NoSuchAlgorithmException(str.length() != 0 ? "unknown Hmac algorithm: ".concat(str) : new String("unknown Hmac algorithm: "));
            } else {
                i10 = 64;
            }
            this.f13542v = i10;
            r72Var.get();
            return;
        }
        throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
    }

    @Override // m4.t32
    public final byte[] a(byte[] bArr, int i10) {
        if (i10 <= this.f13542v) {
            this.f13539s.get().update(bArr);
            return Arrays.copyOf(this.f13539s.get().doFinal(), i10);
        }
        throw new InvalidAlgorithmParameterException("tag size too big");
    }
}
