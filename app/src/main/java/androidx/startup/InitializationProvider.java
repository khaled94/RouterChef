package androidx.startup;

import android.content.ComponentName;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Trace;
import com.raouf.routerchef.R;
import java.util.HashSet;
import java.util.Objects;
import n1.a;
import n1.b;
import n1.c;

/* loaded from: classes.dex */
public final class InitializationProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new IllegalStateException("Not allowed.");
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.HashSet, java.util.Set<java.lang.Class<? extends n1.b<?>>>] */
    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        Context context = getContext();
        if (context != null) {
            a b10 = a.b(context);
            Objects.requireNonNull(b10);
            try {
                try {
                    Trace.beginSection("Startup");
                    Bundle bundle = b10.f16424c.getPackageManager().getProviderInfo(new ComponentName(b10.f16424c.getPackageName(), InitializationProvider.class.getName()), 128).metaData;
                    String string = b10.f16424c.getString(R.string.androidx_startup);
                    if (bundle != null) {
                        HashSet hashSet = new HashSet();
                        for (String str : bundle.keySet()) {
                            if (string.equals(bundle.getString(str, null))) {
                                Class<?> cls = Class.forName(str);
                                if (b.class.isAssignableFrom(cls)) {
                                    b10.f16423b.add(cls);
                                    b10.a(cls, hashSet);
                                }
                            }
                        }
                    }
                    Trace.endSection();
                    return true;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } catch (PackageManager.NameNotFoundException | ClassNotFoundException e10) {
                throw new c(e10);
            }
        }
        throw new c();
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }
}
