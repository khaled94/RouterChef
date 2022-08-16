package com.google.android.material.datepicker;

import android.icu.text.DateFormat;
import android.icu.util.TimeZone;
import android.os.Build;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class e {
    public static String a(long j3) {
        Locale locale = Locale.getDefault();
        if (Build.VERSION.SDK_INT >= 24) {
            AtomicReference<c0> atomicReference = d0.f3173a;
            DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("MMMEd", locale);
            instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
            return instanceForSkeleton.format(new Date(j3));
        }
        AtomicReference<c0> atomicReference2 = d0.f3173a;
        java.text.DateFormat dateInstance = java.text.DateFormat.getDateInstance(0, locale);
        dateInstance.setTimeZone(d0.c());
        return dateInstance.format(new Date(j3));
    }

    public static String b(long j3) {
        Locale locale = Locale.getDefault();
        if (Build.VERSION.SDK_INT >= 24) {
            AtomicReference<c0> atomicReference = d0.f3173a;
            DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMEd", locale);
            instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
            return instanceForSkeleton.format(new Date(j3));
        }
        AtomicReference<c0> atomicReference2 = d0.f3173a;
        java.text.DateFormat dateInstance = java.text.DateFormat.getDateInstance(0, locale);
        dateInstance.setTimeZone(d0.c());
        return dateInstance.format(new Date(j3));
    }
}
