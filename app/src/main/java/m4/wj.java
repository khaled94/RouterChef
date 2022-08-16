package m4;

import android.os.Environment;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Base64;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import javax.annotation.concurrent.GuardedBy;
import l3.s;
import n3.g1;

/* loaded from: classes.dex */
public final class wj {

    /* renamed from: a */
    public final xj f15031a;
    @GuardedBy("this")

    /* renamed from: b */
    public final cl f15032b;

    /* renamed from: c */
    public final boolean f15033c;

    public wj() {
        this.f15032b = dl.x();
        this.f15033c = false;
        this.f15031a = new xj();
    }

    public wj(xj xjVar) {
        this.f15032b = dl.x();
        this.f15031a = xjVar;
        this.f15033c = ((Boolean) jo.f10145d.f10148c.a(es.f8053a3)).booleanValue();
    }

    public final synchronized void a(vj vjVar) {
        if (this.f15033c) {
            try {
                vjVar.c(this.f15032b);
            } catch (NullPointerException e10) {
                s.B.f5793g.g(e10, "AdMobClearcutLogger.modify");
            }
        }
    }

    public final synchronized void b(int i10) {
        if (!this.f15033c) {
            return;
        }
        if (((Boolean) jo.f10145d.f10148c.a(es.f8060b3)).booleanValue()) {
            d(i10);
        } else {
            e(i10);
        }
    }

    public final synchronized String c(int i10) {
        Objects.requireNonNull(s.B.f5796j);
        return String.format("id=%s,timestamp=%s,event=%s,data=%s\n", ((dl) this.f15032b.f9883t).z(), Long.valueOf(SystemClock.elapsedRealtime()), Integer.valueOf(i10 - 1), Base64.encodeToString(this.f15032b.k().b(), 3));
    }

    public final synchronized void d(int i10) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(externalStorageDirectory, "clearcut_events.txt"), true);
            try {
                try {
                    fileOutputStream.write(c(i10).getBytes());
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused) {
                        g1.a("Could not close Clearcut output stream.");
                    }
                } catch (IOException unused2) {
                    g1.a("Could not write Clearcut to file.");
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused3) {
                        g1.a("Could not close Clearcut output stream.");
                    }
                }
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (IOException unused4) {
                    g1.a("Could not close Clearcut output stream.");
                }
                throw th;
            }
        } catch (FileNotFoundException unused5) {
            g1.a("Could not find file for Clearcut");
        }
    }

    public final synchronized void e(int i10) {
        cl clVar = this.f15032b;
        if (clVar.f9884u) {
            clVar.m();
            clVar.f9884u = false;
        }
        dl.C((dl) clVar.f9883t);
        List<String> b10 = es.b();
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) b10).iterator();
        while (it.hasNext()) {
            for (String str : ((String) it.next()).split(",")) {
                try {
                    arrayList.add(Long.valueOf(str));
                } catch (NumberFormatException unused) {
                    g1.a("Experiment ID is not a number");
                }
            }
        }
        if (clVar.f9884u) {
            clVar.m();
            clVar.f9884u = false;
        }
        dl.B((dl) clVar.f9883t, arrayList);
        xj xjVar = this.f15031a;
        byte[] b11 = this.f15032b.k().b();
        int i11 = i10 - 1;
        try {
            if (xjVar.f15373b) {
                xjVar.f15372a.k0(b11);
                xjVar.f15372a.M(0);
                xjVar.f15372a.A(i11);
                xjVar.f15372a.i0();
                xjVar.f15372a.d();
            }
        } catch (RemoteException e10) {
            g1.f("Clearcut log failed", e10);
        }
        String valueOf = String.valueOf(Integer.toString(i11, 10));
        g1.a(valueOf.length() != 0 ? "Logging Event with event code : ".concat(valueOf) : new String("Logging Event with event code : "));
    }
}
