package r7;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: c */
    public static final String[] f17275c = {"*", "FCM", "GCM", ""};

    /* renamed from: a */
    public final SharedPreferences f17276a;

    /* renamed from: b */
    public final String f17277b;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0047, code lost:
        if (r0.isEmpty() != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public b(h6.d r4) {
        /*
            r3 = this;
            r3.<init>()
            r4.a()
            android.content.Context r0 = r4.f5112a
            r1 = 0
            java.lang.String r2 = "com.google.android.gms.appid"
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r2, r1)
            r3.f17276a = r0
            r4.a()
            h6.h r0 = r4.f5114c
            java.lang.String r0 = r0.f5132e
            if (r0 == 0) goto L1b
            goto L4a
        L1b:
            r4.a()
            h6.h r4 = r4.f5114c
            java.lang.String r0 = r4.f5129b
            java.lang.String r4 = "1:"
            boolean r4 = r0.startsWith(r4)
            if (r4 != 0) goto L33
            java.lang.String r4 = "2:"
            boolean r4 = r0.startsWith(r4)
            if (r4 != 0) goto L33
            goto L4a
        L33:
            java.lang.String r4 = ":"
            java.lang.String[] r4 = r0.split(r4)
            int r0 = r4.length
            r1 = 4
            r2 = 0
            if (r0 == r1) goto L40
        L3e:
            r0 = r2
            goto L4a
        L40:
            r0 = 1
            r0 = r4[r0]
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L4a
            goto L3e
        L4a:
            r3.f17277b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r7.b.<init>(h6.d):void");
    }

    public final String a() {
        PublicKey publicKey;
        synchronized (this.f17276a) {
            String str = null;
            String string = this.f17276a.getString("|S||P|", null);
            if (string == null) {
                return null;
            }
            try {
                publicKey = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(string, 8)));
            } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e10) {
                Log.w("ContentValues", "Invalid key stored " + e10);
                publicKey = null;
            }
            if (publicKey == null) {
                return null;
            }
            try {
                byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
                digest[0] = (byte) (((digest[0] & 15) + 112) & 255);
                str = Base64.encodeToString(digest, 0, 8, 11);
            } catch (NoSuchAlgorithmException unused) {
                Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            }
            return str;
        }
    }
}
