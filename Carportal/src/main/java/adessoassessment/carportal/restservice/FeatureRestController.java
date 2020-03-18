package adessoassessment.carportal.restservice;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class FeatureRestController {

    @Autowired
    private FeatureRepository featureRepository;

    @GetMapping("/features")
    public List<Features> getAllFeatures(){
        return featureRepository.findAll() ;
    }
}
