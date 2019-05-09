package mybasicmapper;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneOffset;
import java.util.Date;

import org.junit.Test;
import org.mapstruct.factory.Mappers;

public class HeroesMapperTest {

	@Test
	public void heroesMapperDtoToPojo() {
		HeroesDto heroDto = new HeroesDto("Diana", Roles.FIGHTER,
				Date.from(LocalDateTime.of(LocalDate.of(2014, 10, 10), LocalTime.of(12, 0)).toInstant(ZoneOffset.UTC)),
				975.0);

		HeroesMapper heroesMapper = Mappers.getMapper(HeroesMapper.class);

		HeroesPojo heroPojo = heroesMapper.heroesDtoToPojo(heroDto);

		assertThat(heroPojo.getReleased().equals(heroDto.getReleaseDt().toString()));
		assertThat(heroPojo.getRpValue().equals(heroDto.getPrice().toString()));
	}
}
