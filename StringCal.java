public class StringCal 
{
    public int Add(String numbers) throws Exception
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
        findNegative(numbers);
        String al = numbers.replaceAll("[^a-zA-Z0-9]+","");
        String[] a= al.split("");
        int[] b=new int[a.length];
       
        for(int k=0;k<a.length;k++)
        b[k]=Integer.parseInt(a[k]);
          
        for(int i=0;i<b.length;i++)
        {
            x=x+b[i];
        }
    
    }

          
       return x;
    }
    
    private void findNegative(String numbers) throws Exception
        {
        String al = numbers.replaceAll("[&,:;=\\\\?@#|/'<>.^*()%!]*","");        
        String[] b= al.split("");
        try{
        for(String curr:b)
        {
            if(Float.parseFloat(curr)<0)
            throw new Exception("Negative Input!");
        }
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
    }
    
    public static void main(String[] args)
    {
     StringCal m = new StringCal();
     String a="//;\n -2,5,6;2"; 
     int x=m.Add(a); 
     System.out.println("ss=" +x);
    }

}
