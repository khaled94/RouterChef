package m4;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zc1 implements eh1<ad1> {

    /* renamed from: a */
    public final uz1 f16148a;

    /* renamed from: b */
    public final Context f16149b;

    /* renamed from: c */
    public final om1 f16150c;

    /* renamed from: d */
    public final ViewGroup f16151d;

    public zc1(uz1 uz1Var, Context context, om1 om1Var, ViewGroup viewGroup) {
        this.f16148a = uz1Var;
        this.f16149b = context;
        this.f16150c = om1Var;
        this.f16151d = viewGroup;
    }

    @Override // m4.eh1
    public final tz1<ad1> a() {
        return this.f16148a.Z(new Callable() { // from class: m4.yc1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zc1 zc1Var = zc1.this;
                Context context = zc1Var.f16149b;
                on onVar = zc1Var.f16150c.f12204e;
                ArrayList arrayList = new ArrayList();
                View view = zc1Var.f16151d;
                while (view != null) {
                    ViewParent parent = view.getParent();
                    if (parent == null) {
                        break;
                    }
                    int indexOfChild = parent instanceof ViewGroup ? ((ViewGroup) parent).indexOfChild(view) : -1;
                    Bundle bundle = new Bundle();
                    bundle.putString("type", parent.getClass().getName());
                    bundle.putInt("index_of_child", indexOfChild);
                    arrayList.add(bundle);
                    if (!(parent instanceof View)) {
                        break;
                    }
                    view = (View) parent;
                }
                return new ad1(context, onVar, arrayList);
            }
        });
    }
}
