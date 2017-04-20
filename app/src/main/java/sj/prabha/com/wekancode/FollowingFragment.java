package sj.prabha.com.wekancode;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by prabha on 20/4/17.
 */
public class FollowingFragment extends Fragment {
    List<FollowingPage> following_list = new ArrayList<>();
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_post, container, false);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        JSONArray myArray = ExampleJsonArray.getFollowingList();
        if(myArray.length() != 0) {
            for (int i = 0; i < myArray.length(); i++) {
                try {
                    JSONObject Obj =myArray.getJSONObject(i);
                    FollowingPage yourPage = JsonUtil.getObjectFromJson(Obj, FollowingPage.class);
                    following_list.add(yourPage);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
        FollowingFragmentAdapter adapter = new FollowingFragmentAdapter(getContext(),following_list);
        recyclerView.setAdapter(adapter);
        return view;
    }
}