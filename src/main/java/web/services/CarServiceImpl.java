package web.services;

import org.springframework.stereotype.Component;
import web.dao.CarDAO;
import web.models.Car;
import java.util.List;

@Component
public class CarServiceImpl implements CarService{
    CarDAO carDAO;

    public CarServiceImpl(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

    @Override
    public List<Car> listCars(int count) {
        return carDAO.listCars(count);
    }
}
