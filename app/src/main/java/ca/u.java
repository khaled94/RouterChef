package ca;

import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a */
    public final byte[] f2878a;

    /* renamed from: b */
    public int f2879b;

    /* renamed from: c */
    public int f2880c;

    /* renamed from: d */
    public boolean f2881d;

    /* renamed from: e */
    public boolean f2882e;

    /* renamed from: f */
    public u f2883f;

    /* renamed from: g */
    public u f2884g;

    public u() {
        this.f2878a = new byte[8192];
        this.f2882e = true;
        this.f2881d = false;
    }

    public u(byte[] bArr, int i10, int i11) {
        this.f2878a = bArr;
        this.f2879b = i10;
        this.f2880c = i11;
        this.f2881d = true;
        this.f2882e = false;
    }

    @Nullable
    public final u a() {
        u uVar = this.f2883f;
        u uVar2 = uVar != this ? uVar : null;
        u uVar3 = this.f2884g;
        uVar3.f2883f = uVar;
        this.f2883f.f2884g = uVar3;
        this.f2883f = null;
        this.f2884g = null;
        return uVar2;
    }

    public final u b(u uVar) {
        uVar.f2884g = this;
        uVar.f2883f = this.f2883f;
        this.f2883f.f2884g = uVar;
        this.f2883f = uVar;
        return uVar;
    }

    public final u c() {
        this.f2881d = true;
        return new u(this.f2878a, this.f2879b, this.f2880c);
    }

    public final void d(u uVar, int i10) {
        if (uVar.f2882e) {
            int i11 = uVar.f2880c;
            if (i11 + i10 > 8192) {
                if (uVar.f2881d) {
                    throw new IllegalArgumentException();
                }
                int i12 = uVar.f2879b;
                if ((i11 + i10) - i12 > 8192) {
                    throw new IllegalArgumentException();
                }
                byte[] bArr = uVar.f2878a;
                System.arraycopy(bArr, i12, bArr, 0, i11 - i12);
                uVar.f2880c -= uVar.f2879b;
                uVar.f2879b = 0;
            }
            System.arraycopy(this.f2878a, this.f2879b, uVar.f2878a, uVar.f2880c, i10);
            uVar.f2880c += i10;
            this.f2879b += i10;
            return;
        }
        throw new IllegalArgumentException();
    }
}
