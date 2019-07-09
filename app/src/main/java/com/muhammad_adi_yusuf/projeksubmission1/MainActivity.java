package com.muhammad_adi_yusuf.projeksubmission1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private String[] data_judul_movie, data_rilis_movie, data_genre_movie, data_rating_movie, data_bahasa_movie, data_durasi_movie, data_crew_movie, data_deskripsi_movie;
    private TypedArray data_poster_movie;
    private MovieListAdapter adapter;
    private ArrayList<MovieList> movielist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adapter = new MovieListAdapter(this);
        ListView listView = findViewById(R.id.lv_movieM_A_Y);
        listView.setAdapter(adapter);

        inisialisasi_array();
        additem();

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int posisi_item, long l) {

                MovieList item = movielist.get(posisi_item);
                Intent activity_baru = new Intent(MainActivity.this, DetailMovieMayActivity.class);
                activity_baru.putExtra(DetailMovieMayActivity.EXTRA_MOVIE_MAY, item);
                startActivity(activity_baru);

                Toast.makeText(MainActivity.this, movielist.get(posisi_item).getJudul(), Toast.LENGTH_SHORT).show();

            }
        });
    }

    private void additem(){
        movielist = new ArrayList<>();

        for (int i = 0; i < data_judul_movie.length; i++){
            MovieList movie = new MovieList();
            movie.setGambar(data_poster_movie.getResourceId(i,1));
            movie.setJudul(data_judul_movie[i]);
            movie.setRating(data_rating_movie[i]);
            movie.setRilis(data_rilis_movie[i]);
            movie.setGenre(data_genre_movie[i]);
            movie.setBahasa(data_bahasa_movie[i]);
            movie.setDurasi(data_durasi_movie[i]);
            movie.setCrew(data_crew_movie[i]);
            movie.setDeskripsi(data_deskripsi_movie[i]);
            movielist.add(movie);
        }
        adapter.setMovielist(movielist);
    }

    private void inisialisasi_array(){
        data_judul_movie = getResources().getStringArray(R.array.data_judul_movie);
        data_genre_movie = getResources().getStringArray(R.array.data_genre_movie);
        data_rating_movie = getResources().getStringArray(R.array.data_rating_movie);
        data_rilis_movie = getResources().getStringArray(R.array.data_rilis_movie);
        data_bahasa_movie = getResources().getStringArray(R.array.data_bahasa_movie);
        data_durasi_movie = getResources().getStringArray(R.array.data_durasi_movie);
        data_crew_movie = getResources().getStringArray(R.array.data_crew_movie);
        data_deskripsi_movie = getResources().getStringArray(R.array.data_deskripsi_movie);
        data_poster_movie = getResources().obtainTypedArray(R.array.data_poster_movie);


    }
}
