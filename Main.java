
public class Main {
    public static void main(String[] args) {
        int[] sample1 = {54, 63, 107, 54, 17, 23, 37, 118, 21, 107, 37, 54};
        int[] sample2 =  {10, 54, 63, 21, 17, 23, 21, 118, 18, 10, 54, 23};

        LinkedList list1 = new LinkedList(sample1);
        LinkedList list2 = new LinkedList(sample2);

        System.out.println("Sample Input 1: " + list1.toString());

        list1.removeDuplicates(list1.head());
        System.out.println("Sample Output 1: " + list1.toString());
        System.out.println("Sample Output 1: " + list1.size());

        System.out.println("Sample Input 2: " + list2.toString());
        list2.removeDuplicates(list2.head());
        System.out.println("Sample Output 2: " + list2.toString());
        System.out.println("Sample Output 2: " + list2.size());
    
    }

}