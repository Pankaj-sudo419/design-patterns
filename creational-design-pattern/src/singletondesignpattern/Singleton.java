package singletondesignpattern;

   /* All implementations of the singletondesignpattern.Singleton have these two steps in common:
   1- Make the default constructor private, to prevent other objects from using the new operator with the singletondesignpattern.Singleton class.

   2- Create a static creation method that acts as a constructor.
      Under the hood, this method calls the private constructor to create an object and saves it in a static field.
      All following calls to this method return the cached object. */

    /* How to Implement
    1- Add a private static field to the class for storing the singleton instance.
    2- Declare a public static creation method for getting the singleton instance.
    3- Implement “lazy initialization” inside the static method.
       It should create a new object on its first call and put it into the static field.
       The method should always return that instance on all subsequent calls.
    4- Make the constructor of the class private.
       The static method of the class will still be able to call the constructor, but not the other objects. */

    /* Note
             we can break singleton patter by following ways
             1- use Reflection APi
             2- use serializable
             3- use clone method
             4 - many more */

   /* for more details visit: https://refactoring.guru/design-patterns/singleton */

public class Singleton {

        // private static variable
        private static Singleton singleton;

        // private contractor so that now object will create using new keyword
        private Singleton(){
        }

        // public synchronized getter method throw this we get instance of this class
        public static Singleton getLibrary(){
            if(singleton == null){
                synchronized (Singleton.class){
                    if(singleton == null){
                        singleton = new Singleton();
                    }
                }
            }
            return singleton;
        }

        public boolean print(){
            System.out.println("This is test of lazy loaded singleton object");
            return true;
        }

    }





