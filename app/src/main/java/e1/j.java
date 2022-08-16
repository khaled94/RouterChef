package e1;

import android.util.Log;
import android.view.View;
import com.raouf.routerchef.R;
import java.lang.reflect.Field;
import m4.dd;
import m4.e90;
import m4.f90;
import m4.g90;
import s4.aa;
import y4.d;
import y4.d1;
import y4.e1;
import y4.f1;

/* loaded from: classes.dex */
public class j implements f90, d, d1 {
    public static Field G;
    public static boolean H;

    /* renamed from: s */
    public static final int[] f4371s = {16843534, R.attr.selectableItemBackground};

    /* renamed from: t */
    public static final int[] f4372t = {16843247, 16843248, 16843249, R.attr.disableDependentsState, R.attr.summaryOff, R.attr.summaryOn};

    /* renamed from: u */
    public static final int[] f4373u = {16843250, 16843251, 16843252, 16843253, 16843254, 16843255, R.attr.dialogIcon, R.attr.dialogLayout, R.attr.dialogMessage, R.attr.dialogTitle, R.attr.negativeButtonText, R.attr.positiveButtonText};

    /* renamed from: v */
    public static final int[] f4374v = {R.attr.useSimpleSummaryProvider};

    /* renamed from: w */
    public static final int[] f4375w = {16842930, 16843256, R.attr.entries, R.attr.entryValues, R.attr.useSimpleSummaryProvider};

    /* renamed from: x */
    public static final int[] f4376x = {16842930, 16843256, R.attr.entries, R.attr.entryValues};
    public static final int[] y = {16842754, 16842765, 16842766, 16842994, 16843233, 16843238, 16843240, 16843241, 16843242, 16843243, 16843244, 16843245, 16843246, 16843491, 16844124, 16844129, R.attr.allowDividerAbove, R.attr.allowDividerBelow, R.attr.defaultValue, R.attr.dependency, R.attr.enableCopying, R.attr.enabled, R.attr.fragment, R.attr.icon, R.attr.iconSpaceReserved, R.attr.isPreferenceVisible, R.attr.key, R.attr.layout, R.attr.order, R.attr.persistent, R.attr.selectable, R.attr.shouldDisableView, R.attr.singleLineTitle, R.attr.summary, R.attr.title, R.attr.widgetLayout};

    /* renamed from: z */
    public static final int[] f4377z = {16842994, 16843049, 16843050, R.attr.allowDividerAfterLastItem};
    public static final int[] A = {16843239, R.attr.initialExpandedChildrenCount, R.attr.orderingFromXml};
    public static final int[] B = {16843039, 16843040, R.attr.maxHeight, R.attr.maxWidth};
    public static final int[] C = {16842994, 16843062, R.attr.adjustable, R.attr.min, R.attr.seekBarIncrement, R.attr.showSeekBarValue, R.attr.updatesContinuously};
    public static final int[] D = {16843247, 16843248, 16843249, 16843627, 16843628, R.attr.disableDependentsState, R.attr.summaryOff, R.attr.summaryOn, R.attr.switchTextOff, R.attr.switchTextOn};
    public static final int[] E = {16843247, 16843248, 16843249, 16843627, 16843628, R.attr.disableDependentsState, R.attr.summaryOff, R.attr.summaryOn, R.attr.switchTextOff, R.attr.switchTextOn};
    public static final int[] F = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};
    public static final /* synthetic */ j I = new j();
    public static final /* synthetic */ j J = new j();

    public /* synthetic */ j() {
    }

    public /* synthetic */ j(g90 g90Var) {
    }

    public static void c(int i10, dd ddVar) {
        ddVar.e(7);
        byte[] bArr = (byte[]) ddVar.f7311d;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i10 >> 16) & 255);
        bArr[5] = (byte) ((i10 >> 8) & 255);
        bArr[6] = (byte) (i10 & 255);
    }

    public void a(View view, int i10) {
        if (!H) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                G = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            H = true;
        }
        Field field = G;
        if (field != null) {
            try {
                G.setInt(view, i10 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    @Override // m4.f90
    public void b(String str) {
        new e90(str).start();
    }

    @Override // y4.d
    public String e(String str, String str2) {
        return null;
    }

    @Override // y4.d1
    /* renamed from: zza */
    public Object mo14zza() {
        e1<Long> e1Var = f1.f20399b;
        return Integer.valueOf((int) aa.f17726t.zza().F());
    }
}
