package upch.movil.platinum.platinummovilupch.docentes;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import upch.movil.platinum.platinummovilupch.R;
import upch.movil.platinum.platinummovilupch.Services;
import upch.movil.platinum.platinummovilupch.adapter.ListaAlumnosAdapter;
import upch.movil.platinum.platinummovilupch.entidades.Alumno;
import upch.movil.platinum.platinummovilupch.entidades.Catalogo;


public class Lista_Alumnos extends Fragment {

    private OnFragmentInteractionListener mListener;
    private RecyclerView recyclerView;
    List<Alumno> listaAlumnos = new ArrayList<>();
    private ListaAlumnosAdapter adapter;

    public Lista_Alumnos() {
        // Required empty public constructor
    }

    public static final Lista_Alumnos newInstance() {
        return new Lista_Alumnos();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.recyclerview_lista_alumnos, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.my_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));

        Retrofit retrofit = new Retrofit.Builder().baseUrl(Services.baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        Services service = retrofit.create(Services.class);

        Call<Catalogo> lista = service.getListaAlumnos("80");

        lista.enqueue(new Callback<Catalogo>() {
            @Override
            public void onResponse(Call<Catalogo> call, Response<Catalogo> response) {
                if(response.isSuccessful()){
                    Toast.makeText(getActivity(),"Si", Toast.LENGTH_LONG).show();
                    Catalogo cat = response.body();

                    listaAlumnos = cat.alumnos;
                    adapter = new ListaAlumnosAdapter(listaAlumnos, getActivity());
                    recyclerView.setAdapter(adapter);
                    adapter.notifyDataSetChanged();
                }

            }

            @Override
            public void onFailure(Call<Catalogo> call, Throwable t) {
                Toast.makeText(getActivity(),"No"+ t, Toast.LENGTH_LONG).show();
                Log.d("aqui", ""+t);
            }


        });
        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }


    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
