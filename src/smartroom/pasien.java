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
public class pasien {

    private String idPasien;
    private String namaPasien;
    private String riwayat;
    private String alamat;

    public pasien() {
    }

    public String getAlamat() {
        return alamat;
    }

    public String getIdPasien() {
        return idPasien;
    }

    public String getNamaPasien() {
        return namaPasien;
    }

    public String getRiwayat() {
        return riwayat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setIdPasien(String idPasien) {
        this.idPasien = idPasien;
    }

    public void setNamaPasien(String namaPasien) {
        this.namaPasien = namaPasien;
    }

    public void setRiwayat(String riwayat) {
        this.riwayat = riwayat;
    }

    public void simpanPasien() {
        database db = new database();
        String s = "insert into pasien values ('" + this.idPasien + "','" + this.namaPasien + "','" + this.riwayat + "','" + this.alamat + "')";
        db.query(s);
    }

    public ResultSet getPetugas() {
        database db = new database();
        String SQLString = "SELECT * FROM pasien";
        return db.getData(SQLString);
    }
}
