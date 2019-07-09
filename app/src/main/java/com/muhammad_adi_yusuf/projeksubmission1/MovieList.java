package com.muhammad_adi_yusuf.projeksubmission1;

import android.os.Parcel;
import android.os.Parcelable;

public class MovieList implements Parcelable {
    private int gambar;
    private String judul, genre, rilis, deskripsi, bahasa, durasi, crew, rating;

    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }
    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }


    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getRilis() {
        return rilis;
    }

    public void setRilis(String rilis) {
        this.rilis = rilis;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getBahasa() {
        return bahasa;
    }

    public void setBahasa(String bahasa) {
        this.bahasa = bahasa;
    }

    public String getDurasi() {
        return durasi;
    }

    public void setDurasi(String durasi) {
        this.durasi = durasi;
    }

    public String getCrew() {
        return crew;
    }

    public void setCrew(String crew) {
        this.crew = crew;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.gambar);
        dest.writeString(this.judul);
        dest.writeString(this.genre);
        dest.writeString(this.rilis);
        dest.writeString(this.deskripsi);
        dest.writeString(this.bahasa);
        dest.writeString(this.durasi);
        dest.writeString(this.crew);
        dest.writeString(this.rating);
    }

    public MovieList() {
    }

    protected MovieList(Parcel in) {
        this.gambar = in.readInt();
        this.judul = in.readString();
        this.genre = in.readString();
        this.rilis = in.readString();
        this.deskripsi = in.readString();
        this.bahasa = in.readString();
        this.durasi = in.readString();
        this.crew = in.readString();
        this.rating = in.readString();
    }

    public static final Parcelable.Creator<MovieList> CREATOR = new Parcelable.Creator<MovieList>() {
        @Override
        public MovieList createFromParcel(Parcel source) {
            return new MovieList(source);
        }

        @Override
        public MovieList[] newArray(int size) {
            return new MovieList[size];
        }
    };
}
