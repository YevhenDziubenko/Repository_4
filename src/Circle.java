public class Circle implements Figure {

    private String figurename;

    public Circle (String name) {
        figurename = name;
    }

    public void showMyName() {
        System.out.println(figurename);
    }
}
