package Task1;

public class Task1
{
    public static void main(String[] args) {
        String[] array = {"banana", "watermelon", "kiwi", "melon", "potato"};

        System.out.println("Without sorting");
        System.out.println();
        for(int i =0; i< array.length;i++)     //вивід
            System.out.println(array[i]);

        for(int i =0;i< array.length;i++){
            String tmp = array[i];

            int j = i-1;
            while(j>= 0&&tmp.length() < array[j].length())
            {
                array[j+1] =array[j];
                j--;
            }
            array[j+1] = tmp;
        }

        System.out.println();
        System.out.println("With sorting");
        System.out.println();
        for(int i =0; i< array.length;i++)     //вивід
            System.out.println(array[i]);

    }
}
