package m4;

import d4.m;
import m3.g;
import n3.g1;

/* loaded from: classes.dex */
public final class d00 extends aa0 {

    /* renamed from: u */
    public final Object f7163u = new Object();

    /* renamed from: v */
    public boolean f7164v = false;

    /* renamed from: w */
    public int f7165w = 0;

    public final a00 g() {
        a00 a00Var = new a00(this);
        synchronized (this.f7163u) {
            f(new b00(a00Var), new g(a00Var));
            m.j(this.f7165w >= 0);
            this.f7165w++;
        }
        return a00Var;
    }

    public final void i() {
        synchronized (this.f7163u) {
            m.j(this.f7165w >= 0);
            g1.a("Releasing root reference. JS Engine will be destroyed once other references are released.");
            this.f7164v = true;
            j();
        }
    }

    public final void j() {
        synchronized (this.f7163u) {
            m.j(this.f7165w >= 0);
            if (!this.f7164v || this.f7165w != 0) {
                g1.a("There are still references to the engine. Not destroying.");
            } else {
                g1.a("No reference is left (including root). Cleaning up engine.");
                f(new c00(), new eb());
            }
        }
    }

    public final void k() {
        synchronized (this.f7163u) {
            m.j(this.f7165w > 0);
            g1.a("Releasing 1 reference for JS Engine");
            this.f7165w--;
            j();
        }
    }
}
