package f8;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.text.InputFilter;
import android.view.View;
import android.widget.EditText;
import com.raouf.routerchef.AccessBlocker;
import com.raouf.routerchef.R;
import g8.e;
import j8.c;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes.dex */
public final class j extends e {

    /* renamed from: f */
    public final /* synthetic */ AccessBlocker f4623f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(AccessBlocker accessBlocker, Context context, ArrayList arrayList) {
        super(context, arrayList);
        this.f4623f = accessBlocker;
    }

    @Override // g8.e
    public final void h(c cVar, int i10) {
        String str = cVar.f5503d;
        final String str2 = cVar.f5501b;
        if (cVar.f5507h) {
            final AccessBlocker accessBlocker = this.f4623f;
            final String R = accessBlocker.R(str, str2);
            Dialog dialog = new Dialog(accessBlocker);
            accessBlocker.f3499j0 = dialog;
            dialog.setContentView(R.layout.block_warning_dialog);
            accessBlocker.f3499j0.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            accessBlocker.f3499j0.findViewById(R.id.cancelBtn).setOnClickListener(new View.OnClickListener() { // from class: f8.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AccessBlocker.this.f3499j0.dismiss();
                }
            });
            accessBlocker.f3499j0.findViewById(R.id.continueBtn).setOnClickListener(new View.OnClickListener() { // from class: f8.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AccessBlocker accessBlocker2 = AccessBlocker.this;
                    String str3 = R;
                    String str4 = str2;
                    int i11 = AccessBlocker.f3489k0;
                    accessBlocker2.Q(str3, str4);
                    accessBlocker2.f3499j0.dismiss();
                }
            });
            accessBlocker.f3499j0.show();
        } else if (str2.length() <= 0) {
        } else {
            final AccessBlocker accessBlocker2 = this.f4623f;
            boolean z10 = accessBlocker2.S.f16811z;
            final String R2 = accessBlocker2.R(str, str2);
            if (z10) {
                Dialog dialog2 = new Dialog(accessBlocker2);
                accessBlocker2.f3499j0 = dialog2;
                dialog2.setContentView(R.layout.confirm_block_with_hostname_dialog);
                final EditText editText = (EditText) accessBlocker2.f3499j0.findViewById(R.id.macNameInput);
                editText.setInputType(1);
                editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(10)});
                editText.setText(R2);
                accessBlocker2.f3499j0.getWindow().setBackgroundDrawable(new ColorDrawable(0));
                accessBlocker2.f3499j0.findViewById(R.id.cancelBtn).setOnClickListener(new View.OnClickListener() { // from class: f8.a
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        AccessBlocker.this.f3499j0.dismiss();
                    }
                });
                accessBlocker2.f3499j0.findViewById(R.id.confirmBlockBtn).setOnClickListener(new View.OnClickListener() { // from class: f8.d
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        AccessBlocker accessBlocker3 = AccessBlocker.this;
                        EditText editText2 = editText;
                        String str3 = str2;
                        int i11 = AccessBlocker.f3489k0;
                        Objects.requireNonNull(accessBlocker3);
                        accessBlocker3.Q(editText2.getText().toString(), str3);
                        accessBlocker3.f3499j0.dismiss();
                    }
                });
                accessBlocker2.f3499j0.show();
                return;
            }
            Dialog dialog3 = new Dialog(accessBlocker2);
            accessBlocker2.f3499j0 = dialog3;
            dialog3.setContentView(R.layout.confirm_block_without_hostname_dialog);
            accessBlocker2.f3499j0.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            accessBlocker2.f3499j0.findViewById(R.id.cancelBtn).setOnClickListener(new View.OnClickListener() { // from class: f8.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AccessBlocker.this.f3499j0.dismiss();
                }
            });
            accessBlocker2.f3499j0.findViewById(R.id.confirmBlockBtn).setOnClickListener(new View.OnClickListener() { // from class: f8.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AccessBlocker accessBlocker3 = AccessBlocker.this;
                    String str3 = R2;
                    String str4 = str2;
                    int i11 = AccessBlocker.f3489k0;
                    accessBlocker3.Q(str3, str4);
                    accessBlocker3.f3499j0.dismiss();
                }
            });
            accessBlocker2.f3499j0.show();
        }
    }
}
