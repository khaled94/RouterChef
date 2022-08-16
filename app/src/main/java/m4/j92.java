package m4;

import java.io.IOException;
import m4.j92;
import m4.m92;

/* loaded from: classes.dex */
public class j92<MessageType extends m92<MessageType, BuilderType>, BuilderType extends j92<MessageType, BuilderType>> extends a82<MessageType, BuilderType> {

    /* renamed from: s */
    public final MessageType f9882s;

    /* renamed from: t */
    public MessageType f9883t;

    /* renamed from: u */
    public boolean f9884u = false;

    public j92(MessageType messagetype) {
        this.f9882s = messagetype;
        this.f9883t = (MessageType) messagetype.u(4, null);
    }

    public static final void g(MessageType messagetype, MessageType messagetype2) {
        ya2.f15637c.a(messagetype.getClass()).d(messagetype, messagetype2);
    }

    @Override // m4.ra2
    public final /* synthetic */ qa2 a() {
        return this.f9882s;
    }

    public final Object clone() {
        j92 j92Var = (j92) this.f9882s.u(5, null);
        j92Var.h(l());
        return j92Var;
    }

    public final BuilderType h(MessageType messagetype) {
        if (this.f9884u) {
            m();
            this.f9884u = false;
        }
        g(this.f9883t, messagetype);
        return this;
    }

    public final j92 i(byte[] bArr, int i10, z82 z82Var) {
        if (this.f9884u) {
            m();
            this.f9884u = false;
        }
        try {
            ya2.f15637c.a(this.f9883t.getClass()).e(this.f9883t, bArr, 0, i10, new e82(z82Var));
            return this;
        } catch (IOException e10) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e10);
        } catch (IndexOutOfBoundsException unused) {
            throw x92.h();
        } catch (x92 e11) {
            throw e11;
        }
    }

    public final MessageType k() {
        MessageType l10 = l();
        if (l10.p()) {
            return l10;
        }
        throw new ob2();
    }

    public final MessageType l() {
        if (this.f9884u) {
            return this.f9883t;
        }
        MessageType messagetype = this.f9883t;
        ya2.f15637c.a(messagetype.getClass()).c(messagetype);
        this.f9884u = true;
        return this.f9883t;
    }

    public final void m() {
        MessageType messagetype = (MessageType) this.f9883t.u(4, null);
        ya2.f15637c.a(messagetype.getClass()).d(messagetype, this.f9883t);
        this.f9883t = messagetype;
    }
}
