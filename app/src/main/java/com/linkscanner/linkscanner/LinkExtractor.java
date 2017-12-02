package com.linkscanner.linkscanner;

/**
 * Created by octavio on 02/12/17.
 */

public class LinkExtractor {
    public static void main(String[] args) {
        String k= linkExtractor("lol");
    }
   public static String linkExtractor(String random)
    {
       
      String urls=" ";
        String []links={"http://","https://","www."};

        for (int y=0;y<links.length;y++)
        {
            String[] splitted = random.split(links[y]);
            for(int x=1;x<splitted.length;x++) {

                String[] splitted1 = splitted[x].split(" ");
                urls += "\n "+links[y] + splitted1[0];
            }
        }




        System.out.println(urls);


        return urls;
    }
}
