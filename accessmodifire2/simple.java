package accessmodifire2;

public class simple {
    //public specifire/modifire
    //private void name(){----------private access modifire are not acccesible for other package.only accessible for same package
    //protected void name(){--------protected access modifie are not acccesible for other package.only accessible for same package
    // void name(){-----------------default accessmodifire are not acccesible for other package.only accessible for same package
    public void name() {
        System.out.println("simple methode running");
    }
    public static void main(String[] args) {
        simple s =new simple();
        s.name();

        //test1 t =new test1();..................because simple not extend with test1
        //t.m1();

    }
}
