package sj.prabha.com.wekancode;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import java.util.List;

/**
 * Created by prabha on 20/4/17.
 */
public class FragmentNavigator {

    public static void navigateToFragment(AppCompatActivity coreActivity, Fragment coreFragment, boolean addToBackStack, int viewId) {
        navigateToFragment(coreActivity, coreFragment, addToBackStack, viewId, false, false);
    }
    public static void navigateToFragment(AppCompatActivity coreActivity, Fragment coreFragment, boolean addToBackStack, int viewId, boolean isAdd, boolean isAnimate)
    {
        FragmentManager fragmentManager = coreActivity.getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        /*if(isAnimate)
        {
            fragmentTransaction.setCustomAnimations(R.anim.anim_slide_in_left, R.anim.anim_slide_out_left, R.anim.anim_slide_in_right, R.anim.anim_slide_out_right);
        }*/
        if (!coreFragment.isAdded())
        {
            if (isAdd) {
                fragmentTransaction.add(viewId, coreFragment, coreFragment.getClass().getSimpleName());
            } else {
                fragmentTransaction.replace(viewId, coreFragment, coreFragment.getClass().getSimpleName());
            }
            if (addToBackStack)
            {
                fragmentTransaction.addToBackStack(null);
            }
        }
        else
        {
            fragmentTransaction.show(coreFragment);
        }
        fragmentTransaction.commitAllowingStateLoss();
        fragmentManager.executePendingTransactions();
    }
}
