package n2;

import androidx.annotation.RecentlyNonNull;

/* loaded from: classes.dex */
public enum a {
    /* JADX INFO: Fake field, exist only in values array */
    INVALID_REQUEST("Invalid Ad request."),
    /* JADX INFO: Fake field, exist only in values array */
    NO_FILL("Ad request successful, but no ad returned due to lack of ad inventory."),
    /* JADX INFO: Fake field, exist only in values array */
    NETWORK_ERROR("A network error occurred."),
    INTERNAL_ERROR("There was an internal error.");
    

    /* renamed from: s */
    public final String f16427s;

    a(String str) {
        this.f16427s = str;
    }

    @Override // java.lang.Enum
    @RecentlyNonNull
    public final String toString() {
        return this.f16427s;
    }
}
