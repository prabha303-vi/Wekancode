package sj.prabha.com.wekancode;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by prabha on 21/4/17.
 */

public class CoreFragment extends Fragment {
    ImageView vertical,grid;
    List<YourPage> img_list = new ArrayList<>();
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_profile_view, container, false);
        final RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        vertical = (ImageView) view.findViewById(R.id.vertical);
        grid = (ImageView) view.findViewById(R.id.grid);
        TextView list_count = (TextView) view.findViewById(R.id.list_count);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        JSONArray myArray = ExampleJsonArray.getYouList();
        if(myArray.length() != 0) {
            img_list.clear();
            for (int i = 0; i < myArray.length(); i++) {
                try {
                    JSONObject Obj =myArray.getJSONObject(i);
                    YourPage yourPage = JsonUtil.getObjectFromJson(Obj, YourPage.class);
                    img_list.add(yourPage);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
        ProfilePostFragmentAdapter adapter = new ProfilePostFragmentAdapter(getContext(),img_list);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(),3, LinearLayoutManager.VERTICAL,false));
        vertical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                grid.setFocusable(false);
                recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
            }
        });
        grid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                recyclerView.setLayoutManager(new GridLayoutManager(getContext(),3, LinearLayoutManager.VERTICAL,false));
            }
        });
        list_count.setText(img_list.size()+" Post");
        return view;
    }

}
