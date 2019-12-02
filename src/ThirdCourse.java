
public class ThirdCourse {
    /**
     * 利用定长的数组实现栈和队列的功能
     */
    public class ArrayStack{
        private Integer[] arr;
        private int size;

        public ArrayStack(int initSize){
            if (initSize < 0){
                // 非法参数异常
                throw new IllegalArgumentException("初始化长度不能小于0");
            }
            arr = new Integer[initSize];
            size = 0;
        }
        /**
         *
         */
        public Integer peek(){
            if (size == 0){
                return null;
            }
            return arr[size - 1];
        }
        /**
         * push method
         */
        public void push(int n){
            if (size == arr.length){
                throw new ArrayIndexOutOfBoundsException("the stack is full");
            }
            arr[size ++] = n;
        }

        /**
         * pull method
         * @return
         */
        public int pop(){
            if (arr.length == 0 || size == 0){
                throw new ArrayIndexOutOfBoundsException("the stack is empty");
            }

            return arr[-- size];

        }

    }

    public class ArrayQueue{
        private Integer[] arr;
        private int start;
        private int end;
        private int size;

    }


}
