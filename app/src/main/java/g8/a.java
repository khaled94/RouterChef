package g8;

import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.emoji2.text.k;
import com.raouf.routerchef.DnsPornBlocker;
import com.raouf.routerchef.R;
import f8.e1;
import i8.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public abstract class a implements AdapterView.OnItemSelectedListener {

    /* renamed from: s */
    public final Spinner f4893s;

    /* renamed from: t */
    public final Context f4894t;

    /* renamed from: u */
    public final ArrayAdapter<String> f4895u;

    /* renamed from: v */
    public LinkedHashMap<String, ArrayList<String>> f4896v;

    /* renamed from: w */
    public ArrayList<String> f4897w = new ArrayList<>();

    public a(Context context, Spinner spinner) {
        this.f4893s = spinner;
        this.f4894t = context;
        LinkedHashMap<String, ArrayList<String>> linkedHashMap = new LinkedHashMap<>();
        this.f4896v = linkedHashMap;
        linkedHashMap.put(context.getString(R.string.chooseDNS), new ArrayList<>(Arrays.asList("", "")));
        this.f4896v.put("Google", new ArrayList<>(Arrays.asList("8.8.8.8", "8.8.4.4")));
        this.f4896v.put("CloudFlare", new ArrayList<>(Arrays.asList("1.1.1.1", "1.0.0.1")));
        this.f4896v.put("Quad9", new ArrayList<>(Arrays.asList("9.9.9.9", "149.112.112.112")));
        this.f4896v.put("Norton", new ArrayList<>(Arrays.asList("199.85.126.10", "199.85.127.10")));
        this.f4896v.put("Yandex", new ArrayList<>(Arrays.asList("77.88.8.8", "77.88.8.1")));
        LinkedHashMap<String, ArrayList<String>> linkedHashMap2 = this.f4896v;
        StringBuilder c10 = androidx.activity.result.a.c("Norton - ");
        c10.append(context.getString(R.string.pornBlocker));
        linkedHashMap2.put(c10.toString(), new ArrayList<>(Arrays.asList("199.85.126.30", "199.85.127.30")));
        LinkedHashMap<String, ArrayList<String>> linkedHashMap3 = this.f4896v;
        StringBuilder c11 = androidx.activity.result.a.c("Yandex - ");
        c11.append(context.getString(R.string.pornBlocker));
        linkedHashMap3.put(c11.toString(), new ArrayList<>(Arrays.asList("77.88.8.7", "77.88.8.3")));
        LinkedHashMap<String, ArrayList<String>> linkedHashMap4 = this.f4896v;
        StringBuilder c12 = androidx.activity.result.a.c("OpenDNS - ");
        c12.append(context.getString(R.string.pornBlocker));
        linkedHashMap4.put(c12.toString(), new ArrayList<>(Arrays.asList("208.67.222.123", "208.67.220.123")));
        LinkedHashMap<String, ArrayList<String>> linkedHashMap5 = this.f4896v;
        StringBuilder c13 = androidx.activity.result.a.c("CloudFlare - ");
        c13.append(context.getString(R.string.pornBlocker));
        linkedHashMap5.put(c13.toString(), new ArrayList<>(Arrays.asList("1.1.1.3", "1.0.0.3")));
        this.f4896v.put(context.getString(R.string.ispDns), new ArrayList<>(Arrays.asList("", "")));
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(context, 17367048, this.f4897w);
        this.f4895u = arrayAdapter;
        arrayAdapter.setDropDownViewResource(17367049);
        spinner.setAdapter((SpinnerAdapter) arrayAdapter);
        spinner.setOnItemSelectedListener(this);
        this.f4897w.addAll(this.f4896v.keySet());
        arrayAdapter.notifyDataSetChanged();
    }

    public final boolean a() {
        return this.f4893s.getSelectedItem().toString().equals(this.f4894t.getString(R.string.ispDns));
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j3) {
        if (view != null) {
            String obj = this.f4893s.getSelectedItem().toString();
            if (obj.equals(this.f4894t.getString(R.string.ispDns))) {
                DnsPornBlocker.a aVar = (DnsPornBlocker.a) this;
                DnsPornBlocker.this.Z.setEnabled(false);
                DnsPornBlocker.this.f3531a0.setEnabled(false);
                DnsPornBlocker.this.Z.setHint("--");
                DnsPornBlocker.this.f3531a0.setHint("--");
            } else {
                DnsPornBlocker.a aVar2 = (DnsPornBlocker.a) this;
                DnsPornBlocker.this.Z.setEnabled(true);
                DnsPornBlocker.this.f3531a0.setEnabled(true);
                DnsPornBlocker dnsPornBlocker = DnsPornBlocker.this;
                dnsPornBlocker.Z.setHint(dnsPornBlocker.getString(R.string.dns1Hint));
                DnsPornBlocker dnsPornBlocker2 = DnsPornBlocker.this;
                dnsPornBlocker2.f3531a0.setHint(dnsPornBlocker2.getString(R.string.dns2Hint));
            }
            if (i10 == 0) {
                ((g) this.f4894t).O.post(new k(view, 2));
            } else {
                ((g) this.f4894t).O.post(new e1(this, obj, 1));
            }
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView<?> adapterView) {
    }
}
