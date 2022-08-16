package m4;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import n9.d;

/* loaded from: classes.dex */
public final class sa implements Handler.Callback, ve, wf, xe {
    public final cb A;
    public final bb B;
    public pa C;
    public xa D;
    public ya E;
    public pg F;
    public ye G;
    public ya[] H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public int O;
    public int P;
    public long Q;
    public int R;
    public qa S;
    public long T;
    public oa U;
    public oa V;
    public oa W;
    public db X;
    public boolean Y;
    public volatile int Z;

    /* renamed from: a0 */
    public volatile int f13559a0;

    /* renamed from: b0 */
    public final yb0 f13560b0;

    /* renamed from: s */
    public final ya[] f13561s;

    /* renamed from: u */
    public final uf f13563u;

    /* renamed from: v */
    public final tg f13564v;

    /* renamed from: w */
    public final Handler f13565w;

    /* renamed from: x */
    public final HandlerThread f13566x;
    public final Handler y;

    /* renamed from: z */
    public final na f13567z;
    public int N = 0;
    public int M = 1;

    /* renamed from: t */
    public final ha[] f13562t = new ha[2];

    public sa(ya[] yaVarArr, uf ufVar, yb0 yb0Var, boolean z10, Handler handler, pa paVar, na naVar) {
        this.f13561s = yaVarArr;
        this.f13563u = ufVar;
        this.f13560b0 = yb0Var;
        this.J = z10;
        this.y = handler;
        this.C = paVar;
        this.f13567z = naVar;
        for (int i10 = 0; i10 < 2; i10++) {
            yaVarArr[i10].I(i10);
            this.f13562t[i10] = yaVarArr[i10].d();
        }
        this.f13564v = new tg();
        this.H = new ya[0];
        this.A = new cb();
        this.B = new bb();
        ufVar.f14396a = this;
        this.D = xa.f15258c;
        HandlerThread handlerThread = new HandlerThread("ExoPlayerImplInternal:Handler", -16);
        this.f13566x = handlerThread;
        handlerThread.start();
        this.f13565w = new Handler(handlerThread.getLooper(), this);
    }

    public static final void o(ya yaVar) {
        if (yaVar.a() == 2) {
            yaVar.F();
        }
    }

    public static final void p(oa oaVar) {
        while (oaVar != null) {
            oaVar.c();
            oaVar = oaVar.f12069l;
        }
    }

    public final void A(boolean z10) {
        ya[] yaVarArr;
        this.f13565w.removeMessages(2);
        this.K = false;
        tg tgVar = this.f13564v;
        if (tgVar.f14047a) {
            tgVar.a(tgVar.E());
            tgVar.f14047a = false;
        }
        this.F = null;
        this.E = null;
        this.T = 60000000L;
        for (ya yaVar : this.H) {
            try {
                o(yaVar);
                yaVar.i();
            } catch (RuntimeException | ja e10) {
                Log.e("ExoPlayerImplInternal", "Stop failed.", e10);
            }
        }
        this.H = new ya[0];
        oa oaVar = this.W;
        if (oaVar == null) {
            oaVar = this.U;
        }
        p(oaVar);
        this.U = null;
        this.V = null;
        this.W = null;
        f(false);
        if (z10) {
            ye yeVar = this.G;
            if (yeVar != null) {
                yeVar.g();
                this.G = null;
            }
            this.X = null;
        }
    }

    @Override // m4.ve
    public final void a(we weVar) {
        this.f13565w.obtainMessage(8, weVar).sendToTarget();
    }

    @Override // m4.ve
    public final /* bridge */ /* synthetic */ void b(Cif cif) {
        this.f13565w.obtainMessage(9, (we) cif).sendToTarget();
    }

    @Override // m4.xe
    public final void c(db dbVar) {
        this.f13565w.obtainMessage(7, Pair.create(dbVar, null)).sendToTarget();
    }

    public final void d(long j3) {
        oa oaVar = this.W;
        long j10 = oaVar == null ? j3 + 60000000 : j3 + (oaVar.f12063f - oaVar.f12065h);
        this.T = j10;
        this.f13564v.a(j10);
        for (ya yaVar : this.H) {
            yaVar.M(this.T);
        }
    }

    public final void e(long j3, long j10) {
        this.f13565w.removeMessages(2);
        long elapsedRealtime = (j3 + j10) - SystemClock.elapsedRealtime();
        if (elapsedRealtime <= 0) {
            this.f13565w.sendEmptyMessage(2);
        } else {
            this.f13565w.sendEmptyMessageDelayed(2, elapsedRealtime);
        }
    }

    public final void f(boolean z10) {
        if (this.L != z10) {
            this.L = z10;
            this.y.obtainMessage(2, z10 ? 1 : 0, 0).sendToTarget();
        }
    }

    public final void g(oa oaVar) {
        if (this.W == oaVar) {
            return;
        }
        boolean[] zArr = new boolean[2];
        int i10 = 0;
        for (int i11 = 0; i11 < 2; i11++) {
            ya yaVar = this.f13561s[i11];
            zArr[i11] = yaVar.a() != 0;
            of ofVar = oaVar.f12070m.f15316b.f14669b[i11];
            if (ofVar != null) {
                i10++;
            }
            if (zArr[i11] && (ofVar == null || (yaVar.y() && yaVar.f() == this.W.f12061d[i11]))) {
                if (yaVar == this.E) {
                    this.f13564v.b(this.F);
                    this.F = null;
                    this.E = null;
                }
                o(yaVar);
                yaVar.i();
            }
        }
        this.W = oaVar;
        this.y.obtainMessage(3, oaVar.f12070m).sendToTarget();
        v(zArr, i10);
    }

    public final void h(int i10) {
        if (this.M != i10) {
            this.M = i10;
            this.y.obtainMessage(1, i10, 0).sendToTarget();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x006a, code lost:
        p(r13);
        r2.f12069l = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x077b, code lost:
        if (n(r11) != false) goto L418;
     */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0262 A[Catch: IOException -> 0x07f8, ja -> 0x07fb, RuntimeException -> 0x0864, TryCatch #8 {ja -> 0x07fb, blocks: (B:8:0x001a, B:10:0x0022, B:13:0x0028, B:17:0x002f, B:21:0x0036, B:22:0x0042, B:25:0x0048, B:27:0x004c, B:31:0x0053, B:35:0x005b, B:37:0x006a, B:38:0x006f, B:40:0x0079, B:42:0x007d, B:44:0x0081, B:45:0x0092, B:48:0x0098, B:50:0x009c, B:57:0x00ba, B:64:0x00c8, B:67:0x00cb, B:70:0x00d5, B:74:0x00d9, B:75:0x00da, B:79:0x00e1, B:82:0x00e7, B:85:0x00ef, B:89:0x00f8, B:91:0x0117, B:92:0x011e, B:94:0x0124, B:98:0x0131, B:100:0x013b, B:102:0x013f, B:104:0x0145, B:107:0x014b, B:108:0x0152, B:109:0x0156, B:110:0x015d, B:112:0x0161, B:113:0x0166, B:114:0x0169, B:115:0x0178, B:116:0x017a, B:118:0x017e, B:119:0x0182, B:121:0x018a, B:122:0x019b, B:123:0x01a7, B:127:0x01ae, B:129:0x01b4, B:131:0x01bc, B:133:0x01c0, B:135:0x01c4, B:137:0x01cc, B:140:0x01d1, B:142:0x01e2, B:143:0x01f0, B:145:0x01f4, B:147:0x0204, B:149:0x0208, B:152:0x0217, B:153:0x022f, B:155:0x0237, B:157:0x023d, B:158:0x0242, B:160:0x025e, B:162:0x0262, B:165:0x0268, B:167:0x0272, B:169:0x027c, B:170:0x0281, B:171:0x02a9, B:173:0x02ad, B:177:0x02b8, B:178:0x02bb, B:179:0x02c8, B:183:0x02d7, B:185:0x02dd, B:186:0x02ee, B:188:0x02f2, B:190:0x0300, B:192:0x0312, B:196:0x0321, B:198:0x0326, B:199:0x033a, B:200:0x0341, B:202:0x0345, B:203:0x0350, B:210:0x035b, B:211:0x035c, B:213:0x0360, B:215:0x0368, B:216:0x036d, B:217:0x0372, B:219:0x037e, B:221:0x0386, B:223:0x0390, B:225:0x0396, B:226:0x03b4, B:230:0x03bd, B:236:0x03df, B:237:0x03e9, B:244:0x03fa, B:245:0x0405, B:248:0x040b, B:249:0x041d, B:250:0x041e, B:252:0x0428, B:253:0x042f, B:255:0x0433, B:256:0x0438, B:258:0x043e, B:260:0x0444, B:262:0x0453, B:264:0x0457, B:266:0x0462, B:267:0x046e, B:269:0x0476, B:270:0x047d, B:272:0x0481, B:273:0x0486, B:276:0x0498, B:278:0x04c4, B:279:0x04d5, B:281:0x04d9, B:283:0x04e0, B:284:0x04f4, B:287:0x04fc, B:288:0x0502, B:290:0x0536, B:291:0x0538, B:292:0x0543, B:294:0x0547, B:297:0x054e, B:299:0x0552, B:301:0x0556, B:302:0x055a, B:303:0x055e, B:305:0x0562, B:307:0x0568, B:309:0x0572, B:310:0x0599, B:314:0x05a0, B:316:0x05ac, B:318:0x05b2, B:320:0x05b8, B:321:0x05bb, B:324:0x05c1, B:327:0x05d3, B:329:0x05d9, B:330:0x05dc, B:332:0x05e2, B:334:0x05e6, B:336:0x05f5, B:341:0x060b, B:342:0x060f, B:344:0x0615, B:346:0x0625, B:348:0x062b, B:350:0x0634, B:351:0x063d, B:352:0x064f, B:353:0x0653, B:355:0x0659, B:356:0x0661, B:358:0x067c, B:360:0x0687, B:364:0x0690, B:366:0x0696, B:372:0x06a2, B:377:0x06ac, B:379:0x06b1, B:380:0x06b4, B:382:0x06b8, B:384:0x06c4, B:385:0x06d7, B:389:0x06f1, B:391:0x06f9, B:393:0x06ff, B:394:0x0707, B:396:0x070c, B:399:0x0713, B:401:0x071b, B:402:0x071e, B:405:0x072a, B:408:0x0733, B:409:0x0740, B:411:0x0744, B:412:0x075c, B:416:0x0775, B:418:0x077d, B:420:0x0785, B:423:0x078e, B:426:0x0794, B:428:0x079a, B:429:0x07a2, B:430:0x07a5, B:432:0x07aa, B:434:0x07b0, B:435:0x07b8, B:437:0x07bc, B:439:0x07c1, B:441:0x07c6, B:443:0x07ca, B:445:0x07d4, B:446:0x07d8, B:448:0x07df, B:450:0x07e3, B:452:0x07e9, B:453:0x07ed, B:454:0x07f3, B:460:0x07fe, B:464:0x0805, B:466:0x080c, B:467:0x0813, B:469:0x0818, B:472:0x0822, B:473:0x0824, B:475:0x0829, B:477:0x0840, B:478:0x084d), top: B:502:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0268 A[Catch: IOException -> 0x07f8, ja -> 0x07fb, RuntimeException -> 0x0864, TryCatch #8 {ja -> 0x07fb, blocks: (B:8:0x001a, B:10:0x0022, B:13:0x0028, B:17:0x002f, B:21:0x0036, B:22:0x0042, B:25:0x0048, B:27:0x004c, B:31:0x0053, B:35:0x005b, B:37:0x006a, B:38:0x006f, B:40:0x0079, B:42:0x007d, B:44:0x0081, B:45:0x0092, B:48:0x0098, B:50:0x009c, B:57:0x00ba, B:64:0x00c8, B:67:0x00cb, B:70:0x00d5, B:74:0x00d9, B:75:0x00da, B:79:0x00e1, B:82:0x00e7, B:85:0x00ef, B:89:0x00f8, B:91:0x0117, B:92:0x011e, B:94:0x0124, B:98:0x0131, B:100:0x013b, B:102:0x013f, B:104:0x0145, B:107:0x014b, B:108:0x0152, B:109:0x0156, B:110:0x015d, B:112:0x0161, B:113:0x0166, B:114:0x0169, B:115:0x0178, B:116:0x017a, B:118:0x017e, B:119:0x0182, B:121:0x018a, B:122:0x019b, B:123:0x01a7, B:127:0x01ae, B:129:0x01b4, B:131:0x01bc, B:133:0x01c0, B:135:0x01c4, B:137:0x01cc, B:140:0x01d1, B:142:0x01e2, B:143:0x01f0, B:145:0x01f4, B:147:0x0204, B:149:0x0208, B:152:0x0217, B:153:0x022f, B:155:0x0237, B:157:0x023d, B:158:0x0242, B:160:0x025e, B:162:0x0262, B:165:0x0268, B:167:0x0272, B:169:0x027c, B:170:0x0281, B:171:0x02a9, B:173:0x02ad, B:177:0x02b8, B:178:0x02bb, B:179:0x02c8, B:183:0x02d7, B:185:0x02dd, B:186:0x02ee, B:188:0x02f2, B:190:0x0300, B:192:0x0312, B:196:0x0321, B:198:0x0326, B:199:0x033a, B:200:0x0341, B:202:0x0345, B:203:0x0350, B:210:0x035b, B:211:0x035c, B:213:0x0360, B:215:0x0368, B:216:0x036d, B:217:0x0372, B:219:0x037e, B:221:0x0386, B:223:0x0390, B:225:0x0396, B:226:0x03b4, B:230:0x03bd, B:236:0x03df, B:237:0x03e9, B:244:0x03fa, B:245:0x0405, B:248:0x040b, B:249:0x041d, B:250:0x041e, B:252:0x0428, B:253:0x042f, B:255:0x0433, B:256:0x0438, B:258:0x043e, B:260:0x0444, B:262:0x0453, B:264:0x0457, B:266:0x0462, B:267:0x046e, B:269:0x0476, B:270:0x047d, B:272:0x0481, B:273:0x0486, B:276:0x0498, B:278:0x04c4, B:279:0x04d5, B:281:0x04d9, B:283:0x04e0, B:284:0x04f4, B:287:0x04fc, B:288:0x0502, B:290:0x0536, B:291:0x0538, B:292:0x0543, B:294:0x0547, B:297:0x054e, B:299:0x0552, B:301:0x0556, B:302:0x055a, B:303:0x055e, B:305:0x0562, B:307:0x0568, B:309:0x0572, B:310:0x0599, B:314:0x05a0, B:316:0x05ac, B:318:0x05b2, B:320:0x05b8, B:321:0x05bb, B:324:0x05c1, B:327:0x05d3, B:329:0x05d9, B:330:0x05dc, B:332:0x05e2, B:334:0x05e6, B:336:0x05f5, B:341:0x060b, B:342:0x060f, B:344:0x0615, B:346:0x0625, B:348:0x062b, B:350:0x0634, B:351:0x063d, B:352:0x064f, B:353:0x0653, B:355:0x0659, B:356:0x0661, B:358:0x067c, B:360:0x0687, B:364:0x0690, B:366:0x0696, B:372:0x06a2, B:377:0x06ac, B:379:0x06b1, B:380:0x06b4, B:382:0x06b8, B:384:0x06c4, B:385:0x06d7, B:389:0x06f1, B:391:0x06f9, B:393:0x06ff, B:394:0x0707, B:396:0x070c, B:399:0x0713, B:401:0x071b, B:402:0x071e, B:405:0x072a, B:408:0x0733, B:409:0x0740, B:411:0x0744, B:412:0x075c, B:416:0x0775, B:418:0x077d, B:420:0x0785, B:423:0x078e, B:426:0x0794, B:428:0x079a, B:429:0x07a2, B:430:0x07a5, B:432:0x07aa, B:434:0x07b0, B:435:0x07b8, B:437:0x07bc, B:439:0x07c1, B:441:0x07c6, B:443:0x07ca, B:445:0x07d4, B:446:0x07d8, B:448:0x07df, B:450:0x07e3, B:452:0x07e9, B:453:0x07ed, B:454:0x07f3, B:460:0x07fe, B:464:0x0805, B:466:0x080c, B:467:0x0813, B:469:0x0818, B:472:0x0822, B:473:0x0824, B:475:0x0829, B:477:0x0840, B:478:0x084d), top: B:502:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0562 A[Catch: IOException -> 0x07f8, ja -> 0x07fb, RuntimeException -> 0x0864, LOOP:7: B:305:0x0562->B:309:0x0572, LOOP_START, TryCatch #8 {ja -> 0x07fb, blocks: (B:8:0x001a, B:10:0x0022, B:13:0x0028, B:17:0x002f, B:21:0x0036, B:22:0x0042, B:25:0x0048, B:27:0x004c, B:31:0x0053, B:35:0x005b, B:37:0x006a, B:38:0x006f, B:40:0x0079, B:42:0x007d, B:44:0x0081, B:45:0x0092, B:48:0x0098, B:50:0x009c, B:57:0x00ba, B:64:0x00c8, B:67:0x00cb, B:70:0x00d5, B:74:0x00d9, B:75:0x00da, B:79:0x00e1, B:82:0x00e7, B:85:0x00ef, B:89:0x00f8, B:91:0x0117, B:92:0x011e, B:94:0x0124, B:98:0x0131, B:100:0x013b, B:102:0x013f, B:104:0x0145, B:107:0x014b, B:108:0x0152, B:109:0x0156, B:110:0x015d, B:112:0x0161, B:113:0x0166, B:114:0x0169, B:115:0x0178, B:116:0x017a, B:118:0x017e, B:119:0x0182, B:121:0x018a, B:122:0x019b, B:123:0x01a7, B:127:0x01ae, B:129:0x01b4, B:131:0x01bc, B:133:0x01c0, B:135:0x01c4, B:137:0x01cc, B:140:0x01d1, B:142:0x01e2, B:143:0x01f0, B:145:0x01f4, B:147:0x0204, B:149:0x0208, B:152:0x0217, B:153:0x022f, B:155:0x0237, B:157:0x023d, B:158:0x0242, B:160:0x025e, B:162:0x0262, B:165:0x0268, B:167:0x0272, B:169:0x027c, B:170:0x0281, B:171:0x02a9, B:173:0x02ad, B:177:0x02b8, B:178:0x02bb, B:179:0x02c8, B:183:0x02d7, B:185:0x02dd, B:186:0x02ee, B:188:0x02f2, B:190:0x0300, B:192:0x0312, B:196:0x0321, B:198:0x0326, B:199:0x033a, B:200:0x0341, B:202:0x0345, B:203:0x0350, B:210:0x035b, B:211:0x035c, B:213:0x0360, B:215:0x0368, B:216:0x036d, B:217:0x0372, B:219:0x037e, B:221:0x0386, B:223:0x0390, B:225:0x0396, B:226:0x03b4, B:230:0x03bd, B:236:0x03df, B:237:0x03e9, B:244:0x03fa, B:245:0x0405, B:248:0x040b, B:249:0x041d, B:250:0x041e, B:252:0x0428, B:253:0x042f, B:255:0x0433, B:256:0x0438, B:258:0x043e, B:260:0x0444, B:262:0x0453, B:264:0x0457, B:266:0x0462, B:267:0x046e, B:269:0x0476, B:270:0x047d, B:272:0x0481, B:273:0x0486, B:276:0x0498, B:278:0x04c4, B:279:0x04d5, B:281:0x04d9, B:283:0x04e0, B:284:0x04f4, B:287:0x04fc, B:288:0x0502, B:290:0x0536, B:291:0x0538, B:292:0x0543, B:294:0x0547, B:297:0x054e, B:299:0x0552, B:301:0x0556, B:302:0x055a, B:303:0x055e, B:305:0x0562, B:307:0x0568, B:309:0x0572, B:310:0x0599, B:314:0x05a0, B:316:0x05ac, B:318:0x05b2, B:320:0x05b8, B:321:0x05bb, B:324:0x05c1, B:327:0x05d3, B:329:0x05d9, B:330:0x05dc, B:332:0x05e2, B:334:0x05e6, B:336:0x05f5, B:341:0x060b, B:342:0x060f, B:344:0x0615, B:346:0x0625, B:348:0x062b, B:350:0x0634, B:351:0x063d, B:352:0x064f, B:353:0x0653, B:355:0x0659, B:356:0x0661, B:358:0x067c, B:360:0x0687, B:364:0x0690, B:366:0x0696, B:372:0x06a2, B:377:0x06ac, B:379:0x06b1, B:380:0x06b4, B:382:0x06b8, B:384:0x06c4, B:385:0x06d7, B:389:0x06f1, B:391:0x06f9, B:393:0x06ff, B:394:0x0707, B:396:0x070c, B:399:0x0713, B:401:0x071b, B:402:0x071e, B:405:0x072a, B:408:0x0733, B:409:0x0740, B:411:0x0744, B:412:0x075c, B:416:0x0775, B:418:0x077d, B:420:0x0785, B:423:0x078e, B:426:0x0794, B:428:0x079a, B:429:0x07a2, B:430:0x07a5, B:432:0x07aa, B:434:0x07b0, B:435:0x07b8, B:437:0x07bc, B:439:0x07c1, B:441:0x07c6, B:443:0x07ca, B:445:0x07d4, B:446:0x07d8, B:448:0x07df, B:450:0x07e3, B:452:0x07e9, B:453:0x07ed, B:454:0x07f3, B:460:0x07fe, B:464:0x0805, B:466:0x080c, B:467:0x0813, B:469:0x0818, B:472:0x0822, B:473:0x0824, B:475:0x0829, B:477:0x0840, B:478:0x084d), top: B:502:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:372:0x06a2 A[Catch: IOException -> 0x07f8, ja -> 0x07fb, RuntimeException -> 0x0864, TryCatch #8 {ja -> 0x07fb, blocks: (B:8:0x001a, B:10:0x0022, B:13:0x0028, B:17:0x002f, B:21:0x0036, B:22:0x0042, B:25:0x0048, B:27:0x004c, B:31:0x0053, B:35:0x005b, B:37:0x006a, B:38:0x006f, B:40:0x0079, B:42:0x007d, B:44:0x0081, B:45:0x0092, B:48:0x0098, B:50:0x009c, B:57:0x00ba, B:64:0x00c8, B:67:0x00cb, B:70:0x00d5, B:74:0x00d9, B:75:0x00da, B:79:0x00e1, B:82:0x00e7, B:85:0x00ef, B:89:0x00f8, B:91:0x0117, B:92:0x011e, B:94:0x0124, B:98:0x0131, B:100:0x013b, B:102:0x013f, B:104:0x0145, B:107:0x014b, B:108:0x0152, B:109:0x0156, B:110:0x015d, B:112:0x0161, B:113:0x0166, B:114:0x0169, B:115:0x0178, B:116:0x017a, B:118:0x017e, B:119:0x0182, B:121:0x018a, B:122:0x019b, B:123:0x01a7, B:127:0x01ae, B:129:0x01b4, B:131:0x01bc, B:133:0x01c0, B:135:0x01c4, B:137:0x01cc, B:140:0x01d1, B:142:0x01e2, B:143:0x01f0, B:145:0x01f4, B:147:0x0204, B:149:0x0208, B:152:0x0217, B:153:0x022f, B:155:0x0237, B:157:0x023d, B:158:0x0242, B:160:0x025e, B:162:0x0262, B:165:0x0268, B:167:0x0272, B:169:0x027c, B:170:0x0281, B:171:0x02a9, B:173:0x02ad, B:177:0x02b8, B:178:0x02bb, B:179:0x02c8, B:183:0x02d7, B:185:0x02dd, B:186:0x02ee, B:188:0x02f2, B:190:0x0300, B:192:0x0312, B:196:0x0321, B:198:0x0326, B:199:0x033a, B:200:0x0341, B:202:0x0345, B:203:0x0350, B:210:0x035b, B:211:0x035c, B:213:0x0360, B:215:0x0368, B:216:0x036d, B:217:0x0372, B:219:0x037e, B:221:0x0386, B:223:0x0390, B:225:0x0396, B:226:0x03b4, B:230:0x03bd, B:236:0x03df, B:237:0x03e9, B:244:0x03fa, B:245:0x0405, B:248:0x040b, B:249:0x041d, B:250:0x041e, B:252:0x0428, B:253:0x042f, B:255:0x0433, B:256:0x0438, B:258:0x043e, B:260:0x0444, B:262:0x0453, B:264:0x0457, B:266:0x0462, B:267:0x046e, B:269:0x0476, B:270:0x047d, B:272:0x0481, B:273:0x0486, B:276:0x0498, B:278:0x04c4, B:279:0x04d5, B:281:0x04d9, B:283:0x04e0, B:284:0x04f4, B:287:0x04fc, B:288:0x0502, B:290:0x0536, B:291:0x0538, B:292:0x0543, B:294:0x0547, B:297:0x054e, B:299:0x0552, B:301:0x0556, B:302:0x055a, B:303:0x055e, B:305:0x0562, B:307:0x0568, B:309:0x0572, B:310:0x0599, B:314:0x05a0, B:316:0x05ac, B:318:0x05b2, B:320:0x05b8, B:321:0x05bb, B:324:0x05c1, B:327:0x05d3, B:329:0x05d9, B:330:0x05dc, B:332:0x05e2, B:334:0x05e6, B:336:0x05f5, B:341:0x060b, B:342:0x060f, B:344:0x0615, B:346:0x0625, B:348:0x062b, B:350:0x0634, B:351:0x063d, B:352:0x064f, B:353:0x0653, B:355:0x0659, B:356:0x0661, B:358:0x067c, B:360:0x0687, B:364:0x0690, B:366:0x0696, B:372:0x06a2, B:377:0x06ac, B:379:0x06b1, B:380:0x06b4, B:382:0x06b8, B:384:0x06c4, B:385:0x06d7, B:389:0x06f1, B:391:0x06f9, B:393:0x06ff, B:394:0x0707, B:396:0x070c, B:399:0x0713, B:401:0x071b, B:402:0x071e, B:405:0x072a, B:408:0x0733, B:409:0x0740, B:411:0x0744, B:412:0x075c, B:416:0x0775, B:418:0x077d, B:420:0x0785, B:423:0x078e, B:426:0x0794, B:428:0x079a, B:429:0x07a2, B:430:0x07a5, B:432:0x07aa, B:434:0x07b0, B:435:0x07b8, B:437:0x07bc, B:439:0x07c1, B:441:0x07c6, B:443:0x07ca, B:445:0x07d4, B:446:0x07d8, B:448:0x07df, B:450:0x07e3, B:452:0x07e9, B:453:0x07ed, B:454:0x07f3, B:460:0x07fe, B:464:0x0805, B:466:0x080c, B:467:0x0813, B:469:0x0818, B:472:0x0822, B:473:0x0824, B:475:0x0829, B:477:0x0840, B:478:0x084d), top: B:502:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:420:0x0785 A[Catch: IOException -> 0x07f8, ja -> 0x07fb, RuntimeException -> 0x0864, TryCatch #8 {ja -> 0x07fb, blocks: (B:8:0x001a, B:10:0x0022, B:13:0x0028, B:17:0x002f, B:21:0x0036, B:22:0x0042, B:25:0x0048, B:27:0x004c, B:31:0x0053, B:35:0x005b, B:37:0x006a, B:38:0x006f, B:40:0x0079, B:42:0x007d, B:44:0x0081, B:45:0x0092, B:48:0x0098, B:50:0x009c, B:57:0x00ba, B:64:0x00c8, B:67:0x00cb, B:70:0x00d5, B:74:0x00d9, B:75:0x00da, B:79:0x00e1, B:82:0x00e7, B:85:0x00ef, B:89:0x00f8, B:91:0x0117, B:92:0x011e, B:94:0x0124, B:98:0x0131, B:100:0x013b, B:102:0x013f, B:104:0x0145, B:107:0x014b, B:108:0x0152, B:109:0x0156, B:110:0x015d, B:112:0x0161, B:113:0x0166, B:114:0x0169, B:115:0x0178, B:116:0x017a, B:118:0x017e, B:119:0x0182, B:121:0x018a, B:122:0x019b, B:123:0x01a7, B:127:0x01ae, B:129:0x01b4, B:131:0x01bc, B:133:0x01c0, B:135:0x01c4, B:137:0x01cc, B:140:0x01d1, B:142:0x01e2, B:143:0x01f0, B:145:0x01f4, B:147:0x0204, B:149:0x0208, B:152:0x0217, B:153:0x022f, B:155:0x0237, B:157:0x023d, B:158:0x0242, B:160:0x025e, B:162:0x0262, B:165:0x0268, B:167:0x0272, B:169:0x027c, B:170:0x0281, B:171:0x02a9, B:173:0x02ad, B:177:0x02b8, B:178:0x02bb, B:179:0x02c8, B:183:0x02d7, B:185:0x02dd, B:186:0x02ee, B:188:0x02f2, B:190:0x0300, B:192:0x0312, B:196:0x0321, B:198:0x0326, B:199:0x033a, B:200:0x0341, B:202:0x0345, B:203:0x0350, B:210:0x035b, B:211:0x035c, B:213:0x0360, B:215:0x0368, B:216:0x036d, B:217:0x0372, B:219:0x037e, B:221:0x0386, B:223:0x0390, B:225:0x0396, B:226:0x03b4, B:230:0x03bd, B:236:0x03df, B:237:0x03e9, B:244:0x03fa, B:245:0x0405, B:248:0x040b, B:249:0x041d, B:250:0x041e, B:252:0x0428, B:253:0x042f, B:255:0x0433, B:256:0x0438, B:258:0x043e, B:260:0x0444, B:262:0x0453, B:264:0x0457, B:266:0x0462, B:267:0x046e, B:269:0x0476, B:270:0x047d, B:272:0x0481, B:273:0x0486, B:276:0x0498, B:278:0x04c4, B:279:0x04d5, B:281:0x04d9, B:283:0x04e0, B:284:0x04f4, B:287:0x04fc, B:288:0x0502, B:290:0x0536, B:291:0x0538, B:292:0x0543, B:294:0x0547, B:297:0x054e, B:299:0x0552, B:301:0x0556, B:302:0x055a, B:303:0x055e, B:305:0x0562, B:307:0x0568, B:309:0x0572, B:310:0x0599, B:314:0x05a0, B:316:0x05ac, B:318:0x05b2, B:320:0x05b8, B:321:0x05bb, B:324:0x05c1, B:327:0x05d3, B:329:0x05d9, B:330:0x05dc, B:332:0x05e2, B:334:0x05e6, B:336:0x05f5, B:341:0x060b, B:342:0x060f, B:344:0x0615, B:346:0x0625, B:348:0x062b, B:350:0x0634, B:351:0x063d, B:352:0x064f, B:353:0x0653, B:355:0x0659, B:356:0x0661, B:358:0x067c, B:360:0x0687, B:364:0x0690, B:366:0x0696, B:372:0x06a2, B:377:0x06ac, B:379:0x06b1, B:380:0x06b4, B:382:0x06b8, B:384:0x06c4, B:385:0x06d7, B:389:0x06f1, B:391:0x06f9, B:393:0x06ff, B:394:0x0707, B:396:0x070c, B:399:0x0713, B:401:0x071b, B:402:0x071e, B:405:0x072a, B:408:0x0733, B:409:0x0740, B:411:0x0744, B:412:0x075c, B:416:0x0775, B:418:0x077d, B:420:0x0785, B:423:0x078e, B:426:0x0794, B:428:0x079a, B:429:0x07a2, B:430:0x07a5, B:432:0x07aa, B:434:0x07b0, B:435:0x07b8, B:437:0x07bc, B:439:0x07c1, B:441:0x07c6, B:443:0x07ca, B:445:0x07d4, B:446:0x07d8, B:448:0x07df, B:450:0x07e3, B:452:0x07e9, B:453:0x07ed, B:454:0x07f3, B:460:0x07fe, B:464:0x0805, B:466:0x080c, B:467:0x0813, B:469:0x0818, B:472:0x0822, B:473:0x0824, B:475:0x0829, B:477:0x0840, B:478:0x084d), top: B:502:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:432:0x07aa A[Catch: IOException -> 0x07f8, ja -> 0x07fb, RuntimeException -> 0x0864, TryCatch #8 {ja -> 0x07fb, blocks: (B:8:0x001a, B:10:0x0022, B:13:0x0028, B:17:0x002f, B:21:0x0036, B:22:0x0042, B:25:0x0048, B:27:0x004c, B:31:0x0053, B:35:0x005b, B:37:0x006a, B:38:0x006f, B:40:0x0079, B:42:0x007d, B:44:0x0081, B:45:0x0092, B:48:0x0098, B:50:0x009c, B:57:0x00ba, B:64:0x00c8, B:67:0x00cb, B:70:0x00d5, B:74:0x00d9, B:75:0x00da, B:79:0x00e1, B:82:0x00e7, B:85:0x00ef, B:89:0x00f8, B:91:0x0117, B:92:0x011e, B:94:0x0124, B:98:0x0131, B:100:0x013b, B:102:0x013f, B:104:0x0145, B:107:0x014b, B:108:0x0152, B:109:0x0156, B:110:0x015d, B:112:0x0161, B:113:0x0166, B:114:0x0169, B:115:0x0178, B:116:0x017a, B:118:0x017e, B:119:0x0182, B:121:0x018a, B:122:0x019b, B:123:0x01a7, B:127:0x01ae, B:129:0x01b4, B:131:0x01bc, B:133:0x01c0, B:135:0x01c4, B:137:0x01cc, B:140:0x01d1, B:142:0x01e2, B:143:0x01f0, B:145:0x01f4, B:147:0x0204, B:149:0x0208, B:152:0x0217, B:153:0x022f, B:155:0x0237, B:157:0x023d, B:158:0x0242, B:160:0x025e, B:162:0x0262, B:165:0x0268, B:167:0x0272, B:169:0x027c, B:170:0x0281, B:171:0x02a9, B:173:0x02ad, B:177:0x02b8, B:178:0x02bb, B:179:0x02c8, B:183:0x02d7, B:185:0x02dd, B:186:0x02ee, B:188:0x02f2, B:190:0x0300, B:192:0x0312, B:196:0x0321, B:198:0x0326, B:199:0x033a, B:200:0x0341, B:202:0x0345, B:203:0x0350, B:210:0x035b, B:211:0x035c, B:213:0x0360, B:215:0x0368, B:216:0x036d, B:217:0x0372, B:219:0x037e, B:221:0x0386, B:223:0x0390, B:225:0x0396, B:226:0x03b4, B:230:0x03bd, B:236:0x03df, B:237:0x03e9, B:244:0x03fa, B:245:0x0405, B:248:0x040b, B:249:0x041d, B:250:0x041e, B:252:0x0428, B:253:0x042f, B:255:0x0433, B:256:0x0438, B:258:0x043e, B:260:0x0444, B:262:0x0453, B:264:0x0457, B:266:0x0462, B:267:0x046e, B:269:0x0476, B:270:0x047d, B:272:0x0481, B:273:0x0486, B:276:0x0498, B:278:0x04c4, B:279:0x04d5, B:281:0x04d9, B:283:0x04e0, B:284:0x04f4, B:287:0x04fc, B:288:0x0502, B:290:0x0536, B:291:0x0538, B:292:0x0543, B:294:0x0547, B:297:0x054e, B:299:0x0552, B:301:0x0556, B:302:0x055a, B:303:0x055e, B:305:0x0562, B:307:0x0568, B:309:0x0572, B:310:0x0599, B:314:0x05a0, B:316:0x05ac, B:318:0x05b2, B:320:0x05b8, B:321:0x05bb, B:324:0x05c1, B:327:0x05d3, B:329:0x05d9, B:330:0x05dc, B:332:0x05e2, B:334:0x05e6, B:336:0x05f5, B:341:0x060b, B:342:0x060f, B:344:0x0615, B:346:0x0625, B:348:0x062b, B:350:0x0634, B:351:0x063d, B:352:0x064f, B:353:0x0653, B:355:0x0659, B:356:0x0661, B:358:0x067c, B:360:0x0687, B:364:0x0690, B:366:0x0696, B:372:0x06a2, B:377:0x06ac, B:379:0x06b1, B:380:0x06b4, B:382:0x06b8, B:384:0x06c4, B:385:0x06d7, B:389:0x06f1, B:391:0x06f9, B:393:0x06ff, B:394:0x0707, B:396:0x070c, B:399:0x0713, B:401:0x071b, B:402:0x071e, B:405:0x072a, B:408:0x0733, B:409:0x0740, B:411:0x0744, B:412:0x075c, B:416:0x0775, B:418:0x077d, B:420:0x0785, B:423:0x078e, B:426:0x0794, B:428:0x079a, B:429:0x07a2, B:430:0x07a5, B:432:0x07aa, B:434:0x07b0, B:435:0x07b8, B:437:0x07bc, B:439:0x07c1, B:441:0x07c6, B:443:0x07ca, B:445:0x07d4, B:446:0x07d8, B:448:0x07df, B:450:0x07e3, B:452:0x07e9, B:453:0x07ed, B:454:0x07f3, B:460:0x07fe, B:464:0x0805, B:466:0x080c, B:467:0x0813, B:469:0x0818, B:472:0x0822, B:473:0x0824, B:475:0x0829, B:477:0x0840, B:478:0x084d), top: B:502:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:448:0x07df A[Catch: IOException -> 0x07f8, ja -> 0x07fb, RuntimeException -> 0x0864, TryCatch #8 {ja -> 0x07fb, blocks: (B:8:0x001a, B:10:0x0022, B:13:0x0028, B:17:0x002f, B:21:0x0036, B:22:0x0042, B:25:0x0048, B:27:0x004c, B:31:0x0053, B:35:0x005b, B:37:0x006a, B:38:0x006f, B:40:0x0079, B:42:0x007d, B:44:0x0081, B:45:0x0092, B:48:0x0098, B:50:0x009c, B:57:0x00ba, B:64:0x00c8, B:67:0x00cb, B:70:0x00d5, B:74:0x00d9, B:75:0x00da, B:79:0x00e1, B:82:0x00e7, B:85:0x00ef, B:89:0x00f8, B:91:0x0117, B:92:0x011e, B:94:0x0124, B:98:0x0131, B:100:0x013b, B:102:0x013f, B:104:0x0145, B:107:0x014b, B:108:0x0152, B:109:0x0156, B:110:0x015d, B:112:0x0161, B:113:0x0166, B:114:0x0169, B:115:0x0178, B:116:0x017a, B:118:0x017e, B:119:0x0182, B:121:0x018a, B:122:0x019b, B:123:0x01a7, B:127:0x01ae, B:129:0x01b4, B:131:0x01bc, B:133:0x01c0, B:135:0x01c4, B:137:0x01cc, B:140:0x01d1, B:142:0x01e2, B:143:0x01f0, B:145:0x01f4, B:147:0x0204, B:149:0x0208, B:152:0x0217, B:153:0x022f, B:155:0x0237, B:157:0x023d, B:158:0x0242, B:160:0x025e, B:162:0x0262, B:165:0x0268, B:167:0x0272, B:169:0x027c, B:170:0x0281, B:171:0x02a9, B:173:0x02ad, B:177:0x02b8, B:178:0x02bb, B:179:0x02c8, B:183:0x02d7, B:185:0x02dd, B:186:0x02ee, B:188:0x02f2, B:190:0x0300, B:192:0x0312, B:196:0x0321, B:198:0x0326, B:199:0x033a, B:200:0x0341, B:202:0x0345, B:203:0x0350, B:210:0x035b, B:211:0x035c, B:213:0x0360, B:215:0x0368, B:216:0x036d, B:217:0x0372, B:219:0x037e, B:221:0x0386, B:223:0x0390, B:225:0x0396, B:226:0x03b4, B:230:0x03bd, B:236:0x03df, B:237:0x03e9, B:244:0x03fa, B:245:0x0405, B:248:0x040b, B:249:0x041d, B:250:0x041e, B:252:0x0428, B:253:0x042f, B:255:0x0433, B:256:0x0438, B:258:0x043e, B:260:0x0444, B:262:0x0453, B:264:0x0457, B:266:0x0462, B:267:0x046e, B:269:0x0476, B:270:0x047d, B:272:0x0481, B:273:0x0486, B:276:0x0498, B:278:0x04c4, B:279:0x04d5, B:281:0x04d9, B:283:0x04e0, B:284:0x04f4, B:287:0x04fc, B:288:0x0502, B:290:0x0536, B:291:0x0538, B:292:0x0543, B:294:0x0547, B:297:0x054e, B:299:0x0552, B:301:0x0556, B:302:0x055a, B:303:0x055e, B:305:0x0562, B:307:0x0568, B:309:0x0572, B:310:0x0599, B:314:0x05a0, B:316:0x05ac, B:318:0x05b2, B:320:0x05b8, B:321:0x05bb, B:324:0x05c1, B:327:0x05d3, B:329:0x05d9, B:330:0x05dc, B:332:0x05e2, B:334:0x05e6, B:336:0x05f5, B:341:0x060b, B:342:0x060f, B:344:0x0615, B:346:0x0625, B:348:0x062b, B:350:0x0634, B:351:0x063d, B:352:0x064f, B:353:0x0653, B:355:0x0659, B:356:0x0661, B:358:0x067c, B:360:0x0687, B:364:0x0690, B:366:0x0696, B:372:0x06a2, B:377:0x06ac, B:379:0x06b1, B:380:0x06b4, B:382:0x06b8, B:384:0x06c4, B:385:0x06d7, B:389:0x06f1, B:391:0x06f9, B:393:0x06ff, B:394:0x0707, B:396:0x070c, B:399:0x0713, B:401:0x071b, B:402:0x071e, B:405:0x072a, B:408:0x0733, B:409:0x0740, B:411:0x0744, B:412:0x075c, B:416:0x0775, B:418:0x077d, B:420:0x0785, B:423:0x078e, B:426:0x0794, B:428:0x079a, B:429:0x07a2, B:430:0x07a5, B:432:0x07aa, B:434:0x07b0, B:435:0x07b8, B:437:0x07bc, B:439:0x07c1, B:441:0x07c6, B:443:0x07ca, B:445:0x07d4, B:446:0x07d8, B:448:0x07df, B:450:0x07e3, B:452:0x07e9, B:453:0x07ed, B:454:0x07f3, B:460:0x07fe, B:464:0x0805, B:466:0x080c, B:467:0x0813, B:469:0x0818, B:472:0x0822, B:473:0x0824, B:475:0x0829, B:477:0x0840, B:478:0x084d), top: B:502:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:453:0x07ed A[Catch: IOException -> 0x07f8, ja -> 0x07fb, RuntimeException -> 0x0864, TryCatch #8 {ja -> 0x07fb, blocks: (B:8:0x001a, B:10:0x0022, B:13:0x0028, B:17:0x002f, B:21:0x0036, B:22:0x0042, B:25:0x0048, B:27:0x004c, B:31:0x0053, B:35:0x005b, B:37:0x006a, B:38:0x006f, B:40:0x0079, B:42:0x007d, B:44:0x0081, B:45:0x0092, B:48:0x0098, B:50:0x009c, B:57:0x00ba, B:64:0x00c8, B:67:0x00cb, B:70:0x00d5, B:74:0x00d9, B:75:0x00da, B:79:0x00e1, B:82:0x00e7, B:85:0x00ef, B:89:0x00f8, B:91:0x0117, B:92:0x011e, B:94:0x0124, B:98:0x0131, B:100:0x013b, B:102:0x013f, B:104:0x0145, B:107:0x014b, B:108:0x0152, B:109:0x0156, B:110:0x015d, B:112:0x0161, B:113:0x0166, B:114:0x0169, B:115:0x0178, B:116:0x017a, B:118:0x017e, B:119:0x0182, B:121:0x018a, B:122:0x019b, B:123:0x01a7, B:127:0x01ae, B:129:0x01b4, B:131:0x01bc, B:133:0x01c0, B:135:0x01c4, B:137:0x01cc, B:140:0x01d1, B:142:0x01e2, B:143:0x01f0, B:145:0x01f4, B:147:0x0204, B:149:0x0208, B:152:0x0217, B:153:0x022f, B:155:0x0237, B:157:0x023d, B:158:0x0242, B:160:0x025e, B:162:0x0262, B:165:0x0268, B:167:0x0272, B:169:0x027c, B:170:0x0281, B:171:0x02a9, B:173:0x02ad, B:177:0x02b8, B:178:0x02bb, B:179:0x02c8, B:183:0x02d7, B:185:0x02dd, B:186:0x02ee, B:188:0x02f2, B:190:0x0300, B:192:0x0312, B:196:0x0321, B:198:0x0326, B:199:0x033a, B:200:0x0341, B:202:0x0345, B:203:0x0350, B:210:0x035b, B:211:0x035c, B:213:0x0360, B:215:0x0368, B:216:0x036d, B:217:0x0372, B:219:0x037e, B:221:0x0386, B:223:0x0390, B:225:0x0396, B:226:0x03b4, B:230:0x03bd, B:236:0x03df, B:237:0x03e9, B:244:0x03fa, B:245:0x0405, B:248:0x040b, B:249:0x041d, B:250:0x041e, B:252:0x0428, B:253:0x042f, B:255:0x0433, B:256:0x0438, B:258:0x043e, B:260:0x0444, B:262:0x0453, B:264:0x0457, B:266:0x0462, B:267:0x046e, B:269:0x0476, B:270:0x047d, B:272:0x0481, B:273:0x0486, B:276:0x0498, B:278:0x04c4, B:279:0x04d5, B:281:0x04d9, B:283:0x04e0, B:284:0x04f4, B:287:0x04fc, B:288:0x0502, B:290:0x0536, B:291:0x0538, B:292:0x0543, B:294:0x0547, B:297:0x054e, B:299:0x0552, B:301:0x0556, B:302:0x055a, B:303:0x055e, B:305:0x0562, B:307:0x0568, B:309:0x0572, B:310:0x0599, B:314:0x05a0, B:316:0x05ac, B:318:0x05b2, B:320:0x05b8, B:321:0x05bb, B:324:0x05c1, B:327:0x05d3, B:329:0x05d9, B:330:0x05dc, B:332:0x05e2, B:334:0x05e6, B:336:0x05f5, B:341:0x060b, B:342:0x060f, B:344:0x0615, B:346:0x0625, B:348:0x062b, B:350:0x0634, B:351:0x063d, B:352:0x064f, B:353:0x0653, B:355:0x0659, B:356:0x0661, B:358:0x067c, B:360:0x0687, B:364:0x0690, B:366:0x0696, B:372:0x06a2, B:377:0x06ac, B:379:0x06b1, B:380:0x06b4, B:382:0x06b8, B:384:0x06c4, B:385:0x06d7, B:389:0x06f1, B:391:0x06f9, B:393:0x06ff, B:394:0x0707, B:396:0x070c, B:399:0x0713, B:401:0x071b, B:402:0x071e, B:405:0x072a, B:408:0x0733, B:409:0x0740, B:411:0x0744, B:412:0x075c, B:416:0x0775, B:418:0x077d, B:420:0x0785, B:423:0x078e, B:426:0x0794, B:428:0x079a, B:429:0x07a2, B:430:0x07a5, B:432:0x07aa, B:434:0x07b0, B:435:0x07b8, B:437:0x07bc, B:439:0x07c1, B:441:0x07c6, B:443:0x07ca, B:445:0x07d4, B:446:0x07d8, B:448:0x07df, B:450:0x07e3, B:452:0x07e9, B:453:0x07ed, B:454:0x07f3, B:460:0x07fe, B:464:0x0805, B:466:0x080c, B:467:0x0813, B:469:0x0818, B:472:0x0822, B:473:0x0824, B:475:0x0829, B:477:0x0840, B:478:0x084d), top: B:502:0x0015 }] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean handleMessage(android.os.Message r33) {
        /*
            Method dump skipped, instructions count: 2260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.sa.handleMessage(android.os.Message):boolean");
    }

    public final void i() {
        this.K = false;
        tg tgVar = this.f13564v;
        if (!tgVar.f14047a) {
            tgVar.f14049c = SystemClock.elapsedRealtime();
            tgVar.f14047a = true;
        }
        for (ya yaVar : this.H) {
            yaVar.u();
        }
    }

    public final void j() {
        A(true);
        this.f13560b0.c(true);
        h(1);
    }

    public final void k() {
        tg tgVar = this.f13564v;
        if (tgVar.f14047a) {
            tgVar.a(tgVar.E());
            tgVar.f14047a = false;
        }
        for (ya yaVar : this.H) {
            o(yaVar);
        }
    }

    public final void l() {
        oa oaVar = this.W;
        if (oaVar == null) {
            return;
        }
        long f10 = oaVar.f12058a.f();
        if (f10 != -9223372036854775807L) {
            d(f10);
        } else {
            ya yaVar = this.E;
            if (yaVar == null || yaVar.B()) {
                this.T = this.f13564v.E();
            } else {
                long E = this.F.E();
                this.T = E;
                this.f13564v.a(E);
            }
            oa oaVar2 = this.W;
            f10 = this.T - (oaVar2.f12063f - oaVar2.f12065h);
        }
        this.C.f12453c = f10;
        this.Q = SystemClock.elapsedRealtime() * 1000;
        long e10 = this.H.length == 0 ? Long.MIN_VALUE : this.W.f12058a.e();
        pa paVar = this.C;
        if (e10 == Long.MIN_VALUE) {
            e10 = this.X.d(this.W.f12064g, this.B, false).f6436c;
        }
        paVar.f12454d = e10;
    }

    public final boolean m(int i10) {
        this.X.d(i10, this.B, false);
        this.X.e(0, this.A);
        return this.X.f(i10, this.B, this.A, this.N) == -1;
    }

    public final boolean n(long j3) {
        oa oaVar;
        return j3 == -9223372036854775807L || this.C.f12453c < j3 || ((oaVar = this.W.f12069l) != null && oaVar.f12067j);
    }

    public final int q(int i10, db dbVar, db dbVar2) {
        int b10 = dbVar.b();
        int i11 = -1;
        for (int i12 = 0; i12 < b10 && i11 == -1; i12++) {
            i10 = dbVar.f(i10, this.B, this.A, this.N);
            i11 = dbVar2.a(dbVar.d(i10, this.B, true).f6435b);
        }
        return i11;
    }

    public final long r(int i10, long j3) {
        oa oaVar;
        k();
        this.K = false;
        h(2);
        oa oaVar2 = this.W;
        if (oaVar2 == null) {
            oa oaVar3 = this.U;
            if (oaVar3 != null) {
                oaVar3.c();
            }
            oaVar = null;
        } else {
            oaVar = null;
            while (oaVar2 != null) {
                if (oaVar2.f12064g != i10 || !oaVar2.f12067j) {
                    oaVar2.c();
                } else {
                    oaVar = oaVar2;
                }
                oaVar2 = oaVar2.f12069l;
            }
        }
        oa oaVar4 = this.W;
        if (oaVar4 != oaVar || oaVar4 != this.V) {
            for (ya yaVar : this.H) {
                yaVar.i();
            }
            this.H = new ya[0];
            this.F = null;
            this.E = null;
            this.W = null;
        }
        if (oaVar != null) {
            oaVar.f12069l = null;
            this.U = oaVar;
            this.V = oaVar;
            g(oaVar);
            oa oaVar5 = this.W;
            if (oaVar5.f12068k) {
                j3 = oaVar5.f12058a.s(j3);
            }
            d(j3);
            x();
        } else {
            this.U = null;
            this.V = null;
            this.W = null;
            d(j3);
        }
        this.f13565w.sendEmptyMessage(2);
        return j3;
    }

    public final Pair s() {
        return t(this.X, -9223372036854775807L, 0L);
    }

    public final Pair t(db dbVar, long j3, long j10) {
        d.e(0, dbVar.c());
        dbVar.e(0, this.A);
        if (j3 == -9223372036854775807L) {
            j3 = 0;
        }
        long j11 = dbVar.d(0, this.B, false).f6436c;
        return Pair.create(0, Long.valueOf(j3));
    }

    public final Pair<Integer, Long> u(qa qaVar) {
        db dbVar = qaVar.f12751a;
        if (dbVar.h()) {
            dbVar = this.X;
        }
        try {
            Pair<Integer, Long> t10 = t(dbVar, qaVar.f12752b, 0L);
            db dbVar2 = this.X;
            if (dbVar2 == dbVar) {
                return t10;
            }
            if (dbVar2.a(dbVar.d(((Integer) t10.first).intValue(), this.B, true).f6435b) != -1) {
                return Pair.create(0, (Long) t10.second);
            }
            if (q(((Integer) t10.first).intValue(), dbVar, this.X) == -1) {
                return null;
            }
            this.X.d(0, this.B, false);
            return s();
        } catch (IndexOutOfBoundsException unused) {
            throw new va();
        }
    }

    public final void v(boolean[] zArr, int i10) {
        int i11;
        this.H = new ya[i10];
        int i12 = 0;
        int i13 = 0;
        while (i12 < 2) {
            ya yaVar = this.f13561s[i12];
            of ofVar = this.W.f12070m.f15316b.f14669b[i12];
            if (ofVar != null) {
                int i14 = i13 + 1;
                this.H[i13] = yaVar;
                if (yaVar.a() == 0) {
                    za zaVar = this.W.f12070m.f15318d[i12];
                    boolean z10 = this.J && this.M == 3;
                    boolean z11 = !zArr[i12] && z10;
                    int length = ofVar.f12139b.length;
                    ua[] uaVarArr = new ua[1];
                    for (int i15 = 0; i15 <= 0; i15++) {
                        uaVarArr[i15] = ofVar.f12140c[i15];
                    }
                    oa oaVar = this.W;
                    i11 = i12;
                    yaVar.K(zaVar, uaVarArr, oaVar.f12061d[i12], this.T, z11, oaVar.f12063f - oaVar.f12065h);
                    pg h10 = yaVar.h();
                    if (h10 != null) {
                        if (this.F != null) {
                            throw new ja(new IllegalStateException("Multiple renderer media clocks enabled."));
                        }
                        this.F = h10;
                        this.E = yaVar;
                        h10.J(this.D);
                    }
                    if (z10) {
                        yaVar.u();
                    }
                } else {
                    i11 = i12;
                }
                i13 = i14;
            } else {
                i11 = i12;
            }
            i12 = i11 + 1;
        }
    }

    public final void w(Object obj, int i10) {
        this.C = new pa(0, 0L);
        z(obj, i10);
        this.C = new pa(0, -9223372036854775807L);
        h(4);
        A(false);
    }

    public final void x() {
        int i10;
        oa oaVar = this.U;
        long zza = !oaVar.f12067j ? 0L : oaVar.f12058a.zza();
        boolean z10 = false;
        if (zza == Long.MIN_VALUE) {
            f(false);
            return;
        }
        oa oaVar2 = this.U;
        long j3 = this.T - (oaVar2.f12063f - oaVar2.f12065h);
        yb0 yb0Var = this.f13560b0;
        long j10 = zza - j3;
        synchronized (yb0Var) {
            boolean z11 = j10 > yb0Var.f15644c ? false : j10 < yb0Var.f15643b ? true : true;
            eg egVar = yb0Var.f15642a;
            synchronized (egVar) {
                i10 = egVar.f7840c * 65536;
            }
            int i11 = yb0Var.f15647f;
            if (z11 || (z11 && yb0Var.f15648g && i10 < i11)) {
                z10 = true;
            }
            yb0Var.f15648g = z10;
        }
        f(z10);
        if (!z10) {
            return;
        }
        this.U.f12058a.q(j3);
    }

    public final void y() {
        oa oaVar = this.U;
        if (oaVar == null || oaVar.f12067j) {
            return;
        }
        oa oaVar2 = this.V;
        if (oaVar2 != null && oaVar2.f12069l != oaVar) {
            return;
        }
        for (ya yaVar : this.H) {
            if (!yaVar.C()) {
                return;
            }
        }
        this.U.f12058a.p();
    }

    public final void z(Object obj, int i10) {
        this.y.obtainMessage(6, new ra(this.X, obj, this.C, i10)).sendToTarget();
    }
}
