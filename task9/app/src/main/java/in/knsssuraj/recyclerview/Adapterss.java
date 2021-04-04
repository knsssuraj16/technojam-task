package in.knsssuraj.recyclerview;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.io.File;
import java.util.ArrayList;

public class Adapterss extends RecyclerView.Adapter<RecyclerView.ViewHolder>{



    private Context mContext;
    private ArrayList mEventArrayList;
    private ArrayList nameLi;
    private ArrayList desLi;

    public Adapterss(MainActivity mainActivity, ArrayList list, ArrayList nameLi, ArrayList desLi) {
        mContext=mainActivity;
        mEventArrayList=list;
        this.nameLi=nameLi;
        this.desLi=desLi;

    }

    public class WallpaperAdapterViewHolder extends RecyclerView.ViewHolder {

        ImageView image;
        TextView name, des;

        WallpaperAdapterViewHolder(View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image);
            name = itemView.findViewById(R.id.name);
            des = itemView.findViewById(R.id.des);

        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        mContext = parent.getContext();
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_for_grid_view, parent, false);

        return new WallpaperAdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        final WallpaperAdapterViewHolder cellViewHolder = (WallpaperAdapterViewHolder) holder;

//        Log.d("cdcbfdsvasv", "onBindViewHolder: "+);
        String uri=Uri.parse("android.resource://"+R.class.getPackage().getName()+"/" +mEventArrayList.get(position)).toString();
        Picasso.get().load(uri).placeholder(R.drawable.c).resize(80,80).into(cellViewHolder.image);

        cellViewHolder.name.setText(String.valueOf(nameLi.get(position)));
        cellViewHolder.des.setText(String.valueOf(desLi.get(position)));


        cellViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(mContext,FullScreenActivity.class);
                intent.putExtra("image",uri);
                intent.putExtra("name",nameLi.get(position).toString());
                intent.putExtra("des",desLi.get(position).toString());
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mEventArrayList.size();
    }
}
