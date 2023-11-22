package projectmongodb.workshopspringbootmongodb.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projectmongodb.workshopspringbootmongodb.domain.User;
import projectmongodb.workshopspringbootmongodb.repository.UserRepository;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;
    public List<User> findAll(){
        return repo.findAll();
    }


}
