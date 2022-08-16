package t1;

/* loaded from: classes.dex */
public enum n {
    ENQUEUED,
    RUNNING,
    SUCCEEDED,
    FAILED,
    BLOCKED,
    CANCELLED;

    public final boolean b() {
        return this == SUCCEEDED || this == FAILED || this == CANCELLED;
    }
}
