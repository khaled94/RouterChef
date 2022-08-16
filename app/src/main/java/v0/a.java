package v0;

import android.widget.EditText;
import l0.g;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    public final C0142a f19745a;

    /* renamed from: v0.a$a */
    /* loaded from: classes.dex */
    public static class C0142a extends b {

        /* renamed from: a */
        public final EditText f19746a;

        /* renamed from: b */
        public final g f19747b;

        public C0142a(EditText editText) {
            this.f19746a = editText;
            g gVar = new g(editText);
            this.f19747b = gVar;
            editText.addTextChangedListener(gVar);
            if (v0.b.f19749b == null) {
                synchronized (v0.b.f19748a) {
                    if (v0.b.f19749b == null) {
                        v0.b.f19749b = new v0.b();
                    }
                }
            }
            editText.setEditableFactory(v0.b.f19749b);
        }
    }

    /* loaded from: classes.dex */
    public static class b {
    }

    public a(EditText editText) {
        g.e(editText, "editText cannot be null");
        this.f19745a = new C0142a(editText);
    }
}
