package m4;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ma extends Handler {

    /* renamed from: a */
    public final /* synthetic */ na f11124a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ma(na naVar, Looper looper) {
        super(looper);
        this.f11124a = naVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        na naVar = this.f11124a;
        Objects.requireNonNull(naVar);
        boolean z10 = true;
        switch (message.what) {
            case 0:
                naVar.f11593m--;
                return;
            case 1:
                naVar.f11591k = message.arg1;
                Iterator<ka> it = naVar.f11586f.iterator();
                while (it.hasNext()) {
                    it.next().j(naVar.f11591k);
                }
                return;
            case 2:
                if (message.arg1 == 0) {
                    z10 = false;
                }
                naVar.f11594n = z10;
                Iterator<ka> it2 = naVar.f11586f.iterator();
                while (it2.hasNext()) {
                    it2.next().zza();
                }
                return;
            case 3:
                if (naVar.f11593m != 0) {
                    return;
                }
                xf xfVar = (xf) message.obj;
                naVar.f11589i = true;
                naVar.f11596q = xfVar.f15315a;
                naVar.f11597r = xfVar.f15316b;
                uf ufVar = naVar.f11582b;
                Object obj = xfVar.f15317c;
                Objects.requireNonNull(ufVar);
                sf sfVar = (sf) obj;
                Iterator<ka> it3 = naVar.f11586f.iterator();
                while (it3.hasNext()) {
                    it3.next().e();
                }
                return;
            case 4:
                int i10 = naVar.f11592l - 1;
                naVar.f11592l = i10;
                if (i10 != 0) {
                    return;
                }
                naVar.f11599t = (pa) message.obj;
                if (message.arg1 == 0) {
                    return;
                }
                Iterator<ka> it4 = naVar.f11586f.iterator();
                while (it4.hasNext()) {
                    it4.next().b();
                }
                return;
            case 5:
                if (naVar.f11592l != 0) {
                    return;
                }
                naVar.f11599t = (pa) message.obj;
                Iterator<ka> it5 = naVar.f11586f.iterator();
                while (it5.hasNext()) {
                    it5.next().b();
                }
                return;
            case 6:
                ra raVar = (ra) message.obj;
                naVar.f11592l -= raVar.f13208d;
                if (naVar.f11593m != 0) {
                    return;
                }
                naVar.f11595o = raVar.f13205a;
                naVar.p = raVar.f13206b;
                naVar.f11599t = raVar.f13207c;
                Iterator<ka> it6 = naVar.f11586f.iterator();
                while (it6.hasNext()) {
                    it6.next().d();
                }
                return;
            case 7:
                xa xaVar = (xa) message.obj;
                if (naVar.f11598s.equals(xaVar)) {
                    return;
                }
                naVar.f11598s = xaVar;
                Iterator<ka> it7 = naVar.f11586f.iterator();
                while (it7.hasNext()) {
                    it7.next().a();
                }
                return;
            case 8:
                ja jaVar = (ja) message.obj;
                Iterator<ka> it8 = naVar.f11586f.iterator();
                while (it8.hasNext()) {
                    it8.next().q(jaVar);
                }
                return;
            default:
                throw new IllegalStateException();
        }
    }
}
