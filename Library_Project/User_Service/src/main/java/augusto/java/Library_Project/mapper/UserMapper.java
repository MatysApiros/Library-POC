package augusto.java.Library_Project.mapper;

import augusto.java.Library_Project.dto.UserDto;
import augusto.java.Library_Project.entity.UserEntity;
import augusto.java.Library_Project.input.UserInput;
import augusto.java.Library_Project.output.UserOutput;

public class UserMapper {

    public static UserDto map(UserEntity userEntity){
        UserDto userDto= new UserDto();

        userDto.setCpf(userEntity.getCpf());
        userDto.setName(userEntity.getName());
        userDto.setEmail(userEntity.getEmail());
        return userDto;
    }

    public static UserOutput map(UserDto userDto){
        UserOutput userOutput = new UserOutput();

        userOutput.setCpf(userDto.getCpf());
        userOutput.setName(userDto.getName());
        userOutput.setEmail(userDto.getEmail());
        return userOutput;
    }

    public static UserEntity map(UserInput userInput){
        UserEntity userEntity = new UserEntity();

        userEntity.setCpf(userInput.getCpf());
        userEntity.setName(userInput.getName());
        userEntity.setEmail(userInput.getEmail());
        return userEntity;
    }
}
