package day7;

public class SearchingElementsInArray {
    public static void main(String[] args) {
        
         int a[] = {10,20,30,40,50};
         int Search_Element = 30;
         boolean status = false;

         for(int i=0; i<a.length; i++)
         {
            if(a[i] == Search_Element)
            {
                System.out.println("Element Found!");
                status = true;
                break;
            }
         }
         if(status == false)
         {
            System.out.println("Element Not Found!");
         }
    }
}
