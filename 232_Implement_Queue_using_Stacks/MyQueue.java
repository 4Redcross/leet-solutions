class MyQueue {

        Stack<Integer> original = new Stack<Integer>();
        public MyQueue() {
        }

        public void push(int x) {
            original.push(x);
        }

        public int pop() {
            Stack<Integer> temp = new Stack<Integer>();
            while(!original.empty()) {
                temp.push(original.pop());
            }
            int toPop = temp.pop();
            while(!temp.empty()) {
                original.push(temp.pop());
            }
            return toPop;
        }

        public int peek() {
            Stack<Integer> temp = new Stack<Integer>();
            while(!original.empty()) {
                temp.push(original.pop());
            }
            int toPeek = temp.peek();
            while(!temp.empty()) {
                original.push(temp.pop());
            }
            return toPeek;
        }

        public boolean empty() {
            return original.empty();
        }
    }
