package m4;

import android.content.Context;
import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager;
import android.os.Build;
import e.o;
import java.io.ByteArrayInputStream;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class y8 extends v9 {

    /* renamed from: i */
    public static final o f15609i = new o();

    /* renamed from: h */
    public final Context f15610h;

    public y8(n8 n8Var, v5 v5Var, int i10, Context context) {
        super(n8Var, "iH08ecr5p8p5eQT3/BFJ6jAaJm3eLNoIe2oA7hLZl5P0jAtinrUdPK16lrJGpxBz", "Gvy6wet11FtrNaAWhnvYSI1hOQnkPBTAgqoI9PXuwaM=", v5Var, i10, 27);
        this.f15610h = context;
    }

    @Override // m4.v9
    public final void a() {
        z6 z6Var;
        int i10;
        AtomicReference b10 = f15609i.b(this.f15610h.getPackageName());
        synchronized (b10) {
            z6 z6Var2 = (z6) b10.get();
            if (z6Var2 == null || p8.b(z6Var2.f16009a) || z6Var2.f16009a.equals("E") || z6Var2.f16009a.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                if (!p8.b(null)) {
                    i10 = 5;
                } else {
                    char[] cArr = p8.f12428a;
                    i10 = 3;
                }
                Boolean valueOf = Boolean.valueOf(i10 == 3);
                yr<Boolean> yrVar = es.f8229x1;
                jo joVar = jo.f10145d;
                Boolean bool = (Boolean) joVar.f10148c.a(yrVar);
                String c10 = ((Boolean) joVar.f10148c.a(es.f8222w1)).booleanValue() ? c() : null;
                if (bool.booleanValue() && this.f14616a.f11563n && p8.b(c10)) {
                    c10 = d();
                }
                z6 z6Var3 = new z6((String) this.f14620e.invoke(null, this.f15610h, valueOf, c10));
                if (p8.b(z6Var3.f16009a) || z6Var3.f16009a.equals("E")) {
                    int i11 = i10 - 1;
                    if (i11 == 3) {
                        String d5 = d();
                        if (!p8.b(d5)) {
                            z6Var3.f16009a = d5;
                        }
                    } else if (i11 == 4) {
                        throw null;
                    }
                }
                b10.set(z6Var3);
            }
            z6Var = (z6) b10.get();
        }
        synchronized (this.f14619d) {
            if (z6Var != null) {
                v5 v5Var = this.f14619d;
                String str = z6Var.f16009a;
                if (v5Var.f9884u) {
                    v5Var.m();
                    v5Var.f9884u = false;
                }
                k6.D0((k6) v5Var.f9883t, str);
                v5 v5Var2 = this.f14619d;
                long j3 = z6Var.f16010b;
                if (v5Var2.f9884u) {
                    v5Var2.m();
                    v5Var2.f9884u = false;
                }
                k6.x((k6) v5Var2.f9883t, j3);
                v5 v5Var3 = this.f14619d;
                String str2 = z6Var.f16011c;
                if (v5Var3.f9884u) {
                    v5Var3.m();
                    v5Var3.f9884u = false;
                }
                k6.w((k6) v5Var3.f9883t, str2);
                v5 v5Var4 = this.f14619d;
                String str3 = z6Var.f16012d;
                if (v5Var4.f9884u) {
                    v5Var4.m();
                    v5Var4.f9884u = false;
                }
                k6.G((k6) v5Var4.f9883t, str3);
                v5 v5Var5 = this.f14619d;
                String str4 = z6Var.f16013e;
                if (v5Var5.f9884u) {
                    v5Var5.m();
                    v5Var5.f9884u = false;
                }
                k6.H((k6) v5Var5.f9883t, str4);
            }
        }
    }

    public final String c() {
        ArrayList arrayList;
        Context context;
        String packageName;
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            yr<String> yrVar = es.f8236y1;
            jo joVar = jo.f10145d;
            byte[] c10 = p8.c((String) joVar.f10148c.a(yrVar));
            arrayList = new ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(c10)));
            if (!Build.TYPE.equals("user")) {
                arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(p8.c((String) joVar.f10148c.a(es.f8243z1)))));
            }
            context = this.f15610h;
            packageName = context.getPackageName();
            Objects.requireNonNull(this.f14616a);
        } catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException unused) {
        }
        if (Build.VERSION.SDK_INT > 30 || Build.VERSION.CODENAME.equals("S")) {
            final a02 a02Var = new a02();
            context.getPackageManager().requestChecksums(packageName, false, 8, arrayList, new PackageManager.OnChecksumsReadyListener() { // from class: m4.w9
                @Override // android.content.pm.PackageManager.OnChecksumsReadyListener
                public final void onChecksumsReady(List list) {
                    a02 a02Var2 = a02.this;
                    if (list == null) {
                        a02Var2.l(null);
                        return;
                    }
                    try {
                        int size = list.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            ApkChecksum apkChecksum = (ApkChecksum) list.get(i10);
                            if (apkChecksum.getType() == 8) {
                                byte[] value = apkChecksum.getValue();
                                char[] cArr = p8.f12428a;
                                int length = value.length;
                                char[] cArr2 = new char[length + length];
                                for (int i11 = 0; i11 < value.length; i11++) {
                                    int i12 = value[i11] & 255;
                                    int i13 = i11 + i11;
                                    char[] cArr3 = p8.f12428a;
                                    cArr2[i13] = cArr3[i12 >>> 4];
                                    cArr2[i13 + 1] = cArr3[i12 & 15];
                                }
                                a02Var2.l(new String(cArr2));
                                return;
                            }
                        }
                        a02Var2.l(null);
                    } catch (Throwable unused2) {
                        a02Var2.l(null);
                    }
                }
            });
            return (String) a02Var.get();
        }
        return null;
    }

    public final String d() {
        try {
            Future future = this.f14616a.f11560k;
            if (future != null) {
                future.get();
            }
            k6 k6Var = this.f14616a.f11559j;
            if (k6Var != null && k6Var.a0()) {
                return k6Var.o0();
            }
            return null;
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }
}
