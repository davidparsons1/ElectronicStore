package entity;

import javax.persistence.*;
import javax.xml.bind.annotation.*;

@XmlRootElement
@Entity
public class Admin {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    int id;

    String username;
    String password;

    public Admin( ) {

    }

    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @XmlElement
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @XmlElement
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @XmlElement
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}