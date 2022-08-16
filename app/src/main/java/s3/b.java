package s3;

import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.RecentlyNonNull;
import c1.c;
import f3.i;
import java.util.Objects;

/* loaded from: classes.dex */
public final class b extends FrameLayout {

    /* renamed from: s */
    public boolean f17684s;

    /* renamed from: t */
    public boolean f17685t;

    /* renamed from: u */
    public f f17686u;

    /* renamed from: v */
    public c f17687v;

    public void setImageScaleType(@RecentlyNonNull ImageView.ScaleType scaleType) {
        this.f17685t = true;
        c cVar = this.f17687v;
        if (cVar != null) {
            Objects.requireNonNull((e) cVar.f2607s);
        }
    }

    public void setMediaContent(@RecentlyNonNull i iVar) {
        this.f17684s = true;
        f fVar = this.f17686u;
        if (fVar != null) {
            Objects.requireNonNull((e) fVar.f17701t);
        }
    }
}
