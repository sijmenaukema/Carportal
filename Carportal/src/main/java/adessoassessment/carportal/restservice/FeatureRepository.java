package adessoassessment.carportal.restservice;


import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface FeatureRepository extends JpaRepository<Features, Integer>{
}
