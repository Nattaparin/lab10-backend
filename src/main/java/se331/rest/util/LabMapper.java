package se331.rest.util;



import org.mapstruct.Mapper;
import se331.rest.entity.Event;
import se331.rest.entity.EventDTO;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface LabMapper {
    LabMapper INSTANCE = Mappers.getMapper(LabMapper.class);
    EventDTO getEventDto(Event event);
    List<EventDTO> getEventDto(List<Event> events);
}
