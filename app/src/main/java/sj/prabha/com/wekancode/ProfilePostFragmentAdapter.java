package sj.prabha.com.wekancode;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by prabha on 21/4/17.
 */
public class ProfilePostFragmentAdapter extends RecyclerView.Adapter<ProfilePostFragmentAdapter.MyViewHolder>{
    Context context;
    List<YourPage> you_list;
    TextView r_name;

    public ProfilePostFragmentAdapter(Context context, List<YourPage> you_list) {
        this.context = context;
        this.you_list = you_list;
    }
    public static class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView add_image;
        public MyViewHolder(View itemView) {
            super(itemView);
            this.add_image = (ImageView) itemView.findViewById(R.id.add_image);
        }
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_layout, parent, false);
        final MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.add_image.setImageResource(you_list.get(position).getPhoto());
    }
    @Override
    public int getItemCount()
    {
        return you_list.size();
    }
}
