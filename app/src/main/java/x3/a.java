package x3;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.Objects;
import java.util.concurrent.locks.ReentrantLock;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: c */
    public static final ReentrantLock f20022c = new ReentrantLock();
    @GuardedBy("sLk")

    /* renamed from: d */
    public static a f20023d;

    /* renamed from: a */
    public final ReentrantLock f20024a = new ReentrantLock();
    @GuardedBy("mLk")

    /* renamed from: b */
    public final SharedPreferences f20025b;

    public a(Context context) {
        this.f20025b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static a a(Context context) {
        Objects.requireNonNull(context, "null reference");
        ReentrantLock reentrantLock = f20022c;
        reentrantLock.lock();
        try {
            if (f20023d == null) {
                f20023d = new a(context.getApplicationContext());
            }
            a aVar = f20023d;
            reentrantLock.unlock();
            return aVar;
        } catch (Throwable th) {
            f20022c.unlock();
            throw th;
        }
    }

    public final GoogleSignInAccount b() {
        String c10 = c("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(c10)) {
            StringBuilder sb = new StringBuilder(String.valueOf(c10).length() + 20);
            sb.append("googleSignInAccount");
            sb.append(":");
            sb.append(c10);
            String c11 = c(sb.toString());
            if (c11 != null) {
                try {
                    return GoogleSignInAccount.t(c11);
                } catch (JSONException unused) {
                }
            }
        }
        return null;
    }

    public final String c(String str) {
        this.f20024a.lock();
        try {
            return this.f20025b.getString(str, null);
        } finally {
            this.f20024a.unlock();
        }
    }
}
