package h5;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.Objects;

/* loaded from: classes.dex */
public final class b extends FloatingActionButton.a {

    /* renamed from: a */
    public final /* synthetic */ int f5083a;

    /* renamed from: b */
    public final /* synthetic */ BottomAppBar f5084b;

    /* loaded from: classes.dex */
    public class a extends FloatingActionButton.a {
        public a() {
            b.this = r1;
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.a
        public final void b() {
            BottomAppBar bottomAppBar = b.this.f5084b;
            int i10 = BottomAppBar.f3028t0;
            Objects.requireNonNull(bottomAppBar);
        }
    }

    public b(BottomAppBar bottomAppBar, int i10) {
        this.f5084b = bottomAppBar;
        this.f5083a = i10;
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.a
    public final void a(FloatingActionButton floatingActionButton) {
        floatingActionButton.setTranslationX(this.f5084b.C(this.f5083a));
        floatingActionButton.m(new a(), true);
    }
}
