package sj.prabha.com.wekancode;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;

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
        TextView r_name,r_time,r_status_peson;
        public MyViewHolder(View itemView) {
            super(itemView);
            this.r_name = (TextView) itemView.findViewById(R.id.r_name);
            this.r_time = (TextView) itemView.findViewById(R.id.r_time);
            this.r_status_peson = (TextView) itemView.findViewById(R.id.r_status_peson);
        }
    }
    @Override
    public FollowingFragmentAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
        final MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.r_name.setText(following_list.get(position).getName());
        holder.r_time.setText(following_list.get(position).getDateTime());
        holder.r_status_peson.setText(following_list.get(position).getPersonStatus());
    }

    @Override
    public int getItemCount()
    {
        return following_list.size();
    }
}
