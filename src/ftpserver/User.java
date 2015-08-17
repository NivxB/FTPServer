/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ftpserver;

import java.util.ArrayList;

/**
 *
 * @author Luis Martinez
 */
public class User {
    private String fullname, username, password, description;
    private ArrayList<String> write_permissions;
    private ArrayList<String> read_permissions;
    
    public User(String username){
        this.username = username;
    }
    
    public User(String fullname, String username, String password, String description) {
        write_permissions = new ArrayList();
        read_permissions = new ArrayList();
        this.fullname = fullname;
        this.username = username;
        this.password = password;
        this.description = description;
        
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public void addWritePermission(String username) {
        write_permissions.add(username);
    }
    
    public void addReadPermission(String username) {
        read_permissions.add(username);
    }
    
    public ArrayList<String> getWritePermissions() {
        return write_permissions;
    }
    
    public ArrayList<String> getReadPermissions() {
        return read_permissions;
    }
}
