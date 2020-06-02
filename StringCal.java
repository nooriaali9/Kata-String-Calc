public class MyException extends Exception
{
 public MyException(String str)
 {
  System.out.println(str);
 }
}
public class StringCal 
{
    public static int count=0; 
    public int Add(String numbers) throws IOException
    {
       count++;
       int x=0;
       if(numbers== null)
       {
       return x;
       }
    
       if(numbers.length() == 1)
       {
       x = Integer.parseInt(numbers);
       return x;
       }
       
       int sum=0;

        if(numbers.length()> 1)
        {
        //findNegative(numbers);
        String al = numbers.replaceAll("[&,:;=\\\\?@#|/'<>.^*()%!]+"," ");
        al = numbers.replaceAll(System.lineSeparator()," ");
        al=al.trim();
        String[] a= al.split("\\s+");
        int[] b=new int[a.length];
       
        try{
         for(int k=0;k<a.length;k++){
            if(a[k].equals("-"))
            {
                System.out.print(" "+ a[k]+" "+a[k+1]);
                 //throw new MyException("Negatives Not allowed!");
                 
                }
            }
            System.out.print("\n");
       
        for(int k=0;k<a.length;k++){
         if(a[k].equals("-"))
            {
                 throw new MyException("Negatives Not allowed!");
                }
            
        if(Integer.parseInt(a[k],10)>1000)
            continue;
        else
            b[k]=Integer.parseInt(a[k],10);
        
        
            for(int i=0;i<b.length;i++)
        {
            x=x+b[i];
        }
        }
        return x;
    }
    catch (MyException m) {
   System.out.println(m);
    }
    }
    
        return x;
    }
    
    
    public static void main(String[] args) throws Exception
    {
     StringCal m = new StringCal();
     String a="***85***6***2"; 
     
     int x=m.Add(a); 
     System.out.println("sum of integers in the string=" +x);
     System.out.println("add has been called " +count+ " number of times");
  
}

}
