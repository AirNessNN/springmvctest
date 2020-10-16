package com.an.demo.course;

import lombok.AllArgsConstructor;
import lombok.Data;


/**
 * @author Airness
 * @email huhaowei16@hotmail.com
 * @date 2020/9/22 9:21 上午
 * @description
 */
public class StackTest {


    @Data
    @AllArgsConstructor
    static
    class Node{
        String value;
        Node next;
    }


    /**
     * 栈顶元素
     */
    private Node top;



    public void pull(String value){
        //保存当前的栈顶元素
        Node pre =top;
        //将推入的元素，作为栈顶
        top = new Node(value,null);
        //栈顶的指针指向原栈顶元素
        top.next = pre;
    }

    public String pop(){
        Node current=top;
        top = current.next;
        return current.value;
    }

    public String peek(){
        return top.value;
    }


    public static void main(String[] args) {
        StackTest stack = new StackTest();
        stack.pull("1");
        stack.pull("2");
        stack.pull("3");

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }


}
