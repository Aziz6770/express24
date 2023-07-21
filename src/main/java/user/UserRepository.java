package user;

import common.BaseRepository;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class UserRepository extends BaseRepository<User, UUID> {
//    private final List<User> users = new ArrayList<>();
    private static final UserRepository repository = new UserRepository();

    public Optional<User> findUserByPhoneNumber(String phoneNumber){
       return entities.stream().filter(user -> user.getPhoneNumber().equals(phoneNumber)).findFirst();
    }

  /*  public Optional<User> findById (UUID id) {
         return users.stream()
                 .filter(user -> user.getId().equals(id))
                 .findFirst();
    }

    public void add (User user){
        users.add(user);
    }

    public List<User> findAll (){
        return users;
    }

    public void delete (UUID id){
        users.removeIf( user -> user.getId().equals(id));
    }
*/
    public static UserRepository getInstance(){
        return repository;
    }
}
