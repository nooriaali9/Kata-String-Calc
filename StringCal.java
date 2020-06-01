public class MyException extends Exception
{
 public MyException(String str)
 {
  System.out.println(str);
 }
}
public class StringCal 
{
    public int Add(String numbers) throws IOException
    {
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
        String al = numbers.replaceAll("[^a-zA-Z0-9]+","");
        String[] a= al.split("");
        int[] b=new int[a.length];
       
        try{
        for(int k=0;k<a.length;k++){
        b[k]=Integer.parseInt(a[k]);
        
            if(b[k]<0)
            {
                  throw new MyException("Number is negative");
            }
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
     String a="//;\n2,5,6;2"; 
     
     int x=m.Add(a); 
     System.out.println("ss=" +x);
  
}

}
