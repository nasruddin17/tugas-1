/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas20;

/**
 *
 * @author UA
 */
public class Mahasiswa {
    
    public String nama;
    public String nim;
    public String kelas;
    public String jurusan;
    public String fakultas;
    public int angkatan;
    
    public Mahasiswa(String nim, String nama, String kelas, String jurusan, String fak, int ang)
    {
        this.nama = nama;
        this.nim = nim;
        this.kelas =kelas;
        this.jurusan = jurusan;
        this.fakultas = fak;
        this.angkatan = ang;
    }
}
