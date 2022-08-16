package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import l0.g;

/* loaded from: classes.dex */
public final class o extends SpannableStringBuilder {

    /* renamed from: s */
    public final Class<?> f1352s;

    /* renamed from: t */
    public final List<a> f1353t = new ArrayList();

    /* loaded from: classes.dex */
    public static class a implements TextWatcher, SpanWatcher {

        /* renamed from: s */
        public final Object f1354s;

        /* renamed from: t */
        public final AtomicInteger f1355t = new AtomicInteger(0);

        public a(Object obj) {
            this.f1354s = obj;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            ((TextWatcher) this.f1354s).afterTextChanged(editable);
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            ((TextWatcher) this.f1354s).beforeTextChanged(charSequence, i10, i11, i12);
        }

        @Override // android.text.SpanWatcher
        public final void onSpanAdded(Spannable spannable, Object obj, int i10, int i11) {
            if (this.f1355t.get() <= 0 || !(obj instanceof i)) {
                ((SpanWatcher) this.f1354s).onSpanAdded(spannable, obj, i10, i11);
            }
        }

        @Override // android.text.SpanWatcher
        public final void onSpanChanged(Spannable spannable, Object obj, int i10, int i11, int i12, int i13) {
            if (this.f1355t.get() <= 0 || !(obj instanceof i)) {
                ((SpanWatcher) this.f1354s).onSpanChanged(spannable, obj, i10, i11, i12, i13);
            }
        }

        @Override // android.text.SpanWatcher
        public final void onSpanRemoved(Spannable spannable, Object obj, int i10, int i11) {
            if (this.f1355t.get() <= 0 || !(obj instanceof i)) {
                ((SpanWatcher) this.f1354s).onSpanRemoved(spannable, obj, i10, i11);
            }
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            ((TextWatcher) this.f1354s).onTextChanged(charSequence, i10, i11, i12);
        }
    }

    public o(Class<?> cls, CharSequence charSequence) {
        super(charSequence);
        g.e(cls, "watcherClass cannot be null");
        this.f1352s = cls;
    }

    public o(Class<?> cls, CharSequence charSequence, int i10, int i11) {
        super(charSequence, i10, i11);
        g.e(cls, "watcherClass cannot be null");
        this.f1352s = cls;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List<androidx.emoji2.text.o$a>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List<androidx.emoji2.text.o$a>, java.util.ArrayList] */
    public final void a() {
        for (int i10 = 0; i10 < this.f1353t.size(); i10++) {
            ((a) this.f1353t.get(i10)).f1355t.incrementAndGet();
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(char c10) {
        super.append(c10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    /* renamed from: append */
    public final SpannableStringBuilder mo2append(char c10) {
        super.append(c10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    /* renamed from: append */
    public final SpannableStringBuilder mo3append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    /* renamed from: append */
    public final SpannableStringBuilder mo4append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i10, int i11) {
        super.append(charSequence, i10, i11);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    @SuppressLint({"UnknownNullness"})
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i10) {
        super.append(charSequence, obj, i10);
        return this;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List<androidx.emoji2.text.o$a>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List<androidx.emoji2.text.o$a>, java.util.ArrayList] */
    public final void b() {
        f();
        for (int i10 = 0; i10 < this.f1353t.size(); i10++) {
            ((a) this.f1353t.get(i10)).onTextChanged(this, 0, length(), length());
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List<androidx.emoji2.text.o$a>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List<androidx.emoji2.text.o$a>, java.util.ArrayList] */
    public final a c(Object obj) {
        for (int i10 = 0; i10 < this.f1353t.size(); i10++) {
            a aVar = (a) this.f1353t.get(i10);
            if (aVar.f1354s == obj) {
                return aVar;
            }
        }
        return null;
    }

    public final boolean d(Class<?> cls) {
        return this.f1352s == cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final Editable delete(int i10, int i11) {
        super.delete(i10, i11);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    /* renamed from: delete */
    public final SpannableStringBuilder mo8delete(int i10, int i11) {
        super.delete(i10, i11);
        return this;
    }

    public final boolean e(Object obj) {
        return obj != null && d(obj.getClass());
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List<androidx.emoji2.text.o$a>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List<androidx.emoji2.text.o$a>, java.util.ArrayList] */
    public final void f() {
        for (int i10 = 0; i10 < this.f1353t.size(); i10++) {
            ((a) this.f1353t.get(i10)).f1355t.decrementAndGet();
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        a c10;
        if (e(obj) && (c10 = c(obj)) != null) {
            obj = c10;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        a c10;
        if (e(obj) && (c10 = c(obj)) != null) {
            obj = c10;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        a c10;
        if (e(obj) && (c10 = c(obj)) != null) {
            obj = c10;
        }
        return super.getSpanStart(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    @SuppressLint({"UnknownNullness"})
    public final <T> T[] getSpans(int i10, int i11, Class<T> cls) {
        if (d(cls)) {
            a[] aVarArr = (a[]) super.getSpans(i10, i11, a.class);
            T[] tArr = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, aVarArr.length));
            for (int i12 = 0; i12 < aVarArr.length; i12++) {
                tArr[i12] = aVarArr[i12].f1354s;
            }
            return tArr;
        }
        return (T[]) super.getSpans(i10, i11, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final Editable insert(int i10, CharSequence charSequence) {
        super.insert(i10, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    /* renamed from: insert */
    public final SpannableStringBuilder mo9insert(int i10, CharSequence charSequence) {
        super.insert(i10, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    /* renamed from: insert */
    public final SpannableStringBuilder mo10insert(int i10, CharSequence charSequence, int i11, int i12) {
        super.insert(i10, charSequence, i11, i12);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int nextSpanTransition(int i10, int i11, Class cls) {
        if (cls == null || d(cls)) {
            cls = a.class;
        }
        return super.nextSpanTransition(i10, i11, cls);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List<androidx.emoji2.text.o$a>, java.util.ArrayList] */
    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object obj) {
        a aVar;
        if (e(obj)) {
            aVar = c(obj);
            if (aVar != null) {
                obj = aVar;
            }
        } else {
            aVar = null;
        }
        super.removeSpan(obj);
        if (aVar != null) {
            this.f1353t.remove(aVar);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final SpannableStringBuilder replace(int i10, int i11, CharSequence charSequence) {
        a();
        super.replace(i10, i11, charSequence);
        f();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final SpannableStringBuilder replace(int i10, int i11, CharSequence charSequence, int i12, int i13) {
        a();
        super.replace(i10, i11, charSequence, i12, i13);
        f();
        return this;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List<androidx.emoji2.text.o$a>, java.util.ArrayList] */
    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i10, int i11, int i12) {
        if (e(obj)) {
            a aVar = new a(obj);
            this.f1353t.add(aVar);
            obj = aVar;
        }
        super.setSpan(obj, i10, i11, i12);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    @SuppressLint({"UnknownNullness"})
    public final CharSequence subSequence(int i10, int i11) {
        return new o(this.f1352s, this, i10, i11);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final Editable insert(int i10, CharSequence charSequence, int i11, int i12) {
        super.insert(i10, charSequence, i11, i12);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i10, int i11) {
        super.append(charSequence, i10, i11);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    /* renamed from: append */
    public final Appendable mo5append(char c10) {
        super.append(c10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    /* renamed from: append */
    public final Appendable mo6append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    /* renamed from: append */
    public final Appendable mo7append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i10, int i11) {
        super.append(charSequence, i10, i11);
        return this;
    }
}
