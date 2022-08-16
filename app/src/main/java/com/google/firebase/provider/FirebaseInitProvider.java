package com.google.firebase.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import d4.m;
import h6.d;
import h6.h;

/* loaded from: classes.dex */
public class FirebaseInitProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        m.i(providerInfo, "FirebaseInitProvider ProviderInfo cannot be null.");
        if (!"com.google.firebase.firebaseinitprovider".equals(providerInfo.authority)) {
            super.attachInfo(context, providerInfo);
            return;
        }
        throw new IllegalStateException("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.Map<java.lang.String, h6.d>, r.g] */
    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        d dVar;
        String str;
        String str2;
        Context context = getContext();
        synchronized (d.f5109j) {
            if (d.f5111l.containsKey("[DEFAULT]")) {
                dVar = d.c();
            } else {
                h a10 = h.a(context);
                if (a10 == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    dVar = null;
                } else {
                    dVar = d.f(context, a10);
                }
            }
        }
        if (dVar == null) {
            str2 = "FirebaseInitProvider";
            str = "FirebaseApp initialization unsuccessful";
        } else {
            str2 = "FirebaseInitProvider";
            str = "FirebaseApp initialization successful";
        }
        Log.i(str2, str);
        return false;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
