package i8;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.EditText;
import com.raouf.routerchef.R;
import f8.x;
import j8.c;
import l8.a;
import r8.b;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a */
    public Dialog f5280a;

    /* renamed from: b */
    public Context f5281b;

    /* renamed from: c */
    public c f5282c;

    public f(Context context, c cVar) {
        Dialog dialog = new Dialog(context);
        this.f5280a = dialog;
        this.f5281b = context;
        this.f5282c = cVar;
        if (cVar.f5509j != null) {
            dialog.setContentView(R.layout.manage_macname_dialog);
            ((EditText) this.f5280a.findViewById(R.id.manageNameInput)).setText(this.f5282c.f5509j.f5821b);
            this.f5280a.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            this.f5280a.findViewById(R.id.closeImgView).setOnClickListener(new View.OnClickListener() { // from class: i8.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    f.this.f5280a.dismiss();
                }
            });
            this.f5280a.findViewById(R.id.modifyMacNameBtn).setOnClickListener(new View.OnClickListener() { // from class: i8.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Context context2;
                    int i10;
                    f fVar = f.this;
                    EditText editText = (EditText) fVar.f5280a.findViewById(R.id.manageNameInput);
                    if (editText.getText().toString().length() > 0) {
                        fVar.f5282c.f5509j.f5821b = editText.getText().toString();
                        fVar.b(fVar.f5282c.f5509j);
                        fVar.f5280a.dismiss();
                        context2 = fVar.f5281b;
                        i10 = R.string.saveMacNameToast;
                    } else {
                        context2 = fVar.f5281b;
                        i10 = R.string.macNameValidation;
                    }
                    b.q(context2, context2.getString(i10));
                }
            });
            this.f5280a.findViewById(R.id.deleteMacNameBtn).setOnClickListener(new View.OnClickListener() { // from class: i8.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    f fVar = f.this;
                    fVar.a(fVar.f5282c.f5509j);
                    fVar.f5280a.dismiss();
                    Context context2 = fVar.f5281b;
                    b.q(context2, context2.getString(R.string.deleteMacNameToast));
                }
            });
            return;
        }
        dialog.setContentView(R.layout.add_macname_dialog);
        this.f5280a.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        this.f5280a.findViewById(R.id.closeImgView).setOnClickListener(new x(this, 1));
        this.f5280a.findViewById(R.id.saveMacNameBtn).setOnClickListener(new View.OnClickListener() { // from class: i8.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Context context2;
                int i10;
                f fVar = f.this;
                EditText editText = (EditText) fVar.f5280a.findViewById(R.id.macNameInput);
                if (editText.getText().toString().length() > 0) {
                    fVar.b(new a(fVar.f5282c.f5501b, editText.getText().toString()));
                    fVar.f5280a.dismiss();
                    context2 = fVar.f5281b;
                    i10 = R.string.saveMacNameToast;
                } else {
                    context2 = fVar.f5281b;
                    i10 = R.string.macNameValidation;
                }
                b.q(context2, context2.getString(i10));
            }
        });
    }

    public abstract void a(a aVar);

    public abstract void b(a aVar);
}
