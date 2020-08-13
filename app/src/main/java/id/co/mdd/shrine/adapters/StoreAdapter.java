package id.co.mdd.shrine.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import id.co.mdd.shrine.R;
import id.co.mdd.shrine.models.StoreModel;

public class StoreAdapter extends RecyclerView.Adapter<StoreAdapter.ViewHolder> {

    private ArrayList<StoreModel> store = new ArrayList<>();


    public void setStore(ArrayList store) {
        this.store = store;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bindData(store.get(position));
    }

    @Override
    public int getItemCount() {
        return store.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvTitleHead, tvPrice;
        ImageView ivImage;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);


            tvPrice = itemView.findViewById(R.id.tvPrice);
            tvPrice = itemView.findViewById(R.id.tvTitleHead);
            ivImage = itemView.findViewById(R.id.image1);
        }

        public void bindData(StoreModel storeModel) {
            tvPrice.setText(String.valueOf(storeModel.getPrice()));
            tvTitleHead.setText(storeModel.getTitle());
            Picasso.get().load(storeModel.getImage()).into(ivImage);

        }
    }
}
