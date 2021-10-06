public class Main {

    public static void main(String[] args) {

        FixedSizedList<String> myList = new FixedSizedList<>();


        String a = "a";
        String b = "b";
        String c = "c";

        String d = null;

        myList.add(a);
        myList.add(b);
        myList.add(c);
        myList.add(d);

        myList.remove(a);

        for (String string:myList) {
            System.out.println(string);
        }

    }
}
