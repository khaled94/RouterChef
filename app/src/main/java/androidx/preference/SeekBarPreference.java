package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.AbsSavedState;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.preference.Preference;
import com.raouf.routerchef.R;
import e1.g;
import e1.j;

/* loaded from: classes.dex */
public class SeekBarPreference extends Preference {

    /* renamed from: f0 */
    public int f1785f0;

    /* renamed from: g0 */
    public int f1786g0;

    /* renamed from: h0 */
    public int f1787h0;

    /* renamed from: i0 */
    public int f1788i0;

    /* renamed from: j0 */
    public boolean f1789j0;

    /* renamed from: k0 */
    public SeekBar f1790k0;

    /* renamed from: l0 */
    public TextView f1791l0;

    /* renamed from: m0 */
    public boolean f1792m0;

    /* renamed from: n0 */
    public boolean f1793n0;

    /* renamed from: o0 */
    public boolean f1794o0;

    /* renamed from: p0 */
    public final a f1795p0 = new a();

    /* renamed from: q0 */
    public final b f1796q0 = new b();

    /* loaded from: classes.dex */
    public class a implements SeekBar.OnSeekBarChangeListener {
        public a() {
            SeekBarPreference.this = r1;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
            if (z10) {
                SeekBarPreference seekBarPreference = SeekBarPreference.this;
                if (seekBarPreference.f1794o0 || !seekBarPreference.f1789j0) {
                    seekBarPreference.H(seekBar);
                    return;
                }
            }
            SeekBarPreference seekBarPreference2 = SeekBarPreference.this;
            seekBarPreference2.I(i10 + seekBarPreference2.f1786g0);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStartTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.f1789j0 = true;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStopTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.f1789j0 = false;
            int progress = seekBar.getProgress();
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if (progress + seekBarPreference.f1786g0 != seekBarPreference.f1785f0) {
                seekBarPreference.H(seekBar);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements View.OnKeyListener {
        public b() {
            SeekBarPreference.this = r1;
        }

        @Override // android.view.View.OnKeyListener
        public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
            if (keyEvent.getAction() != 0) {
                return false;
            }
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if ((!seekBarPreference.f1792m0 && (i10 == 21 || i10 == 22)) || i10 == 23 || i10 == 66) {
                return false;
            }
            SeekBar seekBar = seekBarPreference.f1790k0;
            if (seekBar != null) {
                return seekBar.onKeyDown(i10, keyEvent);
            }
            Log.e("SeekBarPreference", "SeekBar view is null and hence cannot be adjusted.");
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static class c extends Preference.b {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: s */
        public int f1799s;

        /* renamed from: t */
        public int f1800t;

        /* renamed from: u */
        public int f1801u;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<c> {
            @Override // android.os.Parcelable.Creator
            public final c createFromParcel(Parcel parcel) {
                return new c(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final c[] newArray(int i10) {
                return new c[i10];
            }
        }

        public c(Parcel parcel) {
            super(parcel);
            this.f1799s = parcel.readInt();
            this.f1800t = parcel.readInt();
            this.f1801u = parcel.readInt();
        }

        public c(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f1799s);
            parcel.writeInt(this.f1800t);
            parcel.writeInt(this.f1801u);
        }
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarPreferenceStyle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.C, R.attr.seekBarPreferenceStyle, 0);
        this.f1786g0 = obtainStyledAttributes.getInt(3, 0);
        int i10 = obtainStyledAttributes.getInt(1, 100);
        int i11 = this.f1786g0;
        i10 = i10 < i11 ? i11 : i10;
        if (i10 != this.f1787h0) {
            this.f1787h0 = i10;
            n();
        }
        int i12 = obtainStyledAttributes.getInt(4, 0);
        if (i12 != this.f1788i0) {
            this.f1788i0 = Math.min(this.f1787h0 - this.f1786g0, Math.abs(i12));
            n();
        }
        this.f1792m0 = obtainStyledAttributes.getBoolean(2, true);
        this.f1793n0 = obtainStyledAttributes.getBoolean(5, false);
        this.f1794o0 = obtainStyledAttributes.getBoolean(6, false);
        obtainStyledAttributes.recycle();
    }

    public final void G(int i10, boolean z10) {
        int i11 = this.f1786g0;
        if (i10 < i11) {
            i10 = i11;
        }
        int i12 = this.f1787h0;
        if (i10 > i12) {
            i10 = i12;
        }
        if (i10 != this.f1785f0) {
            this.f1785f0 = i10;
            I(i10);
            if (E() && i10 != h(~i10)) {
                SharedPreferences.Editor c10 = this.f1769t.c();
                c10.putInt(this.D, i10);
                F(c10);
            }
            if (!z10) {
                return;
            }
            n();
        }
    }

    public final void H(SeekBar seekBar) {
        int progress = seekBar.getProgress() + this.f1786g0;
        if (progress != this.f1785f0) {
            b(Integer.valueOf(progress));
            G(progress, false);
        }
    }

    public final void I(int i10) {
        TextView textView = this.f1791l0;
        if (textView != null) {
            textView.setText(String.valueOf(i10));
        }
    }

    @Override // androidx.preference.Preference
    public final void s(g gVar) {
        super.s(gVar);
        gVar.f1924a.setOnKeyListener(this.f1796q0);
        this.f1790k0 = (SeekBar) gVar.x(R.id.seekbar);
        TextView textView = (TextView) gVar.x(R.id.seekbar_value);
        this.f1791l0 = textView;
        if (this.f1793n0) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
            this.f1791l0 = null;
        }
        SeekBar seekBar = this.f1790k0;
        if (seekBar == null) {
            Log.e("SeekBarPreference", "SeekBar view is null in onBindViewHolder.");
            return;
        }
        seekBar.setOnSeekBarChangeListener(this.f1795p0);
        this.f1790k0.setMax(this.f1787h0 - this.f1786g0);
        int i10 = this.f1788i0;
        if (i10 != 0) {
            this.f1790k0.setKeyProgressIncrement(i10);
        } else {
            this.f1788i0 = this.f1790k0.getKeyProgressIncrement();
        }
        this.f1790k0.setProgress(this.f1785f0 - this.f1786g0);
        I(this.f1785f0);
        this.f1790k0.setEnabled(m());
    }

    @Override // androidx.preference.Preference
    public final Object v(TypedArray typedArray, int i10) {
        return Integer.valueOf(typedArray.getInt(i10, 0));
    }

    @Override // androidx.preference.Preference
    public final void w(Parcelable parcelable) {
        if (!parcelable.getClass().equals(c.class)) {
            super.w(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.w(cVar.getSuperState());
        this.f1785f0 = cVar.f1799s;
        this.f1786g0 = cVar.f1800t;
        this.f1787h0 = cVar.f1801u;
        n();
    }

    @Override // androidx.preference.Preference
    public final Parcelable x() {
        this.f1764b0 = true;
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.J) {
            return absSavedState;
        }
        c cVar = new c(absSavedState);
        cVar.f1799s = this.f1785f0;
        cVar.f1800t = this.f1786g0;
        cVar.f1801u = this.f1787h0;
        return cVar;
    }

    @Override // androidx.preference.Preference
    public final void y(Object obj) {
        if (obj == null) {
            obj = 0;
        }
        G(h(((Integer) obj).intValue()), true);
    }
}
