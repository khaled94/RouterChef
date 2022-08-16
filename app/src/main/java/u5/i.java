package u5;

import android.widget.Checkable;
import u5.i;

/* loaded from: classes.dex */
public interface i<T extends i<T>> extends Checkable {

    /* loaded from: classes.dex */
    public interface a<C> {
    }

    int getId();

    void setInternalOnCheckedChangeListener(a<T> aVar);
}
