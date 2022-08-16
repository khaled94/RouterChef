package i1;

import android.database.Cursor;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.spi.AbstractInterruptibleChannel;
import java.util.ArrayList;
import java.util.Iterator;
import l1.a;

/* loaded from: classes.dex */
public final class b {
    /* JADX WARN: Finally extract failed */
    public static void a(k1.b bVar) {
        ArrayList arrayList = new ArrayList();
        a aVar = (a) bVar;
        Cursor j02 = aVar.j0("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (j02.moveToNext()) {
            try {
                arrayList.add(j02.getString(0));
            } catch (Throwable th) {
                j02.close();
                throw th;
            }
        }
        j02.close();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str.startsWith("room_fts_content_sync_")) {
                aVar.n("DROP TRIGGER IF EXISTS " + str);
            }
        }
    }

    public static int b(File file) {
        AbstractInterruptibleChannel abstractInterruptibleChannel = null;
        try {
            ByteBuffer allocate = ByteBuffer.allocate(4);
            FileChannel channel = new FileInputStream(file).getChannel();
            channel.tryLock(60L, 4L, true);
            channel.position(60L);
            if (channel.read(allocate) != 4) {
                throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
            }
            allocate.rewind();
            int i10 = allocate.getInt();
            channel.close();
            return i10;
        } catch (Throwable th) {
            if (0 != 0) {
                abstractInterruptibleChannel.close();
            }
            throw th;
        }
    }
}
