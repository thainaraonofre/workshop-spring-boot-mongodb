package projectmongodb.workshopspringbootmongodb.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projectmongodb.workshopspringbootmongodb.domain.User;
import projectmongodb.workshopspringbootmongodb.repository.UserRepository;
import projectmongodb.workshopspringbootmongodb.services.exception.ObjectNotFoundException;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;


    public List<User> findAll(){
        return repo.findAll();
    }


    public User findById(String id) {
        Optional<User> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Object not found"));
    }

}
