package africa.semicolon.userManagement.data.repositories;

import africa.semicolon.userManagement.data.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}
