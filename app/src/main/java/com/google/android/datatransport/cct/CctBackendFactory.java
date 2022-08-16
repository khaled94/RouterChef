package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import r2.c;
import u2.d;
import u2.i;
import u2.n;

@Keep
/* loaded from: classes.dex */
public class CctBackendFactory implements d {
    @Override // u2.d
    public n create(i iVar) {
        return new c(iVar.a(), iVar.d(), iVar.c());
    }
}
