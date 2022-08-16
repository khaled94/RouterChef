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
public final class b31 implements SensorEventListener {

    /* renamed from: a */
    public final Context f6347a;
    @Nullable

    /* renamed from: b */
    public SensorManager f6348b;

    /* renamed from: c */
    public Sensor f6349c;

    /* renamed from: d */
    public long f6350d;

    /* renamed from: e */
    public int f6351e;

    /* renamed from: f */
    public a31 f6352f;
    @GuardedBy("this")

    /* renamed from: g */
    public boolean f6353g;

    public b31(Context context) {
        this.f6347a = context;
    }

    public final void a() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            try {
                yr<Boolean> yrVar = es.W5;
                jo joVar = jo.f10145d;
                if (!((Boolean) joVar.f10148c.a(yrVar)).booleanValue()) {
                    return;
                }
                if (this.f6348b == null) {
                    SensorManager sensorManager2 = (SensorManager) this.f6347a.getSystemService("sensor");
                    this.f6348b = sensorManager2;
                    if (sensorManager2 == null) {
                        g1.j("Shake detection failed to initialize. Failed to obtain accelerometer.");
                        return;
                    }
                    this.f6349c = sensorManager2.getDefaultSensor(1);
                }
                if (!this.f6353g && (sensorManager = this.f6348b) != null && (sensor = this.f6349c) != null) {
                    sensorManager.registerListener(this, sensor, 2);
                    Objects.requireNonNull(s.B.f5796j);
                    this.f6350d = System.currentTimeMillis() - ((Integer) joVar.f10148c.a(es.Y5)).intValue();
                    this.f6353g = true;
                    g1.a("Listening for shake gestures.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        yr<Boolean> yrVar = es.W5;
        jo joVar = jo.f10145d;
        if (((Boolean) joVar.f10148c.a(yrVar)).booleanValue()) {
            float[] fArr = sensorEvent.values;
            float f10 = fArr[0] / 9.80665f;
            float f11 = fArr[1] / 9.80665f;
            float f12 = fArr[2] / 9.80665f;
            float f13 = f12 * f12;
            if (((float) Math.sqrt(f13 + (f11 * f11) + (f10 * f10))) < ((Float) joVar.f10148c.a(es.X5)).floatValue()) {
                return;
            }
            Objects.requireNonNull(s.B.f5796j);
            long currentTimeMillis = System.currentTimeMillis();
            if (this.f6350d + ((Integer) joVar.f10148c.a(es.Y5)).intValue() > currentTimeMillis) {
                return;
            }
            if (this.f6350d + ((Integer) joVar.f10148c.a(es.Z5)).intValue() < currentTimeMillis) {
                this.f6351e = 0;
            }
            g1.a("Shake detected.");
            this.f6350d = currentTimeMillis;
            int i10 = this.f6351e + 1;
            this.f6351e = i10;
            a31 a31Var = this.f6352f;
            if (a31Var == null) {
                return;
            }
            if (i10 != ((Integer) joVar.f10148c.a(es.f8056a6)).intValue()) {
                return;
            }
            ((x21) a31Var).b(new u21(), w21.GESTURE);
        }
    }
}
