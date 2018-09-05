def adjacentElementsProduct(inputArray: Array[Int]): Int = {
     var max = inputArray(0) * inputArray(1)

  for (i <- 1 to inputArray.length - 1) {
    if (i + 1 < inputArray.length) {
    var product = inputArray(i) * inputArray(i + 1)
    if (max < product)
      max = product
  }
}
  return max
}



