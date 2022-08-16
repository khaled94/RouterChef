package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.apps.common.proguard.UsedByReflection;
import t4.i;

@UsedByReflection("PlatformActivityProxy")
/* loaded from: classes.dex */
public class ProxyBillingActivity extends Activity {

    /* renamed from: s */
    public ResultReceiver f2892s;

    /* renamed from: t */
    public ResultReceiver f2893t;

    /* renamed from: u */
    public boolean f2894u;

    public final Intent a() {
        Intent intent = new Intent("com.android.vending.billing.PURCHASES_UPDATED");
        intent.setPackage(getApplicationContext().getPackageName());
        return intent;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
        if (r8 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b9, code lost:
        if (r8 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00bc, code lost:
        r0 = r8.getExtras();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c0, code lost:
        r7.send(r6, r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b9  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onActivityResult(int r6, int r7, android.content.Intent r8) {
        /*
            r5 = this;
            super.onActivityResult(r6, r7, r8)
            r0 = 0
            r1 = 0
            java.lang.String r2 = "ProxyBillingActivity"
            r3 = 100
            if (r6 != r3) goto L94
            h2.f r6 = t4.i.c(r8, r2)
            int r6 = r6.f4994a
            r3 = -1
            if (r7 != r3) goto L1a
            if (r6 == 0) goto L18
            r7 = r3
            goto L1a
        L18:
            r6 = r1
            goto L36
        L1a:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Activity finished with resultCode "
            r3.append(r4)
            r3.append(r7)
            java.lang.String r7 = " and billing's responseCode: "
            r3.append(r7)
            r3.append(r6)
            java.lang.String r7 = r3.toString()
            t4.i.f(r2, r7)
        L36:
            android.os.ResultReceiver r7 = r5.f2892s
            if (r7 == 0) goto L3e
            if (r8 != 0) goto Lbc
            goto Lc0
        L3e:
            if (r8 == 0) goto L8c
            android.os.Bundle r6 = r8.getExtras()
            if (r6 == 0) goto L75
            android.os.Bundle r6 = r8.getExtras()
            java.lang.String r7 = "ALTERNATIVE_BILLING_USER_CHOICE_DATA"
            java.lang.String r6 = r6.getString(r7)
            if (r6 == 0) goto L68
            android.content.Intent r8 = new android.content.Intent
            java.lang.String r0 = "com.android.vending.billing.ALTERNATIVE_BILLING"
            r8.<init>(r0)
            android.content.Context r0 = r5.getApplicationContext()
            java.lang.String r0 = r0.getPackageName()
            r8.setPackage(r0)
            r8.putExtra(r7, r6)
            goto L90
        L68:
            android.content.Intent r6 = r5.a()
            android.os.Bundle r7 = r8.getExtras()
            r6.putExtras(r7)
            r8 = r6
            goto L90
        L75:
            android.content.Intent r8 = r5.a()
            java.lang.String r6 = "Got null bundle!"
            t4.i.f(r2, r6)
            r6 = 6
            java.lang.String r7 = "RESPONSE_CODE"
            r8.putExtra(r7, r6)
            java.lang.String r6 = "DEBUG_MESSAGE"
            java.lang.String r7 = "An internal error occurred."
            r8.putExtra(r6, r7)
            goto L90
        L8c:
            android.content.Intent r8 = r5.a()
        L90:
            r5.sendBroadcast(r8)
            goto Ldd
        L94:
            r7 = 101(0x65, float:1.42E-43)
            if (r6 != r7) goto Lc4
            int r6 = t4.i.f18651a
            if (r8 != 0) goto La2
            java.lang.String r6 = "Got null intent!"
            t4.i.f(r2, r6)
            goto Lad
        La2:
            android.os.Bundle r6 = r8.getExtras()
            if (r6 != 0) goto Laf
            java.lang.String r6 = "Unexpected null bundle received!"
            t4.i.f(r2, r6)
        Lad:
            r6 = r1
            goto Lb5
        Laf:
            java.lang.String r7 = "IN_APP_MESSAGE_RESPONSE_CODE"
            int r6 = r6.getInt(r7, r1)
        Lb5:
            android.os.ResultReceiver r7 = r5.f2893t
            if (r7 == 0) goto Ldd
            if (r8 != 0) goto Lbc
            goto Lc0
        Lbc:
            android.os.Bundle r0 = r8.getExtras()
        Lc0:
            r7.send(r6, r0)
            goto Ldd
        Lc4:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Got onActivityResult with wrong requestCode: "
            r7.append(r8)
            r7.append(r6)
            java.lang.String r6 = "; skipping..."
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            t4.i.f(r2, r6)
        Ldd:
            r5.f2894u = r1
            r5.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.ProxyBillingActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        PendingIntent pendingIntent;
        super.onCreate(bundle);
        if (bundle != null) {
            i.e("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
            this.f2894u = bundle.getBoolean("send_cancelled_broadcast_if_finished", false);
            if (bundle.containsKey("result_receiver")) {
                this.f2892s = (ResultReceiver) bundle.getParcelable("result_receiver");
                return;
            } else if (!bundle.containsKey("in_app_message_result_receiver")) {
                return;
            } else {
                this.f2893t = (ResultReceiver) bundle.getParcelable("in_app_message_result_receiver");
                return;
            }
        }
        i.e("ProxyBillingActivity", "Launching Play Store billing flow");
        int i10 = 100;
        if (getIntent().hasExtra("BUY_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
        } else if (getIntent().hasExtra("SUBS_MANAGEMENT_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("SUBS_MANAGEMENT_INTENT");
            this.f2892s = (ResultReceiver) getIntent().getParcelableExtra("result_receiver");
        } else if (getIntent().hasExtra("IN_APP_MESSAGE_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
            this.f2893t = (ResultReceiver) getIntent().getParcelableExtra("in_app_message_result_receiver");
            i10 = 101;
        } else {
            pendingIntent = null;
        }
        int i11 = i10;
        try {
            this.f2894u = true;
            startIntentSenderForResult(pendingIntent.getIntentSender(), i11, new Intent(), 0, 0, 0);
        } catch (IntentSender.SendIntentException e10) {
            i.g("ProxyBillingActivity", "Got exception while trying to start a purchase flow.", e10);
            ResultReceiver resultReceiver = this.f2892s;
            if (resultReceiver != null) {
                resultReceiver.send(6, null);
            } else {
                ResultReceiver resultReceiver2 = this.f2893t;
                if (resultReceiver2 != null) {
                    resultReceiver2.send(0, null);
                } else {
                    Intent a10 = a();
                    a10.putExtra("RESPONSE_CODE", 6);
                    a10.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                    sendBroadcast(a10);
                }
            }
            this.f2894u = false;
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (isFinishing() && this.f2894u) {
            Intent a10 = a();
            a10.putExtra("RESPONSE_CODE", 1);
            a10.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
            sendBroadcast(a10);
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        ResultReceiver resultReceiver = this.f2892s;
        if (resultReceiver != null) {
            bundle.putParcelable("result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.f2893t;
        if (resultReceiver2 != null) {
            bundle.putParcelable("in_app_message_result_receiver", resultReceiver2);
        }
        bundle.putBoolean("send_cancelled_broadcast_if_finished", this.f2894u);
    }
}
