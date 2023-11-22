package projectmongodb.workshopspringbootmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import projectmongodb.workshopspringbootmongodb.domain.User;

@Repository
public interface UserRepository extends MongoRepository <User, String> {




}
