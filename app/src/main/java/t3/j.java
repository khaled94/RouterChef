package t3;

import n3.g1;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a */
    public final /* synthetic */ String f18595a;

    /* renamed from: b */
    public final /* synthetic */ a f18596b;

    public j(a aVar, String str) {
        this.f18596b = aVar;
        this.f18595a = str;
    }

    public final void a(String str) {
        String valueOf = String.valueOf(str);
        g1.j(valueOf.length() != 0 ? "Failed to generate query info for the tagging library, error: ".concat(valueOf) : new String("Failed to generate query info for the tagging library, error: "));
        this.f18596b.f18567b.evaluateJavascript(String.format("window.postMessage({'paw_id': '%1$s', 'error': '%2$s'}, '*');", this.f18595a, str), null);
    }
}
