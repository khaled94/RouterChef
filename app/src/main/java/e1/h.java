package e1;

import android.view.View;
import com.raouf.routerchef.R;
import d4.l;
import e9.f;
import j1.d;
import m4.dc0;
import m4.go2;
import m4.ic;
import m4.jc;
import m4.jd;
import m4.ke2;
import m4.md;
import m4.mq;
import m4.nl1;
import m4.o62;
import m4.q01;
import m4.rx;
import m4.uc;
import m4.v91;
import org.xmlpull.v1.XmlPullParser;
import s4.gc;
import y4.d1;
import y4.e1;
import y4.f1;

/* loaded from: classes.dex */
public class h implements jc, v91, d1 {

    /* renamed from: s */
    public static final byte[] f4357s = {0, 0, 0, 1};

    /* renamed from: t */
    public static final float[] f4358t = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: u */
    public static final /* synthetic */ h f4359u = new h();

    /* renamed from: v */
    public static final q01 f4360v = new q01(1);

    /* renamed from: w */
    public static final /* synthetic */ h f4361w = new h();

    /* renamed from: x */
    public static final int[] f4362x = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    public static final int[] y = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: z */
    public static final /* synthetic */ h f4363z = new h();

    public static boolean a(Object[] objArr, Object obj) {
        int length = objArr != null ? objArr.length : 0;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            } else if (!l.a(objArr[i10], obj)) {
                i10++;
            } else if (i10 >= 0) {
                return true;
            }
        }
        return false;
    }

    public static final void b(View view, d dVar) {
        f.e(view, "<this>");
        view.setTag(R.id.view_tree_saved_state_registry_owner, dVar);
    }

    public static String c(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            if (xmlPullParser.getAttributeName(i10).equals(str)) {
                return xmlPullParser.getAttributeValue(i10);
            }
        }
        return null;
    }

    public static go2 d(byte[] bArr) {
        return e(new nl1(bArr, bArr.length), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00be, code lost:
        if (r12 != 3) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static m4.go2 e(m4.nl1 r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.h.e(m4.nl1, boolean):m4.go2");
    }

    public static boolean f(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str);
    }

    public static boolean g(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals(str);
    }

    public static int i(nl1 nl1Var) {
        int c10 = nl1Var.c(4);
        if (c10 == 15) {
            return nl1Var.c(24);
        }
        if (c10 >= 13) {
            throw mq.a(null, null);
        }
        return f4362x[c10];
    }

    @Override // m4.v91
    public void h(Object obj) {
        ((rx) obj).y0(o62.b(new ke2(1), 1003));
    }

    @Override // m4.jc, y4.d1
    /* renamed from: zza */
    public Object mo14zza() {
        e1<Long> e1Var = f1.f20399b;
        return Boolean.valueOf(gc.f17897t.f17898s.zza().zza());
    }

    @Override // m4.jc, y4.d1
    /* renamed from: zza */
    public ic[] mo14zza() {
        int i10 = dc0.O;
        return new ic[]{new md(), new uc(), new jd()};
    }
}
