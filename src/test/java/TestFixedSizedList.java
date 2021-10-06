import org.junit.Assert;
import org.junit.Test;

public class TestFixedSizedList {

    String a = "a";
    String b = "b";
    String c = "c";
    String d = "d";

    int aa = 2;
    int bb = 3;
    int cc = 4;
    int dd = 5;


    @Test
    public void testWithNullValues(){

        FixedSizedList<String> myList = new FixedSizedList<>();
        String a = null;
        Assert.assertEquals(false, myList.add(a));

    }

    @Test
    public void addingMoreThanFiveValues(){

    }

    @Test
    public void removingNonIncludedElement(){
        FixedSizedList<String> myList = new FixedSizedList<>();
        String a = "a";
        String b = "b";
        myList.add(a);
        myList.add(b);
        Assert.assertEquals(false, myList.remove(c));
    }
}
