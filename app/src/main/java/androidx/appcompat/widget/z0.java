package androidx.appcompat.widget;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.raouf.routerchef.R;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;
import r0.c;

/* loaded from: classes.dex */
public final class z0 extends c implements View.OnClickListener {
    public static final /* synthetic */ int Q = 0;
    public final SearchView D;
    public final SearchableInfo E;
    public final Context F;
    public final WeakHashMap<String, Drawable.ConstantState> G;
    public final int H;
    public ColorStateList J;
    public int I = 1;
    public int K = -1;
    public int L = -1;
    public int M = -1;
    public int N = -1;
    public int O = -1;
    public int P = -1;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final TextView f1047a;

        /* renamed from: b */
        public final TextView f1048b;

        /* renamed from: c */
        public final ImageView f1049c;

        /* renamed from: d */
        public final ImageView f1050d;

        /* renamed from: e */
        public final ImageView f1051e;

        public a(View view) {
            this.f1047a = (TextView) view.findViewById(16908308);
            this.f1048b = (TextView) view.findViewById(16908309);
            this.f1049c = (ImageView) view.findViewById(16908295);
            this.f1050d = (ImageView) view.findViewById(16908296);
            this.f1051e = (ImageView) view.findViewById(R.id.edit_query);
        }
    }

    public z0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout());
        this.D = searchView;
        this.E = searchableInfo;
        this.H = searchView.getSuggestionCommitIconResId();
        this.F = context;
        this.G = weakHashMap;
    }

    public static String s(Cursor cursor, int i10) {
        if (i10 == -1) {
            return null;
        }
        try {
            return cursor.getString(i10);
        } catch (Exception e10) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e10);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014b  */
    @Override // r0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(android.view.View r19, android.database.Cursor r20) {
        /*
            Method dump skipped, instructions count: 421
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.z0.b(android.view.View, android.database.Cursor):void");
    }

    @Override // r0.a
    public final void c(Cursor cursor) {
        try {
            super.c(cursor);
            if (cursor == null) {
                return;
            }
            this.K = cursor.getColumnIndex("suggest_text_1");
            this.L = cursor.getColumnIndex("suggest_text_2");
            this.M = cursor.getColumnIndex("suggest_text_2_url");
            this.N = cursor.getColumnIndex("suggest_icon_1");
            this.O = cursor.getColumnIndex("suggest_icon_2");
            this.P = cursor.getColumnIndex("suggest_flags");
        } catch (Exception e10) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e10);
        }
    }

    @Override // r0.a
    public final CharSequence e(Cursor cursor) {
        String s10;
        String s11;
        if (cursor == null) {
            return null;
        }
        String s12 = s(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (s12 != null) {
            return s12;
        }
        if (this.E.shouldRewriteQueryFromData() && (s11 = s(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return s11;
        }
        if (this.E.shouldRewriteQueryFromText() && (s10 = s(cursor, cursor.getColumnIndex("suggest_text_1"))) != null) {
            return s10;
        }
        return null;
    }

    @Override // r0.a
    public final View g(ViewGroup viewGroup) {
        View inflate = this.C.inflate(this.A, viewGroup, false);
        inflate.setTag(new a(inflate));
        ((ImageView) inflate.findViewById(R.id.edit_query)).setImageResource(this.H);
        return inflate;
    }

    @Override // r0.a, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i10, view, viewGroup);
        } catch (RuntimeException e10) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e10);
            View inflate = this.C.inflate(this.B, viewGroup, false);
            if (inflate != null) {
                ((a) inflate.getTag()).f1047a.setText(e10.toString());
            }
            return inflate;
        }
    }

    @Override // r0.a, android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i10, view, viewGroup);
        } catch (RuntimeException e10) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e10);
            View g10 = g(viewGroup);
            ((a) g10.getTag()).f1047a.setText(e10.toString());
            return g10;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Cursor cursor = this.f17208u;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        Cursor cursor = this.f17208u;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.D.r((CharSequence) tag);
        }
    }

    public final Drawable p(Uri uri) {
        int parseInt;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.F.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    parseInt = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else if (size != 2) {
                throw new FileNotFoundException("More than two path segments: " + uri);
            } else {
                parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (parseInt != 0) {
                return resourcesForApplication.getDrawable(parseInt);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0132  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.drawable.Drawable q(java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.z0.q(java.lang.String):android.graphics.drawable.Drawable");
    }

    public final Cursor r(SearchableInfo searchableInfo, String str) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        fragment.appendQueryParameter("limit", String.valueOf(50));
        return this.F.getContentResolver().query(fragment.build(), null, suggestSelection, strArr, null);
    }

    public final void t(ImageView imageView, Drawable drawable, int i10) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i10);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }
}
