public class Person implements Inter{


    @Override
    public void minus(int a, int b) {
       int sum= a-b;
        System.out.println(sum);
        }





    @Override
    public void plus(int a, int b) {

        int sum= a+b;
        System.out.println(sum);
    }

    @Override
    public String message() {
        return "hello";
    }
}
