package practices;

public class CarSelector {
    public static void main(String[] args) {
        CarService carService = new CarService();
        for (String arg : args) {
            if (isValid(arg)) {
                carService.process(arg);
            } else {
                System.out.println("ignoring invalid argument: " + arg);
            }
        }
    }

    private static boolean isValid(String arg) {
        try {
            CarState carState = CarState.valueOf(arg);
        } catch (IllegalArgumentException e) {
            return false;
        } finally {
            System.out.println("se executa indiferent daca e pe try sau catch. ");

        }
        return true;
    }
}
