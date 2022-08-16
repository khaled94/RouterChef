package x7;

import e8.c;
import j0.d;
import java.io.IOException;
import java.io.StringWriter;

/* loaded from: classes.dex */
public abstract class l {
    public final q d() {
        if (this instanceof q) {
            return (q) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            c cVar = new c(stringWriter);
            cVar.f4446x = true;
            d.d(this, cVar);
            return stringWriter.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }
}
