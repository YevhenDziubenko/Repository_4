public class Square implements Figure {

    private String figurename;

    public Square (String name) {
        figurename = name;
    }

    public void showMyName() {
        System.out.println(figurename);
    }
}
