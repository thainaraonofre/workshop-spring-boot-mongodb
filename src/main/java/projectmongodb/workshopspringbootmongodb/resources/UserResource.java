package projectmongodb.workshopspringbootmongodb.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import projectmongodb.workshopspringbootmongodb.domain.User;
import projectmongodb.workshopspringbootmongodb.dto.UserDTO;
import projectmongodb.workshopspringbootmongodb.services.UserService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @Autowired
    private UserService service;


    @RequestMapping(method= RequestMethod.GET)
    public ResponseEntity <List<UserDTO>> findAll() {
        List<User> list = service.findAll();
        List <UserDTO> listDto = list.stream().map(x -> new UserDTO(x)).collect(Collectors.toList());
        return ResponseEntity.ok().body(listDto);
    }


    @RequestMapping(value="/{id}", method= RequestMethod.GET)
    public ResponseEntity<UserDTO> findById(@PathVariable String id) {
        User obj = service.findById(id);
        return ResponseEntity.ok().body(new UserDTO(obj));
    }



}
