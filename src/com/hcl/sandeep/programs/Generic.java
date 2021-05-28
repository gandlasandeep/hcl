package com.hcl.sandeep.programs;
//Which of the output of the following code snippet

   import java.util.*;

   public class Generic<E>

   {

       Stack <E> stack = new Stack <E>();

       public void push(E obj)  {

           stack .push(obj);

        }

       public E pop(){

           E obj = stack .pop();

          return obj;

       }

   }

class Main

   {

       public static void main(String args[])

       {

           Generic<Integer> generic = new Generic<Integer>();

     //      generic .push(“100”);

           System.out.println(generic .pop());

       }

   }