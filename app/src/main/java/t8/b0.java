package t8;

import androidx.activity.result.a;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a */
    public final int f18729a;

    /* renamed from: b */
    public final int f18730b;

    /* renamed from: c */
    public final long f18731c;

    /* renamed from: d */
    public final long f18732d;

    /* renamed from: e */
    public final long f18733e;

    /* renamed from: f */
    public final long f18734f;

    /* renamed from: g */
    public final long f18735g;

    /* renamed from: h */
    public final long f18736h;

    /* renamed from: i */
    public final long f18737i;

    /* renamed from: j */
    public final long f18738j;

    /* renamed from: k */
    public final int f18739k;

    /* renamed from: l */
    public final int f18740l;

    /* renamed from: m */
    public final int f18741m;

    /* renamed from: n */
    public final long f18742n;

    public b0(int i10, int i11, long j3, long j10, long j11, long j12, long j13, long j14, long j15, long j16, int i12, int i13, int i14, long j17) {
        this.f18729a = i10;
        this.f18730b = i11;
        this.f18731c = j3;
        this.f18732d = j10;
        this.f18733e = j11;
        this.f18734f = j12;
        this.f18735g = j13;
        this.f18736h = j14;
        this.f18737i = j15;
        this.f18738j = j16;
        this.f18739k = i12;
        this.f18740l = i13;
        this.f18741m = i14;
        this.f18742n = j17;
    }

    public final void a(PrintWriter printWriter) {
        printWriter.println("===============BEGIN PICASSO STATS ===============");
        printWriter.println("Memory Cache Stats");
        printWriter.print("  Max Cache Size: ");
        printWriter.println(this.f18729a);
        printWriter.print("  Cache Size: ");
        printWriter.println(this.f18730b);
        printWriter.print("  Cache % Full: ");
        printWriter.println((int) Math.ceil((this.f18730b / this.f18729a) * 100.0f));
        printWriter.print("  Cache Hits: ");
        printWriter.println(this.f18731c);
        printWriter.print("  Cache Misses: ");
        printWriter.println(this.f18732d);
        printWriter.println("Network Stats");
        printWriter.print("  Download Count: ");
        printWriter.println(this.f18739k);
        printWriter.print("  Total Download Size: ");
        printWriter.println(this.f18733e);
        printWriter.print("  Average Download Size: ");
        printWriter.println(this.f18736h);
        printWriter.println("Bitmap Stats");
        printWriter.print("  Total Bitmaps Decoded: ");
        printWriter.println(this.f18740l);
        printWriter.print("  Total Bitmap Size: ");
        printWriter.println(this.f18734f);
        printWriter.print("  Total Transformed Bitmaps: ");
        printWriter.println(this.f18741m);
        printWriter.print("  Total Transformed Bitmap Size: ");
        printWriter.println(this.f18735g);
        printWriter.print("  Average Bitmap Size: ");
        printWriter.println(this.f18737i);
        printWriter.print("  Average Transformed Bitmap Size: ");
        printWriter.println(this.f18738j);
        printWriter.println("===============END PICASSO STATS ===============");
        printWriter.flush();
    }

    public final String toString() {
        StringBuilder c10 = a.c("StatsSnapshot{maxSize=");
        c10.append(this.f18729a);
        c10.append(", size=");
        c10.append(this.f18730b);
        c10.append(", cacheHits=");
        c10.append(this.f18731c);
        c10.append(", cacheMisses=");
        c10.append(this.f18732d);
        c10.append(", downloadCount=");
        c10.append(this.f18739k);
        c10.append(", totalDownloadSize=");
        c10.append(this.f18733e);
        c10.append(", averageDownloadSize=");
        c10.append(this.f18736h);
        c10.append(", totalOriginalBitmapSize=");
        c10.append(this.f18734f);
        c10.append(", totalTransformedBitmapSize=");
        c10.append(this.f18735g);
        c10.append(", averageOriginalBitmapSize=");
        c10.append(this.f18737i);
        c10.append(", averageTransformedBitmapSize=");
        c10.append(this.f18738j);
        c10.append(", originalBitmapCount=");
        c10.append(this.f18740l);
        c10.append(", transformedBitmapCount=");
        c10.append(this.f18741m);
        c10.append(", timeStamp=");
        c10.append(this.f18742n);
        c10.append('}');
        return c10.toString();
    }
}
