package com.Web.Aplicaciones.App.Activity.Principal;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.Web.Aplicaciones.App.Fragments.Principal.Post.FragmentPost;
import com.Web.Aplicaciones.App.Fragments.Principal.Perfil.Perfil;
import com.Web.Aplicaciones.App.Fragments.Principal.UploadAudio.FragmentUploadAudio;


/**
 * Created by Richard on 20/05/2017.
 */

public class AdapterPrincipal extends FragmentPagerAdapter {


    public AdapterPrincipal(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0) return new FragmentPost();
        else if(position==1)return new Perfil();
        else if(position==2) return new FragmentUploadAudio();
        else return null;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if(position==0) return "Home";
        else if(position==1)return "Perfil";
        else if(position==2) return "Subir Audio";
        return null;
    }
}
