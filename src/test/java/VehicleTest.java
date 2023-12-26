import org.example.Car;
import org.example.Motorcycle;
import org.example.Vehicle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class VehicleTest {

    private Car car;
    private Motorcycle motorcycle;

    @BeforeEach
    void setup() {
        car = new Car("VAZ", "LADA", 3);
        motorcycle = new Motorcycle("IZ", "Jupiter", 5);
    }

    @Test
    void testCarInVehicle() {

        assertThat(car instanceof Vehicle).isTrue();
    }

    @Test
    void testCarWheels() {

        assertThat(car.getNumWheels()).isEqualTo(4);
    }

    @Test
    void testMotorcycleWheels() {

        assertThat(motorcycle.getNumWheels()).isEqualTo(2);
    }

    @Test
    void testSpeedInTestDriveCar() {

        car.testDrive();

        assertThat(car.getSpeed()).isEqualTo(60);
    }

    @Test
    void testSpeedInTestDriveMotorcycle() {

        motorcycle.testDrive();

        assertThat(motorcycle.getSpeed()).isEqualTo(75);
    }

    @Test
    void testSpeedInParkCar() {

        car.testDrive();
        car.park();

        assertThat(car.getSpeed()).isEqualTo(0);
    }

    @Test
    void testSpeedInParkMotorcycle() {

        motorcycle.testDrive();
        motorcycle.park();

        assertThat(motorcycle.getSpeed()).isEqualTo(0);
    }
}
