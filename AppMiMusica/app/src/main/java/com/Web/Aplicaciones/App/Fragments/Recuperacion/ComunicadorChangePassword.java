package com.Web.Aplicaciones.App.Fragments.Recuperacion;

import android.support.v4.app.Fragment;

/**
 * Created by Richard on 20/05/2017.
 */

public interface ComunicadorChangePassword {
    void changeFragment(Fragment fragment);
    void finalizar();
    void hideKeyboard();
}
