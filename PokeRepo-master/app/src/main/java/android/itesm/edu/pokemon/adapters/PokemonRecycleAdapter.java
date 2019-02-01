package android.itesm.edu.pokemon.adapters;

import android.content.Context;
import android.itesm.edu.pokemon.R;
import android.itesm.edu.pokemon.model.PokeCard;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.request.RequestOptions;

import java.util.List;

public class PokemonRecycleAdapter
        extends RecyclerView.Adapter<PokemonRecycleAdapter.PokeRecordHolder>{

    private Context context;
    private List<PokeCard> cards;
    RequestOptions options;

    public PokemonRecycleAdapter(Context context, List<PokeCard> cards) {
        this.context = context;
        this.cards = cards;
        options = new RequestOptions().centerCrop()
                .placeholder(R.drawable.load_card).error(R.drawable.load_card);
    }

    @NonNull
    @Override
    public PokeRecordHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view;
        LayoutInflater inflater = LayoutInflater.from(context);
        view = inflater.inflate(
                R.layout.poke_card_item,viewGroup,
                false);
        final PokeRecordHolder pokeRecordHolder
                = new PokeRecordHolder(view);

        return pokeRecordHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull PokeRecordHolder pokeRecordHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class PokeRecordHolder extends RecyclerView.ViewHolder{

        TextView id, name, artist;
        ImageView image;

        public PokeRecordHolder(@NonNull View itemView) {
            super(itemView);
            id = itemView.findViewById(R.id.id_card);
            name = itemView.findViewById(R.id.card_name);
            artist = itemView.findViewById(R.id.author_card);
            image = itemView.findViewById(R.id.card);
        }
    }
}
