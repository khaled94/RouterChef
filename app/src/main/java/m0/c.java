package m0;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;
import java.util.Objects;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a */
    public final e f5853a;

    /* loaded from: classes.dex */
    public static final class a implements b {

        /* renamed from: a */
        public final ContentInfo.Builder f5854a;

        public a(ClipData clipData, int i10) {
            this.f5854a = new ContentInfo.Builder(clipData, i10);
        }

        @Override // m0.c.b
        public final c a() {
            return new c(new d(this.f5854a.build()));
        }

        @Override // m0.c.b
        public final void b(Bundle bundle) {
            this.f5854a.setExtras(bundle);
        }

        @Override // m0.c.b
        public final void c(Uri uri) {
            this.f5854a.setLinkUri(uri);
        }

        @Override // m0.c.b
        public final void d(int i10) {
            this.f5854a.setFlags(i10);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        c a();

        void b(Bundle bundle);

        void c(Uri uri);

        void d(int i10);
    }

    /* renamed from: m0.c$c */
    /* loaded from: classes.dex */
    public static final class C0094c implements b {

        /* renamed from: a */
        public ClipData f5855a;

        /* renamed from: b */
        public int f5856b;

        /* renamed from: c */
        public int f5857c;

        /* renamed from: d */
        public Uri f5858d;

        /* renamed from: e */
        public Bundle f5859e;

        public C0094c(ClipData clipData, int i10) {
            this.f5855a = clipData;
            this.f5856b = i10;
        }

        @Override // m0.c.b
        public final c a() {
            return new c(new f(this));
        }

        @Override // m0.c.b
        public final void b(Bundle bundle) {
            this.f5859e = bundle;
        }

        @Override // m0.c.b
        public final void c(Uri uri) {
            this.f5858d = uri;
        }

        @Override // m0.c.b
        public final void d(int i10) {
            this.f5857c = i10;
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements e {

        /* renamed from: a */
        public final ContentInfo f5860a;

        public d(ContentInfo contentInfo) {
            Objects.requireNonNull(contentInfo);
            this.f5860a = contentInfo;
        }

        @Override // m0.c.e
        public final ClipData a() {
            return this.f5860a.getClip();
        }

        @Override // m0.c.e
        public final int b() {
            return this.f5860a.getFlags();
        }

        @Override // m0.c.e
        public final ContentInfo c() {
            return this.f5860a;
        }

        @Override // m0.c.e
        public final int d() {
            return this.f5860a.getSource();
        }

        public final String toString() {
            StringBuilder c10 = androidx.activity.result.a.c("ContentInfoCompat{");
            c10.append(this.f5860a);
            c10.append("}");
            return c10.toString();
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        ClipData a();

        int b();

        ContentInfo c();

        int d();
    }

    /* loaded from: classes.dex */
    public static final class f implements e {

        /* renamed from: a */
        public final ClipData f5861a;

        /* renamed from: b */
        public final int f5862b;

        /* renamed from: c */
        public final int f5863c;

        /* renamed from: d */
        public final Uri f5864d;

        /* renamed from: e */
        public final Bundle f5865e;

        public f(C0094c c0094c) {
            ClipData clipData = c0094c.f5855a;
            Objects.requireNonNull(clipData);
            this.f5861a = clipData;
            int i10 = c0094c.f5856b;
            if (i10 >= 0) {
                if (i10 > 5) {
                    throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", "source", 0, 5));
                }
                this.f5862b = i10;
                int i11 = c0094c.f5857c;
                if ((i11 & 1) == i11) {
                    this.f5863c = i11;
                    this.f5864d = c0094c.f5858d;
                    this.f5865e = c0094c.f5859e;
                    return;
                }
                StringBuilder c10 = androidx.activity.result.a.c("Requested flags 0x");
                c10.append(Integer.toHexString(i11));
                c10.append(", but only 0x");
                c10.append(Integer.toHexString(1));
                c10.append(" are allowed");
                throw new IllegalArgumentException(c10.toString());
            }
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", "source", 0, 5));
        }

        @Override // m0.c.e
        public final ClipData a() {
            return this.f5861a;
        }

        @Override // m0.c.e
        public final int b() {
            return this.f5863c;
        }

        @Override // m0.c.e
        public final ContentInfo c() {
            return null;
        }

        @Override // m0.c.e
        public final int d() {
            return this.f5862b;
        }

        public final String toString() {
            String str;
            String str2;
            StringBuilder c10 = androidx.activity.result.a.c("ContentInfoCompat{clip=");
            c10.append(this.f5861a.getDescription());
            c10.append(", source=");
            int i10 = this.f5862b;
            if (i10 == 0) {
                str = "SOURCE_APP";
            } else if (i10 == 1) {
                str = "SOURCE_CLIPBOARD";
            } else if (i10 == 2) {
                str = "SOURCE_INPUT_METHOD";
            } else if (i10 == 3) {
                str = "SOURCE_DRAG_AND_DROP";
            } else if (i10 != 4) {
                str = i10 != 5 ? String.valueOf(i10) : "SOURCE_PROCESS_TEXT";
            } else {
                str = "SOURCE_AUTOFILL";
            }
            c10.append(str);
            c10.append(", flags=");
            int i11 = this.f5863c;
            c10.append((i11 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i11));
            String str3 = "";
            if (this.f5864d == null) {
                str2 = str3;
            } else {
                StringBuilder c11 = androidx.activity.result.a.c(", hasLinkUri(");
                c11.append(this.f5864d.toString().length());
                c11.append(")");
                str2 = c11.toString();
            }
            c10.append(str2);
            if (this.f5865e != null) {
                str3 = ", hasExtras";
            }
            return s.b.b(c10, str3, "}");
        }
    }

    public c(e eVar) {
        this.f5853a = eVar;
    }

    public final String toString() {
        return this.f5853a.toString();
    }
}
