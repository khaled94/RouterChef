package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes.dex */
public final class d implements DynamiteModule.b {
    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0041b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0041b c0041b = new DynamiteModule.b.C0041b();
        c0041b.f2957a = aVar.a(context, str);
        int b10 = aVar.b(context, str, true);
        c0041b.f2958b = b10;
        int i10 = c0041b.f2957a;
        if (i10 == 0) {
            if (b10 == 0) {
                c0041b.f2959c = 0;
                return c0041b;
            }
            i10 = 0;
        }
        if (b10 >= i10) {
            c0041b.f2959c = 1;
        } else {
            c0041b.f2959c = -1;
        }
        return c0041b;
    }
}
