package sj.prabha.com.wekancode;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by prabha on 20/4/17.
 */
public class PostAdapter extends RecyclerView.Adapter
{

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);

        return new PostViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount()
    {
        return 10;
    }

    public class PostViewHolder extends RecyclerView.ViewHolder
    {

        public PostViewHolder(View itemView) {
            super(itemView);
        }
    }
}
