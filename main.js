/******************************************************************************
Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
package


public class staticandnonstatic {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         mn obj=new mn();
  obj.incr();
  
  mn obj1 =new mn();
  obj1.incr();
  
  mn obj2 =new mn();
  obj2.incr();
  
    }
    
}
class mn
{
     static int i=20;
            int j=10;
            void incr()
            {
                i=i+10;
                j=j+10;
                System.out.println(i);
                System.out.println(j);
                
            }
}
    