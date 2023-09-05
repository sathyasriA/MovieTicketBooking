package com.cinema_package.cinema_project.user;

import com.cinema_package.cinema_project.CinemaProjectApplication;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class UserService {

    private final UserRepository userRepository;
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @PostMapping
    public void addUser(@RequestBody CinemaProjectApplication.UsersRequest request) {
        Users user = new Users();
        user.setFirstName(request.firstName());
        user.setLastName(request.lastName());
        user.setUserName(request.userName());
        user.setPassword(request.password());
        userRepository.save(user);
    }

    public Users getUser(String userName) throws Exception{
        try {
            return userRepository.findByUserName(userName);
        }catch(Exception ex){
            throw ex;
        }
    }

    public String login(CinemaProjectApplication.LoginRequest user) throws Exception{
        try {
            Users userData = getUser(user.userName());
            if(userData.getPassword().equals(user.password())){
                return "200";
            }
            else {
                return "400";
            }
        }catch(Exception ex){
            throw ex;
        }
    }
}