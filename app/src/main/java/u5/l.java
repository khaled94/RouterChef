package u5;

import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;
import x5.d;
import x5.f;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: c */
    public float f19135c;

    /* renamed from: e */
    public WeakReference<b> f19137e;

    /* renamed from: f */
    public d f19138f;

    /* renamed from: a */
    public final TextPaint f19133a = new TextPaint(1);

    /* renamed from: b */
    public final a f19134b = new a();

    /* renamed from: d */
    public boolean f19136d = true;

    /* loaded from: classes.dex */
    public class a extends f {
        public a() {
            l.this = r1;
        }

        @Override // x5.f
        public final void c(int i10) {
            l lVar = l.this;
            lVar.f19136d = true;
            b bVar = lVar.f19137e.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // x5.f
        public final void d(Typeface typeface, boolean z10) {
            if (z10) {
                return;
            }
            l lVar = l.this;
            lVar.f19136d = true;
            b bVar = lVar.f19137e.get();
            if (bVar == null) {
                return;
            }
            bVar.a();
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public l(b bVar) {
        this.f19137e = new WeakReference<>(null);
        this.f19137e = new WeakReference<>(bVar);
    }

    public final float a(String str) {
        if (!this.f19136d) {
            return this.f19135c;
        }
        float measureText = str == null ? 0.0f : this.f19133a.measureText((CharSequence) str, 0, str.length());
        this.f19135c = measureText;
        this.f19136d = false;
        return measureText;
    }
}
