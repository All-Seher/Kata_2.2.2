package web.dao;

import web.Model.Car;

import java.util.List;

public interface CarDAO {

    List<Car> getLimitList(int count);
}
