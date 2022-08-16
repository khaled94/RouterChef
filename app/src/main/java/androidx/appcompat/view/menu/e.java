package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import c0.a;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import m0.b0;

/* loaded from: classes.dex */
public class e implements g0.a {
    public static final int[] y = {1, 4, 5, 3, 2, 0};

    /* renamed from: a */
    public final Context f551a;

    /* renamed from: b */
    public final Resources f552b;

    /* renamed from: c */
    public boolean f553c;

    /* renamed from: d */
    public boolean f554d;

    /* renamed from: e */
    public a f555e;

    /* renamed from: m */
    public CharSequence f563m;

    /* renamed from: n */
    public Drawable f564n;

    /* renamed from: o */
    public View f565o;

    /* renamed from: v */
    public g f571v;

    /* renamed from: x */
    public boolean f573x;

    /* renamed from: l */
    public int f562l = 0;
    public boolean p = false;

    /* renamed from: q */
    public boolean f566q = false;

    /* renamed from: r */
    public boolean f567r = false;

    /* renamed from: s */
    public boolean f568s = false;

    /* renamed from: t */
    public ArrayList<g> f569t = new ArrayList<>();

    /* renamed from: u */
    public CopyOnWriteArrayList<WeakReference<i>> f570u = new CopyOnWriteArrayList<>();

    /* renamed from: w */
    public boolean f572w = false;

    /* renamed from: f */
    public ArrayList<g> f556f = new ArrayList<>();

    /* renamed from: g */
    public ArrayList<g> f557g = new ArrayList<>();

    /* renamed from: h */
    public boolean f558h = true;

    /* renamed from: i */
    public ArrayList<g> f559i = new ArrayList<>();

    /* renamed from: j */
    public ArrayList<g> f560j = new ArrayList<>();

    /* renamed from: k */
    public boolean f561k = true;

    /* loaded from: classes.dex */
    public interface a {
        boolean a(e eVar, MenuItem menuItem);

        void b(e eVar);
    }

    /* loaded from: classes.dex */
    public interface b {
        boolean a(g gVar);
    }

    public e(Context context) {
        boolean z10;
        boolean z11 = false;
        this.f551a = context;
        Resources resources = context.getResources();
        this.f552b = resources;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = b0.f5852a;
            if (Build.VERSION.SDK_INT >= 28) {
                z10 = b0.b.b(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                z10 = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (z10) {
                z11 = true;
            }
        }
        this.f554d = z11;
    }

    public final void A() {
        this.p = false;
        if (this.f566q) {
            this.f566q = false;
            r(this.f567r);
        }
    }

    public final void B() {
        if (!this.p) {
            this.p = true;
            this.f566q = false;
            this.f567r = false;
        }
    }

    public final MenuItem a(int i10, int i11, int i12, CharSequence charSequence) {
        int i13;
        int i14 = ((-65536) & i12) >> 16;
        if (i14 >= 0) {
            int[] iArr = y;
            if (i14 < 6) {
                int i15 = (iArr[i14] << 16) | (65535 & i12);
                g gVar = new g(this, i10, i11, i12, i15, charSequence, this.f562l);
                ArrayList<g> arrayList = this.f556f;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        i13 = 0;
                        break;
                    } else if (arrayList.get(size).f580d <= i15) {
                        i13 = size + 1;
                        break;
                    }
                }
                arrayList.add(i13, gVar);
                r(true);
                return gVar;
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10) {
        return a(0, 0, 0, this.f552b.getString(i10));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10, int i11, int i12, int i13) {
        return a(i10, i11, i12, this.f552b.getString(i13));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return a(i10, i11, i12, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        int i14;
        PackageManager packageManager = this.f551a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i13 & 1) == 0) {
            removeGroup(i10);
        }
        for (int i15 = 0; i15 < size; i15++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i15);
            int i16 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i16 < 0 ? intent : intentArr[i16]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            g gVar = (g) a(i10, i11, i12, resolveInfo.loadLabel(packageManager));
            gVar.setIcon(resolveInfo.loadIcon(packageManager));
            gVar.setIntent(intent2);
            if (menuItemArr != null && (i14 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i14] = gVar;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10) {
        return addSubMenu(0, 0, 0, this.f552b.getString(i10));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return addSubMenu(i10, i11, i12, this.f552b.getString(i13));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        g gVar = (g) a(i10, i11, i12, charSequence);
        l lVar = new l(this.f551a, this, gVar);
        gVar.f591o = lVar;
        lVar.setHeaderTitle(gVar.f581e);
        return lVar;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(i iVar) {
        c(iVar, this.f551a);
    }

    public final void c(i iVar, Context context) {
        this.f570u.add(new WeakReference<>(iVar));
        iVar.e(context, this);
        this.f561k = true;
    }

    @Override // android.view.Menu
    public final void clear() {
        g gVar = this.f571v;
        if (gVar != null) {
            e(gVar);
        }
        this.f556f.clear();
        r(true);
    }

    public final void clearHeader() {
        this.f564n = null;
        this.f563m = null;
        this.f565o = null;
        r(false);
    }

    @Override // android.view.Menu
    public final void close() {
        d(true);
    }

    public final void d(boolean z10) {
        if (this.f568s) {
            return;
        }
        this.f568s = true;
        Iterator<WeakReference<i>> it = this.f570u.iterator();
        while (it.hasNext()) {
            WeakReference<i> next = it.next();
            i iVar = next.get();
            if (iVar == null) {
                this.f570u.remove(next);
            } else {
                iVar.a(this, z10);
            }
        }
        this.f568s = false;
    }

    public boolean e(g gVar) {
        boolean z10 = false;
        if (!this.f570u.isEmpty() && this.f571v == gVar) {
            B();
            Iterator<WeakReference<i>> it = this.f570u.iterator();
            while (it.hasNext()) {
                WeakReference<i> next = it.next();
                i iVar = next.get();
                if (iVar == null) {
                    this.f570u.remove(next);
                } else {
                    z10 = iVar.c(gVar);
                    if (z10) {
                        break;
                    }
                }
            }
            A();
            if (z10) {
                this.f571v = null;
            }
        }
        return z10;
    }

    public boolean f(e eVar, MenuItem menuItem) {
        a aVar = this.f555e;
        return aVar != null && aVar.a(eVar, menuItem);
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i10) {
        MenuItem findItem;
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = this.f556f.get(i11);
            if (gVar.f577a == i10) {
                return gVar;
            }
            if (gVar.hasSubMenu() && (findItem = gVar.f591o.findItem(i10)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public boolean g(g gVar) {
        boolean z10 = false;
        if (this.f570u.isEmpty()) {
            return false;
        }
        B();
        Iterator<WeakReference<i>> it = this.f570u.iterator();
        while (it.hasNext()) {
            WeakReference<i> next = it.next();
            i iVar = next.get();
            if (iVar == null) {
                this.f570u.remove(next);
            } else {
                z10 = iVar.k(gVar);
                if (z10) {
                    break;
                }
            }
        }
        A();
        if (z10) {
            this.f571v = gVar;
        }
        return z10;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i10) {
        return this.f556f.get(i10);
    }

    public final g h(int i10, KeyEvent keyEvent) {
        char c10;
        ArrayList<g> arrayList = this.f569t;
        arrayList.clear();
        i(arrayList, i10, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean o10 = o();
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = arrayList.get(i11);
            if (o10) {
                c10 = gVar.f586j;
            } else {
                c10 = gVar.f584h;
            }
            char[] cArr = keyData.meta;
            if ((c10 == cArr[0] && (metaState & 2) == 0) || ((c10 == cArr[2] && (metaState & 2) != 0) || (o10 && c10 == '\b' && i10 == 67))) {
                return gVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f573x) {
            return true;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f556f.get(i10).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i(List<g> list, int i10, KeyEvent keyEvent) {
        char c10;
        int i11;
        boolean o10 = o();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i10 == 67) {
            int size = this.f556f.size();
            for (int i12 = 0; i12 < size; i12++) {
                g gVar = this.f556f.get(i12);
                if (gVar.hasSubMenu()) {
                    gVar.f591o.i(list, i10, keyEvent);
                }
                if (o10) {
                    c10 = gVar.f586j;
                } else {
                    c10 = gVar.f584h;
                }
                if (o10) {
                    i11 = gVar.f587k;
                } else {
                    i11 = gVar.f585i;
                }
                if (((modifiers & 69647) == (i11 & 69647)) && c10 != 0) {
                    char[] cArr = keyData.meta;
                    if ((c10 == cArr[0] || c10 == cArr[2] || (o10 && c10 == '\b' && i10 == 67)) && gVar.isEnabled()) {
                        list.add(gVar);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return h(i10, keyEvent) != null;
    }

    public final void j() {
        ArrayList<g> m10 = m();
        if (!this.f561k) {
            return;
        }
        Iterator<WeakReference<i>> it = this.f570u.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            WeakReference<i> next = it.next();
            i iVar = next.get();
            if (iVar == null) {
                this.f570u.remove(next);
            } else {
                z10 |= iVar.i();
            }
        }
        if (z10) {
            this.f559i.clear();
            this.f560j.clear();
            int size = m10.size();
            for (int i10 = 0; i10 < size; i10++) {
                g gVar = m10.get(i10);
                (gVar.g() ? this.f559i : this.f560j).add(gVar);
            }
        } else {
            this.f559i.clear();
            this.f560j.clear();
            this.f560j.addAll(m());
        }
        this.f561k = false;
    }

    public String k() {
        return "android:menu:actionviewstates";
    }

    public e l() {
        return this;
    }

    public final ArrayList<g> m() {
        if (!this.f558h) {
            return this.f557g;
        }
        this.f557g.clear();
        int size = this.f556f.size();
        for (int i10 = 0; i10 < size; i10++) {
            g gVar = this.f556f.get(i10);
            if (gVar.isVisible()) {
                this.f557g.add(gVar);
            }
        }
        this.f558h = false;
        this.f561k = true;
        return this.f557g;
    }

    public boolean n() {
        return this.f572w;
    }

    public boolean o() {
        return this.f553c;
    }

    public boolean p() {
        return this.f554d;
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i10, int i11) {
        return t(findItem(i10), null, i11);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        g h10 = h(i10, keyEvent);
        boolean t10 = h10 != null ? t(h10, null, i11) : false;
        if ((i11 & 2) != 0) {
            d(true);
        }
        return t10;
    }

    public final void q() {
        this.f561k = true;
        r(true);
    }

    public final void r(boolean z10) {
        if (!this.p) {
            if (z10) {
                this.f558h = true;
                this.f561k = true;
            }
            if (this.f570u.isEmpty()) {
                return;
            }
            B();
            Iterator<WeakReference<i>> it = this.f570u.iterator();
            while (it.hasNext()) {
                WeakReference<i> next = it.next();
                i iVar = next.get();
                if (iVar == null) {
                    this.f570u.remove(next);
                } else {
                    iVar.f();
                }
            }
            A();
            return;
        }
        this.f566q = true;
        if (!z10) {
            return;
        }
        this.f567r = true;
    }

    @Override // android.view.Menu
    public final void removeGroup(int i10) {
        int size = size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                i11 = -1;
                break;
            } else if (this.f556f.get(i11).f578b == i10) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 >= 0) {
            int size2 = this.f556f.size() - i11;
            int i12 = 0;
            while (true) {
                int i13 = i12 + 1;
                if (i12 >= size2 || this.f556f.get(i11).f578b != i10) {
                    break;
                }
                u(i11, false);
                i12 = i13;
            }
            r(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i10) {
        int size = size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                i11 = -1;
                break;
            } else if (this.f556f.get(i11).f577a == i10) {
                break;
            } else {
                i11++;
            }
        }
        u(i11, true);
    }

    public final boolean s(MenuItem menuItem, int i10) {
        return t(menuItem, null, i10);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i10, boolean z10, boolean z11) {
        int size = this.f556f.size();
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = this.f556f.get(i11);
            if (gVar.f578b == i10) {
                gVar.f599x = (gVar.f599x & (-5)) | (z11 ? 4 : 0);
                gVar.setCheckable(z10);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z10) {
        this.f572w = z10;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i10, boolean z10) {
        int size = this.f556f.size();
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = this.f556f.get(i11);
            if (gVar.f578b == i10) {
                gVar.setEnabled(z10);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i10, boolean z10) {
        int size = this.f556f.size();
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = this.f556f.get(i11);
            if (gVar.f578b == i10) {
                int i12 = gVar.f599x;
                int i13 = (i12 & (-9)) | (z10 ? 0 : 8);
                gVar.f599x = i13;
                if (i12 != i13) {
                    z11 = true;
                }
            }
        }
        if (z11) {
            r(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z10) {
        this.f553c = z10;
        r(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f556f.size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x005b, code lost:
        if (r1 != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005d, code lost:
        d(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006d, code lost:
        if ((r9 & 1) == 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00c9, code lost:
        if (r1 == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00cc, code lost:
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean t(android.view.MenuItem r7, androidx.appcompat.view.menu.i r8, int r9) {
        /*
            r6 = this;
            androidx.appcompat.view.menu.g r7 = (androidx.appcompat.view.menu.g) r7
            r0 = 0
            if (r7 == 0) goto Lcd
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto Ld
            goto Lcd
        Ld:
            android.view.MenuItem$OnMenuItemClickListener r1 = r7.p
            r2 = 1
            if (r1 == 0) goto L19
            boolean r1 = r1.onMenuItemClick(r7)
            if (r1 == 0) goto L19
            goto L21
        L19:
            androidx.appcompat.view.menu.e r1 = r7.f590n
            boolean r1 = r1.f(r1, r7)
            if (r1 == 0) goto L23
        L21:
            r1 = r2
            goto L43
        L23:
            android.content.Intent r1 = r7.f583g
            if (r1 == 0) goto L37
            androidx.appcompat.view.menu.e r3 = r7.f590n     // Catch: android.content.ActivityNotFoundException -> L2f
            android.content.Context r3 = r3.f551a     // Catch: android.content.ActivityNotFoundException -> L2f
            r3.startActivity(r1)     // Catch: android.content.ActivityNotFoundException -> L2f
            goto L21
        L2f:
            r1 = move-exception
            java.lang.String r3 = "MenuItemImpl"
            java.lang.String r4 = "Can't find activity to handle intent; ignoring"
            android.util.Log.e(r3, r4, r1)
        L37:
            m0.b r1 = r7.A
            if (r1 == 0) goto L42
            boolean r1 = r1.e()
            if (r1 == 0) goto L42
            goto L21
        L42:
            r1 = r0
        L43:
            m0.b r3 = r7.A
            if (r3 == 0) goto L4f
            boolean r4 = r3.a()
            if (r4 == 0) goto L4f
            r4 = r2
            goto L50
        L4f:
            r4 = r0
        L50:
            boolean r5 = r7.f()
            if (r5 == 0) goto L62
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto Lcc
        L5d:
            r6.d(r2)
            goto Lcc
        L62:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L70
            if (r4 == 0) goto L6b
            goto L70
        L6b:
            r7 = r9 & 1
            if (r7 != 0) goto Lcc
            goto L5d
        L70:
            r9 = r9 & 4
            if (r9 != 0) goto L77
            r6.d(r0)
        L77:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L8b
            androidx.appcompat.view.menu.l r9 = new androidx.appcompat.view.menu.l
            android.content.Context r5 = r6.f551a
            r9.<init>(r5, r6, r7)
            r7.f591o = r9
            java.lang.CharSequence r5 = r7.f581e
            r9.setHeaderTitle(r5)
        L8b:
            androidx.appcompat.view.menu.l r7 = r7.f591o
            if (r4 == 0) goto L92
            r3.f(r7)
        L92:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.i>> r9 = r6.f570u
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L9b
            goto Lc8
        L9b:
            if (r8 == 0) goto La1
            boolean r0 = r8.h(r7)
        La1:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.i>> r8 = r6.f570u
            java.util.Iterator r8 = r8.iterator()
        La7:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto Lc8
            java.lang.Object r9 = r8.next()
            java.lang.ref.WeakReference r9 = (java.lang.ref.WeakReference) r9
            java.lang.Object r3 = r9.get()
            androidx.appcompat.view.menu.i r3 = (androidx.appcompat.view.menu.i) r3
            if (r3 != 0) goto Lc1
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.i>> r3 = r6.f570u
            r3.remove(r9)
            goto La7
        Lc1:
            if (r0 != 0) goto La7
            boolean r0 = r3.h(r7)
            goto La7
        Lc8:
            r1 = r1 | r0
            if (r1 != 0) goto Lcc
            goto L5d
        Lcc:
            return r1
        Lcd:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.e.t(android.view.MenuItem, androidx.appcompat.view.menu.i, int):boolean");
    }

    public final void u(int i10, boolean z10) {
        if (i10 < 0 || i10 >= this.f556f.size()) {
            return;
        }
        this.f556f.remove(i10);
        if (!z10) {
            return;
        }
        r(true);
    }

    public final void v(i iVar) {
        Iterator<WeakReference<i>> it = this.f570u.iterator();
        while (it.hasNext()) {
            WeakReference<i> next = it.next();
            i iVar2 = next.get();
            if (iVar2 == null || iVar2 == iVar) {
                this.f570u.remove(next);
            }
        }
    }

    public final void w(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(k());
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((l) item.getSubMenu()).w(bundle);
            }
        }
        int i11 = bundle.getInt("android:menu:expandedactionview");
        if (i11 <= 0 || (findItem = findItem(i11)) == null) {
            return;
        }
        findItem.expandActionView();
    }

    public final void x(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((l) item.getSubMenu()).x(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(k(), sparseArray);
        }
    }

    public void y(a aVar) {
        this.f555e = aVar;
    }

    public final void z(int i10, CharSequence charSequence, int i11, Drawable drawable, View view) {
        Resources resources = this.f552b;
        if (view != null) {
            this.f565o = view;
            this.f563m = null;
            this.f564n = null;
        } else {
            if (i10 > 0) {
                this.f563m = resources.getText(i10);
            } else if (charSequence != null) {
                this.f563m = charSequence;
            }
            if (i11 > 0) {
                Context context = this.f551a;
                Object obj = c0.a.f2602a;
                this.f564n = a.b.b(context, i11);
            } else if (drawable != null) {
                this.f564n = drawable;
            }
            this.f565o = null;
        }
        r(false);
    }
}
