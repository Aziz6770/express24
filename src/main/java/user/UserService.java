package user;

import java.util.Optional;

public class UserService {
    private static final UserService userService = new UserService();
    private static final UserRepository userRepository= UserRepository.getInstance();

    public boolean create(User user){
        Optional<User> existingUser = userRepository.findUserByPhoneNumber(user.getPhoneNumber());
        if(existingUser.isPresent()){
            return false;
        }
        userRepository.add(user);
        return true;
    }

    public static UserService getInstance(){
        return userService;
    }


}
