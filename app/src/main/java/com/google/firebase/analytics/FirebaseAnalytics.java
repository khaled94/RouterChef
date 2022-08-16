package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import c5.l;
import i6.a;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p7.e;
import s4.g1;
import s4.k2;
import y4.g4;

/* loaded from: classes.dex */
public final class FirebaseAnalytics {

    /* renamed from: b */
    public static volatile FirebaseAnalytics f3460b;

    /* renamed from: a */
    public final k2 f3461a;

    public FirebaseAnalytics(k2 k2Var) {
        Objects.requireNonNull(k2Var, "null reference");
        this.f3461a = k2Var;
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (f3460b == null) {
            synchronized (FirebaseAnalytics.class) {
                if (f3460b == null) {
                    f3460b = new FirebaseAnalytics(k2.f(context, null, null, null, null));
                }
            }
        }
        return f3460b;
    }

    @Keep
    public static g4 getScionFrontendApiImplementation(Context context, Bundle bundle) {
        k2 f10 = k2.f(context, null, null, null, bundle);
        if (f10 == null) {
            return null;
        }
        return new a(f10);
    }

    @Keep
    public String getFirebaseInstanceId() {
        try {
            return (String) l.b(e.f().getId(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            throw new IllegalStateException(e10);
        } catch (ExecutionException e11) {
            throw new IllegalStateException(e11.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Keep
    @Deprecated
    public void setCurrentScreen(Activity activity, String str, String str2) {
        k2 k2Var = this.f3461a;
        Objects.requireNonNull(k2Var);
        k2Var.b(new g1(k2Var, activity, str, str2));
    }
}
