package uz.muydinovs.mosh;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class MoshApplication {

    public static void main(String[] args) {

        var list = new LinkedList();
        list.addFirst(5);
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.removeLast();
        System.out.println(Arrays.toString(list.toArray()));
    }

}
