package p0;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a */
    public final c f16859a;

    /* loaded from: classes.dex */
    public static final class a implements c {

        /* renamed from: a */
        public final InputContentInfo f16860a;

        public a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f16860a = new InputContentInfo(uri, clipDescription, uri2);
        }

        public a(Object obj) {
            this.f16860a = (InputContentInfo) obj;
        }

        @Override // p0.e.c
        public final ClipDescription a() {
            return this.f16860a.getDescription();
        }

        @Override // p0.e.c
        public final Object b() {
            return this.f16860a;
        }

        @Override // p0.e.c
        public final Uri c() {
            return this.f16860a.getContentUri();
        }

        @Override // p0.e.c
        public final void d() {
            this.f16860a.requestPermission();
        }

        @Override // p0.e.c
        public final Uri e() {
            return this.f16860a.getLinkUri();
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements c {

        /* renamed from: a */
        public final Uri f16861a;

        /* renamed from: b */
        public final ClipDescription f16862b;

        /* renamed from: c */
        public final Uri f16863c;

        public b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f16861a = uri;
            this.f16862b = clipDescription;
            this.f16863c = uri2;
        }

        @Override // p0.e.c
        public final ClipDescription a() {
            return this.f16862b;
        }

        @Override // p0.e.c
        public final Object b() {
            return null;
        }

        @Override // p0.e.c
        public final Uri c() {
            return this.f16861a;
        }

        @Override // p0.e.c
        public final void d() {
        }

        @Override // p0.e.c
        public final Uri e() {
            return this.f16863c;
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        ClipDescription a();

        Object b();

        Uri c();

        void d();

        Uri e();
    }

    public e(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f16859a = Build.VERSION.SDK_INT >= 25 ? new a(uri, clipDescription, uri2) : new b(uri, clipDescription, uri2);
    }

    public e(c cVar) {
        this.f16859a = cVar;
    }
}
