
fun main() {
    var automotor = Car("Toyota", "corolla", "red", 10)
    var vehicle = Bus("Lexus", "RX", "Navyblue", 200)

    //The class of Car
    automotor.carry(16)
    automotor.identity()
    var results = automotor.calculateParkingFees(7, 20)
    println(results)

    // Space in between
    println(" ")

    // The class of Bus
    vehicle.carry(9)
    vehicle.identity()
    var adventure = vehicle.maxTripFare(1.90,4)
    println(adventure)

}

//A class Car with the following attributes: make, model, color, capacity.
//It has these functions:
//-carry(people: Int) : Prints out “Carrying $people passengers” if the
//number of people is within its capacity else it prints out “Over capacity
//by $x people” where x is the number of people exceeding its capacity

open class Car(var make: String, var model: String, var color: String, var capacity: Int) {
    fun carry(people: Int) {
        var x = people - capacity
        if (people <= capacity) {
            println("Carrying $people passengers")
        } else {
            println("Over capacity by $x people")
        }
    }

    //-identity() : Prints out the color, make and modelin the following
//format e.g:  “I am a white subaru legacy”
    fun identity() {
        println("I am a $color $make $model")
    }

    //-calculateParkingFees(hours: Int) : Calculates andreturns the
//parking fees by multiplying the hours by 20
    fun calculateParkingFees(hours: Int, multi: Int): Int {
        var parkingFees = hours * multi

        return parkingFees

    }
}
//A class Bus with the same attributes and functions as the Car class.
//In addition, it has another method called maxTripFare(fare: Double) that
//calculates and returns the maximum amount of fare that can be collected per
//trip.

class Bus(make: String, model: String, color: String, capacity: Int) : Car(make, model, color, capacity) {

    fun maxTripFare(fare: Double, trip: Int): Double {
        var maxMount = fare * trip

        return maxMount
    }
}









