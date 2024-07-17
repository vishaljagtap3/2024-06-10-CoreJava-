public class Util {

    public static void processHolder1(Holder holder) {
        System.out.println("PH1: " + holder.getData());
    }

    public static void processHolder2(Holder<Integer> holder) {
        System.out.println("PH2(Integer): " + holder.getData());
    }

    public static void processHolder3(Holder<String> holder) {
        System.out.println("PH3(String): " + holder.getData());
    }

    //type aware
    public static void processHolder4(Holder<?> holder) {
        System.out.println("PH4: " + holder.getData());
    }

    public static void processPair1(Pair pair) {
        System.out.println(pair.getKey() + " " + pair.getVal());
    }

    public static void processPair2(Pair<?,?> pair) {
        System.out.println(pair.getKey() + " " + pair.getVal());
    }

    public static void processPair3(Pair<?, String> pair) {
        System.out.println(pair.getKey() + " " + pair.getVal());
    }

    public static void processPair4(Pair<Integer, String> pair) {
        System.out.println(pair.getKey() + " " + pair.getVal());
    }

    public static void processPair5(Pair<Integer, ?> pair) {
        System.out.println(pair.getKey() + " " + pair.getVal());
    }



    //this function can accept holder argument which uses any type deriving Number
    //However this function will treat the type always as a Number even if you pass a Holder<Integer> or Holder<Float>
    public static void processHolder5(Holder<Number> holder) {
        holder.getData();
    }

    //bounding the type parameters
    public static void processHolder6(Holder<? extends Number> holder) {
        holder.getData();
    }

}
