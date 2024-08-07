Integer fmap[] = new Integer[26]; 
Arrays.fill(fmap, 0); // fill the Integer Array with 0

Arrays.sort(fmap,Collections.reverseOrder()); // sort Integer Array in reverse Order.

// sorting using lambda expression it will work on the classes. 
// not work for int work for Integer(wrapper class) 
Arrays.sort(fmap,(a,b)->{
      return a-b; // assending order 
});

ArrayList<Integer> list = new ArrayList<>(Arrays.asList(fmap)); // make a array list from array.

