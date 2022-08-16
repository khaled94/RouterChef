package i1;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a */
    public final String f5172a;

    /* renamed from: b */
    public final Map<String, a> f5173b;

    /* renamed from: c */
    public final Set<b> f5174c;

    /* renamed from: d */
    public final Set<d> f5175d;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final String f5176a;

        /* renamed from: b */
        public final String f5177b;

        /* renamed from: c */
        public final int f5178c;

        /* renamed from: d */
        public final boolean f5179d;

        /* renamed from: e */
        public final int f5180e;

        /* renamed from: f */
        public final String f5181f;

        /* renamed from: g */
        public final int f5182g;

        public a(String str, String str2, boolean z10, int i10, String str3, int i11) {
            this.f5176a = str;
            this.f5177b = str2;
            this.f5179d = z10;
            this.f5180e = i10;
            int i12 = 5;
            if (str2 != null) {
                String upperCase = str2.toUpperCase(Locale.US);
                if (upperCase.contains("INT")) {
                    i12 = 3;
                } else if (upperCase.contains("CHAR") || upperCase.contains("CLOB") || upperCase.contains("TEXT")) {
                    i12 = 2;
                } else if (!upperCase.contains("BLOB")) {
                    i12 = (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
                }
            }
            this.f5178c = i12;
            this.f5181f = str3;
            this.f5182g = i11;
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x0045  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0057 A[RETURN] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static boolean a(java.lang.String r6, java.lang.String r7) {
            /*
                r0 = 0
                if (r7 != 0) goto L4
                return r0
            L4:
                boolean r1 = r6.equals(r7)
                r2 = 1
                if (r1 == 0) goto Lc
                return r2
            Lc:
                int r1 = r6.length()
                if (r1 != 0) goto L13
                goto L42
            L13:
                r1 = r0
                r3 = r1
            L15:
                int r4 = r6.length()
                if (r1 >= r4) goto L3e
                char r4 = r6.charAt(r1)
                r5 = 40
                if (r1 != 0) goto L26
                if (r4 == r5) goto L26
                goto L42
            L26:
                if (r4 != r5) goto L2b
                int r3 = r3 + 1
                goto L3b
            L2b:
                r5 = 41
                if (r4 != r5) goto L3b
                int r3 = r3 + (-1)
                if (r3 != 0) goto L3b
                int r4 = r6.length()
                int r4 = r4 - r2
                if (r1 == r4) goto L3b
                goto L42
            L3b:
                int r1 = r1 + 1
                goto L15
            L3e:
                if (r3 != 0) goto L42
                r1 = r2
                goto L43
            L42:
                r1 = r0
            L43:
                if (r1 == 0) goto L57
                int r0 = r6.length()
                int r0 = r0 - r2
                java.lang.String r6 = r6.substring(r2, r0)
                java.lang.String r6 = r6.trim()
                boolean r6 = r6.equals(r7)
                return r6
            L57:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: i1.c.a.a(java.lang.String, java.lang.String):boolean");
        }

        public final boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f5180e != aVar.f5180e || !this.f5176a.equals(aVar.f5176a) || this.f5179d != aVar.f5179d) {
                return false;
            }
            if (this.f5182g == 1 && aVar.f5182g == 2 && (str3 = this.f5181f) != null && !a(str3, aVar.f5181f)) {
                return false;
            }
            if (this.f5182g == 2 && aVar.f5182g == 1 && (str2 = aVar.f5181f) != null && !a(str2, this.f5181f)) {
                return false;
            }
            int i10 = this.f5182g;
            return (i10 == 0 || i10 != aVar.f5182g || ((str = this.f5181f) == null ? aVar.f5181f == null : a(str, aVar.f5181f))) && this.f5178c == aVar.f5178c;
        }

        public final int hashCode() {
            return (((((this.f5176a.hashCode() * 31) + this.f5178c) * 31) + (this.f5179d ? 1231 : 1237)) * 31) + this.f5180e;
        }

        public final String toString() {
            StringBuilder c10 = androidx.activity.result.a.c("Column{name='");
            c10.append(this.f5176a);
            c10.append('\'');
            c10.append(", type='");
            c10.append(this.f5177b);
            c10.append('\'');
            c10.append(", affinity='");
            c10.append(this.f5178c);
            c10.append('\'');
            c10.append(", notNull=");
            c10.append(this.f5179d);
            c10.append(", primaryKeyPosition=");
            c10.append(this.f5180e);
            c10.append(", defaultValue='");
            c10.append(this.f5181f);
            c10.append('\'');
            c10.append('}');
            return c10.toString();
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public final String f5183a;

        /* renamed from: b */
        public final String f5184b;

        /* renamed from: c */
        public final String f5185c;

        /* renamed from: d */
        public final List<String> f5186d;

        /* renamed from: e */
        public final List<String> f5187e;

        public b(String str, String str2, String str3, List<String> list, List<String> list2) {
            this.f5183a = str;
            this.f5184b = str2;
            this.f5185c = str3;
            this.f5186d = Collections.unmodifiableList(list);
            this.f5187e = Collections.unmodifiableList(list2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (!this.f5183a.equals(bVar.f5183a) || !this.f5184b.equals(bVar.f5184b) || !this.f5185c.equals(bVar.f5185c) || !this.f5186d.equals(bVar.f5186d)) {
                return false;
            }
            return this.f5187e.equals(bVar.f5187e);
        }

        public final int hashCode() {
            int a10 = androidx.fragment.app.a.a(this.f5185c, androidx.fragment.app.a.a(this.f5184b, this.f5183a.hashCode() * 31, 31), 31);
            return this.f5187e.hashCode() + ((this.f5186d.hashCode() + a10) * 31);
        }

        public final String toString() {
            StringBuilder c10 = androidx.activity.result.a.c("ForeignKey{referenceTable='");
            c10.append(this.f5183a);
            c10.append('\'');
            c10.append(", onDelete='");
            c10.append(this.f5184b);
            c10.append('\'');
            c10.append(", onUpdate='");
            c10.append(this.f5185c);
            c10.append('\'');
            c10.append(", columnNames=");
            c10.append(this.f5186d);
            c10.append(", referenceColumnNames=");
            c10.append(this.f5187e);
            c10.append('}');
            return c10.toString();
        }
    }

    /* renamed from: i1.c$c */
    /* loaded from: classes.dex */
    public static class C0073c implements Comparable<C0073c> {

        /* renamed from: s */
        public final int f5188s;

        /* renamed from: t */
        public final int f5189t;

        /* renamed from: u */
        public final String f5190u;

        /* renamed from: v */
        public final String f5191v;

        public C0073c(int i10, int i11, String str, String str2) {
            this.f5188s = i10;
            this.f5189t = i11;
            this.f5190u = str;
            this.f5191v = str2;
        }

        @Override // java.lang.Comparable
        public final int compareTo(C0073c c0073c) {
            C0073c c0073c2 = c0073c;
            int i10 = this.f5188s - c0073c2.f5188s;
            return i10 == 0 ? this.f5189t - c0073c2.f5189t : i10;
        }
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a */
        public final String f5192a;

        /* renamed from: b */
        public final boolean f5193b;

        /* renamed from: c */
        public final List<String> f5194c;

        /* renamed from: d */
        public final List<String> f5195d;

        public d(String str, boolean z10, List<String> list, List<String> list2) {
            this.f5192a = str;
            this.f5193b = z10;
            this.f5194c = list;
            this.f5195d = (list2 == null || list2.size() == 0) ? Collections.nCopies(list.size(), "ASC") : list2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (this.f5193b != dVar.f5193b || !this.f5194c.equals(dVar.f5194c) || !this.f5195d.equals(dVar.f5195d)) {
                return false;
            }
            return this.f5192a.startsWith("index_") ? dVar.f5192a.startsWith("index_") : this.f5192a.equals(dVar.f5192a);
        }

        public final int hashCode() {
            int hashCode = this.f5192a.startsWith("index_") ? -1184239155 : this.f5192a.hashCode();
            return this.f5195d.hashCode() + ((this.f5194c.hashCode() + (((hashCode * 31) + (this.f5193b ? 1 : 0)) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder c10 = androidx.activity.result.a.c("Index{name='");
            c10.append(this.f5192a);
            c10.append('\'');
            c10.append(", unique=");
            c10.append(this.f5193b);
            c10.append(", columns=");
            c10.append(this.f5194c);
            c10.append(", orders=");
            c10.append(this.f5195d);
            c10.append('}');
            return c10.toString();
        }
    }

    public c(String str, Map<String, a> map, Set<b> set, Set<d> set2) {
        this.f5172a = str;
        this.f5173b = Collections.unmodifiableMap(map);
        this.f5174c = Collections.unmodifiableSet(set);
        this.f5175d = set2 == null ? null : Collections.unmodifiableSet(set2);
    }

    public static c a(k1.b bVar, String str) {
        int i10;
        int i11;
        List<C0073c> list;
        int i12;
        l1.a aVar = (l1.a) bVar;
        Cursor j02 = aVar.j0(e0.d.a("PRAGMA table_info(`", str, "`)"));
        HashMap hashMap = new HashMap();
        try {
            if (j02.getColumnCount() > 0) {
                int columnIndex = j02.getColumnIndex("name");
                int columnIndex2 = j02.getColumnIndex("type");
                int columnIndex3 = j02.getColumnIndex("notnull");
                int columnIndex4 = j02.getColumnIndex("pk");
                int columnIndex5 = j02.getColumnIndex("dflt_value");
                while (j02.moveToNext()) {
                    String string = j02.getString(columnIndex);
                    int i13 = columnIndex;
                    hashMap.put(string, new a(string, j02.getString(columnIndex2), j02.getInt(columnIndex3) != 0, j02.getInt(columnIndex4), j02.getString(columnIndex5), 2));
                    columnIndex = i13;
                }
            }
            j02.close();
            HashSet hashSet = new HashSet();
            j02 = aVar.j0("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                int columnIndex6 = j02.getColumnIndex("id");
                int columnIndex7 = j02.getColumnIndex("seq");
                int columnIndex8 = j02.getColumnIndex("table");
                int columnIndex9 = j02.getColumnIndex("on_delete");
                int columnIndex10 = j02.getColumnIndex("on_update");
                List<C0073c> b10 = b(j02);
                int count = j02.getCount();
                int i14 = 0;
                while (i14 < count) {
                    j02.moveToPosition(i14);
                    if (j02.getInt(columnIndex7) != 0) {
                        i10 = columnIndex6;
                        i12 = columnIndex7;
                        list = b10;
                        i11 = count;
                    } else {
                        int i15 = j02.getInt(columnIndex6);
                        i10 = columnIndex6;
                        ArrayList arrayList = new ArrayList();
                        i12 = columnIndex7;
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = ((ArrayList) b10).iterator();
                        while (it.hasNext()) {
                            List<C0073c> list2 = b10;
                            C0073c c0073c = (C0073c) it.next();
                            int i16 = count;
                            if (c0073c.f5188s == i15) {
                                arrayList.add(c0073c.f5190u);
                                arrayList2.add(c0073c.f5191v);
                            }
                            b10 = list2;
                            count = i16;
                        }
                        list = b10;
                        i11 = count;
                        hashSet.add(new b(j02.getString(columnIndex8), j02.getString(columnIndex9), j02.getString(columnIndex10), arrayList, arrayList2));
                    }
                    i14++;
                    columnIndex6 = i10;
                    columnIndex7 = i12;
                    b10 = list;
                    count = i11;
                }
                j02.close();
                j02 = aVar.j0("PRAGMA index_list(`" + str + "`)");
                try {
                    int columnIndex11 = j02.getColumnIndex("name");
                    int columnIndex12 = j02.getColumnIndex("origin");
                    int columnIndex13 = j02.getColumnIndex("unique");
                    HashSet hashSet2 = null;
                    if (columnIndex11 != -1 && columnIndex12 != -1 && columnIndex13 != -1) {
                        HashSet hashSet3 = new HashSet();
                        while (j02.moveToNext()) {
                            if ("c".equals(j02.getString(columnIndex12))) {
                                String string2 = j02.getString(columnIndex11);
                                boolean z10 = true;
                                if (j02.getInt(columnIndex13) != 1) {
                                    z10 = false;
                                }
                                d c10 = c(aVar, string2, z10);
                                if (c10 != null) {
                                    hashSet3.add(c10);
                                }
                            }
                        }
                        j02.close();
                        hashSet2 = hashSet3;
                        return new c(str, hashMap, hashSet, hashSet2);
                    }
                    return new c(str, hashMap, hashSet, hashSet2);
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public static List<C0073c> b(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < count; i10++) {
            cursor.moveToPosition(i10);
            arrayList.add(new C0073c(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static d c(k1.b bVar, String str, boolean z10) {
        Cursor j02 = ((l1.a) bVar).j0(e0.d.a("PRAGMA index_xinfo(`", str, "`)"));
        try {
            int columnIndex = j02.getColumnIndex("seqno");
            int columnIndex2 = j02.getColumnIndex("cid");
            int columnIndex3 = j02.getColumnIndex("name");
            int columnIndex4 = j02.getColumnIndex("desc");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex4 != -1) {
                TreeMap treeMap = new TreeMap();
                TreeMap treeMap2 = new TreeMap();
                while (j02.moveToNext()) {
                    if (j02.getInt(columnIndex2) >= 0) {
                        int i10 = j02.getInt(columnIndex);
                        String string = j02.getString(columnIndex3);
                        String str2 = j02.getInt(columnIndex4) > 0 ? "DESC" : "ASC";
                        treeMap.put(Integer.valueOf(i10), string);
                        treeMap2.put(Integer.valueOf(i10), str2);
                    }
                }
                ArrayList arrayList = new ArrayList(treeMap.size());
                arrayList.addAll(treeMap.values());
                ArrayList arrayList2 = new ArrayList(treeMap2.size());
                arrayList2.addAll(treeMap2.values());
                return new d(str, z10, arrayList, arrayList2);
            }
            return null;
        } finally {
            j02.close();
        }
    }

    public final boolean equals(Object obj) {
        Set<d> set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        String str = this.f5172a;
        if (str == null ? cVar.f5172a != null : !str.equals(cVar.f5172a)) {
            return false;
        }
        Map<String, a> map = this.f5173b;
        if (map == null ? cVar.f5173b != null : !map.equals(cVar.f5173b)) {
            return false;
        }
        Set<b> set2 = this.f5174c;
        if (set2 == null ? cVar.f5174c != null : !set2.equals(cVar.f5174c)) {
            return false;
        }
        Set<d> set3 = this.f5175d;
        if (set3 != null && (set = cVar.f5175d) != null) {
            return set3.equals(set);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f5172a;
        int i10 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Map<String, a> map = this.f5173b;
        int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
        Set<b> set = this.f5174c;
        if (set != null) {
            i10 = set.hashCode();
        }
        return hashCode2 + i10;
    }

    public final String toString() {
        StringBuilder c10 = androidx.activity.result.a.c("TableInfo{name='");
        c10.append(this.f5172a);
        c10.append('\'');
        c10.append(", columns=");
        c10.append(this.f5173b);
        c10.append(", foreignKeys=");
        c10.append(this.f5174c);
        c10.append(", indices=");
        c10.append(this.f5175d);
        c10.append('}');
        return c10.toString();
    }
}
