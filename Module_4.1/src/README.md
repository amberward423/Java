CHAT GPT explanation

### Calculator Class – Code Explanation
The `Calculator` class acts as the Model in the Model-View-Controller (MVC) pattern. Its responsibility is to store the current calculation value and provide methods to modify and retrieve that value.

**1. The number variable**
The class contains a private integer variable called `number`, which starts at zero. This variable stores the calculator's current total. The `private` access modifier prevents other classes from directly modifying it.
/// MY edit (below)///
The class contains a private  variable called `number`, which starts at zero. This variable stores the calculator's current total. It is labelled as private to prevent access from other classes.

**2. The add() method**
The `add(int value)` method increases the calculator's current total by the supplied integer. Before adding the value, the method checks whether it is negative. If the value is negative, an `IllegalArgumentException` is thrown. Otherwise, the value is added to the existing total.
/// MY edit (below)///
The `add(int value)` method acts as an incrementor adding as you go. Before adding the value, the method checks whether it is negative through an if statement. If the value is negative, an `IllegalArgumentException` is thrown. Otherwise, the value is added to the existing total.

**3. The reset() method**
The `reset()` method resets the calculator's stored total to zero. This allows the calculator to start a new calculation without creating another Calculator object.
/// MY edit (below)///
The `reset()` method resets the calculator's stored total to zero.

**4. The getCurrentValue() method**
The `getCurrentValue()` method returns the current value stored in the calculator. It does not modify the total; it simply allows another class, such as `Main`, to retrieve the result.
/// MY edit (below)///
The `getCurrentValue()` method gets the current value stored in the calculator.

**5. The Main class**
The `Main` class provides a temporary way to test the Calculator class. It creates a Calculator object, adds integers, retrieves the current total, and prints the result to the console.
/// MY edit (below)///
The `Main` is where the action happens. It is where the calculator is created and able to be used.

### Conclusion
The Calculator class demonstrates encapsulation by keeping its calculation value private and providing public methods to interact with it.
Each method has a separate responsibility, making the class easier to understand, maintain, and test.
/// MY edit (below)///
The Calculator class works together with the main class to create a calculator that is able to be used by the user via the terminal. The class is built
of 3 methods which can add, reset the calculator value to 0, and return the value back to the user.


#### Answer to the question 
What are the benefits and drawbacks of using GitHub Copilot?

I used ChatGPT because I ran out of tokens with GitHub Copilot. 

Benefits: 
- was helpful for timeliness in the beginning
- learn along the way 

Cons
- provided sloppy code
- took longer in some cases than I would have manually
- I really had to drive this and I didn't like having to explain my thought process because it felt like a waste of time when I could just do it myself




