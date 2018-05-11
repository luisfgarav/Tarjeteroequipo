package com.example.ppc.tarjetero_equipo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by ppc on 10/05/2018.
 */

public class AdaptadorDeListaDatos extends BaseAdapter {

    public ArrayList<Tarjeta> arreglo;
    public Context context;
    public LayoutInflater inflater;

    @Override
    public int getCount() {
        return arreglo.size();
    }

    @Override
    public Object getItem(int i) {
        arreglo.get(i);
        return arreglo.get(i).id;
    }

    @Override
    public long getItemId(int i) {

        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        inflater=LayoutInflater.from(context);
        View v = inflater.inflate(R.layout.tarjeta, null);
        TextView nombr = (TextView) v.findViewById(R.id.nombre);
        nombr.setText(arreglo.get(i).nombre);
        TextView descr = (TextView) v.findViewById(R.id.descripcion);
        descr.setText(arreglo.get(i).director);
        TextView edadad = (TextView) v.findViewById(R.id.edad);
        edadad.setText(arreglo.get(i).anio);
        ImageView imagen = (ImageView) v.findViewById(R.id.imagen);
        Picasso.with(context).load(arreglo.get(i).imagen).into(imagen);
        return v;
    }
}
