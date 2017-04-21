package sj.prabha.com.wekancode;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
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
public class ProfileFragment extends Fragment implements MaterialTabListener {
    private ViewPager pager;
    private ProfilePagerAdapter pagerAdapter;
    MaterialTabHost tabHost;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        setUi(view);

        return view;
    }

    private void setUi(View view){
        tabHost = (MaterialTabHost) view.findViewById(R.id.tabHost);
        pager = (ViewPager) view.findViewById(R.id.view_pager);
        pagerAdapter = new ProfilePagerAdapter(getContext(), getChildFragmentManager());
        pager.setAdapter(pagerAdapter);
        pager.addOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
            @Override
            public void onPageSelected(int position) {
                tabHost.setSelectedNavigationItem(position);
            }
        });
        tabHost.addTab(tabHost.newTab().setText(getResources().getString(R.string.post)).setTabListener(this));
        tabHost.addTab(tabHost.newTab().setText(getResources().getString(R.string.followers)).setTabListener(this));
        tabHost.addTab(tabHost.newTab().setText(getResources().getString(R.string.following)).setTabListener(this));
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

    public class ProfilePagerAdapter extends FragmentPagerAdapter
    {
        private Context context;
        public ProfilePagerAdapter(Context context, FragmentManager fm)
        {
            super(fm);
            this.context = context;
        }

        @Override
        public Fragment getItem(int num)
        {
            switch (num){
                case 0:
                    return new ProfilePostFragment();
                case 1:
                    return new ProfileFollowersFragment();
                case 2:
                    return new ProfileFollowingFragment();
            }
            return null;
        }
        @Override
        public int getItemPosition(Object object) {
            // Causes adapter to reload all Fragments when
            // notifyDataSetChanged is called
            return POSITION_NONE;
        }

        @Override
        public int getCount() {
            return 3;
        }
    }

}
