package bai10_list.exercise.my_list;

public class TestMyList {
        public static void main(String[] args) {
            MyList<String> myList = new MyList<String>(10);
            myList.addLast("Cường ");
            myList.addLast("Trúc");
            myList.addLast("Hoài");
            myList.addLast("Hải");
            myList.addLast("Phúc");
            myList.add(2,"  ");
            System.out.println("Before remove");
            System.out.println(myList.get(0));
            System.out.println(myList.get(1));
            System.out.println(myList.get(2));
            System.out.println(myList.get(3));
            System.out.println("After remove");
            myList.remove(2);
            System.out.println(myList.get(0));
            System.out.println(myList.get(1));
            System.out.println(myList.get(2));
            System.out.println(myList.get(3));
        }
    }

