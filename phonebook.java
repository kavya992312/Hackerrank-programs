import java.util.*;

public class phonebook {

        public static void main(String []argh)
        {
            Map<String,Long> phonebook = new java.util.HashMap<>();
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            for(int i = 0; i < n; i++)
            {
                String name = in.next();// to get names i.e keys
                long phone = in.nextLong();// to get numbers i.e values
                phonebook.put(name, phone);

            }
            while(in.hasNext())
            {
                String name = in.next();  // to enter key to fetch a specific value
                if(phonebook.containsKey(name))
                {
                    System.out.println(name  + "=" +phonebook.get(name));

                }else
                {
                    System.out.println("Not found");
                }

            }
    }}

