package z3;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import c5.j;
import java.util.regex.Matcher;
import q4.b;
import r.g;

/* loaded from: classes.dex */
public final class e extends b {

    /* renamed from: a */
    public final /* synthetic */ c f20937a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar, Looper looper) {
        super(looper);
        this.f20937a = cVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        String str;
        String str2;
        Bundle bundle;
        String str3;
        String concat;
        c cVar = this.f20937a;
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new g());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof h) {
                        cVar.f20936g = (h) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        cVar.f20935f = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if ("com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
                    String stringExtra = intent2.getStringExtra("registration_id");
                    if (stringExtra == null) {
                        stringExtra = intent2.getStringExtra("unregistered");
                    }
                    if (stringExtra == null) {
                        String stringExtra2 = intent2.getStringExtra("error");
                        if (stringExtra2 == null) {
                            String valueOf = String.valueOf(intent2.getExtras());
                            StringBuilder sb = new StringBuilder(valueOf.length() + 49);
                            sb.append("Unexpected response, no error or registration id ");
                            sb.append(valueOf);
                            str = "Rpc";
                            str2 = sb.toString();
                            Log.w(str, str2);
                        }
                        if (Log.isLoggable("Rpc", 3)) {
                            Log.d("Rpc", stringExtra2.length() != 0 ? "Received InstanceID error ".concat(stringExtra2) : new String("Received InstanceID error "));
                        }
                        if (!stringExtra2.startsWith("|")) {
                            synchronized (cVar.f20930a) {
                                int i10 = 0;
                                while (true) {
                                    g<String, j<Bundle>> gVar = cVar.f20930a;
                                    if (i10 < gVar.f17201u) {
                                        cVar.b(gVar.h(i10), intent2.getExtras());
                                        i10++;
                                    }
                                }
                            }
                            return;
                        }
                        String[] split = stringExtra2.split("\\|");
                        if (split.length <= 2 || !"ID".equals(split[1])) {
                            Log.w("Rpc", stringExtra2.length() != 0 ? "Unexpected structured response ".concat(stringExtra2) : new String("Unexpected structured response "));
                            return;
                        }
                        str3 = split[2];
                        String str4 = split[3];
                        if (str4.startsWith(":")) {
                            str4 = str4.substring(1);
                        }
                        bundle = intent2.putExtra("error", str4).getExtras();
                    } else {
                        Matcher matcher = c.f20929j.matcher(stringExtra);
                        if (matcher.matches()) {
                            str3 = matcher.group(1);
                            String group = matcher.group(2);
                            if (str3 == null) {
                                return;
                            }
                            bundle = intent2.getExtras();
                            bundle.putString("registration_id", group);
                        } else if (!Log.isLoggable("Rpc", 3)) {
                            return;
                        } else {
                            concat = stringExtra.length() != 0 ? "Unexpected response string: ".concat(stringExtra) : new String("Unexpected response string: ");
                        }
                    }
                    cVar.b(str3, bundle);
                    return;
                } else if (!Log.isLoggable("Rpc", 3)) {
                    return;
                } else {
                    String valueOf2 = String.valueOf(action);
                    concat = valueOf2.length() != 0 ? "Unexpected response action: ".concat(valueOf2) : new String("Unexpected response action: ");
                }
                Log.d("Rpc", concat);
                return;
            }
        }
        str = "Rpc";
        str2 = "Dropping invalid message";
        Log.w(str, str2);
    }
}
