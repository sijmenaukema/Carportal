package adessoassessment.carportal.restservice;


import org.apache.velocity.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class FeatureRestController {

    @Autowired
    private FeatureRepository featureRepository;

    @GetMapping("/features")
    public List<Features> getAllFeatures() {
        return featureRepository.findAll() ;
    }

    @GetMapping("/features/{id}")
    public ResponseEntity<Features> getNameById(@PathVariable(value = "id") Long id) throws ResourceNotFoundException {
        Features features =
                featureRepository
                        .findById(id)
                        .orElseThrow(() -> new ResourceNotFoundException("No model is found on :: " + id));
        return ResponseEntity.ok().body(features);
    }
}
