
object Main {
  
  def max(x: Int, y: Int): Int = {
        if (x > y) x else y
    }

  def inc(x:Int): Int = {
    x + 1
  }

  def string_man(value: String, rep_from: String, rep_to: String): String = {
    return value.replace(rep_from, rep_to);
  }

  def sum_loop(i: Int): Int = {
    var Sum: Int = 0
    for (i <- 1 to i){
        Sum += i;
    }
    return Sum
  }

  def sum_fold(i: Int): Int = {
    val range = 1 to i;
    val array = range.toArray;
    val sum: Int = array.fold(0)(_ + _);
    return sum;
  }

  def map_reduce(i: Int): Int = {
    val range = 1 to i/2;
    val array = range.toArray;
    def cubes(i:Int): Int = { i*i*i };

    val array_cubes = array.map(x => cubes(x));

    return array_cubes.reduce((a,b) => a+b);
  }


  def main(args: Array[String]): Unit = {
    val incremented = inc(10);
    val max_val = max(10, 20);
    println(incremented);
    println(max_val);
    println(string_man("Hi Anuj, I think I know you..", "Anuj", "Juna"));
    println(sum_loop(5));
    println(sum_fold(10));
    println(map_reduce(10));
  }

}

