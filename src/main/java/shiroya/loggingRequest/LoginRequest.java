package shiroya.loggingRequest;

import lombok.Data;

@Data
public class LoginRequest {

    private String userId;
    private String password;

    public String getUserId(){
        return this.userId;
    }
    public void setUserId(String userId){
        this.userId = userId;
    }

    public String getPassword(){
        return this.password;
    }
    public void setPassword(String password){
        this.password = password;
    }
}

