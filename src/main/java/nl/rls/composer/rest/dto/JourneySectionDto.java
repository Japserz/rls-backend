package nl.rls.composer.rest.dto;

import org.springframework.hateoas.ResourceSupport;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class JourneySectionDto extends ResourceSupport {
    private LocationIdentDto journeySectionOrigin;
    private LocationIdentDto journeySectionDestination;
    private ResponsibilityDto responsibilityActualSection;
    private ResponsibilityDto responsibilityNextSection;
}
