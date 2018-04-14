package co.edu.konradlorenz.cardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.content.Intent;

public class AlbumDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ListView lista;
        String [][] datos={
                {"la quemona","4;45"},
        {"la cucaracha","3;00"},
        {"la quiero a ella","4;45"},
        {"ella es mi sol","4;45"},
                {"vuelve","2;20"},
                {"te extraño","5;45"},}
        ;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album_detail);
        ImageView img = findViewById(R.id.imagenAlbum);
        lista= findViewById(R.id.song_list);
        Intent intent= getIntent();
        Bundle b =intent.getExtras();
        lista.setAdapter(new cancionList(this ,datos));
        if(b!=null){

            img.setImageResource(b.getInt("IMG"));
        }
    }
}
