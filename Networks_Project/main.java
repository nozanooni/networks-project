
    public class main {
        // Main method: Entry point for the program
        public static void main(String[] args) {
            // Create an instance of a class (example: MyClass) and use it
            System.out.println("Welcome to the program!");
    
            // Example of calling another method
            greetUser();
    
            // Example of creating an object of another class
            MyClass myObject = new class();
            myObject.sayHello();
        }
    
        // A simple method to greet the user
        public static void greetUser() {
            System.out.println("Hello, User! How are you today?");
        }
    }
    
    class MyClass {
        // Method within MyClass to demonstrate an action
        public void sayHello() {
            System.out.println("Hello from MyClass!");
        }
    }
    
}
