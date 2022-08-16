package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import l0.g;
import u.c;
import u.d;
import u.f;
import v.b;
import x.e;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    public static e J;

    /* renamed from: s */
    public SparseArray<View> f1063s = new SparseArray<>();

    /* renamed from: t */
    public ArrayList<androidx.constraintlayout.widget.a> f1064t = new ArrayList<>(4);

    /* renamed from: u */
    public u.e f1065u = new u.e();

    /* renamed from: v */
    public int f1066v = 0;

    /* renamed from: w */
    public int f1067w = 0;

    /* renamed from: x */
    public int f1068x = Integer.MAX_VALUE;
    public int y = Integer.MAX_VALUE;

    /* renamed from: z */
    public boolean f1069z = true;
    public int A = 257;
    public androidx.constraintlayout.widget.b B = null;
    public x.b C = null;
    public int D = -1;
    public HashMap<String, Integer> E = new HashMap<>();
    public SparseArray<d> F = new SparseArray<>();
    public b G = new b(this);
    public int H = 0;
    public int I = 0;

    /* loaded from: classes.dex */
    public static class a extends ViewGroup.MarginLayoutParams {
        public int A;
        public int B;
        public int C;
        public int D;
        public float E;
        public float F;
        public String G;
        public float H;
        public float I;
        public int J;
        public int K;
        public int L;
        public int M;
        public int N;
        public int O;
        public int P;
        public int Q;
        public float R;
        public float S;
        public int T;
        public int U;
        public int V;
        public boolean W;
        public boolean X;
        public String Y;
        public int Z;

        /* renamed from: a */
        public int f1070a;

        /* renamed from: a0 */
        public boolean f1071a0;

        /* renamed from: b */
        public int f1072b;

        /* renamed from: b0 */
        public boolean f1073b0;

        /* renamed from: c */
        public float f1074c;

        /* renamed from: c0 */
        public boolean f1075c0;

        /* renamed from: d */
        public boolean f1076d;

        /* renamed from: d0 */
        public boolean f1077d0;

        /* renamed from: e */
        public int f1078e;

        /* renamed from: e0 */
        public boolean f1079e0;

        /* renamed from: f */
        public int f1080f;

        /* renamed from: f0 */
        public boolean f1081f0;

        /* renamed from: g */
        public int f1082g;

        /* renamed from: g0 */
        public int f1083g0;

        /* renamed from: h */
        public int f1084h;

        /* renamed from: h0 */
        public int f1085h0;

        /* renamed from: i */
        public int f1086i;

        /* renamed from: i0 */
        public int f1087i0;

        /* renamed from: j */
        public int f1088j;

        /* renamed from: j0 */
        public int f1089j0;

        /* renamed from: k */
        public int f1090k;

        /* renamed from: k0 */
        public int f1091k0;

        /* renamed from: l */
        public int f1092l;

        /* renamed from: l0 */
        public int f1093l0;

        /* renamed from: m */
        public int f1094m;

        /* renamed from: m0 */
        public float f1095m0;

        /* renamed from: n */
        public int f1096n;

        /* renamed from: n0 */
        public int f1097n0;

        /* renamed from: o */
        public int f1098o;

        /* renamed from: o0 */
        public int f1099o0;
        public int p;

        /* renamed from: p0 */
        public float f1100p0;

        /* renamed from: q */
        public int f1101q;

        /* renamed from: q0 */
        public d f1102q0;

        /* renamed from: r */
        public float f1103r;

        /* renamed from: s */
        public int f1104s;

        /* renamed from: t */
        public int f1105t;

        /* renamed from: u */
        public int f1106u;

        /* renamed from: v */
        public int f1107v;

        /* renamed from: w */
        public int f1108w;

        /* renamed from: x */
        public int f1109x;
        public int y;

        /* renamed from: z */
        public int f1110z;

        /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$a$a */
        /* loaded from: classes.dex */
        public static class C0009a {

            /* renamed from: a */
            public static final SparseIntArray f1111a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f1111a = sparseIntArray;
                sparseIntArray.append(98, 64);
                sparseIntArray.append(75, 65);
                sparseIntArray.append(84, 8);
                sparseIntArray.append(85, 9);
                sparseIntArray.append(87, 10);
                sparseIntArray.append(88, 11);
                sparseIntArray.append(94, 12);
                sparseIntArray.append(93, 13);
                sparseIntArray.append(65, 14);
                sparseIntArray.append(64, 15);
                sparseIntArray.append(60, 16);
                sparseIntArray.append(62, 52);
                sparseIntArray.append(61, 53);
                sparseIntArray.append(66, 2);
                sparseIntArray.append(68, 3);
                sparseIntArray.append(67, 4);
                sparseIntArray.append(103, 49);
                sparseIntArray.append(104, 50);
                sparseIntArray.append(72, 5);
                sparseIntArray.append(73, 6);
                sparseIntArray.append(74, 7);
                sparseIntArray.append(55, 67);
                sparseIntArray.append(0, 1);
                sparseIntArray.append(89, 17);
                sparseIntArray.append(90, 18);
                sparseIntArray.append(71, 19);
                sparseIntArray.append(70, 20);
                sparseIntArray.append(108, 21);
                sparseIntArray.append(111, 22);
                sparseIntArray.append(109, 23);
                sparseIntArray.append(106, 24);
                sparseIntArray.append(110, 25);
                sparseIntArray.append(107, 26);
                sparseIntArray.append(105, 55);
                sparseIntArray.append(112, 54);
                sparseIntArray.append(80, 29);
                sparseIntArray.append(95, 30);
                sparseIntArray.append(69, 44);
                sparseIntArray.append(82, 45);
                sparseIntArray.append(97, 46);
                sparseIntArray.append(81, 47);
                sparseIntArray.append(96, 48);
                sparseIntArray.append(58, 27);
                sparseIntArray.append(57, 28);
                sparseIntArray.append(99, 31);
                sparseIntArray.append(76, 32);
                sparseIntArray.append(101, 33);
                sparseIntArray.append(100, 34);
                sparseIntArray.append(102, 35);
                sparseIntArray.append(78, 36);
                sparseIntArray.append(77, 37);
                sparseIntArray.append(79, 38);
                sparseIntArray.append(83, 39);
                sparseIntArray.append(92, 40);
                sparseIntArray.append(86, 41);
                sparseIntArray.append(63, 42);
                sparseIntArray.append(59, 43);
                sparseIntArray.append(91, 51);
                sparseIntArray.append(114, 66);
            }
        }

        public a() {
            super(-2, -2);
            this.f1070a = -1;
            this.f1072b = -1;
            this.f1074c = -1.0f;
            this.f1076d = true;
            this.f1078e = -1;
            this.f1080f = -1;
            this.f1082g = -1;
            this.f1084h = -1;
            this.f1086i = -1;
            this.f1088j = -1;
            this.f1090k = -1;
            this.f1092l = -1;
            this.f1094m = -1;
            this.f1096n = -1;
            this.f1098o = -1;
            this.p = -1;
            this.f1101q = 0;
            this.f1103r = 0.0f;
            this.f1104s = -1;
            this.f1105t = -1;
            this.f1106u = -1;
            this.f1107v = -1;
            this.f1108w = Integer.MIN_VALUE;
            this.f1109x = Integer.MIN_VALUE;
            this.y = Integer.MIN_VALUE;
            this.f1110z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = 0.5f;
            this.F = 0.5f;
            this.G = null;
            this.H = -1.0f;
            this.I = -1.0f;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 1.0f;
            this.S = 1.0f;
            this.T = -1;
            this.U = -1;
            this.V = -1;
            this.W = false;
            this.X = false;
            this.Y = null;
            this.Z = 0;
            this.f1071a0 = true;
            this.f1073b0 = true;
            this.f1075c0 = false;
            this.f1077d0 = false;
            this.f1079e0 = false;
            this.f1081f0 = false;
            this.f1083g0 = -1;
            this.f1085h0 = -1;
            this.f1087i0 = -1;
            this.f1089j0 = -1;
            this.f1091k0 = Integer.MIN_VALUE;
            this.f1093l0 = Integer.MIN_VALUE;
            this.f1095m0 = 0.5f;
            this.f1102q0 = new d();
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            String str;
            this.f1070a = -1;
            this.f1072b = -1;
            this.f1074c = -1.0f;
            this.f1076d = true;
            this.f1078e = -1;
            this.f1080f = -1;
            this.f1082g = -1;
            this.f1084h = -1;
            this.f1086i = -1;
            this.f1088j = -1;
            this.f1090k = -1;
            this.f1092l = -1;
            this.f1094m = -1;
            this.f1096n = -1;
            this.f1098o = -1;
            this.p = -1;
            this.f1101q = 0;
            this.f1103r = 0.0f;
            this.f1104s = -1;
            this.f1105t = -1;
            this.f1106u = -1;
            this.f1107v = -1;
            this.f1108w = Integer.MIN_VALUE;
            this.f1109x = Integer.MIN_VALUE;
            this.y = Integer.MIN_VALUE;
            this.f1110z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = 0.5f;
            this.F = 0.5f;
            this.G = null;
            this.H = -1.0f;
            this.I = -1.0f;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 1.0f;
            this.S = 1.0f;
            this.T = -1;
            this.U = -1;
            this.V = -1;
            this.W = false;
            this.X = false;
            this.Y = null;
            this.Z = 0;
            this.f1071a0 = true;
            this.f1073b0 = true;
            this.f1075c0 = false;
            this.f1077d0 = false;
            this.f1079e0 = false;
            this.f1081f0 = false;
            this.f1083g0 = -1;
            this.f1085h0 = -1;
            this.f1087i0 = -1;
            this.f1089j0 = -1;
            this.f1091k0 = Integer.MIN_VALUE;
            this.f1093l0 = Integer.MIN_VALUE;
            this.f1095m0 = 0.5f;
            this.f1102q0 = new d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f5715t);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                int i11 = C0009a.f1111a.get(index);
                switch (i11) {
                    case 1:
                        this.V = obtainStyledAttributes.getInt(index, this.V);
                        continue;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.p);
                        this.p = resourceId;
                        if (resourceId == -1) {
                            this.p = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 3:
                        this.f1101q = obtainStyledAttributes.getDimensionPixelSize(index, this.f1101q);
                        continue;
                    case 4:
                        float f10 = obtainStyledAttributes.getFloat(index, this.f1103r) % 360.0f;
                        this.f1103r = f10;
                        if (f10 < 0.0f) {
                            this.f1103r = (360.0f - f10) % 360.0f;
                        } else {
                            continue;
                        }
                    case 5:
                        this.f1070a = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1070a);
                        continue;
                    case 6:
                        this.f1072b = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1072b);
                        continue;
                    case 7:
                        this.f1074c = obtainStyledAttributes.getFloat(index, this.f1074c);
                        continue;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.f1078e);
                        this.f1078e = resourceId2;
                        if (resourceId2 == -1) {
                            this.f1078e = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.f1080f);
                        this.f1080f = resourceId3;
                        if (resourceId3 == -1) {
                            this.f1080f = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.f1082g);
                        this.f1082g = resourceId4;
                        if (resourceId4 == -1) {
                            this.f1082g = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.f1084h);
                        this.f1084h = resourceId5;
                        if (resourceId5 == -1) {
                            this.f1084h = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.f1086i);
                        this.f1086i = resourceId6;
                        if (resourceId6 == -1) {
                            this.f1086i = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.f1088j);
                        this.f1088j = resourceId7;
                        if (resourceId7 == -1) {
                            this.f1088j = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.f1090k);
                        this.f1090k = resourceId8;
                        if (resourceId8 == -1) {
                            this.f1090k = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.f1092l);
                        this.f1092l = resourceId9;
                        if (resourceId9 == -1) {
                            this.f1092l = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.f1094m);
                        this.f1094m = resourceId10;
                        if (resourceId10 == -1) {
                            this.f1094m = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.f1104s);
                        this.f1104s = resourceId11;
                        if (resourceId11 == -1) {
                            this.f1104s = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.f1105t);
                        this.f1105t = resourceId12;
                        if (resourceId12 == -1) {
                            this.f1105t = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.f1106u);
                        this.f1106u = resourceId13;
                        if (resourceId13 == -1) {
                            this.f1106u = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.f1107v);
                        this.f1107v = resourceId14;
                        if (resourceId14 == -1) {
                            this.f1107v = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 21:
                        this.f1108w = obtainStyledAttributes.getDimensionPixelSize(index, this.f1108w);
                        continue;
                    case 22:
                        this.f1109x = obtainStyledAttributes.getDimensionPixelSize(index, this.f1109x);
                        continue;
                    case 23:
                        this.y = obtainStyledAttributes.getDimensionPixelSize(index, this.y);
                        continue;
                    case 24:
                        this.f1110z = obtainStyledAttributes.getDimensionPixelSize(index, this.f1110z);
                        continue;
                    case 25:
                        this.A = obtainStyledAttributes.getDimensionPixelSize(index, this.A);
                        continue;
                    case 26:
                        this.B = obtainStyledAttributes.getDimensionPixelSize(index, this.B);
                        continue;
                    case 27:
                        this.W = obtainStyledAttributes.getBoolean(index, this.W);
                        continue;
                    case 28:
                        this.X = obtainStyledAttributes.getBoolean(index, this.X);
                        continue;
                    case 29:
                        this.E = obtainStyledAttributes.getFloat(index, this.E);
                        continue;
                    case 30:
                        this.F = obtainStyledAttributes.getFloat(index, this.F);
                        continue;
                    case 31:
                        int i12 = obtainStyledAttributes.getInt(index, 0);
                        this.L = i12;
                        if (i12 == 1) {
                            str = "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.";
                            break;
                        } else {
                            continue;
                        }
                    case 32:
                        int i13 = obtainStyledAttributes.getInt(index, 0);
                        this.M = i13;
                        if (i13 == 1) {
                            str = "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.";
                            break;
                        } else {
                            continue;
                        }
                    case 33:
                        try {
                            this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                            continue;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.N) == -2) {
                                this.N = -2;
                            }
                        }
                    case 34:
                        try {
                            this.P = obtainStyledAttributes.getDimensionPixelSize(index, this.P);
                            continue;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.P) == -2) {
                                this.P = -2;
                            }
                        }
                    case 35:
                        this.R = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.R));
                        this.L = 2;
                        continue;
                    case 36:
                        try {
                            this.O = obtainStyledAttributes.getDimensionPixelSize(index, this.O);
                            continue;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.O) == -2) {
                                this.O = -2;
                            }
                        }
                    case 37:
                        try {
                            this.Q = obtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                            continue;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.Q) == -2) {
                                this.Q = -2;
                            }
                        }
                    case 38:
                        this.S = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.S));
                        this.M = 2;
                        continue;
                    default:
                        switch (i11) {
                            case 44:
                                androidx.constraintlayout.widget.b.i(this, obtainStyledAttributes.getString(index));
                                continue;
                            case 45:
                                this.H = obtainStyledAttributes.getFloat(index, this.H);
                                continue;
                            case 46:
                                this.I = obtainStyledAttributes.getFloat(index, this.I);
                                continue;
                            case 47:
                                this.J = obtainStyledAttributes.getInt(index, 0);
                                continue;
                            case 48:
                                this.K = obtainStyledAttributes.getInt(index, 0);
                                continue;
                            case 49:
                                this.T = obtainStyledAttributes.getDimensionPixelOffset(index, this.T);
                                continue;
                            case 50:
                                this.U = obtainStyledAttributes.getDimensionPixelOffset(index, this.U);
                                continue;
                            case 51:
                                this.Y = obtainStyledAttributes.getString(index);
                                continue;
                            case ModuleDescriptor.MODULE_VERSION /* 52 */:
                                int resourceId15 = obtainStyledAttributes.getResourceId(index, this.f1096n);
                                this.f1096n = resourceId15;
                                if (resourceId15 == -1) {
                                    this.f1096n = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    continue;
                                }
                            case 53:
                                int resourceId16 = obtainStyledAttributes.getResourceId(index, this.f1098o);
                                this.f1098o = resourceId16;
                                if (resourceId16 == -1) {
                                    this.f1098o = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    continue;
                                }
                            case 54:
                                this.D = obtainStyledAttributes.getDimensionPixelSize(index, this.D);
                                continue;
                            case 55:
                                this.C = obtainStyledAttributes.getDimensionPixelSize(index, this.C);
                                continue;
                            default:
                                switch (i11) {
                                    case 64:
                                        androidx.constraintlayout.widget.b.h(this, obtainStyledAttributes, index, 0);
                                        continue;
                                        continue;
                                        continue;
                                    case 65:
                                        androidx.constraintlayout.widget.b.h(this, obtainStyledAttributes, index, 1);
                                        continue;
                                    case 66:
                                        this.Z = obtainStyledAttributes.getInt(index, this.Z);
                                        continue;
                                    case 67:
                                        this.f1076d = obtainStyledAttributes.getBoolean(index, this.f1076d);
                                        continue;
                                }
                        }
                        break;
                }
                Log.e("ConstraintLayout", str);
            }
            obtainStyledAttributes.recycle();
            a();
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1070a = -1;
            this.f1072b = -1;
            this.f1074c = -1.0f;
            this.f1076d = true;
            this.f1078e = -1;
            this.f1080f = -1;
            this.f1082g = -1;
            this.f1084h = -1;
            this.f1086i = -1;
            this.f1088j = -1;
            this.f1090k = -1;
            this.f1092l = -1;
            this.f1094m = -1;
            this.f1096n = -1;
            this.f1098o = -1;
            this.p = -1;
            this.f1101q = 0;
            this.f1103r = 0.0f;
            this.f1104s = -1;
            this.f1105t = -1;
            this.f1106u = -1;
            this.f1107v = -1;
            this.f1108w = Integer.MIN_VALUE;
            this.f1109x = Integer.MIN_VALUE;
            this.y = Integer.MIN_VALUE;
            this.f1110z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = 0.5f;
            this.F = 0.5f;
            this.G = null;
            this.H = -1.0f;
            this.I = -1.0f;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 1.0f;
            this.S = 1.0f;
            this.T = -1;
            this.U = -1;
            this.V = -1;
            this.W = false;
            this.X = false;
            this.Y = null;
            this.Z = 0;
            this.f1071a0 = true;
            this.f1073b0 = true;
            this.f1075c0 = false;
            this.f1077d0 = false;
            this.f1079e0 = false;
            this.f1081f0 = false;
            this.f1083g0 = -1;
            this.f1085h0 = -1;
            this.f1087i0 = -1;
            this.f1089j0 = -1;
            this.f1091k0 = Integer.MIN_VALUE;
            this.f1093l0 = Integer.MIN_VALUE;
            this.f1095m0 = 0.5f;
            this.f1102q0 = new d();
        }

        public final void a() {
            this.f1077d0 = false;
            this.f1071a0 = true;
            this.f1073b0 = true;
            int i10 = ((ViewGroup.MarginLayoutParams) this).width;
            if (i10 == -2 && this.W) {
                this.f1071a0 = false;
                if (this.L == 0) {
                    this.L = 1;
                }
            }
            int i11 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i11 == -2 && this.X) {
                this.f1073b0 = false;
                if (this.M == 0) {
                    this.M = 1;
                }
            }
            if (i10 == 0 || i10 == -1) {
                this.f1071a0 = false;
                if (i10 == 0 && this.L == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.W = true;
                }
            }
            if (i11 == 0 || i11 == -1) {
                this.f1073b0 = false;
                if (i11 == 0 && this.M == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.X = true;
                }
            }
            if (this.f1074c == -1.0f && this.f1070a == -1 && this.f1072b == -1) {
                return;
            }
            this.f1077d0 = true;
            this.f1071a0 = true;
            this.f1073b0 = true;
            if (!(this.f1102q0 instanceof f)) {
                this.f1102q0 = new f();
            }
            ((f) this.f1102q0).U(this.V);
        }

        /* JADX WARN: Code restructure failed: missing block: B:74:0x00d0, code lost:
            if (r1 > 0) goto L75;
         */
        /* JADX WARN: Code restructure failed: missing block: B:75:0x00d2, code lost:
            ((android.view.ViewGroup.MarginLayoutParams) r10).rightMargin = r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:80:0x00df, code lost:
            if (r1 > 0) goto L75;
         */
        /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0082  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x00e6  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x00f1  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        @android.annotation.TargetApi(17)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void resolveLayoutDirection(int r11) {
            /*
                Method dump skipped, instructions count: 255
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.a.resolveLayoutDirection(int):void");
        }
    }

    /* loaded from: classes.dex */
    public class b implements b.AbstractC0141b {

        /* renamed from: a */
        public ConstraintLayout f1112a;

        /* renamed from: b */
        public int f1113b;

        /* renamed from: c */
        public int f1114c;

        /* renamed from: d */
        public int f1115d;

        /* renamed from: e */
        public int f1116e;

        /* renamed from: f */
        public int f1117f;

        /* renamed from: g */
        public int f1118g;

        public b(ConstraintLayout constraintLayout) {
            ConstraintLayout.this = r1;
            this.f1112a = constraintLayout;
        }

        public final boolean a(int i10, int i11, int i12) {
            if (i10 == i11) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i10);
            View.MeasureSpec.getSize(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            int size = View.MeasureSpec.getSize(i11);
            if (mode2 != 1073741824) {
                return false;
            }
            return (mode == Integer.MIN_VALUE || mode == 0) && i12 == size;
        }

        /* JADX WARN: Removed duplicated region for block: B:119:0x01a3  */
        /* JADX WARN: Removed duplicated region for block: B:122:0x01b6  */
        /* JADX WARN: Removed duplicated region for block: B:123:0x01b8  */
        /* JADX WARN: Removed duplicated region for block: B:125:0x01bb  */
        /* JADX WARN: Removed duplicated region for block: B:126:0x01bd  */
        /* JADX WARN: Removed duplicated region for block: B:148:0x01e8 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:149:0x01e9  */
        @android.annotation.SuppressLint({"WrongCall"})
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void b(u.d r18, v.b.a r19) {
            /*
                Method dump skipped, instructions count: 730
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.b.b(u.d, v.b$a):void");
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        f(attributeSet, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f(attributeSet, i10);
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return max2 > 0 ? max2 : max;
    }

    public static e getSharedValues() {
        if (J == null) {
            J = new e();
        }
        return J;
    }

    /* renamed from: b */
    public final a generateDefaultLayoutParams() {
        return new a();
    }

    public final Object c(Object obj) {
        if (obj instanceof String) {
            String str = (String) obj;
            HashMap<String, Integer> hashMap = this.E;
            if (hashMap != null && hashMap.containsKey(str)) {
                return this.E.get(str);
            }
            return null;
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    public final View d(int i10) {
        return this.f1063s.get(i10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<androidx.constraintlayout.widget.a> arrayList = this.f1064t;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i10 = 0; i10 < size; i10++) {
                Objects.requireNonNull(this.f1064t.get(i10));
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i12 = (int) ((parseInt / 1080.0f) * width);
                        int i13 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f10 = i12;
                        float f11 = i13;
                        float f12 = i12 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f10, f11, f12, f11, paint);
                        float parseInt4 = i13 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f12, f11, f12, parseInt4, paint);
                        canvas.drawLine(f12, parseInt4, f10, parseInt4, paint);
                        canvas.drawLine(f10, parseInt4, f10, f11, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f10, f11, f12, parseInt4, paint);
                        canvas.drawLine(f10, parseInt4, f12, f11, paint);
                    }
                }
            }
        }
    }

    public final d e(View view) {
        if (view == this) {
            return this.f1065u;
        }
        if (view == null) {
            return null;
        }
        if (!(view.getLayoutParams() instanceof a)) {
            view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
            if (!(view.getLayoutParams() instanceof a)) {
                return null;
            }
        }
        return ((a) view.getLayoutParams()).f1102q0;
    }

    public final void f(AttributeSet attributeSet, int i10) {
        u.e eVar = this.f1065u;
        eVar.f18947h0 = this;
        b bVar = this.G;
        eVar.f18976v0 = bVar;
        eVar.f18974t0.f19707f = bVar;
        this.f1063s.put(getId(), this);
        this.B = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, g.f5715t, i10, 0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = obtainStyledAttributes.getIndex(i11);
                if (index == 16) {
                    this.f1066v = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1066v);
                } else if (index == 17) {
                    this.f1067w = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1067w);
                } else if (index == 14) {
                    this.f1068x = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1068x);
                } else if (index == 15) {
                    this.y = obtainStyledAttributes.getDimensionPixelOffset(index, this.y);
                } else if (index == 113) {
                    this.A = obtainStyledAttributes.getInt(index, this.A);
                } else if (index == 56) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            k(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.C = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        androidx.constraintlayout.widget.b bVar2 = new androidx.constraintlayout.widget.b();
                        this.B = bVar2;
                        bVar2.f(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.B = null;
                    }
                    this.D = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f1065u.e0(this.A);
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.f1069z = true;
        super.forceLayout();
    }

    public final boolean g() {
        return ((getContext().getApplicationInfo().flags & 4194304) != 0) && 1 == getLayoutDirection();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    public int getMaxHeight() {
        return this.y;
    }

    public int getMaxWidth() {
        return this.f1068x;
    }

    public int getMinHeight() {
        return this.f1067w;
    }

    public int getMinWidth() {
        return this.f1066v;
    }

    public int getOptimizationLevel() {
        return this.f1065u.E0;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        if (this.f1065u.f18950j == null) {
            int id2 = getId();
            if (id2 != -1) {
                this.f1065u.f18950j = getContext().getResources().getResourceEntryName(id2);
            } else {
                this.f1065u.f18950j = "parent";
            }
        }
        u.e eVar = this.f1065u;
        if (eVar.f18951j0 == null) {
            eVar.f18951j0 = eVar.f18950j;
            StringBuilder c10 = androidx.activity.result.a.c(" setDebugName ");
            c10.append(this.f1065u.f18951j0);
            Log.v("ConstraintLayout", c10.toString());
        }
        Iterator<d> it = this.f1065u.f18988r0.iterator();
        while (it.hasNext()) {
            d next = it.next();
            View view = (View) next.f18947h0;
            if (view != null) {
                if (next.f18950j == null && (id = view.getId()) != -1) {
                    next.f18950j = getContext().getResources().getResourceEntryName(id);
                }
                if (next.f18951j0 == null) {
                    next.f18951j0 = next.f18950j;
                    StringBuilder c11 = androidx.activity.result.a.c(" setDebugName ");
                    c11.append(next.f18951j0);
                    Log.v("ConstraintLayout", c11.toString());
                }
            }
        }
        this.f1065u.o(sb);
        return sb.toString();
    }

    public void k(int i10) {
        this.C = new x.b(getContext(), this, i10);
    }

    public final void l(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
        b bVar = this.G;
        int i14 = bVar.f1116e;
        int resolveSizeAndState = View.resolveSizeAndState(i12 + bVar.f1115d, i10, 0);
        int min = Math.min(this.f1068x, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.y, View.resolveSizeAndState(i13 + i14, i11, 0) & 16777215);
        if (z10) {
            min |= 16777216;
        }
        if (z11) {
            min2 |= 16777216;
        }
        setMeasuredDimension(min, min2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            a aVar = (a) childAt.getLayoutParams();
            d dVar = aVar.f1102q0;
            if ((childAt.getVisibility() != 8 || aVar.f1077d0 || aVar.f1079e0 || isInEditMode) && !aVar.f1081f0) {
                int s10 = dVar.s();
                int t10 = dVar.t();
                int r10 = dVar.r() + s10;
                int k10 = dVar.k() + t10;
                childAt.layout(s10, t10, r10, k10);
                if ((childAt instanceof d) && (content = ((d) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(s10, t10, r10, k10);
                }
            }
        }
        int size = this.f1064t.size();
        if (size > 0) {
            for (int i15 = 0; i15 < size; i15++) {
                Objects.requireNonNull(this.f1064t.get(i15));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:206:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0551  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x05db  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x05e0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x07a6  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x0555 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01e4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01ef  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r29, int r30) {
        /*
            Method dump skipped, instructions count: 1995
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        d e10 = e(view);
        if ((view instanceof Guideline) && !(e10 instanceof f)) {
            a aVar = (a) view.getLayoutParams();
            f fVar = new f();
            aVar.f1102q0 = fVar;
            aVar.f1077d0 = true;
            fVar.U(aVar.V);
        }
        if (view instanceof androidx.constraintlayout.widget.a) {
            androidx.constraintlayout.widget.a aVar2 = (androidx.constraintlayout.widget.a) view;
            aVar2.k();
            ((a) view.getLayoutParams()).f1079e0 = true;
            if (!this.f1064t.contains(aVar2)) {
                this.f1064t.add(aVar2);
            }
        }
        this.f1063s.put(view.getId(), view);
        this.f1069z = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f1063s.remove(view.getId());
        d e10 = e(view);
        this.f1065u.f18988r0.remove(e10);
        e10.D();
        this.f1064t.remove(view);
        this.f1069z = true;
    }

    public final void p(Object obj, Object obj2) {
        if (!(obj instanceof String) || !(obj2 instanceof Integer)) {
            return;
        }
        if (this.E == null) {
            this.E = new HashMap<>();
        }
        String str = (String) obj;
        int indexOf = str.indexOf("/");
        if (indexOf != -1) {
            str = str.substring(indexOf + 1);
        }
        this.E.put(str, Integer.valueOf(((Integer) obj2).intValue()));
    }

    public final void q(d dVar, a aVar, SparseArray<d> sparseArray, int i10, c.a aVar2) {
        View view = this.f1063s.get(i10);
        d dVar2 = sparseArray.get(i10);
        if (dVar2 == null || view == null || !(view.getLayoutParams() instanceof a)) {
            return;
        }
        aVar.f1075c0 = true;
        c.a aVar3 = c.a.BASELINE;
        if (aVar2 == aVar3) {
            a aVar4 = (a) view.getLayoutParams();
            aVar4.f1075c0 = true;
            aVar4.f1102q0.E = true;
        }
        dVar.h(aVar3).a(dVar2.h(aVar2), aVar.D, aVar.C);
        dVar.E = true;
        dVar.h(c.a.TOP).h();
        dVar.h(c.a.BOTTOM).h();
    }

    /* JADX WARN: Removed duplicated region for block: B:148:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean r() {
        /*
            Method dump skipped, instructions count: 1371
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.r():boolean");
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f1069z = true;
        super.requestLayout();
    }

    public void setConstraintSet(androidx.constraintlayout.widget.b bVar) {
        this.B = bVar;
    }

    @Override // android.view.View
    public void setId(int i10) {
        this.f1063s.remove(getId());
        super.setId(i10);
        this.f1063s.put(getId(), this);
    }

    public void setMaxHeight(int i10) {
        if (i10 == this.y) {
            return;
        }
        this.y = i10;
        requestLayout();
    }

    public void setMaxWidth(int i10) {
        if (i10 == this.f1068x) {
            return;
        }
        this.f1068x = i10;
        requestLayout();
    }

    public void setMinHeight(int i10) {
        if (i10 == this.f1067w) {
            return;
        }
        this.f1067w = i10;
        requestLayout();
    }

    public void setMinWidth(int i10) {
        if (i10 == this.f1066v) {
            return;
        }
        this.f1066v = i10;
        requestLayout();
    }

    public void setOnConstraintsChanged(x.c cVar) {
    }

    public void setOptimizationLevel(int i10) {
        this.A = i10;
        this.f1065u.e0(i10);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
