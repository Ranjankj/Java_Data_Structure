// PriorityQueue is not thread-safe, java provides PriorityBlockingQueue class that implements the BlockingQueue interface to use in a java multithreading environment.
Declaration
PriorityQueue<Integer> pq = new PriorityQueue<>();

Methods
1. pq.add(2); // O(log n) add the element;
2. pq.remove(); // O(log n)  remove the peek element and return it.
  // Note: we can pass an argument in it also. but in that case it will not return anything. eg pq.remove(10);
3. pq.peek(); // o(1) return the peek element
4. pq.poll();  // remove the peek element and return it.

// making a custom class to be compared in priority queue.

static class Pair  implements Comparable<Pair>{
        int key;
        int value;
        Pair(int key, int value){
            this.key = key;
            this.value = value;
        }
        public int compareTo(Pair o){
            return o.value - this.value;
        }
}

// comparator
Comparator<Integer> comp = new Comparator<Integer>(){
            
            public int compare(Integer a,Integer b){
                if(a >b){
                    return 1;
                }else{
                    return -1;
                }
            }
  };

// how to pass comparator
Collections.sort(list,comp);

// with Lambda expression
Collections.sort(list, (a,b)->{
  if(a>b)
    return 1;
  else
    return -1;
})

