package eu.busi.myplanning.domain.mappers;

import eu.busi.myplanning.domain.models.Agenda;
import eu.busi.myplanning.models.AgendaDTO;
import eu.busi.myplanning.models.AgendaLightDTO;
import org.mapstruct.factory.Mappers;

public interface AgendaMapper extends GenericMapper<Agenda, AgendaDTO, AgendaLightDTO> {
    AgendaMapper INSTANCE = Mappers.getMapper(AgendaMapper.class);
}
