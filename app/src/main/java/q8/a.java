package q8;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.android.billingclient.api.Purchase;
import f8.g2;
import h2.b;
import h2.c;
import h2.d;
import h2.f;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import u7.m;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a */
    public Context f17152a;

    /* renamed from: q8.a$a */
    /* loaded from: classes.dex */
    public class C0106a implements d {

        /* renamed from: a */
        public final /* synthetic */ b f17153a;

        public C0106a(b bVar) {
            a.this = r1;
            this.f17153a = bVar;
        }

        @Override // h2.d
        public final void a(f fVar) {
            if (fVar.f4994a == 0) {
                this.f17153a.a(new g2(this));
                return;
            }
            a aVar = a.this;
            aVar.c(aVar.b());
            Log.i("In checkSub-Not-OK ::::: ", "Offline Check : " + a.this.b());
        }

        @Override // h2.d
        public final void b() {
        }
    }

    public a(Context context) {
        this.f17152a = context;
    }

    public static void d(Context context, Purchase purchase) {
        String str;
        SharedPreferences.Editor edit = context.getSharedPreferences("SUB_DETAILS", 0).edit();
        if (purchase != null) {
            StringBuilder sb = new StringBuilder();
            ArrayList arrayList = new ArrayList();
            if (purchase.f2897c.has("productIds")) {
                JSONArray optJSONArray = purchase.f2897c.optJSONArray("productIds");
                if (optJSONArray != null) {
                    for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                        arrayList.add(optJSONArray.optString(i10));
                    }
                }
            } else if (purchase.f2897c.has("productId")) {
                arrayList.add(purchase.f2897c.optString("productId"));
            }
            sb.append((String) arrayList.get(0));
            sb.append(",");
            sb.append(purchase.f2897c.optLong("purchaseTime"));
            str = sb.toString();
        } else {
            str = "0";
        }
        edit.putString("SUB_DETAILS", str);
        edit.apply();
    }

    public final void a() {
        Context context = this.f17152a;
        m mVar = m.f19536t;
        if (context != null) {
            c cVar = new c(true, context, mVar);
            cVar.c(new C0106a(cVar));
            return;
        }
        throw new IllegalArgumentException("Please provide a valid Context.");
    }

    public final boolean b() {
        int i10;
        String string = this.f17152a.getSharedPreferences("SUB_DETAILS", 0).getString("SUB_DETAILS", "0");
        if (!string.equals("0")) {
            Log.i("In Offline Check pref ::::: ", string);
            String str = string.split(",")[0];
            long parseLong = Long.parseLong(string.split(",")[1]);
            long timeInMillis = Calendar.getInstance().getTimeInMillis();
            Objects.requireNonNull(str);
            char c10 = 65535;
            switch (str.hashCode()) {
                case -1609397361:
                    if (str.equals("per_3month")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1523509908:
                    if (str.equals("per_6month")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -1016252376:
                    if (str.equals("sub_one_month")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 424983071:
                    if (str.equals("per_year")) {
                        c10 = 3;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    i10 = 90;
                    break;
                case 1:
                    i10 = 180;
                    break;
                case 2:
                    i10 = 30;
                    break;
                case 3:
                    i10 = 360;
                    break;
                default:
                    i10 = 0;
                    break;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(timeInMillis);
            sb.append("-");
            sb.append(parseLong);
            sb.append("-");
            TimeUnit timeUnit = TimeUnit.DAYS;
            long j3 = i10;
            sb.append(timeUnit.toMillis(j3));
            Log.i("today - subDate - daysInSub ::::: ", sb.toString());
            if (timeInMillis - parseLong <= timeUnit.toMillis(j3)) {
                Log.i("In Offline Check pref ::::: ", "Offline Continue");
                return true;
            }
            d(this.f17152a, null);
            Log.i("In Offline Check pref ::::: ", "Offline Ended");
            return false;
        }
        return false;
    }

    public abstract void c(boolean z10);
}
