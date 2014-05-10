/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package smartroom;

import java.sql.*;

/**
 *
 * @author higia
 */
public class ruangan {
    private String idRuangan;
    private String namaRuangan;
    private String kategori;

    public ruangan() {
    }

    public String getIdRuangan() {
        return idRuangan;
    }

    public String getKategori() {
        return kategori;
    }

    public String getNamaRuangan() {
        return namaRuangan;
    }

    public void setIdRuangan(String idRuangan) {
        this.idRuangan = idRuangan;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public void setNamaRuangan(String namaRuangan) {
        this.namaRuangan = namaRuangan;
    }
    
    public void simpanRuangan() {
        database db = new database();
        String s = "insert into ruangan values ('" + this.idRuangan + "','" + this.namaRuangan + "','" + this.kategori +"')";
        db.query(s);
    }

    public ResultSet getRuangan() {
        database db = new database();
        String SQLString = "SELECT * FROM ruangan";
        return db.getData(SQLString);
    }
    
}
