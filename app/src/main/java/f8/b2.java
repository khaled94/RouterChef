package f8;

import android.content.Context;
import com.raouf.routerchef.RouterDevices;
import g8.e;
import i8.f;
import j8.c;
import java.util.ArrayList;
import java.util.Objects;
import l8.b;
import z3.n;

/* loaded from: classes.dex */
public final class b2 extends e {

    /* renamed from: f */
    public final /* synthetic */ RouterDevices f4564f;

    /* loaded from: classes.dex */
    public class a extends f {

        /* renamed from: d */
        public final /* synthetic */ c f4565d;

        /* renamed from: e */
        public final /* synthetic */ int f4566e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, c cVar, c cVar2, int i10) {
            super(context, cVar);
            b2.this = r1;
            this.f4565d = cVar2;
            this.f4566e = i10;
        }

        @Override // i8.f
        public final void a(l8.a aVar) {
            ((b) b2.this.f4564f.f3613c0.f20958b).c(aVar);
            c cVar = this.f4565d;
            cVar.f5504e = null;
            b2.this.f4564f.f3612b0.j(cVar, this.f4566e);
        }

        @Override // i8.f
        public final void b(l8.a aVar) {
            n nVar = b2.this.f4564f.f3613c0;
            Objects.requireNonNull(nVar);
            aVar.f5820a = nVar.a(aVar.f5820a);
            ((b) nVar.f20958b).a(aVar);
            c cVar = this.f4565d;
            cVar.f5504e = aVar.f5821b;
            b2.this.f4564f.f3612b0.j(cVar, this.f4566e);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(RouterDevices routerDevices, Context context, ArrayList arrayList) {
        super(context, arrayList);
        this.f4564f = routerDevices;
    }

    @Override // g8.e
    public final void h(c cVar, int i10) {
        new a(this.f4564f.f3614d0, cVar, cVar, i10).f5280a.show();
    }
}
