package m4;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class wp2 extends yp2 {

    /* renamed from: b */
    public long f15084b = -9223372036854775807L;

    /* renamed from: c */
    public long[] f15085c = new long[0];

    /* renamed from: d */
    public long[] f15086d = new long[0];

    public wp2() {
        super(new so2());
    }

    public static Object d(dd ddVar, int i10) {
        if (i10 != 0) {
            boolean z10 = false;
            if (i10 == 1) {
                if (ddVar.q() == 1) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            } else if (i10 == 2) {
                return e(ddVar);
            } else {
                if (i10 != 3) {
                    if (i10 == 8) {
                        return f(ddVar);
                    }
                    if (i10 != 10) {
                        if (i10 != 11) {
                            return null;
                        }
                        Date date = new Date((long) Double.valueOf(Double.longBitsToDouble(ddVar.v())).doubleValue());
                        ddVar.i(2);
                        return date;
                    }
                    int s10 = ddVar.s();
                    ArrayList arrayList = new ArrayList(s10);
                    for (int i11 = 0; i11 < s10; i11++) {
                        Object d5 = d(ddVar, ddVar.q());
                        if (d5 != null) {
                            arrayList.add(d5);
                        }
                    }
                    return arrayList;
                }
                HashMap hashMap = new HashMap();
                while (true) {
                    String e10 = e(ddVar);
                    int q10 = ddVar.q();
                    if (q10 == 9) {
                        return hashMap;
                    }
                    Object d10 = d(ddVar, q10);
                    if (d10 != null) {
                        hashMap.put(e10, d10);
                    }
                }
            }
        } else {
            return Double.valueOf(Double.longBitsToDouble(ddVar.v()));
        }
    }

    public static String e(dd ddVar) {
        int t10 = ddVar.t();
        int i10 = ddVar.f7309b;
        ddVar.i(t10);
        return new String((byte[]) ddVar.f7311d, i10, t10);
    }

    public static HashMap<String, Object> f(dd ddVar) {
        int s10 = ddVar.s();
        HashMap<String, Object> hashMap = new HashMap<>(s10);
        for (int i10 = 0; i10 < s10; i10++) {
            String e10 = e(ddVar);
            Object d5 = d(ddVar, ddVar.q());
            if (d5 != null) {
                hashMap.put(e10, d5);
            }
        }
        return hashMap;
    }

    @Override // m4.yp2
    public final boolean a(dd ddVar) {
        return true;
    }

    @Override // m4.yp2
    public final boolean b(dd ddVar, long j3) {
        if (ddVar.q() == 2 && "onMetaData".equals(e(ddVar)) && ddVar.q() == 8) {
            HashMap<String, Object> f10 = f(ddVar);
            Object obj = f10.get("duration");
            if (obj instanceof Double) {
                double doubleValue = ((Double) obj).doubleValue();
                if (doubleValue > 0.0d) {
                    this.f15084b = (long) (doubleValue * 1000000.0d);
                }
            }
            Object obj2 = f10.get("keyframes");
            if (obj2 instanceof Map) {
                Map map = (Map) obj2;
                Object obj3 = map.get("filepositions");
                Object obj4 = map.get("times");
                if ((obj3 instanceof List) && (obj4 instanceof List)) {
                    List list = (List) obj3;
                    List list2 = (List) obj4;
                    int size = list2.size();
                    this.f15085c = new long[size];
                    this.f15086d = new long[size];
                    for (int i10 = 0; i10 < size; i10++) {
                        Object obj5 = list.get(i10);
                        Object obj6 = list2.get(i10);
                        if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                            this.f15085c = new long[0];
                            this.f15086d = new long[0];
                            break;
                        }
                        this.f15085c[i10] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                        this.f15086d[i10] = ((Double) obj5).longValue();
                    }
                }
            }
            return false;
        }
        return false;
    }
}
