package com.example.crumpycat;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class CrumpyCatAdapter extends RecyclerView.Adapter<CrumpyCatAdapter.CatHolder> {
    private final List<CrumpyCat> cat;

    public CrumpyCatAdapter(List<CrumpyCat> cat) {
        this.cat = cat;
    }

    static class CatHolder extends RecyclerView.ViewHolder {
        public final ImageView image;
        public final TextView text;

        public CatHolder(View itemView) {
            super( itemView );
            image = itemView.findViewById( R.id.item_image );
            text = itemView.findViewById( R.id.item_name );
        }
    }

    @NonNull
    @Override
    public CatHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from( parent.getContext() );
        View itemView = layoutInflater.inflate( R.layout.item_cat, parent, false );
        return new CatHolder( itemView );
    }

    @Override
    public void onBindViewHolder(@NonNull CatHolder holder, int position) {
        CrumpyCat crumpyCat = cat.get( position );

        Picasso.get().load( crumpyCat.getImage() ).into( holder.image );
        holder.text.setText( crumpyCat.getName() );
    }

    @Override
    public int getItemCount() {
        return cat.size();
    }
}
