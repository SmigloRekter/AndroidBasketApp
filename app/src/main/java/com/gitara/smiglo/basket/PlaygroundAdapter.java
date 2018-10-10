package com.gitara.smiglo.basket;

import android.app.ActivityOptions;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.util.Pair;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.google.gson.Gson;
import com.squareup.picasso.Cache;
import com.squareup.picasso.Picasso;

import java.io.UnsupportedEncodingException;
import java.util.List;

import butterknife.BindView;

public class PlaygroundAdapter extends RecyclerView.Adapter<PlaygroundAdapter.ViewHolder> {


    private List<Playground> playgrounds;
    Main2Activity activity;

    public PlaygroundAdapter(List<Playground> playgrounds,Main2Activity activity) {
        this.playgrounds = playgrounds;
        this.activity=activity;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cell_title_layout, parent, false);

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.text.setText(playgrounds.get(position).getName());
        holder.activity=activity;
        Picasso.get().load(playgrounds.get(position).getImage()).into(holder.imageView2);
        holder.localization.setText(playgrounds.get(position).getAddress());
        holder.court=playgrounds.get(position);



    }

    @Override
    public int getItemCount() {
        return playgrounds.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case

        public Playground court;
        public TextView text;
        public TextView localization;
        public ImageView imageView;
        public ImageView imageView2;
        public TextView contentRequestBtn;
        public Main2Activity activity;



        public ViewHolder(final View itemView) {
            super(itemView);
            text=(TextView) itemView.findViewById(R.id.textView3);
            imageView2=(ImageView) itemView.findViewById(R.id.imageView2);
            localization=(TextView) itemView.findViewById(R.id.textView4);
            itemView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(itemView.getContext(),Main3Activity.class);


                Pair<View, String> p1 = Pair.create((View)imageView2, "robot");
                Pair<View, String> p2 = Pair.create((View)text, "robot2");
                Pair<View, String> p3 = Pair.create((View)localization, "robot3");
                ActivityOptionsCompat options = ActivityOptionsCompat.
                        makeSceneTransitionAnimation(activity, p1, p2,p3);
                /*ActivityOptions options =

                        ActivityOptions.makeSceneTransitionAnimation(activity,
                                imageView2,   // Starting view
                                "robot"    // The String
                        );*/

                intent.putExtra("court",(new Gson().toJson(court)));

                itemView.getContext().startActivity(intent,options.toBundle());
            }
        });
        }
    }

}
