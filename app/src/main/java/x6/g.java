package x6;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import u6.a0;
import v6.d;
import z6.b;
import z6.c;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: g */
    public static final Charset f20056g = Charset.forName("UTF-8");

    /* renamed from: h */
    public static final int f20057h = 15;

    /* renamed from: i */
    public static final d f20058i = new d();

    /* renamed from: j */
    public static final Comparator<? super File> f20059j = e.f20054s;

    /* renamed from: k */
    public static final d f20060k = d.f20053a;

    /* renamed from: a */
    public final AtomicInteger f20061a = new AtomicInteger(0);

    /* renamed from: b */
    public final File f20062b;

    /* renamed from: c */
    public final File f20063c;

    /* renamed from: d */
    public final File f20064d;

    /* renamed from: e */
    public final File f20065e;

    /* renamed from: f */
    public final c f20066f;

    public g(File file, c cVar) {
        File file2 = new File(file, "report-persistence");
        this.f20062b = new File(file2, "sessions");
        this.f20063c = new File(file2, "priority-reports");
        this.f20064d = new File(file2, "reports");
        this.f20065e = new File(file2, "native-reports");
        this.f20066f = cVar;
    }

    public static List<File> a(List<File>... listArr) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        for (List<File> list : listArr) {
            i10 += list.size();
        }
        arrayList.ensureCapacity(i10);
        for (List<File> list2 : listArr) {
            arrayList.addAll(list2);
        }
        return arrayList;
    }

    public static List<File> c(File file, FileFilter fileFilter) {
        if (!file.isDirectory()) {
            return Collections.emptyList();
        }
        File[] listFiles = fileFilter == null ? file.listFiles() : file.listFiles(fileFilter);
        return listFiles != null ? Arrays.asList(listFiles) : Collections.emptyList();
    }

    public static List<File> d(File file, FilenameFilter filenameFilter) {
        if (!file.isDirectory()) {
            return Collections.emptyList();
        }
        File[] listFiles = filenameFilter == null ? file.listFiles() : file.listFiles(filenameFilter);
        return listFiles != null ? Arrays.asList(listFiles) : Collections.emptyList();
    }

    public static File g(File file) {
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        throw new IOException("Could not create directory " + file);
    }

    public static String h(File file) {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read <= 0) {
                    String str = new String(byteArrayOutputStream.toByteArray(), f20056g);
                    fileInputStream.close();
                    return str;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public static void i(File file) {
        if (file == null) {
            return;
        }
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                i(file2);
            }
        }
        file.delete();
    }

    public static void j(File file, String str) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f20056g);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final List<File> b() {
        List[] listArr = {a(c(this.f20063c, null), c(this.f20065e, null)), c(this.f20064d, null)};
        for (int i10 = 0; i10 < 2; i10++) {
            Collections.sort(listArr[i10], f20059j);
        }
        return a(listArr);
    }

    public final File e(String str) {
        return new File(this.f20062b, str);
    }

    public final void f(a0.e.d dVar, String str, boolean z10) {
        int i10 = ((b) this.f20066f).b().a().f284a;
        File e10 = e(str);
        Objects.requireNonNull(f20058i);
        j7.d dVar2 = d.f19794a;
        Objects.requireNonNull(dVar2);
        StringWriter stringWriter = new StringWriter();
        try {
            dVar2.a(dVar, stringWriter);
        } catch (IOException unused) {
        }
        try {
            j(new File(e10, "event" + String.format(Locale.US, "%010d", Integer.valueOf(this.f20061a.getAndIncrement())) + (z10 ? "_" : "")), stringWriter.toString());
        } catch (IOException e11) {
            Log.w("FirebaseCrashlytics", "Could not persist event for session " + str, e11);
        }
        List<File> d5 = d(e10, c.f20052a);
        Collections.sort(d5, f.f20055s);
        int size = d5.size();
        for (File file : d5) {
            if (size <= i10) {
                return;
            }
            i(file);
            size--;
        }
    }
}
