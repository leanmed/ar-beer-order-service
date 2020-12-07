package com.lmedin.arbeerorderservice.mappers;
import com.lmedin.arbeerorderservice.domain.BeerOrderLine;
import com.lmedin.arbeerorderservice.model.BeerOrderLineDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerOrderLineMapper {
    BeerOrderLineDto beerOrderLineToDto(BeerOrderLine line);

    BeerOrderLine dtoToBeerOrderLine(BeerOrderLineDto dto);
}
