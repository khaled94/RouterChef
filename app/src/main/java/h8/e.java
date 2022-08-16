package h8;

import android.app.Activity;
import android.util.Log;
import f3.d;
import f3.h;
import o3.b;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a */
    public final Activity f5149a;

    /* renamed from: b */
    public final a f5150b;

    /* renamed from: c */
    public o3.a f5151c;

    /* renamed from: d */
    public boolean f5152d;

    /* renamed from: e */
    public f f5153e;

    /* loaded from: classes.dex */
    public class a extends b {

        /* renamed from: a */
        public final /* synthetic */ Activity f5154a;

        /* renamed from: b */
        public final /* synthetic */ String f5155b;

        public a(Activity activity, String str) {
            e.this = r1;
            this.f5154a = activity;
            this.f5155b = str;
        }

        @Override // o3.b
        public final void a(h hVar) {
            Log.d("onAdFailedToLoad >>>>>>>>>>>>>>>>>> ", "The ad failed to show.");
            e.this.f5151c = null;
            o3.a.a(this.f5154a, this.f5155b, new d(new d.a()), this);
        }

        @Override // o3.b
        public final void b(Object obj) {
            o3.a aVar = (o3.a) obj;
            Log.i("TAG", "onAdLoaded");
            e eVar = e.this;
            eVar.f5151c = aVar;
            if (eVar.f5152d) {
                aVar.d(this.f5154a);
            }
            aVar.b(new d(this));
        }
    }

    public e(Activity activity, String str, d dVar, boolean z10, f fVar) {
        this.f5149a = activity;
        this.f5152d = z10;
        this.f5153e = fVar;
        a aVar = new a(activity, str);
        this.f5150b = aVar;
        o3.a.a(activity, str, dVar, aVar);
    }

    public final void a() {
        this.f5153e.q();
    }

    public final void b() {
        o3.a aVar = this.f5151c;
        if (aVar != null) {
            aVar.d(this.f5149a);
        } else {
            a();
        }
    }
}
