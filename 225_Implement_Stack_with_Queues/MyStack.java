class MyStack {
        Queue<Integer> original = new LinkedList<Integer>();
        public MyStack() {
        }

        public void push(int x) {
            Queue<Integer> temp = new LinkedList<Integer>();
            while(!original.isEmpty()){
                temp.add(original.poll());
            }
            original.add(x);
            while(!temp.isEmpty()) {
                original.add(temp.poll());
            }
        }

        public int pop() {
            return original.poll();
        }

        public int top() {
            return original.peek();
        }

        public boolean empty() {
            return original.isEmpty();
        }
    }
