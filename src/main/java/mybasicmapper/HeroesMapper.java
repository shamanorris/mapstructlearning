package mybasicmapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface HeroesMapper {

	@Mapping(source = "releaseDt", target = "released")
	@Mapping(source = "price", target = "rpValue")
	HeroesPojo heroesDtoToPojo(HeroesDto heroesDto);

}
