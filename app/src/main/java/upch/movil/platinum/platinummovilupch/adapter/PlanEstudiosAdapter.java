package upch.movil.platinum.platinummovilupch.adapter;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import upch.movil.platinum.platinummovilupch.R;
import upch.movil.platinum.platinummovilupch.entidades.PlanEstudios;

public class PlanEstudiosAdapter extends RecyclerView.Adapter<PlanEstudiosAdapter.RecyclerViewHolders>{

    private List<PlanEstudios> itemList;

    public PlanEstudiosAdapter( List<PlanEstudios> itemList){
        this.itemList = itemList;
    }
    @Override
    public RecyclerViewHolders onCreateViewHolder(ViewGroup viewGroup, int i) {
        View layoutView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fragment_plan_estudios, null);
        RecyclerViewHolders rcv = new RecyclerViewHolders(layoutView);
        return rcv;
    }

    @Override
    public void onBindViewHolder( RecyclerViewHolders recyclerViewHolders, int position) {

        recyclerViewHolders.descripcion.setText(""+itemList.get(position).getDescripcion());
        recyclerViewHolders.creditos.setTextColor(Color.parseColor("#689F38"));
        recyclerViewHolders.creditos.setText("Clave: " + itemList.get(position).getClave());
        recyclerViewHolders.idPlan.setText(itemList.get(position).getIdplan());
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public class RecyclerViewHolders extends RecyclerView.ViewHolder{

        public TextView descripcion;
        public TextView creditos;
        public TextView idPlan;

        public RecyclerViewHolders(View itemView) {
            super(itemView);
            descripcion = (TextView) itemView.findViewById(R.id.descripcion);
            creditos = (TextView) itemView.findViewById(R.id.creditos);
            idPlan = (TextView) itemView.findViewById(R.id.idplan);
        }
    }
}
