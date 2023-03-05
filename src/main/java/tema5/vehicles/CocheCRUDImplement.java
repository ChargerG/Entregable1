package tema5.vehicles;

import tema5.interfaces.CocheCRUD;

public class CocheCRUDImplement implements CocheCRUD {
    @Override
    public void save() {
        System.out.println("Método save()");
    }

    @Override
    public void findAll() {
        System.out.println("Método findAll()");
    }

    @Override
    public void delete() {
        System.out.println("Método delete()");
    }
}
