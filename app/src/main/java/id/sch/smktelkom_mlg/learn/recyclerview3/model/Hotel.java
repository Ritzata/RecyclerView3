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
    public String lokasi;
    public String foto;

    public Hotel(String judul, String deskripsi, String foto, String detail, String lokasi)
    {
        this.judul=judul;
        this.deskripsi=deskripsi;
        this.detail= detail;
        this.lokasi = lokasi;
        this.foto = foto;
    }
}
