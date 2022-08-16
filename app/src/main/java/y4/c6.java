package y4;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.activity.result.a;
import d4.m;
import e4.b;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.zip.GZIPOutputStream;
import n9.d;
import s4.e4;
import s4.g4;
import s4.h4;
import s4.i4;
import s4.k3;
import s4.m3;
import s4.n3;
import s4.o3;
import s4.o6;
import s4.q2;
import s4.r3;
import s4.s3;
import s4.t2;
import s4.v2;
import s4.w3;
import s4.w5;
import s4.w6;
import s4.x3;
import s4.y2;
import s4.y3;
import s4.y6;

/* loaded from: classes.dex */
public final class c6 extends v5 {
    public c6(a6 a6Var) {
        super(a6Var);
    }

    public static <Builder extends w5> Builder D(Builder builder, byte[] bArr) {
        o6 o6Var = o6.f18043c;
        if (o6Var == null) {
            synchronized (o6.class) {
                o6Var = o6.f18043c;
                if (o6Var == null) {
                    o6Var = w6.b();
                    o6.f18043c = o6Var;
                }
            }
        }
        Objects.requireNonNull(builder);
        if (o6Var != null) {
            y6 y6Var = (y6) builder;
            y6Var.l(bArr, bArr.length, o6Var);
            return y6Var;
        }
        y6 y6Var2 = (y6) builder;
        y6Var2.l(bArr, bArr.length, o6.a());
        return y6Var2;
    }

    public static List<s3> G(Bundle[] bundleArr) {
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : bundleArr) {
            if (bundle != null) {
                r3 w10 = s3.w();
                for (String str : bundle.keySet()) {
                    r3 w11 = s3.w();
                    w11.o(str);
                    Object obj = bundle.get(str);
                    if (obj instanceof Long) {
                        w11.n(((Long) obj).longValue());
                    } else if (obj instanceof String) {
                        w11.p((String) obj);
                    } else if (obj instanceof Double) {
                        w11.m(((Double) obj).doubleValue());
                    }
                    if (w10.f18206u) {
                        w10.h();
                        w10.f18206u = false;
                    }
                    s3.I((s3) w10.f18205t, w11.f());
                }
                if (((s3) w10.f18205t).u() > 0) {
                    arrayList.add(w10.f());
                }
            }
        }
        return arrayList;
    }

    public static List<Long> I(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            long j3 = 0;
            for (int i11 = 0; i11 < 64; i11++) {
                int i12 = (i10 * 64) + i11;
                if (i12 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i12)) {
                    j3 |= 1 << i11;
                }
            }
            arrayList.add(Long.valueOf(j3));
        }
        return arrayList;
    }

    public static boolean M(List<Long> list, int i10) {
        if (i10 < list.size() * 64) {
            return ((1 << (i10 % 64)) & list.get(i10 / 64).longValue()) != 0;
        }
        return false;
    }

    public static boolean O(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    public static final void k(n3 n3Var, String str, Object obj) {
        List<s3> v10 = n3Var.v();
        int i10 = 0;
        while (true) {
            if (i10 >= v10.size()) {
                i10 = -1;
                break;
            } else if (str.equals(v10.get(i10).y())) {
                break;
            } else {
                i10++;
            }
        }
        r3 w10 = s3.w();
        w10.o(str);
        if (obj instanceof Long) {
            w10.n(((Long) obj).longValue());
        } else if (obj instanceof String) {
            w10.p((String) obj);
        } else if (obj instanceof Double) {
            w10.m(((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            List<s3> G = G((Bundle[]) obj);
            if (w10.f18206u) {
                w10.h();
                w10.f18206u = false;
            }
            s3.J((s3) w10.f18205t, G);
        }
        if (i10 >= 0) {
            if (n3Var.f18206u) {
                n3Var.h();
                n3Var.f18206u = false;
            }
            o3.B((o3) n3Var.f18205t, i10, w10.f());
            return;
        }
        n3Var.p(w10);
    }

    public static final boolean l(p pVar, k6 k6Var) {
        Objects.requireNonNull(k6Var, "null reference");
        return !TextUtils.isEmpty(k6Var.f20536t) || !TextUtils.isEmpty(k6Var.I);
    }

    public static final s3 m(o3 o3Var, String str) {
        for (s3 s3Var : o3Var.A()) {
            if (s3Var.y().equals(str)) {
                return s3Var;
            }
        }
        return null;
    }

    public static final Object n(o3 o3Var, String str) {
        s3 m10 = m(o3Var, str);
        if (m10 != null) {
            if (m10.P()) {
                return m10.z();
            }
            if (m10.N()) {
                return Long.valueOf(m10.v());
            }
            if (m10.L()) {
                return Double.valueOf(m10.s());
            }
            if (m10.u() <= 0) {
                return null;
            }
            List<s3> A = m10.A();
            ArrayList arrayList = new ArrayList();
            for (s3 s3Var : A) {
                if (s3Var != null) {
                    Bundle bundle = new Bundle();
                    for (s3 s3Var2 : s3Var.A()) {
                        if (s3Var2.P()) {
                            bundle.putString(s3Var2.y(), s3Var2.z());
                        } else if (s3Var2.N()) {
                            bundle.putLong(s3Var2.y(), s3Var2.v());
                        } else if (s3Var2.L()) {
                            bundle.putDouble(s3Var2.y(), s3Var2.s());
                        }
                    }
                    if (!bundle.isEmpty()) {
                        arrayList.add(bundle);
                    }
                }
            }
            return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
        }
        return null;
    }

    public static final void q(StringBuilder sb, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            sb.append("  ");
        }
    }

    public static final String r(boolean z10, boolean z11, boolean z12) {
        StringBuilder sb = new StringBuilder();
        if (z10) {
            sb.append("Dynamic ");
        }
        if (z11) {
            sb.append("Sequence ");
        }
        if (z12) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    public static final void s(StringBuilder sb, String str, e4 e4Var) {
        if (e4Var == null) {
            return;
        }
        q(sb, 3);
        sb.append(str);
        sb.append(" {\n");
        if (e4Var.t() != 0) {
            q(sb, 4);
            sb.append("results: ");
            int i10 = 0;
            for (Long l10 : e4Var.C()) {
                int i11 = i10 + 1;
                if (i10 != 0) {
                    sb.append(", ");
                }
                sb.append(l10);
                i10 = i11;
            }
            sb.append('\n');
        }
        if (e4Var.v() != 0) {
            q(sb, 4);
            sb.append("status: ");
            int i12 = 0;
            for (Long l11 : e4Var.E()) {
                int i13 = i12 + 1;
                if (i12 != 0) {
                    sb.append(", ");
                }
                sb.append(l11);
                i12 = i13;
            }
            sb.append('\n');
        }
        if (e4Var.s() != 0) {
            q(sb, 4);
            sb.append("dynamic_filter_timestamps: {");
            int i14 = 0;
            for (m3 m3Var : e4Var.B()) {
                int i15 = i14 + 1;
                if (i14 != 0) {
                    sb.append(", ");
                }
                sb.append(m3Var.z() ? Integer.valueOf(m3Var.s()) : null);
                sb.append(":");
                sb.append(m3Var.y() ? Long.valueOf(m3Var.t()) : null);
                i14 = i15;
            }
            sb.append("}\n");
        }
        if (e4Var.u() != 0) {
            q(sb, 4);
            sb.append("sequence_filter_timestamps: {");
            int i16 = 0;
            for (g4 g4Var : e4Var.D()) {
                int i17 = i16 + 1;
                if (i16 != 0) {
                    sb.append(", ");
                }
                sb.append(g4Var.A() ? Integer.valueOf(g4Var.t()) : null);
                sb.append(": [");
                int i18 = 0;
                for (Long l12 : g4Var.x()) {
                    long longValue = l12.longValue();
                    int i19 = i18 + 1;
                    if (i18 != 0) {
                        sb.append(", ");
                    }
                    sb.append(longValue);
                    i18 = i19;
                }
                sb.append("]");
                i16 = i17;
            }
            sb.append("}\n");
        }
        q(sb, 3);
        sb.append("}\n");
    }

    public static final void t(StringBuilder sb, int i10, String str, Object obj) {
        if (obj == null) {
            return;
        }
        q(sb, i10 + 1);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    public static final void u(StringBuilder sb, int i10, String str, t2 t2Var) {
        if (t2Var == null) {
            return;
        }
        q(sb, i10);
        sb.append(str);
        sb.append(" {\n");
        if (t2Var.y()) {
            int D = t2Var.D();
            t(sb, i10, "comparison_type", D != 1 ? D != 2 ? D != 3 ? D != 4 ? "BETWEEN" : "EQUAL" : "GREATER_THAN" : "LESS_THAN" : "UNKNOWN_COMPARISON_TYPE");
        }
        if (t2Var.A()) {
            t(sb, i10, "match_as_float", Boolean.valueOf(t2Var.x()));
        }
        if (t2Var.z()) {
            t(sb, i10, "comparison_value", t2Var.u());
        }
        if (t2Var.C()) {
            t(sb, i10, "min_comparison_value", t2Var.w());
        }
        if (t2Var.B()) {
            t(sb, i10, "max_comparison_value", t2Var.v());
        }
        q(sb, i10);
        sb.append("}\n");
    }

    public static int v(x3 x3Var, String str) {
        for (int i10 = 0; i10 < ((y3) x3Var.f18205t).m1(); i10++) {
            if (str.equals(((y3) x3Var.f18205t).B1(i10).x())) {
                return i10;
            }
        }
        return -1;
    }

    public final o3 A(l lVar) {
        n3 w10 = o3.w();
        long j3 = lVar.f20546e;
        if (w10.f18206u) {
            w10.h();
            w10.f18206u = false;
        }
        o3.I((o3) w10.f18205t, j3);
        for (String str : lVar.f20547f.f20587s.keySet()) {
            r3 w11 = s3.w();
            w11.o(str);
            Object v10 = lVar.f20547f.v(str);
            m.h(v10);
            K(w11, v10);
            w10.p(w11);
        }
        return w10.f();
    }

    public final String E(w3 w3Var) {
        StringBuilder c10 = a.c("\nbatch {\n");
        for (y3 y3Var : w3Var.v()) {
            if (y3Var != null) {
                q(c10, 1);
                c10.append("bundle {\n");
                if (y3Var.b1()) {
                    t(c10, 1, "protocol_version", Integer.valueOf(y3Var.j1()));
                }
                t(c10, 1, "platform", y3Var.C());
                if (y3Var.X0()) {
                    t(c10, 1, "gmp_version", Long.valueOf(y3Var.s1()));
                }
                if (y3Var.h1()) {
                    t(c10, 1, "uploading_gmp_version", Long.valueOf(y3Var.x1()));
                }
                if (y3Var.V0()) {
                    t(c10, 1, "dynamite_version", Long.valueOf(y3Var.q1()));
                }
                if (y3Var.q0()) {
                    t(c10, 1, "config_version", Long.valueOf(y3Var.o1()));
                }
                t(c10, 1, "gmp_app_id", y3Var.z());
                t(c10, 1, "admob_app_id", y3Var.C1());
                t(c10, 1, "app_id", y3Var.D1());
                t(c10, 1, "app_version", y3Var.t());
                if (y3Var.o0()) {
                    t(c10, 1, "app_version_major", Integer.valueOf(y3Var.R()));
                }
                t(c10, 1, "firebase_instance_id", y3Var.x());
                if (y3Var.U0()) {
                    t(c10, 1, "dev_cert_hash", Long.valueOf(y3Var.p1()));
                }
                t(c10, 1, "app_store", y3Var.s());
                if (y3Var.g1()) {
                    t(c10, 1, "upload_timestamp_millis", Long.valueOf(y3Var.w1()));
                }
                if (y3Var.e1()) {
                    t(c10, 1, "start_timestamp_millis", Long.valueOf(y3Var.v1()));
                }
                if (y3Var.W0()) {
                    t(c10, 1, "end_timestamp_millis", Long.valueOf(y3Var.r1()));
                }
                if (y3Var.a1()) {
                    t(c10, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(y3Var.u1()));
                }
                if (y3Var.Z0()) {
                    t(c10, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(y3Var.t1()));
                }
                t(c10, 1, "app_instance_id", y3Var.E1());
                t(c10, 1, "resettable_device_id", y3Var.D());
                t(c10, 1, "ds_id", y3Var.w());
                if (y3Var.Y0()) {
                    t(c10, 1, "limited_ad_tracking", Boolean.valueOf(y3Var.l0()));
                }
                t(c10, 1, "os_version", y3Var.B());
                t(c10, 1, "device_model", y3Var.v());
                t(c10, 1, "user_default_language", y3Var.E());
                if (y3Var.f1()) {
                    t(c10, 1, "time_zone_offset_minutes", Integer.valueOf(y3Var.l1()));
                }
                if (y3Var.p0()) {
                    t(c10, 1, "bundle_sequential_index", Integer.valueOf(y3Var.R0()));
                }
                if (y3Var.d1()) {
                    t(c10, 1, "service_upload", Boolean.valueOf(y3Var.m0()));
                }
                t(c10, 1, "health_monitor", y3Var.A());
                if (!((w2) this.f20505s).y.s(null, f1.f20422m0) && y3Var.n0() && y3Var.n1() != 0) {
                    t(c10, 1, "android_id", Long.valueOf(y3Var.n1()));
                }
                if (y3Var.c1()) {
                    t(c10, 1, "retry_counter", Integer.valueOf(y3Var.k1()));
                }
                if (y3Var.r0()) {
                    t(c10, 1, "consent_signals", y3Var.u());
                }
                List<i4> H = y3Var.H();
                if (H != null) {
                    for (i4 i4Var : H) {
                        if (i4Var != null) {
                            q(c10, 2);
                            c10.append("user_property {\n");
                            t(c10, 2, "set_timestamp_millis", i4Var.J() ? Long.valueOf(i4Var.u()) : null);
                            t(c10, 2, "name", ((w2) this.f20505s).E.f(i4Var.x()));
                            t(c10, 2, "string_value", i4Var.y());
                            t(c10, 2, "int_value", i4Var.I() ? Long.valueOf(i4Var.t()) : null);
                            t(c10, 2, "double_value", i4Var.H() ? Double.valueOf(i4Var.s()) : null);
                            q(c10, 2);
                            c10.append("}\n");
                        }
                    }
                }
                List<k3> F = y3Var.F();
                if (F != null) {
                    for (k3 k3Var : F) {
                        if (k3Var != null) {
                            q(c10, 2);
                            c10.append("audience_membership {\n");
                            if (k3Var.C()) {
                                t(c10, 2, "audience_id", Integer.valueOf(k3Var.s()));
                            }
                            if (k3Var.D()) {
                                t(c10, 2, "new_audience", Boolean.valueOf(k3Var.B()));
                            }
                            s(c10, "current_data", k3Var.v());
                            if (k3Var.E()) {
                                s(c10, "previous_data", k3Var.w());
                            }
                            q(c10, 2);
                            c10.append("}\n");
                        }
                    }
                }
                List<o3> G = y3Var.G();
                if (G != null) {
                    for (o3 o3Var : G) {
                        if (o3Var != null) {
                            q(c10, 2);
                            c10.append("event {\n");
                            t(c10, 2, "name", ((w2) this.f20505s).E.d(o3Var.z()));
                            if (o3Var.L()) {
                                t(c10, 2, "timestamp_millis", Long.valueOf(o3Var.v()));
                            }
                            if (o3Var.K()) {
                                t(c10, 2, "previous_timestamp_millis", Long.valueOf(o3Var.u()));
                            }
                            if (o3Var.J()) {
                                t(c10, 2, "count", Integer.valueOf(o3Var.s()));
                            }
                            if (o3Var.t() != 0) {
                                o(c10, 2, o3Var.A());
                            }
                            q(c10, 2);
                            c10.append("}\n");
                        }
                    }
                }
                q(c10, 1);
                c10.append("}\n");
            }
        }
        c10.append("}\n");
        return c10.toString();
    }

    public final String F(v2 v2Var) {
        StringBuilder c10 = a.c("\nproperty_filter {\n");
        if (v2Var.B()) {
            t(c10, 0, "filter_id", Integer.valueOf(v2Var.s()));
        }
        t(c10, 0, "property_name", ((w2) this.f20505s).E.f(v2Var.w()));
        String r10 = r(v2Var.y(), v2Var.z(), v2Var.A());
        if (!r10.isEmpty()) {
            t(c10, 0, "filter_type", r10);
        }
        p(c10, 1, v2Var.t());
        c10.append("}\n");
        return c10.toString();
    }

    public final List<Long> H(List<Long> list, List<Integer> list2) {
        int i10;
        ArrayList arrayList = new ArrayList(list);
        for (Integer num : list2) {
            if (num.intValue() < 0) {
                ((w2) this.f20505s).C().A.b("Ignoring negative bit index to be cleared", num);
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    ((w2) this.f20505s).C().A.c("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i11 = size2;
            i10 = size;
            size = i11;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
        r4 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
        if ((r3 instanceof android.os.Parcelable[]) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
        r3 = (android.os.Parcelable[]) r3;
        r5 = r3.length;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
        if (r7 >= r5) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0042, code lost:
        r8 = r3[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
        if ((r8 instanceof android.os.Bundle) == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0048, code lost:
        r4.add(J((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0056, code lost:
        if ((r3 instanceof java.util.ArrayList) == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0058, code lost:
        r3 = (java.util.ArrayList) r3;
        r5 = r3.size();
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005f, code lost:
        if (r7 >= r5) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0061, code lost:
        r8 = r3.get(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0067, code lost:
        if ((r8 instanceof android.os.Bundle) == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0069, code lost:
        r4.add(J((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0072, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0077, code lost:
        if ((r3 instanceof android.os.Bundle) == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0079, code lost:
        r4.add(J((android.os.Bundle) r3, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0082, code lost:
        r0.put(r2, r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Map<java.lang.String, java.lang.Object> J(android.os.Bundle r11, boolean r12) {
        /*
            r10 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Set r1 = r11.keySet()
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L86
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r11.get(r2)
            boolean r4 = r3 instanceof android.os.Bundle[]
            if (r4 != 0) goto L30
            boolean r4 = r3 instanceof java.util.ArrayList
            if (r4 != 0) goto L30
            boolean r4 = r3 instanceof android.os.Bundle
            if (r4 == 0) goto L2a
            goto L30
        L2a:
            if (r3 == 0) goto Ld
            r0.put(r2, r3)
            goto Ld
        L30:
            if (r12 == 0) goto Ld
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            boolean r5 = r3 instanceof android.os.Parcelable[]
            r6 = 0
            if (r5 == 0) goto L54
            android.os.Parcelable[] r3 = (android.os.Parcelable[]) r3
            int r5 = r3.length
            r7 = r6
        L40:
            if (r7 >= r5) goto L82
            r8 = r3[r7]
            boolean r9 = r8 instanceof android.os.Bundle
            if (r9 == 0) goto L51
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.util.Map r8 = r10.J(r8, r6)
            r4.add(r8)
        L51:
            int r7 = r7 + 1
            goto L40
        L54:
            boolean r5 = r3 instanceof java.util.ArrayList
            if (r5 == 0) goto L75
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r5 = r3.size()
            r7 = r6
        L5f:
            if (r7 >= r5) goto L82
            java.lang.Object r8 = r3.get(r7)
            boolean r9 = r8 instanceof android.os.Bundle
            if (r9 == 0) goto L72
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.util.Map r8 = r10.J(r8, r6)
            r4.add(r8)
        L72:
            int r7 = r7 + 1
            goto L5f
        L75:
            boolean r5 = r3 instanceof android.os.Bundle
            if (r5 == 0) goto L82
            android.os.Bundle r3 = (android.os.Bundle) r3
            java.util.Map r3 = r10.J(r3, r6)
            r4.add(r3)
        L82:
            r0.put(r2, r4)
            goto Ld
        L86:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: y4.c6.J(android.os.Bundle, boolean):java.util.Map");
    }

    public final void K(r3 r3Var, Object obj) {
        if (r3Var.f18206u) {
            r3Var.h();
            r3Var.f18206u = false;
        }
        s3.D((s3) r3Var.f18205t);
        if (r3Var.f18206u) {
            r3Var.h();
            r3Var.f18206u = false;
        }
        s3.F((s3) r3Var.f18205t);
        if (r3Var.f18206u) {
            r3Var.h();
            r3Var.f18206u = false;
        }
        s3.H((s3) r3Var.f18205t);
        if (r3Var.f18206u) {
            r3Var.h();
            r3Var.f18206u = false;
        }
        s3.K((s3) r3Var.f18205t);
        if (obj instanceof String) {
            r3Var.p((String) obj);
        } else if (obj instanceof Long) {
            r3Var.n(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            r3Var.m(((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            List<s3> G = G((Bundle[]) obj);
            if (r3Var.f18206u) {
                r3Var.h();
                r3Var.f18206u = false;
            }
            s3.J((s3) r3Var.f18205t, G);
        } else {
            ((w2) this.f20505s).C().f20710x.b("Ignoring invalid (type) event param value", obj);
        }
    }

    public final void L(h4 h4Var, Object obj) {
        Objects.requireNonNull(obj, "null reference");
        if (h4Var.f18206u) {
            h4Var.h();
            h4Var.f18206u = false;
        }
        i4.C((i4) h4Var.f18205t);
        if (h4Var.f18206u) {
            h4Var.h();
            h4Var.f18206u = false;
        }
        i4.E((i4) h4Var.f18205t);
        if (h4Var.f18206u) {
            h4Var.h();
            h4Var.f18206u = false;
        }
        i4.G((i4) h4Var.f18205t);
        if (obj instanceof String) {
            String str = (String) obj;
            if (h4Var.f18206u) {
                h4Var.h();
                h4Var.f18206u = false;
            }
            i4.B((i4) h4Var.f18205t, str);
        } else if (obj instanceof Long) {
            h4Var.m(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (h4Var.f18206u) {
                h4Var.h();
                h4Var.f18206u = false;
            }
            i4.F((i4) h4Var.f18205t, doubleValue);
        } else {
            ((w2) this.f20505s).C().f20710x.b("Ignoring invalid (type) user attribute value", obj);
        }
    }

    public final boolean N(long j3, long j10) {
        if (j3 == 0 || j10 <= 0) {
            return true;
        }
        Objects.requireNonNull(((w2) this.f20505s).F);
        return Math.abs(System.currentTimeMillis() - j3) > j10;
    }

    public final byte[] P(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            ((w2) this.f20505s).C().f20710x.b("Failed to gzip content", e10);
            throw e10;
        }
    }

    @Override // y4.v5
    public final void j() {
    }

    public final void o(StringBuilder sb, int i10, List<s3> list) {
        if (list == null) {
            return;
        }
        int i11 = i10 + 1;
        for (s3 s3Var : list) {
            if (s3Var != null) {
                q(sb, i11);
                sb.append("param {\n");
                Double d5 = null;
                t(sb, i11, "name", s3Var.O() ? ((w2) this.f20505s).E.e(s3Var.y()) : null);
                t(sb, i11, "string_value", s3Var.P() ? s3Var.z() : null);
                t(sb, i11, "int_value", s3Var.N() ? Long.valueOf(s3Var.v()) : null);
                if (s3Var.L()) {
                    d5 = Double.valueOf(s3Var.s());
                }
                t(sb, i11, "double_value", d5);
                if (s3Var.u() > 0) {
                    o(sb, i11, s3Var.A());
                }
                q(sb, i11);
                sb.append("}\n");
            }
        }
    }

    public final void p(StringBuilder sb, int i10, q2 q2Var) {
        String str;
        if (q2Var == null) {
            return;
        }
        q(sb, i10);
        sb.append("filter {\n");
        if (q2Var.z()) {
            t(sb, i10, "complement", Boolean.valueOf(q2Var.y()));
        }
        if (q2Var.B()) {
            t(sb, i10, "param_name", ((w2) this.f20505s).E.e(q2Var.w()));
        }
        if (q2Var.C()) {
            int i11 = i10 + 1;
            y2 v10 = q2Var.v();
            if (v10 != null) {
                q(sb, i11);
                sb.append("string_filter {\n");
                if (v10.A()) {
                    switch (v10.B()) {
                        case 1:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                        case 2:
                            str = "REGEXP";
                            break;
                        case 3:
                            str = "BEGINS_WITH";
                            break;
                        case 4:
                            str = "ENDS_WITH";
                            break;
                        case 5:
                            str = "PARTIAL";
                            break;
                        case 6:
                            str = "EXACT";
                            break;
                        default:
                            str = "IN_LIST";
                            break;
                    }
                    t(sb, i11, "match_type", str);
                }
                if (v10.z()) {
                    t(sb, i11, "expression", v10.v());
                }
                if (v10.y()) {
                    t(sb, i11, "case_sensitive", Boolean.valueOf(v10.x()));
                }
                if (v10.s() > 0) {
                    q(sb, i11 + 1);
                    sb.append("expression_list {\n");
                    for (String str2 : v10.w()) {
                        q(sb, i11 + 2);
                        sb.append(str2);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                q(sb, i11);
                sb.append("}\n");
            }
        }
        if (q2Var.A()) {
            u(sb, i10 + 1, "number_filter", q2Var.u());
        }
        q(sb, i10);
        sb.append("}\n");
    }

    public final long w(byte[] bArr) {
        ((w2) this.f20505s).z().g();
        MessageDigest q10 = h6.q();
        if (q10 == null) {
            ((w2) this.f20505s).C().f20710x.a("Failed to get MD5");
            return 0L;
        }
        return h6.n0(q10.digest(bArr));
    }

    public final Bundle x(Map<String, Object> map, boolean z10) {
        String str;
        Bundle bundle = new Bundle();
        for (String str2 : map.keySet()) {
            Object obj = map.get(str2);
            if (obj == null) {
                str = null;
            } else if (obj instanceof Long) {
                bundle.putLong(str2, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str2, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                str = obj.toString();
            } else if (z10) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    arrayList2.add(x((Map) arrayList.get(i10), false));
                }
                bundle.putParcelableArrayList(str2, arrayList2);
            }
            bundle.putString(str2, str);
        }
        return bundle;
    }

    public final <T extends Parcelable> T y(byte[] bArr, Parcelable.Creator<T> creator) {
        if (bArr == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            obtain.unmarshall(bArr, 0, bArr.length);
            obtain.setDataPosition(0);
            return creator.createFromParcel(obtain);
        } catch (b.a unused) {
            ((w2) this.f20505s).C().f20710x.a("Failed to load parcelable from buffer");
            return null;
        } finally {
            obtain.recycle();
        }
    }

    public final p z(s4.a aVar) {
        Object obj;
        Bundle x10 = x(aVar.f17704c, true);
        String obj2 = (!x10.containsKey("_o") || (obj = x10.get("_o")) == null) ? "app" : obj.toString();
        String f10 = d.f(aVar.f17702a);
        if (f10 == null) {
            f10 = aVar.f17702a;
        }
        return new p(f10, new n(x10), obj2, aVar.f17703b);
    }
}
