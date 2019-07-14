public class Triangle implements Figure {

    private String figurename;

    public Triangle (String name) {
        figurename = name;
    }

    public void showMyName() {
        System.out.println(figurename);
    }
}