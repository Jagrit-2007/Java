package Chitkara_Classes.OOPS;

// POLYMORPHISM : ABILITY OF AN OBJECT TO TAKE MANY FORMS
// IT ALLOWS TO PERFORM A SINGLE ACTION IN DIFFERENT WAY

// TWO TYPES :

// 1. Compile time Polymorphism (Overloading)      2.Runtime Polymorphism (Dynamic) 

// class Animal {
//     void sound() {
//         System.out.println("Animal makes a sound");
//     }
// }

// class Dog extends Animal {
//     void sound() {
//         System.out.println("Dog barks");
//     }
// }

// public class Polymorphism{
//     public static void main(String[] args) {

//         Animal animal = new Animal();
//         animal.sound();

//         animal = new Dog();
//         animal.sound();
//     }
// } 





// class Box {

//     void volume() {
//         System.out.println("MEOWWWWW!!");
//     }

//     void volume(int side) {
//         System.out.println("Volume of Cube = " + (side * side * side));
//     }

//     void volume(int length, int width, int height) {
//         System.out.println("Volume of Box = " + (length * width * height));
//     }

//     public static void main(String[] args) {
//         Box obj = new Box();

//         obj.volume();
//         obj.volume(4);
//         obj.volume(5, 3, 2);
//     }
// }