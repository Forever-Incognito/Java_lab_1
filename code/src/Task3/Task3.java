package Task3;

public class Task3
{
    public static void main(String[] args) {

        final char[] arraychar = new char[]{'b','t','r', 'd', 'y','x', 'z', 'a', 'm', 'd'};

        final int[] arrayint = new int[] {1, 7, 4,9, 2, 3};

        final int size = Math.max(arrayint.length, arraychar.length);

        String strarray= "";

        for (int i = 0; i < size; i++) {
            if( i < arrayint.length) {

                strarray += "" + arrayint[i];
            }
            if(i < arraychar.length) {

                strarray += "" + arraychar[i];
            }

        }

        System.out.println();
        System.out.println(strarray);

    }


}
