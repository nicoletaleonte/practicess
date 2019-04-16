package practices;

public enum LoggingLevel {
    PENDING(1), PROCESSING(2), PROCESSED(3), ERROR(4);

    private int i;
    private LoggingLevel(int i) {
        this.i = i;
    }
    public int code(){
        return i;
    }

    public boolean isPending(){
        return this == PENDING;
    }
}
