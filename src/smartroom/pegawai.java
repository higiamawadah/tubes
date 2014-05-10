/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package smartroom;

import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author higia
 */
public class pegawai {
    private String idPegawai;
    private String namaPegawai;
    private String status;

    public pegawai() {
    }

    public void setIdPegawai(String idPegawai) {
        this.idPegawai = idPegawai;
    }

    public void setNamaPegawai(String namaPegawai) {
        this.namaPegawai = namaPegawai;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getIdPegawai() {
        return idPegawai;
    }

    public String getNamaPegawai() {
        return namaPegawai;
    }

    public String getStatus() {
        return status;
    }
    
    public void simpanPegawai(){
        database db = new database();
        String s = "insert into pegawai values ('" + this.idPegawai + "','" + this.namaPegawai + "','" + this.status + "')";
        db.query(s);
    }
    public ResultSet getPetugas() {
        database db = new database();
        String SQLString = "SELECT * FROM pegawai";
        return db.getData(SQLString);
    }
    
    public ArrayList<pegawai> getAllPetugas(String status)
    {
        database db = new database();
        ArrayList<pegawai> daftar = new ArrayList<pegawai>();
        
        try {
            ResultSet rs = db.getData("select * from pegawai where status='"+status+"'");
            while (rs.next())
            {
                pegawai p = new pegawai();
                p.setIdPegawai(rs.getString("id_pegawai"));
                p.setNamaPegawai(rs.getString("nama_pegawai"));
                p.setStatus(rs.getString("status"));
                
                daftar.add(p);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        return daftar;
    }
    public pegawai getData(String namaPegawai, String status){
            database db = new database();
            pegawai p=new pegawai();
            ResultSet rs = db.getData("select * from pegawai where nama_pegawai='"+namaPegawai+"'");
            try {
                if (rs.first()){
                    p.setIdPegawai(rs.getString("id_pegawai"));
                    p.setNamaPegawai(rs.getString("nama_pegawai"));
                    p.setStatus(rs.getString("status"));
                }
                
                
            
        } catch (Exception e) {
        }
            return p;
    }
}
