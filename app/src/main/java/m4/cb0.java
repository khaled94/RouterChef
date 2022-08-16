package m4;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.view.Display;
import android.view.WindowManager;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public final class cb0 implements SensorEventListener {

    /* renamed from: a */
    public final SensorManager f6763a;

    /* renamed from: c */
    public final Display f6765c;
    @GuardedBy("sensorThreadLock")

    /* renamed from: f */
    public float[] f6768f;

    /* renamed from: g */
    public vt1 f6769g;

    /* renamed from: h */
    public bb0 f6770h;

    /* renamed from: d */
    public final float[] f6766d = new float[9];

    /* renamed from: e */
    public final float[] f6767e = new float[9];

    /* renamed from: b */
    public final Object f6764b = new Object();

    public cb0(Context context) {
        this.f6763a = (SensorManager) context.getSystemService("sensor");
        this.f6765c = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    public final void a() {
        if (this.f6769g == null) {
            return;
        }
        this.f6763a.unregisterListener(this);
        this.f6769g.post(new ab0());
        this.f6769g = null;
    }

    public final boolean b(float[] fArr) {
        synchronized (this.f6764b) {
            float[] fArr2 = this.f6768f;
            if (fArr2 == null) {
                return false;
            }
            System.arraycopy(fArr2, 0, fArr, 0, 9);
            return true;
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        if (fArr[0] == 0.0f && fArr[1] == 0.0f && fArr[2] == 0.0f) {
            return;
        }
        synchronized (this.f6764b) {
            if (this.f6768f == null) {
                this.f6768f = new float[9];
            }
        }
        SensorManager.getRotationMatrixFromVector(this.f6766d, fArr);
        int rotation = this.f6765c.getRotation();
        if (rotation == 1) {
            SensorManager.remapCoordinateSystem(this.f6766d, 2, 129, this.f6767e);
        } else if (rotation == 2) {
            SensorManager.remapCoordinateSystem(this.f6766d, 129, 130, this.f6767e);
        } else if (rotation != 3) {
            System.arraycopy(this.f6766d, 0, this.f6767e, 0, 9);
        } else {
            SensorManager.remapCoordinateSystem(this.f6766d, 130, 1, this.f6767e);
        }
        float[] fArr2 = this.f6767e;
        float f10 = fArr2[1];
        fArr2[1] = fArr2[3];
        fArr2[3] = f10;
        float f11 = fArr2[2];
        fArr2[2] = fArr2[6];
        fArr2[6] = f11;
        float f12 = fArr2[5];
        fArr2[5] = fArr2[7];
        fArr2[7] = f12;
        synchronized (this.f6764b) {
            System.arraycopy(this.f6767e, 0, this.f6768f, 0, 9);
        }
        bb0 bb0Var = this.f6770h;
        if (bb0Var == null) {
            return;
        }
        db0 db0Var = (db0) bb0Var;
        synchronized (db0Var.M) {
            db0Var.M.notifyAll();
        }
    }
}
