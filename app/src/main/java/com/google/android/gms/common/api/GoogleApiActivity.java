package com.google.android.gms.common.api;

import a4.b;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.a;
import c4.e;
import com.google.android.gms.common.annotation.KeepName;
import java.util.Objects;
import p4.f;

@KeepName
/* loaded from: classes.dex */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {

    /* renamed from: s */
    public int f2924s = 0;

    public static Intent a(Context context, PendingIntent pendingIntent, int i10, boolean z10) {
        Intent intent = new Intent(context, GoogleApiActivity.class);
        intent.putExtra("pending_intent", pendingIntent);
        intent.putExtra("failing_client_id", i10);
        intent.putExtra("notify_manager", z10);
        return intent;
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f2924s = 0;
            setResult(i11, intent);
            if (booleanExtra) {
                e f10 = e.f(this);
                if (i11 == -1) {
                    f fVar = f10.F;
                    fVar.sendMessage(fVar.obtainMessage(3));
                } else if (i11 == 0) {
                    f10.g(new b(13, null, null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i10 == 2) {
            this.f2924s = 0;
            setResult(i11, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f2924s = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        if (bundle != null) {
            this.f2924s = bundle.getInt("resolution");
        }
        if (this.f2924s != 1) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                str = "Activity started without extras";
            } else {
                PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
                Integer num = (Integer) extras.get("error_code");
                if (pendingIntent == null && num == null) {
                    str = "Activity started without resolution";
                } else if (pendingIntent == null) {
                    Objects.requireNonNull(num, "null reference");
                    int intValue = num.intValue();
                    Object obj = a4.e.f129c;
                    a4.e.f130d.e(this, intValue, this);
                    this.f2924s = 1;
                    return;
                } else {
                    try {
                        startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                        this.f2924s = 1;
                        return;
                    } catch (ActivityNotFoundException e10) {
                        if (extras.getBoolean("notify_manager", true)) {
                            e.f(this).g(new b(22, null, null), getIntent().getIntExtra("failing_client_id", -1));
                        } else {
                            String obj2 = pendingIntent.toString();
                            String b10 = a.b(new StringBuilder(obj2.length() + 36), "Activity not found while launching ", obj2, ".");
                            if (Build.FINGERPRINT.contains("generic")) {
                                b10 = b10.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                            }
                            Log.e("GoogleApiActivity", b10, e10);
                        }
                        this.f2924s = 1;
                    } catch (IntentSender.SendIntentException e11) {
                        Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e11);
                    }
                }
            }
            Log.e("GoogleApiActivity", str);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.f2924s);
        super.onSaveInstanceState(bundle);
    }
}
