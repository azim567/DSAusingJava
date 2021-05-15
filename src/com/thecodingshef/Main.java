package com.thecodingshef;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int contentId;
        String content;
        String category;
        int likes;
        int dislikes;
        int shares;
        Scanner s=new Scanner(System.in);
        List<Content> cont=new ArrayList<>(7);
        for(int i=1; i<=7; i++){
            contentId=s.nextInt();
            content=s.next();
            category=s.next();
            likes=s.nextInt();
            dislikes=s.nextInt();
            shares=s.nextInt();

            cont.add(new Content(contentId, content, category, likes, dislikes, shares));
          //  cont.set(i, new Content(contentId, content, category, likes, dislikes, shares));
        }
        String rcategory=s.nextLine();
        s.nextLine();
        s.close();
        Content r=getMaxSharedContent(cont);
        String r1=findContentByCategory(cont,rcategory);
        if(r == null)
            System.out.println("No content Shared");
        else
            System.out.println("Maximum shared content:"+r.getContent());

        if(r1 == null)
            System.out.println("Content not available for the category");
        else
            System.out.println("Content Details:"+r1);

    }

    ///////////////////////////////////////
    static Content getMaxSharedContent(List<Content> cont){
        int max=0;
        Content c=null;
        for(int i=0;i<cont.size();i++) {
            if(max<cont.get(i).getShares()) {
                max=cont.get(i).getShares();
                c=cont.get(i);

            }
        }
        return c;
    }

    static String findContentByCategory(List<Content> cont, String category) {
        String con;
        for(int i=0;i<cont.size();i++) {
            if(category.equalsIgnoreCase(cont.get(i).getCategory())&& cont.get(i).getDislikes()==0) {
                con=cont.get(i).getContentId()+"#"+cont.get(i).getContent()+"#"+cont.get(i).getCategory();
                return con;
            }
        }
        return null;

    }
}
