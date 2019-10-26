# Builder Pattern
## Why
* Handles complex constructors
* Large number of parameters
* Immutability
* Examples
  * StringBuilder
  * DocumentBuilder
  * LocalBuilder
  
 ## Design
 Helps with constructing an object that might have complicated constructors
  
 
 Flexibility over telescoping constructors, or a constructor that uses a ton of parameters
 
 It uses a static innerclass to help create the builder.
  
 Negates the need for exposed setters, for example when you don't want setters cause you want the state to be immutable (instead of having getters and setters)
 
 * handles complex constructors
 * no interfaces required
 * can be a seperate class
 * works with legacy code
 
 ## UML
 ![builderUml](./builderUml.png)
 
 ## Example
 * see LunchOrder.class for code
 * see LunchOrderDemo.classfor implementation
 
 
 ## Summary
 * Creative way to deal with complexity with constructors
 * Easy to implement
 * Few drawbacks
 * Can refactor in with seperate class