package core.controller;

import core.model.Group;
import core.service.GroupService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/groups")
public class GroupController {

    private final GroupService service;

    public GroupController(GroupService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public Group findById(@PathVariable Integer id) {
        return service.findById(id);
    }

    @GetMapping("/find/{id}")
    public Group findById(
            @PathVariable Integer id,
            @RequestParam(required = false,
                    defaultValue = "false")
                    boolean isEager) {
        return service.findById(id, isEager);
    }

}