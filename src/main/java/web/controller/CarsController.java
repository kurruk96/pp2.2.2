package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.services.CarService;

@Controller
public class CarsController {
    CarService carService;

    public CarsController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String carsList(@RequestParam(value = "count", defaultValue = "5") int count, Model model) {
        model.addAttribute("listCars", carService.listCars(count));
        return "cars";
    }
}
