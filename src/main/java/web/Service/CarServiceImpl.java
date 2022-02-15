package web.Service;

import web.DAO.CarDao;
import web.DAO.CarDaoImpl;
import web.Model.Car;
import java.util.List;

public class CarServiceImpl implements CarService {
    CarDao carDao = new CarDaoImpl();

    @Override
    public List<Car> getListCars() {
        return carDao.getListCars();
    }
}
