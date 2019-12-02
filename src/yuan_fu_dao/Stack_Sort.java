package yuan_fu_dao;

import java.util.Stack;

/**
 * 实现一个最小栈的功能，即压入栈内的元素都有序
 */
public class Stack_Sort {
    Stack<Integer> stackMin;
    Stack<Integer> stackData;

    Stack_Sort(){
        stackMin = new Stack<>();
        stackData = new Stack<>();
    }

    /**
     * 入栈逻辑
     */
    public void push(int nums){
        if (stackMin.isEmpty()){
            stackMin.push(nums);
        }else if (stackMin.peek() < nums){
            stackData.push(nums);
        }else{
            stackMin.push(nums);
        }
    }

    /**
     * 出栈逻辑
     * @return
     */
    public int pop(){
        if (stackMin.isEmpty()){
             throw new RuntimeException("your empty is empty");
        }
        return stackData.pop();
    }

    /**
     * 获取最小值的方法
     * @return
     */
    public int getMin(){
        if (stackMin.isEmpty()){
            throw new  RuntimeException("your stack is empty");
        }else{
            return stackMin.peek();
        }
    }

    /**
     * 实现将堆栈内的元素进行排序
     */
    public void sortStack(Stack<Integer> stack){
        // 借用一个辅助栈
        Stack<Integer> help = new Stack<Integer>();
        while (!stack.isEmpty()){
            int cur = stack.pop();
            if (!help.isEmpty() && help.peek() < cur){
                // 如果辅助栈peek的元素小于stack栈中的元素，那么将此元素重新压回stack内
                // 将stack弹出的元素压倒help中
                stack.push(help.pop());
            }
            help.push(cur);
        }
    }

}
