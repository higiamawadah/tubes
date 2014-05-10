package smartroom;

import java.sql.ResultSet;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author higia
 */
public class petugas {
    private String idPetugas;
    private String namaPetugas;
    private String username;
    private String password;
    
    public petugas(){
    }

    public String getIdPetugas() {
        return idPetugas;
    }

    public String getNamaPetugas() {
        return namaPetugas;
    }


    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public void setIdPetugas(String idPetugas) {
        this.idPetugas = idPetugas;
    }

    public void setNamaPetugas(String namaPetugas) {
        this.namaPetugas = namaPetugas;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    public void simpanPetugas(){
        database db = new database();
        String s="insert into petugas values('"+this.idPetugas+"','"+this.namaPetugas+"','"+this.username+"','"+this.password+"')";
        db.query(s);
    }
    public ResultSet getPetugas(){
        database db = new database();
        String SQLString = "SELECT * FROM petugas";
        return db.getData(SQLString);
    }
    
}
