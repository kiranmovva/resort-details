package com.rci.resort.detail.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.rci.resort.detail.entity.ResortEntity;
import com.rci.resort.detail.model.ResortDetail;

@Mapper(componentModel="spring")
public interface ResortMapper {
	//ResortMapper INSTANCE = Mappers.getMapper( ResortMapper.class );
	@Mappings(
			{
			     @Mapping(source="languageCode",target="langCode"),
			     @Mapping(source="affilStatus",target="affilativeStatus")
			}
		)
	ResortDetail map(ResortEntity entities);

}
