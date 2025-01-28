package com.formvalidation;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class UserData {

    @NotBlank(message = "notNull")
    @Size(min = 3,max = 12,message = "Size 3 - 12 letters")
    private String userName;

    @Email(regexp = "^[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?$", message="Invalid Email")
    private String email;

    @AssertTrue(message = "Must Agree terms & conditions")
    private boolean agreed;
    
    //Getters And Setters
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isAgreed() {
        return agreed;
    }
    public void setAgreed(boolean agreed) {
        this.agreed = agreed;
    }


    

    //toString() Method
    @Override
    public String toString() {
        return "UserData [userName=" + userName + ", email=" + email + "]";
    }
}
