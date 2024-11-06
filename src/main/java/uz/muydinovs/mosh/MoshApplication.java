package uz.muydinovs.mosh;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MoshApplication {

    public static void main(String[] args) {

        var list = new LinkedList();
        System.out.println(list.size());
        list.addFirst(5);
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.removeLast();
        System.out.println(list.size());
    }

}
