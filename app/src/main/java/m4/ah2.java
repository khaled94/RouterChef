package m4;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public abstract class ah2 implements jg2 {

    /* renamed from: b */
    public hg2 f6160b;

    /* renamed from: c */
    public hg2 f6161c;

    /* renamed from: d */
    public hg2 f6162d;

    /* renamed from: e */
    public hg2 f6163e;

    /* renamed from: f */
    public ByteBuffer f6164f;

    /* renamed from: g */
    public ByteBuffer f6165g;

    /* renamed from: h */
    public boolean f6166h;

    public ah2() {
        ByteBuffer byteBuffer = jg2.f10060a;
        this.f6164f = byteBuffer;
        this.f6165g = byteBuffer;
        hg2 hg2Var = hg2.f9329e;
        this.f6162d = hg2Var;
        this.f6163e = hg2Var;
        this.f6160b = hg2Var;
        this.f6161c = hg2Var;
    }

    @Override // m4.jg2
    public ByteBuffer a() {
        ByteBuffer byteBuffer = this.f6165g;
        this.f6165g = jg2.f10060a;
        return byteBuffer;
    }

    @Override // m4.jg2
    public final hg2 b(hg2 hg2Var) {
        this.f6162d = hg2Var;
        this.f6163e = i(hg2Var);
        return e() ? this.f6163e : hg2.f9329e;
    }

    @Override // m4.jg2
    public final void c() {
        this.f6165g = jg2.f10060a;
        this.f6166h = false;
        this.f6160b = this.f6162d;
        this.f6161c = this.f6163e;
        k();
    }

    @Override // m4.jg2
    public final void d() {
        c();
        this.f6164f = jg2.f10060a;
        hg2 hg2Var = hg2.f9329e;
        this.f6162d = hg2Var;
        this.f6163e = hg2Var;
        this.f6160b = hg2Var;
        this.f6161c = hg2Var;
        m();
    }

    @Override // m4.jg2
    public boolean e() {
        return this.f6163e != hg2.f9329e;
    }

    @Override // m4.jg2
    public boolean f() {
        return this.f6166h && this.f6165g == jg2.f10060a;
    }

    @Override // m4.jg2
    public final void g() {
        this.f6166h = true;
        l();
    }

    public abstract hg2 i(hg2 hg2Var);

    public final ByteBuffer j(int i10) {
        if (this.f6164f.capacity() < i10) {
            this.f6164f = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f6164f.clear();
        }
        ByteBuffer byteBuffer = this.f6164f;
        this.f6165g = byteBuffer;
        return byteBuffer;
    }

    public void k() {
    }

    public void l() {
    }

    public void m() {
    }
}
