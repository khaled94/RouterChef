package m4;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.ParametersAreNonnullByDefault;
import l3.s;
import n3.g1;
import n3.s1;

@ParametersAreNonnullByDefault
@Deprecated
/* loaded from: classes.dex */
public final class hs {

    /* renamed from: d */
    public String f9437d;

    /* renamed from: e */
    public Context f9438e;

    /* renamed from: f */
    public String f9439f;

    /* renamed from: h */
    public AtomicBoolean f9441h;

    /* renamed from: i */
    public File f9442i;

    /* renamed from: a */
    public final BlockingQueue<qs> f9434a = new ArrayBlockingQueue(100);

    /* renamed from: b */
    public final LinkedHashMap<String, String> f9435b = new LinkedHashMap<>();

    /* renamed from: c */
    public final Map<String, ns> f9436c = new HashMap();

    /* renamed from: g */
    public final HashSet<String> f9440g = new HashSet<>(Arrays.asList("noop", "activeViewPingSent", "viewabilityChanged", "visibilityChanged"));

    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.HashMap, java.util.Map<java.lang.String, m4.ns>] */
    public final Map<String, String> a(Map<String, String> map, Map<String, String> map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        for (Map.Entry<String, String> entry : map2.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            String str = (String) linkedHashMap.get(key);
            ns nsVar = (ns) this.f9436c.get(key);
            if (nsVar == null) {
                nsVar = ns.f11909a;
            }
            linkedHashMap.put(key, nsVar.a(str, value));
        }
        return linkedHashMap;
    }

    public final void b(Map<String, String> map, u8 u8Var) {
        Throwable th;
        FileOutputStream fileOutputStream;
        IOException e10;
        Uri.Builder buildUpon = Uri.parse(this.f9437d).buildUpon();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        String uri = buildUpon.build().toString();
        if (u8Var != null) {
            StringBuilder sb = new StringBuilder(uri);
            if (!TextUtils.isEmpty((String) u8Var.f14267s)) {
                sb.append("&it=");
                sb.append((String) u8Var.f14267s);
            }
            if (!TextUtils.isEmpty((String) u8Var.f14268t)) {
                sb.append("&blat=");
                sb.append((String) u8Var.f14268t);
            }
            uri = sb.toString();
        }
        if (!this.f9441h.get()) {
            s1 s1Var = s.B.f5789c;
            s1.m(this.f9438e, this.f9439f, uri);
            return;
        }
        File file = this.f9442i;
        if (file == null) {
            g1.j("CsiReporter: File doesn't exists. Cannot write CSI data to file.");
            return;
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, true);
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
            }
        } catch (IOException e11) {
            e10 = e11;
        }
        try {
            fileOutputStream.write(uri.getBytes());
            fileOutputStream.write(10);
            try {
                fileOutputStream.close();
            } catch (IOException e12) {
                g1.k("CsiReporter: Cannot close file: sdk_csi_data.txt.", e12);
            }
        } catch (IOException e13) {
            e10 = e13;
            fileOutputStream2 = fileOutputStream;
            g1.k("CsiReporter: Cannot write to file: sdk_csi_data.txt.", e10);
            if (fileOutputStream2 == null) {
                return;
            }
            try {
                fileOutputStream2.close();
            } catch (IOException e14) {
                g1.k("CsiReporter: Cannot close file: sdk_csi_data.txt.", e14);
            }
        } catch (Throwable th3) {
            th = th3;
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e15) {
                    g1.k("CsiReporter: Cannot close file: sdk_csi_data.txt.", e15);
                }
            }
            throw th;
        }
    }
}
