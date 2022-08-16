package r0;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import androidx.appcompat.widget.e0;
import r0.b;

/* loaded from: classes.dex */
public abstract class a extends BaseAdapter implements Filterable, b.a {

    /* renamed from: v */
    public Context f17209v;

    /* renamed from: z */
    public r0.b f17212z;

    /* renamed from: t */
    public boolean f17207t = true;

    /* renamed from: u */
    public Cursor f17208u = null;

    /* renamed from: s */
    public boolean f17206s = false;

    /* renamed from: w */
    public int f17210w = -1;

    /* renamed from: x */
    public C0108a f17211x = new C0108a();
    public b y = new b();

    /* renamed from: r0.a$a */
    /* loaded from: classes.dex */
    public class C0108a extends ContentObserver {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0108a() {
            super(new Handler());
            a.this = r1;
        }

        @Override // android.database.ContentObserver
        public final boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public final void onChange(boolean z10) {
            Cursor cursor;
            a aVar = a.this;
            if (!aVar.f17207t || (cursor = aVar.f17208u) == null || cursor.isClosed()) {
                return;
            }
            aVar.f17206s = aVar.f17208u.requery();
        }
    }

    /* loaded from: classes.dex */
    public class b extends DataSetObserver {
        public b() {
            a.this = r1;
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            a aVar = a.this;
            aVar.f17206s = true;
            aVar.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            a aVar = a.this;
            aVar.f17206s = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public a(Context context) {
        this.f17209v = context;
    }

    public abstract void b(View view, Cursor cursor);

    public void c(Cursor cursor) {
        Cursor cursor2 = this.f17208u;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                C0108a c0108a = this.f17211x;
                if (c0108a != null) {
                    cursor2.unregisterContentObserver(c0108a);
                }
                b bVar = this.y;
                if (bVar != null) {
                    cursor2.unregisterDataSetObserver(bVar);
                }
            }
            this.f17208u = cursor;
            if (cursor != null) {
                C0108a c0108a2 = this.f17211x;
                if (c0108a2 != null) {
                    cursor.registerContentObserver(c0108a2);
                }
                b bVar2 = this.y;
                if (bVar2 != null) {
                    cursor.registerDataSetObserver(bVar2);
                }
                this.f17210w = cursor.getColumnIndexOrThrow("_id");
                this.f17206s = true;
                notifyDataSetChanged();
            } else {
                this.f17210w = -1;
                this.f17206s = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract CharSequence e(Cursor cursor);

    public abstract View g(ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (!this.f17206s || (cursor = this.f17208u) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        if (this.f17206s) {
            this.f17208u.moveToPosition(i10);
            if (view == null) {
                c cVar = (c) this;
                view = cVar.C.inflate(cVar.B, viewGroup, false);
            }
            b(view, this.f17208u);
            return view;
        }
        return null;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.f17212z == null) {
            this.f17212z = new r0.b(this);
        }
        return this.f17212z;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i10) {
        Cursor cursor;
        if (!this.f17206s || (cursor = this.f17208u) == null) {
            return null;
        }
        cursor.moveToPosition(i10);
        return this.f17208u;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        Cursor cursor;
        if (!this.f17206s || (cursor = this.f17208u) == null || !cursor.moveToPosition(i10)) {
            return 0L;
        }
        return this.f17208u.getLong(this.f17210w);
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (this.f17206s) {
            if (!this.f17208u.moveToPosition(i10)) {
                throw new IllegalStateException(e0.a("couldn't move cursor to position ", i10));
            }
            if (view == null) {
                view = g(viewGroup);
            }
            b(view, this.f17208u);
            return view;
        }
        throw new IllegalStateException("this should only be called when the cursor is valid");
    }
}
