package practices;

import org.junit.Test;

public class CarSelectorTest {

    @Test
    public void shouldCallMain(){
        String[] args = {"BMW", "Audi", "Porsche"};
        CarSelector.main(args);
    }
}
