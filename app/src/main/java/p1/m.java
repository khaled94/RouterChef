package p1;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.raouf.routerchef.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import m0.f0;
import m0.z;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a */
    public static p1.a f16920a = new p1.a();

    /* renamed from: b */
    public static ThreadLocal<WeakReference<r.a<ViewGroup, ArrayList<i>>>> f16921b = new ThreadLocal<>();

    /* renamed from: c */
    public static ArrayList<ViewGroup> f16922c = new ArrayList<>();

    /* loaded from: classes.dex */
    public static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: s */
        public i f16923s;

        /* renamed from: t */
        public ViewGroup f16924t;

        /* renamed from: p1.m$a$a */
        /* loaded from: classes.dex */
        public class C0102a extends l {

            /* renamed from: a */
            public final /* synthetic */ r.a f16925a;

            public C0102a(r.a aVar) {
                a.this = r1;
                this.f16925a = aVar;
            }

            @Override // p1.i.d
            public final void a(i iVar) {
                ((ArrayList) this.f16925a.getOrDefault(a.this.f16924t, null)).remove(iVar);
                iVar.w(this);
            }
        }

        public a(i iVar, ViewGroup viewGroup) {
            this.f16923s = iVar;
            this.f16924t = viewGroup;
        }

        /* JADX WARN: Removed duplicated region for block: B:102:0x0216  */
        /* JADX WARN: Removed duplicated region for block: B:108:0x0242  */
        /* JADX WARN: Removed duplicated region for block: B:144:0x01f0 A[EDGE_INSN: B:144:0x01f0->B:92:0x01f0 ?: BREAK  , SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x009f  */
        /* JADX WARN: Removed duplicated region for block: B:95:0x01f5  */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean onPreDraw() {
            /*
                Method dump skipped, instructions count: 710
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p1.m.a.onPreDraw():boolean");
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            this.f16924t.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f16924t.removeOnAttachStateChangeListener(this);
            m.f16922c.remove(this.f16924t);
            ArrayList<i> orDefault = m.b().getOrDefault(this.f16924t, null);
            if (orDefault != null && orDefault.size() > 0) {
                Iterator<i> it = orDefault.iterator();
                while (it.hasNext()) {
                    it.next().y(this.f16924t);
                }
            }
            this.f16923s.i(true);
        }
    }

    public static void a(ViewGroup viewGroup, i iVar) {
        if (!f16922c.contains(viewGroup)) {
            WeakHashMap<View, f0> weakHashMap = z.f5921a;
            if (!z.g.c(viewGroup)) {
                return;
            }
            f16922c.add(viewGroup);
            if (iVar == null) {
                iVar = f16920a;
            }
            i clone = iVar.clone();
            ArrayList<i> orDefault = b().getOrDefault(viewGroup, null);
            if (orDefault != null && orDefault.size() > 0) {
                Iterator<i> it = orDefault.iterator();
                while (it.hasNext()) {
                    it.next().v(viewGroup);
                }
            }
            if (clone != null) {
                clone.h(viewGroup, true);
            }
            if (((h) viewGroup.getTag(R.id.transition_current_scene)) == null) {
                viewGroup.setTag(R.id.transition_current_scene, null);
                if (clone == null) {
                    return;
                }
                a aVar = new a(clone, viewGroup);
                viewGroup.addOnAttachStateChangeListener(aVar);
                viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
                return;
            }
            throw null;
        }
    }

    public static r.a<ViewGroup, ArrayList<i>> b() {
        r.a<ViewGroup, ArrayList<i>> aVar;
        WeakReference<r.a<ViewGroup, ArrayList<i>>> weakReference = f16921b.get();
        if (weakReference == null || (aVar = weakReference.get()) == null) {
            r.a<ViewGroup, ArrayList<i>> aVar2 = new r.a<>();
            f16921b.set(new WeakReference<>(aVar2));
            return aVar2;
        }
        return aVar;
    }
}
