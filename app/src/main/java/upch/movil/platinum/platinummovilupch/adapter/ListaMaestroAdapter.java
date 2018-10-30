
package upch.movil.platinum.platinummovilupch.adapter;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import upch.movil.platinum.platinummovilupch.R;
import upch.movil.platinum.platinummovilupch.entidades.Maestro;

public class ListaMaestroAdapter extends RecyclerView.Adapter<ListaMaestroAdapter.RecyclerViewHolders> {

    private List<Maestro> itemList;

    public ListaMaestroAdapter( List<Maestro> itemList){
        this.itemList = itemList;
    }
    @Override
    public ListaMaestroAdapter.RecyclerViewHolders onCreateViewHolder(ViewGroup viewGroup, int i) {
        View layoutView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fragment_lista_maestros, null);
        ListaMaestroAdapter.RecyclerViewHolders rcv = new ListaMaestroAdapter.RecyclerViewHolders(layoutView);
        return rcv;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolders recyclerViewHolders, int position) {

        recyclerViewHolders.divisionAcademica.setText(""+itemList.get(position).getDivisionAcademica());
        recyclerViewHolders.nombre.setText("" + itemList.get(position).getNombre());
        recyclerViewHolders.usuario.setText("" + itemList.get(position).getUsuario());
        recyclerViewHolders.idusuario.setText(itemList.get(position).getIddocente());
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }


    public class RecyclerViewHolders extends RecyclerView.ViewHolder{

        public TextView divisionAcademica;
        public TextView nombre;
        public TextView usuario;
        public TextView idusuario;

        public RecyclerViewHolders(View itemView) {
            super(itemView);
            divisionAcademica = (TextView) itemView.findViewById(R.id.divisionAcademica);
            nombre = (TextView) itemView.findViewById(R.id.nombre);
            usuario = (TextView) itemView.findViewById(R.id.usuario);
            idusuario = (TextView) itemView.findViewById(R.id.M);
        }
    }
}
