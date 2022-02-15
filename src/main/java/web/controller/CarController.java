package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Service.CarService;
import web.Service.CarServiceImpl;

import java.util.stream.Collectors;

@Controller
public class CarController {
    CarService carService = new CarServiceImpl();

    @GetMapping("/cars")
    public String countCars(@RequestParam(value = "count",
                            required = false, defaultValue = "5") Integer count,
                            Model model) {
        model.addAttribute("cars", carService.getListCars()
                .stream()
                .limit(count)
                .collect(Collectors.toList()));

        return "cars";
    }
}
