package y4;

import a4.f;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import d.a;
import d0.b;
import d4.m;
import j4.c;
import java.io.ByteArrayInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;
import javax.security.auth.x500.X500Principal;
import n9.d;
import n9.g;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import s4.hb;
import s4.v0;

/* loaded from: classes.dex */
public final class h6 extends j3 {
    public static final String[] y = {"firebase_", "google_", "ga_"};

    /* renamed from: z */
    public static final String[] f20493z = {"_err"};

    /* renamed from: u */
    public SecureRandom f20494u;

    /* renamed from: w */
    public int f20496w;

    /* renamed from: x */
    public Integer f20497x = null;

    /* renamed from: v */
    public final AtomicLong f20495v = new AtomicLong(0);

    static {
        Pattern.compile("^([^\\s@]+)@([^\\s@]+\\.[^\\s@]+)$");
        Pattern.compile("^(gmail|googlemail)\\.");
        Pattern.compile("[\\s-()/.]+");
        Pattern.compile("^\\+\\d{11,15}$");
        Pattern.compile("[0-9`~!@#$%^&*()_\\-+=:;<>,.?|/\\\\\\[\\]]+");
        Pattern.compile("\\s+");
    }

    public h6(w2 w2Var) {
        super(w2Var);
    }

    public static boolean V(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    public static boolean W(String str) {
        m.e(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    public static boolean X(Context context) {
        ActivityInfo receiverInfo;
        Objects.requireNonNull(context, "null reference");
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) != null) {
                if (receiverInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static boolean Y(Context context) {
        Objects.requireNonNull(context, "null reference");
        return g0(context, Build.VERSION.SDK_INT >= 24 ? "com.google.android.gms.measurement.AppMeasurementJobService" : "com.google.android.gms.measurement.AppMeasurementService");
    }

    public static boolean Z(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str != null) {
            return str.equals(str2);
        }
        return false;
    }

    public static final boolean c0(Bundle bundle, int i10) {
        if (bundle.getLong("_err") == 0) {
            bundle.putLong("_err", i10);
            return true;
        }
        return false;
    }

    public static boolean f0(String str, String[] strArr) {
        Objects.requireNonNull(strArr, "null reference");
        for (String str2 : strArr) {
            if (Z(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean g0(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) != null) {
                if (serviceInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static long n0(byte[] bArr) {
        Objects.requireNonNull(bArr, "null reference");
        int length = bArr.length;
        int i10 = 0;
        m.j(length > 0);
        long j3 = 0;
        for (int i11 = length - 1; i11 >= 0 && i11 >= bArr.length - 8; i11--) {
            j3 += (bArr[i11] & 255) << i10;
            i10 += 8;
        }
        return j3;
    }

    public static MessageDigest q() {
        MessageDigest messageDigest;
        for (int i10 = 0; i10 < 2; i10++) {
            try {
                messageDigest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    public static ArrayList<Bundle> s(List<b> list) {
        if (list == null) {
            return new ArrayList<>(0);
        }
        ArrayList<Bundle> arrayList = new ArrayList<>(list.size());
        for (b bVar : list) {
            Bundle bundle = new Bundle();
            bundle.putString("app_id", bVar.f20299s);
            bundle.putString("origin", bVar.f20300t);
            bundle.putLong("creation_timestamp", bVar.f20302v);
            bundle.putString("name", bVar.f20301u.f20363t);
            a.e(bundle, bVar.f20301u.s());
            bundle.putBoolean("active", bVar.f20303w);
            String str = bVar.f20304x;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            p pVar = bVar.y;
            if (pVar != null) {
                bundle.putString("timed_out_event_name", pVar.f20634s);
                n nVar = bVar.y.f20635t;
                if (nVar != null) {
                    bundle.putBundle("timed_out_event_params", nVar.s());
                }
            }
            bundle.putLong("trigger_timeout", bVar.f20305z);
            p pVar2 = bVar.A;
            if (pVar2 != null) {
                bundle.putString("triggered_event_name", pVar2.f20634s);
                n nVar2 = bVar.A.f20635t;
                if (nVar2 != null) {
                    bundle.putBundle("triggered_event_params", nVar2.s());
                }
            }
            bundle.putLong("triggered_timestamp", bVar.f20301u.f20364u);
            bundle.putLong("time_to_live", bVar.B);
            p pVar3 = bVar.C;
            if (pVar3 != null) {
                bundle.putString("expired_event_name", pVar3.f20634s);
                n nVar3 = bVar.C.f20635t;
                if (nVar3 != null) {
                    bundle.putBundle("expired_event_params", nVar3.s());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static void v(l4 l4Var, Bundle bundle, boolean z10) {
        if (bundle != null && l4Var != null) {
            if (!bundle.containsKey("_sc") || z10) {
                String str = l4Var.f20551a;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = l4Var.f20552b;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", l4Var.f20553c);
                return;
            }
            z10 = false;
        }
        if (bundle == null || l4Var != null || !z10) {
            return;
        }
        bundle.remove("_sn");
        bundle.remove("_sc");
        bundle.remove("_si");
    }

    public final void A(v0 v0Var, boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z10);
        try {
            v0Var.l0(bundle);
        } catch (RemoteException e10) {
            ((w2) this.f20505s).C().A.b("Error returning boolean value to wrapper", e10);
        }
    }

    public final void D(v0 v0Var, ArrayList<Bundle> arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            v0Var.l0(bundle);
        } catch (RemoteException e10) {
            ((w2) this.f20505s).C().A.b("Error returning bundle list to wrapper", e10);
        }
    }

    public final void E(v0 v0Var, Bundle bundle) {
        try {
            v0Var.l0(bundle);
        } catch (RemoteException e10) {
            ((w2) this.f20505s).C().A.b("Error returning bundle value to wrapper", e10);
        }
    }

    public final void F(v0 v0Var, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            v0Var.l0(bundle);
        } catch (RemoteException e10) {
            ((w2) this.f20505s).C().A.b("Error returning byte array to wrapper", e10);
        }
    }

    public final void G(v0 v0Var, int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i10);
        try {
            v0Var.l0(bundle);
        } catch (RemoteException e10) {
            ((w2) this.f20505s).C().A.b("Error returning int value to wrapper", e10);
        }
    }

    public final void H(v0 v0Var, long j3) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j3);
        try {
            v0Var.l0(bundle);
        } catch (RemoteException e10) {
            ((w2) this.f20505s).C().A.b("Error returning long value to wrapper", e10);
        }
    }

    public final void I(v0 v0Var, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            v0Var.l0(bundle);
        } catch (RemoteException e10) {
            ((w2) this.f20505s).C().A.b("Error returning string value to wrapper", e10);
        }
    }

    public final void J(String str, String str2, String str3, Bundle bundle, List<String> list, boolean z10) {
        int i10;
        String str4;
        int i11;
        if (bundle == null) {
            return;
        }
        Objects.requireNonNull((w2) this.f20505s);
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        int i12 = 0;
        while (it.hasNext()) {
            String str5 = (String) it.next();
            if (list == null || !list.contains(str5)) {
                i10 = !z10 ? k0(str5) : 0;
                if (i10 == 0) {
                    i10 = j0(str5);
                }
            } else {
                i10 = 0;
            }
            if (i10 != 0) {
                u(bundle, i10, str5, i10 == 3 ? str5 : null);
                bundle.remove(str5);
            } else {
                if (T(bundle.get(str5))) {
                    ((w2) this.f20505s).C().C.d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str2, str3, str5);
                    i11 = 22;
                    str4 = str5;
                } else {
                    str4 = str5;
                    i11 = O(str, str2, str5, bundle.get(str5), bundle, list, z10, false);
                }
                if (i11 != 0 && !"_ev".equals(str4)) {
                    u(bundle, i11, str4, bundle.get(str4));
                } else if (W(str4) && !f0(str4, b.K) && (i12 = i12 + 1) > 0) {
                    ((w2) this.f20505s).C().f20711z.c("Item cannot contain custom parameters", ((w2) this.f20505s).E.d(str2), ((w2) this.f20505s).E.b(bundle));
                    c0(bundle, 23);
                }
                bundle.remove(str4);
            }
        }
    }

    public final boolean K(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str)) {
            Objects.requireNonNull(str, "null reference");
            if (str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$")) {
                return true;
            }
            if (((w2) this.f20505s).g()) {
                ((w2) this.f20505s).C().f20711z.b("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", s1.s(str));
            }
            return false;
        }
        hb.b();
        if (((w2) this.f20505s).y.s(null, f1.f20404d0) && !TextUtils.isEmpty(str3)) {
            return true;
        }
        if (TextUtils.isEmpty(str2)) {
            if (((w2) this.f20505s).g()) {
                ((w2) this.f20505s).C().f20711z.a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            }
            return false;
        }
        Objects.requireNonNull(str2, "null reference");
        if (str2.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$")) {
            return true;
        }
        ((w2) this.f20505s).C().f20711z.b("Invalid admob_app_id. Analytics disabled.", s1.s(str2));
        return false;
    }

    public final boolean L(String str, int i10, String str2) {
        if (str2 == null) {
            ((w2) this.f20505s).C().f20711z.b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.codePointCount(0, str2.length()) <= i10) {
            return true;
        } else {
            ((w2) this.f20505s).C().f20711z.d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i10), str2);
            return false;
        }
    }

    public final boolean M(String str, String[] strArr, String[] strArr2, String str2) {
        if (str2 == null) {
            ((w2) this.f20505s).C().f20711z.b("Name is required and can't be null. Type", str);
            return false;
        }
        String[] strArr3 = y;
        for (int i10 = 0; i10 < 3; i10++) {
            if (str2.startsWith(strArr3[i10])) {
                ((w2) this.f20505s).C().f20711z.c("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr == null || !f0(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && f0(str2, strArr2)) {
            return true;
        }
        ((w2) this.f20505s).C().f20711z.c("Name is reserved. Type, name", str, str2);
        return false;
    }

    public final boolean N(String str, String str2, int i10, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String valueOf = String.valueOf(obj);
            if (valueOf.codePointCount(0, valueOf.length()) > i10) {
                ((w2) this.f20505s).C().C.d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(valueOf.length()));
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00e9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int O(java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.Object r18, android.os.Bundle r19, java.util.List<java.lang.String> r20, boolean r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y4.h6.O(java.lang.String, java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    public final boolean P(String str, String str2) {
        if (str2 == null) {
            ((w2) this.f20505s).C().f20711z.b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            ((w2) this.f20505s).C().f20711z.b("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                if (codePointAt != 95) {
                    ((w2) this.f20505s).C().f20711z.c("Name must start with a letter or _ (underscore). Type, name", str, str2);
                    return false;
                }
                codePointAt = 95;
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                    ((w2) this.f20505s).C().f20711z.c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
                charCount += Character.charCount(codePointAt2);
            }
            return true;
        }
    }

    public final boolean Q(String str, String str2) {
        if (str2 == null) {
            ((w2) this.f20505s).C().f20711z.b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            ((w2) this.f20505s).C().f20711z.b("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                ((w2) this.f20505s).C().f20711z.c("Name must start with a letter. Type, name", str, str2);
                return false;
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                    ((w2) this.f20505s).C().f20711z.c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
                charCount += Character.charCount(codePointAt2);
            }
            return true;
        }
    }

    public final boolean R(String str) {
        g();
        if (c.a(((w2) this.f20505s).f20786s).f5450a.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        ((w2) this.f20505s).C().E.b("Permission not granted", str);
        return false;
    }

    public final boolean S(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String i10 = ((w2) this.f20505s).y.i("debug.firebase.analytics.app");
        Objects.requireNonNull((w2) this.f20505s);
        return i10.equals(str);
    }

    public final boolean T(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    public final boolean U(Context context, String str) {
        q1 q1Var;
        Object e10;
        String str2;
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo d5 = c.a(context).d(str, 64);
            if (d5 != null && (signatureArr = d5.signatures) != null && signatureArr.length > 0) {
                return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
            }
            return true;
        } catch (PackageManager.NameNotFoundException e11) {
            e10 = e11;
            q1Var = ((w2) this.f20505s).C().f20710x;
            str2 = "Package name not found";
            q1Var.b(str2, e10);
            return true;
        } catch (CertificateException e12) {
            e10 = e12;
            q1Var = ((w2) this.f20505s).C().f20710x;
            str2 = "Error obtaining certificate";
            q1Var.b(str2, e10);
            return true;
        }
    }

    public final boolean a0(String str, String str2, String str3, String str4) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            Objects.requireNonNull(str, "null reference");
            return !str.equals(str2);
        } else if (isEmpty && isEmpty2) {
            return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
        } else if (isEmpty) {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        } else if (TextUtils.isEmpty(str4)) {
            return false;
        } else {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
    }

    public final byte[] b0(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    public final int d0(String str) {
        if ("_ldl".equals(str)) {
            Objects.requireNonNull((w2) this.f20505s);
            return 2048;
        } else if ("_id".equals(str)) {
            Objects.requireNonNull((w2) this.f20505s);
            return 256;
        } else if (!((w2) this.f20505s).y.s(null, f1.f20400b0) || !"_lgclid".equals(str)) {
            Objects.requireNonNull((w2) this.f20505s);
            return 36;
        } else {
            Objects.requireNonNull((w2) this.f20505s);
            return 100;
        }
    }

    public final Object e0(int i10, Object obj, boolean z10, boolean z11) {
        Parcelable[] parcelableArr;
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(true != ((Boolean) obj).booleanValue() ? 0L : 1L);
        } else if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        } else {
            if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
                return p(String.valueOf(obj), i10, z10);
            }
            if (!z11 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Parcelable parcelable : (Parcelable[]) obj) {
                if (parcelable instanceof Bundle) {
                    Bundle r02 = r0((Bundle) parcelable);
                    if (!r02.isEmpty()) {
                        arrayList.add(r02);
                    }
                }
            }
            return arrayList.toArray(new Bundle[arrayList.size()]);
        }
    }

    @Override // y4.j3
    public final void h() {
        g();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                ((w2) this.f20505s).C().A.a("Utils falling back to Random for random id");
            }
        }
        this.f20495v.set(nextLong);
    }

    public final int h0(String str, Object obj) {
        String str2;
        int i10;
        if ("_ldl".equals(str)) {
            i10 = d0(str);
            str2 = "user property referrer";
        } else {
            i10 = d0(str);
            str2 = "user property";
        }
        return N(str2, str, i10, obj) ? 0 : 7;
    }

    @Override // y4.j3
    public final boolean i() {
        return true;
    }

    public final int i0(String str) {
        if (!P("event", str)) {
            return 2;
        }
        if (!M("event", d.f16689w, d.f16690x, str)) {
            return 13;
        }
        Objects.requireNonNull((w2) this.f20505s);
        return !L("event", 40, str) ? 2 : 0;
    }

    public final int j0(String str) {
        if (!P("event param", str)) {
            return 3;
        }
        if (!M("event param", null, null, str)) {
            return 14;
        }
        Objects.requireNonNull((w2) this.f20505s);
        return !L("event param", 40, str) ? 3 : 0;
    }

    public final int k0(String str) {
        if (!Q("event param", str)) {
            return 3;
        }
        if (!M("event param", null, null, str)) {
            return 14;
        }
        Objects.requireNonNull((w2) this.f20505s);
        return !L("event param", 40, str) ? 3 : 0;
    }

    public final int l0(String str) {
        if (!P("user property", str)) {
            return 6;
        }
        if (!M("user property", g.f16699u, null, str)) {
            return 15;
        }
        Objects.requireNonNull((w2) this.f20505s);
        return !L("user property", 24, str) ? 6 : 0;
    }

    @EnsuresNonNull({"this.apkVersion"})
    public final int m0() {
        if (this.f20497x == null) {
            this.f20497x = Integer.valueOf(f.f133b.a(((w2) this.f20505s).f20786s) / 1000);
        }
        return this.f20497x.intValue();
    }

    public final Object n(String str, Object obj) {
        int i10 = 256;
        if ("_ev".equals(str)) {
            Objects.requireNonNull((w2) this.f20505s);
            return e0(256, obj, true, true);
        }
        if (V(str)) {
            Objects.requireNonNull((w2) this.f20505s);
        } else {
            Objects.requireNonNull((w2) this.f20505s);
            i10 = 100;
        }
        return e0(i10, obj, false, true);
    }

    public final Object o(String str, Object obj) {
        boolean equals = "_ldl".equals(str);
        int d02 = d0(str);
        return equals ? e0(d02, obj, true, false) : e0(d02, obj, false, false);
    }

    public final long o0() {
        long andIncrement;
        long j3;
        if (this.f20495v.get() != 0) {
            synchronized (this.f20495v) {
                this.f20495v.compareAndSet(-1L, 1L);
                andIncrement = this.f20495v.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (this.f20495v) {
            long nanoTime = System.nanoTime();
            Objects.requireNonNull(((w2) this.f20505s).F);
            long nextLong = new Random(nanoTime ^ System.currentTimeMillis()).nextLong();
            int i10 = this.f20496w + 1;
            this.f20496w = i10;
            j3 = nextLong + i10;
        }
        return j3;
    }

    public final String p(String str, int i10, boolean z10) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i10) {
            return str;
        }
        if (!z10) {
            return null;
        }
        return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i10))).concat("...");
    }

    public final long p0(long j3, long j10) {
        return ((j10 * 60000) + j3) / 86400000;
    }

    public final Bundle q0(Uri uri) {
        String str;
        String str2;
        String str3;
        String str4;
        if (uri != null) {
            try {
                if (uri.isHierarchical()) {
                    str4 = uri.getQueryParameter("utm_campaign");
                    str3 = uri.getQueryParameter("utm_source");
                    str2 = uri.getQueryParameter("utm_medium");
                    str = uri.getQueryParameter("gclid");
                } else {
                    str4 = null;
                    str3 = null;
                    str2 = null;
                    str = null;
                }
                if (TextUtils.isEmpty(str4) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str)) {
                    return null;
                }
                Bundle bundle = new Bundle();
                if (!TextUtils.isEmpty(str4)) {
                    bundle.putString("campaign", str4);
                }
                if (!TextUtils.isEmpty(str3)) {
                    bundle.putString("source", str3);
                }
                if (!TextUtils.isEmpty(str2)) {
                    bundle.putString("medium", str2);
                }
                if (!TextUtils.isEmpty(str)) {
                    bundle.putString("gclid", str);
                }
                String queryParameter = uri.getQueryParameter("utm_term");
                if (!TextUtils.isEmpty(queryParameter)) {
                    bundle.putString("term", queryParameter);
                }
                String queryParameter2 = uri.getQueryParameter("utm_content");
                if (!TextUtils.isEmpty(queryParameter2)) {
                    bundle.putString("content", queryParameter2);
                }
                String queryParameter3 = uri.getQueryParameter("aclid");
                if (!TextUtils.isEmpty(queryParameter3)) {
                    bundle.putString("aclid", queryParameter3);
                }
                String queryParameter4 = uri.getQueryParameter("cp1");
                if (!TextUtils.isEmpty(queryParameter4)) {
                    bundle.putString("cp1", queryParameter4);
                }
                String queryParameter5 = uri.getQueryParameter("anid");
                if (!TextUtils.isEmpty(queryParameter5)) {
                    bundle.putString("anid", queryParameter5);
                }
                return bundle;
            } catch (UnsupportedOperationException e10) {
                ((w2) this.f20505s).C().A.b("Install referrer url isn't a hierarchical URI", e10);
            }
        }
        return null;
    }

    @EnsuresNonNull({"this.secureRandom"})
    public final SecureRandom r() {
        g();
        if (this.f20494u == null) {
            this.f20494u = new SecureRandom();
        }
        return this.f20494u;
    }

    public final Bundle r0(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object n10 = n(str, bundle.get(str));
                if (n10 == null) {
                    ((w2) this.f20505s).C().C.b("Param value can't be null", ((w2) this.f20505s).E.e(str));
                } else {
                    z(bundle2, str, n10);
                }
            }
        }
        return bundle2;
    }

    public final Bundle s0(String str, String str2, Bundle bundle, List<String> list, boolean z10) {
        int i10;
        int i11;
        List<String> list2 = list;
        boolean f02 = f0(str2, d.f16691z);
        if (bundle != null) {
            Bundle bundle2 = new Bundle(bundle);
            int k10 = ((w2) this.f20505s).y.k();
            Iterator it = new TreeSet(bundle.keySet()).iterator();
            int i12 = 0;
            while (it.hasNext()) {
                String str3 = (String) it.next();
                if (list2 == null || !list2.contains(str3)) {
                    i10 = !z10 ? k0(str3) : 0;
                    if (i10 == 0) {
                        i10 = j0(str3);
                    }
                } else {
                    i10 = 0;
                }
                if (i10 != 0) {
                    u(bundle2, i10, str3, i10 == 3 ? str3 : null);
                    bundle2.remove(str3);
                    i11 = k10;
                } else {
                    i11 = k10;
                    int O = O(str, str2, str3, bundle.get(str3), bundle2, list, z10, f02);
                    if (O == 17) {
                        u(bundle2, 17, str3, Boolean.FALSE);
                    } else if (O != 0 && !"_ev".equals(str3)) {
                        u(bundle2, O, O == 21 ? str2 : str3, bundle.get(str3));
                        bundle2.remove(str3);
                    }
                    if (W(str3)) {
                        int i13 = i12 + 1;
                        if (i13 > i11) {
                            StringBuilder sb = new StringBuilder(48);
                            sb.append("Event can't contain more than ");
                            sb.append(i11);
                            sb.append(" params");
                            ((w2) this.f20505s).C().f20711z.c(sb.toString(), ((w2) this.f20505s).E.d(str2), ((w2) this.f20505s).E.b(bundle));
                            c0(bundle2, 5);
                            bundle2.remove(str3);
                        }
                        i12 = i13;
                    }
                }
                k10 = i11;
                list2 = list;
            }
            return bundle2;
        }
        return null;
    }

    public final void t(Bundle bundle, long j3) {
        long j10 = bundle.getLong("_et");
        if (j10 != 0) {
            ((w2) this.f20505s).C().A.b("Params already contained engagement", Long.valueOf(j10));
        }
        bundle.putLong("_et", j3 + j10);
    }

    public final p t0(String str, String str2, Bundle bundle, String str3, long j3, boolean z10) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (i0(str2) == 0) {
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            bundle2.putString("_o", str3);
            Bundle s02 = s0(str, str2, bundle2, Collections.singletonList("_o"), true);
            if (z10) {
                s02 = r0(s02);
            }
            m.h(s02);
            return new p(str2, new n(s02), str3, j3);
        }
        ((w2) this.f20505s).C().f20710x.b("Invalid conditional property event name", ((w2) this.f20505s).E.f(str2));
        throw new IllegalArgumentException();
    }

    public final void u(Bundle bundle, int i10, String str, Object obj) {
        if (c0(bundle, i10)) {
            Objects.requireNonNull((w2) this.f20505s);
            bundle.putString("_ev", p(str, 40, true));
            if (obj == null) {
                return;
            }
            if (!(obj instanceof String) && !(obj instanceof CharSequence)) {
                return;
            }
            bundle.putLong("_el", String.valueOf(obj).length());
        }
    }

    public final void w(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                ((w2) this.f20505s).z().z(bundle, str, bundle2.get(str));
            }
        }
    }

    public final void x(t1 t1Var, int i10) {
        Iterator it = new TreeSet(t1Var.f20734d.keySet()).iterator();
        int i11 = 0;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (W(str) && (i11 = i11 + 1) > i10) {
                StringBuilder sb = new StringBuilder(48);
                sb.append("Event can't contain more than ");
                sb.append(i10);
                sb.append(" params");
                ((w2) this.f20505s).C().f20711z.c(sb.toString(), ((w2) this.f20505s).E.d(t1Var.f20731a), ((w2) this.f20505s).E.b(t1Var.f20734d));
                c0(t1Var.f20734d, 5);
                t1Var.f20734d.remove(str);
            }
        }
    }

    public final void y(g6 g6Var, String str, int i10, String str2, String str3, int i11) {
        Bundle bundle = new Bundle();
        c0(bundle, i10);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i10 == 6 || i10 == 7 || i10 == 2) {
            bundle.putLong("_el", i11);
        }
        g6Var.a(str, bundle);
    }

    public final void z(Bundle bundle, String str, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
        } else if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
        } else if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
        } else if (str == null) {
        } else {
            ((w2) this.f20505s).C().C.c("Not putting event parameter. Invalid value type. name, type", ((w2) this.f20505s).E.e(str), obj != null ? obj.getClass().getSimpleName() : null);
        }
    }
}
