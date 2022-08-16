package s8;

import android.app.usage.NetworkStats;
import java.math.BigDecimal;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a */
    public float f18378a;

    /* renamed from: b */
    public float f18379b;

    /* renamed from: c */
    public float f18380c;

    /* renamed from: d */
    public String f18381d;

    /* renamed from: e */
    public String f18382e;

    /* renamed from: f */
    public String f18383f;

    /* loaded from: classes.dex */
    public class a {

        /* renamed from: a */
        public float f18384a;

        /* renamed from: b */
        public String f18385b;

        public a(long j3) {
            float floatValue = BigDecimal.valueOf(((float) j3) / 1048576.0f).setScale(2, 4).floatValue();
            this.f18384a = floatValue;
            this.f18385b = "MB";
            if (floatValue > 999.0f) {
                this.f18385b = "GB";
                this.f18384a = BigDecimal.valueOf(floatValue / 1024.0f).setScale(2, 4).floatValue();
            }
        }
    }

    public c(long j3, long j10) {
        a aVar = new a(j3);
        this.f18378a = aVar.f18384a;
        this.f18381d = aVar.f18385b;
        a aVar2 = new a(j10);
        this.f18379b = aVar2.f18384a;
        this.f18382e = aVar2.f18385b;
        a aVar3 = new a(j3 + j10);
        this.f18380c = aVar3.f18384a;
        this.f18383f = aVar3.f18385b;
    }

    public c(NetworkStats.Bucket bucket, boolean z10) {
        if (!z10) {
            a aVar = new a(bucket.getTxBytes());
            this.f18378a = aVar.f18384a;
            this.f18381d = aVar.f18385b;
            a aVar2 = new a(bucket.getRxBytes());
            this.f18379b = aVar2.f18384a;
            this.f18382e = aVar2.f18385b;
            a aVar3 = new a(bucket.getRxBytes() + bucket.getTxBytes());
            this.f18380c = aVar3.f18384a;
            this.f18383f = aVar3.f18385b;
        }
    }
}
