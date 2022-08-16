package e1;

import android.os.Bundle;
import android.view.View;
import androidx.preference.c;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x;
import java.util.Objects;

@Deprecated
/* loaded from: classes.dex */
public final class f extends x {

    /* renamed from: f */
    public final RecyclerView f4348f;

    /* renamed from: g */
    public final x.a f4349g = this.f2219e;

    /* renamed from: h */
    public final a f4350h = new a();

    /* loaded from: classes.dex */
    public class a extends m0.a {
        public a() {
            f.this = r1;
        }

        @Override // m0.a
        public final void d(View view, n0.f fVar) {
            f.this.f4349g.d(view, fVar);
            Objects.requireNonNull(f.this.f4348f);
            RecyclerView.a0 K = RecyclerView.K(view);
            int e10 = K != null ? K.e() : -1;
            RecyclerView.e adapter = f.this.f4348f.getAdapter();
            if (!(adapter instanceof c)) {
                return;
            }
            ((c) adapter).j(e10);
        }

        @Override // m0.a
        public final boolean g(View view, int i10, Bundle bundle) {
            return f.this.f4349g.g(view, i10, bundle);
        }
    }

    public f(RecyclerView recyclerView) {
        super(recyclerView);
        this.f4348f = recyclerView;
    }

    @Override // androidx.recyclerview.widget.x
    public final m0.a j() {
        return this.f4350h;
    }
}
