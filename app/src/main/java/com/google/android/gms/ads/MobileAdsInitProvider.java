package com.google.android.gms.ads;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import m4.zq;

/* loaded from: classes.dex */
public class MobileAdsInitProvider extends ContentProvider {

    /* renamed from: s */
    public final zq f2905s = new zq();

    @Override // android.content.ContentProvider
    public final void attachInfo(@RecentlyNonNull Context context, @RecentlyNonNull ProviderInfo providerInfo) {
        this.f2905s.attachInfo(context, providerInfo);
    }

    @Override // android.content.ContentProvider
    public final int delete(@RecentlyNonNull Uri uri, @RecentlyNonNull String str, @RecentlyNonNull String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    @RecentlyNullable
    public final String getType(@RecentlyNonNull Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    @RecentlyNullable
    public final Uri insert(@RecentlyNonNull Uri uri, @RecentlyNonNull ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return false;
    }

    @Override // android.content.ContentProvider
    @RecentlyNullable
    public final Cursor query(@RecentlyNonNull Uri uri, @RecentlyNonNull String[] strArr, @RecentlyNonNull String str, @RecentlyNonNull String[] strArr2, @RecentlyNonNull String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(@RecentlyNonNull Uri uri, @RecentlyNonNull ContentValues contentValues, @RecentlyNonNull String str, @RecentlyNonNull String[] strArr) {
        return 0;
    }
}
