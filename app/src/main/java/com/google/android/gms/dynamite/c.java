package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes.dex */
public final class c implements DynamiteModule.b {
    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0041b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0041b c0041b = new DynamiteModule.b.C0041b();
        int a10 = aVar.a(context, str);
        c0041b.f2957a = a10;
        int i10 = 0;
        int b10 = a10 != 0 ? aVar.b(context, str, false) : aVar.b(context, str, true);
        c0041b.f2958b = b10;
        int i11 = c0041b.f2957a;
        if (i11 != 0) {
            i10 = i11;
        } else if (b10 == 0) {
            c0041b.f2959c = 0;
            return c0041b;
        }
        if (i10 >= b10) {
            c0041b.f2959c = -1;
        } else {
            c0041b.f2959c = 1;
        }
        return c0041b;
    }
}
