package practices;

public enum CarState {
    DRIVING, WAITING, PARKING;

    public static CarState from(String state){
        if ("DRIVING".equals(state)) {
            return DRIVING;
        } else if ("WAITING".equals(state)) {
            return WAITING;
        } else if ("PARKING".equals(state)) {
            return PARKING;
        }
        throw new RuntimeException("unknow state: " + state) ;
    }
}
