package adessoassessment.carportal.restservice;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeatureRestController {

    private static final String template = "Features available, %s!";

    @GetMapping("/features")
    public Features features(@RequestParam(value = "id")long id, String name, int cost, String models) {
        return new Features(id, name, cost, models);
    }
}
