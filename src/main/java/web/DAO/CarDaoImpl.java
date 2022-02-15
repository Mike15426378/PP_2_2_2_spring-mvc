package web.DAO;

import web.Model.Car;
import java.util.ArrayList;
import java.util.List;

public class CarDaoImpl implements CarDao {

    @Override
    public List<Car> getListCars() {
        List<Car> cars = new ArrayList<>();

        cars.add(new Car("BMW", "X5", "black"));
        cars.add(new Car("Mercedes-Benz", "GL63", "grey"));
        cars.add(new Car("Rolls-Royce", "Phantom", "write"));
        cars.add(new Car("AUDI", "RS7", "blue"));
        cars.add(new Car("Ford", "Bronco", "black"));

        return cars;
    }
}
