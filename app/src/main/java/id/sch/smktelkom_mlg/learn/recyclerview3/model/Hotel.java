package id.sch.smktelkom_mlg.learn.recyclerview3.model;

import android.graphics.drawable.Drawable;

import java.io.Serializable;

/**
 * Created by LENOVO Z40-75 on 02/11/2016.
 */
public class Hotel implements Serializable{
    public String judul;
    public String deskripsi;
    public String detail;
    public String foto;
    public String lokasi;

    public Hotel(String judul, String deskripsi, String detail, String lokasi, String foto)
    {
        this.judul=judul;
        this.deskripsi=deskripsi;
        this.detail= detail;
        this.foto = foto;
        this.lokasi = lokasi;
    }
}
