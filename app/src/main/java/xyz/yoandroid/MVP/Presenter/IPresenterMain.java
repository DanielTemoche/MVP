package xyz.yoandroid.MVP.Presenter;


import java.util.ArrayList;

import xyz.yoandroid.MVP.Model.Alumno;

public interface IPresenterMain {

    ArrayList<Alumno> getAllAlumno();

    void updateLista();

    ArrayList<Alumno> filterClient(String text, ArrayList<Alumno> oldList);


}
