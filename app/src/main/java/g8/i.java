package g8;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.d;
import com.raouf.routerchef.R;
import f8.d1;
import f8.v;
import i8.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import r8.b;

/* loaded from: classes.dex */
public abstract class i implements AdapterView.OnItemSelectedListener {

    /* renamed from: s */
    public final String f4935s;

    /* renamed from: t */
    public final Spinner f4936t;

    /* renamed from: u */
    public final Context f4937u;

    /* renamed from: v */
    public final ArrayAdapter<String> f4938v;

    /* renamed from: w */
    public final ArrayList<String> f4939w;

    public i(Context context, String str, Spinner spinner) {
        this.f4935s = str;
        this.f4936t = spinner;
        this.f4937u = context;
        ArrayList<String> arrayList = new ArrayList<>();
        this.f4939w = arrayList;
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(context, 17367048, arrayList);
        this.f4938v = arrayAdapter;
        arrayAdapter.setDropDownViewResource(17367049);
        spinner.setAdapter((SpinnerAdapter) arrayAdapter);
        spinner.setOnItemSelectedListener(this);
        a();
    }

    public final void a() {
        this.f4939w.clear();
        this.f4939w.add(this.f4937u.getString(R.string.choosePreset));
        for (Map.Entry<String, ?> entry : this.f4937u.getSharedPreferences(this.f4935s, 0).getAll().entrySet()) {
            this.f4939w.add(entry.getKey());
        }
        this.f4938v.notifyDataSetChanged();
    }

    public abstract void b(String str);

    public final void c(final String str) {
        final EditText editText = new EditText(this.f4937u);
        editText.setInputType(1);
        d.a aVar = new d.a(this.f4937u);
        aVar.f502a.p = editText;
        String string = this.f4937u.getString(R.string.presetName);
        AlertController.b bVar = aVar.f502a;
        bVar.f476d = string;
        bVar.f479g = bVar.f473a.getText(17039370);
        AlertController.b bVar2 = aVar.f502a;
        bVar2.f480h = null;
        bVar2.f481i = bVar2.f473a.getText(17039360);
        aVar.f502a.f482j = null;
        final d d5 = aVar.d();
        Button d10 = d5.d(-1);
        Button d11 = d5.d(-2);
        d10.setOnClickListener(new View.OnClickListener() { // from class: g8.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                boolean z10;
                Context context;
                int i10;
                i iVar = i.this;
                EditText editText2 = editText;
                String str2 = str;
                d dVar = d5;
                Objects.requireNonNull(iVar);
                String obj = editText2.getText().toString();
                Iterator<Map.Entry<String, ?>> it = iVar.f4937u.getSharedPreferences(iVar.f4935s, 0).getAll().entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z10 = true;
                        break;
                    } else if (it.next().getKey().equals(obj)) {
                        z10 = false;
                        break;
                    }
                }
                if (!z10) {
                    context = iVar.f4937u;
                    i10 = R.string.alreadyExists;
                } else if (obj.length() > 0) {
                    iVar.f4937u.getSharedPreferences(iVar.f4935s, 0).edit().putString(obj, str2).apply();
                    iVar.a();
                    dVar.dismiss();
                    context = iVar.f4937u;
                    i10 = R.string.savedSuccess;
                } else {
                    context = iVar.f4937u;
                    i10 = R.string.emptySave;
                }
                b.q(context, context.getString(i10));
            }
        });
        d11.setOnClickListener(new v(d5, 1));
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j3) {
        Handler handler = ((g) this.f4937u).O;
        if (i10 == 0) {
            handler.post(new d1(view, 2));
        } else {
            handler.post(new p7.b(this, 1));
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView<?> adapterView) {
    }
}
