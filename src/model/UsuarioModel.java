/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Ing. Alex Espejel
 */
public class UsuarioModel {

    private String user_id;
    private String user_name;
    private String depto_id;
    private String user_rfc;
    private String user_pwd;
    private String user_rol;
    private String user_status;
    private String user_created;

    public UsuarioModel() {
        this.user_id = "";
        this.user_name = "";
        this.depto_id = "";
        this.user_rfc = "";
        this.user_pwd = "";
        this.user_rol = "";
        this.user_status = "";
        this.user_created = "";
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getDepto_id() {
        return depto_id;
    }

    public void setDepto_id(String depto_id) {
        this.depto_id = depto_id;
    }

    public String getUser_rfc() {
        return user_rfc;
    }

    public void setUser_rfc(String user_rfc) {
        this.user_rfc = user_rfc;
    }

    public String getUser_pwd() {
        return user_pwd;
    }

    public void setUser_pwd(String user_pwd) {
        this.user_pwd = user_pwd;
    }

    public String getUser_rol() {
        return user_rol;
    }

    public void setUser_rol(String user_rol) {
        this.user_rol = user_rol;
    }

    public String getUser_status() {
        return user_status;
    }

    public void setUser_status(String user_status) {
        this.user_status = user_status;
    }

    public String getUser_created() {
        return user_created;
    }

    public void setUser_created(String user_created) {
        this.user_created = user_created;
    }

}
