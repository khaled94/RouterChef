package m4;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import n3.m0;

/* loaded from: classes.dex */
public final class w4 implements q3 {

    /* renamed from: c */
    public final v4 f14858c;

    /* renamed from: a */
    public final Map<String, t4> f14856a = new LinkedHashMap(16, 0.75f, true);

    /* renamed from: b */
    public long f14857b = 0;

    /* renamed from: d */
    public final int f14859d = 20971520;

    public w4(File file) {
        this.f14858c = new m0(file);
    }

    public w4(v4 v4Var) {
        this.f14858c = v4Var;
    }

    public static int d(InputStream inputStream) {
        return (m(inputStream) << 24) | m(inputStream) | (m(inputStream) << 8) | (m(inputStream) << 16);
    }

    public static long e(InputStream inputStream) {
        return (m(inputStream) & 255) | ((m(inputStream) & 255) << 8) | ((m(inputStream) & 255) << 16) | ((m(inputStream) & 255) << 24) | ((m(inputStream) & 255) << 32) | ((m(inputStream) & 255) << 40) | ((m(inputStream) & 255) << 48) | ((255 & m(inputStream)) << 56);
    }

    public static String g(u4 u4Var) {
        return new String(l(u4Var, e(u4Var)), "UTF-8");
    }

    public static void i(OutputStream outputStream, int i10) {
        outputStream.write(i10 & 255);
        outputStream.write((i10 >> 8) & 255);
        outputStream.write((i10 >> 16) & 255);
        outputStream.write((i10 >> 24) & 255);
    }

    public static void j(OutputStream outputStream, long j3) {
        outputStream.write((byte) j3);
        outputStream.write((byte) (j3 >>> 8));
        outputStream.write((byte) (j3 >>> 16));
        outputStream.write((byte) (j3 >>> 24));
        outputStream.write((byte) (j3 >>> 32));
        outputStream.write((byte) (j3 >>> 40));
        outputStream.write((byte) (j3 >>> 48));
        outputStream.write((byte) (j3 >>> 56));
    }

    public static void k(OutputStream outputStream, String str) {
        byte[] bytes = str.getBytes("UTF-8");
        int length = bytes.length;
        j(outputStream, length);
        outputStream.write(bytes, 0, length);
    }

    public static byte[] l(u4 u4Var, long j3) {
        long j10 = u4Var.f14248s - u4Var.f14249t;
        if (j3 >= 0 && j3 <= j10) {
            int i10 = (int) j3;
            if (i10 == j3) {
                byte[] bArr = new byte[i10];
                new DataInputStream(u4Var).readFully(bArr);
                return bArr;
            }
        }
        StringBuilder sb = new StringBuilder(73);
        sb.append("streamToBytes length=");
        sb.append(j3);
        sb.append(", maxLength=");
        sb.append(j10);
        throw new IOException(sb.toString());
    }

    public static int m(InputStream inputStream) {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    public static final String o(String str) {
        int length = str.length() / 2;
        String valueOf = String.valueOf(String.valueOf(str.substring(0, length).hashCode()));
        String valueOf2 = String.valueOf(String.valueOf(str.substring(length).hashCode()));
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.LinkedHashMap, java.util.Map<java.lang.String, m4.t4>] */
    public final synchronized p3 a(String str) {
        t4 t4Var = (t4) this.f14856a.get(str);
        if (t4Var == null) {
            return null;
        }
        File f10 = f(str);
        try {
            u4 u4Var = new u4(new BufferedInputStream(new FileInputStream(f10)), f10.length());
            try {
                t4 a10 = t4.a(u4Var);
                if (!TextUtils.equals(str, a10.f13915b)) {
                    p4.a("%s: key=%s, found=%s", f10.getAbsolutePath(), str, a10.f13915b);
                    t4 remove = this.f14856a.remove(str);
                    if (remove != null) {
                        this.f14857b -= remove.f13914a;
                    }
                    return null;
                }
                byte[] l10 = l(u4Var, u4Var.f14248s - u4Var.f14249t);
                p3 p3Var = new p3();
                p3Var.f12393a = l10;
                p3Var.f12394b = t4Var.f13916c;
                p3Var.f12395c = t4Var.f13917d;
                p3Var.f12396d = t4Var.f13918e;
                p3Var.f12397e = t4Var.f13919f;
                p3Var.f12398f = t4Var.f13920g;
                List<x3> list = t4Var.f13921h;
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                for (x3 x3Var : list) {
                    treeMap.put(x3Var.f15209a, x3Var.f15210b);
                }
                p3Var.f12399g = treeMap;
                p3Var.f12400h = Collections.unmodifiableList(t4Var.f13921h);
                return p3Var;
            } finally {
                u4Var.close();
            }
        } catch (IOException e10) {
            p4.a("%s: %s", f10.getAbsolutePath(), e10.toString());
            h(str);
            return null;
        }
    }

    public final synchronized void b() {
        long length;
        u4 u4Var;
        File mo29zza = this.f14858c.mo29zza();
        if (!mo29zza.exists()) {
            if (mo29zza.mkdirs()) {
                return;
            }
            p4.b("Unable to create cache dir %s", mo29zza.getAbsolutePath());
            return;
        }
        File[] listFiles = mo29zza.listFiles();
        if (listFiles == null) {
            return;
        }
        for (File file : listFiles) {
            try {
                length = file.length();
                u4Var = new u4(new BufferedInputStream(new FileInputStream(file)), length);
            } catch (IOException unused) {
                file.delete();
            }
            try {
                t4 a10 = t4.a(u4Var);
                a10.f13914a = length;
                n(a10.f13915b, a10);
                u4Var.close();
            } catch (Throwable th) {
                u4Var.close();
                throw th;
                break;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [java.util.LinkedHashMap, java.util.Map<java.lang.String, m4.t4>] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.LinkedHashMap, java.util.Map<java.lang.String, m4.t4>] */
    public final synchronized void c(String str, p3 p3Var) {
        BufferedOutputStream bufferedOutputStream;
        t4 t4Var;
        long j3;
        long j10 = this.f14857b;
        int length = p3Var.f12393a.length;
        int i10 = this.f14859d;
        if (j10 + length <= i10 || length <= i10 * 0.9f) {
            File f10 = f(str);
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(f10));
                t4Var = new t4(str, p3Var);
            } catch (IOException unused) {
                if (!f10.delete()) {
                    p4.a("Could not clean up file %s", f10.getAbsolutePath());
                }
                if (!this.f14858c.mo29zza().exists()) {
                    p4.a("Re-initializing cache after external clearing.", new Object[0]);
                    this.f14856a.clear();
                    this.f14857b = 0L;
                    b();
                    return;
                }
            }
            try {
                i(bufferedOutputStream, 538247942);
                k(bufferedOutputStream, str);
                String str2 = t4Var.f13916c;
                if (str2 == null) {
                    str2 = "";
                }
                k(bufferedOutputStream, str2);
                j(bufferedOutputStream, t4Var.f13917d);
                j(bufferedOutputStream, t4Var.f13918e);
                j(bufferedOutputStream, t4Var.f13919f);
                j(bufferedOutputStream, t4Var.f13920g);
                List<x3> list = t4Var.f13921h;
                if (list != null) {
                    i(bufferedOutputStream, list.size());
                    for (x3 x3Var : list) {
                        k(bufferedOutputStream, x3Var.f15209a);
                        k(bufferedOutputStream, x3Var.f15210b);
                    }
                } else {
                    i(bufferedOutputStream, 0);
                }
                bufferedOutputStream.flush();
                bufferedOutputStream.write(p3Var.f12393a);
                bufferedOutputStream.close();
                t4Var.f13914a = f10.length();
                n(str, t4Var);
                if (this.f14857b >= this.f14859d) {
                    if (p4.f12403a) {
                        p4.c("Pruning old cache entries.", new Object[0]);
                    }
                    long j11 = this.f14857b;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    Iterator it = this.f14856a.entrySet().iterator();
                    int i11 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            j3 = j11;
                            break;
                        }
                        t4 t4Var2 = (t4) ((Map.Entry) it.next()).getValue();
                        if (f(t4Var2.f13915b).delete()) {
                            j3 = j11;
                            this.f14857b -= t4Var2.f13914a;
                        } else {
                            j3 = j11;
                            String str3 = t4Var2.f13915b;
                            p4.a("Could not delete cache entry for key=%s, filename=%s", str3, o(str3));
                        }
                        it.remove();
                        i11++;
                        if (((float) this.f14857b) < this.f14859d * 0.9f) {
                            break;
                        }
                        j11 = j3;
                    }
                    if (p4.f12403a) {
                        p4.c("pruned %d files, %d bytes, %d ms", Integer.valueOf(i11), Long.valueOf(this.f14857b - j3), Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
                    }
                }
            } catch (IOException e10) {
                p4.a("%s", e10.toString());
                bufferedOutputStream.close();
                p4.a("Failed to write header for %s", f10.getAbsolutePath());
                throw new IOException();
            }
        }
    }

    public final File f(String str) {
        return new File(this.f14858c.mo29zza(), o(str));
    }

    public final synchronized void h(String str) {
        boolean delete = f(str).delete();
        t4 remove = this.f14856a.remove(str);
        if (remove != null) {
            this.f14857b -= remove.f13914a;
        }
        if (!delete) {
            p4.a("Could not delete cache entry for key=%s, filename=%s", str, o(str));
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.LinkedHashMap, java.util.Map<java.lang.String, m4.t4>] */
    public final void n(String str, t4 t4Var) {
        if (!this.f14856a.containsKey(str)) {
            this.f14857b += t4Var.f13914a;
        } else {
            this.f14857b = (t4Var.f13914a - ((t4) this.f14856a.get(str)).f13914a) + this.f14857b;
        }
        this.f14856a.put(str, t4Var);
    }
}
