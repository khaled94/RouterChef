package androidx.work;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import t1.h;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: b */
    public static final String f2304b = h.e("Data");

    /* renamed from: c */
    public static final b f2305c;

    /* renamed from: a */
    public Map<String, Object> f2306a;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public Map<String, Object> f2307a = new HashMap();

        public final b a() {
            b bVar = new b(this.f2307a);
            b.c(bVar);
            return bVar;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
        /* JADX WARN: Type inference failed for: r2v2, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
        /* JADX WARN: Type inference failed for: r2v3, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
        /* JADX WARN: Type inference failed for: r2v4, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
        /* JADX WARN: Type inference failed for: r2v5, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
        /* JADX WARN: Type inference failed for: r2v6, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
        /* JADX WARN: Type inference failed for: r2v7, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
        /* JADX WARN: Type inference failed for: r2v8, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
        public final a b(Map<String, Object> map) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value == null) {
                    this.f2307a.put(key, null);
                } else {
                    Class<?> cls = value.getClass();
                    if (cls == Boolean.class || cls == Byte.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class || cls == Boolean[].class || cls == Byte[].class || cls == Integer[].class || cls == Long[].class || cls == Float[].class || cls == Double[].class || cls == String[].class) {
                        this.f2307a.put(key, value);
                    } else {
                        int i10 = 0;
                        if (cls == boolean[].class) {
                            ?? r22 = this.f2307a;
                            boolean[] zArr = (boolean[]) value;
                            String str = b.f2304b;
                            Boolean[] boolArr = new Boolean[zArr.length];
                            while (i10 < zArr.length) {
                                boolArr[i10] = Boolean.valueOf(zArr[i10]);
                                i10++;
                            }
                            r22.put(key, boolArr);
                        } else if (cls == byte[].class) {
                            ?? r23 = this.f2307a;
                            byte[] bArr = (byte[]) value;
                            String str2 = b.f2304b;
                            Byte[] bArr2 = new Byte[bArr.length];
                            while (i10 < bArr.length) {
                                bArr2[i10] = Byte.valueOf(bArr[i10]);
                                i10++;
                            }
                            r23.put(key, bArr2);
                        } else if (cls == int[].class) {
                            ?? r24 = this.f2307a;
                            int[] iArr = (int[]) value;
                            String str3 = b.f2304b;
                            Integer[] numArr = new Integer[iArr.length];
                            while (i10 < iArr.length) {
                                numArr[i10] = Integer.valueOf(iArr[i10]);
                                i10++;
                            }
                            r24.put(key, numArr);
                        } else if (cls == long[].class) {
                            ?? r25 = this.f2307a;
                            long[] jArr = (long[]) value;
                            String str4 = b.f2304b;
                            Long[] lArr = new Long[jArr.length];
                            while (i10 < jArr.length) {
                                lArr[i10] = Long.valueOf(jArr[i10]);
                                i10++;
                            }
                            r25.put(key, lArr);
                        } else if (cls == float[].class) {
                            ?? r26 = this.f2307a;
                            float[] fArr = (float[]) value;
                            String str5 = b.f2304b;
                            Float[] fArr2 = new Float[fArr.length];
                            while (i10 < fArr.length) {
                                fArr2[i10] = Float.valueOf(fArr[i10]);
                                i10++;
                            }
                            r26.put(key, fArr2);
                        } else if (cls != double[].class) {
                            throw new IllegalArgumentException(String.format("Key %s has invalid type %s", key, cls));
                        } else {
                            ?? r27 = this.f2307a;
                            double[] dArr = (double[]) value;
                            String str6 = b.f2304b;
                            Double[] dArr2 = new Double[dArr.length];
                            while (i10 < dArr.length) {
                                dArr2[i10] = Double.valueOf(dArr[i10]);
                                i10++;
                            }
                            r27.put(key, dArr2);
                        }
                    }
                }
            }
            return this;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
        public final a c(String str) {
            this.f2307a.put("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str);
            return this;
        }
    }

    static {
        b bVar = new b(new HashMap());
        c(bVar);
        f2305c = bVar;
    }

    public b() {
    }

    public b(b bVar) {
        this.f2306a = new HashMap(bVar.f2306a);
    }

    public b(Map<String, ?> map) {
        this.f2306a = new HashMap(map);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x004e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x006b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x005d -> B:29:0x0062). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.work.b a(byte[] r7) {
        /*
            java.lang.String r0 = "Error in Data#fromByteArray: "
            int r1 = r7.length
            r2 = 10240(0x2800, float:1.4349E-41)
            if (r1 > r2) goto L80
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream
            r2.<init>(r7)
            r7 = 0
            java.io.ObjectInputStream r3 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L3d java.lang.ClassNotFoundException -> L41 java.io.IOException -> L43
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L3d java.lang.ClassNotFoundException -> L41 java.io.IOException -> L43
            int r7 = r3.readInt()     // Catch: java.lang.ClassNotFoundException -> L39 java.io.IOException -> L3b java.lang.Throwable -> L68
        L1b:
            if (r7 <= 0) goto L2b
            java.lang.String r4 = r3.readUTF()     // Catch: java.lang.ClassNotFoundException -> L39 java.io.IOException -> L3b java.lang.Throwable -> L68
            java.lang.Object r5 = r3.readObject()     // Catch: java.lang.ClassNotFoundException -> L39 java.io.IOException -> L3b java.lang.Throwable -> L68
            r1.put(r4, r5)     // Catch: java.lang.ClassNotFoundException -> L39 java.io.IOException -> L3b java.lang.Throwable -> L68
            int r7 = r7 + (-1)
            goto L1b
        L2b:
            r3.close()     // Catch: java.io.IOException -> L2f
            goto L35
        L2f:
            r7 = move-exception
            java.lang.String r3 = androidx.work.b.f2304b
            android.util.Log.e(r3, r0, r7)
        L35:
            r2.close()     // Catch: java.io.IOException -> L5c
            goto L62
        L39:
            r7 = move-exception
            goto L47
        L3b:
            r7 = move-exception
            goto L47
        L3d:
            r1 = move-exception
            r3 = r7
            r7 = r1
            goto L69
        L41:
            r3 = move-exception
            goto L44
        L43:
            r3 = move-exception
        L44:
            r6 = r3
            r3 = r7
            r7 = r6
        L47:
            java.lang.String r4 = androidx.work.b.f2304b     // Catch: java.lang.Throwable -> L68
            android.util.Log.e(r4, r0, r7)     // Catch: java.lang.Throwable -> L68
            if (r3 == 0) goto L58
            r3.close()     // Catch: java.io.IOException -> L52
            goto L58
        L52:
            r7 = move-exception
            java.lang.String r3 = androidx.work.b.f2304b
            android.util.Log.e(r3, r0, r7)
        L58:
            r2.close()     // Catch: java.io.IOException -> L5c
            goto L62
        L5c:
            r7 = move-exception
            java.lang.String r2 = androidx.work.b.f2304b
            android.util.Log.e(r2, r0, r7)
        L62:
            androidx.work.b r7 = new androidx.work.b
            r7.<init>(r1)
            return r7
        L68:
            r7 = move-exception
        L69:
            if (r3 == 0) goto L75
            r3.close()     // Catch: java.io.IOException -> L6f
            goto L75
        L6f:
            r1 = move-exception
            java.lang.String r3 = androidx.work.b.f2304b
            android.util.Log.e(r3, r0, r1)
        L75:
            r2.close()     // Catch: java.io.IOException -> L79
            goto L7f
        L79:
            r1 = move-exception
            java.lang.String r2 = androidx.work.b.f2304b
            android.util.Log.e(r2, r0, r1)
        L7f:
            throw r7
        L80:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Data cannot occupy more than 10240 bytes when serialized"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.b.a(byte[]):androidx.work.b");
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    public static byte[] c(b bVar) {
        Throwable th;
        ObjectOutputStream objectOutputStream;
        IOException e10;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream2 = null;
        try {
            try {
                objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            } catch (Throwable th2) {
                th = th2;
                objectOutputStream = null;
            }
        } catch (IOException e11) {
            e10 = e11;
        }
        try {
            objectOutputStream.writeInt(bVar.f2306a.size());
            for (Map.Entry entry : bVar.f2306a.entrySet()) {
                objectOutputStream.writeUTF((String) entry.getKey());
                objectOutputStream.writeObject(entry.getValue());
            }
            try {
                objectOutputStream.close();
            } catch (IOException e12) {
                Log.e(f2304b, "Error in Data#toByteArray: ", e12);
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException e13) {
                Log.e(f2304b, "Error in Data#toByteArray: ", e13);
            }
            if (byteArrayOutputStream.size() > 10240) {
                throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
            }
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e14) {
            e10 = e14;
            objectOutputStream2 = objectOutputStream;
            Log.e(f2304b, "Error in Data#toByteArray: ", e10);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (IOException e15) {
                    Log.e(f2304b, "Error in Data#toByteArray: ", e15);
                }
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException e16) {
                Log.e(f2304b, "Error in Data#toByteArray: ", e16);
            }
            return byteArray;
        } catch (Throwable th3) {
            th = th3;
            if (objectOutputStream != null) {
                try {
                    objectOutputStream.close();
                } catch (IOException e17) {
                    Log.e(f2304b, "Error in Data#toByteArray: ", e17);
                }
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException e18) {
                Log.e(f2304b, "Error in Data#toByteArray: ", e18);
            }
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    public final String b(String str) {
        Object obj = this.f2306a.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    public final boolean equals(Object obj) {
        boolean z10;
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        Set<String> keySet = this.f2306a.keySet();
        if (!keySet.equals(bVar.f2306a.keySet())) {
            return false;
        }
        for (String str : keySet) {
            Object obj2 = this.f2306a.get(str);
            Object obj3 = bVar.f2306a.get(str);
            if (obj2 == null || obj3 == null) {
                if (obj2 == obj3) {
                    z10 = true;
                    continue;
                } else {
                    z10 = false;
                    continue;
                }
            } else if (!(obj2 instanceof Object[]) || !(obj3 instanceof Object[])) {
                z10 = obj2.equals(obj3);
                continue;
            } else {
                z10 = Arrays.deepEquals((Object[]) obj2, (Object[]) obj3);
                continue;
            }
            if (!z10) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f2306a.hashCode() * 31;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    public final String toString() {
        StringBuilder sb = new StringBuilder("Data {");
        if (!this.f2306a.isEmpty()) {
            for (String str : this.f2306a.keySet()) {
                sb.append(str);
                sb.append(" : ");
                Object obj = this.f2306a.get(str);
                if (obj instanceof Object[]) {
                    sb.append(Arrays.toString((Object[]) obj));
                } else {
                    sb.append(obj);
                }
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }
}
