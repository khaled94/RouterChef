package t8;

import android.content.Context;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;

/* loaded from: classes.dex */
public final class f extends y {

    /* renamed from: b */
    public static final UriMatcher f18758b;

    /* renamed from: a */
    public final Context f18759a;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f18758b = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "display_photo/#", 4);
    }

    public f(Context context) {
        this.f18759a = context;
    }

    @Override // t8.y
    public final boolean c(w wVar) {
        Uri uri = wVar.f18833c;
        return "content".equals(uri.getScheme()) && ContactsContract.Contacts.CONTENT_URI.getHost().equals(uri.getHost()) && f18758b.match(wVar.f18833c) != -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0046 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    @Override // t8.y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final t8.y.a f(t8.w r5, int r6) {
        /*
            r4 = this;
            android.content.Context r6 = r4.f18759a
            android.content.ContentResolver r6 = r6.getContentResolver()
            android.net.Uri r5 = r5.f18833c
            android.content.UriMatcher r0 = t8.f.f18758b
            int r0 = r0.match(r5)
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L38
            r3 = 2
            if (r0 == r3) goto L33
            r3 = 3
            if (r0 == r3) goto L40
            r1 = 4
            if (r0 != r1) goto L1c
            goto L33
        L1c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid uri: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r6.<init>(r5)
            throw r6
        L33:
            java.io.InputStream r5 = r6.openInputStream(r5)
            goto L44
        L38:
            android.net.Uri r5 = android.provider.ContactsContract.Contacts.lookupContact(r6, r5)
            if (r5 != 0) goto L40
            r5 = r2
            goto L44
        L40:
            java.io.InputStream r5 = android.provider.ContactsContract.Contacts.openContactPhotoInputStream(r6, r5, r1)
        L44:
            if (r5 != 0) goto L47
            return r2
        L47:
            t8.y$a r6 = new t8.y$a
            ca.y r5 = ca.o.f(r5)
            t8.t$d r0 = t8.t.d.DISK
            r6.<init>(r5, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: t8.f.f(t8.w, int):t8.y$a");
    }
}
