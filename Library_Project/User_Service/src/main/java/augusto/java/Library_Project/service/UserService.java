package augusto.java.Library_Project.service;

import augusto.java.Library_Project.dto.UserDto;
import augusto.java.Library_Project.entity.UserEntity;
import augusto.java.Library_Project.input.UserInput;
import augusto.java.Library_Project.mapper.UserMapper;
import augusto.java.Library_Project.repository.UserRepository;

public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public UserDto findUserByCPF(String cpf){
        return UserMapper.map(userRepository.findById(cpf).get());
    }

    public Boolean insertUser(UserInput userInput){
        userRepository.insert(UserMapper.map(userInput));
        return true;
    }
}
