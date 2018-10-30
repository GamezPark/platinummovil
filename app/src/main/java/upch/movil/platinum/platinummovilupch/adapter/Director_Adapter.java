package upch.movil.platinum.platinummovilupch.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import upch.movil.platinum.platinummovilupch.docentes.Lista_Alumnos;
import upch.movil.platinum.platinummovilupch.docentes.Lista_Maestros;
import upch.movil.platinum.platinummovilupch.docentes.Plan_Estudios;

public class Director_Adapter extends FragmentPagerAdapter{

    //Arreglo de cadenas que serán los títulos de los fragmentos
    protected static final String[] containt = new String[] {"", "", ""};
    // protected static final String[] containt = new String[] { "Plan de Estudios", "Docentes", "Alumnos", "Grupos", "Mis Grupos","Tutorias" };
    //Contador de pestañas|fragmentos
    private int count = containt.length;

    //Constructor que requiere un adminsitrador de fragmentos
    public Director_Adapter(FragmentManager fm) {
        super(fm);
    }

    //Método sobreescrito que retorna el fragmento solicitado de acuerdo a una posición
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return Plan_Estudios.newInstance();
            case 1:
                return Lista_Maestros.newInstance();
            case 2:
                return Lista_Alumnos.newInstance();
            default:
                return null;
        }
    }

    //Método sobreescrito que retorna el título del fragmento de acuerdo a una posición
    @Override
    public CharSequence getPageTitle(int position) {
        return containt[position % containt.length];
    }

    //Método sobreescrito que retorna la cantidad de fragmentos|pestañas
    @Override
    public int getCount() {
        return count;
    }

}
