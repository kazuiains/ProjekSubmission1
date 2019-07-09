package com.muhammad_adi_yusuf.projeksubmission1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailMovieMayActivity extends AppCompatActivity {

    public static final String EXTRA_MOVIE_MAY = "extra_movie_may";

    TextView tv_djudul, tv_dgenre, tv_drilis, tv_ddeskripsi, tv_dbahasa, tv_ddurasi, tv_dcrew, tv_drating;
    ImageView iv_dposter, iv_bdposter ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_movie_may);

        tv_djudul       = findViewById(R.id.tv_detail_judul);
        tv_dgenre       = findViewById(R.id.tv_detail_genre);
        tv_drilis       = findViewById(R.id.tv_detail_rilis);
        tv_ddeskripsi   = findViewById(R.id.tv_detail_deskripsi);
        tv_dbahasa      = findViewById(R.id.tv_detail_bahasa);
        tv_ddurasi      = findViewById(R.id.tv_detail_durasi);
        tv_dcrew        = findViewById(R.id.tv_detail_crew);
        tv_drating      = findViewById(R.id.tv_detail_rate);

        iv_dposter      = findViewById(R.id.iv_detail_poster);
        iv_bdposter      = findViewById(R.id.iv_detail_background_poster);


        MovieList film_detail = getIntent().getParcelableExtra(EXTRA_MOVIE_MAY);
        tv_djudul.setText(film_detail.getJudul());
        tv_dgenre.setText(film_detail.getGenre());
        tv_drilis.setText(film_detail.getRilis());
        tv_ddeskripsi.setText(film_detail.getDeskripsi());
        tv_dbahasa.setText(film_detail.getBahasa());
        tv_ddurasi.setText(film_detail.getDurasi());
        tv_dcrew.setText(film_detail.getCrew());
        tv_drating.setText(film_detail.getRating());
        iv_dposter.setImageResource(film_detail.getGambar());
        iv_bdposter.setImageResource(film_detail.getGambar());


    }
}
