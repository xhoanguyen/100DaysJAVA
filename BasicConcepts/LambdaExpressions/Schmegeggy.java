@FunctionalInterface
interface Distance{
    int distance(int a, int b);

}

class Schmegeggy {

    static void printDistance(Distance distance, int a, int b){
        System.out.println(distance.distance(a,b));
    }

    public static void main(String[] args) {
        class ManhattanDistance implements Distance {
            @Override
            public int distance(int a, int b) {
                return  a + b;
            }
        }

        printDistance( (int a, int b) -> a + b , 12, 38);
    }

}
