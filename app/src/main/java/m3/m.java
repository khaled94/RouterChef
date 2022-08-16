package m3;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import h2.u;
import java.util.Map;
import java.util.Objects;
import l3.j;
import l3.s;
import n3.s1;
import n3.x1;
import n3.z;

/* loaded from: classes.dex */
public final class m extends z {

    /* renamed from: b */
    public final /* synthetic */ n f5970b;

    public /* synthetic */ m(n nVar) {
        this.f5970b = nVar;
    }

    @Override // n3.z
    public final void a() {
        final BitmapDrawable bitmapDrawable;
        s sVar = s.B;
        u uVar = sVar.f5806u;
        Bitmap bitmap = (Bitmap) ((Map) uVar.f5042t).get(Integer.valueOf(this.f5970b.f5972t.G.f5767x));
        if (bitmap != null) {
            x1 x1Var = sVar.f5791e;
            n nVar = this.f5970b;
            Activity activity = nVar.f5971s;
            j jVar = nVar.f5972t.G;
            boolean z10 = jVar.f5765v;
            float f10 = jVar.f5766w;
            Objects.requireNonNull(x1Var);
            if (!z10 || f10 <= 0.0f || f10 > 25.0f) {
                bitmapDrawable = new BitmapDrawable(activity.getResources(), bitmap);
            } else {
                try {
                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, bitmap.getWidth(), bitmap.getHeight(), false);
                    Bitmap createBitmap = Bitmap.createBitmap(createScaledBitmap);
                    RenderScript create = RenderScript.create(activity);
                    ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
                    Allocation createFromBitmap = Allocation.createFromBitmap(create, createScaledBitmap);
                    Allocation createFromBitmap2 = Allocation.createFromBitmap(create, createBitmap);
                    create2.setRadius(f10);
                    create2.setInput(createFromBitmap);
                    create2.forEach(createFromBitmap2);
                    createFromBitmap2.copyTo(createBitmap);
                    bitmapDrawable = new BitmapDrawable(activity.getResources(), createBitmap);
                } catch (RuntimeException unused) {
                    bitmapDrawable = new BitmapDrawable(activity.getResources(), bitmap);
                }
            }
            s1.f16555i.post(new Runnable() { // from class: m3.l
                @Override // java.lang.Runnable
                public final void run() {
                    m mVar = m.this;
                    mVar.f5970b.f5971s.getWindow().setBackgroundDrawable(bitmapDrawable);
                }
            });
        }
    }
}
