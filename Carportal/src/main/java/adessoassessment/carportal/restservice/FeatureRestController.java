package adessoassessment.carportal.restservice;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cars")
public class FeatureRestController {

    @Autowired
    private FeatureRepository featureRepository;

    @GetMapping("/features")
    List<Features> all() {
        return featureRepository.findAll();
    }

    @PostMapping("/features")
    Features newFeature(@RequestBody Features newFeature) {
        return featureRepository.save(newFeature);
    }

    @GetMapping("/features/{id}")
    Features one(@PathVariable int id) {
        return featureRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException(String.valueOf(id)));
    }

}
