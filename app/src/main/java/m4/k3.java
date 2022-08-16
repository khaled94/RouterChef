package m4;

import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class k3 implements j3 {

    /* renamed from: s */
    public final FileChannel f10258s;

    /* renamed from: t */
    public final long f10259t;

    /* renamed from: u */
    public final long f10260u;

    public k3(FileChannel fileChannel, long j3, long j10) {
        this.f10258s = fileChannel;
        this.f10259t = j3;
        this.f10260u = j10;
    }

    @Override // m4.j3
    public final void b(MessageDigest[] messageDigestArr, long j3, int i10) {
        MappedByteBuffer map = this.f10258s.map(FileChannel.MapMode.READ_ONLY, this.f10259t + j3, i10);
        map.load();
        for (MessageDigest messageDigest : messageDigestArr) {
            map.position(0);
            messageDigest.update(map);
        }
    }

    @Override // m4.j3, m4.ze0, m4.tc1
    /* renamed from: zza */
    public final long mo22zza() {
        return this.f10260u;
    }
}
