package s4;

import android.os.Bundle;
import android.os.IInterface;
import java.util.Map;
import k4.a;

/* loaded from: classes.dex */
public interface s0 extends IInterface {
    void beginAdUnitExposure(String str, long j3);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j3);

    void endAdUnitExposure(String str, long j3);

    void generateEventId(v0 v0Var);

    void getAppInstanceId(v0 v0Var);

    void getCachedAppInstanceId(v0 v0Var);

    void getConditionalUserProperties(String str, String str2, v0 v0Var);

    void getCurrentScreenClass(v0 v0Var);

    void getCurrentScreenName(v0 v0Var);

    void getGmpAppId(v0 v0Var);

    void getMaxUserProperties(String str, v0 v0Var);

    void getTestFlag(v0 v0Var, int i10);

    void getUserProperties(String str, String str2, boolean z10, v0 v0Var);

    void initForTests(Map map);

    void initialize(a aVar, b1 b1Var, long j3);

    void isDataCollectionEnabled(v0 v0Var);

    void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j3);

    void logEventAndBundle(String str, String str2, Bundle bundle, v0 v0Var, long j3);

    void logHealthData(int i10, String str, a aVar, a aVar2, a aVar3);

    void onActivityCreated(a aVar, Bundle bundle, long j3);

    void onActivityDestroyed(a aVar, long j3);

    void onActivityPaused(a aVar, long j3);

    void onActivityResumed(a aVar, long j3);

    void onActivitySaveInstanceState(a aVar, v0 v0Var, long j3);

    void onActivityStarted(a aVar, long j3);

    void onActivityStopped(a aVar, long j3);

    void performAction(Bundle bundle, v0 v0Var, long j3);

    void registerOnMeasurementEventListener(y0 y0Var);

    void resetAnalyticsData(long j3);

    void setConditionalUserProperty(Bundle bundle, long j3);

    void setConsent(Bundle bundle, long j3);

    void setConsentThirdParty(Bundle bundle, long j3);

    void setCurrentScreen(a aVar, String str, String str2, long j3);

    void setDataCollectionEnabled(boolean z10);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(y0 y0Var);

    void setInstanceIdProvider(a1 a1Var);

    void setMeasurementEnabled(boolean z10, long j3);

    void setMinimumSessionDuration(long j3);

    void setSessionTimeoutDuration(long j3);

    void setUserId(String str, long j3);

    void setUserProperty(String str, String str2, a aVar, boolean z10, long j3);

    void unregisterOnMeasurementEventListener(y0 y0Var);
}
