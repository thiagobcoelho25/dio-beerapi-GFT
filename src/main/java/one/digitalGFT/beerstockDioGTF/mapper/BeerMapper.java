package one.digitalGFT.beerstockDioGTF.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import one.digitalGFT.beerstockDioGTF.dto.BeerDTO;
import one.digitalGFT.beerstockDioGTF.entities.Beer;

@Mapper(componentModel  = "spring")
public interface BeerMapper {

    BeerMapper INSTANCE = Mappers.getMapper(BeerMapper.class);

    Beer toModel(BeerDTO beerDTO);

    BeerDTO toDTO(Beer beer);
}