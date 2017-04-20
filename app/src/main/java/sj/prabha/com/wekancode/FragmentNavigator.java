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

    public static void navigateToFragment(AppCompatActivity coreActivity, Fragment coreFragment, boolean addToBackStack, int viewId, boolean isAnimate) {
        navigateToFragment(coreActivity, coreFragment, addToBackStack, viewId, false, isAnimate);
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

    public static void removeFragments(AppCompatActivity coreActivity)
    {
        FragmentManager fragmentManager = coreActivity.getSupportFragmentManager();
        List<Fragment> fragmentList = fragmentManager.getFragments();

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        for(Fragment fragment : fragmentList)
        {
            fragmentTransaction.remove(fragment);
        }

        fragmentTransaction.commitAllowingStateLoss();
        fragmentManager.executePendingTransactions();
    }

    public static void removeFragments(AppCompatActivity coreActivity, int viewId) {
        coreActivity.getSupportFragmentManager().beginTransaction().remove(coreActivity.getSupportFragmentManager().findFragmentById(viewId)).commit();

    }

    public static void removeFragments(Fragment coreFragment, int viewId) {
        coreFragment.getChildFragmentManager().beginTransaction().remove(coreFragment.getChildFragmentManager().findFragmentById(viewId)).commit();

    }

    public static void placeFragment(Fragment parentFragment, Fragment coreFragment, int viewId)
    {
        FragmentManager fragmentManager = parentFragment.getChildFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        if (!coreFragment.isAdded())
        {
            fragmentTransaction.replace(viewId, coreFragment, coreFragment.getClass().getSimpleName());
        }
        fragmentTransaction.commit();
        fragmentManager.executePendingTransactions();
    }

    public static void placeFragment(AppCompatActivity coreActivity, Fragment coreFragment, int viewId)
    {
        FragmentManager fragmentManager = coreActivity.getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        if (!coreFragment.isAdded())
        {
            fragmentTransaction.replace(viewId, coreFragment, coreFragment.getClass().getSimpleName());
        }
        fragmentTransaction.commit();
        fragmentManager.executePendingTransactions();
    }
}
