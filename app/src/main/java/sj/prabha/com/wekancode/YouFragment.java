package sj.prabha.com.wekancode;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
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
public class YouFragment extends Fragment {

 List<YourPage> you_list = new ArrayList<YourPage>();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_post, container, false);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        JSONArray myArray = ExampleJsonArray.getYouList();

        if(myArray.length() != 0) {
            for (int i = 0; i < myArray.length(); i++) {
                try {
                    JSONObject Obj =myArray.getJSONObject(i);
                    YourPage yourPage = JsonUtil.getObjectFromJson(Obj, YourPage.class);
                    you_list.add(yourPage);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        }
        YouAdapter adapter = new YouAdapter(getContext(),you_list);
        recyclerView.setAdapter(adapter);
        LinearLayoutManager layoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(),layoutManager.getOrientation());
        recyclerView.addItemDecoration(dividerItemDecoration);
        return view;
    }



    private void setJsonArray()
    {




    }
}
