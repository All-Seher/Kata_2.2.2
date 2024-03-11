package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.Model.Car;
import web.dao.CarDAO;
import web.service.CarService;

import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    @Autowired
    CarDAO carDAO;

    @Override
    public List<Car> getLimitList(int count) {
        return carDAO.getLimitList(count);
    }
}
