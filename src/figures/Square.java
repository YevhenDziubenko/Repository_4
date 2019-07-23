package figures;

public class Square extends Figure {

    private String figurename;

    public Square (String name) {
        figurename = name;
    }

    public void showMyName() {
        System.out.println(figurename);
    }

}
