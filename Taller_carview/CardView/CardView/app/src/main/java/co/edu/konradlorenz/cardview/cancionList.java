package co.edu.konradlorenz.cardview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class cancionList extends BaseAdapter {
    public static LayoutInflater inflater = null;

    Context context;
    String [][] datos;
    int[] img;

    public cancionList(Context context, String[][] datos) {
        this.context = context;
        this.datos = datos;

        inflater=(LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return datos.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        final View vista= inflater.inflate(R.layout.list_songs, null);
        TextView title = (TextView) vista.findViewById(R.id.hihi);
        TextView count = (TextView) vista.findViewById(R.id.tiempo);
        ImageView foto = (ImageView) vista.findViewById(R.id.disco);

        title.setText(datos[i][0]);
        count.setText(datos[i][1]);
        foto.setImageResource(R.drawable.disco);
        return vista;
    }
}
