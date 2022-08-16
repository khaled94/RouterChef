package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Log;
import androidx.appcompat.widget.v0;
import com.raouf.routerchef.R;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: b */
    public static final PorterDuff.Mode f930b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c */
    public static l f931c;

    /* renamed from: a */
    public v0 f932a;

    /* loaded from: classes.dex */
    public class a implements v0.f {

        /* renamed from: a */
        public final int[] f933a = {2131230810, 2131230808, 2131230734};

        /* renamed from: b */
        public final int[] f934b = {2131230758, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};

        /* renamed from: c */
        public final int[] f935c = {2131230807, 2131230809, 2131230751, R.drawable.abc_text_cursor_material, 2131230804, 2131230805, 2131230806};

        /* renamed from: d */
        public final int[] f936d = {2131230783, R.drawable.abc_cab_background_internal_bg, 2131230782};

        /* renamed from: e */
        public final int[] f937e = {R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};

        /* renamed from: f */
        public final int[] f938f = {R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};

        public final boolean a(int[] iArr, int i10) {
            for (int i11 : iArr) {
                if (i11 == i10) {
                    return true;
                }
            }
            return false;
        }

        public final ColorStateList b(Context context, int i10) {
            int c10 = a1.c(context, R.attr.colorControlHighlight);
            return new ColorStateList(new int[][]{a1.f780b, a1.f782d, a1.f781c, a1.f784f}, new int[]{a1.b(context, R.attr.colorButtonNormal), e0.a.b(c10, i10), e0.a.b(c10, i10), i10});
        }

        public final LayerDrawable c(v0 v0Var, Context context, int i10) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i10);
            Drawable f10 = v0Var.f(context, R.drawable.abc_star_black_48dp);
            Drawable f11 = v0Var.f(context, R.drawable.abc_star_half_black_48dp);
            if ((f10 instanceof BitmapDrawable) && f10.getIntrinsicWidth() == dimensionPixelSize && f10.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable2 = (BitmapDrawable) f10;
                bitmapDrawable = new BitmapDrawable(bitmapDrawable2.getBitmap());
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                f10.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                f10.draw(canvas);
                bitmapDrawable2 = new BitmapDrawable(createBitmap);
                bitmapDrawable = new BitmapDrawable(createBitmap);
            }
            bitmapDrawable.setTileModeX(Shader.TileMode.REPEAT);
            if ((f11 instanceof BitmapDrawable) && f11.getIntrinsicWidth() == dimensionPixelSize && f11.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) f11;
            } else {
                Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap2);
                f11.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                f11.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(createBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable2, bitmapDrawable3, bitmapDrawable});
            layerDrawable.setId(0, 16908288);
            layerDrawable.setId(1, 16908303);
            layerDrawable.setId(2, 16908301);
            return layerDrawable;
        }

        public final ColorStateList d(Context context, int i10) {
            if (i10 == R.drawable.abc_edit_text_material) {
                return f.a.a(context, R.color.abc_tint_edittext);
            }
            if (i10 == 2131230800) {
                return f.a.a(context, R.color.abc_tint_switch_track);
            }
            if (i10 == R.drawable.abc_switch_thumb_material) {
                int[][] iArr = new int[3];
                int[] iArr2 = new int[3];
                ColorStateList d5 = a1.d(context, R.attr.colorSwitchThumbNormal);
                if (d5 == null || !d5.isStateful()) {
                    iArr[0] = a1.f780b;
                    iArr2[0] = a1.b(context, R.attr.colorSwitchThumbNormal);
                    iArr[1] = a1.f783e;
                    iArr2[1] = a1.c(context, R.attr.colorControlActivated);
                    iArr[2] = a1.f784f;
                    iArr2[2] = a1.c(context, R.attr.colorSwitchThumbNormal);
                } else {
                    iArr[0] = a1.f780b;
                    iArr2[0] = d5.getColorForState(iArr[0], 0);
                    iArr[1] = a1.f783e;
                    iArr2[1] = a1.c(context, R.attr.colorControlActivated);
                    iArr[2] = a1.f784f;
                    iArr2[2] = d5.getDefaultColor();
                }
                return new ColorStateList(iArr, iArr2);
            } else if (i10 == R.drawable.abc_btn_default_mtrl_shape) {
                return b(context, a1.c(context, R.attr.colorButtonNormal));
            } else {
                if (i10 == R.drawable.abc_btn_borderless_material) {
                    return b(context, 0);
                }
                if (i10 == R.drawable.abc_btn_colored_material) {
                    return b(context, a1.c(context, R.attr.colorAccent));
                }
                if (i10 == 2131230795 || i10 == R.drawable.abc_spinner_textfield_background_material) {
                    return f.a.a(context, R.color.abc_tint_spinner);
                }
                if (a(this.f934b, i10)) {
                    return a1.d(context, R.attr.colorControlNormal);
                }
                if (a(this.f937e, i10)) {
                    return f.a.a(context, R.color.abc_tint_default);
                }
                if (a(this.f938f, i10)) {
                    return f.a.a(context, R.color.abc_tint_btn_checkable);
                }
                if (i10 != R.drawable.abc_seekbar_thumb_material) {
                    return null;
                }
                return f.a.a(context, R.color.abc_tint_seek_thumb);
            }
        }

        public final void e(Drawable drawable, int i10, PorterDuff.Mode mode) {
            if (m0.a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = l.f930b;
            }
            drawable.setColorFilter(l.c(i10, mode));
        }
    }

    public static synchronized l a() {
        l lVar;
        synchronized (l.class) {
            if (f931c == null) {
                e();
            }
            lVar = f931c;
        }
        return lVar;
    }

    public static synchronized PorterDuffColorFilter c(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter h10;
        synchronized (l.class) {
            h10 = v0.h(i10, mode);
        }
        return h10;
    }

    public static synchronized void e() {
        synchronized (l.class) {
            if (f931c == null) {
                l lVar = new l();
                f931c = lVar;
                lVar.f932a = v0.d();
                v0 v0Var = f931c.f932a;
                a aVar = new a();
                synchronized (v0Var) {
                    v0Var.f1030g = aVar;
                }
            }
        }
    }

    public static void f(Drawable drawable, d1 d1Var, int[] iArr) {
        PorterDuff.Mode mode = v0.f1021h;
        if (m0.a(drawable) && drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        boolean z10 = d1Var.f819d;
        if (z10 || d1Var.f818c) {
            PorterDuffColorFilter porterDuffColorFilter = null;
            ColorStateList colorStateList = z10 ? d1Var.f816a : null;
            PorterDuff.Mode mode2 = d1Var.f818c ? d1Var.f817b : v0.f1021h;
            if (colorStateList != null && mode2 != null) {
                porterDuffColorFilter = v0.h(colorStateList.getColorForState(iArr, 0), mode2);
            }
            drawable.setColorFilter(porterDuffColorFilter);
        } else {
            drawable.clearColorFilter();
        }
        if (Build.VERSION.SDK_INT > 23) {
            return;
        }
        drawable.invalidateSelf();
    }

    public final synchronized Drawable b(Context context, int i10) {
        return this.f932a.f(context, i10);
    }

    public final synchronized ColorStateList d(Context context, int i10) {
        return this.f932a.i(context, i10);
    }
}
