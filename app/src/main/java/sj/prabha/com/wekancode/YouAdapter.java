package sj.prabha.com.wekancode;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import de.hdodenhof.circleimageview.CircleImageView;

import static sj.prabha.com.wekancode.R.attr.icon;

/**
 * Created by prabha on 20/4/17.
 */
public class YouAdapter extends RecyclerView.Adapter<YouAdapter.MyViewHolder>
{
    Context context;
    List<YourPage> you_list;
    TextView r_name;

    public YouAdapter(Context context, List<YourPage> you_list) {
        this.context = context;
        this.you_list = you_list;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView r_name,r_time,r_status_peson,photo_cmt; LinearLayout photo_cmt_layout; CircleImageView vehicle_image; ImageView add_image,liked_image;
        public MyViewHolder(View itemView) {
            super(itemView);
            this.r_name = (TextView) itemView.findViewById(R.id.r_name);
            this.r_time = (TextView) itemView.findViewById(R.id.r_time);
            this.r_status_peson = (TextView) itemView.findViewById(R.id.r_status_peson);
            this.photo_cmt = (TextView) itemView.findViewById(R.id.photo_cmt);
            this.photo_cmt_layout = (LinearLayout) itemView.findViewById(R.id.photo_cmt_layout);
            this.vehicle_image = (CircleImageView) itemView.findViewById(R.id.vehicle_image);
            this.liked_image = (ImageView) itemView.findViewById(R.id.liked_image);
            this.add_image = (ImageView) itemView.findViewById(R.id.add_image);
        }
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
        final MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.r_name.setText(you_list.get(position).getName());
        holder.r_time.setText(you_list.get(position).getDateTime());
        holder.r_status_peson.setText(you_list.get(position).getPersonStatus());
        if(!you_list.get(position).getPhotoComment().isEmpty()){
            holder.photo_cmt_layout.setVisibility(View.VISIBLE);
            holder.photo_cmt.setText(you_list.get(position).getPhotoComment());
        }
        holder.vehicle_image.setImageResource(you_list.get(position).getPhoto());
        if(you_list.get(position).getActive().equals("Y")){
            holder.liked_image.setVisibility(View.VISIBLE);
            holder.add_image.setVisibility(View.GONE);
            holder.liked_image.setImageResource(you_list.get(position).getLikedImage());
        }else{
            holder.liked_image.setVisibility(View.GONE);
            holder.add_image.setVisibility(View.VISIBLE);
            holder.add_image.setImageResource(R.drawable.people_add);
        }
    }
    @Override
    public int getItemCount()
    {
        return you_list.size();
    }


}
