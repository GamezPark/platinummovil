package upch.movil.platinum.platinummovilupch.adapter;


import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import upch.movil.platinum.platinummovilupch.CircleTransform;
import upch.movil.platinum.platinummovilupch.R;
import upch.movil.platinum.platinummovilupch.entidades.Alumno;


public class ListaAlumnosAdapter extends RecyclerView.Adapter<ListaAlumnosAdapter.StudentViewHolder>{

    private List<Alumno> itemList;
    Context context;
    public ListaAlumnosAdapter( List<Alumno> itemList,  Context contex){
        this.context=contex;
        this.itemList = itemList;
    }


    @Override
    public ListaAlumnosAdapter.StudentViewHolder onCreateViewHolder( ViewGroup viewGroup, int viewType) {
        return new StudentViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fragment_lista_alumnos, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(ListaAlumnosAdapter.StudentViewHolder holder, int position) {
        if (holder instanceof StudentViewHolder) {
            Alumno singleItem = (Alumno) itemList.get(position);

            Picasso.get().load("https://platinum.upchiapas.edu.mx/alumnos/images/fotos/m"+singleItem.getMatricula()+".jpg").error(R.drawable.user_sin_foto)
                    .transform(new CircleTransform()).into(((StudentViewHolder) holder).image);

            ((StudentViewHolder) holder).nombre.setText(singleItem.getNombre());

            String cadena = itemList.get(position).getEstatus();
            char c  = cadena.charAt(0);
            if(c == 'B'){
                ((StudentViewHolder) holder).estatus.setTextColor(Color.RED);

            }else{
                ((StudentViewHolder) holder).estatus.setTextColor(Color.parseColor("#689F38"));
            }
            ((StudentViewHolder) holder).estatus.setText(itemList.get(position).getEstatus() );
            ((StudentViewHolder) holder).matricula.setText("Matricula: "+itemList.get(position).getMatricula() );
            ((StudentViewHolder) holder).M.setText(singleItem.getMatricula());
        }
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }


    public class StudentViewHolder extends RecyclerView.ViewHolder{

        public TextView matricula;
        public TextView nombre;
        public TextView M;
        public ImageView image;
        public TextView estatus;

        public StudentViewHolder(View itemView) {
            super(itemView);

            matricula = (TextView) itemView.findViewById(R.id.matricula);
            nombre = (TextView) itemView.findViewById(R.id.nombre);
            estatus = (TextView) itemView.findViewById(R.id.estatus);
            M = (TextView) itemView.findViewById(R.id.M);
            image = (ImageView) itemView.findViewById(R.id.list_avatar);
        }
    }
}
