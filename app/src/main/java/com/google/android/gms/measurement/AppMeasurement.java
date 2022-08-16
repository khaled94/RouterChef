package com.google.android.gms.measurement;

import android.os.Bundle;
import androidx.annotation.Keep;
import d.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import w4.b;
import w4.c;
import y4.g4;
import y4.w2;

@Deprecated
/* loaded from: classes.dex */
public class AppMeasurement {

    /* renamed from: b */
    public static volatile AppMeasurement f2964b;

    /* renamed from: a */
    public final c f2965a;

    /* loaded from: classes.dex */
    public static class ConditionalUserProperty {
        @Keep
        public boolean mActive;
        @Keep
        public String mAppId;
        @Keep
        public long mCreationTimestamp;
        @Keep
        public String mExpiredEventName;
        @Keep
        public Bundle mExpiredEventParams;
        @Keep
        public String mName;
        @Keep
        public String mOrigin;
        @Keep
        public long mTimeToLive;
        @Keep
        public String mTimedOutEventName;
        @Keep
        public Bundle mTimedOutEventParams;
        @Keep
        public String mTriggerEventName;
        @Keep
        public long mTriggerTimeout;
        @Keep
        public String mTriggeredEventName;
        @Keep
        public Bundle mTriggeredEventParams;
        @Keep
        public long mTriggeredTimestamp;
        @Keep
        public Object mValue;

        public ConditionalUserProperty() {
        }

        public ConditionalUserProperty(Bundle bundle) {
            Objects.requireNonNull(bundle, "null reference");
            this.mAppId = (String) a.b(bundle, "app_id", String.class, null);
            this.mOrigin = (String) a.b(bundle, "origin", String.class, null);
            this.mName = (String) a.b(bundle, "name", String.class, null);
            this.mValue = a.b(bundle, "value", Object.class, null);
            this.mTriggerEventName = (String) a.b(bundle, "trigger_event_name", String.class, null);
            this.mTriggerTimeout = ((Long) a.b(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            this.mTimedOutEventName = (String) a.b(bundle, "timed_out_event_name", String.class, null);
            this.mTimedOutEventParams = (Bundle) a.b(bundle, "timed_out_event_params", Bundle.class, null);
            this.mTriggeredEventName = (String) a.b(bundle, "triggered_event_name", String.class, null);
            this.mTriggeredEventParams = (Bundle) a.b(bundle, "triggered_event_params", Bundle.class, null);
            this.mTimeToLive = ((Long) a.b(bundle, "time_to_live", Long.class, 0L)).longValue();
            this.mExpiredEventName = (String) a.b(bundle, "expired_event_name", String.class, null);
            this.mExpiredEventParams = (Bundle) a.b(bundle, "expired_event_params", Bundle.class, null);
            this.mActive = ((Boolean) a.b(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            this.mCreationTimestamp = ((Long) a.b(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            this.mTriggeredTimestamp = ((Long) a.b(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
        }
    }

    public AppMeasurement(g4 g4Var) {
        this.f2965a = new b(g4Var);
    }

    public AppMeasurement(w2 w2Var) {
        this.f2965a = new w4.a(w2Var);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:12:0x002e
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:92)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    @androidx.annotation.Keep
    @java.lang.Deprecated
    public static com.google.android.gms.measurement.AppMeasurement getInstance(android.content.Context r14) {
        /*
            com.google.android.gms.measurement.AppMeasurement r0 = com.google.android.gms.measurement.AppMeasurement.f2964b
            if (r0 != 0) goto L59
            java.lang.Class<com.google.android.gms.measurement.AppMeasurement> r0 = com.google.android.gms.measurement.AppMeasurement.class
            monitor-enter(r0)
            com.google.android.gms.measurement.AppMeasurement r1 = com.google.android.gms.measurement.AppMeasurement.f2964b     // Catch: java.lang.Throwable -> L56
            if (r1 != 0) goto L54
            r1 = 0
            java.lang.Class<com.google.firebase.analytics.FirebaseAnalytics> r2 = com.google.firebase.analytics.FirebaseAnalytics.class
            r3 = 2
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L56
            java.lang.Class<android.content.Context> r5 = android.content.Context.class
            r6 = 0
            r4[r6] = r5     // Catch: java.lang.Throwable -> L56
            java.lang.Class<android.os.Bundle> r5 = android.os.Bundle.class
            r7 = 1
            r4[r7] = r5     // Catch: java.lang.Throwable -> L56
            java.lang.String r5 = "getScionFrontendApiImplementation"
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r5, r4)     // Catch: java.lang.Throwable -> L56
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L56
            r3[r6] = r14     // Catch: java.lang.Throwable -> L56
            r3[r7] = r1     // Catch: java.lang.Throwable -> L56
            java.lang.Object r2 = r2.invoke(r1, r3)     // Catch: java.lang.Throwable -> L56
            y4.g4 r2 = (y4.g4) r2     // Catch: java.lang.Throwable -> L56
            goto L2f
        L2e:
            r2 = r1
        L2f:
            if (r2 == 0) goto L39
            com.google.android.gms.measurement.AppMeasurement r14 = new com.google.android.gms.measurement.AppMeasurement     // Catch: java.lang.Throwable -> L56
            r14.<init>(r2)     // Catch: java.lang.Throwable -> L56
            com.google.android.gms.measurement.AppMeasurement.f2964b = r14     // Catch: java.lang.Throwable -> L56
            goto L54
        L39:
            s4.b1 r13 = new s4.b1     // Catch: java.lang.Throwable -> L56
            r3 = 0
            r5 = 0
            r7 = 1
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r2 = r13
            r2.<init>(r3, r5, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L56
            y4.w2 r14 = y4.w2.t(r14, r13, r1)     // Catch: java.lang.Throwable -> L56
            com.google.android.gms.measurement.AppMeasurement r1 = new com.google.android.gms.measurement.AppMeasurement     // Catch: java.lang.Throwable -> L56
            r1.<init>(r14)     // Catch: java.lang.Throwable -> L56
            com.google.android.gms.measurement.AppMeasurement.f2964b = r1     // Catch: java.lang.Throwable -> L56
        L54:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L56
            goto L59
        L56:
            r14 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L56
            throw r14
        L59:
            com.google.android.gms.measurement.AppMeasurement r14 = com.google.android.gms.measurement.AppMeasurement.f2964b
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.AppMeasurement.getInstance(android.content.Context):com.google.android.gms.measurement.AppMeasurement");
    }

    @Keep
    public void beginAdUnitExposure(String str) {
        this.f2965a.U(str);
    }

    @Keep
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.f2965a.c(str, str2, bundle);
    }

    @Keep
    public void endAdUnitExposure(String str) {
        this.f2965a.s(str);
    }

    @Keep
    public long generateEventId() {
        return this.f2965a.a();
    }

    @Keep
    public String getAppInstanceId() {
        return this.f2965a.f();
    }

    @Keep
    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        List<Bundle> d5 = this.f2965a.d(str, str2);
        ArrayList arrayList = new ArrayList(d5 == null ? 0 : d5.size());
        for (Bundle bundle : d5) {
            arrayList.add(new ConditionalUserProperty(bundle));
        }
        return arrayList;
    }

    @Keep
    public String getCurrentScreenClass() {
        return this.f2965a.h();
    }

    @Keep
    public String getCurrentScreenName() {
        return this.f2965a.i();
    }

    @Keep
    public String getGmpAppId() {
        return this.f2965a.n();
    }

    @Keep
    public int getMaxUserProperties(String str) {
        return this.f2965a.b(str);
    }

    @Keep
    public Map<String, Object> getUserProperties(String str, String str2, boolean z10) {
        return this.f2965a.e(str, str2, z10);
    }

    @Keep
    public void logEventInternal(String str, String str2, Bundle bundle) {
        this.f2965a.j(str, str2, bundle);
    }

    @Keep
    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        Objects.requireNonNull(conditionalUserProperty, "null reference");
        c cVar = this.f2965a;
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.mAppId;
        if (str != null) {
            bundle.putString("app_id", str);
        }
        String str2 = conditionalUserProperty.mOrigin;
        if (str2 != null) {
            bundle.putString("origin", str2);
        }
        String str3 = conditionalUserProperty.mName;
        if (str3 != null) {
            bundle.putString("name", str3);
        }
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            a.e(bundle, obj);
        }
        String str4 = conditionalUserProperty.mTriggerEventName;
        if (str4 != null) {
            bundle.putString("trigger_event_name", str4);
        }
        bundle.putLong("trigger_timeout", conditionalUserProperty.mTriggerTimeout);
        String str5 = conditionalUserProperty.mTimedOutEventName;
        if (str5 != null) {
            bundle.putString("timed_out_event_name", str5);
        }
        Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str6 = conditionalUserProperty.mTriggeredEventName;
        if (str6 != null) {
            bundle.putString("triggered_event_name", str6);
        }
        Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", conditionalUserProperty.mTimeToLive);
        String str7 = conditionalUserProperty.mExpiredEventName;
        if (str7 != null) {
            bundle.putString("expired_event_name", str7);
        }
        Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        bundle.putLong("creation_timestamp", conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean("active", conditionalUserProperty.mActive);
        bundle.putLong("triggered_timestamp", conditionalUserProperty.mTriggeredTimestamp);
        cVar.g(bundle);
    }
}
