package web.dao;

import org.springframework.stereotype.Component;
import web.Model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDAOImpl implements CarDAO {

    private List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car(1L, "Lada", 2000));
        cars.add(new Car(2L, "BMW", 2005));
        cars.add(new Car(3L, "KIA", 2015));
        cars.add(new Car(4L, "Skoda", 2021));
        cars.add(new Car(5L, "Cherry", 2024));
    }

    @Override
    public List<Car> getLimitList(int count) {
        return cars.stream().limit(count).toList();
    }
}