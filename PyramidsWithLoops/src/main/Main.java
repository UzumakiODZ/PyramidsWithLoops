/* 
 * Bill Nicholson
 * nicholdw@ucmail.uc.edu
 * Printing pyramids using loops. It kind-of works. 
 * What I really want is
        1
       222
      33333
     4444444
    555555555 
*/
*/
package com.github;

public class Main {

public static void main(String[] args) {

  

 for (int a = 1; a <= 5; a++)

        {

 for (int b = 5 - a; b >= 1;b--)

            {

                System.out.print(" ");

            }

for (int b = 1; b <= 2 * a - 1; b++)

            {

                System.out.print(a);

            }

            System.out.println();

        }

   

  }

}
