package e0;

import android.graphics.Path;
import android.util.Log;

/* loaded from: classes.dex */
public final class e {

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public char f4316a;

        /* renamed from: b */
        public float[] f4317b;

        public a(char c10, float[] fArr) {
            this.f4316a = c10;
            this.f4317b = fArr;
        }

        public a(a aVar) {
            this.f4316a = aVar.f4316a;
            float[] fArr = aVar.f4317b;
            this.f4317b = e.b(fArr, fArr.length);
        }

        public static void a(Path path, float f10, float f11, float f12, float f13, float f14, float f15, float f16, boolean z10, boolean z11) {
            double d5;
            double d10;
            double radians = Math.toRadians(f16);
            double cos = Math.cos(radians);
            double sin = Math.sin(radians);
            double d11 = f10;
            double d12 = f11;
            double d13 = (d12 * sin) + (d11 * cos);
            double d14 = d11;
            double d15 = f14;
            double d16 = d13 / d15;
            double d17 = f15;
            double d18 = ((d12 * cos) + ((-f10) * sin)) / d17;
            double d19 = d12;
            double d20 = f13;
            double d21 = ((d20 * sin) + (f12 * cos)) / d15;
            double d22 = ((d20 * cos) + ((-f12) * sin)) / d17;
            double d23 = d16 - d21;
            double d24 = d18 - d22;
            double d25 = (d16 + d21) / 2.0d;
            double d26 = (d18 + d22) / 2.0d;
            double d27 = (d24 * d24) + (d23 * d23);
            if (d27 == 0.0d) {
                Log.w("PathParser", " Points are coincident");
                return;
            }
            double d28 = (1.0d / d27) - 0.25d;
            if (d28 < 0.0d) {
                Log.w("PathParser", "Points are too far apart " + d27);
                float sqrt = (float) (Math.sqrt(d27) / 1.99999d);
                a(path, f10, f11, f12, f13, f14 * sqrt, f15 * sqrt, f16, z10, z11);
                return;
            }
            double sqrt2 = Math.sqrt(d28);
            double d29 = d23 * sqrt2;
            double d30 = sqrt2 * d24;
            if (z10 == z11) {
                d10 = d25 - d30;
                d5 = d26 + d29;
            } else {
                d10 = d25 + d30;
                d5 = d26 - d29;
            }
            double atan2 = Math.atan2(d18 - d5, d16 - d10);
            double atan22 = Math.atan2(d22 - d5, d21 - d10) - atan2;
            int i10 = (atan22 > 0.0d ? 1 : (atan22 == 0.0d ? 0 : -1));
            if (z11 != (i10 >= 0)) {
                atan22 = i10 > 0 ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
            }
            double d31 = d10 * d15;
            double d32 = d5 * d17;
            double d33 = (d31 * cos) - (d32 * sin);
            double d34 = (d32 * cos) + (d31 * sin);
            int ceil = (int) Math.ceil(Math.abs((atan22 * 4.0d) / 3.141592653589793d));
            double cos2 = Math.cos(radians);
            double sin2 = Math.sin(radians);
            double cos3 = Math.cos(atan2);
            double sin3 = Math.sin(atan2);
            double d35 = -d15;
            double d36 = d35 * cos2;
            double d37 = d17 * sin2;
            double d38 = (d36 * sin3) - (d37 * cos3);
            double d39 = d35 * sin2;
            double d40 = d17 * cos2;
            double d41 = (cos3 * d40) + (sin3 * d39);
            double d42 = d40;
            double d43 = atan22 / ceil;
            int i11 = 0;
            while (i11 < ceil) {
                double d44 = atan2 + d43;
                double sin4 = Math.sin(d44);
                double cos4 = Math.cos(d44);
                double d45 = d43;
                double d46 = (((d15 * cos2) * cos4) + d33) - (d37 * sin4);
                double d47 = d42;
                double d48 = d33;
                double d49 = (d47 * sin4) + (d15 * sin2 * cos4) + d34;
                double d50 = (d36 * sin4) - (d37 * cos4);
                double d51 = (cos4 * d47) + (sin4 * d39);
                double d52 = d44 - atan2;
                double tan = Math.tan(d52 / 2.0d);
                double sqrt3 = ((Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d) * Math.sin(d52)) / 3.0d;
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) ((d38 * sqrt3) + d14), (float) ((d41 * sqrt3) + d19), (float) (d46 - (sqrt3 * d50)), (float) (d49 - (sqrt3 * d51)), (float) d46, (float) d49);
                i11++;
                atan2 = d44;
                d39 = d39;
                cos2 = cos2;
                ceil = ceil;
                d41 = d51;
                d15 = d15;
                d38 = d50;
                d14 = d46;
                d19 = d49;
                d33 = d48;
                d43 = d45;
                d42 = d47;
            }
        }

        public static void b(a[] aVarArr, Path path) {
            int i10;
            int i11;
            int i12;
            float[] fArr;
            char c10;
            float f10;
            float f11;
            float f12;
            float f13;
            float f14;
            float f15;
            float f16;
            float f17;
            float f18;
            float f19;
            float f20;
            float f21;
            float f22;
            float f23;
            float f24;
            float f25;
            float f26;
            float f27;
            float f28;
            a[] aVarArr2 = aVarArr;
            int i13 = 6;
            float[] fArr2 = new float[6];
            char c11 = 'm';
            int i14 = 0;
            char c12 = 'm';
            int i15 = 0;
            while (i15 < aVarArr2.length) {
                char c13 = aVarArr2[i15].f4316a;
                float[] fArr3 = aVarArr2[i15].f4317b;
                float f29 = fArr2[i14];
                float f30 = fArr2[1];
                float f31 = fArr2[2];
                float f32 = fArr2[3];
                float f33 = fArr2[4];
                float f34 = fArr2[5];
                switch (c13) {
                    case 'A':
                    case 'a':
                        i10 = 7;
                        break;
                    case 'C':
                    case 'c':
                        i10 = i13;
                        break;
                    case 'H':
                    case 'V':
                    case 'h':
                    case 'v':
                        i10 = 1;
                        break;
                    case 'Q':
                    case 'S':
                    case 'q':
                    case 's':
                        i10 = 4;
                        break;
                    case 'Z':
                    case 'z':
                        path.close();
                        path.moveTo(f33, f34);
                        f29 = f33;
                        f31 = f29;
                        f30 = f34;
                        f32 = f30;
                    default:
                        i10 = 2;
                        break;
                }
                float f35 = f33;
                float f36 = f34;
                float f37 = f29;
                float f38 = f30;
                int i16 = i14;
                while (i16 < fArr3.length) {
                    if (c13 != 'A') {
                        if (c13 != 'C') {
                            if (c13 == 'H') {
                                i11 = i16;
                                fArr = fArr3;
                                c10 = c13;
                                i12 = i15;
                                int i17 = i11 + 0;
                                path.lineTo(fArr[i17], f38);
                                f37 = fArr[i17];
                            } else if (c13 == 'Q') {
                                i11 = i16;
                                fArr = fArr3;
                                c10 = c13;
                                i12 = i15;
                                int i18 = i11 + 0;
                                int i19 = i11 + 1;
                                int i20 = i11 + 2;
                                int i21 = i11 + 3;
                                path.quadTo(fArr[i18], fArr[i19], fArr[i20], fArr[i21]);
                                f11 = fArr[i18];
                                f10 = fArr[i19];
                                f37 = fArr[i20];
                                f38 = fArr[i21];
                            } else if (c13 == 'V') {
                                i11 = i16;
                                fArr = fArr3;
                                c10 = c13;
                                i12 = i15;
                                int i22 = i11 + 0;
                                path.lineTo(f37, fArr[i22]);
                                f38 = fArr[i22];
                            } else if (c13 != 'a') {
                                if (c13 != 'c') {
                                    if (c13 == 'h') {
                                        i11 = i16;
                                        int i23 = i11 + 0;
                                        path.rLineTo(fArr3[i23], 0.0f);
                                        f37 += fArr3[i23];
                                    } else if (c13 != 'q') {
                                        if (c13 == 'v') {
                                            i11 = i16;
                                            f19 = f38;
                                            int i24 = i11 + 0;
                                            path.rLineTo(0.0f, fArr3[i24]);
                                            f20 = fArr3[i24];
                                        } else if (c13 == 'L') {
                                            i11 = i16;
                                            int i25 = i11 + 0;
                                            int i26 = i11 + 1;
                                            path.lineTo(fArr3[i25], fArr3[i26]);
                                            f37 = fArr3[i25];
                                            f38 = fArr3[i26];
                                        } else if (c13 == 'M') {
                                            i11 = i16;
                                            int i27 = i11 + 0;
                                            float f39 = fArr3[i27];
                                            int i28 = i11 + 1;
                                            float f40 = fArr3[i28];
                                            if (i11 > 0) {
                                                path.lineTo(fArr3[i27], fArr3[i28]);
                                                f37 = f39;
                                                f38 = f40;
                                            } else {
                                                path.moveTo(fArr3[i27], fArr3[i28]);
                                                f35 = f39;
                                                f36 = f40;
                                                f37 = f35;
                                                f38 = f36;
                                            }
                                        } else if (c13 == 'S') {
                                            i11 = i16;
                                            float f41 = f38;
                                            float f42 = f37;
                                            if (c12 == 'c' || c12 == 's' || c12 == 'C' || c12 == 'S') {
                                                f21 = (f41 * 2.0f) - f32;
                                                f22 = (f42 * 2.0f) - f31;
                                            } else {
                                                f22 = f42;
                                                f21 = f41;
                                            }
                                            int i29 = i11 + 0;
                                            int i30 = i11 + 1;
                                            int i31 = i11 + 2;
                                            int i32 = i11 + 3;
                                            path.cubicTo(f22, f21, fArr3[i29], fArr3[i30], fArr3[i31], fArr3[i32]);
                                            float f43 = fArr3[i29];
                                            float f44 = fArr3[i30];
                                            f13 = fArr3[i31];
                                            f12 = fArr3[i32];
                                            f31 = f43;
                                            f32 = f44;
                                            f37 = f13;
                                            f38 = f12;
                                        } else if (c13 == 'T') {
                                            i11 = i16;
                                            float f45 = f38;
                                            float f46 = f37;
                                            if (c12 == 'q' || c12 == 't' || c12 == 'Q' || c12 == 'T') {
                                                f23 = (f46 * 2.0f) - f31;
                                                f24 = (f45 * 2.0f) - f32;
                                            } else {
                                                f23 = f46;
                                                f24 = f45;
                                            }
                                            int i33 = i11 + 0;
                                            int i34 = i11 + 1;
                                            path.quadTo(f23, f24, fArr3[i33], fArr3[i34]);
                                            f32 = f24;
                                            f31 = f23;
                                            fArr = fArr3;
                                            c10 = c13;
                                            i12 = i15;
                                            f37 = fArr3[i33];
                                            f38 = fArr3[i34];
                                        } else if (c13 == 'l') {
                                            i11 = i16;
                                            f19 = f38;
                                            int i35 = i11 + 0;
                                            int i36 = i11 + 1;
                                            path.rLineTo(fArr3[i35], fArr3[i36]);
                                            f37 += fArr3[i35];
                                            f20 = fArr3[i36];
                                        } else if (c13 == c11) {
                                            i11 = i16;
                                            int i37 = i11 + 0;
                                            f37 += fArr3[i37];
                                            int i38 = i11 + 1;
                                            f38 += fArr3[i38];
                                            if (i11 > 0) {
                                                path.rLineTo(fArr3[i37], fArr3[i38]);
                                            } else {
                                                path.rMoveTo(fArr3[i37], fArr3[i38]);
                                                f36 = f38;
                                                f35 = f37;
                                                f37 = f35;
                                                f38 = f36;
                                            }
                                        } else if (c13 != 's') {
                                            if (c13 == 't') {
                                                if (c12 == 'q' || c12 == 't' || c12 == 'Q' || c12 == 'T') {
                                                    f27 = f37 - f31;
                                                    f28 = f38 - f32;
                                                } else {
                                                    f28 = 0.0f;
                                                    f27 = 0.0f;
                                                }
                                                int i39 = i16 + 0;
                                                int i40 = i16 + 1;
                                                path.rQuadTo(f27, f28, fArr3[i39], fArr3[i40]);
                                                float f47 = f27 + f37;
                                                float f48 = f28 + f38;
                                                f37 += fArr3[i39];
                                                f38 += fArr3[i40];
                                                f32 = f48;
                                                f31 = f47;
                                            }
                                            i11 = i16;
                                        } else {
                                            if (c12 == 'c' || c12 == 's' || c12 == 'C' || c12 == 'S') {
                                                f25 = f38 - f32;
                                                f26 = f37 - f31;
                                            } else {
                                                f26 = 0.0f;
                                                f25 = 0.0f;
                                            }
                                            int i41 = i16 + 0;
                                            int i42 = i16 + 1;
                                            int i43 = i16 + 2;
                                            int i44 = i16 + 3;
                                            i11 = i16;
                                            f14 = f38;
                                            float f49 = f37;
                                            path.rCubicTo(f26, f25, fArr3[i41], fArr3[i42], fArr3[i43], fArr3[i44]);
                                            f17 = fArr3[i41] + f49;
                                            f16 = fArr3[i42] + f14;
                                            f15 = f49 + fArr3[i43];
                                            f18 = fArr3[i44];
                                        }
                                        f38 = f19 + f20;
                                    } else {
                                        i11 = i16;
                                        f14 = f38;
                                        float f50 = f37;
                                        int i45 = i11 + 0;
                                        int i46 = i11 + 1;
                                        int i47 = i11 + 2;
                                        int i48 = i11 + 3;
                                        path.rQuadTo(fArr3[i45], fArr3[i46], fArr3[i47], fArr3[i48]);
                                        f17 = fArr3[i45] + f50;
                                        f16 = fArr3[i46] + f14;
                                        float f51 = f50 + fArr3[i47];
                                        float f52 = fArr3[i48];
                                        f15 = f51;
                                        f18 = f52;
                                    }
                                    fArr = fArr3;
                                    c10 = c13;
                                    i12 = i15;
                                } else {
                                    i11 = i16;
                                    f14 = f38;
                                    float f53 = f37;
                                    int i49 = i11 + 2;
                                    int i50 = i11 + 3;
                                    int i51 = i11 + 4;
                                    int i52 = i11 + 5;
                                    path.rCubicTo(fArr3[i11 + 0], fArr3[i11 + 1], fArr3[i49], fArr3[i50], fArr3[i51], fArr3[i52]);
                                    f17 = fArr3[i49] + f53;
                                    f16 = fArr3[i50] + f14;
                                    f15 = f53 + fArr3[i51];
                                    f18 = fArr3[i52];
                                }
                                f12 = f14 + f18;
                                f31 = f17;
                                f32 = f16;
                                f13 = f15;
                                f37 = f13;
                                f38 = f12;
                                fArr = fArr3;
                                c10 = c13;
                                i12 = i15;
                            } else {
                                i11 = i16;
                                float f54 = f38;
                                float f55 = f37;
                                int i53 = i11 + 5;
                                int i54 = i11 + 6;
                                fArr = fArr3;
                                c10 = c13;
                                i12 = i15;
                                a(path, f55, f54, fArr3[i53] + f55, fArr3[i54] + f54, fArr3[i11 + 0], fArr3[i11 + 1], fArr3[i11 + 2], fArr3[i11 + 3] != 0.0f, fArr3[i11 + 4] != 0.0f);
                                f37 = f55 + fArr[i53];
                                f38 = f54 + fArr[i54];
                            }
                            i16 = i11 + i10;
                            c12 = c10;
                            c13 = c12;
                            fArr3 = fArr;
                            i15 = i12;
                            c11 = 'm';
                            i14 = 0;
                        } else {
                            i11 = i16;
                            fArr = fArr3;
                            c10 = c13;
                            i12 = i15;
                            int i55 = i11 + 2;
                            int i56 = i11 + 3;
                            int i57 = i11 + 4;
                            int i58 = i11 + 5;
                            path.cubicTo(fArr[i11 + 0], fArr[i11 + 1], fArr[i55], fArr[i56], fArr[i57], fArr[i58]);
                            float f56 = fArr[i57];
                            float f57 = fArr[i58];
                            f11 = fArr[i55];
                            f37 = f56;
                            f38 = f57;
                            f10 = fArr[i56];
                        }
                        f31 = f11;
                        f32 = f10;
                        i16 = i11 + i10;
                        c12 = c10;
                        c13 = c12;
                        fArr3 = fArr;
                        i15 = i12;
                        c11 = 'm';
                        i14 = 0;
                    } else {
                        i11 = i16;
                        fArr = fArr3;
                        c10 = c13;
                        i12 = i15;
                        int i59 = i11 + 5;
                        int i60 = i11 + 6;
                        a(path, f37, f38, fArr[i59], fArr[i60], fArr[i11 + 0], fArr[i11 + 1], fArr[i11 + 2], fArr[i11 + 3] != 0.0f, fArr[i11 + 4] != 0.0f);
                        f37 = fArr[i59];
                        f38 = fArr[i60];
                    }
                    f32 = f38;
                    f31 = f37;
                    i16 = i11 + i10;
                    c12 = c10;
                    c13 = c12;
                    fArr3 = fArr;
                    i15 = i12;
                    c11 = 'm';
                    i14 = 0;
                }
                int i61 = i15;
                fArr2[i14] = f37;
                fArr2[1] = f38;
                fArr2[2] = f31;
                fArr2[3] = f32;
                fArr2[4] = f35;
                fArr2[5] = f36;
                i15 = i61 + 1;
                i13 = 6;
                c11 = 'm';
                c12 = aVarArr[i61].f4316a;
                aVarArr2 = aVarArr;
            }
        }
    }

    public static boolean a(a[] aVarArr, a[] aVarArr2) {
        if (aVarArr == null || aVarArr2 == null || aVarArr.length != aVarArr2.length) {
            return false;
        }
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            if (aVarArr[i10].f4316a != aVarArr2[i10].f4316a || aVarArr[i10].f4317b.length != aVarArr2[i10].f4317b.length) {
                return false;
            }
        }
        return true;
    }

    public static float[] b(float[] fArr, int i10) {
        if (i10 >= 0) {
            int length = fArr.length;
            if (length < 0) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i11 = i10 - 0;
            int min = Math.min(i11, length - 0);
            float[] fArr2 = new float[i11];
            System.arraycopy(fArr, 0, fArr2, 0, min);
            return fArr2;
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x008a, code lost:
        if (r13 == 0) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0097 A[Catch: NumberFormatException -> 0x00bc, LOOP:3: B:26:0x006c->B:46:0x0097, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00bc, blocks: (B:23:0x0059, B:26:0x006c, B:28:0x0072, B:33:0x0080, B:46:0x0097, B:48:0x009c, B:51:0x00ac, B:53:0x00b1), top: B:68:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009c A[Catch: NumberFormatException -> 0x00bc, TryCatch #0 {NumberFormatException -> 0x00bc, blocks: (B:23:0x0059, B:26:0x006c, B:28:0x0072, B:33:0x0080, B:46:0x0097, B:48:0x009c, B:51:0x00ac, B:53:0x00b1), top: B:68:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ac A[Catch: NumberFormatException -> 0x00bc, TryCatch #0 {NumberFormatException -> 0x00bc, blocks: (B:23:0x0059, B:26:0x006c, B:28:0x0072, B:33:0x0080, B:46:0x0097, B:48:0x009c, B:51:0x00ac, B:53:0x00b1), top: B:68:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0096 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static e0.e.a[] c(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.e.c(java.lang.String):e0.e$a[]");
    }

    public static Path d(String str) {
        Path path = new Path();
        a[] c10 = c(str);
        if (c10 != null) {
            try {
                a.b(c10, path);
                return path;
            } catch (RuntimeException e10) {
                throw new RuntimeException(d7.a.c("Error in parsing ", str), e10);
            }
        }
        return null;
    }

    public static a[] e(a[] aVarArr) {
        if (aVarArr == null) {
            return null;
        }
        a[] aVarArr2 = new a[aVarArr.length];
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            aVarArr2[i10] = new a(aVarArr[i10]);
        }
        return aVarArr2;
    }
}
