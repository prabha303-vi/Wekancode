package sj.prabha.com.wekancode;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import it.neokree.materialtabs.MaterialTab;
import it.neokree.materialtabs.MaterialTabHost;
import it.neokree.materialtabs.MaterialTabListener;

/**
 * Created by prabha on 20/4/17.
 */
public class HomeFragment extends Fragment implements MaterialTabListener {

    private ViewPager pager;
    private HomePagerAdapter pagerAdapter;
    MaterialTabHost tabHost;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        setUi(view);
        return view;
    }
    private void setUi(View view){
        tabHost = (MaterialTabHost) view.findViewById(R.id.tabHost);
        pager = (ViewPager) view.findViewById(R.id.view_pager);
        pagerAdapter = new HomePagerAdapter(getContext(), getChildFragmentManager());
        pager.setAdapter(pagerAdapter);
        pager.addOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
            @Override
            public void onPageSelected(int position) {
                tabHost.setSelectedNavigationItem(position);
            }
        });
        tabHost.addTab(tabHost.newTab().setText(getResources().getString(R.string.you)).setTabListener(this));
        tabHost.addTab(tabHost.newTab().setText(getResources().getString(R.string.following)).setTabListener(this));
        pagerAdapter = new HomePagerAdapter(getContext(), getChildFragmentManager());
        pager.setAdapter(pagerAdapter);
    }

    @Override
    public void onTabSelected(MaterialTab tab) {
        pager.setCurrentItem(tab.getPosition());
    }
    @Override
    public void onTabReselected(MaterialTab tab) {

    }
    @Override
    public void onTabUnselected(MaterialTab tab) {

    }
}
