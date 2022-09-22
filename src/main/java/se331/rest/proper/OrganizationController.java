package se331.rest.proper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

public class OrganizationController {
@Autowired
    OrganizerService organizerService;
@GetMapping("/organizers()")
    ResponseEntity<?> getOrganizer(){
    return ResponseEntity.ok(organizerService.getAllOrganizer());

}

}
