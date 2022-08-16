package com.google.android.material.timepicker;

import com.google.android.material.button.MaterialButtonToggleGroup;
import java.util.Objects;

/* loaded from: classes.dex */
public final class d implements MaterialButtonToggleGroup.d {

    /* renamed from: a */
    public final /* synthetic */ TimePickerView f3431a;

    public d(TimePickerView timePickerView) {
        this.f3431a = timePickerView;
    }

    @Override // com.google.android.material.button.MaterialButtonToggleGroup.d
    public final void a() {
        TimePickerView timePickerView = this.f3431a;
        int i10 = TimePickerView.M;
        Objects.requireNonNull(timePickerView);
    }
}
