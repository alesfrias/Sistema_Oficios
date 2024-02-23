package model;

public class OficioModel {

    private int ofi_id;
    private int depen_id;
    private String depen_name;
    private String depen_resp;
    private String ofi_asunto;
    private String ofi_fech_crea;
    private int user_id;
    private String user_name;
    private String ofi_obs;
    private String ofi_status;
    private String ofi_update;

    public OficioModel() {
        this.ofi_id = 0;
        this.depen_id = 0;
        this.depen_name = "";
        this.depen_resp = "";
        this.ofi_asunto = "";
        this.ofi_fech_crea = "";
        this.user_id = 0;
        this.user_name = "";
        this.ofi_obs = "";
        this.ofi_status = "";
        this.ofi_update = "";
    }

    public int getOfi_id() {
        return ofi_id;
    }

    public void setOfi_id(int ofi_id) {
        this.ofi_id = ofi_id;
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

    public String getOfi_asunto() {
        return ofi_asunto;
    }

    public void setOfi_asunto(String ofi_asunto) {
        this.ofi_asunto = ofi_asunto;
    }

    public String getOfi_fech_crea() {
        return ofi_fech_crea;
    }

    public void setOfi_fech_crea(String ofi_fech_crea) {
        this.ofi_fech_crea = ofi_fech_crea;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getOfi_obs() {
        return ofi_obs;
    }

    public void setOfi_obs(String ofi_obs) {
        this.ofi_obs = ofi_obs;
    }

    public String getOfi_status() {
        return ofi_status;
    }

    public void setOfi_status(String ofi_status) {
        this.ofi_status = ofi_status;
    }

    public String getOfi_update() {
        return ofi_update;
    }

    public void setOfi_update(String ofi_update) {
        this.ofi_update = ofi_update;
    }

}
