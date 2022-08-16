package m4;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.util.Arrays;
import java.util.Objects;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class l72 implements n02 {

    /* renamed from: f */
    public static final byte[] f10668f = new byte[0];

    /* renamed from: a */
    public final np0 f10669a;

    /* renamed from: b */
    public final String f10670b;

    /* renamed from: c */
    public final byte[] f10671c;

    /* renamed from: d */
    public final k32 f10672d;

    /* renamed from: e */
    public final int f10673e;

    public l72(ECPublicKey eCPublicKey, byte[] bArr, String str, int i10, k32 k32Var) {
        zv1.f(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
        this.f10669a = new np0(eCPublicKey, 3);
        this.f10671c = bArr;
        this.f10670b = str;
        this.f10673e = i10;
        this.f10672d = k32Var;
    }

    @Override // m4.n02
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        char c10;
        byte[] bArr3;
        int i10;
        int i11;
        byte[] doFinal;
        l70 l70Var;
        boolean z10;
        byte[] bArr4;
        BigInteger bigInteger;
        np0 np0Var = this.f10669a;
        String str = this.f10670b;
        byte[] bArr5 = this.f10671c;
        int i12 = this.f10672d.f10270b;
        int i13 = this.f10673e;
        ECParameterSpec params = ((ECPublicKey) np0Var.f11881t).getParams();
        KeyPairGenerator a10 = n72.f11547h.a("EC");
        a10.initialize(params);
        KeyPair generateKeyPair = a10.generateKeyPair();
        ECPublicKey eCPublicKey = (ECPublicKey) generateKeyPair.getPublic();
        ECPrivateKey eCPrivateKey = (ECPrivateKey) generateKeyPair.getPrivate();
        ECPublicKey eCPublicKey2 = (ECPublicKey) np0Var.f11881t;
        try {
            ECParameterSpec params2 = eCPublicKey2.getParams();
            ECParameterSpec params3 = eCPrivateKey.getParams();
            if (!params2.getCurve().equals(params3.getCurve()) || !params2.getGenerator().equals(params3.getGenerator()) || !params2.getOrder().equals(params3.getOrder()) || params2.getCofactor() != params3.getCofactor()) {
                throw new GeneralSecurityException("invalid public key spec");
            }
            ECPoint w10 = eCPublicKey2.getW();
            zv1.f(w10, eCPrivateKey.getParams().getCurve());
            PublicKey generatePublic = n72.f11548i.a("EC").generatePublic(new ECPublicKeySpec(w10, eCPrivateKey.getParams()));
            KeyAgreement a11 = n72.f11546g.a("ECDH");
            a11.init(eCPrivateKey);
            try {
                a11.doPhase(generatePublic, true);
                byte[] generateSecret = a11.generateSecret();
                EllipticCurve curve = eCPrivateKey.getParams().getCurve();
                BigInteger bigInteger2 = new BigInteger(1, generateSecret);
                if (bigInteger2.signum() == -1 || bigInteger2.compareTo(zv1.b(curve)) >= 0) {
                    throw new GeneralSecurityException("shared secret is out of range");
                }
                BigInteger b10 = zv1.b(curve);
                BigInteger mod = bigInteger2.multiply(bigInteger2).add(curve.getA()).multiply(bigInteger2).add(curve.getB()).mod(b10);
                if (b10.signum() != 1) {
                    throw new InvalidAlgorithmParameterException("p must be positive");
                }
                BigInteger mod2 = mod.mod(b10);
                BigInteger bigInteger3 = BigInteger.ZERO;
                if (!mod2.equals(bigInteger3)) {
                    BigInteger bigInteger4 = null;
                    if (!b10.testBit(0) || !b10.testBit(1)) {
                        if (b10.testBit(0) && !b10.testBit(1)) {
                            bigInteger3 = BigInteger.ONE;
                            BigInteger shiftRight = b10.subtract(bigInteger3).shiftRight(1);
                            int i14 = 0;
                            while (true) {
                                BigInteger mod3 = bigInteger3.multiply(bigInteger3).subtract(mod2).mod(b10);
                                if (mod3.equals(BigInteger.ZERO)) {
                                    break;
                                }
                                BigInteger modPow = mod3.modPow(shiftRight, b10);
                                BigInteger bigInteger5 = BigInteger.ONE;
                                if (modPow.add(bigInteger5).equals(b10)) {
                                    BigInteger shiftRight2 = b10.add(bigInteger5).shiftRight(1);
                                    int bitLength = shiftRight2.bitLength() - 2;
                                    bigInteger4 = bigInteger3;
                                    while (bitLength >= 0) {
                                        BigInteger multiply = bigInteger4.multiply(bigInteger5);
                                        bigInteger4 = bigInteger4.multiply(bigInteger4).add(bigInteger5.multiply(bigInteger5).mod(b10).multiply(mod3)).mod(b10);
                                        BigInteger mod4 = multiply.add(multiply).mod(b10);
                                        if (shiftRight2.testBit(bitLength)) {
                                            bigInteger = shiftRight2;
                                            BigInteger mod5 = bigInteger4.multiply(bigInteger3).add(mod4.multiply(mod3)).mod(b10);
                                            bigInteger5 = bigInteger3.multiply(mod4).add(bigInteger4).mod(b10);
                                            bigInteger4 = mod5;
                                        } else {
                                            bigInteger = shiftRight2;
                                            bigInteger5 = mod4;
                                        }
                                        bitLength--;
                                        shiftRight2 = bigInteger;
                                    }
                                } else if (!modPow.equals(bigInteger5)) {
                                    throw new InvalidAlgorithmParameterException("p is not prime");
                                } else {
                                    bigInteger3 = bigInteger3.add(bigInteger5);
                                    int i15 = i14 + 1;
                                    if (i15 == 128 && !b10.isProbablePrime(80)) {
                                        throw new InvalidAlgorithmParameterException("p is not prime");
                                    }
                                    i14 = i15;
                                }
                            }
                        }
                        bigInteger3 = bigInteger4;
                    } else {
                        bigInteger3 = mod2.modPow(b10.add(BigInteger.ONE).shiftRight(2), b10);
                    }
                    if (bigInteger3 != null && bigInteger3.multiply(bigInteger3).mod(b10).compareTo(mod2) != 0) {
                        throw new GeneralSecurityException("Could not find a modular square root");
                    }
                }
                if (!bigInteger3.testBit(0)) {
                    b10.subtract(bigInteger3).mod(b10);
                }
                EllipticCurve curve2 = eCPublicKey.getParams().getCurve();
                ECPoint w11 = eCPublicKey.getW();
                zv1.f(w11, curve2);
                int bitLength2 = (zv1.b(curve2).subtract(BigInteger.ONE).bitLength() + 7) / 8;
                int i16 = i13 - 1;
                if (i16 != 0) {
                    if (i16 != 2) {
                        int i17 = bitLength2 + 1;
                        bArr4 = new byte[i17];
                        byte[] byteArray = w11.getAffineX().toByteArray();
                        int length = byteArray.length;
                        System.arraycopy(byteArray, 0, bArr4, i17 - length, length);
                        bArr4[0] = true != w11.getAffineY().testBit(0) ? (byte) 2 : (byte) 3;
                    } else {
                        int i18 = bitLength2 + bitLength2;
                        bArr4 = new byte[i18];
                        byte[] byteArray2 = w11.getAffineX().toByteArray();
                        int length2 = byteArray2.length;
                        if (length2 > bitLength2) {
                            byteArray2 = Arrays.copyOfRange(byteArray2, length2 - bitLength2, length2);
                        }
                        byte[] byteArray3 = w11.getAffineY().toByteArray();
                        int length3 = byteArray3.length;
                        if (length3 > bitLength2) {
                            byteArray3 = Arrays.copyOfRange(byteArray3, length3 - bitLength2, length3);
                        }
                        int length4 = byteArray3.length;
                        System.arraycopy(byteArray3, 0, bArr4, i18 - length4, length4);
                        int length5 = byteArray2.length;
                        System.arraycopy(byteArray2, 0, bArr4, bitLength2 - length5, length5);
                    }
                    bArr3 = bArr4;
                    i11 = 2;
                    i10 = 1;
                    c10 = 0;
                } else {
                    i10 = 1;
                    int i19 = bitLength2 + bitLength2 + 1;
                    bArr3 = new byte[i19];
                    byte[] byteArray4 = w11.getAffineX().toByteArray();
                    byte[] byteArray5 = w11.getAffineY().toByteArray();
                    int length6 = byteArray5.length;
                    c10 = 0;
                    System.arraycopy(byteArray5, 0, bArr3, i19 - length6, length6);
                    int length7 = byteArray4.length;
                    System.arraycopy(byteArray4, 0, bArr3, (bitLength2 + 1) - length7, length7);
                    bArr3[0] = 4;
                    i11 = 2;
                }
                byte[][] bArr6 = new byte[i11];
                bArr6[c10] = bArr3;
                bArr6[i10] = generateSecret;
                byte[] d5 = g7.d(bArr6);
                Mac a12 = n72.f11545f.a(str);
                if (i12 <= a12.getMacLength() * 255) {
                    if (bArr5 == null || bArr5.length == 0) {
                        a12.init(new SecretKeySpec(new byte[a12.getMacLength()], str));
                    } else {
                        a12.init(new SecretKeySpec(bArr5, str));
                    }
                    byte[] bArr7 = new byte[i12];
                    a12.init(new SecretKeySpec(a12.doFinal(d5), str));
                    byte[] bArr8 = new byte[0];
                    int i20 = 0;
                    int i21 = i10;
                    while (true) {
                        a12.update(bArr8);
                        a12.update(bArr2);
                        a12.update((byte) i21);
                        doFinal = a12.doFinal();
                        int length8 = doFinal.length;
                        int i22 = i20 + length8;
                        if (i22 >= i12) {
                            break;
                        }
                        System.arraycopy(doFinal, 0, bArr7, i20, length8);
                        i21++;
                        bArr8 = doFinal;
                        i20 = i22;
                    }
                    System.arraycopy(doFinal, 0, bArr7, i20, i12 - i20);
                    int length9 = bArr3.length;
                    byte[] bArr9 = new byte[length9];
                    System.arraycopy(bArr3, 0, bArr9, 0, length9);
                    byte[] bArr10 = new byte[i12];
                    System.arraycopy(bArr7, 0, bArr10, 0, i12);
                    k32 k32Var = this.f10672d;
                    int length10 = bArr10.length;
                    byte[] bArr11 = new byte[length10];
                    System.arraycopy(bArr10, 0, bArr11, 0, length10);
                    Objects.requireNonNull(k32Var);
                    if (length10 != k32Var.f10270b) {
                        throw new GeneralSecurityException("Symmetric key has incorrect length");
                    }
                    if (k32Var.f10269a.equals(k12.f10242b)) {
                        r42 w12 = t42.w();
                        w12.h(k32Var.f10271c);
                        n82 D = n82.D(bArr11, 0, k32Var.f10270b);
                        if (w12.f9884u) {
                            w12.m();
                            w12.f9884u = false;
                        }
                        ((t42) w12.f9883t).zzf = D;
                        l70Var = new l70((j02) i12.c(k32Var.f10269a, w12.k(), j02.class));
                    } else if (k32Var.f10269a.equals(k12.f10241a)) {
                        byte[] copyOfRange = Arrays.copyOfRange(bArr11, 0, k32Var.f10273e);
                        byte[] copyOfRange2 = Arrays.copyOfRange(bArr11, k32Var.f10273e, k32Var.f10270b);
                        f42 w13 = g42.w();
                        w13.h(k32Var.f10272d.z());
                        n82 C = n82.C(copyOfRange);
                        if (w13.f9884u) {
                            w13.m();
                            w13.f9884u = false;
                        }
                        ((g42) w13.f9883t).zzg = C;
                        g42 k10 = w13.k();
                        v52 w14 = w52.w();
                        w14.h(k32Var.f10272d.A());
                        n82 C2 = n82.C(copyOfRange2);
                        if (w14.f9884u) {
                            w14.m();
                            w14.f9884u = false;
                        }
                        ((w52) w14.f9883t).zzg = C2;
                        w52 k11 = w14.k();
                        b42 w15 = c42.w();
                        int v10 = k32Var.f10272d.v();
                        if (w15.f9884u) {
                            w15.m();
                            z10 = false;
                            w15.f9884u = false;
                        } else {
                            z10 = false;
                        }
                        ((c42) w15.f9883t).zze = v10;
                        if (w15.f9884u) {
                            w15.m();
                            w15.f9884u = z10;
                        }
                        ((c42) w15.f9883t).zzf = k10;
                        if (w15.f9884u) {
                            w15.m();
                            w15.f9884u = z10;
                        }
                        c42.D((c42) w15.f9883t, k11);
                        l70Var = new l70((j02) i12.c(k32Var.f10269a, w15.k(), j02.class));
                    } else if (k32Var.f10269a.equals(w22.f14853a)) {
                        a52 w16 = b52.w();
                        w16.h(k32Var.f10274f);
                        n82 D2 = n82.D(bArr11, 0, k32Var.f10270b);
                        if (w16.f9884u) {
                            w16.m();
                            w16.f9884u = false;
                        }
                        ((b52) w16.f9883t).zzf = D2;
                        l70Var = new l70((l02) i12.c(k32Var.f10269a, w16.k(), l02.class));
                    } else {
                        throw new GeneralSecurityException("unknown DEM key type");
                    }
                    byte[] bArr12 = f10668f;
                    j02 j02Var = (j02) l70Var.f10666s;
                    byte[] b11 = j02Var != null ? j02Var.b(bArr, bArr12) : ((l02) l70Var.f10667t).b(bArr, bArr12);
                    int length11 = bArr9.length;
                    byte[] bArr13 = new byte[length11];
                    System.arraycopy(bArr9, 0, bArr13, 0, length11);
                    return ByteBuffer.allocate(length11 + b11.length).put(bArr13).put(b11).array();
                }
                throw new GeneralSecurityException("size too large");
            } catch (IllegalStateException e10) {
                throw new GeneralSecurityException(e10.toString());
            }
        } catch (IllegalArgumentException | NullPointerException e11) {
            throw new GeneralSecurityException(e11.toString());
        }
    }
}
