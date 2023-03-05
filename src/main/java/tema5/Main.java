package tema5;

import tema5.interfaces.CocheCRUD;
import tema5.vehicles.CocheCRUDImplement;

public class Main {
    static CocheCRUD cocheCRUD = new CocheCRUDImplement();

    public static void main(String[] args) {
        cocheCRUD.save();
        cocheCRUD.findAll();
        cocheCRUD.delete();
    }
}
