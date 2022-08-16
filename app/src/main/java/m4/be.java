package m4;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.util.Log;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

@SuppressLint({"InlinedApi"})
@TargetApi(16)
/* loaded from: classes.dex */
public final class be {

    /* renamed from: c */
    public static final SparseIntArray f6469c;

    /* renamed from: d */
    public static final SparseIntArray f6470d;

    /* renamed from: e */
    public static final Map<String, Integer> f6471e;

    /* renamed from: a */
    public static final Pattern f6467a = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: b */
    public static final HashMap<wd, List<sd>> f6468b = new HashMap<>();

    /* renamed from: f */
    public static int f6472f = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6469c = sparseIntArray;
        sparseIntArray.put(66, 1);
        sparseIntArray.put(77, 2);
        sparseIntArray.put(88, 4);
        sparseIntArray.put(100, 8);
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f6470d = sparseIntArray2;
        sparseIntArray2.put(10, 1);
        sparseIntArray2.put(11, 4);
        sparseIntArray2.put(12, 8);
        sparseIntArray2.put(13, 16);
        sparseIntArray2.put(20, 32);
        sparseIntArray2.put(21, 64);
        sparseIntArray2.put(22, 128);
        sparseIntArray2.put(30, 256);
        sparseIntArray2.put(31, 512);
        sparseIntArray2.put(32, 1024);
        sparseIntArray2.put(40, 2048);
        sparseIntArray2.put(41, 4096);
        sparseIntArray2.put(42, 8192);
        sparseIntArray2.put(50, 16384);
        sparseIntArray2.put(51, 32768);
        sparseIntArray2.put(52, 65536);
        HashMap hashMap = new HashMap();
        f6471e = hashMap;
        hashMap.put("L30", 1);
        hashMap.put("L60", 4);
        hashMap.put("L63", 16);
        hashMap.put("L90", 64);
        hashMap.put("L93", 256);
        hashMap.put("L120", 1024);
        hashMap.put("L123", 4096);
        hashMap.put("L150", 16384);
        hashMap.put("L153", 65536);
        hashMap.put("L156", 262144);
        hashMap.put("L180", 1048576);
        hashMap.put("L183", 4194304);
        hashMap.put("L186", 16777216);
        hashMap.put("H30", 2);
        hashMap.put("H60", 8);
        hashMap.put("H63", 32);
        hashMap.put("H90", 128);
        hashMap.put("H93", 512);
        hashMap.put("H120", 2048);
        hashMap.put("H123", 8192);
        hashMap.put("H150", 32768);
        hashMap.put("H153", 131072);
        hashMap.put("H156", 524288);
        hashMap.put("H180", 2097152);
        hashMap.put("H183", 8388608);
        hashMap.put("H186", 33554432);
    }

    public static sd a(String str, boolean z10) {
        List<sd> list;
        synchronized (be.class) {
            wd wdVar = new wd(str, z10);
            HashMap<wd, List<sd>> hashMap = f6468b;
            list = hashMap.get(wdVar);
            if (list == null) {
                int i10 = wg.f14958a;
                List<sd> b10 = b(wdVar, i10 >= 21 ? new ae(z10) : new zd());
                if (z10 && ((ArrayList) b10).isEmpty() && i10 >= 21 && i10 <= 23) {
                    b10 = b(wdVar, new zd());
                    ArrayList arrayList = (ArrayList) b10;
                    if (!arrayList.isEmpty()) {
                        String str2 = ((sd) arrayList.get(0)).f13594a;
                        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 63 + String.valueOf(str2).length());
                        sb.append("MediaCodecList API didn't list secure decoder for: ");
                        sb.append(str);
                        sb.append(". Assuming: ");
                        sb.append(str2);
                        Log.w("MediaCodecUtil", sb.toString());
                    }
                }
                list = Collections.unmodifiableList(b10);
                hashMap.put(wdVar, list);
            }
        }
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x022d A[Catch: Exception -> 0x02a9, TRY_ENTER, TryCatch #2 {Exception -> 0x02a9, blocks: (B:3:0x0004, B:5:0x0016, B:9:0x0028, B:12:0x0030, B:14:0x0036, B:16:0x003e, B:18:0x0046, B:20:0x004e, B:22:0x0056, B:24:0x005e, B:28:0x006a, B:31:0x0074, B:33:0x007c, B:37:0x008a, B:39:0x0092, B:41:0x009c, B:43:0x00a4, B:45:0x00ac, B:47:0x00b4, B:49:0x00bc, B:51:0x00c4, B:53:0x00cc, B:55:0x00d4, B:57:0x00dc, B:59:0x00e4, B:61:0x00ec, B:64:0x00f6, B:66:0x00fe, B:68:0x0108, B:70:0x0110, B:72:0x0118, B:76:0x0126, B:78:0x012e, B:80:0x0138, B:82:0x0142, B:84:0x014a, B:86:0x0150, B:88:0x0158, B:91:0x0162, B:93:0x016a, B:95:0x0172, B:97:0x017a, B:135:0x0225, B:138:0x022d, B:140:0x0233, B:141:0x0257, B:142:0x0289), top: B:155:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0257 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List<m4.sd> b(m4.wd r21, m4.yd r22) {
        /*
            Method dump skipped, instructions count: 688
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.be.b(m4.wd, m4.yd):java.util.List");
    }
}
