package web.dao;

import org.springframework.stereotype.Component;
import web.models.Car;
import java.util.ArrayList;
import java.util.List;

@Component
public class CarDAOImpl implements CarDAO{

    private List<Car> cars;
    private static int ID_COUNT;

    {
        cars = new ArrayList<>();

        cars.add(new Car(++ID_COUNT, "BMW", "blue"));
        cars.add(new Car(++ID_COUNT, "Нива", "green"));
        cars.add(new Car(++ID_COUNT, "Жигули", "red"));
        cars.add(new Car(++ID_COUNT, "Volga", "black"));
        cars.add(new Car(++ID_COUNT, "Toyota", "white"));
    }
    @Override
    public List<Car> listCars(int count) {
        return cars.stream().limit(count).toList();
    }
}
