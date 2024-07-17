public class Main {
    public static void main(String[] args) {

        Holder<Integer> hInt = new Holder<Integer>(100);
        Holder<String> hString = new Holder<String>("BitCode");

        Util.processHolder1(hInt);
        Util.processHolder1(hString);
        System.out.println();

        Util.processHolder2(hInt);
        //Util.processHolder2(hString); //error

        //Util.processHolder3(hInt); //error
        Util.processHolder3(hString);

        System.out.println();

        Util.processHolder4(hInt);
        Util.processHolder4(hString);
        System.out.println();

        Pair<Integer, String> p1 = new Pair<Integer, String>(11, "Samiksha");
        Pair<Float, String> p2 = new Pair<Float, String>(88.4f, "Samiksha");





        /*Stack<Integer> si = new Stack<Integer>(5);
        Stack<String> ss = new Stack<String>(10);

        Pair<Integer, String> p1 = new Pair<Integer, String>(11, "Samiksha");
        System.out.println(p1.getKey() + " " + p1.getVal());*/

        /*Holder<Integer> hInt = new Holder<Integer>(100);
        Holder<String> hString = new Holder<String>("BitCode");

        //hInt.setData("Java"); //error
        hInt.setData(200);
        int i = hInt.getData();
        System.out.println(i);

        //hString.setData(200); //error
        hString.setData("java");
        String str = hString.getData();
        System.out.println(str);*/

        //without generic class
        /*Holder hInt = new Holder(100);
        Holder hString = new Holder("BitCode");

        //lots of code
        //hInt.setData("Java");
        hInt.setData(200);
        //lots of code

        int i = (Integer) hInt.getData();
        System.out.println(i);

        //hString.setData(400);
        hString.setData("Vishal");
        String str = (String) hString.getData();
        System.out.println(str);*/
    }
}
