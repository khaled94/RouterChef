package u5;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.chip.ChipGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import u5.i;

/* loaded from: classes.dex */
public final class b<T extends i<T>> {

    /* renamed from: a */
    public final Map<Integer, T> f19077a = new HashMap();

    /* renamed from: b */
    public final Set<Integer> f19078b = new HashSet();

    /* renamed from: c */
    public a f19079c;

    /* renamed from: d */
    public boolean f19080d;

    /* renamed from: e */
    public boolean f19081e;

    /* loaded from: classes.dex */
    public interface a {
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.HashSet, java.util.Set<java.lang.Integer>] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.HashMap, java.util.Map<java.lang.Integer, T extends u5.i<T>>] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.HashSet, java.util.Set<java.lang.Integer>] */
    public final boolean a(i<T> iVar) {
        int id = iVar.getId();
        if (this.f19078b.contains(Integer.valueOf(id))) {
            return false;
        }
        i<T> iVar2 = (i) this.f19077a.get(Integer.valueOf(c()));
        if (iVar2 != null) {
            e(iVar2, false);
        }
        boolean add = this.f19078b.add(Integer.valueOf(id));
        if (!iVar.isChecked()) {
            iVar.setChecked(true);
        }
        return add;
    }

    public final List<Integer> b(ViewGroup viewGroup) {
        HashSet hashSet = new HashSet(this.f19078b);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if ((childAt instanceof i) && hashSet.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.HashSet, java.util.Set<java.lang.Integer>] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.HashSet, java.util.Set<java.lang.Integer>] */
    public final int c() {
        if (!this.f19080d || this.f19078b.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f19078b.iterator().next()).intValue();
    }

    public final void d() {
        a aVar = this.f19079c;
        if (aVar != null) {
            new HashSet(this.f19078b);
            ChipGroup chipGroup = ((com.google.android.material.chip.b) aVar).f3141a;
            ChipGroup.d dVar = chipGroup.y;
            if (dVar == null) {
                return;
            }
            chipGroup.f3110z.b(chipGroup);
            ChipGroup.a aVar2 = (ChipGroup.a) dVar;
            ChipGroup chipGroup2 = ChipGroup.this;
            if (!chipGroup2.f3110z.f19080d) {
                return;
            }
            ChipGroup.c cVar = aVar2.f3111a;
            chipGroup2.getCheckedChipId();
            cVar.a();
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.HashSet, java.util.Set<java.lang.Integer>] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.HashSet, java.util.Set<java.lang.Integer>] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.HashSet, java.util.Set<java.lang.Integer>] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.HashSet, java.util.Set<java.lang.Integer>] */
    public final boolean e(i<T> iVar, boolean z10) {
        int id = iVar.getId();
        if (!this.f19078b.contains(Integer.valueOf(id))) {
            return false;
        }
        if (z10 && this.f19078b.size() == 1 && this.f19078b.contains(Integer.valueOf(id))) {
            iVar.setChecked(true);
            return false;
        }
        boolean remove = this.f19078b.remove(Integer.valueOf(id));
        if (iVar.isChecked()) {
            iVar.setChecked(false);
        }
        return remove;
    }
}
