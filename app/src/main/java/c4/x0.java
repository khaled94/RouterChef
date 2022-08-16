package c4;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.o;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import r.a;

/* loaded from: classes.dex */
public final class x0 extends o implements g {

    /* renamed from: m0 */
    public final Map<String, LifecycleCallback> f2757m0 = Collections.synchronizedMap(new a());

    /* renamed from: n0 */
    public int f2758n0 = 0;

    /* renamed from: o0 */
    public Bundle f2759o0;

    static {
        new WeakHashMap();
    }

    @Override // androidx.fragment.app.o
    public final void D(int i10, int i11, Intent intent) {
        super.D(i10, i11, intent);
        for (LifecycleCallback lifecycleCallback : this.f2757m0.values()) {
            lifecycleCallback.b(i10, i11, intent);
        }
    }

    @Override // androidx.fragment.app.o
    public final void F(Bundle bundle) {
        super.F(bundle);
        this.f2758n0 = 1;
        this.f2759o0 = bundle;
        for (Map.Entry<String, LifecycleCallback> entry : this.f2757m0.entrySet()) {
            entry.getValue().c(bundle != null ? bundle.getBundle(entry.getKey()) : null);
        }
    }

    @Override // androidx.fragment.app.o
    public final void H() {
        this.U = true;
        this.f2758n0 = 5;
        for (LifecycleCallback lifecycleCallback : this.f2757m0.values()) {
            Objects.requireNonNull(lifecycleCallback);
        }
    }

    @Override // androidx.fragment.app.o
    public final void M() {
        this.U = true;
        this.f2758n0 = 3;
        for (LifecycleCallback lifecycleCallback : this.f2757m0.values()) {
            lifecycleCallback.d();
        }
    }

    @Override // androidx.fragment.app.o
    public final void N(Bundle bundle) {
        for (Map.Entry<String, LifecycleCallback> entry : this.f2757m0.entrySet()) {
            Bundle bundle2 = new Bundle();
            entry.getValue().e(bundle2);
            bundle.putBundle(entry.getKey(), bundle2);
        }
    }

    @Override // androidx.fragment.app.o
    public final void O() {
        this.U = true;
        this.f2758n0 = 2;
        for (LifecycleCallback lifecycleCallback : this.f2757m0.values()) {
            lifecycleCallback.f();
        }
    }

    @Override // androidx.fragment.app.o
    public final void P() {
        this.U = true;
        this.f2758n0 = 4;
        for (LifecycleCallback lifecycleCallback : this.f2757m0.values()) {
            lifecycleCallback.g();
        }
    }

    @Override // c4.g
    public final /* synthetic */ Activity f() {
        return j();
    }

    @Override // androidx.fragment.app.o
    public final void h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.h(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback lifecycleCallback : this.f2757m0.values()) {
            Objects.requireNonNull(lifecycleCallback);
        }
    }
}
