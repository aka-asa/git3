import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        int n = input.nextInt();
        input.nextLine();
        ArrayList <String> q = new ArrayList<>();
        ArrayList <Integer> sizes = new ArrayList<>();
        String string,s;
        int k=1,j=0,l=0,counter = 0,iFinder=0;
        ArrayList <String> subsets = new ArrayList<>();
        ArrayList <String> subsets2 = new ArrayList<>();
        for (int i=0 ; i<n ; i++)
        {
            s = input.nextLine();
            string = s;
            k=1;
            j=0;
            for (; j<string.length()+1 ; j++)
            {
                k=1;
                j=0;
                for ( ; k<string.length()+1 ; k++)
                {
                    subsets.add(string.substring(j,k));
                }

                string = string.substring(1);
            }

            string = s;
            string = new StringBuilder(string).reverse().toString();
            k=1;
            j=0;
            for (; j<string.length()+1 ; j++)
            {
                k=1;
                j=0;
                for ( ; k<string.length()+1 ; k++)
                {
                    subsets2.add(string.substring(j,k));
                }

                string = string.substring(1);
            }

        }

//        for (int i=0 ; i<subsets.size() ; i++)
//        {
//            System.out.println(subsets.get(i));
//        }


        for (int i=0 ; i<subsets.size() ; i++)
        {
            for (; l<subsets.size() ; l++)
            {
                if ((subsets.get(i).equals(subsets.get(l)))||(subsets.get(i).equals(subsets2.get(l))))
                {
                    counter++;
                }

            }

            if (counter == n)
            {
                q.add(subsets.get(i));
            }
            l=0;
            counter =0;
        }

        for (int i=0 ; i<q.size() ; i++)
        {
            sizes.add(q.get(i).length());
        }

        for (int i=0 ; i<q.size() ; i++)
        {
            if (Collections.max(sizes) == q.get(i).length())
            {
                iFinder = i;
                break;
            }
        }



        System.out.println(q.get(iFinder));



    }
}
