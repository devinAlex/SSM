package sy.model;

import java.util.Date;

public class Online {
    private String id;

    private String ip;

    private Date logindatatime;

    private String loginname;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public Date getLogindatatime() {
        return logindatatime;
    }

    public void setLogindatatime(Date logindatatime) {
        this.logindatatime = logindatatime;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname == null ? null : loginname.trim();
    }
}