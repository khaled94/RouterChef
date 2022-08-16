package androidx.fragment.app;

import android.util.Log;
import androidx.activity.result.a;
import androidx.fragment.app.g0;
import androidx.fragment.app.o0;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import y0.d;

/* loaded from: classes.dex */
public final class b extends o0 implements g0.l {

    /* renamed from: q */
    public final g0 f1364q;

    /* renamed from: r */
    public boolean f1365r;

    /* renamed from: s */
    public int f1366s;

    public b(g0 g0Var) {
        g0Var.H();
        y<?> yVar = g0Var.f1417t;
        if (yVar != null) {
            yVar.f1604t.getClassLoader();
        }
        this.f1366s = -1;
        this.f1364q = g0Var;
    }

    @Override // androidx.fragment.app.g0.l
    public final boolean a(ArrayList<b> arrayList, ArrayList<Boolean> arrayList2) {
        if (g0.K(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (this.f1544g) {
            g0 g0Var = this.f1364q;
            if (g0Var.f1402d == null) {
                g0Var.f1402d = new ArrayList<>();
            }
            g0Var.f1402d.add(this);
            return true;
        }
        return true;
    }

    @Override // androidx.fragment.app.o0
    public final int c() {
        return g(false);
    }

    @Override // androidx.fragment.app.o0
    public final void d(int i10, o oVar, String str, int i11) {
        String str2 = oVar.f1508d0;
        if (str2 != null) {
            d.d(oVar, str2);
        }
        Class<?> cls = oVar.getClass();
        int modifiers = cls.getModifiers();
        if (!cls.isAnonymousClass() && Modifier.isPublic(modifiers) && (!cls.isMemberClass() || Modifier.isStatic(modifiers))) {
            if (str != null) {
                String str3 = oVar.P;
                if (str3 != null && !str.equals(str3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Can't change tag of fragment ");
                    sb.append(oVar);
                    sb.append(": was ");
                    throw new IllegalStateException(a.b(sb, oVar.P, " now ", str));
                }
                oVar.P = str;
            }
            if (i10 != 0) {
                if (i10 == -1) {
                    throw new IllegalArgumentException("Can't add fragment " + oVar + " with tag " + str + " to container view with no id");
                }
                int i12 = oVar.N;
                if (i12 != 0 && i12 != i10) {
                    throw new IllegalStateException("Can't change container ID of fragment " + oVar + ": was " + oVar.N + " now " + i10);
                }
                oVar.N = i10;
                oVar.O = i10;
            }
            b(new o0.a(i11, oVar));
            oVar.J = this.f1364q;
            return;
        }
        StringBuilder c10 = a.c("Fragment ");
        c10.append(cls.getCanonicalName());
        c10.append(" must be a public static class to be  properly recreated from instance state.");
        throw new IllegalStateException(c10.toString());
    }

    public final void f(int i10) {
        if (!this.f1544g) {
            return;
        }
        if (g0.K(2)) {
            Log.v("FragmentManager", "Bump nesting in " + this + " by " + i10);
        }
        int size = this.f1538a.size();
        for (int i11 = 0; i11 < size; i11++) {
            o0.a aVar = this.f1538a.get(i11);
            o oVar = aVar.f1554b;
            if (oVar != null) {
                oVar.I += i10;
                if (g0.K(2)) {
                    StringBuilder c10 = a.c("Bump nesting of ");
                    c10.append(aVar.f1554b);
                    c10.append(" to ");
                    c10.append(aVar.f1554b.I);
                    Log.v("FragmentManager", c10.toString());
                }
            }
        }
    }

    public final int g(boolean z10) {
        if (!this.f1365r) {
            if (g0.K(2)) {
                Log.v("FragmentManager", "Commit: " + this);
                PrintWriter printWriter = new PrintWriter(new w0());
                i("  ", printWriter, true);
                printWriter.close();
            }
            this.f1365r = true;
            this.f1366s = this.f1544g ? this.f1364q.f1407i.getAndIncrement() : -1;
            this.f1364q.y(this, z10);
            return this.f1366s;
        }
        throw new IllegalStateException("commit already called");
    }

    public final void h() {
        if (!this.f1544g) {
            this.f1545h = false;
            this.f1364q.B(this, false);
            return;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    public final void i(String str, PrintWriter printWriter, boolean z10) {
        String str2;
        if (z10) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f1546i);
            printWriter.print(" mIndex=");
            printWriter.print(this.f1366s);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f1365r);
            if (this.f1543f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f1543f));
            }
            if (this.f1539b != 0 || this.f1540c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1539b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1540c));
            }
            if (this.f1541d != 0 || this.f1542e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1541d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1542e));
            }
            if (this.f1547j != 0 || this.f1548k != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1547j));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f1548k);
            }
            if (this.f1549l != 0 || this.f1550m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1549l));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f1550m);
            }
        }
        if (!this.f1538a.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.f1538a.size();
            for (int i10 = 0; i10 < size; i10++) {
                o0.a aVar = this.f1538a.get(i10);
                switch (aVar.f1553a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        StringBuilder c10 = a.c("cmd=");
                        c10.append(aVar.f1553a);
                        str2 = c10.toString();
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.f1554b);
                if (z10) {
                    if (aVar.f1556d != 0 || aVar.f1557e != 0) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f1556d));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f1557e));
                    }
                    if (aVar.f1558f != 0 || aVar.f1559g != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f1558f));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f1559g));
                    }
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f1366s >= 0) {
            sb.append(" #");
            sb.append(this.f1366s);
        }
        if (this.f1546i != null) {
            sb.append(" ");
            sb.append(this.f1546i);
        }
        sb.append("}");
        return sb.toString();
    }
}
