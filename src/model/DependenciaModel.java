package model;

public class DependenciaModel {

    private int depen_id;
    private String depen_name;
    private String depen_resp;
    private int depen_status;
    private String depen_created;

    public DependenciaModel() {
        this.depen_id = 0;
        this.depen_name = "";
        this.depen_resp = "";
        this.depen_status = 0;
        this.depen_created = "";
    }

    public int getDepen_id() {
        return depen_id;
    }

    public void setDepen_id(int depen_id) {
        this.depen_id = depen_id;
    }

    public String getDepen_name() {
        return depen_name;
    }

    public void setDepen_name(String depen_name) {
        this.depen_name = depen_name;
    }

    public String getDepen_resp() {
        return depen_resp;
    }

    public void setDepen_resp(String depen_resp) {
        this.depen_resp = depen_resp;
    }

    public int getDepen_status() {
        return depen_status;
    }

    public void setDepen_status(int depen_status) {
        this.depen_status = depen_status;
    }

    public String getDepen_created() {
        return depen_created;
    }

    public void setDepen_created(String depen_created) {
        this.depen_created = depen_created;
    }

}
