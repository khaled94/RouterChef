package m4;

import java.util.Collections;
import java.util.Map;
import l3.b;
import r.a;

/* loaded from: classes.dex */
public final class sx implements lx<vd0> {

    /* renamed from: v */
    public static final Map<String, Integer> f13834v;

    /* renamed from: s */
    public final b f13835s;

    /* renamed from: t */
    public final m30 f13836t;

    /* renamed from: u */
    public final e7 f13837u;

    static {
        String[] strArr = {"resize", "playVideo", "storePicture", "createCalendarEvent", "setOrientationProperties", "closeResizedAd", "unload"};
        Integer[] numArr = {1, 2, 3, 4, 5, 6, 7};
        a aVar = new a(7);
        for (int i10 = 0; i10 < 7; i10++) {
            aVar.put(strArr[i10], numArr[i10]);
        }
        f13834v = Collections.unmodifiableMap(aVar);
    }

    public sx(b bVar, m30 m30Var, e7 e7Var) {
        this.f13835s = bVar;
        this.f13836t = m30Var;
        this.f13837u = e7Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Can't wrap try/catch for region: R(15:213|(1:215)(1:216)|217|218|237|(10:(1:(11:241|(1:(1:244)(1:248))|247|252|253|297|254|255|(1:257)|258|272)(8:249|253|297|254|255|(0)|258|272))(1:250)|251|252|253|297|254|255|(0)|258|272)|246|252|253|297|254|255|(0)|258|272) */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x0527, code lost:
        if (r14 != 5) goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x05ae, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x05af, code lost:
        r0 = java.lang.String.valueOf(r0.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x05bd, code lost:
        if (r0.length() != 0) goto L262;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x05bf, code lost:
        r0 = "Cannot show popup window: ".concat(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x05c4, code lost:
        r0 = new java.lang.String("Cannot show popup window: ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x05c9, code lost:
        r2.c(r0);
        r2.K.removeView((android.view.View) r2.D);
        r0 = r2.L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x05d7, code lost:
        if (r0 != null) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x05d9, code lost:
        r0.removeView(r2.G);
        r2.L.addView((android.view.View) r2.D);
        r2.D.J0(r2.F);
     */
    /* JADX WARN: Removed duplicated region for block: B:208:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0411 A[Catch: all -> 0x05ff, TryCatch #1 {, blocks: (B:91:0x01c9, B:94:0x01d1, B:97:0x01dd, B:100:0x01ed, B:102:0x01f5, B:104:0x0203, B:105:0x0215, B:107:0x0223, B:108:0x0235, B:110:0x0243, B:111:0x0255, B:113:0x0263, B:114:0x0275, B:116:0x0283, B:117:0x0291, B:119:0x029f, B:120:0x02a1, B:122:0x02a5, B:124:0x02a9, B:126:0x02b1, B:129:0x02b9, B:133:0x02d8, B:140:0x02e8, B:142:0x02ec, B:169:0x033f, B:171:0x034c, B:173:0x0359, B:174:0x0366, B:175:0x036d, B:177:0x0376, B:178:0x038b, B:179:0x0398, B:180:0x039f, B:182:0x03a4, B:184:0x03a7, B:186:0x03ac, B:189:0x03b2, B:190:0x03c4, B:193:0x03e1, B:195:0x03e7, B:196:0x03e9, B:199:0x03f0, B:201:0x03f8, B:202:0x03fa, B:205:0x0407, B:209:0x0411, B:211:0x042f, B:213:0x0433, B:215:0x0440, B:216:0x0477, B:217:0x047a, B:246:0x0529, B:247:0x052d, B:248:0x0531, B:249:0x0535, B:250:0x053b, B:252:0x0540, B:253:0x0543, B:254:0x055b, B:255:0x0576, B:257:0x057e, B:258:0x0589, B:260:0x05af, B:262:0x05bf, B:263:0x05c4, B:264:0x05c9, B:266:0x05d9, B:271:0x05fa, B:272:0x05fd), top: B:299:0x01c9, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:257:0x057e A[Catch: all -> 0x05ff, TryCatch #1 {, blocks: (B:91:0x01c9, B:94:0x01d1, B:97:0x01dd, B:100:0x01ed, B:102:0x01f5, B:104:0x0203, B:105:0x0215, B:107:0x0223, B:108:0x0235, B:110:0x0243, B:111:0x0255, B:113:0x0263, B:114:0x0275, B:116:0x0283, B:117:0x0291, B:119:0x029f, B:120:0x02a1, B:122:0x02a5, B:124:0x02a9, B:126:0x02b1, B:129:0x02b9, B:133:0x02d8, B:140:0x02e8, B:142:0x02ec, B:169:0x033f, B:171:0x034c, B:173:0x0359, B:174:0x0366, B:175:0x036d, B:177:0x0376, B:178:0x038b, B:179:0x0398, B:180:0x039f, B:182:0x03a4, B:184:0x03a7, B:186:0x03ac, B:189:0x03b2, B:190:0x03c4, B:193:0x03e1, B:195:0x03e7, B:196:0x03e9, B:199:0x03f0, B:201:0x03f8, B:202:0x03fa, B:205:0x0407, B:209:0x0411, B:211:0x042f, B:213:0x0433, B:215:0x0440, B:216:0x0477, B:217:0x047a, B:246:0x0529, B:247:0x052d, B:248:0x0531, B:249:0x0535, B:250:0x053b, B:252:0x0540, B:253:0x0543, B:254:0x055b, B:255:0x0576, B:257:0x057e, B:258:0x0589, B:260:0x05af, B:262:0x05bf, B:263:0x05c4, B:264:0x05c9, B:266:0x05d9, B:271:0x05fa, B:272:0x05fd), top: B:299:0x01c9, inners: #0 }] */
    @Override // m4.lx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(m4.vd0 r17, java.util.Map r18) {
        /*
            Method dump skipped, instructions count: 1684
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.sx.a(java.lang.Object, java.util.Map):void");
    }
}
