package t3;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import java.io.InputStream;
import m4.an1;
import m4.ba;
import m4.cu1;
import m4.mz1;
import m4.tz1;
import m4.u90;
import m4.xy1;

/* loaded from: classes.dex */
public final /* synthetic */ class q implements xy1 {

    /* renamed from: a */
    public final /* synthetic */ int f18605a;

    /* renamed from: b */
    public final /* synthetic */ ba f18606b;

    public /* synthetic */ q(ba baVar, int i10) {
        this.f18605a = i10;
        this.f18606b = baVar;
    }

    @Override // m4.xy1
    public final tz1 h(Object obj) {
        switch (this.f18605a) {
            case 0:
                z zVar = (z) this.f18606b;
                final Uri uri = (Uri) obj;
                return mz1.o(zVar.P3("google.afma.nativeAds.getPublisherCustomRenderedClickSignals"), new cu1() { // from class: t3.m
                    @Override // m4.cu1
                    public final Object a(Object obj2) {
                        Uri uri2 = uri;
                        String str = (String) obj2;
                        return !TextUtils.isEmpty(str) ? z.R3(uri2, "nas", str) : uri2;
                    }
                }, zVar.f18630x);
            default:
                ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
                ParcelFileDescriptor parcelFileDescriptor = createPipe[0];
                u90.f14294a.execute(new an1((InputStream) obj, createPipe[1], 0));
                return mz1.m(parcelFileDescriptor);
        }
    }
}
