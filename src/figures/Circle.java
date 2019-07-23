package figures;

public class Circle extends Figure {

    private String figurename;

    public Circle (String name) {
        figurename = name;
    }

    public void showMyName() {
        System.out.println(figurename);
    }

   @Override
   public void showMyType() { System.out.println(getClass()); }
}
