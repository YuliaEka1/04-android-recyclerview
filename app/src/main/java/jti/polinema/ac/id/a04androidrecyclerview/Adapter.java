package jti.polinema.ac.id.a04androidrecyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.PlayerViewHolder>{
    private ArrayList<Model> dataList;

    public Adapter(ArrayList<Model> dataList) {
        this.dataList = dataList;
    }
    @NonNull
    @Override
    public Adapter.PlayerViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup , int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View view = layoutInflater.inflate(R.layout.listview, viewGroup, false);
        return new PlayerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.PlayerViewHolder holder, int i) {
        holder.txtNama.setText(dataList.get(i).getNama());
        holder.txtAbsen.setText(dataList.get(i).getAbsen());
        holder.txtNim.setText(String.valueOf(dataList.get(i).getNim()));

    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class PlayerViewHolder extends RecyclerView.ViewHolder {
        private TextView txtNama, txtAbsen, txtNim;

        public PlayerViewHolder(@NonNull View itemView) {
            super(itemView);
            txtNama = (TextView) itemView.findViewById(R.id.nama);
            txtAbsen = (TextView) itemView.findViewById(R.id.absen);
            txtNim = (TextView) itemView.findViewById(R.id.nim);
        }

    }
}
