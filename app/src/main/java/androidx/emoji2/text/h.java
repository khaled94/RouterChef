package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.KeyEvent;
import androidx.emoji2.text.d;
import androidx.emoji2.text.n;
import e0.c;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a */
    public final d.i f1318a;

    /* renamed from: b */
    public final n f1319b;

    /* renamed from: c */
    public d.AbstractC0014d f1320c;

    /* loaded from: classes.dex */
    public static class a implements d.AbstractC0014d {

        /* renamed from: b */
        public static final ThreadLocal<StringBuilder> f1321b = new ThreadLocal<>();

        /* renamed from: a */
        public final TextPaint f1322a;

        public a() {
            TextPaint textPaint = new TextPaint();
            this.f1322a = textPaint;
            textPaint.setTextSize(10.0f);
        }

        public final boolean a(CharSequence charSequence, int i10, int i11) {
            ThreadLocal<StringBuilder> threadLocal = f1321b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = threadLocal.get();
            sb.setLength(0);
            while (i10 < i11) {
                sb.append(charSequence.charAt(i10));
                i10++;
            }
            TextPaint textPaint = this.f1322a;
            String sb2 = sb.toString();
            int i12 = c.f4315a;
            return c.a.a(textPaint, sb2);
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public int f1323a = 1;

        /* renamed from: b */
        public final n.a f1324b;

        /* renamed from: c */
        public n.a f1325c;

        /* renamed from: d */
        public n.a f1326d;

        /* renamed from: e */
        public int f1327e;

        /* renamed from: f */
        public int f1328f;

        public b(n.a aVar) {
            this.f1324b = aVar;
            this.f1325c = aVar;
        }

        public final int a(int i10) {
            SparseArray<n.a> sparseArray = this.f1325c.f1350a;
            n.a aVar = sparseArray == null ? null : sparseArray.get(i10);
            int i11 = 3;
            if (this.f1323a != 2) {
                if (aVar != null) {
                    this.f1323a = 2;
                    this.f1325c = aVar;
                    this.f1328f = 1;
                    i11 = 2;
                }
                b();
                i11 = 1;
            } else {
                if (aVar != null) {
                    this.f1325c = aVar;
                    this.f1328f++;
                } else {
                    boolean z10 = false;
                    if (!(i10 == 65038)) {
                        if (i10 == 65039) {
                            z10 = true;
                        }
                        if (!z10) {
                            n.a aVar2 = this.f1325c;
                            if (aVar2.f1351b != null) {
                                if (this.f1328f == 1) {
                                    if (c()) {
                                        aVar2 = this.f1325c;
                                    }
                                }
                                this.f1326d = aVar2;
                                b();
                            }
                        }
                    }
                    b();
                    i11 = 1;
                }
                i11 = 2;
            }
            this.f1327e = i10;
            return i11;
        }

        public final void b() {
            this.f1323a = 1;
            this.f1325c = this.f1324b;
            this.f1328f = 0;
        }

        public final boolean c() {
            u0.a e10 = this.f1325c.f1351b.e();
            int a10 = e10.a(6);
            if ((a10 == 0 || e10.f18990b.get(a10 + e10.f18989a) == 0) ? false : true) {
                return true;
            }
            return this.f1327e == 65039;
        }
    }

    public h(n nVar, d.i iVar, d.AbstractC0014d abstractC0014d) {
        this.f1318a = iVar;
        this.f1319b = nVar;
        this.f1320c = abstractC0014d;
    }

    public static boolean a(Editable editable, KeyEvent keyEvent, boolean z10) {
        i[] iVarArr;
        if (!KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!(selectionStart == -1 || selectionEnd == -1 || selectionStart != selectionEnd) && (iVarArr = (i[]) editable.getSpans(selectionStart, selectionEnd, i.class)) != null && iVarArr.length > 0) {
            for (i iVar : iVarArr) {
                int spanStart = editable.getSpanStart(iVar);
                int spanEnd = editable.getSpanEnd(iVar);
                if ((z10 && spanStart == selectionStart) || ((!z10 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean b(CharSequence charSequence, int i10, int i11, g gVar) {
        if (gVar.f1317c == 0) {
            d.AbstractC0014d abstractC0014d = this.f1320c;
            u0.a e10 = gVar.e();
            int a10 = e10.a(8);
            if (a10 != 0) {
                e10.f18990b.getShort(a10 + e10.f18989a);
            }
            gVar.f1317c = ((a) abstractC0014d).a(charSequence, i10, i11) ? 2 : 1;
        }
        return gVar.f1317c == 2;
    }
}
