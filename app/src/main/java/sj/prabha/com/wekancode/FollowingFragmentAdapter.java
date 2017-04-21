package sj.prabha.com.wekancode;

import android.content.Context;
import android.media.Image;
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
 * Created by prabha on 20/4/17.
 */
public class FollowingFragmentAdapter extends RecyclerView.Adapter<FollowingFragmentAdapter.MyViewHolder>{
    Context context;
    List<FollowingPage> following_list;
    public FollowingFragmentAdapter(Context context, List<FollowingPage> following_list) {
        this.context = context;
        this.following_list = following_list;
    }
    public static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView r_name,r_time,r_status_peson,photo_cmt; CircleImageView vehicle_image; ImageView liked_image,liked_image1,liked_image2,liked_image3,liked_image4;
        LinearLayout liked_image_fourLayout,liked_image_oneLayout,photo_cmt_layout;
        public MyViewHolder(View itemView) {
            super(itemView);
            this.r_name = (TextView) itemView.findViewById(R.id.r_name);
            this.r_time = (TextView) itemView.findViewById(R.id.r_time);
            this.r_status_peson = (TextView) itemView.findViewById(R.id.r_status_peson);
            this.vehicle_image = (CircleImageView) itemView.findViewById(R.id.vehicle_image);
            this.liked_image_oneLayout = (LinearLayout) itemView.findViewById(R.id.liked_image_oneLayout);
            this.liked_image_fourLayout = (LinearLayout) itemView.findViewById(R.id.liked_image_fourLayout);
            this.liked_image = (ImageView) itemView.findViewById(R.id.liked_image);
            this.liked_image1 = (ImageView) itemView.findViewById(R.id.liked_image1);
            this.liked_image2 = (ImageView) itemView.findViewById(R.id.liked_image2);
            this.liked_image3 = (ImageView) itemView.findViewById(R.id.liked_image3);
            this.liked_image4 = (ImageView) itemView.findViewById(R.id.liked_image4);

            this.photo_cmt_layout = (LinearLayout) itemView.findViewById(R.id.photo_cmt_layout);
            this.photo_cmt = (TextView) itemView.findViewById(R.id.photo_cmt);
        }
    }
    @Override
    public FollowingFragmentAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.following_layout, parent, false);
        final MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.r_name.setText(following_list.get(position).getName());
        holder.r_time.setText(following_list.get(position).getDateTime());
        holder.r_status_peson.setText(following_list.get(position).getPersonStatus());
        holder.vehicle_image.setImageResource(following_list.get(position).getPhoto());
        if(following_list.get(position).getPhotoCouunt() ==1){
            holder.liked_image.setImageResource(R.drawable.lion);
            holder.liked_image_oneLayout.setVisibility(View.VISIBLE);
            holder.liked_image_fourLayout.setVisibility(View.GONE);
        }else if(following_list.get(position).getPhotoCouunt() ==4){
            holder.liked_image1.setImageResource(R.drawable.lion);
            holder.liked_image2.setImageResource(R.drawable.myprofile);
            holder.liked_image3.setImageResource(R.drawable.lion);
            holder.liked_image4.setImageResource(R.drawable.dog);
            holder.liked_image1.setImageResource(R.drawable.lion);
            holder.liked_image_oneLayout.setVisibility(View.GONE);
            holder.liked_image_fourLayout.setVisibility(View.VISIBLE);
        }
        if(!following_list.get(position).getPhotoComment().isEmpty()){
            holder.photo_cmt_layout.setVisibility(View.VISIBLE);
            holder.photo_cmt.setText(following_list.get(position).getPhotoComment());
        }
    }
    @Override
    public int getItemCount()
    {
        return following_list.size();
    }
}
