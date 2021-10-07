import org.junit.Assert;
import org.junit.Test;

public class TestFixedSizedList {


    @Test
    public void testWithNullValues(){

        FixedSizedList<String> myList = new FixedSizedList<>();
        String a = null;
        myList.add(a);
        Assert.assertEquals(0, myList.size());

    }

    @Test
    public void addingMoreThanFiveValues(){

        FixedSizedList<String> myList = new FixedSizedList<>();
        String a = "H";
        String b = "Ha";
        String c = "Hal";
        String d = "Hall";
        String e = "Hallo";
        String f = "Hallo Welt";

        myList.add(a);
        myList.add(b);
        myList.add(c);
        myList.add(d);
        myList.add(e);
        myList.add(f);

        Assert.assertEquals(5, myList.size());

    }

    @Test
    public void removingNonIncludedElement(){

        FixedSizedList<String> myList = new FixedSizedList<>();
        String a = "a";
        String b = "b";
        String c = "c";
        myList.add(a);
        myList.add(b);
        myList.remove(c);
        Assert.assertEquals(2, myList.size());

    }
}
