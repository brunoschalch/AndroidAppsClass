package android.itesm.edu.pokemon.adapters;

import android.itesm.edu.pokemon.R;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class PokeRecyclerAdapter extends RecyclerView.ViewHolder {

    TextView id, name, artist;
    ImageView image;

    public PokeRecyclerAdapter(@NonNull View itemView) {
        super(itemView);
        id = itemView.findViewById(R.id.id_card);
        name = itemView.findViewById(R.id.card_name);
        artist = itemView.findViewById(R.id.author_card);
    }
}

public class PokeRecordHolder extends RecyclerView.ViewHolder {

    TextView id, name, artist;
    ImageView image;

    public PokeRecordHolder(@NonNull View itemView) {
        super(itemView);
        id = itemView.findViewById(R.id.id_card);
        name = itemView.findViewById(R.id.card_name);
        artist = itemView.findViewById(R.id.author_card);
    }
}