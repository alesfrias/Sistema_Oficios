package model;

public class DepartamentoModel {

    private String depto_id;
    private String depto_name;
    private String depto_status;
    private String depto_create;

    public DepartamentoModel() {
        this.depto_id = "";
        this.depto_name = "";
        this.depto_status = "";
        this.depto_create = "";
    }

    public String getDepto_id() {
        return depto_id;
    }

    public void setDepto_id(String depto_id) {
        this.depto_id = depto_id;
    }

    public String getDepto_name() {
        return depto_name;
    }

    public void setDepto_name(String depto_name) {
        this.depto_name = depto_name;
    }

    public String getDepto_status() {
        return depto_status;
    }

    public void setDepto_status(String depto_status) {
        this.depto_status = depto_status;
    }

    public String getDepto_create() {
        return depto_create;
    }

    public void setDepto_create(String depto_create) {
        this.depto_create = depto_create;
    }

}
