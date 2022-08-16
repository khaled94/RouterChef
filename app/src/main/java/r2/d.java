package r2;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Binder;
import android.text.TextUtils;
import h4.e;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import l3.s;
import m4.dl1;
import m4.es;
import m4.gn1;
import m4.hk1;
import m4.in1;
import m4.jn;
import m4.jn1;
import m4.jo;
import m4.kk1;
import m4.mn1;
import m4.qk1;
import m4.rb1;
import m4.sk1;
import m4.t90;
import m4.tk1;
import m4.tn1;
import m4.u90;
import m4.un1;
import m4.v80;
import m4.yr;
import n2.a;
import n3.k1;
import s4.aa;
import s4.z4;
import y4.d1;
import y4.e1;
import y4.f1;
import y4.s1;

/* loaded from: classes.dex */
public final class d implements d1 {

    /* renamed from: s */
    public static final d f17248s = new d();

    /* renamed from: t */
    public static final /* synthetic */ d f17249t = new d();

    public static String a(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            sb.append(str.charAt(i10));
            if (str2.length() > i10) {
                sb.append(str2.charAt(i10));
            }
        }
        return sb.toString();
    }

    public static int b(a aVar) {
        int ordinal = aVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return 3;
            }
            return ordinal != 2 ? 0 : 2;
        }
        return 1;
    }

    public static File c(File file, boolean z10) {
        if (z10 && file.exists() && !file.isDirectory()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static Object d(z4 z4Var) {
        try {
            return z4Var.zza();
        } catch (SecurityException unused) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return z4Var.zza();
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002a, code lost:
        if (r0 == false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void e(y4.s1 r15, android.database.sqlite.SQLiteDatabase r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String[] r20) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r2.d.e(y4.s1, android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String, java.lang.String, java.lang.String[]):void");
    }

    public static File f(String str, String str2, File file) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return new File(i(str, file), str2);
    }

    public static o2.a g(jn jnVar, boolean z10) {
        List<String> list = jnVar.f10132w;
        if (list != null) {
            new HashSet(list);
        }
        new Date(jnVar.f10129t);
        return new o2.a();
    }

    public static void h(s1 s1Var, SQLiteDatabase sQLiteDatabase) {
        if (s1Var != null) {
            File file = new File(sQLiteDatabase.getPath());
            if (!file.setReadable(false, false)) {
                s1Var.A.a("Failed to turn off database read permission");
            }
            if (!file.setWritable(false, false)) {
                s1Var.A.a("Failed to turn off database write permission");
            }
            if (!file.setReadable(true, true)) {
                s1Var.A.a("Failed to turn on database read permission for owner");
            }
            if (file.setWritable(true, true)) {
                return;
            }
            s1Var.A.a("Failed to turn on database write permission for owner");
            return;
        }
        throw new IllegalArgumentException("Monitor must not be null");
    }

    public static File i(String str, File file) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file2 = new File(file, str);
        c(file2, false);
        return file2;
    }

    public static dl1 j(Context context, gn1 gn1Var, un1 un1Var) {
        v80 v80Var;
        yr<Boolean> yrVar = es.f8107h4;
        jo joVar = jo.f10145d;
        if (((Boolean) joVar.f10148c.a(yrVar)).booleanValue()) {
            v80Var = ((k1) s.B.f5793g.c()).e();
        } else {
            k1 k1Var = (k1) s.B.f5793g.c();
            synchronized (k1Var.f16496a) {
                v80Var = k1Var.f16507l;
            }
        }
        boolean z10 = false;
        if (v80Var != null && v80Var.f14607j) {
            z10 = true;
        }
        if (((Integer) joVar.f10148c.a(es.f8232x4)).intValue() > 0) {
            if (!((Boolean) joVar.f10148c.a(es.f8099g4)).booleanValue() || z10) {
                tn1 a10 = un1Var.a(mn1.AppOpen, context, gn1Var, new rb1(new hk1(), 3));
                tk1 tk1Var = new tk1(new sk1());
                in1 in1Var = a10.f14119a;
                t90 t90Var = u90.f14294a;
                return new kk1(tk1Var, new qk1(in1Var, t90Var), a10.f14120b, ((jn1) a10.f14119a).f10139b.y, t90Var);
            }
        }
        return new sk1();
    }

    public static boolean k(File file) {
        boolean z10;
        if (!file.exists()) {
            return true;
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            int length = listFiles.length;
            z10 = true;
            for (int i10 = 0; i10 < length; i10++) {
                File file2 = listFiles[i10];
                z10 = file2 != null && k(file2) && z10;
            }
        } else {
            z10 = true;
        }
        return file.delete() && z10;
    }

    public static boolean l(File file, byte[] bArr) {
        Throwable th;
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                fileOutputStream2.write(bArr);
                fileOutputStream2.flush();
                e.a(fileOutputStream2);
                return true;
            } catch (IOException unused) {
                fileOutputStream = fileOutputStream2;
                e.a(fileOutputStream);
                return false;
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = fileOutputStream2;
                e.a(fileOutputStream);
                throw th;
            }
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // y4.d1
    /* renamed from: zza */
    public Object mo14zza() {
        e1<Long> e1Var = f1.f20399b;
        return Integer.valueOf((int) aa.f17726t.zza().S());
    }
}
