package y4;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import androidx.fragment.app.a;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class k extends j3 {

    /* renamed from: u */
    public long f20523u;

    /* renamed from: v */
    public String f20524v;

    /* renamed from: w */
    public AccountManager f20525w;

    /* renamed from: x */
    public Boolean f20526x;
    public long y;

    public k(w2 w2Var) {
        super(w2Var);
    }

    @Override // y4.j3
    public final boolean i() {
        Calendar calendar = Calendar.getInstance();
        this.f20523u = TimeUnit.MINUTES.convert(calendar.get(16) + calendar.get(15), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        String lowerCase = language.toLowerCase(locale2);
        String lowerCase2 = locale.getCountry().toLowerCase(locale2);
        this.f20524v = a.b(new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length()), lowerCase, "-", lowerCase2);
        return false;
    }

    public final long n() {
        g();
        return this.y;
    }

    public final long o() {
        j();
        return this.f20523u;
    }

    public final String p() {
        j();
        return this.f20524v;
    }

    public final boolean q() {
        g();
        Objects.requireNonNull(((w2) this.f20505s).F);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.y > 86400000) {
            this.f20526x = null;
        }
        Boolean bool = this.f20526x;
        if (bool == null) {
            if (c0.a.a(((w2) this.f20505s).f20786s, "android.permission.GET_ACCOUNTS") != 0) {
                ((w2) this.f20505s).C().B.a("Permission error checking for dasher/unicorn accounts");
            } else {
                if (this.f20525w == null) {
                    this.f20525w = AccountManager.get(((w2) this.f20505s).f20786s);
                }
                try {
                    Account[] result = this.f20525w.getAccountsByTypeAndFeatures("com.google", new String[]{"service_HOSTED"}, null, null).getResult();
                    if (result != null && result.length > 0) {
                        this.f20526x = Boolean.TRUE;
                        this.y = currentTimeMillis;
                        return true;
                    }
                    Account[] result2 = this.f20525w.getAccountsByTypeAndFeatures("com.google", new String[]{"service_uca"}, null, null).getResult();
                    if (result2 != null && result2.length > 0) {
                        this.f20526x = Boolean.TRUE;
                        this.y = currentTimeMillis;
                        return true;
                    }
                } catch (AuthenticatorException | OperationCanceledException | IOException e10) {
                    ((w2) this.f20505s).C().y.b("Exception checking account types", e10);
                }
            }
            this.y = currentTimeMillis;
            this.f20526x = Boolean.FALSE;
            return false;
        }
        return bool.booleanValue();
    }
}
