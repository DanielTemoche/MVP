package xyz.yoandroid.MVP.Presenter;

import java.util.ArrayList;

import xyz.yoandroid.MVP.Model.Alumno;
import xyz.yoandroid.MVP.Model.IAlumno;
import xyz.yoandroid.MVP.View.IMainView;

public class PresenterMain implements IPresenterMain {

    IMainView view;
    IAlumno modelAlumno;


    public PresenterMain(IMainView view) {
        this.view = view;
        modelAlumno=new Alumno(this,view);

    }

    @Override
    public ArrayList<Alumno> getAllAlumno() {

        if(view!=null) {
            ArrayList<Alumno> alumnos;
            alumnos=modelAlumno.getAllAlumno();
            return alumnos;
        } else {
            return null;
        }
    }

    @Override
    public void updateLista() {
        view.updateLista();
    }

    @Override
    public ArrayList<Alumno> filterClient(String text, ArrayList<Alumno> oldList) {

        ArrayList<Alumno> newAlumnos=new ArrayList<>();
        text=text.toLowerCase();

        for(Alumno alumno:oldList) {
            String nombre=alumno.getNombre().toLowerCase();
            if(nombre.contains(text)) {
                newAlumnos.add(alumno);
            }
        }
        return newAlumnos;
    }
}
