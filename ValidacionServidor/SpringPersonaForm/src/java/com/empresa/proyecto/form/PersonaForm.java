package com.empresa.proyecto.form;

import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class PersonaForm {

    @NotEmpty(message = "Ingrese username")
    private String username;
    
    @NotEmpty(message = "Ingrese password")
    @Size(min=5, max=10, message = "Ingrese password [5-10] caracteres")
    private String password;
    
    @NotEmpty(message = "Ingrese email")
    @Email(message = "Ingrese un correo de tipo: correo@dominio.com")
    private String email;

    public PersonaForm() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
