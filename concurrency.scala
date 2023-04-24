import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future
import scala.util.{Success, Failure}

object Main {
  
  def longRunningTask(): Int = {
    Thread.sleep(1000) // Simulate a long running task
    41 // Return a result
  }

  def longRunningTask2(): Int = {
    Thread.sleep(2000) // Simulate a long running task
    42 // Return a result
  }

  def longRunningTask3(): Int = {
    Thread.sleep(3000) // Simulate a long running task
    43 // Return a result
  }

  def main(args: Array[String]): Unit = {
    val futureResult: Future[Int] = Future {
      longRunningTask()
    }
    val futureResult2: Future[Int] = Future {
      longRunningTask2()
    }
    val futureResult3: Future[Int] = Future {
      longRunningTask3()
    }

    // Define callbacks to handle the future result
    futureResult.onComplete {
      case Success(result) => println(s"The result is: $result")
      case Failure(exception) => println(s"An exception occurred: ${exception.getMessage}")
    }
    futureResult2.onComplete {
      case Success(result2) => println(s"The result 2 is: $result2")
      case Failure(exception2) => println(s"An exception occurred: ${exception2.getMessage}")
    }
    futureResult3.onComplete {
      case Success(result3) => println(s"The result 3 is: $result3")
      case Failure(exception3) => println(s"An exception occurred: ${exception3.getMessage}")
    }

    println("Waiting for the future to complete...")
    while (true) {
    }        
    println("Ended program")
  }

}