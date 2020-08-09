# ChattingApplication
 A project for demonstrating Object Oriented Programming (OOP) concepts in Java.

### Why Object Oriented Programming?
We can map real word objects into programming world.
For example, a light bulb has two states, on and off.
We don't need to know electrical details of insides of the bulb. We just need a way i.e a switch to modify these states to use the bulb.
All of these details can be easily mapped into programming. 

This kind of programming allows us to write flexible, modular and less complex or abstract code.
How can we achieve all these benefits? Please check all the OOP concepts as follows:

 For a fun introduction to OOP concepts to this presentation here:
 https://docs.google.com/presentation/d/15KU_2AUNB9Itubgpojp_gCOe7m05Ced9Mc8q2BjLD40/edit?usp=sharing

 Prefer a video instead? Have fun! https://www.youtube.com/watch?v=u8gRq4OojXY
  
## Encapsulation/Hiding Data

Hiding state/data/attributes. Provide only the ways to modify/access the data. Provide data and behaviour as a single capsule/unit.
 
### Benefits
 
 * Promotes consistency and avoid code duplication
 * Promotes testability and maintainability
 * Provides modularity
    
### When to use?
 
 * When you want to prevent other objects to access/modify the attributes of an object without using proper functions.
  This is generally applicable to any and all objects.
  
### How to use?
 * Mark attributes as private.
 * Have getter and setter methods to read and write these attributes.
 
## Abstraction/Hiding Complexity

### Benefits
 * Code update becomes easy. Since the exposed interface of method name, input, out remains the same. Code can be changed under the hood. 
 * No need to worry about internal complexity.
### When to use?
 * Creating a generic framework, when you know what you want but how to implement is either yet to be decided or has multiple possible implementations.
### How to use?
Use an abstract class or interface. Both offers abstract methods without any method body.
Extend/Implement the abstract class/interface to provide method implementation.
  
## Inheritance/Code Reusability

### Benefits

* Code reusability  
* Code readability

### When to use?

* When there are objects having similar attributes.
* When you want additional functionalities, instead of modifying existing class,
extend it using inheritance. 

### How to use?
* Extend a class

## Polymorphism/One name many forms
1. Dynamic/Run-time polymorphism ~ method overriding
2. Static/Compile-time polymorphism ~ method overloading

### Benefits
* Call a method's specific implementation based on a given situation

### When to use?
Overriding: When child classes need to implement different logic for methods than provided by the parent class. 

Overloading: When a class needs the related methods to have the same method name with only a different set of parameters.
e.g add two integers and add two floating-point numbers

### How to use?
Override/overload methods in the parent class from the child class.

