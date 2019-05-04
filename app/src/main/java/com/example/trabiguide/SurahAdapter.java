package com.example.trabiguide;

    //only for recycleView, It will bind all the products

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SurahAdapter extends RecyclerView.Adapter<SurahAdapter.SurahHolder> {

    ArrayList<SurahInfo> Suras;
    Context context;

    OnItemClickListner onItemClickListener;

    SurahAdapter(Context context,ArrayList<SurahInfo> Suras){
        this.context = context;
        this.Suras = Suras;
    }

    public interface OnItemClickListner{
        void onItemClick(Button b, View v, SurahInfo obj, int position);
    }

    public void setOnItemClickListener(OnItemClickListner onItemClickListener){
        this.onItemClickListener = onItemClickListener;
    }

    @NonNull
    @Override
    public SurahHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View myView = LayoutInflater.from(context).inflate(R.layout.row_surah,viewGroup,false);
        return new SurahHolder(myView);
    }

    @Override
    public void onBindViewHolder(@NonNull final SurahHolder holder, final int position) {
        final SurahInfo c = Suras.get(position);
        holder.surahlist.setText(c.SurahList);
        holder.surahname.setText(c.SurahName);
        holder.btnAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onItemClickListener != null){
                    onItemClickListener.onItemClick(holder.btnAction,v,c,position);
                }
            }
        });
    }


    @Override
    public int getItemCount() {
        return Suras.size();
    }

    public class SurahHolder extends RecyclerView.ViewHolder {

        TextView surahlist,surahname;
        Button btnAction;

        public SurahHolder(@NonNull View itemView) {
            super(itemView);
            surahlist= (TextView)itemView.findViewById(R.id.surahlist);
            surahname= (TextView)itemView.findViewById(R.id.surahName);

            btnAction = (Button)itemView.findViewById(R.id.playButton);
        }
    }
}
