package com.muhammad_adi_yusuf.projeksubmission1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MovieListAdapter extends BaseAdapter {
    private TextView txt_judul, txt_genre, txt_rating, txt_rilis;
    private ImageView img_poster;
    private Context context;
    private ArrayList<MovieList> movielist;

    public void setMovielist(ArrayList<MovieList> movielist) {
        this.movielist = movielist;
    }

    public MovieListAdapter(Context context) {
        this.context = context;
        movielist = new ArrayList<>();
    }


    @Override
    public int getCount() {
        return movielist.size();
    }

    @Override
    public Object getItem(int i) {
        return movielist.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view == null){
            view = LayoutInflater.from(context).inflate(R.layout.list_movie,viewGroup,false);
        }
        ViewHolder viewHolder = new ViewHolder(view);
        MovieList movielist = (MovieList) getItem(i);
        viewHolder.bind(movielist);
        return view;
    }
    private class ViewHolder {

        ViewHolder(View view) {
            txt_judul = view.findViewById(R.id.tv_judul_movie_M_A_Y);
            txt_genre = view.findViewById(R.id.tv_genre_movie_M_A_Y);
            txt_rating = view.findViewById(R.id.tv_rating_movie_M_A_Y);
            txt_rilis = view.findViewById(R.id.tv_tanggal_tayang_M_A_Y);
            img_poster = view.findViewById(R.id.iv_foto_movie_M_A_Y);
        }
        void bind(MovieList movielist) {
            txt_judul.setText(movielist.getJudul());
            txt_rating.setText(movielist.getRating());
            txt_genre.setText(movielist.getGenre());
            txt_rilis.setText(movielist.getRilis());
            img_poster.setImageResource(movielist.getGambar());
        }
    }
}
