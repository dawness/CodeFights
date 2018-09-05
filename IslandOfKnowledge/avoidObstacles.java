int avoidObstacles(int[] inputArray) {
    for(int i = 2;;i++){
        boolean flag = true;
        for(int n:inputArray)
            flag = flag && n%i != 0;
        if(flag) return i;
    }
}