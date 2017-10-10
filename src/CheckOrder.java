import java.util.Comparator;

public class CheckOrder {

    public static boolean ordered(int[] list){

        for(int i= 0; i < list.length-1; i++){

            if(list[i] < list[i+1])
                return true;
        }

        return false;
    }

    public static boolean ordered(int[] list, boolean ascending){

        if(ascending)
            return ordered(list);
        for(int i= 0; i < list.length-1; i++ ){

            if(list[i] > list[i+1])
                return false;
        }
        return false;

    }

    public static boolean ordered(double[] list){

        for(int i= 0; i < list.length-1; i++){

            if(list[i] > list[i+1])
                return true;
        }
        return false;
    }

    public static boolean ordered (double[] list, boolean descending){

        if(descending)
            return ordered(list);
        for(int i= 0; i < list.length-1; i++){
            if (list[i] > list[i+1])
                return false;
        }
        return false;
    }

    public static <E extends Comparable<E>> boolean ordered(E[] list){

        for(int i= 0; i < list.length-1; i++){

            if(list[i].compareTo(list[i+1]) < 0){

                return true;
            }
        }
        return false;
    }

    public static <E extends Comparable<E>> boolean ordered (E[] list, boolean ascending){

        if(ascending){
            return ordered(list);
        }
        for(int i= 0; i < list.length-1; i++){

            if(list[i].compareTo(list[i+1]) > 0){
                return true;
            }

        }
        return false;
    }

    public static <E> boolean ordered(E[] list, Comparator<? super E> comparator){

        for(int i= 0; i < list.length-1; i++){
            if(comparator.compare(list[i], list[i+1]) < 0){
                return true;
            }
        }
        return false;
    }

    public static <E> boolean ordered(E[] list, Comparator<? super E> comparator, boolean ascending){
        if(ascending){
            return ordered(list, comparator);

        }
        for(int i= 0; i < list.length-1; i++){

            if(comparator.compare(list[i], list[i+1]) > 0){
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]){

        int[] list = {1, 2, 3, 4};
        double[] list1 = {0.1, 0.2, 0.3, 0.4};
        System.out.println(ordered(list, true));
        System.out.println(ordered(list, false));
        System.out.println(ordered(list, false));
        System.out.println(ordered(list, true));
    }

}
