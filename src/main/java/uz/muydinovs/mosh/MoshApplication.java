package uz.muydinovs.mosh;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MoshApplication {

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.peek());
        System.out.println(stack);

    }

}
