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
    public Fragment getItem(int position)
    {
        if(position == 0)
        {
            return new PostFragment();
        }
        else
        {
            return new PeopleFragment();
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position)
    {
        if(position == 0)
        {
            return "Post";
        }
        else
        {
            return "People";
        }
    }
}

