package m4;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import java.util.Objects;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import l3.s;
import n3.g1;

/* loaded from: classes.dex */
public final class n21 implements SensorEventListener {
    @Nullable

    /* renamed from: a */
    public final SensorManager f11403a;
    @Nullable

    /* renamed from: b */
    public final Sensor f11404b;

    /* renamed from: c */
    public float f11405c = 0.0f;

    /* renamed from: d */
    public Float f11406d = Float.valueOf(0.0f);

    /* renamed from: e */
    public long f11407e = System.currentTimeMillis();

    /* renamed from: f */
    public int f11408f = 0;

    /* renamed from: g */
    public boolean f11409g = false;

    /* renamed from: h */
    public boolean f11410h = false;
    @Nullable

    /* renamed from: i */
    public m21 f11411i = null;
    @GuardedBy("this")

    /* renamed from: j */
    public boolean f11412j = false;

    public n21(Context context) {
        Objects.requireNonNull(s.B.f5796j);
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f11403a = sensorManager;
        if (sensorManager != null) {
            this.f11404b = sensorManager.getDefaultSensor(4);
        } else {
            this.f11404b = null;
        }
    }

    public final void a() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            if (!((Boolean) jo.f10145d.f10148c.a(es.f8063b6)).booleanValue()) {
                return;
            }
            if (!this.f11412j && (sensorManager = this.f11403a) != null && (sensor = this.f11404b) != null) {
                sensorManager.registerListener(this, sensor, 2);
                this.f11412j = true;
                g1.a("Listening for flick gestures.");
            }
            if (this.f11403a != null && this.f11404b != null) {
                return;
            }
            g1.j("Flick detection failed to initialize. Failed to obtain gyroscope.");
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        yr<Boolean> yrVar = es.f8063b6;
        jo joVar = jo.f10145d;
        if (!((Boolean) joVar.f10148c.a(yrVar)).booleanValue()) {
            return;
        }
        Objects.requireNonNull(s.B.f5796j);
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f11407e + ((Integer) joVar.f10148c.a(es.f8078d6)).intValue() < currentTimeMillis) {
            this.f11408f = 0;
            this.f11407e = currentTimeMillis;
            this.f11409g = false;
            this.f11410h = false;
            this.f11405c = this.f11406d.floatValue();
        }
        Float valueOf = Float.valueOf((sensorEvent.values[1] * 4.0f) + this.f11406d.floatValue());
        this.f11406d = valueOf;
        float floatValue = valueOf.floatValue();
        float f10 = this.f11405c;
        yr<Float> yrVar2 = es.f8071c6;
        if (floatValue > ((Float) joVar.f10148c.a(yrVar2)).floatValue() + f10) {
            this.f11405c = this.f11406d.floatValue();
            this.f11410h = true;
        } else if (this.f11406d.floatValue() < this.f11405c - ((Float) joVar.f10148c.a(yrVar2)).floatValue()) {
            this.f11405c = this.f11406d.floatValue();
            this.f11409g = true;
        }
        if (this.f11406d.isInfinite()) {
            this.f11406d = Float.valueOf(0.0f);
            this.f11405c = 0.0f;
        }
        if (!this.f11409g || !this.f11410h) {
            return;
        }
        g1.a("Flick detected.");
        this.f11407e = currentTimeMillis;
        int i10 = this.f11408f + 1;
        this.f11408f = i10;
        this.f11409g = false;
        this.f11410h = false;
        m21 m21Var = this.f11411i;
        if (m21Var == null) {
            return;
        }
        if (i10 != ((Integer) joVar.f10148c.a(es.f8086e6)).intValue()) {
            return;
        }
        ((x21) m21Var).b(new v21(), w21.GESTURE);
    }
}
