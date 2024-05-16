package Week3;

public class NestingIf {
    public static void main(String[] args) {
        int example = 17;

        if(example < 20) {

            if(example > 15) {
                System.out.println(example + "은 20보다는 작고 15보다는 큼");
            }
        }
    }
}
