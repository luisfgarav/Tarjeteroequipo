package com.example.ppc.tarjetero_equipo;

import java.util.ArrayList;

/**
 * Created by pc on 5/10/2018.
 */

public class OrigenDeDatos {
    public ArrayList<Tarjeta> showAll() {
        ArrayList<Tarjeta> resultado = new ArrayList<Tarjeta>();

        Tarjeta uno = new Tarjeta();
        uno.imagen=("https://images-na.ssl-images-amazon.com/images/I/51zlpAsG1nL.jpg");
        uno.nombre=("The Breakfast Club");
        uno.anio=("1985");
        uno.director=("John Hughes");
        uno.id=1;
        resultado.add(uno);

        Tarjeta dos = new Tarjeta();
        dos.imagen=("https://ia.media-imdb.com/images/M/MV5BNGNhMDIzZTUtNTBlZi00MTRlLWFjM2ItYzViMjE3YzI5MjljXkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_SY1000_CR0,0,686,1000_AL_.jpg");
        dos.nombre=("Pulp Fiction");
        dos.anio=("1994");
        dos.director=("Quentin Tarantino");
        dos.id=2;
        resultado.add(dos);

        Tarjeta tres = new Tarjeta();
        tres.imagen=("http://4.bp.blogspot.com/-iZWQRZlHBrk/VqsdS7WpINI/AAAAAAAAPS0/r5hfsrxJm50/s1600/Taxi_Driver-712853056-large.jpg");
        tres.nombre=("Taxi Driver");
        tres.anio=("1976");
        tres.director=("Martin Scorsese");
        tres.id=3;
        resultado.add(tres);

        Tarjeta cuatro = new Tarjeta();
        cuatro.imagen=("https://ia.media-imdb.com/images/M/MV5BZmU0M2Y1OGUtZjIxNi00ZjBkLTg1MjgtOWIyNThiZWIwYjRiXkEyXkFqcGdeQXVyMTQxNzMzNDI@._V1_UX182_CR0,0,182,268_AL_.jpg");
        cuatro.nombre=("Back to the Future");
        cuatro.anio=("1985");
        cuatro.director=("Robert Zemeckis");
        cuatro.id=4;
        resultado.add(cuatro);

        Tarjeta cinco = new Tarjeta();
        cinco.imagen=("https://ia.media-imdb.com/images/M/MV5BNWIwODRlZTUtY2U3ZS00Yzg1LWJhNzYtMmZiYmEyNmU1NjMzXkEyXkFqcGdeQXVyMTQxNzMzNDI@._V1_UY268_CR1,0,182,268_AL_.jpg");
        cinco.nombre=("Forrest Gump");
        cinco.anio=("1994");
        cinco.director=("Robert Zemeckis");
        cinco.id=5;
        resultado.add(cinco);

        Tarjeta seis = new Tarjeta();
        seis.imagen=("https://ia.media-imdb.com/images/M/MV5BNzVlY2MwMjktM2E4OS00Y2Y3LWE3ZjctYzhkZGM3YzA1ZWM2XkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_UX182_CR0,0,182,268_AL_.jpg");
        seis.nombre=("Star Wars: Episode IV - A New Hope ");
        seis.anio=("1977");
        seis.director=("George Lucas");
        seis.id=6;
        resultado.add(seis);

        Tarjeta siete = new Tarjeta();
        siete.imagen=("https://upload.wikimedia.org/wikipedia/en/thumb/9/9b/Ferris_Bueller%27s_Day_Off.jpg/220px-Ferris_Bueller%27s_Day_Off.jpg");
        siete.nombre=("Ferris Bueller's Day Off");
        siete.anio=("1986");
        siete.director=("John Hughes");
        siete.id=7;
        resultado.add(siete);

        Tarjeta ocho = new Tarjeta();
        ocho.imagen=("https://ia.media-imdb.com/images/M/MV5BM2MyNjYxNmUtYTAwNi00MTYxLWJmNWYtYzZlODY3ZTk3OTFlXkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_UY268_CR3,0,182,268_AL_.jpg");
        ocho.nombre=("The Godfather");
        ocho.anio=("1972");
        ocho.director=("Francis Ford Coppola");
        ocho.id=8;
        resultado.add(ocho);

        Tarjeta nueve = new Tarjeta();
        nueve.imagen=("https://ia.media-imdb.com/images/M/MV5BNzQzMzJhZTEtOWM4NS00MTdhLTg0YjgtMjM4MDRkZjUwZDBlXkEyXkFqcGdeQXVyNjU0OTQ0OTY@._V1_UX182_CR0,0,182,268_AL_.jpg");
        nueve.nombre=("Blade Runner");
        nueve.anio=("1982");
        nueve.director=("Ridley Scott");
        nueve.id=9;
        resultado.add(nueve);

        Tarjeta diez = new Tarjeta();
        diez.imagen=("https://ia.media-imdb.com/images/M/MV5BZDAwYTlhMDEtNTg0OS00NDY2LWJjOWItNWY3YTZkM2UxYzUzXkEyXkFqcGdeQXVyNTA4NzY1MzY@._V1_UY268_CR4,0,182,268_AL_.jpg");
        diez.nombre=("Léon: The Professional");
        diez.anio=("1994");
        diez.director=("Luc Besson");
        diez.id=10;
        resultado.add(diez);
        return resultado;
    }
}
