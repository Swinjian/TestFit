public class s1{
    public static void main(String args[])
    {  
  
        String s= "forgeekkeegdkj";
        int i1=0;
        int i2=0;
        int max=0;
        
        int flag=0;
        
        int l = s.length();
        for (int i=0;i<l;i++)
        {
            for(int j=l-1;j>i;j--)
            {
                if(s.charAt(i)==s.charAt(j))
                {
                     flag=1;
                    for(int k=i,t=j;k<=t;k++,t--)
                    {
                        if(s.charAt(k)!=s.charAt(t))
                        {
                            flag=0;
                            break;
                        }
                       
                    }
                }
                if(flag==1)
                {
                    temp1=s.substring(i,j+1);
                    if(max<temp1.length())
                    {
                        max=temp1.length();
                        i1=i;
                        i2=j+1;
                    }                    
                }

            }
        }
        //String out=temp+temp1;
        String out=s.substring(i1,i2);
       // return out;
       System.out.println(out);
    }
}