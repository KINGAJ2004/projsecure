package com.secure.projsecure.controllrt;

import com.secure.projsecure.dao.UserDetailsDaoImpl;
import com.secure.projsecure.data.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
public class UserDetailsController {

    @PostMapping("/newUser")
    public UserDetails createUser(UserDetails userDetails){
        UserDetailsDaoImpl userDetailsDaoImpl = new UserDetailsDaoImpl();
        userDetailsDaoImpl.addUser(userDetails);
        return null;
    }


}
