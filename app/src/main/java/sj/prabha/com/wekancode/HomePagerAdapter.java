package sj.prabha.com.wekancode;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by prabha on 20/4/17.
 */
public class HomePagerAdapter extends FragmentPagerAdapter
{
    private Context context;
    public HomePagerAdapter(Context context, FragmentManager fm)
    {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int num)
    {
        switch (num){
            case 0:
                return new YouFragment();
            case 1:
                return new FollowingFragment();
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
        return 2;
    }
}

