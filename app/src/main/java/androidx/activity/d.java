package androidx.activity;

import android.content.Context;
import android.graphics.Typeface;
import androidx.emoji2.text.d;
import androidx.emoji2.text.j;
import com.raouf.routerchef.AccessControl;
import e0.f;
import e0.m;
import i0.j;
import j0.n;
import java.nio.ByteBuffer;
import java.util.Objects;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f412s;

    /* renamed from: t */
    public final /* synthetic */ Object f413t;

    public /* synthetic */ d(Object obj, int i10) {
        this.f412s = i10;
        this.f413t = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f412s) {
            case 0:
                ((ComponentActivity) this.f413t).invalidateOptionsMenu();
                return;
            case 1:
                j.b bVar = (j.b) this.f413t;
                synchronized (bVar.f1336d) {
                    if (bVar.f1340h == null) {
                        return;
                    }
                    try {
                        n d5 = bVar.d();
                        int i10 = d5.f5420e;
                        if (i10 == 2) {
                            synchronized (bVar.f1336d) {
                            }
                        }
                        if (i10 != 0) {
                            throw new RuntimeException("fetchFonts result is not OK. (" + i10 + ")");
                        }
                        int i11 = i0.j.f5171a;
                        j.a.a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                        j.a aVar = bVar.f1335c;
                        Context context = bVar.f1333a;
                        Objects.requireNonNull(aVar);
                        Typeface b10 = f.f4318a.b(context, new n[]{d5}, 0);
                        ByteBuffer e10 = m.e(bVar.f1333a, d5.f5416a);
                        if (e10 != null && b10 != null) {
                            j.a.a("EmojiCompat.MetadataRepo.create");
                            androidx.emoji2.text.n nVar = new androidx.emoji2.text.n(b10, androidx.emoji2.text.m.a(e10));
                            j.a.b();
                            j.a.b();
                            synchronized (bVar.f1336d) {
                                d.h hVar = bVar.f1340h;
                                if (hVar != null) {
                                    hVar.b(nVar);
                                }
                            }
                            bVar.b();
                            return;
                        }
                        throw new RuntimeException("Unable to open file.");
                    } catch (Throwable th) {
                        synchronized (bVar.f1336d) {
                            d.h hVar2 = bVar.f1340h;
                            if (hVar2 != null) {
                                hVar2.a(th);
                            }
                            bVar.b();
                            return;
                        }
                    }
                }
            default:
                AccessControl accessControl = (AccessControl) this.f413t;
                accessControl.Y.setEnabled(true);
                accessControl.X.b();
                i8.m.e(accessControl.P);
                return;
        }
    }
}
