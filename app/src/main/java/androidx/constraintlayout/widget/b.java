package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.c;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import l0.g;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: d */
    public static final int[] f1128d = {0, 4, 8};

    /* renamed from: e */
    public static SparseIntArray f1129e = new SparseIntArray();

    /* renamed from: f */
    public static SparseIntArray f1130f = new SparseIntArray();

    /* renamed from: a */
    public HashMap<String, x.a> f1131a = new HashMap<>();

    /* renamed from: b */
    public boolean f1132b = true;

    /* renamed from: c */
    public HashMap<Integer, a> f1133c = new HashMap<>();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public int f1134a;

        /* renamed from: b */
        public final d f1135b = new d();

        /* renamed from: c */
        public final c f1136c = new c();

        /* renamed from: d */
        public final C0011b f1137d = new C0011b();

        /* renamed from: e */
        public final e f1138e = new e();

        /* renamed from: f */
        public HashMap<String, x.a> f1139f = new HashMap<>();

        /* renamed from: androidx.constraintlayout.widget.b$a$a */
        /* loaded from: classes.dex */
        public static class C0010a {

            /* renamed from: a */
            public int[] f1140a = new int[10];

            /* renamed from: b */
            public int[] f1141b = new int[10];

            /* renamed from: c */
            public int f1142c = 0;

            /* renamed from: d */
            public int[] f1143d = new int[10];

            /* renamed from: e */
            public float[] f1144e = new float[10];

            /* renamed from: f */
            public int f1145f = 0;

            /* renamed from: g */
            public int[] f1146g = new int[5];

            /* renamed from: h */
            public String[] f1147h = new String[5];

            /* renamed from: i */
            public int f1148i = 0;

            /* renamed from: j */
            public int[] f1149j = new int[4];

            /* renamed from: k */
            public boolean[] f1150k = new boolean[4];

            /* renamed from: l */
            public int f1151l = 0;

            public final void a(int i10, float f10) {
                int i11 = this.f1145f;
                int[] iArr = this.f1143d;
                if (i11 >= iArr.length) {
                    this.f1143d = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.f1144e;
                    this.f1144e = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.f1143d;
                int i12 = this.f1145f;
                iArr2[i12] = i10;
                float[] fArr2 = this.f1144e;
                this.f1145f = i12 + 1;
                fArr2[i12] = f10;
            }

            public final void b(int i10, int i11) {
                int i12 = this.f1142c;
                int[] iArr = this.f1140a;
                if (i12 >= iArr.length) {
                    this.f1140a = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.f1141b;
                    this.f1141b = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.f1140a;
                int i13 = this.f1142c;
                iArr3[i13] = i10;
                int[] iArr4 = this.f1141b;
                this.f1142c = i13 + 1;
                iArr4[i13] = i11;
            }

            public final void c(int i10, String str) {
                int i11 = this.f1148i;
                int[] iArr = this.f1146g;
                if (i11 >= iArr.length) {
                    this.f1146g = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.f1147h;
                    this.f1147h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.f1146g;
                int i12 = this.f1148i;
                iArr2[i12] = i10;
                String[] strArr2 = this.f1147h;
                this.f1148i = i12 + 1;
                strArr2[i12] = str;
            }

            public final void d(int i10, boolean z10) {
                int i11 = this.f1151l;
                int[] iArr = this.f1149j;
                if (i11 >= iArr.length) {
                    this.f1149j = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.f1150k;
                    this.f1150k = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.f1149j;
                int i12 = this.f1151l;
                iArr2[i12] = i10;
                boolean[] zArr2 = this.f1150k;
                this.f1151l = i12 + 1;
                zArr2[i12] = z10;
            }
        }

        public final void a(ConstraintLayout.a aVar) {
            C0011b c0011b = this.f1137d;
            aVar.f1078e = c0011b.f1167h;
            aVar.f1080f = c0011b.f1169i;
            aVar.f1082g = c0011b.f1171j;
            aVar.f1084h = c0011b.f1173k;
            aVar.f1086i = c0011b.f1175l;
            aVar.f1088j = c0011b.f1177m;
            aVar.f1090k = c0011b.f1179n;
            aVar.f1092l = c0011b.f1181o;
            aVar.f1094m = c0011b.p;
            aVar.f1096n = c0011b.f1183q;
            aVar.f1098o = c0011b.f1184r;
            aVar.f1104s = c0011b.f1185s;
            aVar.f1105t = c0011b.f1186t;
            aVar.f1106u = c0011b.f1187u;
            aVar.f1107v = c0011b.f1188v;
            ((ViewGroup.MarginLayoutParams) aVar).leftMargin = c0011b.F;
            ((ViewGroup.MarginLayoutParams) aVar).rightMargin = c0011b.G;
            ((ViewGroup.MarginLayoutParams) aVar).topMargin = c0011b.H;
            ((ViewGroup.MarginLayoutParams) aVar).bottomMargin = c0011b.I;
            aVar.A = c0011b.R;
            aVar.B = c0011b.Q;
            aVar.f1109x = c0011b.N;
            aVar.f1110z = c0011b.P;
            aVar.E = c0011b.f1189w;
            aVar.F = c0011b.f1190x;
            aVar.p = c0011b.f1191z;
            aVar.f1101q = c0011b.A;
            aVar.f1103r = c0011b.B;
            aVar.G = c0011b.y;
            aVar.T = c0011b.C;
            aVar.U = c0011b.D;
            aVar.I = c0011b.T;
            aVar.H = c0011b.U;
            aVar.K = c0011b.W;
            aVar.J = c0011b.V;
            aVar.W = c0011b.f1176l0;
            aVar.X = c0011b.f1178m0;
            aVar.L = c0011b.X;
            aVar.M = c0011b.Y;
            aVar.P = c0011b.Z;
            aVar.Q = c0011b.f1154a0;
            aVar.N = c0011b.f1156b0;
            aVar.O = c0011b.f1158c0;
            aVar.R = c0011b.f1160d0;
            aVar.S = c0011b.f1162e0;
            aVar.V = c0011b.E;
            aVar.f1074c = c0011b.f1163f;
            aVar.f1070a = c0011b.f1159d;
            aVar.f1072b = c0011b.f1161e;
            ((ViewGroup.MarginLayoutParams) aVar).width = c0011b.f1155b;
            ((ViewGroup.MarginLayoutParams) aVar).height = c0011b.f1157c;
            String str = c0011b.f1174k0;
            if (str != null) {
                aVar.Y = str;
            }
            aVar.Z = c0011b.f1182o0;
            aVar.setMarginStart(c0011b.K);
            aVar.setMarginEnd(this.f1137d.J);
            aVar.a();
        }

        public final void b(int i10, ConstraintLayout.a aVar) {
            this.f1134a = i10;
            C0011b c0011b = this.f1137d;
            c0011b.f1167h = aVar.f1078e;
            c0011b.f1169i = aVar.f1080f;
            c0011b.f1171j = aVar.f1082g;
            c0011b.f1173k = aVar.f1084h;
            c0011b.f1175l = aVar.f1086i;
            c0011b.f1177m = aVar.f1088j;
            c0011b.f1179n = aVar.f1090k;
            c0011b.f1181o = aVar.f1092l;
            c0011b.p = aVar.f1094m;
            c0011b.f1183q = aVar.f1096n;
            c0011b.f1184r = aVar.f1098o;
            c0011b.f1185s = aVar.f1104s;
            c0011b.f1186t = aVar.f1105t;
            c0011b.f1187u = aVar.f1106u;
            c0011b.f1188v = aVar.f1107v;
            c0011b.f1189w = aVar.E;
            c0011b.f1190x = aVar.F;
            c0011b.y = aVar.G;
            c0011b.f1191z = aVar.p;
            c0011b.A = aVar.f1101q;
            c0011b.B = aVar.f1103r;
            c0011b.C = aVar.T;
            c0011b.D = aVar.U;
            c0011b.E = aVar.V;
            c0011b.f1163f = aVar.f1074c;
            c0011b.f1159d = aVar.f1070a;
            c0011b.f1161e = aVar.f1072b;
            c0011b.f1155b = ((ViewGroup.MarginLayoutParams) aVar).width;
            c0011b.f1157c = ((ViewGroup.MarginLayoutParams) aVar).height;
            c0011b.F = ((ViewGroup.MarginLayoutParams) aVar).leftMargin;
            c0011b.G = ((ViewGroup.MarginLayoutParams) aVar).rightMargin;
            c0011b.H = ((ViewGroup.MarginLayoutParams) aVar).topMargin;
            c0011b.I = ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
            c0011b.L = aVar.D;
            c0011b.T = aVar.I;
            c0011b.U = aVar.H;
            c0011b.W = aVar.K;
            c0011b.V = aVar.J;
            c0011b.f1176l0 = aVar.W;
            c0011b.f1178m0 = aVar.X;
            c0011b.X = aVar.L;
            c0011b.Y = aVar.M;
            c0011b.Z = aVar.P;
            c0011b.f1154a0 = aVar.Q;
            c0011b.f1156b0 = aVar.N;
            c0011b.f1158c0 = aVar.O;
            c0011b.f1160d0 = aVar.R;
            c0011b.f1162e0 = aVar.S;
            c0011b.f1174k0 = aVar.Y;
            c0011b.N = aVar.f1109x;
            c0011b.P = aVar.f1110z;
            c0011b.M = aVar.f1108w;
            c0011b.O = aVar.y;
            c0011b.R = aVar.A;
            c0011b.Q = aVar.B;
            c0011b.S = aVar.C;
            c0011b.f1182o0 = aVar.Z;
            c0011b.J = aVar.getMarginEnd();
            this.f1137d.K = aVar.getMarginStart();
        }

        public final void c(int i10, c.a aVar) {
            b(i10, aVar);
            this.f1135b.f1205c = aVar.f1222r0;
            e eVar = this.f1138e;
            eVar.f1208a = aVar.f1225u0;
            eVar.f1209b = aVar.f1226v0;
            eVar.f1210c = aVar.f1227w0;
            eVar.f1211d = aVar.x0;
            eVar.f1212e = aVar.f1228y0;
            eVar.f1213f = aVar.f1229z0;
            eVar.f1214g = aVar.A0;
            eVar.f1216i = aVar.B0;
            eVar.f1217j = aVar.C0;
            eVar.f1218k = aVar.D0;
            eVar.f1220m = aVar.f1224t0;
            eVar.f1219l = aVar.f1223s0;
        }

        public final Object clone() {
            a aVar = new a();
            C0011b c0011b = aVar.f1137d;
            C0011b c0011b2 = this.f1137d;
            Objects.requireNonNull(c0011b);
            c0011b.f1153a = c0011b2.f1153a;
            c0011b.f1155b = c0011b2.f1155b;
            c0011b.f1157c = c0011b2.f1157c;
            c0011b.f1159d = c0011b2.f1159d;
            c0011b.f1161e = c0011b2.f1161e;
            c0011b.f1163f = c0011b2.f1163f;
            c0011b.f1165g = c0011b2.f1165g;
            c0011b.f1167h = c0011b2.f1167h;
            c0011b.f1169i = c0011b2.f1169i;
            c0011b.f1171j = c0011b2.f1171j;
            c0011b.f1173k = c0011b2.f1173k;
            c0011b.f1175l = c0011b2.f1175l;
            c0011b.f1177m = c0011b2.f1177m;
            c0011b.f1179n = c0011b2.f1179n;
            c0011b.f1181o = c0011b2.f1181o;
            c0011b.p = c0011b2.p;
            c0011b.f1183q = c0011b2.f1183q;
            c0011b.f1184r = c0011b2.f1184r;
            c0011b.f1185s = c0011b2.f1185s;
            c0011b.f1186t = c0011b2.f1186t;
            c0011b.f1187u = c0011b2.f1187u;
            c0011b.f1188v = c0011b2.f1188v;
            c0011b.f1189w = c0011b2.f1189w;
            c0011b.f1190x = c0011b2.f1190x;
            c0011b.y = c0011b2.y;
            c0011b.f1191z = c0011b2.f1191z;
            c0011b.A = c0011b2.A;
            c0011b.B = c0011b2.B;
            c0011b.C = c0011b2.C;
            c0011b.D = c0011b2.D;
            c0011b.E = c0011b2.E;
            c0011b.F = c0011b2.F;
            c0011b.G = c0011b2.G;
            c0011b.H = c0011b2.H;
            c0011b.I = c0011b2.I;
            c0011b.J = c0011b2.J;
            c0011b.K = c0011b2.K;
            c0011b.L = c0011b2.L;
            c0011b.M = c0011b2.M;
            c0011b.N = c0011b2.N;
            c0011b.O = c0011b2.O;
            c0011b.P = c0011b2.P;
            c0011b.Q = c0011b2.Q;
            c0011b.R = c0011b2.R;
            c0011b.S = c0011b2.S;
            c0011b.T = c0011b2.T;
            c0011b.U = c0011b2.U;
            c0011b.V = c0011b2.V;
            c0011b.W = c0011b2.W;
            c0011b.X = c0011b2.X;
            c0011b.Y = c0011b2.Y;
            c0011b.Z = c0011b2.Z;
            c0011b.f1154a0 = c0011b2.f1154a0;
            c0011b.f1156b0 = c0011b2.f1156b0;
            c0011b.f1158c0 = c0011b2.f1158c0;
            c0011b.f1160d0 = c0011b2.f1160d0;
            c0011b.f1162e0 = c0011b2.f1162e0;
            c0011b.f1164f0 = c0011b2.f1164f0;
            c0011b.f1166g0 = c0011b2.f1166g0;
            c0011b.f1168h0 = c0011b2.f1168h0;
            c0011b.f1174k0 = c0011b2.f1174k0;
            int[] iArr = c0011b2.f1170i0;
            if (iArr == null || c0011b2.f1172j0 != null) {
                c0011b.f1170i0 = null;
            } else {
                c0011b.f1170i0 = Arrays.copyOf(iArr, iArr.length);
            }
            c0011b.f1172j0 = c0011b2.f1172j0;
            c0011b.f1176l0 = c0011b2.f1176l0;
            c0011b.f1178m0 = c0011b2.f1178m0;
            c0011b.f1180n0 = c0011b2.f1180n0;
            c0011b.f1182o0 = c0011b2.f1182o0;
            c cVar = aVar.f1136c;
            c cVar2 = this.f1136c;
            Objects.requireNonNull(cVar);
            Objects.requireNonNull(cVar2);
            cVar.f1193a = cVar2.f1193a;
            cVar.f1195c = cVar2.f1195c;
            cVar.f1197e = cVar2.f1197e;
            cVar.f1196d = cVar2.f1196d;
            d dVar = aVar.f1135b;
            d dVar2 = this.f1135b;
            Objects.requireNonNull(dVar);
            Objects.requireNonNull(dVar2);
            dVar.f1203a = dVar2.f1203a;
            dVar.f1205c = dVar2.f1205c;
            dVar.f1206d = dVar2.f1206d;
            dVar.f1204b = dVar2.f1204b;
            e eVar = aVar.f1138e;
            e eVar2 = this.f1138e;
            Objects.requireNonNull(eVar);
            Objects.requireNonNull(eVar2);
            eVar.f1208a = eVar2.f1208a;
            eVar.f1209b = eVar2.f1209b;
            eVar.f1210c = eVar2.f1210c;
            eVar.f1211d = eVar2.f1211d;
            eVar.f1212e = eVar2.f1212e;
            eVar.f1213f = eVar2.f1213f;
            eVar.f1214g = eVar2.f1214g;
            eVar.f1215h = eVar2.f1215h;
            eVar.f1216i = eVar2.f1216i;
            eVar.f1217j = eVar2.f1217j;
            eVar.f1218k = eVar2.f1218k;
            eVar.f1219l = eVar2.f1219l;
            eVar.f1220m = eVar2.f1220m;
            aVar.f1134a = this.f1134a;
            return aVar;
        }
    }

    /* renamed from: androidx.constraintlayout.widget.b$b */
    /* loaded from: classes.dex */
    public static class C0011b {

        /* renamed from: p0 */
        public static SparseIntArray f1152p0;

        /* renamed from: b */
        public int f1155b;

        /* renamed from: c */
        public int f1157c;

        /* renamed from: i0 */
        public int[] f1170i0;

        /* renamed from: j0 */
        public String f1172j0;

        /* renamed from: k0 */
        public String f1174k0;

        /* renamed from: a */
        public boolean f1153a = false;

        /* renamed from: d */
        public int f1159d = -1;

        /* renamed from: e */
        public int f1161e = -1;

        /* renamed from: f */
        public float f1163f = -1.0f;

        /* renamed from: g */
        public boolean f1165g = true;

        /* renamed from: h */
        public int f1167h = -1;

        /* renamed from: i */
        public int f1169i = -1;

        /* renamed from: j */
        public int f1171j = -1;

        /* renamed from: k */
        public int f1173k = -1;

        /* renamed from: l */
        public int f1175l = -1;

        /* renamed from: m */
        public int f1177m = -1;

        /* renamed from: n */
        public int f1179n = -1;

        /* renamed from: o */
        public int f1181o = -1;
        public int p = -1;

        /* renamed from: q */
        public int f1183q = -1;

        /* renamed from: r */
        public int f1184r = -1;

        /* renamed from: s */
        public int f1185s = -1;

        /* renamed from: t */
        public int f1186t = -1;

        /* renamed from: u */
        public int f1187u = -1;

        /* renamed from: v */
        public int f1188v = -1;

        /* renamed from: w */
        public float f1189w = 0.5f;

        /* renamed from: x */
        public float f1190x = 0.5f;
        public String y = null;

        /* renamed from: z */
        public int f1191z = -1;
        public int A = 0;
        public float B = 0.0f;
        public int C = -1;
        public int D = -1;
        public int E = -1;
        public int F = 0;
        public int G = 0;
        public int H = 0;
        public int I = 0;
        public int J = 0;
        public int K = 0;
        public int L = 0;
        public int M = Integer.MIN_VALUE;
        public int N = Integer.MIN_VALUE;
        public int O = Integer.MIN_VALUE;
        public int P = Integer.MIN_VALUE;
        public int Q = Integer.MIN_VALUE;
        public int R = Integer.MIN_VALUE;
        public int S = Integer.MIN_VALUE;
        public float T = -1.0f;
        public float U = -1.0f;
        public int V = 0;
        public int W = 0;
        public int X = 0;
        public int Y = 0;
        public int Z = 0;

        /* renamed from: a0 */
        public int f1154a0 = 0;

        /* renamed from: b0 */
        public int f1156b0 = 0;

        /* renamed from: c0 */
        public int f1158c0 = 0;

        /* renamed from: d0 */
        public float f1160d0 = 1.0f;

        /* renamed from: e0 */
        public float f1162e0 = 1.0f;

        /* renamed from: f0 */
        public int f1164f0 = -1;

        /* renamed from: g0 */
        public int f1166g0 = 0;

        /* renamed from: h0 */
        public int f1168h0 = -1;

        /* renamed from: l0 */
        public boolean f1176l0 = false;

        /* renamed from: m0 */
        public boolean f1178m0 = false;

        /* renamed from: n0 */
        public boolean f1180n0 = true;

        /* renamed from: o0 */
        public int f1182o0 = 0;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1152p0 = sparseIntArray;
            sparseIntArray.append(43, 24);
            f1152p0.append(44, 25);
            f1152p0.append(46, 28);
            f1152p0.append(47, 29);
            f1152p0.append(52, 35);
            f1152p0.append(51, 34);
            f1152p0.append(24, 4);
            f1152p0.append(23, 3);
            f1152p0.append(19, 1);
            f1152p0.append(61, 6);
            f1152p0.append(62, 7);
            f1152p0.append(31, 17);
            f1152p0.append(32, 18);
            f1152p0.append(33, 19);
            f1152p0.append(15, 90);
            f1152p0.append(0, 26);
            f1152p0.append(48, 31);
            f1152p0.append(49, 32);
            f1152p0.append(30, 10);
            f1152p0.append(29, 9);
            f1152p0.append(66, 13);
            f1152p0.append(69, 16);
            f1152p0.append(67, 14);
            f1152p0.append(64, 11);
            f1152p0.append(68, 15);
            f1152p0.append(65, 12);
            f1152p0.append(55, 38);
            f1152p0.append(41, 37);
            f1152p0.append(40, 39);
            f1152p0.append(54, 40);
            f1152p0.append(39, 20);
            f1152p0.append(53, 36);
            f1152p0.append(28, 5);
            f1152p0.append(42, 91);
            f1152p0.append(50, 91);
            f1152p0.append(45, 91);
            f1152p0.append(22, 91);
            f1152p0.append(18, 91);
            f1152p0.append(3, 23);
            f1152p0.append(5, 27);
            f1152p0.append(7, 30);
            f1152p0.append(8, 8);
            f1152p0.append(4, 33);
            f1152p0.append(6, 2);
            f1152p0.append(1, 22);
            f1152p0.append(2, 21);
            f1152p0.append(56, 41);
            f1152p0.append(34, 42);
            f1152p0.append(17, 41);
            f1152p0.append(16, 42);
            f1152p0.append(71, 76);
            f1152p0.append(25, 61);
            f1152p0.append(27, 62);
            f1152p0.append(26, 63);
            f1152p0.append(60, 69);
            f1152p0.append(38, 70);
            f1152p0.append(12, 71);
            f1152p0.append(10, 72);
            f1152p0.append(11, 73);
            f1152p0.append(13, 74);
            f1152p0.append(9, 75);
        }

        public final void a(Context context, AttributeSet attributeSet) {
            String str;
            StringBuilder sb;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f5719x);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                int i11 = f1152p0.get(index);
                switch (i11) {
                    case 1:
                        this.p = b.g(obtainStyledAttributes, index, this.p);
                        break;
                    case 2:
                        this.I = obtainStyledAttributes.getDimensionPixelSize(index, this.I);
                        break;
                    case 3:
                        this.f1181o = b.g(obtainStyledAttributes, index, this.f1181o);
                        break;
                    case 4:
                        this.f1179n = b.g(obtainStyledAttributes, index, this.f1179n);
                        break;
                    case 5:
                        this.y = obtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.C = obtainStyledAttributes.getDimensionPixelOffset(index, this.C);
                        break;
                    case 7:
                        this.D = obtainStyledAttributes.getDimensionPixelOffset(index, this.D);
                        break;
                    case 8:
                        this.J = obtainStyledAttributes.getDimensionPixelSize(index, this.J);
                        break;
                    case 9:
                        this.f1188v = b.g(obtainStyledAttributes, index, this.f1188v);
                        break;
                    case 10:
                        this.f1187u = b.g(obtainStyledAttributes, index, this.f1187u);
                        break;
                    case 11:
                        this.P = obtainStyledAttributes.getDimensionPixelSize(index, this.P);
                        break;
                    case 12:
                        this.Q = obtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                        break;
                    case 13:
                        this.M = obtainStyledAttributes.getDimensionPixelSize(index, this.M);
                        break;
                    case 14:
                        this.O = obtainStyledAttributes.getDimensionPixelSize(index, this.O);
                        break;
                    case 15:
                        this.R = obtainStyledAttributes.getDimensionPixelSize(index, this.R);
                        break;
                    case 16:
                        this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                        break;
                    case 17:
                        this.f1159d = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1159d);
                        break;
                    case 18:
                        this.f1161e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1161e);
                        break;
                    case 19:
                        this.f1163f = obtainStyledAttributes.getFloat(index, this.f1163f);
                        break;
                    case 20:
                        this.f1189w = obtainStyledAttributes.getFloat(index, this.f1189w);
                        break;
                    case 21:
                        this.f1157c = obtainStyledAttributes.getLayoutDimension(index, this.f1157c);
                        break;
                    case 22:
                        this.f1155b = obtainStyledAttributes.getLayoutDimension(index, this.f1155b);
                        break;
                    case 23:
                        this.F = obtainStyledAttributes.getDimensionPixelSize(index, this.F);
                        break;
                    case 24:
                        this.f1167h = b.g(obtainStyledAttributes, index, this.f1167h);
                        break;
                    case 25:
                        this.f1169i = b.g(obtainStyledAttributes, index, this.f1169i);
                        break;
                    case 26:
                        this.E = obtainStyledAttributes.getInt(index, this.E);
                        break;
                    case 27:
                        this.G = obtainStyledAttributes.getDimensionPixelSize(index, this.G);
                        break;
                    case 28:
                        this.f1171j = b.g(obtainStyledAttributes, index, this.f1171j);
                        break;
                    case 29:
                        this.f1173k = b.g(obtainStyledAttributes, index, this.f1173k);
                        break;
                    case 30:
                        this.K = obtainStyledAttributes.getDimensionPixelSize(index, this.K);
                        break;
                    case 31:
                        this.f1185s = b.g(obtainStyledAttributes, index, this.f1185s);
                        break;
                    case 32:
                        this.f1186t = b.g(obtainStyledAttributes, index, this.f1186t);
                        break;
                    case 33:
                        this.H = obtainStyledAttributes.getDimensionPixelSize(index, this.H);
                        break;
                    case 34:
                        this.f1177m = b.g(obtainStyledAttributes, index, this.f1177m);
                        break;
                    case 35:
                        this.f1175l = b.g(obtainStyledAttributes, index, this.f1175l);
                        break;
                    case 36:
                        this.f1190x = obtainStyledAttributes.getFloat(index, this.f1190x);
                        break;
                    case 37:
                        this.U = obtainStyledAttributes.getFloat(index, this.U);
                        break;
                    case 38:
                        this.T = obtainStyledAttributes.getFloat(index, this.T);
                        break;
                    case 39:
                        this.V = obtainStyledAttributes.getInt(index, this.V);
                        break;
                    case 40:
                        this.W = obtainStyledAttributes.getInt(index, this.W);
                        break;
                    case 41:
                        b.h(this, obtainStyledAttributes, index, 0);
                        break;
                    case 42:
                        b.h(this, obtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i11) {
                            case 61:
                                this.f1191z = b.g(obtainStyledAttributes, index, this.f1191z);
                                continue;
                            case 62:
                                this.A = obtainStyledAttributes.getDimensionPixelSize(index, this.A);
                                continue;
                            case 63:
                                this.B = obtainStyledAttributes.getFloat(index, this.B);
                                continue;
                            default:
                                switch (i11) {
                                    case 69:
                                        this.f1160d0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 70:
                                        this.f1162e0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 71:
                                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                        break;
                                    case 72:
                                        this.f1164f0 = obtainStyledAttributes.getInt(index, this.f1164f0);
                                        break;
                                    case 73:
                                        this.f1166g0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1166g0);
                                        break;
                                    case 74:
                                        this.f1172j0 = obtainStyledAttributes.getString(index);
                                        break;
                                    case 75:
                                        this.f1180n0 = obtainStyledAttributes.getBoolean(index, this.f1180n0);
                                        break;
                                    case 76:
                                        this.f1182o0 = obtainStyledAttributes.getInt(index, this.f1182o0);
                                        break;
                                    case 77:
                                        this.f1183q = b.g(obtainStyledAttributes, index, this.f1183q);
                                        break;
                                    case 78:
                                        this.f1184r = b.g(obtainStyledAttributes, index, this.f1184r);
                                        break;
                                    case 79:
                                        this.S = obtainStyledAttributes.getDimensionPixelSize(index, this.S);
                                        break;
                                    case 80:
                                        this.L = obtainStyledAttributes.getDimensionPixelSize(index, this.L);
                                        break;
                                    case 81:
                                        this.X = obtainStyledAttributes.getInt(index, this.X);
                                        break;
                                    case 82:
                                        this.Y = obtainStyledAttributes.getInt(index, this.Y);
                                        break;
                                    case 83:
                                        this.f1154a0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1154a0);
                                        break;
                                    case 84:
                                        this.Z = obtainStyledAttributes.getDimensionPixelSize(index, this.Z);
                                        break;
                                    case 85:
                                        this.f1158c0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1158c0);
                                        break;
                                    case 86:
                                        this.f1156b0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1156b0);
                                        break;
                                    case 87:
                                        this.f1176l0 = obtainStyledAttributes.getBoolean(index, this.f1176l0);
                                        break;
                                    case 88:
                                        this.f1178m0 = obtainStyledAttributes.getBoolean(index, this.f1178m0);
                                        break;
                                    case 89:
                                        this.f1174k0 = obtainStyledAttributes.getString(index);
                                        break;
                                    case 90:
                                        this.f1165g = obtainStyledAttributes.getBoolean(index, this.f1165g);
                                        break;
                                    case 91:
                                        sb = new StringBuilder();
                                        str = "unused attribute 0x";
                                        sb.append(str);
                                        sb.append(Integer.toHexString(index));
                                        sb.append("   ");
                                        sb.append(f1152p0.get(index));
                                        Log.w("ConstraintSet", sb.toString());
                                        continue;
                                    default:
                                        sb = new StringBuilder();
                                        str = "Unknown attribute 0x";
                                        sb.append(str);
                                        sb.append(Integer.toHexString(index));
                                        sb.append("   ");
                                        sb.append(f1152p0.get(index));
                                        Log.w("ConstraintSet", sb.toString());
                                        continue;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: k */
        public static SparseIntArray f1192k;

        /* renamed from: a */
        public int f1193a = -1;

        /* renamed from: b */
        public int f1194b = 0;

        /* renamed from: c */
        public int f1195c = -1;

        /* renamed from: d */
        public float f1196d = Float.NaN;

        /* renamed from: e */
        public float f1197e = Float.NaN;

        /* renamed from: f */
        public float f1198f = Float.NaN;

        /* renamed from: g */
        public int f1199g = -1;

        /* renamed from: h */
        public String f1200h = null;

        /* renamed from: i */
        public int f1201i = -3;

        /* renamed from: j */
        public int f1202j = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1192k = sparseIntArray;
            sparseIntArray.append(3, 1);
            f1192k.append(5, 2);
            f1192k.append(9, 3);
            f1192k.append(2, 4);
            f1192k.append(1, 5);
            f1192k.append(0, 6);
            f1192k.append(4, 7);
            f1192k.append(8, 8);
            f1192k.append(7, 9);
            f1192k.append(6, 10);
        }

        public final void a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.y);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                switch (f1192k.get(index)) {
                    case 1:
                        this.f1197e = obtainStyledAttributes.getFloat(index, this.f1197e);
                        break;
                    case 2:
                        this.f1195c = obtainStyledAttributes.getInt(index, this.f1195c);
                        break;
                    case 3:
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            String str = t.a.f18408c[obtainStyledAttributes.getInteger(index, 0)];
                            break;
                        }
                    case 4:
                        obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f1193a = b.g(obtainStyledAttributes, index, this.f1193a);
                        break;
                    case 6:
                        this.f1194b = obtainStyledAttributes.getInteger(index, this.f1194b);
                        break;
                    case 7:
                        this.f1196d = obtainStyledAttributes.getFloat(index, this.f1196d);
                        break;
                    case 8:
                        this.f1199g = obtainStyledAttributes.getInteger(index, this.f1199g);
                        break;
                    case 9:
                        this.f1198f = obtainStyledAttributes.getFloat(index, this.f1198f);
                        break;
                    case 10:
                        int i11 = obtainStyledAttributes.peekValue(index).type;
                        if (i11 == 1) {
                            int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                            this.f1202j = resourceId;
                            if (resourceId == -1) {
                                break;
                            }
                            this.f1201i = -2;
                            break;
                        } else if (i11 != 3) {
                            this.f1201i = obtainStyledAttributes.getInteger(index, this.f1202j);
                            break;
                        } else {
                            String string = obtainStyledAttributes.getString(index);
                            this.f1200h = string;
                            if (string.indexOf("/") <= 0) {
                                this.f1201i = -1;
                                break;
                            } else {
                                this.f1202j = obtainStyledAttributes.getResourceId(index, -1);
                                this.f1201i = -2;
                            }
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a */
        public int f1203a = 0;

        /* renamed from: b */
        public int f1204b = 0;

        /* renamed from: c */
        public float f1205c = 1.0f;

        /* renamed from: d */
        public float f1206d = Float.NaN;

        public final void a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.A);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 1) {
                    this.f1205c = obtainStyledAttributes.getFloat(index, this.f1205c);
                } else if (index == 0) {
                    int i11 = obtainStyledAttributes.getInt(index, this.f1203a);
                    this.f1203a = i11;
                    int[] iArr = b.f1128d;
                    this.f1203a = b.f1128d[i11];
                } else if (index == 4) {
                    this.f1204b = obtainStyledAttributes.getInt(index, this.f1204b);
                } else if (index == 3) {
                    this.f1206d = obtainStyledAttributes.getFloat(index, this.f1206d);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: n */
        public static SparseIntArray f1207n;

        /* renamed from: a */
        public float f1208a = 0.0f;

        /* renamed from: b */
        public float f1209b = 0.0f;

        /* renamed from: c */
        public float f1210c = 0.0f;

        /* renamed from: d */
        public float f1211d = 1.0f;

        /* renamed from: e */
        public float f1212e = 1.0f;

        /* renamed from: f */
        public float f1213f = Float.NaN;

        /* renamed from: g */
        public float f1214g = Float.NaN;

        /* renamed from: h */
        public int f1215h = -1;

        /* renamed from: i */
        public float f1216i = 0.0f;

        /* renamed from: j */
        public float f1217j = 0.0f;

        /* renamed from: k */
        public float f1218k = 0.0f;

        /* renamed from: l */
        public boolean f1219l = false;

        /* renamed from: m */
        public float f1220m = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1207n = sparseIntArray;
            sparseIntArray.append(6, 1);
            f1207n.append(7, 2);
            f1207n.append(8, 3);
            f1207n.append(4, 4);
            f1207n.append(5, 5);
            f1207n.append(0, 6);
            f1207n.append(1, 7);
            f1207n.append(2, 8);
            f1207n.append(3, 9);
            f1207n.append(9, 10);
            f1207n.append(10, 11);
            f1207n.append(11, 12);
        }

        public final void a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.C);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                switch (f1207n.get(index)) {
                    case 1:
                        this.f1208a = obtainStyledAttributes.getFloat(index, this.f1208a);
                        break;
                    case 2:
                        this.f1209b = obtainStyledAttributes.getFloat(index, this.f1209b);
                        break;
                    case 3:
                        this.f1210c = obtainStyledAttributes.getFloat(index, this.f1210c);
                        break;
                    case 4:
                        this.f1211d = obtainStyledAttributes.getFloat(index, this.f1211d);
                        break;
                    case 5:
                        this.f1212e = obtainStyledAttributes.getFloat(index, this.f1212e);
                        break;
                    case 6:
                        this.f1213f = obtainStyledAttributes.getDimension(index, this.f1213f);
                        break;
                    case 7:
                        this.f1214g = obtainStyledAttributes.getDimension(index, this.f1214g);
                        break;
                    case 8:
                        this.f1216i = obtainStyledAttributes.getDimension(index, this.f1216i);
                        break;
                    case 9:
                        this.f1217j = obtainStyledAttributes.getDimension(index, this.f1217j);
                        break;
                    case 10:
                        this.f1218k = obtainStyledAttributes.getDimension(index, this.f1218k);
                        break;
                    case 11:
                        this.f1219l = true;
                        this.f1220m = obtainStyledAttributes.getDimension(index, this.f1220m);
                        break;
                    case 12:
                        this.f1215h = b.g(obtainStyledAttributes, index, this.f1215h);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    static {
        f1129e.append(82, 25);
        f1129e.append(83, 26);
        f1129e.append(85, 29);
        f1129e.append(86, 30);
        f1129e.append(92, 36);
        f1129e.append(91, 35);
        f1129e.append(63, 4);
        f1129e.append(62, 3);
        f1129e.append(58, 1);
        f1129e.append(60, 91);
        f1129e.append(59, 92);
        f1129e.append(101, 6);
        f1129e.append(102, 7);
        f1129e.append(70, 17);
        f1129e.append(71, 18);
        f1129e.append(72, 19);
        f1129e.append(54, 99);
        f1129e.append(0, 27);
        f1129e.append(87, 32);
        f1129e.append(88, 33);
        f1129e.append(69, 10);
        f1129e.append(68, 9);
        f1129e.append(106, 13);
        f1129e.append(109, 16);
        f1129e.append(107, 14);
        f1129e.append(104, 11);
        f1129e.append(108, 15);
        f1129e.append(105, 12);
        f1129e.append(95, 40);
        f1129e.append(80, 39);
        f1129e.append(79, 41);
        f1129e.append(94, 42);
        f1129e.append(78, 20);
        f1129e.append(93, 37);
        f1129e.append(67, 5);
        f1129e.append(81, 87);
        f1129e.append(90, 87);
        f1129e.append(84, 87);
        f1129e.append(61, 87);
        f1129e.append(57, 87);
        f1129e.append(5, 24);
        f1129e.append(7, 28);
        f1129e.append(23, 31);
        f1129e.append(24, 8);
        f1129e.append(6, 34);
        f1129e.append(8, 2);
        f1129e.append(3, 23);
        f1129e.append(4, 21);
        f1129e.append(96, 95);
        f1129e.append(73, 96);
        f1129e.append(2, 22);
        f1129e.append(13, 43);
        f1129e.append(26, 44);
        f1129e.append(21, 45);
        f1129e.append(22, 46);
        f1129e.append(20, 60);
        f1129e.append(18, 47);
        f1129e.append(19, 48);
        f1129e.append(14, 49);
        f1129e.append(15, 50);
        f1129e.append(16, 51);
        f1129e.append(17, 52);
        f1129e.append(25, 53);
        f1129e.append(97, 54);
        f1129e.append(74, 55);
        f1129e.append(98, 56);
        f1129e.append(75, 57);
        f1129e.append(99, 58);
        f1129e.append(76, 59);
        f1129e.append(64, 61);
        f1129e.append(66, 62);
        f1129e.append(65, 63);
        f1129e.append(28, 64);
        f1129e.append(121, 65);
        f1129e.append(35, 66);
        f1129e.append(122, 67);
        f1129e.append(113, 79);
        f1129e.append(1, 38);
        f1129e.append(112, 68);
        f1129e.append(100, 69);
        f1129e.append(77, 70);
        f1129e.append(111, 97);
        f1129e.append(32, 71);
        f1129e.append(30, 72);
        f1129e.append(31, 73);
        f1129e.append(33, 74);
        f1129e.append(29, 75);
        f1129e.append(114, 76);
        f1129e.append(89, 77);
        f1129e.append(123, 78);
        f1129e.append(56, 80);
        f1129e.append(55, 81);
        f1129e.append(116, 82);
        f1129e.append(120, 83);
        f1129e.append(119, 84);
        f1129e.append(118, 85);
        f1129e.append(117, 86);
        f1130f.append(85, 6);
        f1130f.append(85, 7);
        f1130f.append(0, 27);
        f1130f.append(89, 13);
        f1130f.append(92, 16);
        f1130f.append(90, 14);
        f1130f.append(87, 11);
        f1130f.append(91, 15);
        f1130f.append(88, 12);
        f1130f.append(78, 40);
        f1130f.append(71, 39);
        f1130f.append(70, 41);
        f1130f.append(77, 42);
        f1130f.append(69, 20);
        f1130f.append(76, 37);
        f1130f.append(60, 5);
        f1130f.append(72, 87);
        f1130f.append(75, 87);
        f1130f.append(73, 87);
        f1130f.append(57, 87);
        f1130f.append(56, 87);
        f1130f.append(5, 24);
        f1130f.append(7, 28);
        f1130f.append(23, 31);
        f1130f.append(24, 8);
        f1130f.append(6, 34);
        f1130f.append(8, 2);
        f1130f.append(3, 23);
        f1130f.append(4, 21);
        f1130f.append(79, 95);
        f1130f.append(64, 96);
        f1130f.append(2, 22);
        f1130f.append(13, 43);
        f1130f.append(26, 44);
        f1130f.append(21, 45);
        f1130f.append(22, 46);
        f1130f.append(20, 60);
        f1130f.append(18, 47);
        f1130f.append(19, 48);
        f1130f.append(14, 49);
        f1130f.append(15, 50);
        f1130f.append(16, 51);
        f1130f.append(17, 52);
        f1130f.append(25, 53);
        f1130f.append(80, 54);
        f1130f.append(65, 55);
        f1130f.append(81, 56);
        f1130f.append(66, 57);
        f1130f.append(82, 58);
        f1130f.append(67, 59);
        f1130f.append(59, 62);
        f1130f.append(58, 63);
        f1130f.append(28, 64);
        f1130f.append(105, 65);
        f1130f.append(34, 66);
        f1130f.append(106, 67);
        f1130f.append(96, 79);
        f1130f.append(1, 38);
        f1130f.append(97, 98);
        f1130f.append(95, 68);
        f1130f.append(83, 69);
        f1130f.append(68, 70);
        f1130f.append(32, 71);
        f1130f.append(30, 72);
        f1130f.append(31, 73);
        f1130f.append(33, 74);
        f1130f.append(29, 75);
        f1130f.append(98, 76);
        f1130f.append(74, 77);
        f1130f.append(107, 78);
        f1130f.append(55, 80);
        f1130f.append(54, 81);
        f1130f.append(100, 82);
        f1130f.append(104, 83);
        f1130f.append(103, 84);
        f1130f.append(102, 85);
        f1130f.append(101, 86);
        f1130f.append(94, 97);
    }

    public static int g(TypedArray typedArray, int i10, int i11) {
        int resourceId = typedArray.getResourceId(i10, i11);
        return resourceId == -1 ? typedArray.getInt(i10, -1) : resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void h(java.lang.Object r8, android.content.res.TypedArray r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.b.h(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    public static void i(ConstraintLayout.a aVar, String str) {
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i10 = 0;
            int i11 = -1;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (!substring.equalsIgnoreCase("W")) {
                    i10 = substring.equalsIgnoreCase("H") ? 1 : -1;
                }
                i11 = i10;
                i10 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            try {
                if (indexOf2 < 0 || indexOf2 >= length - 1) {
                    String substring2 = str.substring(i10);
                    if (substring2.length() > 0) {
                        Float.parseFloat(substring2);
                    }
                } else {
                    String substring3 = str.substring(i10, indexOf2);
                    String substring4 = str.substring(indexOf2 + 1);
                    if (substring3.length() > 0 && substring4.length() > 0) {
                        float parseFloat = Float.parseFloat(substring3);
                        float parseFloat2 = Float.parseFloat(substring4);
                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                            if (i11 == 1) {
                                Math.abs(parseFloat2 / parseFloat);
                            } else {
                                Math.abs(parseFloat / parseFloat2);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        aVar.G = str;
    }

    public final void a(ConstraintLayout constraintLayout) {
        b(constraintLayout);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    public final void b(ConstraintLayout constraintLayout) {
        View findViewById;
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f1133c.keySet());
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            int id = childAt.getId();
            if (!this.f1133c.containsKey(Integer.valueOf(id))) {
                StringBuilder c10 = androidx.activity.result.a.c("id unknown ");
                c10.append(w.a.b(childAt));
                Log.w("ConstraintSet", c10.toString());
            } else if (this.f1132b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else {
                if (id != -1) {
                    if (this.f1133c.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        a aVar = this.f1133c.get(Integer.valueOf(id));
                        if (aVar != null) {
                            if (childAt instanceof Barrier) {
                                aVar.f1137d.f1168h0 = 1;
                                Barrier barrier = (Barrier) childAt;
                                barrier.setId(id);
                                barrier.setType(aVar.f1137d.f1164f0);
                                barrier.setMargin(aVar.f1137d.f1166g0);
                                barrier.setAllowsGoneWidget(aVar.f1137d.f1180n0);
                                C0011b c0011b = aVar.f1137d;
                                int[] iArr = c0011b.f1170i0;
                                if (iArr != null) {
                                    barrier.setReferencedIds(iArr);
                                } else {
                                    String str = c0011b.f1172j0;
                                    if (str != null) {
                                        c0011b.f1170i0 = d(barrier, str);
                                        barrier.setReferencedIds(aVar.f1137d.f1170i0);
                                    }
                                }
                            }
                            ConstraintLayout.a aVar2 = (ConstraintLayout.a) childAt.getLayoutParams();
                            aVar2.a();
                            aVar.a(aVar2);
                            x.a.b(childAt, aVar.f1139f);
                            childAt.setLayoutParams(aVar2);
                            d dVar = aVar.f1135b;
                            if (dVar.f1204b == 0) {
                                childAt.setVisibility(dVar.f1203a);
                            }
                            childAt.setAlpha(aVar.f1135b.f1205c);
                            childAt.setRotation(aVar.f1138e.f1208a);
                            childAt.setRotationX(aVar.f1138e.f1209b);
                            childAt.setRotationY(aVar.f1138e.f1210c);
                            childAt.setScaleX(aVar.f1138e.f1211d);
                            childAt.setScaleY(aVar.f1138e.f1212e);
                            e eVar = aVar.f1138e;
                            if (eVar.f1215h != -1) {
                                if (((View) childAt.getParent()).findViewById(aVar.f1138e.f1215h) != null) {
                                    float bottom = (findViewById.getBottom() + findViewById.getTop()) / 2.0f;
                                    float right = (findViewById.getRight() + findViewById.getLeft()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(right - childAt.getLeft());
                                        childAt.setPivotY(bottom - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(eVar.f1213f)) {
                                    childAt.setPivotX(aVar.f1138e.f1213f);
                                }
                                if (!Float.isNaN(aVar.f1138e.f1214g)) {
                                    childAt.setPivotY(aVar.f1138e.f1214g);
                                }
                            }
                            childAt.setTranslationX(aVar.f1138e.f1216i);
                            childAt.setTranslationY(aVar.f1138e.f1217j);
                            childAt.setTranslationZ(aVar.f1138e.f1218k);
                            e eVar2 = aVar.f1138e;
                            if (eVar2.f1219l) {
                                childAt.setElevation(eVar2.f1220m);
                            }
                        }
                    } else {
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            a aVar3 = this.f1133c.get(num);
            if (aVar3 != null) {
                if (aVar3.f1137d.f1168h0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    C0011b c0011b2 = aVar3.f1137d;
                    int[] iArr2 = c0011b2.f1170i0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = c0011b2.f1172j0;
                        if (str2 != null) {
                            c0011b2.f1170i0 = d(barrier2, str2);
                            barrier2.setReferencedIds(aVar3.f1137d.f1170i0);
                        }
                    }
                    barrier2.setType(aVar3.f1137d.f1164f0);
                    barrier2.setMargin(aVar3.f1137d.f1166g0);
                    ConstraintLayout.a aVar4 = new ConstraintLayout.a();
                    barrier2.k();
                    aVar3.a(aVar4);
                    constraintLayout.addView(barrier2, aVar4);
                }
                if (aVar3.f1137d.f1153a) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    ConstraintLayout.a aVar5 = new ConstraintLayout.a();
                    aVar3.a(aVar5);
                    constraintLayout.addView(guideline, aVar5);
                }
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt2 = constraintLayout.getChildAt(i11);
            if (childAt2 instanceof androidx.constraintlayout.widget.a) {
                ((androidx.constraintlayout.widget.a) childAt2).g(constraintLayout);
            }
        }
    }

    public final void c(ConstraintLayout constraintLayout) {
        Throwable e10;
        x.a aVar;
        b bVar = this;
        int childCount = constraintLayout.getChildCount();
        bVar.f1133c.clear();
        int i10 = 0;
        while (i10 < childCount) {
            View childAt = constraintLayout.getChildAt(i10);
            ConstraintLayout.a aVar2 = (ConstraintLayout.a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (bVar.f1132b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!bVar.f1133c.containsKey(Integer.valueOf(id))) {
                bVar.f1133c.put(Integer.valueOf(id), new a());
            }
            a aVar3 = bVar.f1133c.get(Integer.valueOf(id));
            if (aVar3 != null) {
                HashMap<String, x.a> hashMap = bVar.f1131a;
                HashMap<String, x.a> hashMap2 = new HashMap<>();
                Class<?> cls = childAt.getClass();
                for (String str : hashMap.keySet()) {
                    x.a aVar4 = hashMap.get(str);
                    try {
                        if (str.equals("BackgroundColor")) {
                            aVar = new x.a(aVar4, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor()));
                        } else {
                            try {
                                aVar = new x.a(aVar4, cls.getMethod("getMap" + str, new Class[0]).invoke(childAt, new Object[0]));
                            } catch (IllegalAccessException e11) {
                                e10 = e11;
                                e10.printStackTrace();
                            } catch (NoSuchMethodException e12) {
                                e10 = e12;
                                e10.printStackTrace();
                            } catch (InvocationTargetException e13) {
                                e10 = e13;
                                e10.printStackTrace();
                            }
                        }
                        hashMap2.put(str, aVar);
                    } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e14) {
                        e10 = e14;
                    }
                }
                aVar3.f1139f = hashMap2;
                aVar3.b(id, aVar2);
                aVar3.f1135b.f1203a = childAt.getVisibility();
                aVar3.f1135b.f1205c = childAt.getAlpha();
                aVar3.f1138e.f1208a = childAt.getRotation();
                aVar3.f1138e.f1209b = childAt.getRotationX();
                aVar3.f1138e.f1210c = childAt.getRotationY();
                aVar3.f1138e.f1211d = childAt.getScaleX();
                aVar3.f1138e.f1212e = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    e eVar = aVar3.f1138e;
                    eVar.f1213f = pivotX;
                    eVar.f1214g = pivotY;
                }
                aVar3.f1138e.f1216i = childAt.getTranslationX();
                aVar3.f1138e.f1217j = childAt.getTranslationY();
                aVar3.f1138e.f1218k = childAt.getTranslationZ();
                e eVar2 = aVar3.f1138e;
                if (eVar2.f1219l) {
                    eVar2.f1220m = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    aVar3.f1137d.f1180n0 = barrier.getAllowsGoneWidget();
                    aVar3.f1137d.f1170i0 = barrier.getReferencedIds();
                    aVar3.f1137d.f1164f0 = barrier.getType();
                    aVar3.f1137d.f1166g0 = barrier.getMargin();
                }
            }
            i10++;
            bVar = this;
        }
    }

    public final int[] d(View view, String str) {
        int i10;
        Object c10;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i11 = 0;
        int i12 = 0;
        while (i11 < split.length) {
            String trim = split[i11].trim();
            try {
                i10 = x.d.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i10 = 0;
            }
            if (i10 == 0) {
                i10 = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i10 == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (c10 = ((ConstraintLayout) view.getParent()).c(trim)) != null && (c10 instanceof Integer)) {
                i10 = ((Integer) c10).intValue();
            }
            iArr[i12] = i10;
            i11++;
            i12++;
        }
        return i12 != split.length ? Arrays.copyOf(iArr, i12) : iArr;
    }

    public final a e(Context context, AttributeSet attributeSet, boolean z10) {
        c cVar;
        c cVar2;
        int i10;
        c cVar3;
        StringBuilder c10;
        int i11;
        C0011b c0011b;
        String str;
        StringBuilder sb;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        float f10;
        int i20;
        float f11;
        int i21;
        int i22;
        float f12;
        int i23;
        int i24;
        int i25;
        boolean z11;
        int i26;
        int i27;
        c cVar4;
        a aVar = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z10 ? g.f5716u : g.f5714s);
        int i28 = 3;
        int i29 = 1;
        int i30 = 0;
        if (z10) {
            int indexCount = obtainStyledAttributes.getIndexCount();
            a.C0010a c0010a = new a.C0010a();
            Objects.requireNonNull(aVar.f1136c);
            Objects.requireNonNull(aVar.f1137d);
            Objects.requireNonNull(aVar.f1135b);
            Objects.requireNonNull(aVar.f1138e);
            int i31 = 0;
            while (i30 < indexCount) {
                int index = obtainStyledAttributes.getIndex(i30);
                switch (f1130f.get(index)) {
                    case 2:
                        i14 = 2;
                        i16 = aVar.f1137d.I;
                        i15 = obtainStyledAttributes.getDimensionPixelSize(index, i16);
                        i12 = i14;
                        i13 = i15;
                        c0010a.b(i12, i13);
                        break;
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                    case 25:
                    case 26:
                    case 29:
                    case 30:
                    case 32:
                    case 33:
                    case 35:
                    case 36:
                    case 61:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                    default:
                        sb = new StringBuilder();
                        str = "Unknown attribute 0x";
                        sb.append(str);
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(f1129e.get(index));
                        Log.w("ConstraintSet", sb.toString());
                        break;
                    case 5:
                        i17 = 5;
                        c0010a.c(i17, obtainStyledAttributes.getString(index));
                        break;
                    case 6:
                        i19 = 6;
                        i18 = aVar.f1137d.C;
                        i12 = i19;
                        i13 = obtainStyledAttributes.getDimensionPixelOffset(index, i18);
                        c0010a.b(i12, i13);
                        break;
                    case 7:
                        i19 = 7;
                        i18 = aVar.f1137d.D;
                        i12 = i19;
                        i13 = obtainStyledAttributes.getDimensionPixelOffset(index, i18);
                        c0010a.b(i12, i13);
                        break;
                    case 8:
                        i14 = 8;
                        i16 = aVar.f1137d.J;
                        i15 = obtainStyledAttributes.getDimensionPixelSize(index, i16);
                        i12 = i14;
                        i13 = i15;
                        c0010a.b(i12, i13);
                        break;
                    case 11:
                        i14 = 11;
                        i16 = aVar.f1137d.P;
                        i15 = obtainStyledAttributes.getDimensionPixelSize(index, i16);
                        i12 = i14;
                        i13 = i15;
                        c0010a.b(i12, i13);
                        break;
                    case 12:
                        i14 = 12;
                        i16 = aVar.f1137d.Q;
                        i15 = obtainStyledAttributes.getDimensionPixelSize(index, i16);
                        i12 = i14;
                        i13 = i15;
                        c0010a.b(i12, i13);
                        break;
                    case 13:
                        i14 = 13;
                        i16 = aVar.f1137d.M;
                        i15 = obtainStyledAttributes.getDimensionPixelSize(index, i16);
                        i12 = i14;
                        i13 = i15;
                        c0010a.b(i12, i13);
                        break;
                    case 14:
                        i14 = 14;
                        i16 = aVar.f1137d.O;
                        i15 = obtainStyledAttributes.getDimensionPixelSize(index, i16);
                        i12 = i14;
                        i13 = i15;
                        c0010a.b(i12, i13);
                        break;
                    case 15:
                        i14 = 15;
                        i16 = aVar.f1137d.R;
                        i15 = obtainStyledAttributes.getDimensionPixelSize(index, i16);
                        i12 = i14;
                        i13 = i15;
                        c0010a.b(i12, i13);
                        break;
                    case 16:
                        i14 = 16;
                        i16 = aVar.f1137d.N;
                        i15 = obtainStyledAttributes.getDimensionPixelSize(index, i16);
                        i12 = i14;
                        i13 = i15;
                        c0010a.b(i12, i13);
                        break;
                    case 17:
                        i19 = 17;
                        i18 = aVar.f1137d.f1159d;
                        i12 = i19;
                        i13 = obtainStyledAttributes.getDimensionPixelOffset(index, i18);
                        c0010a.b(i12, i13);
                        break;
                    case 18:
                        i19 = 18;
                        i18 = aVar.f1137d.f1161e;
                        i12 = i19;
                        i13 = obtainStyledAttributes.getDimensionPixelOffset(index, i18);
                        c0010a.b(i12, i13);
                        break;
                    case 19:
                        i20 = 19;
                        f11 = aVar.f1137d.f1163f;
                        f10 = obtainStyledAttributes.getFloat(index, f11);
                        c0010a.a(i20, f10);
                        break;
                    case 20:
                        i20 = 20;
                        f11 = aVar.f1137d.f1189w;
                        f10 = obtainStyledAttributes.getFloat(index, f11);
                        c0010a.a(i20, f10);
                        break;
                    case 21:
                        i12 = 21;
                        i21 = aVar.f1137d.f1157c;
                        i13 = obtainStyledAttributes.getLayoutDimension(index, i21);
                        c0010a.b(i12, i13);
                        break;
                    case 22:
                        i12 = 22;
                        i13 = f1128d[obtainStyledAttributes.getInt(index, aVar.f1135b.f1203a)];
                        c0010a.b(i12, i13);
                        break;
                    case 23:
                        i21 = aVar.f1137d.f1155b;
                        i12 = 23;
                        i13 = obtainStyledAttributes.getLayoutDimension(index, i21);
                        c0010a.b(i12, i13);
                        break;
                    case 24:
                        i16 = aVar.f1137d.F;
                        i14 = 24;
                        i15 = obtainStyledAttributes.getDimensionPixelSize(index, i16);
                        i12 = i14;
                        i13 = i15;
                        c0010a.b(i12, i13);
                        break;
                    case 27:
                        i14 = 27;
                        i22 = aVar.f1137d.E;
                        i15 = obtainStyledAttributes.getInt(index, i22);
                        i12 = i14;
                        i13 = i15;
                        c0010a.b(i12, i13);
                        break;
                    case 28:
                        i14 = 28;
                        i16 = aVar.f1137d.G;
                        i15 = obtainStyledAttributes.getDimensionPixelSize(index, i16);
                        i12 = i14;
                        i13 = i15;
                        c0010a.b(i12, i13);
                        break;
                    case 31:
                        i14 = 31;
                        i16 = aVar.f1137d.K;
                        i15 = obtainStyledAttributes.getDimensionPixelSize(index, i16);
                        i12 = i14;
                        i13 = i15;
                        c0010a.b(i12, i13);
                        break;
                    case 34:
                        i14 = 34;
                        i16 = aVar.f1137d.H;
                        i15 = obtainStyledAttributes.getDimensionPixelSize(index, i16);
                        i12 = i14;
                        i13 = i15;
                        c0010a.b(i12, i13);
                        break;
                    case 37:
                        i20 = 37;
                        f11 = aVar.f1137d.f1190x;
                        f10 = obtainStyledAttributes.getFloat(index, f11);
                        c0010a.a(i20, f10);
                        break;
                    case 38:
                        i13 = obtainStyledAttributes.getResourceId(index, aVar.f1134a);
                        aVar.f1134a = i13;
                        i12 = 38;
                        c0010a.b(i12, i13);
                        break;
                    case 39:
                        i20 = 39;
                        f11 = aVar.f1137d.U;
                        f10 = obtainStyledAttributes.getFloat(index, f11);
                        c0010a.a(i20, f10);
                        break;
                    case 40:
                        i20 = 40;
                        f11 = aVar.f1137d.T;
                        f10 = obtainStyledAttributes.getFloat(index, f11);
                        c0010a.a(i20, f10);
                        break;
                    case 41:
                        i14 = 41;
                        i22 = aVar.f1137d.V;
                        i15 = obtainStyledAttributes.getInt(index, i22);
                        i12 = i14;
                        i13 = i15;
                        c0010a.b(i12, i13);
                        break;
                    case 42:
                        i14 = 42;
                        i22 = aVar.f1137d.W;
                        i15 = obtainStyledAttributes.getInt(index, i22);
                        i12 = i14;
                        i13 = i15;
                        c0010a.b(i12, i13);
                        break;
                    case 43:
                        i20 = 43;
                        f11 = aVar.f1135b.f1205c;
                        f10 = obtainStyledAttributes.getFloat(index, f11);
                        c0010a.a(i20, f10);
                        break;
                    case 44:
                        i20 = 44;
                        c0010a.d(44, true);
                        f12 = aVar.f1138e.f1220m;
                        f10 = obtainStyledAttributes.getDimension(index, f12);
                        c0010a.a(i20, f10);
                        break;
                    case 45:
                        i20 = 45;
                        f11 = aVar.f1138e.f1209b;
                        f10 = obtainStyledAttributes.getFloat(index, f11);
                        c0010a.a(i20, f10);
                        break;
                    case 46:
                        i20 = 46;
                        f11 = aVar.f1138e.f1210c;
                        f10 = obtainStyledAttributes.getFloat(index, f11);
                        c0010a.a(i20, f10);
                        break;
                    case 47:
                        i20 = 47;
                        f11 = aVar.f1138e.f1211d;
                        f10 = obtainStyledAttributes.getFloat(index, f11);
                        c0010a.a(i20, f10);
                        break;
                    case 48:
                        i20 = 48;
                        f11 = aVar.f1138e.f1212e;
                        f10 = obtainStyledAttributes.getFloat(index, f11);
                        c0010a.a(i20, f10);
                        break;
                    case 49:
                        i20 = 49;
                        f12 = aVar.f1138e.f1213f;
                        f10 = obtainStyledAttributes.getDimension(index, f12);
                        c0010a.a(i20, f10);
                        break;
                    case 50:
                        i20 = 50;
                        f12 = aVar.f1138e.f1214g;
                        f10 = obtainStyledAttributes.getDimension(index, f12);
                        c0010a.a(i20, f10);
                        break;
                    case 51:
                        i20 = 51;
                        f12 = aVar.f1138e.f1216i;
                        f10 = obtainStyledAttributes.getDimension(index, f12);
                        c0010a.a(i20, f10);
                        break;
                    case ModuleDescriptor.MODULE_VERSION /* 52 */:
                        i20 = 52;
                        f12 = aVar.f1138e.f1217j;
                        f10 = obtainStyledAttributes.getDimension(index, f12);
                        c0010a.a(i20, f10);
                        break;
                    case 53:
                        i20 = 53;
                        f12 = aVar.f1138e.f1218k;
                        f10 = obtainStyledAttributes.getDimension(index, f12);
                        c0010a.a(i20, f10);
                        break;
                    case 54:
                        i14 = 54;
                        i22 = aVar.f1137d.X;
                        i15 = obtainStyledAttributes.getInt(index, i22);
                        i12 = i14;
                        i13 = i15;
                        c0010a.b(i12, i13);
                        break;
                    case 55:
                        i14 = 55;
                        i22 = aVar.f1137d.Y;
                        i15 = obtainStyledAttributes.getInt(index, i22);
                        i12 = i14;
                        i13 = i15;
                        c0010a.b(i12, i13);
                        break;
                    case 56:
                        i14 = 56;
                        i16 = aVar.f1137d.Z;
                        i15 = obtainStyledAttributes.getDimensionPixelSize(index, i16);
                        i12 = i14;
                        i13 = i15;
                        c0010a.b(i12, i13);
                        break;
                    case 57:
                        i14 = 57;
                        i16 = aVar.f1137d.f1154a0;
                        i15 = obtainStyledAttributes.getDimensionPixelSize(index, i16);
                        i12 = i14;
                        i13 = i15;
                        c0010a.b(i12, i13);
                        break;
                    case 58:
                        i14 = 58;
                        i16 = aVar.f1137d.f1156b0;
                        i15 = obtainStyledAttributes.getDimensionPixelSize(index, i16);
                        i12 = i14;
                        i13 = i15;
                        c0010a.b(i12, i13);
                        break;
                    case 59:
                        i14 = 59;
                        i16 = aVar.f1137d.f1158c0;
                        i15 = obtainStyledAttributes.getDimensionPixelSize(index, i16);
                        i12 = i14;
                        i13 = i15;
                        c0010a.b(i12, i13);
                        break;
                    case 60:
                        i20 = 60;
                        f11 = aVar.f1138e.f1208a;
                        f10 = obtainStyledAttributes.getFloat(index, f11);
                        c0010a.a(i20, f10);
                        break;
                    case 62:
                        i14 = 62;
                        i16 = aVar.f1137d.A;
                        i15 = obtainStyledAttributes.getDimensionPixelSize(index, i16);
                        i12 = i14;
                        i13 = i15;
                        c0010a.b(i12, i13);
                        break;
                    case 63:
                        i20 = 63;
                        f11 = aVar.f1137d.B;
                        f10 = obtainStyledAttributes.getFloat(index, f11);
                        c0010a.a(i20, f10);
                        break;
                    case 64:
                        i24 = 64;
                        i23 = aVar.f1136c.f1193a;
                        i12 = i24;
                        i13 = g(obtainStyledAttributes, index, i23);
                        c0010a.b(i12, i13);
                        break;
                    case 65:
                        c0010a.c(65, obtainStyledAttributes.peekValue(index).type == 3 ? obtainStyledAttributes.getString(index) : t.a.f18408c[obtainStyledAttributes.getInteger(index, 0)]);
                        break;
                    case 66:
                        i14 = 66;
                        i22 = 0;
                        i15 = obtainStyledAttributes.getInt(index, i22);
                        i12 = i14;
                        i13 = i15;
                        c0010a.b(i12, i13);
                        break;
                    case 67:
                        i20 = 67;
                        f11 = aVar.f1136c.f1197e;
                        f10 = obtainStyledAttributes.getFloat(index, f11);
                        c0010a.a(i20, f10);
                        break;
                    case 68:
                        i20 = 68;
                        f11 = aVar.f1135b.f1206d;
                        f10 = obtainStyledAttributes.getFloat(index, f11);
                        c0010a.a(i20, f10);
                        break;
                    case 69:
                        i20 = 69;
                        f11 = 1.0f;
                        f10 = obtainStyledAttributes.getFloat(index, f11);
                        c0010a.a(i20, f10);
                        break;
                    case 70:
                        i20 = 70;
                        f11 = 1.0f;
                        f10 = obtainStyledAttributes.getFloat(index, f11);
                        c0010a.a(i20, f10);
                        break;
                    case 71:
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i14 = 72;
                        i22 = aVar.f1137d.f1164f0;
                        i15 = obtainStyledAttributes.getInt(index, i22);
                        i12 = i14;
                        i13 = i15;
                        c0010a.b(i12, i13);
                        break;
                    case 73:
                        i14 = 73;
                        i16 = aVar.f1137d.f1166g0;
                        i15 = obtainStyledAttributes.getDimensionPixelSize(index, i16);
                        i12 = i14;
                        i13 = i15;
                        c0010a.b(i12, i13);
                        break;
                    case 74:
                        i17 = 74;
                        c0010a.c(i17, obtainStyledAttributes.getString(index));
                        break;
                    case 75:
                        i25 = 75;
                        z11 = aVar.f1137d.f1180n0;
                        c0010a.d(i25, obtainStyledAttributes.getBoolean(index, z11));
                        break;
                    case 76:
                        i14 = 76;
                        i22 = aVar.f1136c.f1195c;
                        i15 = obtainStyledAttributes.getInt(index, i22);
                        i12 = i14;
                        i13 = i15;
                        c0010a.b(i12, i13);
                        break;
                    case 77:
                        i17 = 77;
                        c0010a.c(i17, obtainStyledAttributes.getString(index));
                        break;
                    case 78:
                        i14 = 78;
                        i22 = aVar.f1135b.f1204b;
                        i15 = obtainStyledAttributes.getInt(index, i22);
                        i12 = i14;
                        i13 = i15;
                        c0010a.b(i12, i13);
                        break;
                    case 79:
                        i20 = 79;
                        f11 = aVar.f1136c.f1196d;
                        f10 = obtainStyledAttributes.getFloat(index, f11);
                        c0010a.a(i20, f10);
                        break;
                    case 80:
                        i25 = 80;
                        z11 = aVar.f1137d.f1176l0;
                        c0010a.d(i25, obtainStyledAttributes.getBoolean(index, z11));
                        break;
                    case 81:
                        i25 = 81;
                        z11 = aVar.f1137d.f1178m0;
                        c0010a.d(i25, obtainStyledAttributes.getBoolean(index, z11));
                        break;
                    case 82:
                        i27 = 82;
                        i26 = aVar.f1136c.f1194b;
                        i12 = i27;
                        i13 = obtainStyledAttributes.getInteger(index, i26);
                        c0010a.b(i12, i13);
                        break;
                    case 83:
                        i24 = 83;
                        i23 = aVar.f1138e.f1215h;
                        i12 = i24;
                        i13 = g(obtainStyledAttributes, index, i23);
                        c0010a.b(i12, i13);
                        break;
                    case 84:
                        i27 = 84;
                        i26 = aVar.f1136c.f1199g;
                        i12 = i27;
                        i13 = obtainStyledAttributes.getInteger(index, i26);
                        c0010a.b(i12, i13);
                        break;
                    case 85:
                        i20 = 85;
                        f11 = aVar.f1136c.f1198f;
                        f10 = obtainStyledAttributes.getFloat(index, f11);
                        c0010a.a(i20, f10);
                        break;
                    case 86:
                        int i32 = obtainStyledAttributes.peekValue(index).type;
                        i12 = 88;
                        if (i32 == i29) {
                            aVar.f1136c.f1202j = obtainStyledAttributes.getResourceId(index, -1);
                            c0010a.b(89, aVar.f1136c.f1202j);
                            cVar4 = aVar.f1136c;
                            if (cVar4.f1202j == -1) {
                                break;
                            }
                        } else if (i32 == 3) {
                            aVar.f1136c.f1200h = obtainStyledAttributes.getString(index);
                            c0010a.c(90, aVar.f1136c.f1200h);
                            if (aVar.f1136c.f1200h.indexOf("/") <= 0) {
                                cVar4 = aVar.f1136c;
                                i13 = -1;
                                cVar4.f1201i = i13;
                                c0010a.b(i12, i13);
                                break;
                            } else {
                                aVar.f1136c.f1202j = obtainStyledAttributes.getResourceId(index, -1);
                                c0010a.b(89, aVar.f1136c.f1202j);
                                cVar4 = aVar.f1136c;
                            }
                        } else {
                            c cVar5 = aVar.f1136c;
                            cVar5.f1201i = obtainStyledAttributes.getInteger(index, cVar5.f1202j);
                            i13 = aVar.f1136c.f1201i;
                            c0010a.b(i12, i13);
                        }
                        i13 = -2;
                        cVar4.f1201i = i13;
                        c0010a.b(i12, i13);
                    case 87:
                        sb = new StringBuilder();
                        str = "unused attribute 0x";
                        sb.append(str);
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(f1129e.get(index));
                        Log.w("ConstraintSet", sb.toString());
                        break;
                    case 93:
                        i16 = aVar.f1137d.L;
                        i14 = 93;
                        i15 = obtainStyledAttributes.getDimensionPixelSize(index, i16);
                        i12 = i14;
                        i13 = i15;
                        c0010a.b(i12, i13);
                        break;
                    case 94:
                        i16 = aVar.f1137d.S;
                        i14 = 94;
                        i15 = obtainStyledAttributes.getDimensionPixelSize(index, i16);
                        i12 = i14;
                        i13 = i15;
                        c0010a.b(i12, i13);
                        break;
                    case 95:
                        h(c0010a, obtainStyledAttributes, index, i31);
                        break;
                    case 96:
                        h(c0010a, obtainStyledAttributes, index, i29);
                        break;
                    case 97:
                        i22 = aVar.f1137d.f1182o0;
                        i14 = 97;
                        i15 = obtainStyledAttributes.getInt(index, i22);
                        i12 = i14;
                        i13 = i15;
                        c0010a.b(i12, i13);
                        break;
                    case 98:
                        int i33 = w.d.f19859h0;
                        if (obtainStyledAttributes.peekValue(index).type == i28) {
                            obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            aVar.f1134a = obtainStyledAttributes.getResourceId(index, aVar.f1134a);
                            break;
                        }
                    case 99:
                        z11 = aVar.f1137d.f1165g;
                        i25 = 99;
                        c0010a.d(i25, obtainStyledAttributes.getBoolean(index, z11));
                        break;
                }
                i30++;
                i28 = 3;
                i29 = 1;
                i31 = 0;
            }
        } else {
            int indexCount2 = obtainStyledAttributes.getIndexCount();
            for (int i34 = 0; i34 < indexCount2; i34++) {
                int index2 = obtainStyledAttributes.getIndex(i34);
                if (index2 != 1 && 23 != index2 && 24 != index2) {
                    Objects.requireNonNull(aVar.f1136c);
                    Objects.requireNonNull(aVar.f1137d);
                    Objects.requireNonNull(aVar.f1135b);
                    Objects.requireNonNull(aVar.f1138e);
                }
                switch (f1129e.get(index2)) {
                    case 1:
                        C0011b c0011b2 = aVar.f1137d;
                        c0011b2.p = g(obtainStyledAttributes, index2, c0011b2.p);
                        break;
                    case 2:
                        C0011b c0011b3 = aVar.f1137d;
                        c0011b3.I = obtainStyledAttributes.getDimensionPixelSize(index2, c0011b3.I);
                        break;
                    case 3:
                        C0011b c0011b4 = aVar.f1137d;
                        c0011b4.f1181o = g(obtainStyledAttributes, index2, c0011b4.f1181o);
                        break;
                    case 4:
                        C0011b c0011b5 = aVar.f1137d;
                        c0011b5.f1179n = g(obtainStyledAttributes, index2, c0011b5.f1179n);
                        break;
                    case 5:
                        aVar.f1137d.y = obtainStyledAttributes.getString(index2);
                        break;
                    case 6:
                        C0011b c0011b6 = aVar.f1137d;
                        c0011b6.C = obtainStyledAttributes.getDimensionPixelOffset(index2, c0011b6.C);
                        break;
                    case 7:
                        C0011b c0011b7 = aVar.f1137d;
                        c0011b7.D = obtainStyledAttributes.getDimensionPixelOffset(index2, c0011b7.D);
                        break;
                    case 8:
                        C0011b c0011b8 = aVar.f1137d;
                        c0011b8.J = obtainStyledAttributes.getDimensionPixelSize(index2, c0011b8.J);
                        break;
                    case 9:
                        C0011b c0011b9 = aVar.f1137d;
                        c0011b9.f1188v = g(obtainStyledAttributes, index2, c0011b9.f1188v);
                        break;
                    case 10:
                        C0011b c0011b10 = aVar.f1137d;
                        c0011b10.f1187u = g(obtainStyledAttributes, index2, c0011b10.f1187u);
                        break;
                    case 11:
                        C0011b c0011b11 = aVar.f1137d;
                        c0011b11.P = obtainStyledAttributes.getDimensionPixelSize(index2, c0011b11.P);
                        break;
                    case 12:
                        C0011b c0011b12 = aVar.f1137d;
                        c0011b12.Q = obtainStyledAttributes.getDimensionPixelSize(index2, c0011b12.Q);
                        break;
                    case 13:
                        C0011b c0011b13 = aVar.f1137d;
                        c0011b13.M = obtainStyledAttributes.getDimensionPixelSize(index2, c0011b13.M);
                        break;
                    case 14:
                        C0011b c0011b14 = aVar.f1137d;
                        c0011b14.O = obtainStyledAttributes.getDimensionPixelSize(index2, c0011b14.O);
                        break;
                    case 15:
                        C0011b c0011b15 = aVar.f1137d;
                        c0011b15.R = obtainStyledAttributes.getDimensionPixelSize(index2, c0011b15.R);
                        break;
                    case 16:
                        C0011b c0011b16 = aVar.f1137d;
                        c0011b16.N = obtainStyledAttributes.getDimensionPixelSize(index2, c0011b16.N);
                        break;
                    case 17:
                        C0011b c0011b17 = aVar.f1137d;
                        c0011b17.f1159d = obtainStyledAttributes.getDimensionPixelOffset(index2, c0011b17.f1159d);
                        break;
                    case 18:
                        C0011b c0011b18 = aVar.f1137d;
                        c0011b18.f1161e = obtainStyledAttributes.getDimensionPixelOffset(index2, c0011b18.f1161e);
                        break;
                    case 19:
                        C0011b c0011b19 = aVar.f1137d;
                        c0011b19.f1163f = obtainStyledAttributes.getFloat(index2, c0011b19.f1163f);
                        break;
                    case 20:
                        C0011b c0011b20 = aVar.f1137d;
                        c0011b20.f1189w = obtainStyledAttributes.getFloat(index2, c0011b20.f1189w);
                        break;
                    case 21:
                        C0011b c0011b21 = aVar.f1137d;
                        c0011b21.f1157c = obtainStyledAttributes.getLayoutDimension(index2, c0011b21.f1157c);
                        break;
                    case 22:
                        d dVar = aVar.f1135b;
                        dVar.f1203a = obtainStyledAttributes.getInt(index2, dVar.f1203a);
                        d dVar2 = aVar.f1135b;
                        dVar2.f1203a = f1128d[dVar2.f1203a];
                        break;
                    case 23:
                        C0011b c0011b22 = aVar.f1137d;
                        c0011b22.f1155b = obtainStyledAttributes.getLayoutDimension(index2, c0011b22.f1155b);
                        break;
                    case 24:
                        C0011b c0011b23 = aVar.f1137d;
                        c0011b23.F = obtainStyledAttributes.getDimensionPixelSize(index2, c0011b23.F);
                        break;
                    case 25:
                        C0011b c0011b24 = aVar.f1137d;
                        c0011b24.f1167h = g(obtainStyledAttributes, index2, c0011b24.f1167h);
                        break;
                    case 26:
                        C0011b c0011b25 = aVar.f1137d;
                        c0011b25.f1169i = g(obtainStyledAttributes, index2, c0011b25.f1169i);
                        break;
                    case 27:
                        C0011b c0011b26 = aVar.f1137d;
                        c0011b26.E = obtainStyledAttributes.getInt(index2, c0011b26.E);
                        break;
                    case 28:
                        C0011b c0011b27 = aVar.f1137d;
                        c0011b27.G = obtainStyledAttributes.getDimensionPixelSize(index2, c0011b27.G);
                        break;
                    case 29:
                        C0011b c0011b28 = aVar.f1137d;
                        c0011b28.f1171j = g(obtainStyledAttributes, index2, c0011b28.f1171j);
                        break;
                    case 30:
                        C0011b c0011b29 = aVar.f1137d;
                        c0011b29.f1173k = g(obtainStyledAttributes, index2, c0011b29.f1173k);
                        break;
                    case 31:
                        C0011b c0011b30 = aVar.f1137d;
                        c0011b30.K = obtainStyledAttributes.getDimensionPixelSize(index2, c0011b30.K);
                        break;
                    case 32:
                        C0011b c0011b31 = aVar.f1137d;
                        c0011b31.f1185s = g(obtainStyledAttributes, index2, c0011b31.f1185s);
                        break;
                    case 33:
                        C0011b c0011b32 = aVar.f1137d;
                        c0011b32.f1186t = g(obtainStyledAttributes, index2, c0011b32.f1186t);
                        break;
                    case 34:
                        C0011b c0011b33 = aVar.f1137d;
                        c0011b33.H = obtainStyledAttributes.getDimensionPixelSize(index2, c0011b33.H);
                        break;
                    case 35:
                        C0011b c0011b34 = aVar.f1137d;
                        c0011b34.f1177m = g(obtainStyledAttributes, index2, c0011b34.f1177m);
                        break;
                    case 36:
                        C0011b c0011b35 = aVar.f1137d;
                        c0011b35.f1175l = g(obtainStyledAttributes, index2, c0011b35.f1175l);
                        break;
                    case 37:
                        C0011b c0011b36 = aVar.f1137d;
                        c0011b36.f1190x = obtainStyledAttributes.getFloat(index2, c0011b36.f1190x);
                        break;
                    case 38:
                        aVar.f1134a = obtainStyledAttributes.getResourceId(index2, aVar.f1134a);
                        break;
                    case 39:
                        C0011b c0011b37 = aVar.f1137d;
                        c0011b37.U = obtainStyledAttributes.getFloat(index2, c0011b37.U);
                        break;
                    case 40:
                        C0011b c0011b38 = aVar.f1137d;
                        c0011b38.T = obtainStyledAttributes.getFloat(index2, c0011b38.T);
                        break;
                    case 41:
                        C0011b c0011b39 = aVar.f1137d;
                        c0011b39.V = obtainStyledAttributes.getInt(index2, c0011b39.V);
                        break;
                    case 42:
                        C0011b c0011b40 = aVar.f1137d;
                        c0011b40.W = obtainStyledAttributes.getInt(index2, c0011b40.W);
                        break;
                    case 43:
                        d dVar3 = aVar.f1135b;
                        dVar3.f1205c = obtainStyledAttributes.getFloat(index2, dVar3.f1205c);
                        break;
                    case 44:
                        e eVar = aVar.f1138e;
                        eVar.f1219l = true;
                        eVar.f1220m = obtainStyledAttributes.getDimension(index2, eVar.f1220m);
                        break;
                    case 45:
                        e eVar2 = aVar.f1138e;
                        eVar2.f1209b = obtainStyledAttributes.getFloat(index2, eVar2.f1209b);
                        break;
                    case 46:
                        e eVar3 = aVar.f1138e;
                        eVar3.f1210c = obtainStyledAttributes.getFloat(index2, eVar3.f1210c);
                        break;
                    case 47:
                        e eVar4 = aVar.f1138e;
                        eVar4.f1211d = obtainStyledAttributes.getFloat(index2, eVar4.f1211d);
                        break;
                    case 48:
                        e eVar5 = aVar.f1138e;
                        eVar5.f1212e = obtainStyledAttributes.getFloat(index2, eVar5.f1212e);
                        break;
                    case 49:
                        e eVar6 = aVar.f1138e;
                        eVar6.f1213f = obtainStyledAttributes.getDimension(index2, eVar6.f1213f);
                        break;
                    case 50:
                        e eVar7 = aVar.f1138e;
                        eVar7.f1214g = obtainStyledAttributes.getDimension(index2, eVar7.f1214g);
                        break;
                    case 51:
                        e eVar8 = aVar.f1138e;
                        eVar8.f1216i = obtainStyledAttributes.getDimension(index2, eVar8.f1216i);
                        break;
                    case ModuleDescriptor.MODULE_VERSION /* 52 */:
                        e eVar9 = aVar.f1138e;
                        eVar9.f1217j = obtainStyledAttributes.getDimension(index2, eVar9.f1217j);
                        break;
                    case 53:
                        e eVar10 = aVar.f1138e;
                        eVar10.f1218k = obtainStyledAttributes.getDimension(index2, eVar10.f1218k);
                        break;
                    case 54:
                        C0011b c0011b41 = aVar.f1137d;
                        c0011b41.X = obtainStyledAttributes.getInt(index2, c0011b41.X);
                        break;
                    case 55:
                        C0011b c0011b42 = aVar.f1137d;
                        c0011b42.Y = obtainStyledAttributes.getInt(index2, c0011b42.Y);
                        break;
                    case 56:
                        C0011b c0011b43 = aVar.f1137d;
                        c0011b43.Z = obtainStyledAttributes.getDimensionPixelSize(index2, c0011b43.Z);
                        break;
                    case 57:
                        C0011b c0011b44 = aVar.f1137d;
                        c0011b44.f1154a0 = obtainStyledAttributes.getDimensionPixelSize(index2, c0011b44.f1154a0);
                        break;
                    case 58:
                        C0011b c0011b45 = aVar.f1137d;
                        c0011b45.f1156b0 = obtainStyledAttributes.getDimensionPixelSize(index2, c0011b45.f1156b0);
                        break;
                    case 59:
                        C0011b c0011b46 = aVar.f1137d;
                        c0011b46.f1158c0 = obtainStyledAttributes.getDimensionPixelSize(index2, c0011b46.f1158c0);
                        break;
                    case 60:
                        e eVar11 = aVar.f1138e;
                        eVar11.f1208a = obtainStyledAttributes.getFloat(index2, eVar11.f1208a);
                        break;
                    case 61:
                        C0011b c0011b47 = aVar.f1137d;
                        c0011b47.f1191z = g(obtainStyledAttributes, index2, c0011b47.f1191z);
                        break;
                    case 62:
                        C0011b c0011b48 = aVar.f1137d;
                        c0011b48.A = obtainStyledAttributes.getDimensionPixelSize(index2, c0011b48.A);
                        break;
                    case 63:
                        C0011b c0011b49 = aVar.f1137d;
                        c0011b49.B = obtainStyledAttributes.getFloat(index2, c0011b49.B);
                        break;
                    case 64:
                        c cVar6 = aVar.f1136c;
                        cVar6.f1193a = g(obtainStyledAttributes, index2, cVar6.f1193a);
                        break;
                    case 65:
                        if (obtainStyledAttributes.peekValue(index2).type == 3) {
                            cVar = aVar.f1136c;
                            obtainStyledAttributes.getString(index2);
                        } else {
                            cVar = aVar.f1136c;
                            String str2 = t.a.f18408c[obtainStyledAttributes.getInteger(index2, 0)];
                        }
                        Objects.requireNonNull(cVar);
                        break;
                    case 66:
                        cVar = aVar.f1136c;
                        obtainStyledAttributes.getInt(index2, 0);
                        Objects.requireNonNull(cVar);
                        break;
                    case 67:
                        c cVar7 = aVar.f1136c;
                        cVar7.f1197e = obtainStyledAttributes.getFloat(index2, cVar7.f1197e);
                        break;
                    case 68:
                        d dVar4 = aVar.f1135b;
                        dVar4.f1206d = obtainStyledAttributes.getFloat(index2, dVar4.f1206d);
                        break;
                    case 69:
                        aVar.f1137d.f1160d0 = obtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 70:
                        aVar.f1137d.f1162e0 = obtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 71:
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        C0011b c0011b50 = aVar.f1137d;
                        c0011b50.f1164f0 = obtainStyledAttributes.getInt(index2, c0011b50.f1164f0);
                        break;
                    case 73:
                        C0011b c0011b51 = aVar.f1137d;
                        c0011b51.f1166g0 = obtainStyledAttributes.getDimensionPixelSize(index2, c0011b51.f1166g0);
                        break;
                    case 74:
                        aVar.f1137d.f1172j0 = obtainStyledAttributes.getString(index2);
                        break;
                    case 75:
                        C0011b c0011b52 = aVar.f1137d;
                        c0011b52.f1180n0 = obtainStyledAttributes.getBoolean(index2, c0011b52.f1180n0);
                        break;
                    case 76:
                        c cVar8 = aVar.f1136c;
                        cVar8.f1195c = obtainStyledAttributes.getInt(index2, cVar8.f1195c);
                        break;
                    case 77:
                        aVar.f1137d.f1174k0 = obtainStyledAttributes.getString(index2);
                        break;
                    case 78:
                        d dVar5 = aVar.f1135b;
                        dVar5.f1204b = obtainStyledAttributes.getInt(index2, dVar5.f1204b);
                        break;
                    case 79:
                        c cVar9 = aVar.f1136c;
                        cVar9.f1196d = obtainStyledAttributes.getFloat(index2, cVar9.f1196d);
                        break;
                    case 80:
                        C0011b c0011b53 = aVar.f1137d;
                        c0011b53.f1176l0 = obtainStyledAttributes.getBoolean(index2, c0011b53.f1176l0);
                        break;
                    case 81:
                        C0011b c0011b54 = aVar.f1137d;
                        c0011b54.f1178m0 = obtainStyledAttributes.getBoolean(index2, c0011b54.f1178m0);
                        break;
                    case 82:
                        c cVar10 = aVar.f1136c;
                        cVar10.f1194b = obtainStyledAttributes.getInteger(index2, cVar10.f1194b);
                        break;
                    case 83:
                        e eVar12 = aVar.f1138e;
                        eVar12.f1215h = g(obtainStyledAttributes, index2, eVar12.f1215h);
                        break;
                    case 84:
                        c cVar11 = aVar.f1136c;
                        cVar11.f1199g = obtainStyledAttributes.getInteger(index2, cVar11.f1199g);
                        break;
                    case 85:
                        c cVar12 = aVar.f1136c;
                        cVar12.f1198f = obtainStyledAttributes.getFloat(index2, cVar12.f1198f);
                        break;
                    case 86:
                        int i35 = obtainStyledAttributes.peekValue(index2).type;
                        if (i35 == 1) {
                            aVar.f1136c.f1202j = obtainStyledAttributes.getResourceId(index2, -1);
                            cVar3 = aVar.f1136c;
                            if (cVar3.f1202j == -1) {
                                break;
                            }
                            cVar3.f1201i = -2;
                            break;
                        } else {
                            if (i35 == 3) {
                                aVar.f1136c.f1200h = obtainStyledAttributes.getString(index2);
                                if (aVar.f1136c.f1200h.indexOf("/") > 0) {
                                    aVar.f1136c.f1202j = obtainStyledAttributes.getResourceId(index2, -1);
                                    cVar3 = aVar.f1136c;
                                    cVar3.f1201i = -2;
                                } else {
                                    i10 = -1;
                                    cVar2 = aVar.f1136c;
                                }
                            } else {
                                cVar2 = aVar.f1136c;
                                i10 = obtainStyledAttributes.getInteger(index2, cVar2.f1202j);
                            }
                            cVar2.f1201i = i10;
                            break;
                        }
                    case 87:
                        c10 = androidx.activity.result.a.c("unused attribute 0x");
                        c10.append(Integer.toHexString(index2));
                        c10.append("   ");
                        c10.append(f1129e.get(index2));
                        Log.w("ConstraintSet", c10.toString());
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        c10 = androidx.activity.result.a.c("Unknown attribute 0x");
                        c10.append(Integer.toHexString(index2));
                        c10.append("   ");
                        c10.append(f1129e.get(index2));
                        Log.w("ConstraintSet", c10.toString());
                        break;
                    case 91:
                        C0011b c0011b55 = aVar.f1137d;
                        c0011b55.f1183q = g(obtainStyledAttributes, index2, c0011b55.f1183q);
                        break;
                    case 92:
                        C0011b c0011b56 = aVar.f1137d;
                        c0011b56.f1184r = g(obtainStyledAttributes, index2, c0011b56.f1184r);
                        break;
                    case 93:
                        C0011b c0011b57 = aVar.f1137d;
                        c0011b57.L = obtainStyledAttributes.getDimensionPixelSize(index2, c0011b57.L);
                        break;
                    case 94:
                        C0011b c0011b58 = aVar.f1137d;
                        c0011b58.S = obtainStyledAttributes.getDimensionPixelSize(index2, c0011b58.S);
                        break;
                    case 95:
                        c0011b = aVar.f1137d;
                        i11 = 0;
                        h(c0011b, obtainStyledAttributes, index2, i11);
                        break;
                    case 96:
                        c0011b = aVar.f1137d;
                        i11 = 1;
                        h(c0011b, obtainStyledAttributes, index2, i11);
                        break;
                    case 97:
                        C0011b c0011b59 = aVar.f1137d;
                        c0011b59.f1182o0 = obtainStyledAttributes.getInt(index2, c0011b59.f1182o0);
                        break;
                }
            }
            C0011b c0011b60 = aVar.f1137d;
            if (c0011b60.f1172j0 != null) {
                c0011b60.f1170i0 = null;
            }
        }
        obtainStyledAttributes.recycle();
        return aVar;
    }

    public final void f(Context context, int i10) {
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    a e10 = e(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        e10.f1137d.f1153a = true;
                    }
                    this.f1133c.put(Integer.valueOf(e10.f1134a), e10);
                }
            }
        } catch (IOException e11) {
            e11.printStackTrace();
        } catch (XmlPullParserException e12) {
            e12.printStackTrace();
        }
    }
}
