package augusto.java.Library_Project.api;

import augusto.java.Library_Project.input.UserInput;
import augusto.java.Library_Project.mapper.UserMapper;
import augusto.java.Library_Project.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class UserApi {

    private UserService userService;

    public UserApi(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/list")
    public ResponseEntity<?> addUser(@PathVariable("user")UserInput userInput){
        return ResponseEntity.ok(userService.insertUser(userInput));
    }

    @GetMapping("/find")
    public ResponseEntity<?> findUser(@PathVariable("cpf") String cpf){
        return ResponseEntity.ok(UserMapper.map(userService.findUserByCPF(cpf)));
    }

    public ResponseEntity<?> deleteUser(){
        return ResponseEntity.ok();
    }
}
