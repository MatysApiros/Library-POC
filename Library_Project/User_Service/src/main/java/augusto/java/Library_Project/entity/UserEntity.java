package augusto.java.Library_Project.entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "UserDB")
public class UserEntity {

    @Id
    private String cpf;
    private String name;
    private String email;

    public UserEntity(String cpf, String name, String email) {
        this.cpf = cpf;
        this.name = name;
        this.email = email;
    }

    public UserEntity() {
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
