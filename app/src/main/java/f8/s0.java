package f8;

import com.raouf.routerchef.LineDetails;
import com.raouf.routerchef.PersonalizedSpeedLimit;
import j8.b;
import j8.c;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public final /* synthetic */ class s0 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f4684s;

    /* renamed from: t */
    public final /* synthetic */ Object f4685t;

    public /* synthetic */ s0(Object obj, int i10) {
        this.f4684s = i10;
        this.f4685t = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4684s) {
            case 0:
                LineDetails lineDetails = (LineDetails) this.f4685t;
                lineDetails.f3552c0.setVisibility(4);
                lineDetails.f3555f0.setVisibility(0);
                return;
            case 1:
                ((PersonalizedSpeedLimit) this.f4685t).f3602g0.b();
                return;
            default:
                b bVar = (b) this.f4685t;
                Objects.requireNonNull(bVar);
                try {
                    Process exec = Runtime.getRuntime().exec("ip neigh");
                    exec.waitFor();
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(exec.getInputStream()));
                    String readLine = bufferedReader.readLine();
                    c cVar = new c(b.c(bVar.f5494a), b.e(bVar.f5494a), b.d());
                    if (readLine == null) {
                        bVar.h(cVar);
                        Iterator<c> it = bVar.f5496c.iterator();
                        while (it.hasNext()) {
                            c next = it.next();
                            next.f5508i = next.f5507h;
                            next.a();
                        }
                        bVar.f5495b.f(bVar.f5496c);
                        return;
                    }
                    bVar.f5496c.clear();
                    bVar.f5496c.add(cVar);
                    while (readLine != null) {
                        String readLine2 = bufferedReader.readLine();
                        if (!readLine.contains("FAILED") && !readLine.contains("INCOMPLETE")) {
                            bVar.a(readLine.split(" ")[0], readLine.split(" ")[4]);
                        }
                        readLine = readLine2;
                    }
                    bVar.f5495b.i(bVar.f5496c);
                    bVar.g(false);
                    return;
                } catch (IOException | InterruptedException e10) {
                    e10.printStackTrace();
                    bVar.f5495b.A(e10.getMessage());
                    return;
                }
        }
    }
}
