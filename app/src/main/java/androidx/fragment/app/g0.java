package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.o;
import androidx.fragment.app.o0;
import androidx.lifecycle.g;
import androidx.lifecycle.j0;
import b0.k;
import b0.v;
import b0.w;
import b0.y;
import com.raouf.routerchef.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class g0 {
    public androidx.activity.result.d A;
    public androidx.activity.result.d B;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public ArrayList<androidx.fragment.app.b> I;
    public ArrayList<Boolean> J;
    public ArrayList<o> K;
    public j0 L;

    /* renamed from: b */
    public boolean f1400b;

    /* renamed from: d */
    public ArrayList<androidx.fragment.app.b> f1402d;

    /* renamed from: e */
    public ArrayList<o> f1403e;

    /* renamed from: g */
    public OnBackPressedDispatcher f1405g;

    /* renamed from: t */
    public y<?> f1417t;

    /* renamed from: u */
    public v f1418u;

    /* renamed from: v */
    public o f1419v;

    /* renamed from: w */
    public o f1420w;

    /* renamed from: z */
    public androidx.activity.result.d f1422z;

    /* renamed from: a */
    public final ArrayList<l> f1399a = new ArrayList<>();

    /* renamed from: c */
    public final n0 f1401c = new n0();

    /* renamed from: f */
    public final z f1404f = new z(this);

    /* renamed from: h */
    public final b f1406h = new b();

    /* renamed from: i */
    public final AtomicInteger f1407i = new AtomicInteger();

    /* renamed from: j */
    public final Map<String, androidx.fragment.app.d> f1408j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k */
    public final Map<String, Bundle> f1409k = Collections.synchronizedMap(new HashMap());

    /* renamed from: l */
    public final a0 f1410l = new a0(this);

    /* renamed from: m */
    public final CopyOnWriteArrayList<k0> f1411m = new CopyOnWriteArrayList<>();

    /* renamed from: n */
    public final l0.a<Configuration> f1412n = new l0.a() { // from class: androidx.fragment.app.e0
        @Override // l0.a
        public final void a(Object obj) {
            g0.this.h((Configuration) obj);
        }
    };

    /* renamed from: o */
    public final l0.a<Integer> f1413o = new l0.a() { // from class: androidx.fragment.app.f0
        @Override // l0.a
        public final void a(Object obj) {
            g0 g0Var = g0.this;
            Objects.requireNonNull(g0Var);
            if (((Integer) obj).intValue() == 80) {
                g0Var.m();
            }
        }
    };
    public final l0.a<b0.k> p = new l0.a() { // from class: androidx.fragment.app.c0
        @Override // l0.a
        public final void a(Object obj) {
            g0 g0Var = g0.this;
            Objects.requireNonNull(g0Var);
            g0Var.n(((k) obj).f2418a);
        }
    };

    /* renamed from: q */
    public final l0.a<y> f1414q = new l0.a() { // from class: androidx.fragment.app.d0
        @Override // l0.a
        public final void a(Object obj) {
            g0 g0Var = g0.this;
            Objects.requireNonNull(g0Var);
            g0Var.s(((y) obj).f2475a);
        }
    };

    /* renamed from: r */
    public final c f1415r = new c();

    /* renamed from: s */
    public int f1416s = -1;

    /* renamed from: x */
    public d f1421x = new d();
    public e y = new e();
    public ArrayDeque<k> C = new ArrayDeque<>();
    public f M = new f();

    /* loaded from: classes.dex */
    public class a implements androidx.activity.result.c<Map<String, Boolean>> {
        public a() {
            g0.this = r1;
        }

        @Override // androidx.activity.result.c
        @SuppressLint({"SyntheticAccessor"})
        public final void a(Map<String, Boolean> map) {
            String str;
            Map<String, Boolean> map2 = map;
            String[] strArr = (String[]) map2.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map2.values());
            int[] iArr = new int[arrayList.size()];
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                iArr[i10] = ((Boolean) arrayList.get(i10)).booleanValue() ? 0 : -1;
            }
            k pollFirst = g0.this.C.pollFirst();
            if (pollFirst == null) {
                str = "No permissions were requested for " + this;
            } else {
                String str2 = pollFirst.f1431s;
                if (g0.this.f1401c.d(str2) != null) {
                    return;
                }
                str = d7.a.c("Permission request result delivered for unknown Fragment ", str2);
            }
            Log.w("FragmentManager", str);
        }
    }

    /* loaded from: classes.dex */
    public class b extends androidx.activity.i {
        public b() {
            g0.this = r1;
        }

        @Override // androidx.activity.i
        public final void a() {
            g0 g0Var = g0.this;
            g0Var.A(true);
            if (g0Var.f1406h.f424a) {
                g0Var.R();
            } else {
                g0Var.f1405g.b();
            }
        }
    }

    /* loaded from: classes.dex */
    public class c implements m0.k {
        public c() {
            g0.this = r1;
        }

        @Override // m0.k
        public final boolean a(MenuItem menuItem) {
            return g0.this.p(menuItem);
        }

        @Override // m0.k
        public final void b(Menu menu) {
            g0.this.q(menu);
        }

        @Override // m0.k
        public final void c(Menu menu, MenuInflater menuInflater) {
            g0.this.k(menu, menuInflater);
        }

        @Override // m0.k
        public final void d(Menu menu) {
            g0.this.t(menu);
        }
    }

    /* loaded from: classes.dex */
    public class d extends x {
        public d() {
            g0.this = r1;
        }

        @Override // androidx.fragment.app.x
        public final o a(ClassLoader classLoader, String str) {
            Context context = g0.this.f1417t.f1604t;
            Object obj = o.f1504l0;
            try {
                return x.c(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (IllegalAccessException e10) {
                throw new o.d(e0.d.a("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e10);
            } catch (InstantiationException e11) {
                throw new o.d(e0.d.a("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e11);
            } catch (NoSuchMethodException e12) {
                throw new o.d(e0.d.a("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e12);
            } catch (InvocationTargetException e13) {
                throw new o.d(e0.d.a("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e13);
            }
        }
    }

    /* loaded from: classes.dex */
    public class e implements d1 {
    }

    /* loaded from: classes.dex */
    public class f implements Runnable {
        public f() {
            g0.this = r1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            g0.this.A(true);
        }
    }

    /* loaded from: classes.dex */
    public class g implements k0 {

        /* renamed from: s */
        public final /* synthetic */ o f1428s;

        public g(o oVar) {
            this.f1428s = oVar;
        }

        @Override // androidx.fragment.app.k0
        public final void d() {
            Objects.requireNonNull(this.f1428s);
        }
    }

    /* loaded from: classes.dex */
    public class h implements androidx.activity.result.c<androidx.activity.result.b> {
        public h() {
            g0.this = r1;
        }

        @Override // androidx.activity.result.c
        public final void a(androidx.activity.result.b bVar) {
            StringBuilder sb;
            androidx.activity.result.b bVar2 = bVar;
            k pollFirst = g0.this.C.pollFirst();
            if (pollFirst == null) {
                sb = new StringBuilder();
                sb.append("No Activities were started for result for ");
                sb.append(this);
            } else {
                String str = pollFirst.f1431s;
                int i10 = pollFirst.f1432t;
                o d5 = g0.this.f1401c.d(str);
                if (d5 == null) {
                    sb = androidx.fragment.app.a.c("Activity result delivered for unknown Fragment ", str);
                } else {
                    d5.D(i10, bVar2.f426s, bVar2.f427t);
                    return;
                }
            }
            Log.w("FragmentManager", sb.toString());
        }
    }

    /* loaded from: classes.dex */
    public class i implements androidx.activity.result.c<androidx.activity.result.b> {
        public i() {
            g0.this = r1;
        }

        @Override // androidx.activity.result.c
        public final void a(androidx.activity.result.b bVar) {
            StringBuilder sb;
            androidx.activity.result.b bVar2 = bVar;
            k pollFirst = g0.this.C.pollFirst();
            if (pollFirst == null) {
                sb = new StringBuilder();
                sb.append("No IntentSenders were started for ");
                sb.append(this);
            } else {
                String str = pollFirst.f1431s;
                int i10 = pollFirst.f1432t;
                o d5 = g0.this.f1401c.d(str);
                if (d5 == null) {
                    sb = androidx.fragment.app.a.c("Intent Sender result delivered for unknown Fragment ", str);
                } else {
                    d5.D(i10, bVar2.f426s, bVar2.f427t);
                    return;
                }
            }
            Log.w("FragmentManager", sb.toString());
        }
    }

    /* loaded from: classes.dex */
    public static class j extends c.a<androidx.activity.result.g, androidx.activity.result.b> {
        @Override // c.a
        public final Intent a(Context context, androidx.activity.result.g gVar) {
            Bundle bundleExtra;
            androidx.activity.result.g gVar2 = gVar;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent intent2 = gVar2.f443t;
            if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    gVar2 = new androidx.activity.result.g(gVar2.f442s, null, gVar2.f444u, gVar2.f445v);
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", gVar2);
            if (g0.K(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        @Override // c.a
        public final androidx.activity.result.b c(int i10, Intent intent) {
            return new androidx.activity.result.b(i10, intent);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static class k implements Parcelable {
        public static final Parcelable.Creator<k> CREATOR = new a();

        /* renamed from: s */
        public String f1431s;

        /* renamed from: t */
        public int f1432t;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<k> {
            @Override // android.os.Parcelable.Creator
            public final k createFromParcel(Parcel parcel) {
                return new k(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final k[] newArray(int i10) {
                return new k[i10];
            }
        }

        public k(Parcel parcel) {
            this.f1431s = parcel.readString();
            this.f1432t = parcel.readInt();
        }

        public k(String str, int i10) {
            this.f1431s = str;
            this.f1432t = i10;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f1431s);
            parcel.writeInt(this.f1432t);
        }
    }

    /* loaded from: classes.dex */
    public interface l {
        boolean a(ArrayList<androidx.fragment.app.b> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* loaded from: classes.dex */
    public class m implements l {

        /* renamed from: a */
        public final int f1433a;

        /* renamed from: b */
        public final int f1434b = 1;

        public m(int i10) {
            g0.this = r1;
            this.f1433a = i10;
        }

        @Override // androidx.fragment.app.g0.l
        public final boolean a(ArrayList<androidx.fragment.app.b> arrayList, ArrayList<Boolean> arrayList2) {
            o oVar = g0.this.f1420w;
            if (oVar == null || this.f1433a >= 0 || !oVar.k().R()) {
                return g0.this.T(arrayList, arrayList2, null, this.f1433a, this.f1434b);
            }
            return false;
        }
    }

    public g0() {
        Collections.synchronizedMap(new HashMap());
    }

    public static boolean K(int i10) {
        return Log.isLoggable("FragmentManager", i10);
    }

    /* JADX WARN: Finally extract failed */
    public final boolean A(boolean z10) {
        boolean z11;
        z(z10);
        boolean z12 = false;
        while (true) {
            ArrayList<androidx.fragment.app.b> arrayList = this.I;
            ArrayList<Boolean> arrayList2 = this.J;
            synchronized (this.f1399a) {
                if (this.f1399a.isEmpty()) {
                    z11 = false;
                } else {
                    int size = this.f1399a.size();
                    z11 = false;
                    for (int i10 = 0; i10 < size; i10++) {
                        z11 |= this.f1399a.get(i10).a(arrayList, arrayList2);
                    }
                    this.f1399a.clear();
                    this.f1417t.f1605u.removeCallbacks(this.M);
                }
            }
            if (!z11) {
                f0();
                v();
                this.f1401c.b();
                return z12;
            }
            this.f1400b = true;
            try {
                V(this.I, this.J);
                d();
                z12 = true;
            } catch (Throwable th) {
                d();
                throw th;
            }
        }
    }

    public final void B(l lVar, boolean z10) {
        if (!z10 || (this.f1417t != null && !this.G)) {
            z(z10);
            if (lVar.a(this.I, this.J)) {
                this.f1400b = true;
                try {
                    V(this.I, this.J);
                } finally {
                    d();
                }
            }
            f0();
            v();
            this.f1401c.b();
        }
    }

    public final void C(ArrayList<androidx.fragment.app.b> arrayList, ArrayList<Boolean> arrayList2, int i10, int i11) {
        ArrayList<androidx.fragment.app.b> arrayList3;
        int i12;
        ViewGroup viewGroup;
        g0 g0Var;
        g0 g0Var2;
        o oVar;
        int i13;
        int i14;
        boolean z10;
        ArrayList<androidx.fragment.app.b> arrayList4 = arrayList;
        ArrayList<Boolean> arrayList5 = arrayList2;
        int i15 = i11;
        boolean z11 = arrayList4.get(i10).p;
        ArrayList<o> arrayList6 = this.K;
        if (arrayList6 == null) {
            this.K = new ArrayList<>();
        } else {
            arrayList6.clear();
        }
        this.K.addAll(this.f1401c.h());
        o oVar2 = this.f1420w;
        boolean z12 = false;
        int i16 = i10;
        while (true) {
            int i17 = 1;
            if (i16 < i15) {
                androidx.fragment.app.b bVar = arrayList4.get(i16);
                int i18 = 3;
                if (!arrayList5.get(i16).booleanValue()) {
                    ArrayList<o> arrayList7 = this.K;
                    int i19 = 0;
                    while (i19 < bVar.f1538a.size()) {
                        o0.a aVar = bVar.f1538a.get(i19);
                        int i20 = aVar.f1553a;
                        if (i20 != i17) {
                            if (i20 == 2) {
                                o oVar3 = aVar.f1554b;
                                int i21 = oVar3.O;
                                int size = arrayList7.size() - 1;
                                boolean z13 = false;
                                while (size >= 0) {
                                    o oVar4 = arrayList7.get(size);
                                    if (oVar4.O == i21) {
                                        if (oVar4 == oVar3) {
                                            z13 = true;
                                        } else {
                                            if (oVar4 == oVar2) {
                                                i14 = i21;
                                                z10 = true;
                                                bVar.f1538a.add(i19, new o0.a(9, oVar4, true));
                                                i19++;
                                                oVar2 = null;
                                            } else {
                                                i14 = i21;
                                                z10 = true;
                                            }
                                            o0.a aVar2 = new o0.a(3, oVar4, z10);
                                            aVar2.f1556d = aVar.f1556d;
                                            aVar2.f1558f = aVar.f1558f;
                                            aVar2.f1557e = aVar.f1557e;
                                            aVar2.f1559g = aVar.f1559g;
                                            bVar.f1538a.add(i19, aVar2);
                                            arrayList7.remove(oVar4);
                                            i19++;
                                            size--;
                                            i21 = i14;
                                        }
                                    }
                                    i14 = i21;
                                    size--;
                                    i21 = i14;
                                }
                                if (z13) {
                                    bVar.f1538a.remove(i19);
                                    i19--;
                                } else {
                                    i13 = 1;
                                    aVar.f1553a = 1;
                                    aVar.f1555c = true;
                                    arrayList7.add(oVar3);
                                    i17 = i13;
                                    i19 += i17;
                                    i18 = 3;
                                }
                            } else if (i20 == i18 || i20 == 6) {
                                arrayList7.remove(aVar.f1554b);
                                o oVar5 = aVar.f1554b;
                                if (oVar5 == oVar2) {
                                    bVar.f1538a.add(i19, new o0.a(9, oVar5));
                                    i19++;
                                    oVar2 = null;
                                    i17 = 1;
                                    i19 += i17;
                                    i18 = 3;
                                }
                            } else if (i20 == 7) {
                                i17 = 1;
                            } else if (i20 == 8) {
                                bVar.f1538a.add(i19, new o0.a(9, oVar2, true));
                                aVar.f1555c = true;
                                i19++;
                                oVar2 = aVar.f1554b;
                            }
                            i13 = 1;
                            i17 = i13;
                            i19 += i17;
                            i18 = 3;
                        }
                        arrayList7.add(aVar.f1554b);
                        i19 += i17;
                        i18 = 3;
                    }
                } else {
                    ArrayList<o> arrayList8 = this.K;
                    int size2 = bVar.f1538a.size() - 1;
                    while (size2 >= 0) {
                        o0.a aVar3 = bVar.f1538a.get(size2);
                        int i22 = aVar3.f1553a;
                        if (i22 != i17) {
                            if (i22 != 3) {
                                switch (i22) {
                                    case 8:
                                        oVar = null;
                                        oVar2 = oVar;
                                        break;
                                    case 9:
                                        oVar = aVar3.f1554b;
                                        oVar2 = oVar;
                                        break;
                                    case 10:
                                        aVar3.f1561i = aVar3.f1560h;
                                        break;
                                }
                                size2--;
                                i17 = 1;
                            }
                            arrayList8.add(aVar3.f1554b);
                            size2--;
                            i17 = 1;
                        }
                        arrayList8.remove(aVar3.f1554b);
                        size2--;
                        i17 = 1;
                    }
                }
                z12 = z12 || bVar.f1544g;
                i16++;
                arrayList4 = arrayList;
                arrayList5 = arrayList2;
                i15 = i11;
            } else {
                this.K.clear();
                if (z11 || this.f1416s < 1) {
                    arrayList3 = arrayList;
                    i12 = i11;
                } else {
                    int i23 = i10;
                    i12 = i11;
                    while (true) {
                        arrayList3 = arrayList;
                        if (i23 < i12) {
                            Iterator<o0.a> it = arrayList3.get(i23).f1538a.iterator();
                            while (it.hasNext()) {
                                o oVar6 = it.next().f1554b;
                                if (oVar6 != null && oVar6.J != null) {
                                    this.f1401c.i(f(oVar6));
                                }
                            }
                            i23++;
                        }
                    }
                }
                for (int i24 = i10; i24 < i12; i24++) {
                    androidx.fragment.app.b bVar2 = arrayList3.get(i24);
                    if (arrayList2.get(i24).booleanValue()) {
                        bVar2.f(-1);
                        boolean z14 = true;
                        int size3 = bVar2.f1538a.size() - 1;
                        while (size3 >= 0) {
                            o0.a aVar4 = bVar2.f1538a.get(size3);
                            o oVar7 = aVar4.f1554b;
                            if (oVar7 != null) {
                                oVar7.c0(z14);
                                int i25 = bVar2.f1543f;
                                int i26 = 4100;
                                if (i25 == 4097) {
                                    i26 = 8194;
                                } else if (i25 == 8194) {
                                    i26 = 4097;
                                } else if (i25 != 8197) {
                                    i26 = i25 != 4099 ? i25 != 4100 ? 0 : 8197 : 4099;
                                }
                                if (oVar7.Z != null || i26 != 0) {
                                    oVar7.i();
                                    oVar7.Z.f1530f = i26;
                                }
                                ArrayList<String> arrayList9 = bVar2.f1552o;
                                ArrayList<String> arrayList10 = bVar2.f1551n;
                                oVar7.i();
                                o.c cVar = oVar7.Z;
                                cVar.f1531g = arrayList9;
                                cVar.f1532h = arrayList10;
                            }
                            switch (aVar4.f1553a) {
                                case 1:
                                    oVar7.Z(aVar4.f1556d, aVar4.f1557e, aVar4.f1558f, aVar4.f1559g);
                                    bVar2.f1364q.Z(oVar7, true);
                                    bVar2.f1364q.U(oVar7);
                                    break;
                                case 2:
                                default:
                                    StringBuilder c10 = androidx.activity.result.a.c("Unknown cmd: ");
                                    c10.append(aVar4.f1553a);
                                    throw new IllegalArgumentException(c10.toString());
                                case 3:
                                    oVar7.Z(aVar4.f1556d, aVar4.f1557e, aVar4.f1558f, aVar4.f1559g);
                                    bVar2.f1364q.a(oVar7);
                                    break;
                                case 4:
                                    oVar7.Z(aVar4.f1556d, aVar4.f1557e, aVar4.f1558f, aVar4.f1559g);
                                    bVar2.f1364q.d0(oVar7);
                                    break;
                                case 5:
                                    oVar7.Z(aVar4.f1556d, aVar4.f1557e, aVar4.f1558f, aVar4.f1559g);
                                    bVar2.f1364q.Z(oVar7, true);
                                    bVar2.f1364q.J(oVar7);
                                    break;
                                case 6:
                                    oVar7.Z(aVar4.f1556d, aVar4.f1557e, aVar4.f1558f, aVar4.f1559g);
                                    bVar2.f1364q.c(oVar7);
                                    break;
                                case 7:
                                    oVar7.Z(aVar4.f1556d, aVar4.f1557e, aVar4.f1558f, aVar4.f1559g);
                                    bVar2.f1364q.Z(oVar7, true);
                                    bVar2.f1364q.g(oVar7);
                                    break;
                                case 8:
                                    g0Var2 = bVar2.f1364q;
                                    oVar7 = null;
                                    g0Var2.b0(oVar7);
                                    break;
                                case 9:
                                    g0Var2 = bVar2.f1364q;
                                    g0Var2.b0(oVar7);
                                    break;
                                case 10:
                                    bVar2.f1364q.a0(oVar7, aVar4.f1560h);
                                    break;
                            }
                            size3--;
                            z14 = true;
                        }
                        continue;
                    } else {
                        bVar2.f(1);
                        int size4 = bVar2.f1538a.size();
                        for (int i27 = 0; i27 < size4; i27++) {
                            o0.a aVar5 = bVar2.f1538a.get(i27);
                            o oVar8 = aVar5.f1554b;
                            if (oVar8 != null) {
                                oVar8.c0(false);
                                int i28 = bVar2.f1543f;
                                if (oVar8.Z != null || i28 != 0) {
                                    oVar8.i();
                                    oVar8.Z.f1530f = i28;
                                }
                                ArrayList<String> arrayList11 = bVar2.f1551n;
                                ArrayList<String> arrayList12 = bVar2.f1552o;
                                oVar8.i();
                                o.c cVar2 = oVar8.Z;
                                cVar2.f1531g = arrayList11;
                                cVar2.f1532h = arrayList12;
                            }
                            switch (aVar5.f1553a) {
                                case 1:
                                    oVar8.Z(aVar5.f1556d, aVar5.f1557e, aVar5.f1558f, aVar5.f1559g);
                                    bVar2.f1364q.Z(oVar8, false);
                                    bVar2.f1364q.a(oVar8);
                                    break;
                                case 2:
                                default:
                                    StringBuilder c11 = androidx.activity.result.a.c("Unknown cmd: ");
                                    c11.append(aVar5.f1553a);
                                    throw new IllegalArgumentException(c11.toString());
                                case 3:
                                    oVar8.Z(aVar5.f1556d, aVar5.f1557e, aVar5.f1558f, aVar5.f1559g);
                                    bVar2.f1364q.U(oVar8);
                                    break;
                                case 4:
                                    oVar8.Z(aVar5.f1556d, aVar5.f1557e, aVar5.f1558f, aVar5.f1559g);
                                    bVar2.f1364q.J(oVar8);
                                    break;
                                case 5:
                                    oVar8.Z(aVar5.f1556d, aVar5.f1557e, aVar5.f1558f, aVar5.f1559g);
                                    bVar2.f1364q.Z(oVar8, false);
                                    bVar2.f1364q.d0(oVar8);
                                    break;
                                case 6:
                                    oVar8.Z(aVar5.f1556d, aVar5.f1557e, aVar5.f1558f, aVar5.f1559g);
                                    bVar2.f1364q.g(oVar8);
                                    break;
                                case 7:
                                    oVar8.Z(aVar5.f1556d, aVar5.f1557e, aVar5.f1558f, aVar5.f1559g);
                                    bVar2.f1364q.Z(oVar8, false);
                                    bVar2.f1364q.c(oVar8);
                                    break;
                                case 8:
                                    g0Var = bVar2.f1364q;
                                    g0Var.b0(oVar8);
                                    break;
                                case 9:
                                    g0Var = bVar2.f1364q;
                                    oVar8 = null;
                                    g0Var.b0(oVar8);
                                    break;
                                case 10:
                                    bVar2.f1364q.a0(oVar8, aVar5.f1561i);
                                    break;
                            }
                        }
                        continue;
                    }
                }
                boolean booleanValue = arrayList2.get(i12 - 1).booleanValue();
                for (int i29 = i10; i29 < i12; i29++) {
                    androidx.fragment.app.b bVar3 = arrayList3.get(i29);
                    if (booleanValue) {
                        for (int size5 = bVar3.f1538a.size() - 1; size5 >= 0; size5--) {
                            o oVar9 = bVar3.f1538a.get(size5).f1554b;
                            if (oVar9 != null) {
                                f(oVar9).k();
                            }
                        }
                    } else {
                        Iterator<o0.a> it2 = bVar3.f1538a.iterator();
                        while (it2.hasNext()) {
                            o oVar10 = it2.next().f1554b;
                            if (oVar10 != null) {
                                f(oVar10).k();
                            }
                        }
                    }
                }
                P(this.f1416s, true);
                HashSet hashSet = new HashSet();
                for (int i30 = i10; i30 < i12; i30++) {
                    Iterator<o0.a> it3 = arrayList3.get(i30).f1538a.iterator();
                    while (it3.hasNext()) {
                        o oVar11 = it3.next().f1554b;
                        if (oVar11 != null && (viewGroup = oVar11.V) != null) {
                            hashSet.add(z0.g(viewGroup, I()));
                        }
                    }
                }
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    z0 z0Var = (z0) it4.next();
                    z0Var.f1615d = booleanValue;
                    z0Var.h();
                    z0Var.c();
                }
                for (int i31 = i10; i31 < i12; i31++) {
                    androidx.fragment.app.b bVar4 = arrayList3.get(i31);
                    if (arrayList2.get(i31).booleanValue() && bVar4.f1366s >= 0) {
                        bVar4.f1366s = -1;
                    }
                    Objects.requireNonNull(bVar4);
                }
                return;
            }
        }
    }

    public final o D(String str) {
        return this.f1401c.c(str);
    }

    public final o E(int i10) {
        n0 n0Var = this.f1401c;
        int size = n0Var.f1500a.size();
        while (true) {
            size--;
            if (size < 0) {
                for (m0 m0Var : n0Var.f1501b.values()) {
                    if (m0Var != null) {
                        o oVar = m0Var.f1477c;
                        if (oVar.N == i10) {
                            return oVar;
                        }
                    }
                }
                return null;
            }
            o oVar2 = n0Var.f1500a.get(size);
            if (oVar2 != null && oVar2.N == i10) {
                return oVar2;
            }
        }
    }

    public final o F(String str) {
        n0 n0Var = this.f1401c;
        Objects.requireNonNull(n0Var);
        int size = n0Var.f1500a.size();
        while (true) {
            size--;
            if (size < 0) {
                for (m0 m0Var : n0Var.f1501b.values()) {
                    if (m0Var != null) {
                        o oVar = m0Var.f1477c;
                        if (str.equals(oVar.P)) {
                            return oVar;
                        }
                    }
                }
                return null;
            }
            o oVar2 = n0Var.f1500a.get(size);
            if (oVar2 != null && str.equals(oVar2.P)) {
                return oVar2;
            }
        }
    }

    public final ViewGroup G(o oVar) {
        ViewGroup viewGroup = oVar.V;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (oVar.O > 0 && this.f1418u.j()) {
            View i10 = this.f1418u.i(oVar.O);
            if (i10 instanceof ViewGroup) {
                return (ViewGroup) i10;
            }
        }
        return null;
    }

    public final x H() {
        o oVar = this.f1419v;
        return oVar != null ? oVar.J.H() : this.f1421x;
    }

    public final d1 I() {
        o oVar = this.f1419v;
        return oVar != null ? oVar.J.I() : this.y;
    }

    public final void J(o oVar) {
        if (K(2)) {
            Log.v("FragmentManager", "hide: " + oVar);
        }
        if (!oVar.Q) {
            oVar.Q = true;
            oVar.f1505a0 = true ^ oVar.f1505a0;
            c0(oVar);
        }
    }

    public final boolean L(o oVar) {
        h0 h0Var = oVar.L;
        Iterator it = ((ArrayList) h0Var.f1401c.f()).iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            o oVar2 = (o) it.next();
            if (oVar2 != null) {
                z10 = h0Var.L(oVar2);
                continue;
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    public final boolean M(o oVar) {
        g0 g0Var;
        if (oVar == null) {
            return true;
        }
        return oVar.T && ((g0Var = oVar.J) == null || g0Var.M(oVar.M));
    }

    public final boolean N(o oVar) {
        if (oVar == null) {
            return true;
        }
        g0 g0Var = oVar.J;
        return oVar.equals(g0Var.f1420w) && N(g0Var.f1419v);
    }

    public final boolean O() {
        return this.E || this.F;
    }

    public final void P(int i10, boolean z10) {
        y<?> yVar;
        if (this.f1417t != null || i10 == -1) {
            if (!z10 && i10 == this.f1416s) {
                return;
            }
            this.f1416s = i10;
            n0 n0Var = this.f1401c;
            Iterator<o> it = n0Var.f1500a.iterator();
            while (it.hasNext()) {
                m0 m0Var = n0Var.f1501b.get(it.next().f1520w);
                if (m0Var != null) {
                    m0Var.k();
                }
            }
            Iterator<m0> it2 = n0Var.f1501b.values().iterator();
            while (true) {
                boolean z11 = false;
                if (!it2.hasNext()) {
                    break;
                }
                m0 next = it2.next();
                if (next != null) {
                    next.k();
                    o oVar = next.f1477c;
                    if (oVar.D && !oVar.B()) {
                        z11 = true;
                    }
                    if (z11) {
                        n0Var.j(next);
                    }
                }
            }
            e0();
            if (!this.D || (yVar = this.f1417t) == null || this.f1416s != 7) {
                return;
            }
            yVar.n();
            this.D = false;
            return;
        }
        throw new IllegalStateException("No activity");
    }

    public final void Q() {
        if (this.f1417t == null) {
            return;
        }
        this.E = false;
        this.F = false;
        this.L.f1461h = false;
        for (o oVar : this.f1401c.h()) {
            if (oVar != null) {
                oVar.L.Q();
            }
        }
    }

    public final boolean R() {
        return S(-1, 0);
    }

    public final boolean S(int i10, int i11) {
        A(false);
        z(true);
        o oVar = this.f1420w;
        if (oVar == null || i10 >= 0 || !oVar.k().R()) {
            boolean T = T(this.I, this.J, null, i10, i11);
            if (T) {
                this.f1400b = true;
                try {
                    V(this.I, this.J);
                } finally {
                    d();
                }
            }
            f0();
            v();
            this.f1401c.b();
            return T;
        }
        return true;
    }

    public final boolean T(ArrayList<androidx.fragment.app.b> arrayList, ArrayList<Boolean> arrayList2, String str, int i10, int i11) {
        boolean z10 = (i11 & 1) != 0;
        ArrayList<androidx.fragment.app.b> arrayList3 = this.f1402d;
        int i12 = -1;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            if (str != null || i10 >= 0) {
                int size = this.f1402d.size() - 1;
                while (size >= 0) {
                    androidx.fragment.app.b bVar = this.f1402d.get(size);
                    if ((str != null && str.equals(bVar.f1546i)) || (i10 >= 0 && i10 == bVar.f1366s)) {
                        break;
                    }
                    size--;
                }
                if (size >= 0) {
                    if (z10) {
                        while (size > 0) {
                            int i13 = size - 1;
                            androidx.fragment.app.b bVar2 = this.f1402d.get(i13);
                            if ((str == null || !str.equals(bVar2.f1546i)) && (i10 < 0 || i10 != bVar2.f1366s)) {
                                break;
                            }
                            size = i13;
                        }
                    } else if (size != this.f1402d.size() - 1) {
                        size++;
                    }
                }
                i12 = size;
            } else {
                i12 = z10 ? 0 : (-1) + this.f1402d.size();
            }
        }
        if (i12 < 0) {
            return false;
        }
        for (int size2 = this.f1402d.size() - 1; size2 >= i12; size2--) {
            arrayList.add(this.f1402d.remove(size2));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void U(o oVar) {
        if (K(2)) {
            Log.v("FragmentManager", "remove: " + oVar + " nesting=" + oVar.I);
        }
        boolean z10 = !oVar.B();
        if (!oVar.R || z10) {
            n0 n0Var = this.f1401c;
            synchronized (n0Var.f1500a) {
                n0Var.f1500a.remove(oVar);
            }
            oVar.C = false;
            if (L(oVar)) {
                this.D = true;
            }
            oVar.D = true;
            c0(oVar);
        }
    }

    public final void V(ArrayList<androidx.fragment.app.b> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            if (!arrayList.get(i10).p) {
                if (i11 != i10) {
                    C(arrayList, arrayList2, i11, i10);
                }
                i11 = i10 + 1;
                if (arrayList2.get(i10).booleanValue()) {
                    while (i11 < size && arrayList2.get(i11).booleanValue() && !arrayList.get(i11).p) {
                        i11++;
                    }
                }
                C(arrayList, arrayList2, i10, i11);
                i10 = i11 - 1;
            }
            i10++;
        }
        if (i11 == size) {
            return;
        }
        C(arrayList, arrayList2, i11, size);
    }

    public final void W(Parcelable parcelable) {
        int i10;
        m0 m0Var;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.f1417t.f1604t.getClassLoader());
                this.f1409k.put(str.substring(7), bundle2);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.f1417t.f1604t.getClassLoader());
                arrayList.add((l0) bundle.getParcelable("state"));
            }
        }
        n0 n0Var = this.f1401c;
        n0Var.f1502c.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            l0 l0Var = (l0) it.next();
            n0Var.f1502c.put(l0Var.f1467t, l0Var);
        }
        i0 i0Var = (i0) bundle3.getParcelable("state");
        if (i0Var == null) {
            return;
        }
        this.f1401c.f1501b.clear();
        Iterator<String> it2 = i0Var.f1445s.iterator();
        while (it2.hasNext()) {
            l0 k10 = this.f1401c.k(it2.next(), null);
            if (k10 != null) {
                o oVar = this.L.f1456c.get(k10.f1467t);
                if (oVar != null) {
                    if (K(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + oVar);
                    }
                    m0Var = new m0(this.f1410l, this.f1401c, oVar, k10);
                } else {
                    m0Var = new m0(this.f1410l, this.f1401c, this.f1417t.f1604t.getClassLoader(), H(), k10);
                }
                o oVar2 = m0Var.f1477c;
                oVar2.J = this;
                if (K(2)) {
                    StringBuilder c10 = androidx.activity.result.a.c("restoreSaveState: active (");
                    c10.append(oVar2.f1520w);
                    c10.append("): ");
                    c10.append(oVar2);
                    Log.v("FragmentManager", c10.toString());
                }
                m0Var.m(this.f1417t.f1604t.getClassLoader());
                this.f1401c.i(m0Var);
                m0Var.f1479e = this.f1416s;
            }
        }
        j0 j0Var = this.L;
        Objects.requireNonNull(j0Var);
        Iterator it3 = new ArrayList(j0Var.f1456c.values()).iterator();
        while (true) {
            i10 = 0;
            if (!it3.hasNext()) {
                break;
            }
            o oVar3 = (o) it3.next();
            if (this.f1401c.f1501b.get(oVar3.f1520w) != null) {
                i10 = 1;
            }
            if (i10 == 0) {
                if (K(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + oVar3 + " that was not found in the set of active Fragments " + i0Var.f1445s);
                }
                this.L.d(oVar3);
                oVar3.J = this;
                m0 m0Var2 = new m0(this.f1410l, this.f1401c, oVar3);
                m0Var2.f1479e = 1;
                m0Var2.k();
                oVar3.D = true;
                m0Var2.k();
            }
        }
        n0 n0Var2 = this.f1401c;
        ArrayList<String> arrayList2 = i0Var.f1446t;
        n0Var2.f1500a.clear();
        if (arrayList2 != null) {
            for (String str3 : arrayList2) {
                o c11 = n0Var2.c(str3);
                if (c11 == null) {
                    throw new IllegalStateException(e0.d.a("No instantiated fragment for (", str3, ")"));
                }
                if (K(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + c11);
                }
                n0Var2.a(c11);
            }
        }
        if (i0Var.f1447u != null) {
            this.f1402d = new ArrayList<>(i0Var.f1447u.length);
            int i11 = 0;
            while (true) {
                androidx.fragment.app.c[] cVarArr = i0Var.f1447u;
                if (i11 >= cVarArr.length) {
                    break;
                }
                androidx.fragment.app.c cVar = cVarArr[i11];
                Objects.requireNonNull(cVar);
                androidx.fragment.app.b bVar = new androidx.fragment.app.b(this);
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    int[] iArr = cVar.f1368s;
                    if (i12 >= iArr.length) {
                        break;
                    }
                    o0.a aVar = new o0.a();
                    int i14 = i12 + 1;
                    aVar.f1553a = iArr[i12];
                    if (K(2)) {
                        Log.v("FragmentManager", "Instantiate " + bVar + " op #" + i13 + " base fragment #" + cVar.f1368s[i14]);
                    }
                    aVar.f1560h = g.c.values()[cVar.f1370u[i13]];
                    aVar.f1561i = g.c.values()[cVar.f1371v[i13]];
                    int[] iArr2 = cVar.f1368s;
                    int i15 = i14 + 1;
                    aVar.f1555c = iArr2[i14] != 0;
                    int i16 = i15 + 1;
                    int i17 = iArr2[i15];
                    aVar.f1556d = i17;
                    int i18 = i16 + 1;
                    int i19 = iArr2[i16];
                    aVar.f1557e = i19;
                    int i20 = i18 + 1;
                    int i21 = iArr2[i18];
                    aVar.f1558f = i21;
                    int i22 = iArr2[i20];
                    aVar.f1559g = i22;
                    bVar.f1539b = i17;
                    bVar.f1540c = i19;
                    bVar.f1541d = i21;
                    bVar.f1542e = i22;
                    bVar.b(aVar);
                    i13++;
                    i12 = i20 + 1;
                }
                bVar.f1543f = cVar.f1372w;
                bVar.f1546i = cVar.f1373x;
                bVar.f1544g = true;
                bVar.f1547j = cVar.f1374z;
                bVar.f1548k = cVar.A;
                bVar.f1549l = cVar.B;
                bVar.f1550m = cVar.C;
                bVar.f1551n = cVar.D;
                bVar.f1552o = cVar.E;
                bVar.p = cVar.F;
                bVar.f1366s = cVar.y;
                for (int i23 = 0; i23 < cVar.f1369t.size(); i23++) {
                    String str4 = cVar.f1369t.get(i23);
                    if (str4 != null) {
                        bVar.f1538a.get(i23).f1554b = D(str4);
                    }
                }
                bVar.f(1);
                if (K(2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i11 + " (index " + bVar.f1366s + "): " + bVar);
                    PrintWriter printWriter = new PrintWriter(new w0());
                    bVar.i("  ", printWriter, false);
                    printWriter.close();
                }
                this.f1402d.add(bVar);
                i11++;
            }
        } else {
            this.f1402d = null;
        }
        this.f1407i.set(i0Var.f1448v);
        String str5 = i0Var.f1449w;
        if (str5 != null) {
            o D = D(str5);
            this.f1420w = D;
            r(D);
        }
        ArrayList<String> arrayList3 = i0Var.f1450x;
        if (arrayList3 != null) {
            while (i10 < arrayList3.size()) {
                this.f1408j.put(arrayList3.get(i10), i0Var.y.get(i10));
                i10++;
            }
        }
        this.C = new ArrayDeque<>(i0Var.f1451z);
    }

    public final Bundle X() {
        int i10;
        androidx.fragment.app.c[] cVarArr;
        ArrayList<String> arrayList;
        int size;
        Bundle bundle = new Bundle();
        Iterator it = ((HashSet) e()).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            z0 z0Var = (z0) it.next();
            if (z0Var.f1616e) {
                if (K(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                z0Var.f1616e = false;
                z0Var.c();
            }
        }
        x();
        A(true);
        this.E = true;
        this.L.f1461h = true;
        n0 n0Var = this.f1401c;
        Objects.requireNonNull(n0Var);
        ArrayList<String> arrayList2 = new ArrayList<>(n0Var.f1501b.size());
        for (m0 m0Var : n0Var.f1501b.values()) {
            if (m0Var != null) {
                o oVar = m0Var.f1477c;
                m0Var.o();
                arrayList2.add(oVar.f1520w);
                if (K(2)) {
                    Log.v("FragmentManager", "Saved state of " + oVar + ": " + oVar.f1517t);
                }
            }
        }
        n0 n0Var2 = this.f1401c;
        Objects.requireNonNull(n0Var2);
        ArrayList arrayList3 = new ArrayList(n0Var2.f1502c.values());
        if (!arrayList3.isEmpty()) {
            n0 n0Var3 = this.f1401c;
            synchronized (n0Var3.f1500a) {
                cVarArr = null;
                if (n0Var3.f1500a.isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList<>(n0Var3.f1500a.size());
                    Iterator<o> it2 = n0Var3.f1500a.iterator();
                    while (it2.hasNext()) {
                        o next = it2.next();
                        arrayList.add(next.f1520w);
                        if (K(2)) {
                            Log.v("FragmentManager", "saveAllState: adding fragment (" + next.f1520w + "): " + next);
                        }
                    }
                }
            }
            ArrayList<androidx.fragment.app.b> arrayList4 = this.f1402d;
            if (arrayList4 != null && (size = arrayList4.size()) > 0) {
                cVarArr = new androidx.fragment.app.c[size];
                for (i10 = 0; i10 < size; i10++) {
                    cVarArr[i10] = new androidx.fragment.app.c(this.f1402d.get(i10));
                    if (K(2)) {
                        Log.v("FragmentManager", "saveAllState: adding back stack #" + i10 + ": " + this.f1402d.get(i10));
                    }
                }
            }
            i0 i0Var = new i0();
            i0Var.f1445s = arrayList2;
            i0Var.f1446t = arrayList;
            i0Var.f1447u = cVarArr;
            i0Var.f1448v = this.f1407i.get();
            o oVar2 = this.f1420w;
            if (oVar2 != null) {
                i0Var.f1449w = oVar2.f1520w;
            }
            i0Var.f1450x.addAll(this.f1408j.keySet());
            i0Var.y.addAll(this.f1408j.values());
            i0Var.f1451z = new ArrayList<>(this.C);
            bundle.putParcelable("state", i0Var);
            for (String str : this.f1409k.keySet()) {
                bundle.putBundle(d7.a.c("result_", str), this.f1409k.get(str));
            }
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                l0 l0Var = (l0) it3.next();
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("state", l0Var);
                StringBuilder c10 = androidx.activity.result.a.c("fragment_");
                c10.append(l0Var.f1467t);
                bundle.putBundle(c10.toString(), bundle2);
            }
        } else if (K(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
        }
        return bundle;
    }

    public final void Y() {
        synchronized (this.f1399a) {
            boolean z10 = true;
            if (this.f1399a.size() != 1) {
                z10 = false;
            }
            if (z10) {
                this.f1417t.f1605u.removeCallbacks(this.M);
                this.f1417t.f1605u.post(this.M);
                f0();
            }
        }
    }

    public final void Z(o oVar, boolean z10) {
        ViewGroup G = G(oVar);
        if (G == null || !(G instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) G).setDrawDisappearingViewsLast(!z10);
    }

    public final m0 a(o oVar) {
        String str = oVar.f1508d0;
        if (str != null) {
            y0.d.d(oVar, str);
        }
        if (K(2)) {
            Log.v("FragmentManager", "add: " + oVar);
        }
        m0 f10 = f(oVar);
        oVar.J = this;
        this.f1401c.i(f10);
        if (!oVar.R) {
            this.f1401c.a(oVar);
            oVar.D = false;
            if (oVar.W == null) {
                oVar.f1505a0 = false;
            }
            if (L(oVar)) {
                this.D = true;
            }
        }
        return f10;
    }

    public final void a0(o oVar, g.c cVar) {
        if (oVar.equals(D(oVar.f1520w)) && (oVar.K == null || oVar.J == this)) {
            oVar.f1509e0 = cVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + oVar + " is not an active fragment of FragmentManager " + this);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x014e  */
    @android.annotation.SuppressLint({"SyntheticAccessor"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(androidx.fragment.app.y<?> r4, androidx.fragment.app.v r5, androidx.fragment.app.o r6) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.g0.b(androidx.fragment.app.y, androidx.fragment.app.v, androidx.fragment.app.o):void");
    }

    public final void b0(o oVar) {
        if (oVar == null || (oVar.equals(D(oVar.f1520w)) && (oVar.K == null || oVar.J == this))) {
            o oVar2 = this.f1420w;
            this.f1420w = oVar;
            r(oVar2);
            r(this.f1420w);
            return;
        }
        throw new IllegalArgumentException("Fragment " + oVar + " is not an active fragment of FragmentManager " + this);
    }

    public final void c(o oVar) {
        if (K(2)) {
            Log.v("FragmentManager", "attach: " + oVar);
        }
        if (oVar.R) {
            oVar.R = false;
            if (oVar.C) {
                return;
            }
            this.f1401c.a(oVar);
            if (K(2)) {
                Log.v("FragmentManager", "add from attach: " + oVar);
            }
            if (!L(oVar)) {
                return;
            }
            this.D = true;
        }
    }

    public final void c0(o oVar) {
        ViewGroup G = G(oVar);
        if (G != null) {
            if (oVar.s() + oVar.r() + oVar.o() + oVar.m() <= 0) {
                return;
            }
            if (G.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                G.setTag(R.id.visible_removing_fragment_view_tag, oVar);
            }
            o oVar2 = (o) G.getTag(R.id.visible_removing_fragment_view_tag);
            o.c cVar = oVar.Z;
            oVar2.c0(cVar == null ? false : cVar.f1525a);
        }
    }

    public final void d() {
        this.f1400b = false;
        this.J.clear();
        this.I.clear();
    }

    public final void d0(o oVar) {
        if (K(2)) {
            Log.v("FragmentManager", "show: " + oVar);
        }
        if (oVar.Q) {
            oVar.Q = false;
            oVar.f1505a0 = !oVar.f1505a0;
        }
    }

    public final Set<z0> e() {
        HashSet hashSet = new HashSet();
        Iterator it = ((ArrayList) this.f1401c.e()).iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((m0) it.next()).f1477c.V;
            if (viewGroup != null) {
                hashSet.add(z0.g(viewGroup, I()));
            }
        }
        return hashSet;
    }

    public final void e0() {
        Iterator it = ((ArrayList) this.f1401c.e()).iterator();
        while (it.hasNext()) {
            m0 m0Var = (m0) it.next();
            o oVar = m0Var.f1477c;
            if (oVar.X) {
                if (this.f1400b) {
                    this.H = true;
                } else {
                    oVar.X = false;
                    m0Var.k();
                }
            }
        }
    }

    public final m0 f(o oVar) {
        m0 g10 = this.f1401c.g(oVar.f1520w);
        if (g10 != null) {
            return g10;
        }
        m0 m0Var = new m0(this.f1410l, this.f1401c, oVar);
        m0Var.m(this.f1417t.f1604t.getClassLoader());
        m0Var.f1479e = this.f1416s;
        return m0Var;
    }

    public final void f0() {
        synchronized (this.f1399a) {
            boolean z10 = true;
            if (!this.f1399a.isEmpty()) {
                this.f1406h.f424a = true;
                return;
            }
            b bVar = this.f1406h;
            ArrayList<androidx.fragment.app.b> arrayList = this.f1402d;
            if ((arrayList != null ? arrayList.size() : 0) <= 0 || !N(this.f1419v)) {
                z10 = false;
            }
            bVar.f424a = z10;
        }
    }

    public final void g(o oVar) {
        if (K(2)) {
            Log.v("FragmentManager", "detach: " + oVar);
        }
        if (!oVar.R) {
            oVar.R = true;
            if (!oVar.C) {
                return;
            }
            if (K(2)) {
                Log.v("FragmentManager", "remove from detach: " + oVar);
            }
            n0 n0Var = this.f1401c;
            synchronized (n0Var.f1500a) {
                n0Var.f1500a.remove(oVar);
            }
            oVar.C = false;
            if (L(oVar)) {
                this.D = true;
            }
            c0(oVar);
        }
    }

    public final void h(Configuration configuration) {
        for (o oVar : this.f1401c.h()) {
            if (oVar != null) {
                oVar.onConfigurationChanged(configuration);
                oVar.L.h(configuration);
            }
        }
    }

    public final boolean i(MenuItem menuItem) {
        if (this.f1416s < 1) {
            return false;
        }
        for (o oVar : this.f1401c.h()) {
            if (oVar != null) {
                if (!oVar.Q ? oVar.L.i(menuItem) : false) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void j() {
        this.E = false;
        this.F = false;
        this.L.f1461h = false;
        u(1);
    }

    public final boolean k(Menu menu, MenuInflater menuInflater) {
        if (this.f1416s < 1) {
            return false;
        }
        ArrayList<o> arrayList = null;
        boolean z10 = false;
        for (o oVar : this.f1401c.h()) {
            if (oVar != null && M(oVar)) {
                if (!oVar.Q ? oVar.L.k(menu, menuInflater) | false : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    arrayList.add(oVar);
                    z10 = true;
                }
            }
        }
        if (this.f1403e != null) {
            for (int i10 = 0; i10 < this.f1403e.size(); i10++) {
                o oVar2 = this.f1403e.get(i10);
                if (arrayList == null || !arrayList.contains(oVar2)) {
                    Objects.requireNonNull(oVar2);
                }
            }
        }
        this.f1403e = arrayList;
        return z10;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [androidx.activity.result.d, androidx.activity.result.e$a] */
    /* JADX WARN: Type inference failed for: r0v11, types: [androidx.activity.result.d, androidx.activity.result.e$a] */
    /* JADX WARN: Type inference failed for: r0v9, types: [androidx.activity.result.d, androidx.activity.result.e$a] */
    public final void l() {
        boolean z10 = true;
        this.G = true;
        A(true);
        x();
        y<?> yVar = this.f1417t;
        if (yVar instanceof j0) {
            z10 = this.f1401c.f1503d.f1460g;
        } else {
            Context context = yVar.f1604t;
            if (context instanceof Activity) {
                z10 = true ^ ((Activity) context).isChangingConfigurations();
            }
        }
        if (z10) {
            for (androidx.fragment.app.d dVar : this.f1408j.values()) {
                for (String str : dVar.f1376s) {
                    j0 j0Var = this.f1401c.f1503d;
                    Objects.requireNonNull(j0Var);
                    if (K(3)) {
                        Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
                    }
                    j0Var.c(str);
                }
            }
        }
        u(-1);
        y<?> yVar2 = this.f1417t;
        if (yVar2 instanceof c0.c) {
            ((c0.c) yVar2).D(this.f1413o);
        }
        y<?> yVar3 = this.f1417t;
        if (yVar3 instanceof c0.b) {
            ((c0.b) yVar3).o(this.f1412n);
        }
        y<?> yVar4 = this.f1417t;
        if (yVar4 instanceof v) {
            ((v) yVar4).m(this.p);
        }
        y<?> yVar5 = this.f1417t;
        if (yVar5 instanceof w) {
            ((w) yVar5).E(this.f1414q);
        }
        y<?> yVar6 = this.f1417t;
        if (yVar6 instanceof m0.h) {
            ((m0.h) yVar6).B(this.f1415r);
        }
        this.f1417t = null;
        this.f1418u = null;
        this.f1419v = null;
        if (this.f1405g != null) {
            Iterator<androidx.activity.a> it = this.f1406h.f425b.iterator();
            while (it.hasNext()) {
                it.next().cancel();
            }
            this.f1405g = null;
        }
        ?? r02 = this.f1422z;
        if (r02 != 0) {
            r02.h();
            this.A.h();
            this.B.h();
        }
    }

    public final void m() {
        for (o oVar : this.f1401c.h()) {
            if (oVar != null) {
                oVar.onLowMemory();
                oVar.L.m();
            }
        }
    }

    public final void n(boolean z10) {
        for (o oVar : this.f1401c.h()) {
            if (oVar != null) {
                oVar.L.n(z10);
            }
        }
    }

    public final void o() {
        Iterator it = ((ArrayList) this.f1401c.f()).iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            if (oVar != null) {
                oVar.A();
                oVar.L.o();
            }
        }
    }

    public final boolean p(MenuItem menuItem) {
        if (this.f1416s < 1) {
            return false;
        }
        for (o oVar : this.f1401c.h()) {
            if (oVar != null) {
                if (!oVar.Q ? oVar.L.p(menuItem) : false) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void q(Menu menu) {
        if (this.f1416s < 1) {
            return;
        }
        for (o oVar : this.f1401c.h()) {
            if (oVar != null && !oVar.Q) {
                oVar.L.q(menu);
            }
        }
    }

    public final void r(o oVar) {
        if (oVar == null || !oVar.equals(D(oVar.f1520w))) {
            return;
        }
        boolean N = oVar.J.N(oVar);
        Boolean bool = oVar.B;
        if (bool != null && bool.booleanValue() == N) {
            return;
        }
        oVar.B = Boolean.valueOf(N);
        h0 h0Var = oVar.L;
        h0Var.f0();
        h0Var.r(h0Var.f1420w);
    }

    public final void s(boolean z10) {
        for (o oVar : this.f1401c.h()) {
            if (oVar != null) {
                oVar.L.s(z10);
            }
        }
    }

    public final boolean t(Menu menu) {
        if (this.f1416s < 1) {
            return false;
        }
        boolean z10 = false;
        for (o oVar : this.f1401c.h()) {
            if (oVar != null && M(oVar)) {
                if (!oVar.Q ? oVar.L.t(menu) | false : false) {
                    z10 = true;
                }
            }
        }
        return z10;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        o oVar = this.f1419v;
        if (oVar != null) {
            sb.append(oVar.getClass().getSimpleName());
            sb.append("{");
            obj = this.f1419v;
        } else {
            y<?> yVar = this.f1417t;
            if (yVar == null) {
                sb.append("null");
                sb.append("}}");
                return sb.toString();
            }
            sb.append(yVar.getClass().getSimpleName());
            sb.append("{");
            obj = this.f1417t;
        }
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
        sb.append("}");
        sb.append("}}");
        return sb.toString();
    }

    /* JADX WARN: Finally extract failed */
    public final void u(int i10) {
        try {
            this.f1400b = true;
            for (m0 m0Var : this.f1401c.f1501b.values()) {
                if (m0Var != null) {
                    m0Var.f1479e = i10;
                }
            }
            P(i10, false);
            Iterator it = ((HashSet) e()).iterator();
            while (it.hasNext()) {
                ((z0) it.next()).e();
            }
            this.f1400b = false;
            A(true);
        } catch (Throwable th) {
            this.f1400b = false;
            throw th;
        }
    }

    public final void v() {
        if (this.H) {
            this.H = false;
            e0();
        }
    }

    public final void w(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String c10 = d7.a.c(str, "    ");
        n0 n0Var = this.f1401c;
        Objects.requireNonNull(n0Var);
        String str2 = str + "    ";
        if (!n0Var.f1501b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (m0 m0Var : n0Var.f1501b.values()) {
                printWriter.print(str);
                if (m0Var != null) {
                    o oVar = m0Var.f1477c;
                    printWriter.println(oVar);
                    oVar.h(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size3 = n0Var.f1500a.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i10 = 0; i10 < size3; i10++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(n0Var.f1500a.get(i10).toString());
            }
        }
        ArrayList<o> arrayList = this.f1403e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i11 = 0; i11 < size2; i11++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(this.f1403e.get(i11).toString());
            }
        }
        ArrayList<androidx.fragment.app.b> arrayList2 = this.f1402d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i12 = 0; i12 < size; i12++) {
                androidx.fragment.app.b bVar = this.f1402d.get(i12);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i12);
                printWriter.print(": ");
                printWriter.println(bVar.toString());
                bVar.i(c10, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f1407i.get());
        synchronized (this.f1399a) {
            int size4 = this.f1399a.size();
            if (size4 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i13 = 0; i13 < size4; i13++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i13);
                    printWriter.print(": ");
                    printWriter.println((l) this.f1399a.get(i13));
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f1417t);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f1418u);
        if (this.f1419v != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f1419v);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f1416s);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.E);
        printWriter.print(" mStopped=");
        printWriter.print(this.F);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.G);
        if (this.D) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.D);
        }
    }

    public final void x() {
        Iterator it = ((HashSet) e()).iterator();
        while (it.hasNext()) {
            ((z0) it.next()).e();
        }
    }

    public final void y(l lVar, boolean z10) {
        if (!z10) {
            if (this.f1417t == null) {
                if (!this.G) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            } else if (O()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f1399a) {
            if (this.f1417t == null) {
                if (!z10) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
                return;
            }
            this.f1399a.add(lVar);
            Y();
        }
    }

    public final void z(boolean z10) {
        if (!this.f1400b) {
            if (this.f1417t == null) {
                if (!this.G) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            } else if (Looper.myLooper() != this.f1417t.f1605u.getLooper()) {
                throw new IllegalStateException("Must be called from main thread of fragment host");
            } else {
                if (!z10 && O()) {
                    throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
                }
                if (this.I != null) {
                    return;
                }
                this.I = new ArrayList<>();
                this.J = new ArrayList<>();
                return;
            }
        }
        throw new IllegalStateException("FragmentManager is already executing transactions");
    }
}
