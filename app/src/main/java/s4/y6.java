package s4;

import java.io.IOException;
import k9.p;
import s4.b7;
import s4.y6;

/* loaded from: classes.dex */
public class y6<MessageType extends b7<MessageType, BuilderType>, BuilderType extends y6<MessageType, BuilderType>> extends w5<MessageType, BuilderType> {

    /* renamed from: s */
    public final MessageType f18204s;

    /* renamed from: t */
    public MessageType f18205t;

    /* renamed from: u */
    public boolean f18206u = false;

    public y6(MessageType messagetype) {
        this.f18204s = messagetype;
        this.f18205t = (MessageType) messagetype.r(4);
    }

    @Override // s4.e8
    public final /* bridge */ /* synthetic */ d8 c() {
        return this.f18204s;
    }

    public final MessageType f() {
        MessageType g10 = g();
        boolean z10 = true;
        byte byteValue = ((Byte) g10.r(1)).byteValue();
        if (byteValue != 1) {
            if (byteValue == 0) {
                z10 = false;
            } else {
                z10 = l8.f17974c.a(g10.getClass()).e(g10);
                g10.r(2);
            }
        }
        if (z10) {
            return g10;
        }
        throw new p();
    }

    public final MessageType g() {
        if (this.f18206u) {
            return this.f18205t;
        }
        MessageType messagetype = this.f18205t;
        l8.f17974c.a(messagetype.getClass()).c(messagetype);
        this.f18206u = true;
        return this.f18205t;
    }

    public final void h() {
        MessageType messagetype = (MessageType) this.f18205t.r(4);
        l8.f17974c.a(messagetype.getClass()).d(messagetype, this.f18205t);
        this.f18205t = messagetype;
    }

    /* renamed from: i */
    public final BuilderType clone() {
        BuilderType buildertype = (BuilderType) this.f18204s.r(5);
        buildertype.k(g());
        return buildertype;
    }

    public final BuilderType k(MessageType messagetype) {
        if (this.f18206u) {
            h();
            this.f18206u = false;
        }
        MessageType messagetype2 = this.f18205t;
        l8.f17974c.a(messagetype2.getClass()).d(messagetype2, messagetype);
        return this;
    }

    public final y6 l(byte[] bArr, int i10, o6 o6Var) {
        if (this.f18206u) {
            h();
            this.f18206u = false;
        }
        try {
            l8.f17974c.a(this.f18205t.getClass()).f(this.f18205t, bArr, 0, i10, new a6(o6Var));
            return this;
        } catch (IOException e10) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e10);
        } catch (IndexOutOfBoundsException unused) {
            throw k7.d();
        } catch (k7 e11) {
            throw e11;
        }
    }
}
