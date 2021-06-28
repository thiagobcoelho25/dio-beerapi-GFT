package one.digitalGFT.beerstockDioGTF.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import one.digitalGFT.beerstockDioGTF.entities.Beer;

@Repository
public interface BeerRepository extends JpaRepository<Beer, Long>{
	
	Optional<Beer> findByName(String name);
}
