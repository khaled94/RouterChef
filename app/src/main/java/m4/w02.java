package m4;

import e1.h;
import f3.m;
import java.security.GeneralSecurityException;
import org.xmlpull.v1.XmlPullParser;

@Deprecated
/* loaded from: classes.dex */
public final class w02 implements ar0 {

    /* renamed from: s */
    public static final fo1 f14819s = new fo1(1);

    /* renamed from: t */
    public static final /* synthetic */ w02 f14820t = new w02();

    /* renamed from: u */
    public static final String[] f14821u = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* renamed from: v */
    public static final String[] f14822v = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* renamed from: w */
    public static final String[] f14823w = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    @Deprecated
    public static final h7 a(byte[] bArr) {
        try {
            h62 y = h62.y(bArr, z82.a());
            for (g62 g62Var : y.z()) {
                if (g62Var.w().C() == 2 || g62Var.w().C() == 3 || g62Var.w().C() == 4) {
                    throw new GeneralSecurityException("keyset contains secret key material");
                }
            }
            if (y.v() <= 0) {
                throw new GeneralSecurityException("empty keyset");
            }
            return new h7(y, 4);
        } catch (x92 unused) {
            throw new GeneralSecurityException("invalid keyset");
        }
    }

    public static gw1 b(XmlPullParser xmlPullParser, String str, String str2) {
        dw1 o10 = gw1.o();
        String concat = str.concat(":Item");
        String concat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (h.g(xmlPullParser, concat)) {
                String concat3 = str2.concat(":Mime");
                String concat4 = str2.concat(":Semantic");
                String concat5 = str2.concat(":Length");
                String concat6 = str2.concat(":Padding");
                String c10 = h.c(xmlPullParser, concat3);
                String c11 = h.c(xmlPullParser, concat4);
                String c12 = h.c(xmlPullParser, concat5);
                String c13 = h.c(xmlPullParser, concat6);
                if (c10 != null && c11 != null) {
                    o10.n(new bq2(c10, c12 != null ? Long.parseLong(c12) : 0L, c13 != null ? Long.parseLong(c13) : 0L));
                } else {
                    return gx1.f9060w;
                }
            }
        } while (!h.f(xmlPullParser, concat2));
        return o10.p();
    }

    @Override // m4.ar0, m4.ko1
    /* renamed from: h */
    public void mo30h(Object obj) {
        ((m.a) obj).b();
    }
}
